/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 20231PF.CC0033
 */
public class EntradaSaidaOficial extends EntradaSaida{
    private Double kmRegistrado;
    private Pessoa motorista;

    public EntradaSaidaOficial(int tipoES, Veiculo veiculo, Pessoa motorista) {
        super(tipoES, veiculo);
        this.motorista = motorista;
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
}
