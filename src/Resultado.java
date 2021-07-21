public class Resultado {

    private int[] numeros;

    public Resultado(int[] numeros) {
        this.numeros = numeros;
    }

    public void mostrarNumeros() {
        System.out.print("Os numeros sorteados são: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
        System.out.println("\nA soma é: " + somar());
    }

    public int somar() {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

}
