package br.edu.ifpb.dac.frames.listagens;

import br.edu.ifpb.dac.entidades.Livro;
import br.edu.ifpb.dac.frames.atualizacoes.AtualizarLivro;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */

public class ListarLivros extends javax.swing.JFrame {
    private final DAO dao;
    private DefaultListModel<Livro> listModelLivros;    
    
    public ListarLivros() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        dao = new DaoJPA("projeto-dac");
        setModel();
        carregarLista();
    }
    
    private void setModel() {
        listModelLivros = new DefaultListModel<>();
        listLivros.setModel(listModelLivros);
    }
    
    private void carregarLista() {                        
        List<Livro> listaLivros = dao.buscarTodos(Livro.class);        
        listModelLivros.removeAllElements();
        
        for (Livro livro : listaLivros) {
            listModelLivros.addElement(livro);
        }        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelListarLivro = new javax.swing.JPanel();
        labelLivrosCadastrados = new javax.swing.JLabel();
        scrollPaneLivros = new javax.swing.JScrollPane();
        listLivros = new javax.swing.JList();
        btRemoverLivro = new javax.swing.JButton();
        btEditarLivro = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Livros Cadastrados no Sistema");

        labelLivrosCadastrados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelLivrosCadastrados.setText("Livros cadastrados:");

        scrollPaneLivros.setViewportView(listLivros);

        btRemoverLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Book-Delete.png"))); // NOI18N
        btRemoverLivro.setText("Remover");
        btRemoverLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverLivroActionPerformed(evt);
            }
        });

        btEditarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Book-Edit.png"))); // NOI18N
        btEditarLivro.setText("Editar");
        btEditarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarLivroActionPerformed(evt);
            }
        });

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListarLivroLayout = new javax.swing.GroupLayout(panelListarLivro);
        panelListarLivro.setLayout(panelListarLivroLayout);
        panelListarLivroLayout.setHorizontalGroup(
            panelListarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListarLivroLayout.createSequentialGroup()
                        .addComponent(labelLivrosCadastrados)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelListarLivroLayout.createSequentialGroup()
                        .addComponent(scrollPaneLivros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditarLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRemoverLivro)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListarLivroLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(btFechar)
                .addGap(250, 250, 250))
        );
        panelListarLivroLayout.setVerticalGroup(
            panelListarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLivrosCadastrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelListarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListarLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btRemoverLivro)
                        .addComponent(btEditarLivro))
                    .addComponent(scrollPaneLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRemoverLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverLivroActionPerformed
        if(listLivros.getSelectedIndex() != -1) {
            int index = listLivros.getSelectedIndex();            
            Livro livro = listModelLivros.getElementAt(index);
            
            if(dao.remover(livro)){
                JOptionPane.showMessageDialog(this, "Livro excluído com sucesso!");                        
                carregarLista();
            }
            else {
                JOptionPane.showMessageDialog(this, "Erro!");
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverLivroActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btEditarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarLivroActionPerformed
        if(listLivros.getSelectedIndex() != -1) {
            int index = listLivros.getSelectedIndex();            
            Long id = listModelLivros.getElementAt(index).getId();            
            Livro livro = (Livro) dao.buscar(Livro.class, id);
            
            new AtualizarLivro(livro).setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btEditarLivroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarLivro;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btRemoverLivro;
    private javax.swing.JLabel labelLivrosCadastrados;
    private javax.swing.JList listLivros;
    private javax.swing.JPanel panelListarLivro;
    private javax.swing.JScrollPane scrollPaneLivros;
    // End of variables declaration//GEN-END:variables
}