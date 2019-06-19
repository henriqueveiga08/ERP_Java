package poo.trabalho.model;

public class Cliente {

    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private int idCliente;
    private String cep;
    private String celular;
    private String telefone;
    private String email;

    public Cliente() {
    }

    public Cliente(String nome, String endereco, String bairro, String cidade,
            int idCliente, String cep, String celular, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.idCliente = idCliente;
        this.cep = cep;
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return idCliente+" "+nome+" "+endereco+" "+bairro+" "+cidade+" "+idCliente+" "+cep+" "+celular+" "+
                telefone + " " + email;
    }                       

    public int getIdCliente() {
        return idCliente;
    }

    public String getEmail() {
        return email;
    }

}

