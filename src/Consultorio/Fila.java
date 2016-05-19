package Consultorio;

import javax.swing.JOptionPane;

public class Fila {

    private Paciente inicio;
    private Paciente fim;
    
    public boolean vazia() {
        return inicio == null;
    }

    // enfileirar 
    public void enfileirar(Paciente paciente) {

        if (vazia()) {
            inicio = paciente;
        } else {
            fim.setProximo(paciente);
        }
        fim = paciente;
    }

    // desenfileirar
    public Paciente desenfileirar() {

        if (vazia()) {
            return null;
        }

        Paciente retorno = inicio;
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.getProximo();
            retorno.setProximo(inicio);
        }
        return retorno;
    }

    // primeiro paciente
    public Paciente primPaciente() {
        return inicio;
    }

    // qtd de pacientes
    public int qtdPacientes() {

        int cont = 0;
        Paciente aux = inicio;
        while (aux != null) {
            cont++;
            aux = aux.getProximo();
        }

        return cont;
    }

    // mostrar pacientes
    public void mostrarPacientes() {

        String dados = "";
        
        Paciente aux = inicio;
        while (aux != null) {
        dados = dados+"\n"+aux;
            aux = aux.getProximo();
        }
        JOptionPane.showMessageDialog(null, "Pacientes na fila: "+dados);
    }
    public int tamanhoDaFila(){
        int cont = 0;
        Paciente aux = inicio;
        while(aux != null){
            cont++;   
            aux = aux.getProximo();
        }
        return cont;
    }
    
    

}
