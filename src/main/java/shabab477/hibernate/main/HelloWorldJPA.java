package shabab477.hibernate.main;

import shabab477.hibernate.domain.Message;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author shabab
 * @since 5/22/18
 */
public class HelloWorldJPA {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HelloWorldPU");
        EntityManager entityManager = emf.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Message message = new Message();
        message.setText("Hello World");
        entityManager.persist(message);

        transaction.commit();

        entityManager.close();

    }
}
