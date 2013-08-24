package demoJPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import demoJPA.Todo;

public class Main {
  private static final String PERSISTENCE_UNIT_NAME = "demoJPA";
  private static EntityManagerFactory factory;

  public static void main(String[] args) {
    //factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	factory = Persistence.createEntityManagerFactory("demoJPA");
    EntityManager em = factory.createEntityManager();
    // Read the existing entries and write to console
    Query q = em.createQuery("select t from Todo t");
    List<Todo> todoList = q.getResultList();
    for (Todo todo : todoList) {
      System.out.println(todo);
    }
    System.out.println("Size: " + todoList.size());

    // Create new todo
    em.getTransaction().begin();
    Todo todo = new Todo();
    todo.setSummary("This is a test");
    todo.setDescription("This is a test");
    em.persist(todo);
    em.getTransaction().commit();

    em.close();
  }
} 