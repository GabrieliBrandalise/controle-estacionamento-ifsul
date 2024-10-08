/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package model;

/**
 *
 * @author 20231PF.CC0033
 */
public enum Marca {
    CHEVROLET(1, "Chevrolet"), HYUNDAI(2, "Hyundai"), FIAT(3, "Fiat"), HONDA(4, "Honda"), JEEP(5,"Jeep");
    
    private Integer id;
    private String descricao;
    
    Marca(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    

}
