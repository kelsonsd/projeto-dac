package br.edu.ifpb.dac.frames.cadastros;

import br.edu.ifpb.dac.entidades.Autor;
import br.edu.ifpb.dac.entidades.Edicao;
import br.edu.ifpb.dac.entidades.LivroFiccao;
import br.edu.ifpb.dac.entidades.LivroTecnico;
import br.edu.ifpb.dac.persistencia.DAO;
import br.edu.ifpb.dac.persistencia.DaoJPA;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author kelsonsd
 */

public class CadastroLivro extends javax.swing.JFrame {    
    private final DAO dao;    
    private DefaultListModel<Autor> listModelAutores;
    private DefaultListModel<Edicao> listModelEdicoes;    
        
    public CadastroLivro() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        dao = new DaoJPA("projeto-dac");
        carregaCombos();        
        setModel();    
    }  
    
    private void carregaCombos() {
        comboTipoActionPerformed(null);        
        comboAutorMouseClicked(null);        
    }
    
    private void setModel() {
        listModelAutores = new DefaultListModel<>();
        listAutores.setModel(listModelAutores);
        
        listModelEdicoes = new DefaultListModel<>();
        listEdicoes.setModel(listModelEdicoes);
    }
    
    private List<Autor> getAutoresSelecionados() {
        List<Autor> listaAutoresSelecionados = new ArrayList<>();        
        DefaultListModel<Autor> modelAux = (DefaultListModel<Autor>) listAutores.getModel();
        
        for (int i = 0; i < modelAux.size(); i++) {
            Autor autor = modelAux.getElementAt(i);
            listaAutoresSelecionados.add(autor);
        }
        return listaAutoresSelecionados;
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
        textTitulo.setText("");
        textIdioma.setText("");
        textGenero.setText("");
        textAreaAtuacao.setText("");
        textAnoLivro.setText("");
        
        comboTipo.setSelectedIndex(-1);        
        comboAutor.setSelectedIndex(-1);        
        
        listModelAutores.removeAllElements();
        listModelEdicoes.removeAllElements();        
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
        btAdicionarAutor = new javax.swing.JButton();
        btRemoverAutor = new javax.swing.JButton();
        textGenero = new javax.swing.JTextField();
        textIdioma = new javax.swing.JTextField();
        textTitulo = new javax.swing.JTextField();
        textAreaAtuacao = new javax.swing.JTextField();
        textAnoLivro = new javax.swing.JTextField();
        btNovoAutor = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btNovaEdicao = new javax.swing.JButton();
        labelEdicao = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox();
        scrollPaneAutor = new javax.swing.JScrollPane();
        listAutores = new javax.swing.JList();
        scrollPaneEdicao = new javax.swing.JScrollPane();
        listEdicoes = new javax.swing.JList();
        btRemoverEdicao = new javax.swing.JButton();

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

        comboAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboAutorMouseClicked(evt);
            }
        });

        btAdicionarAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Bullet-Add.png"))); // NOI18N
        btAdicionarAutor.setText("Adicionar");
        btAdicionarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarAutorActionPerformed(evt);
            }
        });

        btRemoverAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Bullet-Delete.png"))); // NOI18N
        btRemoverAutor.setText("Remover");
        btRemoverAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverAutorActionPerformed(evt);
            }
        });

        btNovoAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Bullet-Add.png"))); // NOI18N
        btNovoAutor.setText("Novo Autor");
        btNovoAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoAutorActionPerformed(evt);
            }
        });

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

        btNovaEdicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Bullet-Add.png"))); // NOI18N
        btNovaEdicao.setText("Nova Edição");
        btNovaEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaEdicaoActionPerformed(evt);
            }
        });

        labelEdicao.setText("Edição");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ficção", "Técnico" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        scrollPaneAutor.setViewportView(listAutores);

        scrollPaneEdicao.setViewportView(listEdicoes);

        btRemoverEdicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Bullet-Delete.png"))); // NOI18N
        btRemoverEdicao.setText("Remover");
        btRemoverEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverEdicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCadastroLivroLayout = new javax.swing.GroupLayout(panelCadastroLivro);
        panelCadastroLivro.setLayout(panelCadastroLivroLayout);
        panelCadastroLivroLayout.setHorizontalGroup(
            panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLivroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addGap(18, 18, 18)
                .addComponent(btCancelar)
                .addGap(77, 77, 77))
            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroLivroLayout.createSequentialGroup()
                        .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroLivroLayout.createSequentialGroup()
                                        .addComponent(labelEdicao)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroLivroLayout.createSequentialGroup()
                                        .addComponent(labelAutor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboAutor, 0, 227, Short.MAX_VALUE))))
                            .addComponent(scrollPaneAutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAdicionarAutor)
                            .addComponent(btRemoverAutor)))
                    .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                .addComponent(labelGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelAreaAtuacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAreaAtuacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelAnoLivro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAnoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                        .addComponent(labelTipo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labeIinformacoesLivro))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                .addComponent(labelTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelIdioma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                        .addComponent(btNovoAutor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                .addComponent(btNovaEdicao)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                                .addComponent(scrollPaneEdicao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btRemoverEdicao)))))
                .addContainerGap())
        );
        panelCadastroLivroLayout.setVerticalGroup(
            panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeIinformacoesLivro)
                .addGap(15, 15, 15)
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipo)
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
                    .addComponent(btAdicionarAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btRemoverAutor)
                    .addComponent(scrollPaneAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNovoAutor)
                .addGap(18, 18, 18)
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCadastroLivroLayout.createSequentialGroup()
                        .addComponent(labelEdicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPaneEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btRemoverEdicao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNovaEdicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelCadastroLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar))
                .addContainerGap())
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

    private void btRemoverEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverEdicaoActionPerformed
        if(listEdicoes.getSelectedIndex() != -1) {
            listModelEdicoes.remove(listEdicoes.getSelectedIndex());
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverEdicaoActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        if(comboTipo.getSelectedIndex() == 0) {
            textAreaAtuacao.setText("");
            textAreaAtuacao.setEnabled(false);

            textGenero.setEnabled(true);
        }
        else {
            textGenero.setText("");
            textGenero.setEnabled(false);

            textAreaAtuacao.setEnabled(true);
        }
    }//GEN-LAST:event_comboTipoActionPerformed

    private void btNovaEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaEdicaoActionPerformed
        new CadastroEdicao(listModelEdicoes).setVisible(true);
    }//GEN-LAST:event_btNovaEdicaoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        String titulo = textTitulo.getText().trim();
        String idioma = textIdioma.getText().trim();
        int anoPublicacao = 0;
        String genero = textGenero.getText().trim();
        String areaAtuacao = textAreaAtuacao.getText().trim();
        
        List<Autor> autores = getAutoresSelecionados();
        List<Edicao> edicoes = getEdicoesSelecionadas();        
        
        if(!textAnoLivro.getText().isEmpty()) {
            anoPublicacao = Integer.parseInt(textAnoLivro.getText().trim());
        }

        if(titulo.isEmpty() || idioma.isEmpty() || anoPublicacao == 0 || listModelAutores.isEmpty() || listModelEdicoes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else {
            if(comboTipo.getSelectedIndex() == 0) {
                if(!genero.isEmpty()) {
                    LivroFiccao livroFiccao = new LivroFiccao(titulo, idioma, anoPublicacao, genero);                    
                    livroFiccao.setListaAutores(autores);
                    livroFiccao.setListaEdicoes(edicoes);                    
                    
                    if(dao.salvar(livroFiccao)) {
                        JOptionPane.showMessageDialog(this, "Livro Ficção cadastrado com sucesso!");
                        limparCampos();
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Erro!");
                    }
                }
            }
            else {
                if(!areaAtuacao.isEmpty()) {
                    LivroTecnico livroTecnico = new LivroTecnico(titulo, idioma, anoPublicacao, areaAtuacao);                    
                    livroTecnico.setListaAutores(autores);
                    livroTecnico.setListaEdicoes(edicoes);                    
                    
                    if(dao.salvar(livroTecnico)) {
                        JOptionPane.showMessageDialog(this, "Livro Técnico cadastrado com sucesso!");
                        limparCampos();
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Erro!");
                    }
                }
            }                
        }    
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btNovoAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoAutorActionPerformed
        new CadastroPessoa().setVisible(true);
    }//GEN-LAST:event_btNovoAutorActionPerformed

    private void btRemoverAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverAutorActionPerformed
        if(listAutores.getSelectedIndex() != -1) {
            listModelAutores.remove(listAutores.getSelectedIndex());
        }
        else {
            JOptionPane.showMessageDialog(this, "Nenhum item selecionado!", "Atenção!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btRemoverAutorActionPerformed

    private void btAdicionarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarAutorActionPerformed
        if(comboAutor.getSelectedIndex() != -1) {
            Autor autorSelecionado = (Autor) comboAutor.getSelectedItem();
            if(listModelAutores.isEmpty()) {
                listModelAutores.addElement(autorSelecionado);
            }
            else if(!listModelAutores.contains(autorSelecionado)) {
                listModelAutores.addElement(autorSelecionado);
            }
            else {
                JOptionPane.showMessageDialog(this, "Este autor já está adicionado na lista!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btAdicionarAutorActionPerformed

    private void comboAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboAutorMouseClicked
        List<Autor> autores = dao.buscarTodos(Autor.class);
        comboAutor.removeAllItems();

        for (Autor autor : autores) {
            comboAutor.addItem(autor);
        }
    }//GEN-LAST:event_comboAutorMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarAutor;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovaEdicao;
    private javax.swing.JButton btNovoAutor;
    private javax.swing.JButton btRemoverAutor;
    private javax.swing.JButton btRemoverEdicao;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox comboAutor;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JLabel labeIinformacoesLivro;
    private javax.swing.JLabel labelAnoLivro;
    private javax.swing.JLabel labelAreaAtuacao;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelEdicao;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelIdioma;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JList listAutores;
    private javax.swing.JList listEdicoes;
    private javax.swing.JPanel panelCadastroLivro;
    private javax.swing.JScrollPane scrollPaneAutor;
    private javax.swing.JScrollPane scrollPaneEdicao;
    private javax.swing.JTextField textAnoLivro;
    private javax.swing.JTextField textAreaAtuacao;
    private javax.swing.JTextField textGenero;
    private javax.swing.JTextField textIdioma;
    private javax.swing.JTextField textTitulo;
    // End of variables declaration//GEN-END:variables
}