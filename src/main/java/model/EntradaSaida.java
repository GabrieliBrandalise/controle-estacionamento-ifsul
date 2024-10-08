/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author 20231PF.CC0033
 */
public class EntradaSaida {
    private Integer id;
    private Date data;
    private Integer tipoEntradaSaida;
    private final Veiculo veiculo;
    
    public EntradaSaida(int tipoES, Veiculo veiculo){
        this.tipoEntradaSaida = tipoES;
        this.veiculo = veiculo;
        data = new Date();
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getTipoEntradaSaida() {
        return tipoEntradaSaida;
    }

    public void setTipoEntradaSaida(Integer tipoEntradaSaida) {
        this.tipoEntradaSaida = tipoEntradaSaida;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
    
}
