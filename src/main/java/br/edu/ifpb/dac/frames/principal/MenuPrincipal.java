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

        panel.setToolTipText("");

        data.setText("Data:");

        labelCentroMenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCentroMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCentroMenuPrincipal.setText("LIVRARIA LER BEM");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(labelCentroMenuPrincipal)
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(data)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(labelCentroMenuPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(data)
                .addContainerGap())
        );

        menuCadastrar.setText("Cadastrar");

        cadastroLivro.setText("Livro");
        cadastroLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroLivroActionPerformed(evt);
            }
        });
        menuCadastrar.add(cadastroLivro);

        cadastroPessoa.setText("Autor/Funcionário");
        cadastroPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroPessoaActionPerformed(evt);
            }
        });
        menuCadastrar.add(cadastroPessoa);

        cadastroEditora.setText("Editora");
        cadastroEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroEditoraActionPerformed(evt);
            }
        });
        menuCadastrar.add(cadastroEditora);

        menuBar.add(menuCadastrar);

        menuListar.setText("Listar");

        listaLivros.setText("Livros");
        listaLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaLivrosActionPerformed(evt);
            }
        });
        menuListar.add(listaLivros);

        listaAutores.setText("Autores");
        listaAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAutoresActionPerformed(evt);
            }
        });
        menuListar.add(listaAutores);

        listaEditoras.setText("Editoras");
        listaEditoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEditorasActionPerformed(evt);
            }
        });
        menuListar.add(listaEditoras);

        listaVendas.setText("Vendas");
        listaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaVendasActionPerformed(evt);
            }
        });
        menuListar.add(listaVendas);

        listaFuncionarios.setText("Funcionários");
        listaFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaFuncionariosActionPerformed(evt);
            }
        });
        menuListar.add(listaFuncionarios);

        menuBar.add(menuListar);

        menuVender.setText("Vender");

        efetuaVenda.setText("Efetuar Venda");
        efetuaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efetuaVendaActionPerformed(evt);
            }
        });
        menuVender.add(efetuaVenda);

        menuBar.add(menuVender);

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

    private void cadastroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroLivroActionPerformed
        new CadastroLivro().setVisible(true);     
    }//GEN-LAST:event_cadastroLivroActionPerformed

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
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuListar;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuVender;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}