package Pratica_vetor;

public class Main_nomes {
    public static void main(String[] args) {
        Nomes nomes = new Nomes(5);
        try {
            nomes.adiciona("Kauan");
            nomes.adiciona("Kaique");
            nomes.adiciona("Valeria");
            nomes.adiciona("Dudu");
            nomes.adiciona("Duda");
            nomes.adiciona("Luana");
            nomes.adiciona("Kadu");
        } catch (Exception e) {
            System.out.println("Deu ruim");
        }

    }
}
