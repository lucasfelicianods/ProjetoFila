package Consultorio;

import javax.swing.JOptionPane;

/**
 * @author Lucas
 */
public class Teste {

    public static void main(String[] args) {
        String menu = String.format(""
                + "1 - Incluir paciente\n"
                + "2 - Proximo paciente a ser chamado\n"
                + "3 - Fila de pacientes\n"
                + "4 - Chamar proximo\n"
                + "5 - Quantidade de pacientes\n"
                + "0 - Sair"
        );

        Fila fila = new Fila();
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    fila.enfileirar(
                            new Paciente(
                                    JOptionPane.showInputDialog("Nome: "),
                                    Long.parseLong(JOptionPane.showInputDialog("CPF: ")),
                                    Integer.parseInt(JOptionPane.showInputDialog("Fone: ")),
                                    JOptionPane.showInputDialog("Email: ")
                            ));
                    break;

                case 2:
                    if (fila.vazia()) {
                        JOptionPane.showMessageDialog(null, "A fila está vazia!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Próximo:\n" + fila.primPaciente());
                    }
                    break;

                case 3:
                    if (fila.vazia()) {
                        JOptionPane.showMessageDialog(null, "A fila está vazia!");
                    } else {
                        fila.mostrarPacientes();
                    }
                    break;

                case 4:
                    if (fila.vazia()) {
                        JOptionPane.showMessageDialog(null, "A fila está vazia!");
                    } else {
                        JOptionPane.showMessageDialog(null, fila.desenfileirar());
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, fila.tamanhoDaFila() + " paciente(s) na fila.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Incorreta!");
                    break;
            }
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        }
    }

}
