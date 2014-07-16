package br.edu.ifpb.dac.frames.cadastros;

import br.edu.ifpb.dac.entidades.Autor;
import br.edu.ifpb.dac.entidades.Endereco;
import br.edu.ifpb.dac.entidades.Funcionario;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */
public class CadastroPessoa extends javax.swing.JFrame {
    
    public CadastroPessoa() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        comboTipoActionPerformed(null);
    }
    
    public void limparCamposAutor() {
        textNomeAutor.setText("");
        textDataNascimento.setText("");
        textAreaBiografia.setText("");                
    }
    
    public void limparCamposFuncionario() {
        textNomeFuncionario.setText("");
        textMatricula.setText("");
        textFuncao.setText("");    
        textRua.setText("");
        textNumero.setText("");
        textBairro.setText("");
        textCidade.setText("");
        textEstado.setText("");
    }
    
    private void setEnableCamposFuncionario(boolean b) {
        textNomeFuncionario.setEnabled(b);
        textMatricula.setEnabled(b);
        textFuncao.setEnabled(b);
        textRua.setEnabled(b);
        textNumero.setEnabled(b);
        textBairro.setEnabled(b);
        textCidade.setEnabled(b);
        textEstado.setEnabled(b);
    }
    
    private void setEnableCamposAutor(boolean b) {
        textNomeAutor.setEnabled(b);
        textDataNascimento.setEnabled(b);           
        textAreaBiografia.setEnabled(b);  
    }
    
    private Date setFormatoData(String data) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return new Date(format.parse(data).getTime());
        } catch (ParseException ex) {
            return null;
        }        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCadastroPessoa = new javax.swing.JPanel();
        labelInformacoesFuncionario = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        labelFuncao = new javax.swing.JLabel();
        labelNomeAutor = new javax.swing.JLabel();
        labelDataNascimento = new javax.swing.JLabel();
        labelBiografia = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox();
        textMatricula = new javax.swing.JTextField();
        textFuncao = new javax.swing.JTextField();
        textNomeAutor = new javax.swing.JTextField();
        textDataNascimento = new javax.swing.JFormattedTextField();
        scrollPanelBiografia = new javax.swing.JScrollPane();
        textAreaBiografia = new javax.swing.JTextArea();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        separador2 = new javax.swing.JSeparator();
        labelRua = new javax.swing.JLabel();
        labelBairro = new javax.swing.JLabel();
        labelCidade = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        textRua = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        textNumero = new javax.swing.JTextField();
        textBairro = new javax.swing.JTextField();
        textCidade = new javax.swing.JTextField();
        textEstado = new javax.swing.JTextField();
        labelInformacoesAutor = new javax.swing.JLabel();
        labelNomeFuncionario = new javax.swing.JLabel();
        textNomeFuncionario = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Autor/Funcionário");

        panelCadastroPessoa.setBackground(new java.awt.Color(204, 204, 204));

        labelInformacoesFuncionario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelInformacoesFuncionario.setText("Informações do Funcionário");

        labelTipo.setText("Tipo");

        labelMatricula.setText("Matrícula");

        labelFuncao.setText("Função");

        labelNomeAutor.setText("Nome");

        labelDataNascimento.setText("Data de Nascimento");

        labelBiografia.setText("Biografia");

        comboTipo.setBackground(new java.awt.Color(231, 228, 231));
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Autor", "Funcionário" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        try {
            textDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        textAreaBiografia.setColumns(20);
        textAreaBiografia.setRows(5);
        scrollPanelBiografia.setViewportView(textAreaBiografia);

        btSalvar.setBackground(new java.awt.Color(231, 228, 231));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Disk.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
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

        labelRua.setText("Rua");

        labelBairro.setText("Bairro");

        labelCidade.setText("Cidade");

        labelEstado.setText("Estado");

        labelNumero.setText("Nº");

        labelInformacoesAutor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelInformacoesAutor.setText("Informações do Autor");

        labelNomeFuncionario.setText("Nome");

        javax.swing.GroupLayout panelCadastroPessoaLayout = new javax.swing.GroupLayout(panelCadastroPessoa);
        panelCadastroPessoa.setLayout(panelCadastroPessoaLayout);
        panelCadastroPessoaLayout.setHorizontalGroup(
            panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separador2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                        .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPanelBiografia, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                                .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                                        .addComponent(labelNomeAutor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelDataNascimento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                                        .addComponent(labelTipo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelBiografia))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroPessoaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar)
                        .addGap(104, 104, 104))
                    .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                        .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                                .addComponent(labelBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textEstado))
                            .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                                .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelInformacoesAutor)
                                    .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                                        .addComponent(labelNomeFuncionario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                                        .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroPessoaLayout.createSequentialGroup()
                                                .addComponent(labelRua)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textRua))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroPessoaLayout.createSequentialGroup()
                                                .addComponent(labelMatricula)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(labelFuncao)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelInformacoesFuncionario))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
            .addComponent(separador1)
        );
        panelCadastroPessoaLayout.setVerticalGroup(
            panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipo)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(labelInformacoesFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeFuncionario)
                    .addComponent(textNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatricula)
                    .addComponent(textMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFuncao)
                    .addComponent(textFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRua)
                    .addComponent(textRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNumero)
                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBairro)
                    .addComponent(textBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCidade)
                    .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEstado)
                    .addComponent(textEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelInformacoesAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeAutor)
                    .addComponent(textNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(10, 10, 10))
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
        String nomeAutor = textNomeAutor.getText().trim();
        String nomeFuncionario = textNomeFuncionario.getText().trim();
        
        if(!nomeAutor.isEmpty() || !nomeFuncionario.isEmpty()) {
            if(comboTipo.getSelectedIndex() == 0) {
                Date data = setFormatoData(textDataNascimento.getText().trim());
                String dataNascimento = textDataNascimento.getText().trim();
                String biografia = textAreaBiografia.getText().trim();

                if(dataNascimento.isEmpty() || data == null || biografia.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Informe todos os campos ou verifique se a data está correta!", "Atenção", JOptionPane.WARNING_MESSAGE);
                }
                else {                                 
                    Autor autor = new Autor(data, biografia, nomeAutor);               

                    if(dao.salvar(autor)) {
                        JOptionPane.showMessageDialog(this, "Autor cadastrado com sucesso");
                        limparCamposAutor();
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Erro!");
                    }
                }       
            }
            else {            
                String matricula = textMatricula.getText().trim();
                String funcao = textFuncao.getText().trim();
                String rua = textRua.getText().trim();
                String numero = textNumero.getText().trim();
                String bairro = textBairro.getText().trim();
                String cidade = textCidade.getText().trim();
                String estado = textEstado.getText().trim();

                if(matricula.isEmpty() || funcao.isEmpty() || rua.isEmpty() || numero.isEmpty() ||
                        bairro.isEmpty() || cidade.isEmpty() || estado.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Informe todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
                }
                else {                    
                    List<Funcionario> funcionarios = dao.buscarTodos(Funcionario.class);
                    boolean exist = false;
                    
                    for (Funcionario funcionario : funcionarios) {                        
                        if(funcionario.getMatricula().equals(matricula)) {                            
                            exist = true;
                            break;
                        }
                    }
                    Endereco endereco = new Endereco(rua, numero, bairro, cidade, estado);                    
                    Funcionario funcionario = new Funcionario(matricula, funcao, nomeFuncionario, endereco);
                    
                    if(!exist) {
                        if(dao.salvar(funcionario)) {
                            JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso");
                            limparCamposFuncionario();
                        }
                        else {
                            JOptionPane.showMessageDialog(this, "Erro!");
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Matrícula já cadastrada no sistema!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Informe todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        if(comboTipo.getSelectedIndex() == 0) {
            limparCamposFuncionario();           
            setEnableCamposFuncionario(false);           
            setEnableCamposAutor(true);
        }
        else {
            limparCamposAutor();
            setEnableCamposAutor(false);           
            setEnableCamposFuncionario(true);
        }
    }//GEN-LAST:event_comboTipoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelBiografia;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelFuncao;
    private javax.swing.JLabel labelInformacoesAutor;
    private javax.swing.JLabel labelInformacoesFuncionario;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNomeAutor;
    private javax.swing.JLabel labelNomeFuncionario;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelRua;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JPanel panelCadastroPessoa;
    private javax.swing.JScrollPane scrollPanelBiografia;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JTextArea textAreaBiografia;
    private javax.swing.JTextField textBairro;
    private javax.swing.JTextField textCidade;
    private javax.swing.JFormattedTextField textDataNascimento;
    private javax.swing.JTextField textEstado;
    private javax.swing.JTextField textFuncao;
    private javax.swing.JTextField textMatricula;
    private javax.swing.JTextField textNomeAutor;
    private javax.swing.JTextField textNomeFuncionario;
    private javax.swing.JTextField textNumero;
    private javax.swing.JTextField textRua;
    // End of variables declaration//GEN-END:variables
}