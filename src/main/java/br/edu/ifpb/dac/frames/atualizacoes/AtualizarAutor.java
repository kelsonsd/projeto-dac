package br.edu.ifpb.dac.frames.atualizacoes;

import br.edu.ifpb.dac.entidades.Autor;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */

public class AtualizarAutor extends javax.swing.JFrame {
    private final Autor autor;

    public AtualizarAutor(Autor autor) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        this.autor = autor;
        preencheCampos();
    }
    
    private void preencheCampos() {
        textNome.setText(autor.getNome());
        textDataNascimento.setText(autor.getDataNascimento());
        textAreaBiografia.setText(autor.getBiografia());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastroPessoa = new javax.swing.JPanel();
        labelInformacoesAutorFuncionario = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelDataNascimento = new javax.swing.JLabel();
        labelBiografia = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textDataNascimento = new javax.swing.JFormattedTextField();
        scrollPanelBiografia = new javax.swing.JScrollPane();
        textAreaBiografia = new javax.swing.JTextArea();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Autor");

        labelInformacoesAutorFuncionario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelInformacoesAutorFuncionario.setText("Informações do Autor");

        labelNome.setText("Nome");

        labelDataNascimento.setText("Data de Nascimento");

        labelBiografia.setText("Biografia");

        try {
            textDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        textAreaBiografia.setColumns(20);
        textAreaBiografia.setRows(5);
        scrollPanelBiografia.setViewportView(textAreaBiografia);

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Accept.png"))); // NOI18N
        btSalvar.setText("Atualizar");
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

        javax.swing.GroupLayout panelCadastroPessoaLayout = new javax.swing.GroupLayout(panelCadastroPessoa);
        panelCadastroPessoa.setLayout(panelCadastroPessoaLayout);
        panelCadastroPessoaLayout.setHorizontalGroup(
            panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanelBiografia)
                    .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                        .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelDataNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelInformacoesAutorFuncionario)
                            .addComponent(labelBiografia))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroPessoaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addGap(96, 96, 96))
        );
        panelCadastroPessoaLayout.setVerticalGroup(
            panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInformacoesAutorFuncionario)
                .addGap(18, 18, 18)
                .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDataNascimento)
                    .addComponent(textDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelBiografia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanelBiografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastroPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastroPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        DAO dao = new DaoJPA("projeto-dac");

        String nome = textNome.getText().trim();
        String dataNascimento = textDataNascimento.getText().trim();
        String biografia = textAreaBiografia.getText().trim();

        if (nome.isEmpty() || dataNascimento.isEmpty() || biografia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            autor.setNome(nome);
            autor.setDataNascimento(dataNascimento);
            autor.setBiografia(biografia);

            if (dao.atualizar(autor)) {
                JOptionPane.showMessageDialog(this, "Autor atualizado com sucesso");
                dispose();
            } else {
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
    private javax.swing.JLabel labelBiografia;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelInformacoesAutorFuncionario;
    private javax.swing.JLabel labelNome;
    private javax.swing.JPanel panelCadastroPessoa;
    private javax.swing.JScrollPane scrollPanelBiografia;
    private javax.swing.JTextArea textAreaBiografia;
    private javax.swing.JFormattedTextField textDataNascimento;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}
