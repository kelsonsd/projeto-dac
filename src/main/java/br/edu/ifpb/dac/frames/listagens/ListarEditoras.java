package br.edu.ifpb.dac.frames.listagens;

import br.edu.ifpb.dac.entidades.Editora;
import br.edu.ifpb.dac.frames.atualizacoes.AtualizarEditora;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */

public class ListarEditoras extends javax.swing.JFrame {
    private final DAO dao;
    private DefaultListModel<Editora> listModelEditoras;

    public ListarEditoras() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);        
        
        dao = new DaoJPA("projeto-dac");
        setModel();
        carregarLista();
    }
    
    private void setModel() {
        listModelEditoras = new DefaultListModel<>();
        listEditoras.setModel(listModelEditoras);
    }
    
    private void carregarLista() {
        List<Editora> listaEditora = dao.buscarTodos(Editora.class);
        listModelEditoras.removeAllElements();
        
        for (Editora editora : listaEditora) {
            listModelEditoras.addElement(editora);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelListarEditoras = new javax.swing.JPanel();
        labelAutoresCadastrados = new javax.swing.JLabel();
        scrollPaneEditora = new javax.swing.JScrollPane();
        listEditoras = new javax.swing.JList();
        btRemoverEditora = new javax.swing.JButton();
        btEditarEditora = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editoras Cadastradas no Sistema");

        panelListarEditoras.setBackground(new java.awt.Color(204, 204, 204));

        labelAutoresCadastrados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelAutoresCadastrados.setText("Editoras cadastradas:");

        scrollPaneEditora.setViewportView(listEditoras);

        btRemoverEditora.setBackground(new java.awt.Color(231, 228, 231));
        btRemoverEditora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Report-Delete.png"))); // NOI18N
        btRemoverEditora.setText("Remover");
        btRemoverEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverEditoraActionPerformed(evt);
            }
        });

        btEditarEditora.setBackground(new java.awt.Color(231, 228, 231));
        btEditarEditora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Report-Edit.png"))); // NOI18N
        btEditarEditora.setText("Editar");
        btEditarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarEditoraActionPerformed(evt);
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

        javax.swing.GroupLayout panelListarEditorasLayout = new javax.swing.GroupLayout(panelListarEditoras);
        panelListarEditoras.setLayout(panelListarEditorasLayout);
        panelListarEditorasLayout.setHorizontalGroup(
            panelListarEditorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarEditorasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListarEditorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListarEditorasLayout.createSequentialGroup()
                        .addComponent(labelAutoresCadastrados)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelListarEditorasLayout.createSequentialGroup()
                        .addComponent(scrollPaneEditora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditarEditora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRemoverEditora)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListarEditorasLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(btFechar)
                .addGap(250, 250, 250))
        );
        panelListarEditorasLayout.setVerticalGroup(
            panelListarEditorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarEditorasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAutoresCadastrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelListarEditorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListarEditorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btRemoverEditora)
                        .addComponent(btEditarEditora))
                    .addComponent(scrollPaneEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btFechar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListarEditoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListarEditoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRemoverEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverEditoraActionPerformed
        if(listEditoras.getSelectedIndex() != -1) {
            int index = listEditoras.getSelectedIndex();
            Editora editora = listModelEditoras.getElementAt(index);
            
            if(dao.remover(editora)) {
                JOptionPane.showMessageDialog(this, "Editora excluída com sucesso!");
                carregarLista();
            }
            else {
                JOptionPane.showMessageDialog(this, "Erro!");
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverEditoraActionPerformed

    private void btEditarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarEditoraActionPerformed
        if(listEditoras.getSelectedIndex() != -1) {
            int index = listEditoras.getSelectedIndex();
            Long id = listModelEditoras.getElementAt(index).getId();
            Editora editora = (Editora) dao.buscar(Editora.class, id);

            new AtualizarEditora(editora).setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btEditarEditoraActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarEditora;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btRemoverEditora;
    private javax.swing.JLabel labelAutoresCadastrados;
    private javax.swing.JList listEditoras;
    private javax.swing.JPanel panelListarEditoras;
    private javax.swing.JScrollPane scrollPaneEditora;
    // End of variables declaration//GEN-END:variables
}