import javax.swing.*;
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
        lbbiblioteca.setBounds(170, 50, 160, 30);
        lbbiblioteca.setFont(new java.awt.Font("Arial", 1, 30));
        lbdescricao.setBounds(65, 90, 370, 30);
        btnentrar.setBounds(210, 350, 100, 30);
        //TORNAR VISÍVEL
        primeira.setVisible(true);
        primeira.add(lbbiblioteca);
        primeira.add(lbdescricao);
        primeira.add(btnentrar);
    }
}