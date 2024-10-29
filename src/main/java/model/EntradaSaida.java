/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;

/**
 *
 * @author 20231PF.CC0033
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="tb_entradasaida")
public class EntradaSaida implements Serializable {
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;
    
    @Column(name="data")
    private Date data;
    
    @Enumerated(EnumType.STRING)
    private TipoEntradaSaida tipoEntradaSaida;
    
    @ManyToOne
    @JoinColumn(name="veiculo_id")
    private Veiculo veiculo;

    public EntradaSaida() {
    }
    
    public EntradaSaida(TipoEntradaSaida tipoES, Veiculo veiculo){
        this.tipoEntradaSaida = tipoES;
        this.veiculo = veiculo;
        data = new Date();
    }
    public Integer getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipoEntradaSaida getTipoEntradaSaida() {
        return tipoEntradaSaida;
    }

    public void setTipoEntradaSaida(TipoEntradaSaida tipoEntradaSaida) {
        this.tipoEntradaSaida = tipoEntradaSaida;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
    
}
