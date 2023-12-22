package Vetor;

import javax.swing.JOptionPane;

public class Aula03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        try{
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            vetor.adiciona("elemento 4");
            vetor.adiciona("elemento 5");

            System.out.println(vetor.getTamanho());

            System.out.println(vetor);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Esquece isso ae kk");
        }
    }
}
