public class App {
    public static void main(String[] args) throws Exception {

        Dado dado = new Dado(6);

        int[] numeros = new int[3];

        int soma = 0;

        for (int i = 0; i < 3; i++) {
            numeros[i] = dado.sortear();
        }

        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("Os numeros sorteados são: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
        System.out.println("A soma é: " + soma);
    }

}
