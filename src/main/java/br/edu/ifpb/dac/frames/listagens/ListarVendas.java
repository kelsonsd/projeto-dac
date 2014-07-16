package br.edu.ifpb.dac.frames.listagens;

import br.edu.ifpb.dac.entidades.Venda;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */

public class ListarVendas extends javax.swing.JFrame {    
    private DefaultListModel<Venda> listModelVendas;

    public ListarVendas() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);        
                
        setModel();
        carregarLista();
    }
    
    private void setModel() {
        listModelVendas = new DefaultListModel<>();
        listVendas.setModel(listModelVendas);
    }
    
    private void carregarLista() {
        DAO dao = new DaoJPA("projeto-dac");
        List<Venda> listaVenda = dao.buscarTodos(Venda.class);
        listModelVendas.removeAllElements();
        
        for (Venda venda : listaVenda) {
            listModelVendas.addElement(venda);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelListarVendas = new javax.swing.JPanel();
        labelVendasEfetuadas = new javax.swing.JLabel();
        scrollPaneVendas = new javax.swing.JScrollPane();
        listVendas = new javax.swing.JList();
        btRemoverVenda = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        btAtualizarListaVendas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas Efetuadas");

        panelListarVendas.setBackground(new java.awt.Color(204, 204, 204));

        labelVendasEfetuadas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelVendasEfetuadas.setText("Vendas Efetuadas:");

        scrollPaneVendas.setViewportView(listVendas);

        btRemoverVenda.setBackground(new java.awt.Color(231, 228, 231));
        btRemoverVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cart-Delete.png"))); // NOI18N
        btRemoverVenda.setText("Remover");
        btRemoverVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverVendaActionPerformed(evt);
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

        btAtualizarListaVendas.setBackground(new java.awt.Color(231, 228, 231));
        btAtualizarListaVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Update.png"))); // NOI18N
        btAtualizarListaVendas.setText("Atualizar");
        btAtualizarListaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarListaVendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListarVendasLayout = new javax.swing.GroupLayout(panelListarVendas);
        panelListarVendas.setLayout(panelListarVendasLayout);
        panelListarVendasLayout.setHorizontalGroup(
            panelListarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListarVendasLayout.createSequentialGroup()
                        .addComponent(labelVendasEfetuadas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelListarVendasLayout.createSequentialGroup()
                        .addComponent(scrollPaneVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelListarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btRemoverVenda)
                            .addComponent(btAtualizarListaVendas, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListarVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btFechar)
                .addGap(224, 224, 224))
        );
        panelListarVendasLayout.setVerticalGroup(
            panelListarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelVendasEfetuadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelListarVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelListarVendasLayout.createSequentialGroup()
                        .addComponent(btRemoverVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAtualizarListaVendas))
                    .addComponent(scrollPaneVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelListarVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRemoverVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverVendaActionPerformed
        if(listVendas.getSelectedIndex() != -1) {
            int index = listVendas.getSelectedIndex();
            Venda venda = listModelVendas.getElementAt(index);
            DAO dao = new DaoJPA("projeto-dac");

            if(dao.remover(venda)){
                JOptionPane.showMessageDialog(this, "Venda excluída com sucesso!");
                carregarLista();
            }
            else {
                JOptionPane.showMessageDialog(this, "Erro!");
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverVendaActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharActionPerformed

    private void btAtualizarListaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarListaVendasActionPerformed
        carregarLista();
    }//GEN-LAST:event_btAtualizarListaVendasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizarListaVendas;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btRemoverVenda;
    private javax.swing.JLabel labelVendasEfetuadas;
    private javax.swing.JList listVendas;
    private javax.swing.JPanel panelListarVendas;
    private javax.swing.JScrollPane scrollPaneVendas;
    // End of variables declaration//GEN-END:variables
}