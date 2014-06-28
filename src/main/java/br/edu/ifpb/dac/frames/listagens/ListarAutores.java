package br.edu.ifpb.dac.frames.listagens;

import br.edu.ifpb.dac.entidades.Autor;
import br.edu.ifpb.dac.entidades.Livro;
import br.edu.ifpb.dac.frames.atualizacoes.AtualizarAutor;
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

public class ListarAutores extends javax.swing.JFrame {
    private final DAO dao;
    private DefaultListModel<Autor> listModelAutores; 
    
    public ListarAutores() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);        
        
        dao = new DaoJPA("projeto-dac");
        setModel();
        carregarLista();
    }
    
    private void setModel() {
        listModelAutores = new DefaultListModel<>();
        listAutores.setModel(listModelAutores);
    }
    
    private void carregarLista() {
        List<Autor> listaAutores = dao.buscarTodos(Autor.class);        
        listModelAutores.removeAllElements();
        
        for (Autor autor : listaAutores) {
            listModelAutores.addElement(autor);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelAutoresCadastrados = new javax.swing.JLabel();
        scrollPaneLivros = new javax.swing.JScrollPane();
        listAutores = new javax.swing.JList();
        btRemoverAutor = new javax.swing.JButton();
        btEditarAutor = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelAutoresCadastrados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelAutoresCadastrados.setText("Autores cadastrados:");

        scrollPaneLivros.setViewportView(listAutores);

        btRemoverAutor.setText("Remover");
        btRemoverAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverAutorActionPerformed(evt);
            }
        });

        btEditarAutor.setText("Editar");
        btEditarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarAutorActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelAutoresCadastrados)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(scrollPaneLivros, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditarAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRemoverAutor)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addGap(195, 195, 195))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAutoresCadastrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btRemoverAutor)
                        .addComponent(btEditarAutor))
                    .addComponent(scrollPaneLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRemoverAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverAutorActionPerformed
        if(listAutores.getSelectedIndex() != -1) {
            int index = listAutores.getSelectedIndex();

            Autor autor = listModelAutores.getElementAt(index);
            dao.remover(autor);
            carregarLista();
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverAutorActionPerformed

    private void btEditarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarAutorActionPerformed
        if(listAutores.getSelectedIndex() != -1) {
            int index = listAutores.getSelectedIndex();
            int id = listModelAutores.getElementAt(index).getId();
            Autor autor = (Autor) dao.buscar(Autor.class, id);

            new AtualizarAutor(autor).setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btEditarAutorActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarAutor;
    private javax.swing.JButton btRemoverAutor;
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAutoresCadastrados;
    private javax.swing.JList listAutores;
    private javax.swing.JScrollPane scrollPaneLivros;
    // End of variables declaration//GEN-END:variables
}