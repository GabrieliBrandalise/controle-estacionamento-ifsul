/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpoo_sistemaestacionamentoifsul.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Modelo;
import model.Veiculo;

/**
 *
 * @author ggbra
 */
public class PersistenciaJPA implements InterfaceBD {

    EntityManager entity;
    EntityManagerFactory factory;

    public PersistenciaJPA() {
        factory = Persistence.createEntityManagerFactory("pu_lpoo_estacionamento");
        entity = factory.createEntityManager();
    }

    @Override
    public Boolean conexaoAberta() {
        return entity.isOpen();
    }

    @Override
    public void fecharConexao() {
        entity.close();
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        return entity.find(c, id);
    }

    @Override
    public void persist(Object o) throws Exception {
        entity = getEntityManager();
        try {
            entity.getTransaction().begin();
            entity.persist(o);
            entity.getTransaction().commit();
        } catch (Exception e) {
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
        }
    }

    @Override
    public void remover(Object o) throws Exception {
        entity = getEntityManager();
        try {
            entity.getTransaction().begin();
            entity.remove(o);
            entity.getTransaction().commit();
        } catch (Exception e) {
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
        }
    }

    public EntityManager getEntityManager() {
        if (entity == null || !entity.isOpen()) {
            entity = factory.createEntityManager();

        }
        return entity;
    }

    public List<Modelo> getModelos() {
        try {
            EntityManager entity = getEntityManager();
            Query query = entity.createQuery("SELECT m FROM Modelo m ORDER BY m.id ASC", Modelo.class);
            List<Modelo> modelos = query.getResultList();

            if (modelos == null || modelos.isEmpty()) {
                System.out.println("Nenhum modelo encontrado.");
            } else {
                System.out.println("Modelos encontrados: " + modelos.size());
            }

            return modelos;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public List<Veiculo> getAll() {
        entity = getEntityManager();
        try {
            Query query = entity.createQuery("SELECT v FROM Veiculo v ORDER BY v.id ASC", Veiculo.class);
            List<Veiculo> veiculos = query.getResultList();

            if (veiculos.isEmpty()) {
                System.out.println("Nenhum veículo encontrado no banco de dados.");
            } else {
                veiculos.forEach(veiculo -> System.out.println("Veículo carregado: " + veiculo));
            }
            return veiculos;
        } catch (Exception e) {
            System.err.println("Erro ao buscar Veículos: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public List<Veiculo> getVeiculoFiltro(String placa, String veiculoOficial) {
        entity = getEntityManager();
        try {
            Query query;

            if ((placa == null || placa.isEmpty()) && (veiculoOficial == null || veiculoOficial.trim().isEmpty())) {
                query = entity.createQuery("Select v from Veiculo v ORDER BY v.id ASC", Veiculo.class);
            } 
            else if (veiculoOficial == null || veiculoOficial.trim().isEmpty()) {
                query = entity.createQuery("Select v from Veiculo v WHERE v.placa LIKE :placa ORDER BY v.id ASC", Veiculo.class);
                query.setParameter("placa", "%" + placa + "%");
            } 
            else if (placa == null || placa.isEmpty()) {
                boolean isOficial = veiculoOficial.equalsIgnoreCase("Sim");
                query = entity.createQuery("Select v from Veiculo v WHERE v.veiculoOficial = :isOficial ORDER BY v.id ASC", Veiculo.class);
                query.setParameter("isOficial", isOficial);
            }
            else {
                boolean isOficial = veiculoOficial.equalsIgnoreCase("Sim");
                query = entity.createQuery("Select v from Veiculo v WHERE v.veiculoOficial = :isOficial AND v.placa LIKE :placa ORDER BY v.id ASC", Veiculo.class);
                query.setParameter("isOficial", isOficial);
                query.setParameter("placa", "%" + placa + "%");
            }
            
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar veículos: " + e.getMessage());
            return null;
        }
    }

}
