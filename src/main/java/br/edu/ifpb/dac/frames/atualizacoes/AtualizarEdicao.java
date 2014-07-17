package br.edu.ifpb.dac.frames.atualizacoes;

import br.edu.ifpb.dac.entidades.Edicao;
import br.edu.ifpb.dac.entidades.Editora;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */

public class AtualizarEdicao extends javax.swing.JFrame {
    private final Edicao edicao;
    
    public AtualizarEdicao(Edicao edicao) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.edicao = edicao;
        
        setCampos(edicao);
    }
    
    private void setCampos(Edicao edicao) {
        textCodISBN.setText(edicao.getIsbn());
        textNumero.setText(String.valueOf(edicao.getNumero()));
        textPreco.setText(String.valueOf(edicao.getPreco()));
        textAnoEdicao.setText(String.valueOf(edicao.getAno()));
        textNumeroDePaginas.setText(String.valueOf(edicao.getNumPaginas()));
        textQuantidade.setText(String.valueOf(edicao.getQtdeEstoque()));
                
        comboEditora.addItem(edicao.getEditora());        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastroEdicao = new javax.swing.JPanel();
        labelInformacoesEdicao = new javax.swing.JLabel();
        labelCodISBN = new javax.swing.JLabel();
        textCodISBN = new javax.swing.JTextField();
        textNumero = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        textPreco = new javax.swing.JFormattedTextField();
        labelAnoEdicao = new javax.swing.JLabel();
        textAnoEdicao = new javax.swing.JTextField();
        labelNumeroDePaginas = new javax.swing.JLabel();
        textNumeroDePaginas = new javax.swing.JTextField();
        textQuantidade = new javax.swing.JTextField();
        labelQuantidade = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        comboEditora = new javax.swing.JComboBox();
        labelEditora = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btEditarEditora = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Edição");

        panelCadastroEdicao.setBackground(new java.awt.Color(204, 204, 204));

        labelInformacoesEdicao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelInformacoesEdicao.setText("Informações da Edição");

        labelCodISBN.setText("Código ISBN");

        labelNumero.setText("Número");

        labelPreco.setText("Preço");

        textPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        labelAnoEdicao.setText("Ano");

        labelNumeroDePaginas.setText("Nº de Páginas");

        labelQuantidade.setText("Quantidade");

        btCancelar.setBackground(new java.awt.Color(231, 228, 231));
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        comboEditora.setBackground(new java.awt.Color(231, 228, 231));

        labelEditora.setText("Editora");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Accept.png"))); // NOI18N
        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btEditarEditora.setBackground(new java.awt.Color(231, 228, 231));
        btEditarEditora.setText("Editar Editora");
        btEditarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarEditoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCadastroEdicaoLayout = new javax.swing.GroupLayout(panelCadastroEdicao);
        panelCadastroEdicao.setLayout(panelCadastroEdicaoLayout);
        panelCadastroEdicaoLayout.setHorizontalGroup(
            panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addGap(20, 20, 20))
            .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelInformacoesEdicao)
                    .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                        .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroEdicaoLayout.createSequentialGroup()
                                .addComponent(labelEditora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEditora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                                .addComponent(labelQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                                    .addComponent(labelNumeroDePaginas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textNumeroDePaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                                    .addComponent(labelCodISBN)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textCodISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroEdicaoLayout.createSequentialGroup()
                                        .addComponent(labelAnoEdicao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textAnoEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroEdicaoLayout.createSequentialGroup()
                                        .addComponent(labelPreco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroEdicaoLayout.createSequentialGroup()
                                        .addComponent(labelNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroEdicaoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btEditarEditora)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCadastroEdicaoLayout.setVerticalGroup(
            panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInformacoesEdicao)
                .addGap(18, 18, 18)
                .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodISBN)
                    .addComponent(textCodISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumero)
                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPreco)
                    .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumeroDePaginas)
                    .addComponent(textNumeroDePaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidade)
                    .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAnoEdicao)
                    .addComponent(textAnoEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEditora)
                    .addComponent(comboEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarEditora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(jButton1))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastroEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastroEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        edicao.setIsbn(textCodISBN.getText().trim());
        edicao.setNumero(Integer.parseInt(textNumero.getText().trim()));
        edicao.setPreco(Double.parseDouble(textPreco.getText().trim()));
        edicao.setAno(Integer.parseInt(textAnoEdicao.getText().trim()));
        edicao.setNumPaginas(Integer.parseInt(textNumeroDePaginas.getText().trim()));
        edicao.setQtdeEstoque(Integer.parseInt(textQuantidade.getText().trim()));
        edicao.setEditora((Editora) comboEditora.getSelectedItem());
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btEditarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarEditoraActionPerformed
        Editora editora = (Editora) comboEditora.getSelectedItem();
        String nome = JOptionPane.showInputDialog("Nome da Editora: ");
        String telefone = JOptionPane.showInputDialog("Telefone da Editora: ");
        editora.setNome(nome);
        editora.setTelefone(telefone);
    }//GEN-LAST:event_btEditarEditoraActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditarEditora;
    private javax.swing.JComboBox comboEditora;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelAnoEdicao;
    private javax.swing.JLabel labelCodISBN;
    private javax.swing.JLabel labelEditora;
    private javax.swing.JLabel labelInformacoesEdicao;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelNumeroDePaginas;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JPanel panelCadastroEdicao;
    private javax.swing.JTextField textAnoEdicao;
    private javax.swing.JTextField textCodISBN;
    private javax.swing.JTextField textNumero;
    private javax.swing.JTextField textNumeroDePaginas;
    private javax.swing.JFormattedTextField textPreco;
    private javax.swing.JTextField textQuantidade;
    // End of variables declaration//GEN-END:variables
}