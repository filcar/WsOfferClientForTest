package gr.myoffers.ws.wsoffrer.dao;

import gr.myoffers.ws.wsoffrer.model.Offer;
import gr.myoffers.ws.wsoffrer.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author fil
 */
public class OfferDao {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public Offer getOfferById(int id) {
        Offer offer = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            offer = (Offer)session.createQuery("from  Offer p where p.id=:ID").setParameter("ID",id).uniqueResult();
            session.getTransaction().commit();

        } 
        catch (Exception ex) {
            if (session != null) {
                session.getTransaction().rollback();
            }

        } 
        finally {
            if (session != null) {
                session.close();
            }
        }

        return offer;

    }

     public List<Offer> getAllOffers() {
        List<Offer> offers = null;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            offers = session.createQuery("from Offer p").list();
            session.getTransaction().commit();

        } 
        catch (Exception ex) {
            if (session != null) {
                session.getTransaction().rollback();
            }

        } 
        finally {
            if (session != null) {
                session.close();
            }
        }

        return offers;

    }
       
    
    
}


