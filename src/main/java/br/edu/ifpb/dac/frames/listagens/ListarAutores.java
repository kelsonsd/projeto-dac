package br.edu.ifpb.dac.frames.listagens;

import br.edu.ifpb.dac.entidades.Autor;
import br.edu.ifpb.dac.frames.atualizacoes.AtualizarAutor;
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

        panelListarAutores = new javax.swing.JPanel();
        labelAutoresCadastrados = new javax.swing.JLabel();
        scrollPaneAutor = new javax.swing.JScrollPane();
        listAutores = new javax.swing.JList();
        btRemoverAutor = new javax.swing.JButton();
        btEditarAutor = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Autores Cadastrados no Sistema");

        labelAutoresCadastrados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelAutoresCadastrados.setText("Autores cadastrados:");

        scrollPaneAutor.setViewportView(listAutores);

        btRemoverAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User-Delete.png"))); // NOI18N
        btRemoverAutor.setText("Remover");
        btRemoverAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverAutorActionPerformed(evt);
            }
        });

        btEditarAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User-Edit.png"))); // NOI18N
        btEditarAutor.setText("Editar");
        btEditarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarAutorActionPerformed(evt);
            }
        });

        btFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListarAutoresLayout = new javax.swing.GroupLayout(panelListarAutores);
        panelListarAutores.setLayout(panelListarAutoresLayout);
        panelListarAutoresLayout.setHorizontalGroup(
            panelListarAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarAutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListarAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListarAutoresLayout.createSequentialGroup()
                        .addComponent(labelAutoresCadastrados)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelListarAutoresLayout.createSequentialGroup()
                        .addComponent(scrollPaneAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditarAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRemoverAutor)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListarAutoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btFechar)
                .addGap(204, 204, 204))
        );
        panelListarAutoresLayout.setVerticalGroup(
            panelListarAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarAutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAutoresCadastrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelListarAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListarAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btRemoverAutor)
                        .addComponent(btEditarAutor))
                    .addComponent(scrollPaneAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btFechar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListarAutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListarAutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRemoverAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverAutorActionPerformed
        if(listAutores.getSelectedIndex() != -1) {
            int index = listAutores.getSelectedIndex();
            Autor autor = listModelAutores.getElementAt(index);
            
            if(dao.remover(autor)) {
                JOptionPane.showMessageDialog(this, "Autor excluído com sucesso!");
                carregarLista();
            }
            else {
                JOptionPane.showMessageDialog(this, "Erro!");
            }
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

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarAutor;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btRemoverAutor;
    private javax.swing.JLabel labelAutoresCadastrados;
    private javax.swing.JList listAutores;
    private javax.swing.JPanel panelListarAutores;
    private javax.swing.JScrollPane scrollPaneAutor;
    // End of variables declaration//GEN-END:variables
}