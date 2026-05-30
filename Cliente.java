class Cliente{
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;
    private String senha;
    private String genero;

    public Cliente(String nome, String cpf, String telefone, String email, String endereco, String senha, String genero){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.senha = senha;
        this.genero = genero;
    }

    //MÉTODOS GET
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getEmail(){
        return email;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getSenha(){
        return senha;
    }
    public String getGenero(){
        return genero;
    }

    //MÉTODOS SET
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
}