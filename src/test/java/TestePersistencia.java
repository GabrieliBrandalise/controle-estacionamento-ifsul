/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.mycompany.lpoo_sistemaestacionamentoifsul.dao.PersistenciaJPA;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.EntradaSaida;
import model.EntradaSaidaOficial;
import model.Marca;
import model.Modelo;
import model.Pessoa;
import model.TipoEntradaSaida;
import model.Veiculo;
import model.VeiculoOficial;
import model.VinculoPessoa;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ggbra
 */

public class TestePersistencia {
    PersistenciaJPA jpa = new PersistenciaJPA();
    public TestePersistencia() {
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testePersistencia() {
         Modelo m = new Modelo();
         m.setDescricao("SANDERO");
         
         Pessoa p = new Pessoa();
         p.setNome("Anderson");
         p.setEmail("andersontt@gmail.com");
         p.setTelefone("54997855086");
         p.setTipoPessoa(VinculoPessoa.ALUNO);
         
         
         EntradaSaida es = new EntradaSaida();
         es.setData(new Date());
         es.setTipoEntradaSaida(TipoEntradaSaida.ENTRADA);
         
         Veiculo v = new Veiculo();
         v.setCor("branco");
         v.setModelo(m);
         v.setProprietario(p);
         p.addVeiculo(v);
         
         EntradaSaidaOficial eso = new EntradaSaidaOficial();
         eso.setKmRegistrado(55.0);
         eso.setData(new Date());
         eso.setTipoEntradaSaida(TipoEntradaSaida.ENTRADA);
         
         
         VeiculoOficial vo = new VeiculoOficial();
         vo.setCor("branco");
         vo.setChassi("jbadjhbajhdbas");
   
         
         
        try {
            jpa.getEntityManager().getTransaction().begin();
            jpa.persist(eso);
            jpa.persist(v);
            jpa.persist(p);
            jpa.persist(vo);
            jpa.remover(p);
            jpa.getEntityManager().getTransaction().commit();
        } catch (Exception ex) {
            System.err.println("Erro ao persistir dados.");
        }
     }
}
