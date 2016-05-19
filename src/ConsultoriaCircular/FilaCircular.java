package ConsultoriaCircular;

import javax.swing.JOptionPane;

import ConsultoriaCircular.PessoaCircular;

public class FilaCircular {

    private PessoaCircular fim;

    public FilaCircular() {
        this.fim = null;
    }
    
    public boolean vazia(){
        return fim == null;
    }
    
    public void enfileirar(PessoaCircular pessoa){
        if(vazia()){
            fim = pessoa;
            pessoa.setProximo(fim);
        }else{
            pessoa.setProximo(fim.getProximo());
            fim.setProximo(pessoa);
            fim = pessoa;
        }
    }
    
    public PessoaCircular desenfileirar(){
        if(vazia()){
            return null;
        }else{
            PessoaCircular aux;
            if(fim == fim.getProximo()){
                aux = fim;
                fim = null;
            }else{
                aux = fim.getProximo();
                fim.setProximo(aux.getProximo());
            }
            aux.setProximo(null);
            return aux;
        }
    }

    public String imprimir() {
        if(vazia()){
            JOptionPane.showMessageDialog(null, "A lista está vazia.");
            return null;
        }else{
            String pessoas = "";
            PessoaCircular aux = fim.getProximo();
            while(aux != fim){
                pessoas += aux+"\n";
                aux = aux.getProximo();
            }
            pessoas += fim+"\n";
            return pessoas;
        }
    }

    public PessoaCircular retornaPessoaDoInicioDaFila() {
        if(vazia()){
            JOptionPane.showMessageDialog(null, "A lista está vazia.");
            return null;
        } else {
            return fim.getProximo();
        }
    }

    public int tamanhoDaFila() {
        if(vazia()){
            return 0;
        }else{
            int cont = 0;
            PessoaCircular aux = fim.getProximo();
            while(aux != fim){
                cont++;
                aux = aux.getProximo();
            }
            cont++;
            return cont;
        }
    }
    
    
}
