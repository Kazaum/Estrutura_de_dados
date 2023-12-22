package Vetor;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vetor {
    //Vetor de string
    private String[] elementos;
    private int tamanho;


    //Seleciona a quantidade de elementos que teremos em nosso vetor
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }


    //Adiciona um elemento no vetor
    /*
        public void adiciona(String elemento){
            for (int i=0; i<this.elementos.length; i++){
                if(this.elementos[i] == null){
                    this.elementos[i] = elemento;
                    break;
                }
            }
        }
    */

    /*
        public void adiciona(String elemento){
            if (this.tamanho < this.elementos.length){
                this.elementos[this.tamanho] = elemento;
                this.tamanho++;
            }else{
                JOptionPane.showMessageDialog(null,"Vetor já está cheio.");
            }
        }
    */

    public boolean adiciona(String elemento){
            if (this.tamanho < this.elementos.length){
                this.elementos[this.tamanho] = elemento;
                this.tamanho++;
                return true;
            }
            return false;
        }

        //Recebe o tamanho do vetor
        public int getTamanho(){
            return this.tamanho;
        }

        //Printar os valores existentes no tamanho real do vetor
        public String toString(){
            StringBuilder s = new StringBuilder();
            s.append("[");

            for (int i=0; i<this.tamanho-1; i++){
                s.append(this.elementos[i]);
                s.append(", ");
            }

            if (this.tamanho>0) {
                s.append(this.elementos[this.tamanho-1]);            
            }
            s.append("]");
            return s.toString();
        }
}
