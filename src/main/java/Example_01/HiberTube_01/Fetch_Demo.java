package Example_01.HiberTube_01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch_Demo {
		public static void main(String[] args) {
			
			Configuration cfg = new Configuration();
			cfg.configure("Hiber.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();
			
			Session session =  factory.openSession();
//			//get-student id 
//			Student1 student1 = (Student1)session.get(Student1.class, 1);
//			System.out.println(student1 + student1.getName() );
//			
//			Student1 student2 = (Student1)session.get(Student1.class, 1);
//			System.out.println(student2 + student2.getName() );
			
			Address1 ad = (Address1)session.load(Address1.class, 1);
			System.out.println(ad.getName()+ ": " + ad.getCity());
			
			Address1 ad1 = (Address1)session.load(Address1.class, 1);
			System.out.println(ad1.getName()+ ": " + ad1.getCity());
			
			session.close();
			factory.close();
		}
}
