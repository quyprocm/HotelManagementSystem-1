package util;

import model.*;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtils {

    private static final SessionFactory FACTORY;

    static {

        Configuration config = new Configuration();
        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
        properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hotelManagement");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "matkhau1995");
        properties.put(Environment.SHOW_SQL, "true");
        properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        properties.put(Environment.HBM2DDL_AUTO, "update");
        properties.put(Environment.AUTOCOMMIT, "false");

        config.setProperties(properties);
        config.addAnnotatedClass(BookedRoom.class);
        config.addAnnotatedClass(Bill.class);
        config.addAnnotatedClass(Booking.class);
        config.addAnnotatedClass(Client.class);
        config.addAnnotatedClass(Hotel.class);
        config.addAnnotatedClass(Room.class);
        config.addAnnotatedClass(Service.class);
        config.addAnnotatedClass(UsedService.class);
        config.addAnnotatedClass(User.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(config.getProperties()).build();

        FACTORY = config.buildSessionFactory(registry);

    }

    public static SessionFactory getSessionFactory() {
        return FACTORY;
    }

    public static void closeFactory() {
        if (FACTORY != null) {
            try {
                FACTORY.close();
            } catch (HibernateException ignored) {
                ignored.printStackTrace();
            }
        }
    }
}
