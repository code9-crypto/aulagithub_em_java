public class Exemplo2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,5,10,7);
        System.out.println("Fazendo somatória com o método reduce() e atribuindo o valor a uma variável");
        //OBS.: numa conta, o 1º parâmetro deve ser o elemento neutro da conta para que possa fazer o calcúlo normalmente
		int sum = list.stream().reduce(0, (x,y) -> x + y);
		System.out.println("Sum = " + sum);
		System.out.println();
    }
}