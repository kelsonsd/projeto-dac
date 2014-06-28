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

        panelListarLivros = new javax.swing.JPanel();
        labelLivrosCadastrados = new javax.swing.JLabel();
        scrollPaneLivros = new javax.swing.JScrollPane();
        listLivros = new javax.swing.JList();
        btRemoverLivro = new javax.swing.JButton();
        btEditarLivro = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Livros Cadastrados no Sistema");

        labelLivrosCadastrados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelLivrosCadastrados.setText("Livros cadastrados:");

        scrollPaneLivros.setViewportView(listLivros);

        btRemoverLivro.setText("Remover");
        btRemoverLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverLivroActionPerformed(evt);
            }
        });

        btEditarLivro.setText("Editar");
        btEditarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarLivroActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListarLivrosLayout = new javax.swing.GroupLayout(panelListarLivros);
        panelListarLivros.setLayout(panelListarLivrosLayout);
        panelListarLivrosLayout.setHorizontalGroup(
            panelListarLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarLivrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListarLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListarLivrosLayout.createSequentialGroup()
                        .addComponent(labelLivrosCadastrados)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelListarLivrosLayout.createSequentialGroup()
                        .addComponent(scrollPaneLivros, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditarLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRemoverLivro)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListarLivrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addGap(195, 195, 195))
        );
        panelListarLivrosLayout.setVerticalGroup(
            panelListarLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarLivrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLivrosCadastrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelListarLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListarLivrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btRemoverLivro)
                        .addComponent(btEditarLivro))
                    .addComponent(scrollPaneLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListarLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListarLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverLivroActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btEditarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarLivroActionPerformed
        if(listLivros.getSelectedIndex() != -1) {
            int index = listLivros.getSelectedIndex();            
            int id = listModelLivros.getElementAt(index).getId();            
            Livro livro = (Livro) dao.buscar(Livro.class, id);
            
            new AtualizarLivro(livro).setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btEditarLivroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarLivro;
    private javax.swing.JButton btRemoverLivro;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel labelLivrosCadastrados;
    private javax.swing.JList listLivros;
    private javax.swing.JPanel panelListarLivros;
    private javax.swing.JScrollPane scrollPaneLivros;
    // End of variables declaration//GEN-END:variables
}