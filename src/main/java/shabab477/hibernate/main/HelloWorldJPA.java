package shabab477.hibernate.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
        message.setText("Hello Dhaka");
        entityManager.persist(message);

        transaction.commit();

        entityManager.close();
    }
}
