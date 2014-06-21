package br.edu.ifpb.dac.frames;

/**
 *
 * @author kelsonsd
 */
public class CadastroPessoa extends javax.swing.JFrame {
    
    public CadastroPessoa() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastroPessoa = new javax.swing.JPanel();
        labelInformacoesAutorFuncionario = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        labelFuncao = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelDataNascimento = new javax.swing.JLabel();
        labelBiografia = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox();
        textMatricula = new javax.swing.JTextField();
        textFuncao = new javax.swing.JTextField();
        textNome = new javax.swing.JTextField();
        textDataNascimento = new javax.swing.JFormattedTextField();
        scrollPanelBiografia = new javax.swing.JScrollPane();
        textAreaBiografia = new javax.swing.JTextArea();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Autor/Funcionário");

        labelInformacoesAutorFuncionario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelInformacoesAutorFuncionario.setText("Informações do Autor/Funcionário");

        labelTipo.setText("Tipo");

        labelMatricula.setText("Matrícula");

        labelFuncao.setText("Função");

        labelNome.setText("Nome");

        labelDataNascimento.setText("Data de Nascimento");

        labelBiografia.setText("Biografia");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Autor", "Funcionário" }));

        try {
            textDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        textAreaBiografia.setColumns(20);
        textAreaBiografia.setRows(5);
        scrollPanelBiografia.setViewportView(textAreaBiografia);

        btSalvar.setText("Salvar");

        btCancelar.setText("Cancelar");

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
                            .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                                .addComponent(labelTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelBiografia)
                            .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                                .addComponent(labelMatricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelFuncao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroPessoaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addGap(137, 137, 137))
        );
        panelCadastroPessoaLayout.setVerticalGroup(
            panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInformacoesAutorFuncionario)
                .addGap(18, 18, 18)
                .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipo)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatricula)
                    .addComponent(textMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFuncao)
                    .addComponent(textFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JLabel labelBiografia;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelFuncao;
    private javax.swing.JLabel labelInformacoesAutorFuncionario;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JPanel panelCadastroPessoa;
    private javax.swing.JScrollPane scrollPanelBiografia;
    private javax.swing.JTextArea textAreaBiografia;
    private javax.swing.JFormattedTextField textDataNascimento;
    private javax.swing.JTextField textFuncao;
    private javax.swing.JTextField textMatricula;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}