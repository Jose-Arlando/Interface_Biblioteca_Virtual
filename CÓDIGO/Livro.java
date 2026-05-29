public class Livro{
    private String titulo;
    private String autor;
    private String status;
    private int ano;
    private int paginas;

    public Livro(String titulo, String autor, String status, int ano, int paginas ){
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
        this.ano = ano;
        this.paginas = paginas;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getStatus(){
        return status;
    }
    public int getAno(){
        return ano;
    }
    public int getPaginas(){
        return paginas;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
}