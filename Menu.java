import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class Menu {
    Cliente Cliente;
    ArrayList<Livro> listaLivros;
    Menu(Cliente cliente, ArrayList<Livro> listaLivros){
        this.Cliente = cliente;
        this.listaLivros = listaLivros;
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
                CadastroLivro cadastrolivre = new CadastroLivro(modelo, listaLivros);
                cadastrolivre.CriarCadastroLivro();
            }
        });
        btnExcluir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Excluir");
                int linha = tabela.getSelectedRow();
                modelo.removeRow(linha);
                listaLivros.remove(linha);
                System.out.println(listaLivros.size());
            }
        });
        btnEditar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Editar");
                int linhaeditar = tabela.getSelectedRow();
                Editarlinha editarlinha = new Editarlinha(modelo, listaLivros, linhaeditar);
                editarlinha.CriarEditarLinha();
            }
        });
        btnBuscar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Buscar");
                menu.setLayout(null);
                JTextField tfBusca = new JTextField();
                JButton btnBusca = new JButton("Confirmar");
                tfBusca.setBounds(450,0,320,30);
                btnBusca.setBounds(770,0,130,30);
                menu.add(tfBusca);
                menu.add(btnBusca);
                menu.revalidate(); // recalcula o layout
                menu.repaint();    // redesenha a tela
                
                btnBusca.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        modelo.setRowCount(0); // limpa a tabela
                        String busca = tfBusca.getText().toLowerCase();
                        for(Livro livro : listaLivros){
                            if(livro.getTitulo().toLowerCase().contains(busca) || livro.getAutor().toLowerCase().contains(busca)){
                                modelo.addRow(new Object[]{
                                    livro.getTitulo(),
                                    livro.getAutor(),
                                    livro.getAno(),
                                    livro.getPaginas(),
                                    livro.getStatus()
                                });
                            }
                        }
                    }
                });
            }
        });
    }
}
