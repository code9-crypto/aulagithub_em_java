package service;

import java.util.ArrayList;
import java.util.List;

//Esta classe está sendo usada por todas as classes que a chamar
//Por isso está sendo usado generics, pois esta classes genérica, será tipada pela classe que a chamar
public class Service<T> {
	
	List<T> list = new ArrayList<>();
	
	//Adicionando infos
	public void addValue(T value) {
		list.add(value);		
	}
	
	//Exibindo infos
	public void exibirInfos() {
		list.forEach(System.out::println);
	}

}
