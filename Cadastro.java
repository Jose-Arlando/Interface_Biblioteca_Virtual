import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.*;


public class Cadastro { 
    ArrayList<Cliente> listaClientes;
    JFrame telaanterior;
    Cadastro(ArrayList<Cliente> listaClientes, JFrame telaanterior){
        this.listaClientes = listaClientes;
        this.telaanterior = telaanterior;
    }

    Cadastro(){}

    public void CriarTelaCadastro(){

        //CRIAR
        JFrame telaCadastro = new JFrame("Tela Cadastro");
        JLabel lbNome= new JLabel("Nome:  ");
        JLabel lbCpf= new JLabel("CPF:");
        JLabel lbEmail= new JLabel("Email:");
        JLabel lbTelefone= new JLabel("Telefone:");
        JLabel lbEndereco= new JLabel("Endereço:");
        JLabel lbSenha= new JLabel("Senha:");
        JLabel lbConfirmarsenha= new JLabel("Confirmar Senha:");
        JRadioButton rbMasculino = new JRadioButton("Masculino");
        JRadioButton rbFeminino = new JRadioButton("Feminino");
        ButtonGroup bgGenero = new ButtonGroup();
        bgGenero.add(rbMasculino);
        bgGenero.add(rbFeminino);
        JTextField tfNome = new JTextField();
        JTextField tfCpf = new JTextField();
        JTextField tfEmail = new JTextField();
        JTextField tfTelefone = new JTextField();
        JTextField tfEndereco = new JTextField();
        JPasswordField pfSenha = new JPasswordField();
        JPasswordField pfConfirmarSenha = new JPasswordField();
        JButton btnCadastrar = new JButton("CADASTRAR");
        JButton btnVoltar = new JButton("VOLTAR");
        
        //EDITAR
        telaCadastro.setBounds(500, 20, 300, 500);
        telaCadastro.setLayout(null);
        lbNome.setBounds(50, 50, 80, 20);
        tfNome.setBounds(50, 70, 200, 20);
        lbCpf.setBounds(50, 100, 80, 20);
        tfCpf.setBounds(50, 120, 200, 20);
        lbEmail.setBounds(50, 150, 80, 20);
        tfEmail.setBounds(50, 170, 200, 20);
        lbTelefone.setBounds(50, 200, 80, 20); 
        tfTelefone.setBounds(50, 220, 200, 20);
        lbEndereco.setBounds(50, 250, 80, 20);
        tfEndereco.setBounds(50, 270, 200, 20);
        lbSenha.setBounds(50, 300, 80, 20);
        pfSenha.setBounds(50, 320, 200, 20);
        lbConfirmarsenha.setBounds(50, 350, 120, 20);
        pfConfirmarSenha.setBounds(50, 370, 200, 20);
        rbMasculino.setBounds(50, 400, 100, 20);
        rbFeminino.setBounds(150, 400, 100, 20);
        btnCadastrar.setBounds(95, 430, 110, 20);
        btnVoltar.setBounds(100, 20, 100, 20);
        
        //TORNAR VISÍVEL
        telaCadastro.setVisible(true);
        telaCadastro.add(lbNome);
        telaCadastro.add(tfNome);
        telaCadastro.add(lbCpf);
        telaCadastro.add(tfCpf);
        telaCadastro.add(lbEmail);
        telaCadastro.add(tfEmail);
        telaCadastro.add(lbTelefone);
        telaCadastro.add(tfTelefone);
        telaCadastro.add(lbEndereco);
        telaCadastro.add(tfEndereco);
        telaCadastro.add(lbSenha);
        telaCadastro.add(pfSenha);
        telaCadastro.add(lbConfirmarsenha);
        telaCadastro.add(pfConfirmarSenha);
        telaCadastro.add(rbFeminino);
        telaCadastro.add(rbMasculino);
        telaCadastro.add(btnCadastrar);
        telaCadastro.add(btnVoltar);

        btnVoltar.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            telaCadastro.dispose();
            telaanterior.setVisible(true);
        }
    });

    btnCadastrar.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            Cliente c = new Cliente(tfNome.getText(), tfCpf.getText(), tfTelefone.getText(), tfEmail.getText(), tfEndereco.getText(), String.valueOf(pfSenha.getPassword()), rbMasculino.isSelected() ? "Masculino" : "Feminino");
            listaClientes.add(c);
            
            for(Cliente cliente: listaClientes){
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
                System.out.println("Telefone: " + cliente.getTelefone());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println("Endereço: " + cliente.getEndereco());
                System.out.println("Senha: " + cliente.getSenha());
                System.out.println("Gênero: " + cliente.getGenero());
                System.out.println("-----------------------------");
            }
            
        }
    });
    }
}
