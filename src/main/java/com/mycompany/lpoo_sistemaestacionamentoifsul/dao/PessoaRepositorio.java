/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpoo_sistemaestacionamentoifsul.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Pessoa;
import model.VinculoPessoa;

/**
 *
 * @author ggbra
 */
public class PessoaRepositorio implements InterfaceBD {

    EntityManager entity;
    EntityManagerFactory factory;

    public PessoaRepositorio() {
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

    public List<Pessoa> getAll() {
        entity = getEntityManager();
        try {
            Query query = entity.createQuery("Select p from Pessoa p ORDER BY p.id ASC", Pessoa.class);
            return query.getResultList();
        } catch (Exception e) {
            System.err.println("Erro ao buscar Pessoas: " + e);
            return null;
        }
    }
    
    public List<Pessoa> getPessoaFiltro(String nome, VinculoPessoa vinculo){
        entity = getEntityManager();
        try {
            Query query;
            if (vinculo == null && (nome != null && !nome.isEmpty())){
                
                query = entity.createQuery("Select p from Pessoa p WHERE p.nome LIKE :nome ORDER BY p.id ASC", Pessoa.class); 
                
                query.setParameter("nome", "%" + nome + "%");
                
            } else if (vinculo != null && (nome == null || nome.isEmpty())){
                
                query = entity.createQuery("Select p from Pessoa p WHERE p.tipoPessoa LIKE :vinculo ORDER BY p.id ASC", Pessoa.class);
               
                query.setParameter("vinculo", vinculo);
                
            } else {
               
                query = entity.createQuery("Select p from Pessoa p WHERE p.tipoPessoa LIKE :vinculo AND p.nome LIKE :nome ORDER BY p.id ASC", Pessoa.class);
               
                query.setParameter("nome", "%" + nome + "%");
               
                query.setParameter("vinculo", vinculo);
            }
            
            return query.getResultList();
            
        } catch (Exception e) {
            System.err.println("Erro ao buscar Pessoas: " + e);
            return null;
        }
    }
  
}
