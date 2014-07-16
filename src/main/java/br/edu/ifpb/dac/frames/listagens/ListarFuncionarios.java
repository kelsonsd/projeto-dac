package br.edu.ifpb.dac.frames.listagens;

import br.edu.ifpb.dac.controle.FuncionarioControle;
import br.edu.ifpb.dac.entidades.Funcionario;
import br.edu.ifpb.dac.frames.atualizacoes.AtualizarFuncionario;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */

public class ListarFuncionarios extends javax.swing.JFrame {    
    private DefaultListModel<Funcionario> listModelFuncionarios;

    public ListarFuncionarios() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);        
                
        setModel();
        carregarLista();
    }
    
    private void setModel() {
        listModelFuncionarios = new DefaultListModel<>();
        listFuncionario.setModel(listModelFuncionarios);
    }
    
    private void carregarLista() {
        FuncionarioControle fc = new FuncionarioControle();
        listModelFuncionarios.removeAllElements();
        
        for (Funcionario funcionario : fc.buscarTodos()) {
            listModelFuncionarios.addElement(funcionario);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelListarFuncionarios = new javax.swing.JPanel();
        labelFuncionariosCadastrados = new javax.swing.JLabel();
        btRemoverFuncionario = new javax.swing.JButton();
        btEditarFuncionario = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        scrollPaneFuncionario = new javax.swing.JScrollPane();
        listFuncionario = new javax.swing.JList();
        btAtualizarListaFuncionarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Funcionário");

        panelListarFuncionarios.setBackground(new java.awt.Color(204, 204, 204));

        labelFuncionariosCadastrados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelFuncionariosCadastrados.setText("Funcionários cadastrados:");

        btRemoverFuncionario.setBackground(new java.awt.Color(231, 228, 231));
        btRemoverFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User-Delete.png"))); // NOI18N
        btRemoverFuncionario.setText("Remover");
        btRemoverFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverFuncionarioActionPerformed(evt);
            }
        });

        btEditarFuncionario.setBackground(new java.awt.Color(231, 228, 231));
        btEditarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User-Edit.png"))); // NOI18N
        btEditarFuncionario.setText("Editar");
        btEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarFuncionarioActionPerformed(evt);
            }
        });

        btFechar.setBackground(new java.awt.Color(231, 228, 231));
        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        scrollPaneFuncionario.setViewportView(listFuncionario);

        btAtualizarListaFuncionarios.setBackground(new java.awt.Color(231, 228, 231));
        btAtualizarListaFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Update.png"))); // NOI18N
        btAtualizarListaFuncionarios.setText("Atualizar");
        btAtualizarListaFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarListaFuncionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListarFuncionariosLayout = new javax.swing.GroupLayout(panelListarFuncionarios);
        panelListarFuncionarios.setLayout(panelListarFuncionariosLayout);
        panelListarFuncionariosLayout.setHorizontalGroup(
            panelListarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListarFuncionariosLayout.createSequentialGroup()
                        .addComponent(labelFuncionariosCadastrados)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelListarFuncionariosLayout.createSequentialGroup()
                        .addComponent(scrollPaneFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelListarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelListarFuncionariosLayout.createSequentialGroup()
                                .addComponent(btEditarFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btRemoverFuncionario))
                            .addComponent(btAtualizarListaFuncionarios, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListarFuncionariosLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(btFechar)
                .addGap(250, 250, 250))
        );
        panelListarFuncionariosLayout.setVerticalGroup(
            panelListarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFuncionariosCadastrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelListarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelListarFuncionariosLayout.createSequentialGroup()
                        .addGroup(panelListarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btRemoverFuncionario)
                            .addComponent(btEditarFuncionario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAtualizarListaFuncionarios))
                    .addComponent(scrollPaneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListarFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListarFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRemoverFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverFuncionarioActionPerformed
        if(listFuncionario.getSelectedIndex() != -1) {
            Funcionario funcionario = (Funcionario) listFuncionario.getSelectedValue();
            FuncionarioControle fc = new FuncionarioControle();            
            
            if(fc.remover(funcionario)) {
                carregarLista();
                JOptionPane.showMessageDialog(this, "Funcionário excluído com sucesso!");                
            }            
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverFuncionarioActionPerformed

    private void btEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarFuncionarioActionPerformed
        if(listFuncionario.getSelectedIndex() != -1) {
            int index = listFuncionario.getSelectedIndex();
            Long id = listModelFuncionarios.getElementAt(index).getId();
            DAO dao = new DaoJPA("projeto-dac");
            
            Funcionario funcionario = (Funcionario) dao.buscar(Funcionario.class, id);
            new AtualizarFuncionario(funcionario).setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btEditarFuncionarioActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btAtualizarListaFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarListaFuncionariosActionPerformed
        carregarLista();
    }//GEN-LAST:event_btAtualizarListaFuncionariosActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizarListaFuncionarios;
    private javax.swing.JButton btEditarFuncionario;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btRemoverFuncionario;
    private javax.swing.JLabel labelFuncionariosCadastrados;
    private javax.swing.JList listFuncionario;
    private javax.swing.JPanel panelListarFuncionarios;
    private javax.swing.JScrollPane scrollPaneFuncionario;
    // End of variables declaration//GEN-END:variables
}