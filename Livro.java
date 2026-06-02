class Livro{
    private String titulo;
    private String autor;
    private String status;
    private String ano;
    private String paginas;

    public Livro(String titulo, String autor, String ano, String paginas, String status ){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.paginas = paginas;
        this.status = status;
    }
    public Livro(){}

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getStatus(){
        return status;
    }
    public String getAno(){
        return ano;
    }
    public String getPaginas(){
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
    public void setAno(String ano){
        this.ano = ano;
    }
    public void setPaginas(String paginas){
        this.paginas = paginas;
    }
}