package ConsultoriaCircular;

import javax.swing.JOptionPane;

import ConsultoriaCircular.PessoaCircular;
import ConsultoriaCircular.FilaCircular;

public class TesteCircular {
    public static void main(String[] args) {
        String menu = String.format(""
                + "1 - Cadastre um novo Paciente na Fila\n"
                + "2 - Chamar Proximo Paciente\n"
                + "3 - Existe paciente na fila? -- Imprimir Fila\n"
                + "4 - Verificar Proximo Paciente\n"
                + "5 - Quantos pacientes existe na fila?\n"
                + "0 - Sair"
                );

        FilaCircular fila = new FilaCircular();

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
    

        while(opcao != 0){
            switch (opcao) {
            case 1:
                try{
                fila.enfileirar(new PessoaCircular(
                                JOptionPane.showInputDialog("Informe o Nome do Paciente:"), 
                                Long.parseLong(JOptionPane.showInputDialog("Informe o Cpf do Paciente:")),
                               
                                Long.parseLong(JOptionPane.showInputDialog("Informe o Telefone do Paciente:"))
                                ));
                }catch(Exception er){
                    
                }
                break;

            case 2:
                PessoaCircular proximaPessoa = fila.desenfileirar();
                if(proximaPessoa == null){
                    JOptionPane.showMessageDialog(null, "A lista está vazia.");
                }else{
                    JOptionPane.showMessageDialog(null, "Proximo:\n" + proximaPessoa);
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, fila.imprimir());
                break;
            case 4:
                JOptionPane.showMessageDialog(null, fila.retornaPessoaDoInicioDaFila());
                break;
            case 5:
                JOptionPane.showMessageDialog(null, fila.tamanhoDaFila() + " paciente(s) na fila.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção está Incorreta!");
                break;
            }


            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        }


    }
}
