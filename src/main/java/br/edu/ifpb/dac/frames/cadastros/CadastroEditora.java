package br.edu.ifpb.dac.frames.cadastros;

import br.edu.ifpb.dac.entidades.Editora;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */
public class CadastroEditora extends javax.swing.JFrame {
   
    public CadastroEditora() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public void limparCampos() {
        textNome.setText("");
        textTelefone.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastroEditora = new javax.swing.JPanel();
        labelInformacoesEditora = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textTelefone = new javax.swing.JFormattedTextField();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Editora");

        labelInformacoesEditora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelInformacoesEditora.setText("Informações da Editora");

        labelNome.setText("Nome");

        labelTelefone.setText("Telefone");

        try {
            textTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Disk.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCadastroEditoraLayout = new javax.swing.GroupLayout(panelCadastroEditora);
        panelCadastroEditora.setLayout(panelCadastroEditoraLayout);
        panelCadastroEditoraLayout.setHorizontalGroup(
            panelCadastroEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroEditoraLayout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(panelCadastroEditoraLayout.createSequentialGroup()
                        .addComponent(labelInformacoesEditora)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroEditoraLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addGap(71, 71, 71))
        );
        panelCadastroEditoraLayout.setVerticalGroup(
            panelCadastroEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroEditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInformacoesEditora)
                .addGap(18, 18, 18)
                .addGroup(panelCadastroEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone)
                    .addComponent(textTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelCadastroEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCadastroEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastroEditora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        String nome = textNome.getText().trim();
        String telefone = textTelefone.getText().trim();        
        
        if(nome.equals("") || telefone.equals("(  )    -")) {        
            JOptionPane.showMessageDialog(this, "Informe todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else {
            DAO dao = new DaoJPA("projeto-dac");
            Editora editora = new Editora(nome, telefone);
            
            if(dao.salvar(editora)) {
                JOptionPane.showMessageDialog(this, "Editora cadastrada com sucesso");
                limparCampos();
            }
            else {
                JOptionPane.showMessageDialog(this, "Erro!");
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel labelInformacoesEditora;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JPanel panelCadastroEditora;
    private javax.swing.JTextField textNome;
    private javax.swing.JFormattedTextField textTelefone;
    // End of variables declaration//GEN-END:variables
}