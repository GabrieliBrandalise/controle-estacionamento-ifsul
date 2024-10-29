/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author 20231PF.CC0033
 */

@Entity(name="tb_entradasaidaoficial")
public class EntradaSaidaOficial extends EntradaSaida implements Serializable{
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;
     
    @Column(name="kmRegistrado")
    private Double kmRegistrado;
    
    @ManyToOne
    @JoinColumn(name="motorista_id")
    private Pessoa motorista;
   

    public EntradaSaidaOficial(TipoEntradaSaida tipoES, Veiculo veiculo, Pessoa motorista) {
        super(tipoES, veiculo);
        this.motorista = motorista;
    }

    public EntradaSaidaOficial() {
        
    }

    public Double getKmRegistrado() {
        return kmRegistrado;
    }

    public void setKmRegistrado(Double kmRegistrado) {
        this.kmRegistrado = kmRegistrado;
    }

    public Pessoa getMotorista() {
        return motorista;
    }

    public void setMotorista(Pessoa motorista) {
        this.motorista = motorista;
    }

    @Override
    public Integer getId() {
        return id;
    }
}
