package br.edu.ifpb.dac.frames.principal;

import br.edu.ifpb.dac.frames.cadastros.CadastroEditora;
import br.edu.ifpb.dac.frames.cadastros.CadastroLivro;
import br.edu.ifpb.dac.frames.cadastros.CadastroPessoa;
import br.edu.ifpb.dac.frames.cadastros.CadastroVenda;
import br.edu.ifpb.dac.frames.listagens.ListarAutores;
import br.edu.ifpb.dac.frames.listagens.ListarEditoras;
import br.edu.ifpb.dac.frames.listagens.ListarFuncionarios;
import br.edu.ifpb.dac.frames.listagens.ListarLivros;
import br.edu.ifpb.dac.frames.listagens.ListarVendas;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author kelsonsd
 */

public class MenuPrincipal extends javax.swing.JFrame {        
            
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);                            
        setData();        
    }    
    
    private void setData() {        
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String dataformatada = formatador.format(new Date());
        data.setText(dataformatada);
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        data = new javax.swing.JLabel();
        labelCentroMenuPrincipal = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        cadastroLivro = new javax.swing.JMenuItem();
        cadastroPessoa = new javax.swing.JMenuItem();
        cadastroEditora = new javax.swing.JMenuItem();
        menuListar = new javax.swing.JMenu();
        listaLivros = new javax.swing.JMenuItem();
        listaAutores = new javax.swing.JMenuItem();
        listaEditoras = new javax.swing.JMenuItem();
        listaVendas = new javax.swing.JMenuItem();
        listaFuncionarios = new javax.swing.JMenuItem();
        menuVender = new javax.swing.JMenu();
        efetuaVenda = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento - Livraria Ler Bem");

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setToolTipText("");

        data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Date.png"))); // NOI18N
        data.setText("Data:");

        labelCentroMenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCentroMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCentroMenuPrincipal.setText("LIVRARIA LER BEM");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Book-Picture.png"))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(data)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCentroMenuPrincipal)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(logo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(184, 184, 184))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(labelCentroMenuPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(data)
                .addContainerGap())
        );

        menuCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add.png"))); // NOI18N
        menuCadastrar.setText("Cadastrar");

        cadastroLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Book-Add.png"))); // NOI18N
        cadastroLivro.setText("Livro");
        cadastroLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroLivroActionPerformed(evt);
            }
        });
        menuCadastrar.add(cadastroLivro);

        cadastroPessoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Group-Add.png"))); // NOI18N
        cadastroPessoa.setText("Autor/Funcionário");
        cadastroPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroPessoaActionPerformed(evt);
            }
        });
        menuCadastrar.add(cadastroPessoa);

        cadastroEditora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Education.png"))); // NOI18N
        cadastroEditora.setText("Editora");
        cadastroEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroEditoraActionPerformed(evt);
            }
        });
        menuCadastrar.add(cadastroEditora);

        menuBar.add(menuCadastrar);

        menuListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Column-One.png"))); // NOI18N
        menuListar.setText("Listar");

        listaLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Books.png"))); // NOI18N
        listaLivros.setText("Livros");
        listaLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaLivrosActionPerformed(evt);
            }
        });
        menuListar.add(listaLivros);

        listaAutores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Group.png"))); // NOI18N
        listaAutores.setText("Autores");
        listaAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAutoresActionPerformed(evt);
            }
        });
        menuListar.add(listaAutores);

        listaEditoras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Education.png"))); // NOI18N
        listaEditoras.setText("Editoras");
        listaEditoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEditorasActionPerformed(evt);
            }
        });
        menuListar.add(listaEditoras);

        listaVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cart.png"))); // NOI18N
        listaVendas.setText("Vendas");
        listaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaVendasActionPerformed(evt);
            }
        });
        menuListar.add(listaVendas);

        listaFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Group.png"))); // NOI18N
        listaFuncionarios.setText("Funcionários");
        listaFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaFuncionariosActionPerformed(evt);
            }
        });
        menuListar.add(listaFuncionarios);

        menuBar.add(menuListar);

        menuVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cart.png"))); // NOI18N
        menuVender.setText("Vender");

        efetuaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Money-Dollar.png"))); // NOI18N
        efetuaVenda.setText("Efetuar Venda");
        efetuaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efetuaVendaActionPerformed(evt);
            }
        });
        menuVender.add(efetuaVenda);

        menuBar.add(menuVender);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Door-Out.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuBar.add(menuSair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroPessoaActionPerformed
        new CadastroPessoa().setVisible(true);
    }//GEN-LAST:event_cadastroPessoaActionPerformed

    private void cadastroEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroEditoraActionPerformed
        new CadastroEditora().setVisible(true);
    }//GEN-LAST:event_cadastroEditoraActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        dispose();
    }//GEN-LAST:event_menuSairMouseClicked

    private void listaLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaLivrosActionPerformed
        new ListarLivros().setVisible(true);
    }//GEN-LAST:event_listaLivrosActionPerformed

    private void listaAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAutoresActionPerformed
        new ListarAutores().setVisible(true);
    }//GEN-LAST:event_listaAutoresActionPerformed

    private void listaEditorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEditorasActionPerformed
        new ListarEditoras().setVisible(true);
    }//GEN-LAST:event_listaEditorasActionPerformed

    private void listaFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaFuncionariosActionPerformed
        new ListarFuncionarios().setVisible(true);
    }//GEN-LAST:event_listaFuncionariosActionPerformed

    private void efetuaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efetuaVendaActionPerformed
        new CadastroVenda().setVisible(true);
    }//GEN-LAST:event_efetuaVendaActionPerformed

    private void listaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaVendasActionPerformed
        new ListarVendas().setVisible(true);
    }//GEN-LAST:event_listaVendasActionPerformed

    private void cadastroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroLivroActionPerformed
        new CadastroLivro().setVisible(true);
    }//GEN-LAST:event_cadastroLivroActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastroEditora;
    private javax.swing.JMenuItem cadastroLivro;
    private javax.swing.JMenuItem cadastroPessoa;
    private javax.swing.JLabel data;
    private javax.swing.JMenuItem efetuaVenda;
    private javax.swing.JLabel labelCentroMenuPrincipal;
    private javax.swing.JMenuItem listaAutores;
    private javax.swing.JMenuItem listaEditoras;
    private javax.swing.JMenuItem listaFuncionarios;
    private javax.swing.JMenuItem listaLivros;
    private javax.swing.JMenuItem listaVendas;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuListar;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuVender;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}