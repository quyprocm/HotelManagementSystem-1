package dao;


import model.Room;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

public abstract class AbstractDAO<T, K> {

    Session session = null;

    public List<T> findAll(Class<T> clazz) {

        try {
            session = HibernateUtils.getSessionFactory().openSession();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<T> query = builder.createQuery(clazz);
            Root<T> root = query.from(clazz);
            return session.createQuery(query).getResultList();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;

    }

    public boolean save(T entity) {

        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.getTransaction().begin();
            Serializable result = session.save(entity);
            session.getTransaction().commit();
            return (result != null);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return false;

    }

    public boolean update(T entity) {

        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.getTransaction().begin();
            session.update(entity);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return false;

    }

    public boolean delete(T entity) {

        try {
            session = HibernateUtils.getSessionFactory().openSession();
            session.getTransaction().begin();
            session.delete(entity);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return false;

    }

    public T findById(Class<T> clazz, K object) {

        try {
            session = HibernateUtils.getSessionFactory().openSession();
            return session.find(clazz, object);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;

    }
    public String findByName(Class<T> clazz, K String) {

        try {
            session = HibernateUtils.getSessionFactory().openSession();
            return (java.lang.String) session.get(clazz, (Serializable) String);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return null;

    }
    public List<Room> search(String name) {

        try{
            session = HibernateUtils.getSessionFactory().openSession();
//            SELECT * FROM dbo.Room j WHERE j.name LIKE :name
            Query<Room> query = session.createNativeQuery("SELECT * FROM dbo.Room WHERE name like "+name).addEntity(Room.class);
            return session.createNativeQuery();
        }finally {
            if(session != null){
                session.close();
            }
        }
    }

}
