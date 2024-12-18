/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author 20231PF.CC0033
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="tb_veiculo")
public class Veiculo implements Serializable {
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;
    
    @Column(name="placa")
    private String placa;
    
    @Column(name="cor")
    private String cor;
    
    @Column(name="veiculooficial", nullable = false)
    private Boolean veiculoOficial;
    
    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;
    
    @ManyToOne
    @JoinColumn(name="modelo_id")
    private Modelo modelo;
    
    @OneToMany(mappedBy = "veiculo")
    private List<EntradaSaida> listaMovimentacoes;
    
    @ManyToOne
    @JoinColumn(name="proprietario_id")
    private Pessoa proprietario;
    
    public Veiculo(){
        listaMovimentacoes= new ArrayList<>();
    }

    public Veiculo(String placa, TipoVeiculo tipoVeiculo) {
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
        listaMovimentacoes= new ArrayList<>();
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    
    public void addMovimentacao(EntradaSaida movimento) {
        listaMovimentacoes.add(movimento);
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public boolean isVeiculoOficial() {
        return veiculoOficial;
    }

    public void setVeiculoOficial(boolean veiculoOficial) {
        this.veiculoOficial = veiculoOficial;
    }
}
