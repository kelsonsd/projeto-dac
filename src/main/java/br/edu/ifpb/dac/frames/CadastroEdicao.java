package br.edu.ifpb.dac.frames;

import br.edu.ifpb.dac.entidades.Edicao;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */
public class CadastroEdicao extends javax.swing.JFrame {
    
    public CadastroEdicao() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);        
    }
    
    private void limparCampos() {
        textCodISBN.setText("");
        textNumero.setText("");
        textPreco.setText("");
        textAnoEdicao.setText("");
        textNumeroDePaginas.setText("");
        textQuantidade.setText("");
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
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Edição");

        labelInformacoesEdicao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelInformacoesEdicao.setText("Informações da Edição");

        labelCodISBN.setText("Código ISBN");

        textNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textNumeroKeyPressed(evt);
            }
        });

        labelNumero.setText("Número");

        labelPreco.setText("Preço");

        textPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        labelAnoEdicao.setText("Ano");

        labelNumeroDePaginas.setText("Nº de Páginas");

        labelQuantidade.setText("Quantidade");

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

        javax.swing.GroupLayout panelCadastroEdicaoLayout = new javax.swing.GroupLayout(panelCadastroEdicao);
        panelCadastroEdicao.setLayout(panelCadastroEdicaoLayout);
        panelCadastroEdicaoLayout.setHorizontalGroup(
            panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroEdicaoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btSalvar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addGap(50, 50, 50))
            .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                        .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                                .addComponent(labelQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                                    .addComponent(labelNumeroDePaginas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textNumeroDePaginas))
                                .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                                    .addComponent(labelCodISBN)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textCodISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelAnoEdicao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textAnoEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                                .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                                        .addComponent(labelPreco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textPreco))
                                    .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                                        .addComponent(labelNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                        .addComponent(labelInformacoesEdicao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGap(32, 32, 32)
                .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastroEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastroEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        String isbn = textCodISBN.getText().trim();
        int numero = 0;
        double preco = 0;
        int ano = 0;
        int numeroDePaginas = 0;
        int qtdeEstoque = 0;        
        
        if(!textNumero.getText().trim().isEmpty() && !textPreco.getText().trim().isEmpty()) {
            numero = Integer.parseInt(textNumero.getText().trim());
            preco = Double.parseDouble(textPreco.getText().trim());
        }
        
        if(!textAnoEdicao.getText().trim().isEmpty() && !textNumeroDePaginas.getText().trim().isEmpty()) {
            ano = Integer.parseInt(textAnoEdicao.getText().trim());
            numeroDePaginas = Integer.parseInt(textNumeroDePaginas.getText().trim());
        }
        
        if(!textQuantidade.getText().trim().isEmpty()) {
            qtdeEstoque = Integer.parseInt(textQuantidade.getText().trim());
        }        
                       
        if(isbn.isEmpty() || numero == 0 || preco == 0 || ano == 0 || numeroDePaginas == 0 || qtdeEstoque == 0) {
            JOptionPane.showMessageDialog(this, "Informe todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else {
            DAO dao = new DaoJPA("projeto-dac");            
            Edicao edicao = new Edicao(isbn, numero, preco, ano, numeroDePaginas, qtdeEstoque);            
            
            if(dao.salvar(edicao)) {
                JOptionPane.showMessageDialog(this, "Edição cadastrada com sucesso");
                limparCampos();
            }
            else {
                JOptionPane.showMessageDialog(this, "Erro!");
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void textNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNumeroKeyPressed
        String caracteres="0987654321";
        
        if(!caracteres.contains(evt.getKeyChar()+"")){            
            JOptionPane.showMessageDialog(null, "Digite apenas números nesse campo", "Erro", JOptionPane.ERROR_MESSAGE);
            textNumero.setText("");
        }
    }//GEN-LAST:event_textNumeroKeyPressed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel labelAnoEdicao;
    private javax.swing.JLabel labelCodISBN;
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