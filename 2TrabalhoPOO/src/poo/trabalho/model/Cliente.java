package poo.trabalho.model;

public class Cliente {
    
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private int cod;
    private int cep;
    private int celular;
    private int telefone;

    //data cadastro e de aniversario + email(@)

    public Cliente() {
    }

    public Cliente(String nome, String endereco, String bairro, String cidade, String estado, int cod, int cep, int celular, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cod = cod;
        this.cep = cep;
        this.celular = celular;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
