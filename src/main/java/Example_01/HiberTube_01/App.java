package Example_01.HiberTube_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException 
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        cfg.configure("Hiber.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
      
//        
       Student1 s = new Student1();   
        s.setId(12);
        s.setName("Amol");
        s.setCity("Pune");
        System.out.println(s);
        
        Address1 ad = new Address1();
        ad.setName("Bipin");   
        ad.setStreet("Street_4");
        ad.setCity("Nashik");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.45);
        
        //image insertion
        FileInputStream fis = new FileInputStream("src/main/java/Motivation.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(s);
        session.save(ad);
        session.getTransaction().commit();
        session.clear();
        
        
    }
}
