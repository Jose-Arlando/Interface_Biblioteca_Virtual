import javax.swing.*;
import javax.swing.event.*;

public class Entrar {
    public void CriarTelaEntrar(){
        //CRIAR
        JFrame entrar = new JFrame("Tela de Login");
        JLabel lblogin = new JLabel("Login");
        JLabel lbusuario = new JLabel("Usuário");
        JTextField tfusuario = new JTextField();
        JLabel lbsenha = new JLabel("Senha");
        JPasswordField pfsenha = new JPasswordField();
        JButton btnconfirmar = new JButton("CONFIRMAR");
        JButton btncadastrar = new JButton("CADASTRAR");


        //EDITAR
        entrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        entrar.setBounds(500, 220, 500, 500);
        entrar.setLayout(null);
        lblogin.setBounds(205, 70, 90, 40);
        lblogin.setFont(new java.awt.Font("Arial", 1, 30));
        lbusuario.setBounds(228, 170, 44, 20);
        tfusuario.setBounds(150, 190, 200, 30);
        lbsenha.setBounds(228, 250, 44, 20);
        pfsenha.setBounds(150, 270, 200, 30);
        btnconfirmar.setBounds(70, 370, 110, 30);
        btncadastrar.setBounds(320, 370, 110, 30);

        //TORNAR VISÍVEL
        entrar.setVisible(true);
        entrar.add(lblogin);
        entrar.add(lbusuario);
        entrar.add(tfusuario);
        entrar.add(lbsenha);
        entrar.add(pfsenha);
        entrar.add(btnconfirmar);
        entrar.add(btncadastrar);
    }
}
