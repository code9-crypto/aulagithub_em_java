package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		//O EntityManagerFactory carrega as configurações com o banco de dados
		//OBS.: o valor da persistence-unite vem do arquivo persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		//EntityManager utiliza os comandos as quais farão as interações no banco
		EntityManager em = emf.createEntityManager();
		
		//Método find é usado para recuperar os dados no banco
		//semelhante ao select
		Pessoa p = em.find(Pessoa.class, 1);
		Pessoa p2 = em.find(Pessoa.class, 4);
		//Pessoa p = new Pessoa(null, "Hadassa Caetano de Souza", "hadassa@gmail.com");
		
		//Para remover um registro do banco de dados, ela precisa estar de forma monitorada
		//ou seja, acabou de ser inserida ou acabou de ser pesquisada
		//Como a operação é diferente de consulta, então deve-se usar o transaction
		//em.getTransaction().begin();
		//em.remove(p);
		//em.persist(p);
		//em.getTransaction().commit();
		System.out.println("Mãe: " + p );
		System.out.println("Filha: " + p2 );
		
		//Quando for iniciar uma ação no banco diferente de leitura
		//usa-se uma transação para iniciar
		/*em.getTransaction().begin();
		//este método persiste() para salvar os dados no banco
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();*/
		//E usa-se outra para finalizar a transação
		System.out.println("Pronto");
		em.close();
		emf.close();

	}

}
