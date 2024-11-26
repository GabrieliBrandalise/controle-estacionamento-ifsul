/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.lpoo_sistemaestacionamentoifsul.dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Pessoa;
import model.VinculoPessoa;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ggbra
 */
public class PessoaRepositorioTest {
    
    public PessoaRepositorioTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of conexaoAberta method, of class PessoaRepositorio.
     */
    @Test
    public void testConexaoAberta() {
        System.out.println("conexaoAberta");
        PessoaRepositorio instance = new PessoaRepositorio();
        Boolean expResult = null;
        Boolean result = instance.conexaoAberta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fecharConexao method, of class PessoaRepositorio.
     */
    @Test
    public void testFecharConexao() {
        System.out.println("fecharConexao");
        PessoaRepositorio instance = new PessoaRepositorio();
        instance.fecharConexao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class PessoaRepositorio.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Class c = null;
        Object id = null;
        PessoaRepositorio instance = new PessoaRepositorio();
        Object expResult = null;
        Object result = instance.find(c, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persist method, of class PessoaRepositorio.
     */
    @Test
    public void testPersist() throws Exception {
        System.out.println("persist");
        Object o = null;
        PessoaRepositorio instance = new PessoaRepositorio();
        instance.persist(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remover method, of class PessoaRepositorio.
     */
    @Test
    public void testRemover() throws Exception {
        System.out.println("remover");
        Object o = null;
        PessoaRepositorio instance = new PessoaRepositorio();
        instance.remover(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntityManager method, of class PessoaRepositorio.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        PessoaRepositorio instance = new PessoaRepositorio();
        EntityManager expResult = null;
        EntityManager result = instance.getEntityManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class PessoaRepositorio.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PessoaRepositorio instance = new PessoaRepositorio();
        List<Pessoa> expResult = null;
        List<Pessoa> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPessoaFiltro method, of class PessoaRepositorio.
     */
    @Test
    public void testGetPessoaFiltro() {
        System.out.println("getPessoaFiltro");
        String nome = "";
        VinculoPessoa vinculo = null;
        PessoaRepositorio instance = new PessoaRepositorio();
        List<Pessoa> expResult = null;
        List<Pessoa> result = instance.getPessoaFiltro(nome, vinculo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
