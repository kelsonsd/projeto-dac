package br.edu.ifpb.dac.frames.atualizacoes;

import br.edu.ifpb.dac.entidades.Funcionario;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */

public class AtualizarFuncionario extends javax.swing.JFrame {
    private final Funcionario funcionario;
    
    public AtualizarFuncionario(Funcionario funcionario) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        this.funcionario = funcionario;
        preencheCampos();
    }
    
    private void preencheCampos() {
        textNome.setText(funcionario.getNome());
        textMatricula.setText(funcionario.getMatricula());
        textFuncao.setText(funcionario.getFuncao());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAtualizarFuncionario = new javax.swing.JPanel();
        labelInformacoesFuncionario = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        labelFuncao = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        textMatricula = new javax.swing.JTextField();
        textFuncao = new javax.swing.JTextField();
        textNome = new javax.swing.JTextField();
        btAtualizar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelInformacoesFuncionario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelInformacoesFuncionario.setText("Informações do Funcionário");

        labelMatricula.setText("Matrícula");

        labelFuncao.setText("Função");

        labelNome.setText("Nome");

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Accept.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancel.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAtualizarFuncionarioLayout = new javax.swing.GroupLayout(panelAtualizarFuncionario);
        panelAtualizarFuncionario.setLayout(panelAtualizarFuncionarioLayout);
        panelAtualizarFuncionarioLayout.setHorizontalGroup(
            panelAtualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtualizarFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAtualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAtualizarFuncionarioLayout.createSequentialGroup()
                        .addComponent(labelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelInformacoesFuncionario)
                    .addGroup(panelAtualizarFuncionarioLayout.createSequentialGroup()
                        .addComponent(labelMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelFuncao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAtualizarFuncionarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAtualizar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addGap(42, 42, 42))
        );
        panelAtualizarFuncionarioLayout.setVerticalGroup(
            panelAtualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtualizarFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInformacoesFuncionario)
                .addGap(18, 18, 18)
                .addGroup(panelAtualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAtualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatricula)
                    .addComponent(textMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFuncao)
                    .addComponent(textFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelAtualizarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar)
                    .addComponent(btCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAtualizarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAtualizarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        DAO dao = new DaoJPA("projeto-dac");
        String nome = textNome.getText().trim();
        String matricula = textMatricula.getText().trim();
        String funcao = textFuncao.getText().trim();

        if (nome.isEmpty() || matricula.isEmpty() || funcao.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            funcionario.setNome(nome);
            funcionario.setMatricula(matricula);
            funcionario.setFuncao(funcao);

            if (dao.atualizar(funcionario)) {
                JOptionPane.showMessageDialog(this, "Funcionário atualizado com sucesso");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Erro!");
            }
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JLabel labelFuncao;
    private javax.swing.JLabel labelInformacoesFuncionario;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNome;
    private javax.swing.JPanel panelAtualizarFuncionario;
    private javax.swing.JTextField textFuncao;
    private javax.swing.JTextField textMatricula;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}