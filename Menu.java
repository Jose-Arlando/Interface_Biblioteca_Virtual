import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class Menu {
    Cliente Cliente;
    Menu(Cliente cliente){
        this.Cliente = cliente;
    }
    public void CriarMenu(){
        //CRIAR
        JFrame menu = new JFrame("Menu");
        JButton btnAddlivro = new JButton("Adicionar");
        JButton btnBuscar = new JButton("Buscar");
        JButton btnEditar = new JButton("Editar");
        JButton btnExcluir = new JButton("Excluir");
        String[] colunas = {"Titulo", "Autor", "Ano", "Paginas", "Status"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        JTable tabela = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabela);
        //EDITAR
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setBounds(400, 220, 900, 500);
        menu.setLayout(null);
        btnAddlivro.setBounds(0, 0, 112, 30);
        btnExcluir.setBounds(112, 0, 112, 30);
        btnEditar.setBounds(224, 0, 112, 30);
        btnBuscar.setBounds(336, 0, 112, 30);
        scroll.setBounds(0, 30, 900, 470);
        //TORNAR VISÍVEL
        menu.setVisible(true);
        menu.add(btnAddlivro);
        menu.add(btnBuscar);
        menu.add(btnEditar);
        menu.add(btnExcluir);
        menu.add(scroll);

        //EVENTOS
        btnAddlivro.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Adicionar");
            }
        });
        btnExcluir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Excluir");
            }
        });
        btnEditar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Editar");
            }
        });
        btnBuscar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Buscar");
            }
        });
    }
}
