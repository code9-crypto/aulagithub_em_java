public class Exemplo2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		System.out.println("Gerando uma nova lista com os métodos filter() e o map()");
		List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
	}
}