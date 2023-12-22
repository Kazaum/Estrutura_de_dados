package Pratica_vetor;

public class Nomes {
    private String[] nomes;
    private int tamanho;

    public Nomes(int capacidade) {
        this.nomes = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String nome){
        if (this.tamanho < this.nomes.length){
            this.nomes[this.tamanho] = nome;
            this.tamanho++;
            return true;
        }
        return false;

        
    }
}
