package ConsultoriaCircular;

public class PessoaCircular {

    private String nome;

    private long cpf;

    private long telefone;

    private PessoaCircular proximo;

    public PessoaCircular(){
        
    }
    
    public PessoaCircular(String nome, long cpf, long telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public PessoaCircular getProximo() {
        return proximo;
    }

    public void setProximo(PessoaCircular proximo) {
        this.proximo = proximo;
    }

    public String toString(){
        return String.format(""
                + "Nome: %s | "
                + "Cpf: %09d-%02d | "
                + "Telefone: %d"
                , nome
                , cpf/100
                , cpf%100
                , telefone
                );
    }
}