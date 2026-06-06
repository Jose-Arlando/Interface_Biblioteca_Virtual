import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Editarlinha {
    ArrayList<Livro> listaLivros;
    DefaultTableModel modelo;
    int linhaeditar;

    Editarlinha(DefaultTableModel modelo, ArrayList<Livro> listaLivros, int linhaeditar) {
        this.modelo = modelo;
        this.listaLivros = listaLivros;
        this.linhaeditar = linhaeditar;
    }

    void CriarEditarLinha(){
        JFrame editarlinha = new JFrame("Editar Livro");
        JLabel lbtitulo = new JLabel("Titulo:");
        JLabel lbautor = new JLabel("Autor:");
        JLabel lbano = new JLabel("Ano:");
        JLabel lbpaginas = new JLabel("Páginas:");
        JTextField tftitulo = new JTextField(listaLivros.get(linhaeditar).getTitulo());
        JTextField tfautor = new JTextField(listaLivros.get(linhaeditar).getAutor());
        JTextField tfano = new JTextField(String.valueOf(listaLivros.get(linhaeditar).getAno()));
        JTextField tfpaginas = new JTextField(String.valueOf(listaLivros.get(linhaeditar).getPaginas()));
        JRadioButton rbtlivre = new JRadioButton("Livre");
        JRadioButton rbtemprestado = new JRadioButton("Emprestado");
        JButton btnsalvar = new JButton("Salvar");

        ButtonGroup bgstatus = new ButtonGroup();
        bgstatus.add(rbtlivre);
        bgstatus.add(rbtemprestado);

        editarlinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        editarlinha.setBounds(400, 220, 400, 500);
        editarlinha.setLayout(null);
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
        btnsalvar.setBounds(50, 350, 100, 30);
        //VISÍVEL
        editarlinha.setVisible(true);
        editarlinha.add(lbtitulo);
        editarlinha.add(tftitulo);
        editarlinha.add(lbautor);
        editarlinha.add(tfautor);
        editarlinha.add(lbano);
        editarlinha.add(tfano);
        editarlinha.add(lbpaginas);
        editarlinha.add(tfpaginas);
        editarlinha.add(rbtlivre);
        editarlinha.add(rbtemprestado);
        editarlinha.add(btnsalvar);

        //EVENTO
        btnsalvar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                editarlinha.dispose();
                System.out.println("Salvar");
                listaLivros.get(linhaeditar).setTitulo(tftitulo.getText());
                listaLivros.get(linhaeditar).setAutor(tfautor.getText());
                listaLivros.get(linhaeditar).setAno(tfano.getText());
                listaLivros.get(linhaeditar).setPaginas(tfpaginas.getText());
                listaLivros.get(linhaeditar).setStatus(rbtlivre.isSelected() ? "Livre" : "Emprestado");
                modelo.setValueAt(tftitulo.getText(), linhaeditar, 0);
                modelo.setValueAt(tfautor.getText(), linhaeditar, 1);
                modelo.setValueAt(tfano.getText(), linhaeditar, 2);
                modelo.setValueAt(tfpaginas.getText(), linhaeditar, 3);
                modelo.setValueAt(listaLivros.get(linhaeditar).getStatus(), linhaeditar, 4);
            }
        });
    }
}
