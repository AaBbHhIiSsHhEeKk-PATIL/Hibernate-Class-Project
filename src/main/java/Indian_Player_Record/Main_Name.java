package Indian_Player_Record;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main_Name {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("Hiber.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		Player_Record pr = new Player_Record();
		pr.setMatches(107);
		pr.setRun(1963);
		pr.setCentury(0);
		pr.setHalfCentury(8);
		
		PlayerName pn = new PlayerName();
		pn.setMatch(100);
		pn.setName("Hardik Pandya");
		
		pr.setPlayername(pn);
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(pr);
		session.save(pn);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
