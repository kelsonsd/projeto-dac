package br.edu.ifpb.dac.frames;

/**
 *
 * @author kelsonsd
 */
public class CadastroVenda extends javax.swing.JFrame {

    public CadastroVenda() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastroVenda = new javax.swing.JPanel();
        labelInformacoesVenda = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        labelEdicao = new javax.swing.JLabel();
        comboEdicoes = new javax.swing.JComboBox();
        btAdicionar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        textMatricula = new javax.swing.JTextField();
        textData = new javax.swing.JTextField();
        labelValorTotal = new javax.swing.JLabel();
        textValorTotal = new javax.swing.JTextField();
        btFinalizarVenda = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        scrollPaneEdicoes = new javax.swing.JScrollPane();
        listEdicoes = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda de Livro");

        labelInformacoesVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelInformacoesVenda.setText("Informações da Venda");

        labelData.setText("Data");

        labelMatricula.setText("Matrícula do Funcionário");

        labelEdicao.setText("Edição");

        btAdicionar.setText("Adicionar");

        btRemover.setText("Remover");

        textData.setEditable(false);

        labelValorTotal.setText("Valor Total");

        textValorTotal.setEditable(false);

        btFinalizarVenda.setText("Finalizar Venda");

        btCancelar.setText("Cancelar");

        scrollPaneEdicoes.setViewportView(listEdicoes);

        javax.swing.GroupLayout panelCadastroVendaLayout = new javax.swing.GroupLayout(panelCadastroVenda);
        panelCadastroVenda.setLayout(panelCadastroVendaLayout);
        panelCadastroVendaLayout.setHorizontalGroup(
            panelCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroVendaLayout.createSequentialGroup()
                        .addGroup(panelCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroVendaLayout.createSequentialGroup()
                                .addGroup(panelCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelInformacoesVenda, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroVendaLayout.createSequentialGroup()
                                        .addComponent(labelData)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroVendaLayout.createSequentialGroup()
                                        .addGroup(panelCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroVendaLayout.createSequentialGroup()
                                                .addComponent(labelMatricula)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textMatricula))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroVendaLayout.createSequentialGroup()
                                                .addComponent(labelEdicao)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(comboEdicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btAdicionar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(scrollPaneEdicoes))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroVendaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btFinalizarVenda)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroVendaLayout.createSequentialGroup()
                        .addComponent(labelValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRemover)
                        .addContainerGap())))
        );
        panelCadastroVendaLayout.setVerticalGroup(
            panelCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInformacoesVenda)
                .addGap(18, 18, 18)
                .addGroup(panelCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelData)
                    .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatricula)
                    .addComponent(textMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEdicao)
                    .addComponent(comboEdicoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneEdicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelValorTotal)
                        .addComponent(textValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panelCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFinalizarVenda)
                    .addComponent(btCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastroVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCadastroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFinalizarVenda;
    private javax.swing.JButton btRemover;
    private javax.swing.JComboBox comboEdicoes;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelEdicao;
    private javax.swing.JLabel labelInformacoesVenda;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelValorTotal;
    private javax.swing.JList listEdicoes;
    private javax.swing.JPanel panelCadastroVenda;
    private javax.swing.JScrollPane scrollPaneEdicoes;
    private javax.swing.JTextField textData;
    private javax.swing.JTextField textMatricula;
    private javax.swing.JTextField textValorTotal;
    // End of variables declaration//GEN-END:variables
}