package br.edu.ifpb.dac.frames;

/**
 *
 * @author kelsonsd
 */
public class CadastroLivro extends javax.swing.JFrame {
    
    public CadastroLivro() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastroLivro = new javax.swing.JPanel();
        labeIinformacoesLivro = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        labelIdioma = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelGenero = new javax.swing.JLabel();
        labelAreaAtuacao = new javax.swing.JLabel();
        labelAnoLivro = new javax.swing.JLabel();
        labelAutor = new javax.swing.JLabel();
        comboAutor = new javax.swing.JComboBox();
        btAdicionar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        textGenero = new javax.swing.JTextField();
        textIdioma = new javax.swing.JTextField();
        textTitulo = new javax.swing.JTextField();
        textAreaAtuacao = new javax.swing.JTextField();
        textAnoLivro = new javax.swing.JTextField();
        btNovoAutor = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btNovaEdicao = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        labelInformacoesEdicao = new javax.swing.JLabel();
        labelCodISBN = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        labelAnoEdicao = new javax.swing.JLabel();
        labelNumeroDePaginas = new javax.swing.JLabel();
        labelQuantidade = new javax.swing.JLabel();
        textCodISBN = new javax.swing.JTextField();
        textNumero = new javax.swing.JTextField();
        textPreco = new javax.swing.JFormattedTextField();
        textAnoEdicao = new javax.swing.JTextField();
        textNumeroDePaginas = new javax.swing.JTextField();
        textQuantidade = new javax.swing.JTextField();
        labelEditora = new javax.swing.JLabel();
        comboEditora = new javax.swing.JComboBox();
        comboTipo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAutores = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Livro");

        labeIinformacoesLivro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labeIinformacoesLivro.setText("Informações do Livro");

        labelTipo.setText("Tipo");

        labelIdioma.setText("Idioma");

        labelTitulo.setText("Título");

        labelGenero.setText("Gênero");

        labelAreaAtuacao.setText("Area de Atuação");

        labelAnoLivro.setText("Ano");

        labelAutor.setText("Autor");

        comboAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAutorActionPerformed(evt);
            }
        });

        btAdicionar.setText("Adicionar");

        btRemover.setText("Remover");

        btNovoAutor.setText("Novo Autor");
        btNovoAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoAutorActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");

        btNovaEdicao.setText("Nova Edição");

        labelInformacoesEdicao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelInformacoesEdicao.setText("Informações da Edição");

        labelCodISBN.setText("Código ISBN");

        labelNumero.setText("Número");

        labelPreco.setText("Preço");

        labelAnoEdicao.setText("Ano");

        labelNumeroDePaginas.setText("Nº de Páginas");

        labelQuantidade.setText("Quantidade");

        textPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        labelEditora.setText("Editora");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ficção", "Técnico" }));

        jScrollPane1.setViewportView(listAutores);

        javax.swing.GroupLayout panelCadastroLivroLayout = new javax.swing.GroupLayout(panelCadastroLivro);
        panelCadastroLivro.setLayout(panelCadastroLivroLayout);
        panelCadastroLivroLayout.setHorizontalGroup(
            panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLivroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addGap(109, 109, 109))
            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                        .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                .addComponent(labelInformacoesEdicao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btNovaEdicao))
                            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                .addComponent(labelTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelEditora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labeIinformacoesLivro)
                                    .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroLivroLayout.createSequentialGroup()
                                            .addComponent(labelGenero)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(textGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(labelAreaAtuacao)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(textAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(labelAnoLivro)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(textAnoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                            .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroLivroLayout.createSequentialGroup()
                                                    .addComponent(labelAutor)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(comboAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btAdicionar)
                                                .addComponent(btRemover))))
                                    .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                        .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroLivroLayout.createSequentialGroup()
                                                    .addComponent(labelNumero)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(labelAnoEdicao)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(textAnoEdicao))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroLivroLayout.createSequentialGroup()
                                                    .addComponent(labelCodISBN)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(textCodISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                                .addComponent(labelPreco)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                                .addComponent(labelQuantidade)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textQuantidade))
                                            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                                .addComponent(labelNumeroDePaginas)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textNumeroDePaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                        .addComponent(labelTitulo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelIdioma)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 2, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                        .addComponent(btNovoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelCadastroLivroLayout.setVerticalGroup(
            panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeIinformacoesLivro)
                .addGap(15, 15, 15)
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipo)
                    .addComponent(labelEditora)
                    .addComponent(comboEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdioma)
                    .addComponent(textIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGenero)
                    .addComponent(textGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAreaAtuacao)
                    .addComponent(textAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAnoLivro)
                    .addComponent(textAnoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAutor)
                    .addComponent(comboAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNovoAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelInformacoesEdicao)
                    .addComponent(btNovaEdicao))
                .addGap(15, 15, 15)
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodISBN)
                    .addComponent(textCodISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero)
                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAnoEdicao)
                    .addComponent(textAnoEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumeroDePaginas)
                    .addComponent(textNumeroDePaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPreco)
                    .addComponent(textPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelQuantidade)
                    .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastroLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastroLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAutorActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btNovoAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoAutorActionPerformed
        new CadastroPessoa().setVisible(true);
    }//GEN-LAST:event_btNovoAutorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovaEdicao;
    private javax.swing.JButton btNovoAutor;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox comboAutor;
    private javax.swing.JComboBox comboEditora;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labeIinformacoesLivro;
    private javax.swing.JLabel labelAnoEdicao;
    private javax.swing.JLabel labelAnoLivro;
    private javax.swing.JLabel labelAreaAtuacao;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelCodISBN;
    private javax.swing.JLabel labelEditora;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelIdioma;
    private javax.swing.JLabel labelInformacoesEdicao;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelNumeroDePaginas;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList listAutores;
    private javax.swing.JPanel panelCadastroLivro;
    private javax.swing.JTextField textAnoEdicao;
    private javax.swing.JTextField textAnoLivro;
    private javax.swing.JTextField textAreaAtuacao;
    private javax.swing.JTextField textCodISBN;
    private javax.swing.JTextField textGenero;
    private javax.swing.JTextField textIdioma;
    private javax.swing.JTextField textNumero;
    private javax.swing.JTextField textNumeroDePaginas;
    private javax.swing.JFormattedTextField textPreco;
    private javax.swing.JTextField textQuantidade;
    private javax.swing.JTextField textTitulo;
    // End of variables declaration//GEN-END:variables
}