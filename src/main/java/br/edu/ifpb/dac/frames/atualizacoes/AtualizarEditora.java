package br.edu.ifpb.dac.frames.atualizacoes;

import br.edu.ifpb.dac.entidades.Editora;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */

public class AtualizarEditora extends javax.swing.JFrame {
    private final Editora editora;

    public AtualizarEditora(Editora editora) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);        
        
        this.editora = editora;
        preencheCampos();
    }
    
    private void preencheCampos() {
        textNome.setText(editora.getNome());
        textTelefone.setText(editora.getTelefone());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAtualizarEditora = new javax.swing.JPanel();
        labelInformacoesEditora = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textTelefone = new javax.swing.JFormattedTextField();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Editora");

        labelInformacoesEditora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelInformacoesEditora.setText("Informações da Editora");

        labelNome.setText("Nome");

        labelTelefone.setText("Telefone");

        try {
            textTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAtualizarEditoraLayout = new javax.swing.GroupLayout(panelAtualizarEditora);
        panelAtualizarEditora.setLayout(panelAtualizarEditoraLayout);
        panelAtualizarEditoraLayout.setHorizontalGroup(
            panelAtualizarEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtualizarEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAtualizarEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAtualizarEditoraLayout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(panelAtualizarEditoraLayout.createSequentialGroup()
                        .addComponent(labelInformacoesEditora)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAtualizarEditoraLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addGap(71, 71, 71))
        );
        panelAtualizarEditoraLayout.setVerticalGroup(
            panelAtualizarEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtualizarEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInformacoesEditora)
                .addGap(18, 18, 18)
                .addGroup(panelAtualizarEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone)
                    .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panelAtualizarEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAtualizarEditora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAtualizarEditora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        String nome = textNome.getText().trim();
        String telefone = textTelefone.getText().trim();

        if(nome.equals("") || telefone.equals("(  )    -")) {
            JOptionPane.showMessageDialog(this, "Informe todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else {
            DAO dao = new DaoJPA("projeto-dac");
            editora.setNome(nome);
            editora.setTelefone(telefone);

            if(dao.atualizar(editora)) {
                JOptionPane.showMessageDialog(this, "Editora atualizada com sucesso");
                dispose();
            }
            else {
                JOptionPane.showMessageDialog(this, "Erro!");
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel labelInformacoesEditora;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JPanel panelAtualizarEditora;
    private javax.swing.JTextField textNome;
    private javax.swing.JFormattedTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}