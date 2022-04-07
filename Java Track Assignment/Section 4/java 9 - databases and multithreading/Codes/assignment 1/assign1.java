package Product4.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.net.URL;
import java.util.List;

public class assign1 {
    private static SessionFactory factory;

    public static void main(String args[]) throws Exception {
        setUp();

        URL file_path = Main.class.getClassLoader().getResource("customers.json");
        JSONProcessor jsonProcessor = new JSONProcessor(file_path.getPath());
        List<Customer> customer = jsonProcessor.parseFile();

        customer.forEach(Main::addCustomer);
    }

    private static void setUp() {
        factory = new Configuration()
                .addAnnotatedClass(Customer.class)
                .configure()
                .buildSessionFactory();
    }

    private static Integer addCustomer(Customer customer) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Integer customerId = (Integer) session.save(customer);
        tx.commit();

        return customerId;
    }
}
