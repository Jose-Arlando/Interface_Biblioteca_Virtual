import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class CadastroLivro {
    ArrayList<Livro> listaLivros;
    DefaultTableModel modelo;
    CadastroLivro(DefaultTableModel modelo, ArrayList<Livro> listaLivros){
        this.modelo = modelo;
        this.listaLivros = listaLivros;
    }
    void CriarCadastroLivro(){
        JFrame cadastrarLivro = new JFrame("Cadastro de livro");
        JLabel lbtitulo = new JLabel("Titulo:");
        JLabel lbautor = new JLabel("Autor:");
        // JLabel lbstatus = new JLabel("Status:");
        JLabel lbano = new JLabel("Ano:");
        JLabel lbpaginas = new JLabel("Páginas:");
        JTextField tftitulo = new JTextField();
        JTextField tfautor = new JTextField();
        // JTextField tfstatus = new JTextField();
        JTextField tfano = new JTextField();
        JTextField tfpaginas = new JTextField();
        JRadioButton rbtlivre = new JRadioButton("Livre");
        JRadioButton rbtemprestado = new JRadioButton("Emprestado");
        JButton btncadastrar = new JButton("Cadastrar");

        ButtonGroup bgstatus = new ButtonGroup();
        bgstatus.add(rbtlivre);
        bgstatus.add(rbtemprestado);

        cadastrarLivro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadastrarLivro.setBounds(400, 220, 400, 500);
        cadastrarLivro.setLayout(null);
        lbtitulo.setBounds(50, 50, 80, 20);
        tftitulo.setBounds(50, 70, 200, 20);
        lbautor.setBounds(50, 100, 80, 20);
        tfautor.setBounds(50, 120, 200, 20);
        lbano.setBounds(50, 200, 80, 20);
        tfano.setBounds(50, 220, 200, 20);
        lbpaginas.setBounds(50, 250, 80, 20);
        tfpaginas.setBounds(50, 270, 200, 20);
        rbtlivre.setBounds(50, 300, 100, 20);
        rbtemprestado.setBounds(150, 300, 100, 20);
        btncadastrar.setBounds(50, 350, 100, 30);

        //VISÍVEL
        cadastrarLivro.setVisible(true);
        cadastrarLivro.add(lbtitulo);
        cadastrarLivro.add(tftitulo);
        cadastrarLivro.add(lbautor);
        cadastrarLivro.add(tfautor);
        cadastrarLivro.add(lbano);
        cadastrarLivro.add(tfano);
        cadastrarLivro.add(lbpaginas);
        cadastrarLivro.add(tfpaginas);
        cadastrarLivro.add(rbtlivre);
        cadastrarLivro.add(rbtemprestado);
        cadastrarLivro.add(btncadastrar);

        btncadastrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                // System.out.println(modelo.getRowCount());
                // System.out.println(listaLivros);
                System.out.println("Cadastrar iniciado");
                String titulo = tftitulo.getText();
                String autor = tfautor.getText();
                // String status = bgstatus.getSelection().getActionCommand();
                String status = "";
                String ano = tfano.getText();
                String paginas = tfpaginas.getText();
                if(rbtlivre.isSelected()){
                    status = "Livre";
                } else if(rbtemprestado.isSelected()){
                    status = "Emprestado";
                } else {
                    status = "Não definido"; 
                }
                Livro livro = new Livro(titulo, autor, ano, paginas, status);
                System.out.println(listaLivros == null);
                listaLivros.add(livro);

                System.out.println("Lista: " + listaLivros.size());

                modelo.addRow(new Object[]{
                    tftitulo.getText(),
                    tfautor.getText(),
                    tfano.getText(),
                    tfpaginas.getText(),
                    status
                });

                System.out.println("Tabela: " + modelo.getRowCount());
                
                cadastrarLivro.dispose();
            }
        });
    }
}
