public class exempForArray {
    public static void main(String[] args) {

        // em arrays o indice inicia em zero
       String nomes [] = {"ZEKA", "HENRIQUE", "TULIO", "SUELI"};

       for (int x=0; x < nomes.length; x++){
            System.out.println("Nome no indice x= " + x +  " é " + nomes[x]);
 
       }

       System.out.println("________________________________________________");

       // aplicando foreach
       for (String nome: nomes){
            System.out.println("O nome do aluno é: " + nome);

       }
 
    }

}
