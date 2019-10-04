package cn.guoy10.emc;

import cn.OberonEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Write {
    public void write(List<OberonEntity> oberons){
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = null;

        for(int i=0;i<oberons.size();i++){
            try {
                session = sessionFactory.openSession();
                session.beginTransaction();
                session.merge(oberons.get(i));
                session.getTransaction().commit();
            }catch (Exception e){
                e.printStackTrace();
                session.getTransaction().rollback();
            }
        }
        if(session!=null) {
            if (session.isOpen()) {
                session.close();
            }
        }
    }
}
