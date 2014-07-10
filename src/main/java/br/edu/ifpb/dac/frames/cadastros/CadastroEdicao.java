package br.edu.ifpb.dac.frames.cadastros;

import br.edu.ifpb.dac.entidades.Edicao;
import br.edu.ifpb.dac.entidades.Editora;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */

public class CadastroEdicao extends javax.swing.JFrame {
    private final DAO dao;
    private final DefaultListModel<Edicao> listModelEdicoes;    
    
    public CadastroEdicao(DefaultListModel<Edicao> listModelEdicoes) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        dao = new DaoJPA("projeto-dac");
        this.listModelEdicoes = listModelEdicoes;
        
        carregarComboEditora();
    }
    
    private void carregarComboEditora() {
        comboEditoraMouseClicked(null);
    }
    
    private void limparCampos() {
        textCodISBN.setText("");
        textNumero.setText("");
        textPreco.setText("");
        textAnoEdicao.setText("");
        textNumeroDePaginas.setText("");
        textQuantidade.setText("");
        
        comboEditora.setSelectedIndex(-1);
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
        btNovaEditora = new javax.swing.JButton();
        comboEditora = new javax.swing.JComboBox();
        labelEditora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Edição");

        labelInformacoesEdicao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelInformacoesEdicao.setText("Informações da Edição");

        labelCodISBN.setText("Código ISBN");

        labelNumero.setText("Número");

        labelPreco.setText("Preço");

        textPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        labelAnoEdicao.setText("Ano");

        labelNumeroDePaginas.setText("Nº de Páginas");

        labelQuantidade.setText("Quantidade");

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

        btNovaEditora.setText("Nova Editora");
        btNovaEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaEditoraActionPerformed(evt);
            }
        });

        comboEditora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboEditoraMouseClicked(evt);
            }
        });

        labelEditora.setText("Editora");

        javax.swing.GroupLayout panelCadastroEdicaoLayout = new javax.swing.GroupLayout(panelCadastroEdicao);
        panelCadastroEdicao.setLayout(panelCadastroEdicaoLayout);
        panelCadastroEdicaoLayout.setHorizontalGroup(
            panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroEdicaoLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addGap(26, 26, 26))
            .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelInformacoesEdicao)
                    .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroEdicaoLayout.createSequentialGroup()
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
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroEdicaoLayout.createSequentialGroup()
                            .addComponent(labelEditora)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btNovaEditora))))
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
                    .addComponent(btNovaEditora))
                .addGap(35, 35, 35)
                .addGroup(panelCadastroEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroEdicaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCancelar))
                    .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
        Editora editora = (Editora) comboEditora.getSelectedItem();
        
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
                       
        if(isbn.isEmpty() || numero == 0 || preco == 0 || ano == 0 || numeroDePaginas == 0 || qtdeEstoque == 0 || comboEditora.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Informe todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else {            
            Edicao edicao = new Edicao(isbn, numero, preco, ano, numeroDePaginas, qtdeEstoque);
            
            editora.getListaEdicoes().add(edicao);
            edicao.setEditora(editora);            
            
            List<Edicao> edicoes = dao.buscarTodos(Edicao.class); 
            boolean exist = false;
            
            if(listModelEdicoes.isEmpty()) {
                for (Edicao edicao1 : edicoes) {
                    if(edicao1.getIsbn().equals(isbn) && edicao1.getNumero() == numero
                        && edicao1.getPreco() == preco && edicao1.getAno() == ano
                        && edicao1.getNumPaginas() == numeroDePaginas && edicao1.getQtdeEstoque() == qtdeEstoque) {
                            
                        exist = true;
                        break;
                    }
                }
                if(!exist) {
                    listModelEdicoes.addElement(edicao);                
                    JOptionPane.showMessageDialog(this, "Edição adicionada com sucesso");
                    limparCampos();
                }
                else {                
                    JOptionPane.showMessageDialog(this, "Esta edicão já está cadastrada no sistema!", "Atenção!", JOptionPane.WARNING_MESSAGE);                           
                }
            }            
            else {                
                for (int i = 0; i < listModelEdicoes.size(); i++) {
                    if(listModelEdicoes.getElementAt(i).getIsbn().equals(isbn) && listModelEdicoes.getElementAt(i).getNumero() == numero
                            && listModelEdicoes.getElementAt(i).getPreco() == preco && listModelEdicoes.getElementAt(i).getAno() == ano
                            && listModelEdicoes.getElementAt(i).getNumPaginas() == numeroDePaginas && listModelEdicoes.getElementAt(i).getQtdeEstoque() == qtdeEstoque) {
                        
                        exist = true;
                        break;
                    }                    
                }                
                if(!exist) {
                    listModelEdicoes.addElement(edicao);                
                    JOptionPane.showMessageDialog(this, "Edição adicionada com sucesso");
                    limparCampos();                                
                }
                else {                
                    JOptionPane.showMessageDialog(this, "Esta edicão já está adicionada na lista!", "Atenção!", JOptionPane.WARNING_MESSAGE);                           
                }            
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btNovaEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaEditoraActionPerformed
        new CadastroEditora().setVisible(true);
    }//GEN-LAST:event_btNovaEditoraActionPerformed

    private void comboEditoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboEditoraMouseClicked
        List<Editora> editoras = dao.buscarTodos(Editora.class);
        comboEditora.removeAllItems();

        for (Editora editora : editoras) {
            comboEditora.addItem(editora);
        }
    }//GEN-LAST:event_comboEditoraMouseClicked
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovaEditora;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox comboEditora;
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