/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lpoo_sistemaestacionamentoifsul.Frame;


import com.mycompany.lpoo_sistemaestacionamentoifsul.Frame.TelaCadastroPessoa;
import com.mycompany.lpoo_sistemaestacionamentoifsul.dao.PessoaRepositorio;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Pessoa;
import model.VinculoPessoa;


/**
 *
 * @author ggbra
 */
public class TelaPessoa extends javax.swing.JFrame {
     PessoaRepositorio jpa;
    
    /**
     * Creates new form TelaPessoa
     */
    public TelaPessoa() {
        initComponents();
        jpa = new PessoaRepositorio();
        this.carregarPessoasCadastradas();
        this.popularComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        pnlVinculoPessoa = new javax.swing.JPanel();
        lblBuscaNome = new javax.swing.JLabel();
        cmbVinculoPessoa = new javax.swing.JComboBox<>();
        lblBuscaVinculo = new javax.swing.JLabel();
        txtBuscaNome = new javax.swing.JTextField();
        areaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPessoas = new javax.swing.JList<>();
        areaBotoes = new javax.swing.JPanel();
        btnNovaPessoa = new javax.swing.JButton();
        btnEditarPessoa = new javax.swing.JButton();
        btnRemoverPessoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setText("Pessoas Cadastradas");

        lblBuscaNome.setText("Nome:");

        cmbVinculoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVinculoPessoaActionPerformed(evt);
            }
        });

        lblBuscaVinculo.setText("Vinculo:");

        txtBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaNomeActionPerformed(evt);
            }
        });
        txtBuscaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaNomeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlVinculoPessoaLayout = new javax.swing.GroupLayout(pnlVinculoPessoa);
        pnlVinculoPessoa.setLayout(pnlVinculoPessoaLayout);
        pnlVinculoPessoaLayout.setHorizontalGroup(
            pnlVinculoPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVinculoPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBuscaNome)
                .addGap(18, 18, 18)
                .addComponent(txtBuscaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblBuscaVinculo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbVinculoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlVinculoPessoaLayout.setVerticalGroup(
            pnlVinculoPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVinculoPessoaLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(pnlVinculoPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaNome)
                    .addComponent(cmbVinculoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscaVinculo))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(lstPessoas);

        javax.swing.GroupLayout areaListagemLayout = new javax.swing.GroupLayout(areaListagem);
        areaListagem.setLayout(areaListagemLayout);
        areaListagemLayout.setHorizontalGroup(
            areaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        areaListagemLayout.setVerticalGroup(
            areaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaListagemLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnNovaPessoa.setText("Novo");
        btnNovaPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaPessoaActionPerformed(evt);
            }
        });

        btnEditarPessoa.setText("Editar");
        btnEditarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPessoaActionPerformed(evt);
            }
        });

        btnRemoverPessoa.setText("Remover");
        btnRemoverPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverPessoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout areaBotoesLayout = new javax.swing.GroupLayout(areaBotoes);
        areaBotoes.setLayout(areaBotoesLayout);
        areaBotoesLayout.setHorizontalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaBotoesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnNovaPessoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnEditarPessoa)
                .addGap(68, 68, 68)
                .addComponent(btnRemoverPessoa)
                .addGap(66, 66, 66))
        );
        areaBotoesLayout.setVerticalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaBotoesLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaPessoa)
                    .addComponent(btnEditarPessoa)
                    .addComponent(btnRemoverPessoa))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(areaListagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlVinculoPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(areaBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(pnlVinculoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPessoaActionPerformed
         Pessoa pessoaSelecionada = lstPessoas.getSelectedValue();
        
        if (pessoaSelecionada != null){
           TelaCadastroPessoa telaEdicao = new TelaCadastroPessoa(this, rootPaneCheckingEnabled);

            telaEdicao.setP(pessoaSelecionada);
            telaEdicao.setVisible(true);
            
            this.carregarPessoasCadastradas();
        } else {
            
            JOptionPane.showMessageDialog(this, "Selecione uma pessoa para editar");
        }
    }//GEN-LAST:event_btnEditarPessoaActionPerformed

    private void btnRemoverPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPessoaActionPerformed
        Pessoa pessoaSelecionada = lstPessoas.getSelectedValue();
        
        if (pessoaSelecionada != null){
            System.out.println("Pessoa: " + pessoaSelecionada.getId());   
            
            try {
                jpa.conexaoAberta();
                
                int delOp = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o cadastro " + pessoaSelecionada.getNome() + " ?");
                if (delOp == JOptionPane.YES_OPTION){
                    jpa.remover(pessoaSelecionada);
                }
                
                jpa.fecharConexao();
                this.carregarPessoasCadastradas();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao remover pessoa " + pessoaSelecionada + "\n" + e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma pessoa para remover");
        }
    }//GEN-LAST:event_btnRemoverPessoaActionPerformed

    private void btnNovaPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaPessoaActionPerformed
        TelaCadastroPessoa tlCadastro = new TelaCadastroPessoa(this, rootPaneCheckingEnabled);
        tlCadastro.setVisible(true);
        
       
        this.carregarPessoasCadastradas();
    }//GEN-LAST:event_btnNovaPessoaActionPerformed

    private void txtBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaNomeActionPerformed
       this.carregarPessoasFiltro();
    }//GEN-LAST:event_txtBuscaNomeActionPerformed

    private void cmbVinculoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVinculoPessoaActionPerformed
         this.carregarPessoasFiltro();
    }//GEN-LAST:event_cmbVinculoPessoaActionPerformed

    private void txtBuscaNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyTyped
         this.carregarPessoasFiltro();
    }//GEN-LAST:event_txtBuscaNomeKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPessoa().setVisible(true);
            }
        });
    }
    
    private void carregarPessoasCadastradas(){
        jpa.conexaoAberta();
        
        DefaultListModel modeloLista = new DefaultListModel();
        modeloLista.addAll(jpa.getAll());
        lstPessoas.setModel(modeloLista);
        jpa.fecharConexao();
    }
    
    private void carregarPessoasFiltro(){
        jpa.conexaoAberta();
        
        if ((VinculoPessoa) cmbVinculoPessoa.getModel().getSelectedItem() == null && (txtBuscaNome.getText() == null || txtBuscaNome.getText().isEmpty())){
            this.carregarPessoasCadastradas();
        } else {
            DefaultListModel modeloLista = new DefaultListModel();


            modeloLista.addAll(jpa.getPessoaFiltro(txtBuscaNome.getText(), (VinculoPessoa) cmbVinculoPessoa.getModel().getSelectedItem()));
            lstPessoas.setModel(modeloLista);
        }
        jpa.fecharConexao();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaBotoes;
    private javax.swing.JPanel areaListagem;
    private javax.swing.JButton btnEditarPessoa;
    private javax.swing.JButton btnNovaPessoa;
    private javax.swing.JButton btnRemoverPessoa;
    private javax.swing.JComboBox<VinculoPessoa> cmbVinculoPessoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscaNome;
    private javax.swing.JLabel lblBuscaVinculo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<Pessoa> lstPessoas;
    private javax.swing.JPanel pnlVinculoPessoa;
    private javax.swing.JTextField txtBuscaNome;
    // End of variables declaration//GEN-END:variables

   private void popularComboBox() {
    DefaultComboBoxModel<VinculoPessoa> model = new DefaultComboBoxModel<>();
    model.addElement(null); 
    
    for (VinculoPessoa vinculo : VinculoPessoa.values()) {
        model.addElement(vinculo);
    }
    cmbVinculoPessoa.setModel(model);
    
    cmbVinculoPessoa.setSelectedItem(null);
}

}
