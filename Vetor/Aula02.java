package Vetor;

//Adicionar elemento final do vetor

import javax.swing.JOptionPane;

public class Aula02 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        try{
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            vetor.adiciona("elemento 4");
            vetor.adiciona("elemento 5");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Esquece isso ae kk");
        }

        System.out.println();
    }
}
