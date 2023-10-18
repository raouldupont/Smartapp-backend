package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

  private static final String PERSISTENCE_UNIT_NAME = "testJPA";

  public static void main(String[] args) {

    System.out.println("== START ==");
    EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    EntityManager em = null;
    try {
      em = factory.createEntityManager();
      System.out.println("== Verbindung OK ==");

      System.out.println("\n== Lieferanten lesen mit NamedQuery ==");
      List<Lieferant> lieferanten = em.createNamedQuery("Lieferant.findAll", Lieferant.class).getResultList();
      for (Lieferant x : lieferanten)
        System.out.println(x);

      System.out.println("\n== Lieferanten lesen mit DirectQuery ==");
      lieferanten = em.createQuery("SELECT l FROM Lieferant l ORDER BY l.name", Lieferant.class).getResultList();
      for (Lieferant x : lieferanten)
        System.out.println(x);

    } catch (Exception ex) {
      System.err.println("Es gab ein Problem: " + ex);
    } finally { // erforderlich, da: "EntityManager does not implement java.lang.AutoCloseable"
      if (em != null)
        em.close();
    }
    System.out.println("== FERTIG ==\n");
  }
}
