package br.edu.ifpb.dac.frames;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


/**
 *
 * @author kelsonsd
 */
public class MenuPrincipal extends javax.swing.JFrame {        
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);        
        
        timer1.start();
        setData();        
    }
    
    private void setData() {
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String dataformatada = formatador.format(data);
        labelData.setText(dataformatada);
    }
    
    private void setHora() {
        Date hora = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
        String horaFormatada = formatador.format(hora);
        labelHora.setText(horaFormatada);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jPanel1 = new javax.swing.JPanel();
        labelData = new javax.swing.JLabel();
        labelHora = new javax.swing.JLabel();
        labelCentroMenuPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        cadastroLivro = new javax.swing.JMenuItem();
        cadastroPessoa = new javax.swing.JMenuItem();
        cadastroEditora = new javax.swing.JMenuItem();
        listaLivros = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        listaPessoas = new javax.swing.JMenuItem();
        listaEditoras = new javax.swing.JMenuItem();
        listaVendas = new javax.swing.JMenuItem();
        menuVender = new javax.swing.JMenu();
        efetuaVenda = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento - Livraria Ler Bem");

        jPanel1.setToolTipText("");

        labelData.setText("Data:");

        labelHora.setText("Hora:");

        labelCentroMenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCentroMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCentroMenuPrincipal.setText("LIVRARIA LER BEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 416, Short.MAX_VALUE)
                .addComponent(labelHora)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(labelCentroMenuPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(labelCentroMenuPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelData)
                    .addComponent(labelHora))
                .addContainerGap())
        );

        menuCadastrar.setText("Cadastrar");

        cadastroLivro.setText("Livro");
        menuCadastrar.add(cadastroLivro);

        cadastroPessoa.setText("Autor/Funcionário");
        menuCadastrar.add(cadastroPessoa);

        cadastroEditora.setText("Editora");
        menuCadastrar.add(cadastroEditora);

        jMenuBar1.add(menuCadastrar);

        listaLivros.setText("Pesquisar");

        jMenuItem5.setText("Livro");
        listaLivros.add(jMenuItem5);

        listaPessoas.setText("Autor/Funcionário");
        listaLivros.add(listaPessoas);

        listaEditoras.setText("Editora");
        listaLivros.add(listaEditoras);

        listaVendas.setText("Venda");
        listaLivros.add(listaVendas);

        jMenuBar1.add(listaLivros);

        menuVender.setText("Vender");

        efetuaVenda.setText("Efetuar Venda");
        menuVender.add(efetuaVenda);

        jMenuBar1.add(menuVender);

        menuSair.setText("Sair");
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        setHora();
    }//GEN-LAST:event_timer1OnTime
    
    public static void main(String args[]) {
        new MenuPrincipal().setVisible(true);        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastroEditora;
    private javax.swing.JMenuItem cadastroLivro;
    private javax.swing.JMenuItem cadastroPessoa;
    private javax.swing.JMenuItem efetuaVenda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCentroMenuPrincipal;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelHora;
    private javax.swing.JMenuItem listaEditoras;
    private javax.swing.JMenu listaLivros;
    private javax.swing.JMenuItem listaPessoas;
    private javax.swing.JMenuItem listaVendas;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuVender;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
}