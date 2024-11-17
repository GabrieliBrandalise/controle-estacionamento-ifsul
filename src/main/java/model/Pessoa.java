/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author 20231PF.CC0033
 */

@Entity
@Table(name="tb_pessoa")
public class Pessoa implements Serializable {
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer id;
    
    @Column(name="nome")
    private String nome;
    
    @Enumerated(EnumType.STRING)
    private VinculoPessoa tipoPessoa;
    
    @Column(name="telefone")
    private String telefone;
    
    @Column(name="email")
    private String email;
    
    @OneToMany(mappedBy = "proprietario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Veiculo> listaVeiculos;
    
    
    public Pessoa(){
        listaVeiculos =new ArrayList<>();
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public VinculoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(VinculoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void addVeiculo(Veiculo veiculo){
        listaVeiculos.add(veiculo);
    }

    @Override
    public String toString() {
        return  "id=" + id + ", nome=" + nome + ", vinculo=" + tipoPessoa;
    }
    
    
}
