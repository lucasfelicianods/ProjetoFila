package Consultorio;

/**
 * @author Lucas
 */
public class Paciente {
    
    private String nome;
    private long cpf;
    private int fone;
    private String email;
    private Paciente proximo;  
  

    public Paciente(String nome, long cpf, int fone, String email){
        
        this.nome = nome;
        this.cpf = cpf;
        this.fone = fone;
        this.email = email;
        proximo = null;
    }
    
    public Paciente(){
        
    }
    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public long getCpf() {return cpf;}

    public void setCpf(long cpf) {this.cpf = cpf;}

    public int getFone() {return fone;}

    public void setFone(int fone) {this.fone = fone;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public Paciente getProximo() {return proximo;}

    public void setProximo(Paciente proximo) {this.proximo = proximo;}
    
    public String toString(){
        
        return String.format("nome %s, cpf %09d-%02d, fone %d, email %s", nome, cpf/100,cpf%100, fone, email);
    }
    
}
