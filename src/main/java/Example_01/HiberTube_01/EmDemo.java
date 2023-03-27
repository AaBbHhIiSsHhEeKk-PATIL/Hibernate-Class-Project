package Example_01.HiberTube_01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("Hiber.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        
        
        Student1 student2 = new Student1();
        student2.setId(101);
        student2.setName("Kunal");
        student2.setCity("Nashik");
        
        Certificate certificate = new Certificate();
        certificate.setCourse("Java");
        certificate.setDuration("4 months");
        
        student2.setCerti(certificate);
        
//        Student1 student3 = new Student1();
//        student3.setId(1);
//        student3.setName("Abhishek");
//        student3.setCity("Nashik");
        
        Certificate certificate1 = new Certificate();
        certificate1.setCourse("EE");
        certificate1.setDuration("3 months");
        
        student2.setCerti(certificate1);
        
        Session session = factory.openSession();
        
        session.beginTransaction();
        session.getTransaction().commit();
        //object save
        session.save(student2);
//      session.save(student3);
        session.close();
        factory.close();
	}
}
