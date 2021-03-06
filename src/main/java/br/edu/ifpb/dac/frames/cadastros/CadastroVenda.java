package br.edu.ifpb.dac.frames.cadastros;

import br.edu.ifpb.dac.entidades.Edicao;
import br.edu.ifpb.dac.entidades.Funcionario;
import br.edu.ifpb.dac.entidades.Venda;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */

public class CadastroVenda extends javax.swing.JFrame {    
    private DefaultListModel<Edicao> listModelEdicoes;
    
    public CadastroVenda() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);        
        
        setData();
        setModel();        
        textValorTotal.setText("0.0");
    }
    
    private void setData() {        
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String dataformatada = formatador.format(new Date());
        textData.setText(dataformatada);
    }
    
    private void setModel() {
        listModelEdicoes = new DefaultListModel<>();
        listEdicoes.setModel(listModelEdicoes);
    }
    
    private List<Edicao> getEdicoesSelecionadas() {
        List<Edicao> listaEdicoesSelecionadas = new ArrayList<>();        
        DefaultListModel<Edicao> modelAux = (DefaultListModel<Edicao>) listEdicoes.getModel();
        
        for (int i = 0; i < modelAux.size(); i++) {
            Edicao edicao = modelAux.getElementAt(i);
            listaEdicoesSelecionadas.add(edicao);
        }
        return listaEdicoesSelecionadas;
    }
    
    private void limparCampos() {
        textMatricula.setText("");
        textValorTotal.setText("0.0");
        
        comboEdicoes.setSelectedIndex(-1);
        
        listModelEdicoes.removeAllElements();
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

        panelCadastroVenda.setBackground(new java.awt.Color(204, 204, 204));

        labelInformacoesVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelInformacoesVenda.setText("Informações da Venda");

        labelData.setText("Data");

        labelMatricula.setText("Matric. Funcionário");

        labelEdicao.setText("Edição");

        comboEdicoes.setBackground(new java.awt.Color(231, 228, 231));
        comboEdicoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboEdicoesMouseClicked(evt);
            }
        });

        btAdicionar.setBackground(new java.awt.Color(231, 228, 231));
        btAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cart-Add.png"))); // NOI18N
        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btRemover.setBackground(new java.awt.Color(231, 228, 231));
        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cart-Delete.png"))); // NOI18N
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        textData.setEditable(false);

        labelValorTotal.setText("Valor Total R$");

        textValorTotal.setEditable(false);

        btFinalizarVenda.setBackground(new java.awt.Color(231, 228, 231));
        btFinalizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Accept.png"))); // NOI18N
        btFinalizarVenda.setText("Finalizar Venda");
        btFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarVendaActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(231, 228, 231));
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

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
                                        .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 219, Short.MAX_VALUE))
                            .addComponent(scrollPaneEdicoes)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroVendaLayout.createSequentialGroup()
                                .addGroup(panelCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelCadastroVendaLayout.createSequentialGroup()
                                        .addComponent(labelMatricula)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textMatricula))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroVendaLayout.createSequentialGroup()
                                        .addComponent(labelEdicao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboEdicoes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAdicionar)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroVendaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btFinalizarVenda)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar)
                        .addGap(49, 49, 49))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelCadastroVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFinalizarVenda)
                    .addComponent(btCancelar))
                .addGap(10, 10, 10))
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

    private void comboEdicoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboEdicoesMouseClicked
        DAO dao = new DaoJPA("projeto-dac");
        List<Edicao> edicoes = dao.buscarTodos(Edicao.class);
        comboEdicoes.removeAllItems();

        for (Edicao edicao : edicoes) {
            comboEdicoes.addItem(edicao);
        }
    }//GEN-LAST:event_comboEdicoesMouseClicked

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        if(comboEdicoes.getSelectedIndex() != -1) {
            Edicao edicaoSelecionada = (Edicao) comboEdicoes.getSelectedItem();
            
            if(edicaoSelecionada.getQtdeEstoque() > 0) {
                listModelEdicoes.addElement(edicaoSelecionada);
                textValorTotal.setText(String.valueOf(edicaoSelecionada.getPreco() + Double.parseDouble(textValorTotal.getText())));
            }
            else {
                JOptionPane.showMessageDialog(this, "Sem estoque disponível!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }                
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        if(listEdicoes.getSelectedIndex() != -1) {
            int edicaoSelecionada = listEdicoes.getSelectedIndex();
            
            textValorTotal.setText(String.valueOf(Double.parseDouble(textValorTotal.getText()) - listModelEdicoes.getElementAt(edicaoSelecionada).getPreco())) ;
            listModelEdicoes.remove(edicaoSelecionada);            
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarVendaActionPerformed
        String matricula = textMatricula.getText();        
        Double preco = Double.parseDouble(textValorTotal.getText());        
        
        if(matricula.isEmpty() || listModelEdicoes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else {
            Venda venda = new Venda();
            DAO dao = new DaoJPA("projeto-dac");                        
            List<Funcionario> funcionarios = dao.buscarTodos(Funcionario.class);
            boolean exist = false;
            boolean estoque = true;
            
            for (Funcionario funcionario : funcionarios) {
                if(funcionario.getMatricula().equals(matricula)) {                                
                    venda.setFuncionario(funcionario);
                    exist = true;
                    break;
                }
            }            
            for (Edicao edicao : getEdicoesSelecionadas()) {
                if(edicao.getQtdeEstoque() < 1) {
                    estoque = false;
                    JOptionPane.showMessageDialog(this, "A edição não possui estoque disponível para venda!\n" + edicao, "Atenção", JOptionPane.WARNING_MESSAGE);
                    break;
                }    
            }
            if(exist) {
                if(estoque) {
                    venda.setDataVenda(new Date());                    
                    venda.setTotal(preco);
                    venda.setListaEdicoes(getEdicoesSelecionadas());
                    
                    for (Edicao edicao : venda.getListaEdicoes()) {
                        edicao.setQtdeEstoque(edicao.getQtdeEstoque() - 1);                        
                    }                    
                    if(dao.salvar(venda)) {
                        JOptionPane.showMessageDialog(this, "Venda efetuada com sucesso!");
                        limparCampos();                        
                    }
                }                
            }    
            else {
                JOptionPane.showMessageDialog(this, "Matrícula inválida!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }                
        }    
    }//GEN-LAST:event_btFinalizarVendaActionPerformed

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