import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


class Primeira {
    public static void main (String[] args){
        //CRIAR
        JFrame primeira = new JFrame("Primeira Interface");
        JLabel lbbiblioteca = new JLabel("BEM-VINDO A BIBLIOTECA!");
        JLabel lbdescricao = new JLabel("Aqui você podera organizar seus livros da melhor forma possivel!");
        JButton btnentrar = new JButton("ENTRAR");
        //CONFIGURAR
        primeira.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        primeira.setBounds(500, 220, 500, 500);
        primeira.setLayout(null);
        primeira.setBackground(java.awt.Color.BLUE);
        lbbiblioteca.setBounds(115, 100, 270, 30);
        lbbiblioteca.setFont(new java.awt.Font("Arial", 1, 20));
        lbdescricao.setBounds(65, 140, 370, 30);
        btnentrar.setBounds(205, 350, 90, 30);
        //TORNAR VISÍVEL
        primeira.setVisible(true);
        primeira.add(lbbiblioteca);
        primeira.add(lbdescricao);
        primeira.add(btnentrar);

        btnentrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Clicado");
                primeira.dispose(); //ESSA TELA SOME QUANDO CLICO NO BOTÃO.
                Entrar entrar = new Entrar();
                entrar.CriarTelaEntrar();
            } 
        });
    }
}