package br.edu.ifpb.dac.frames.listagens;

import br.edu.ifpb.dac.entidades.Funcionario;
import br.edu.ifpb.dac.frames.atualizacoes.AtualizarFuncionario;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */

public class ListarFuncionarios extends javax.swing.JFrame {
    private final DAO dao;
    private DefaultListModel<Funcionario> listModelFuncionarios;

    public ListarFuncionarios() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);        
        
        dao = new DaoJPA("projeto-dac");
        setModel();
        carregarLista();
    }
    
    private void setModel() {
        listModelFuncionarios = new DefaultListModel<>();
        listFuncionario.setModel(listModelFuncionarios);
    }
    
    private void carregarLista() {
        List<Funcionario> listaFuncionarios = dao.buscarTodos(Funcionario.class);        
        listModelFuncionarios.removeAllElements();
        
        for (Funcionario funcionario : listaFuncionarios) {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Funcionário");

        labelFuncionariosCadastrados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelFuncionariosCadastrados.setText("Funcionários cadastrados:");

        btRemoverFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User-Delete.png"))); // NOI18N
        btRemoverFuncionario.setText("Remover");
        btRemoverFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverFuncionarioActionPerformed(evt);
            }
        });

        btEditarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User-Edit.png"))); // NOI18N
        btEditarFuncionario.setText("Editar");
        btEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarFuncionarioActionPerformed(evt);
            }
        });

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        scrollPaneFuncionario.setViewportView(listFuncionario);

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
                        .addComponent(btEditarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRemoverFuncionario)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListarFuncionariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btFechar)
                .addGap(195, 195, 195))
        );
        panelListarFuncionariosLayout.setVerticalGroup(
            panelListarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFuncionariosCadastrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelListarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListarFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btRemoverFuncionario)
                        .addComponent(btEditarFuncionario))
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
            int index = listFuncionario.getSelectedIndex();
            Funcionario funcionario  = listModelFuncionarios.getElementAt(index);
            
            if(dao.remover(funcionario)) {
                JOptionPane.showMessageDialog(this, "Funcionário excluído com sucesso!");
                carregarLista();
            }
            else {                
                JOptionPane.showMessageDialog(this, "Erro!");            
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverFuncionarioActionPerformed

    private void btEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarFuncionarioActionPerformed
        if(listFuncionario.getSelectedIndex() != -1) {
            int index = listFuncionario.getSelectedIndex();
            int id = listModelFuncionarios.getElementAt(index).getId();
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarFuncionario;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btRemoverFuncionario;
    private javax.swing.JLabel labelFuncionariosCadastrados;
    private javax.swing.JList listFuncionario;
    private javax.swing.JPanel panelListarFuncionarios;
    private javax.swing.JScrollPane scrollPaneFuncionario;
    // End of variables declaration//GEN-END:variables
}