package com.map.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("Hiber.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is java?");
		
		Answer answer = new Answer();
		answer.setAnswerId(343);
		answer.setAnswer("java is programming language");
		answer.setQuestion(q1);
		q1.setAnswer(answer);
		
		
		Question q2 = new Question();
		q2.setQuestionId(242);
		q2.setQuestion("What is Collection?");
		
		
		Answer answer1 = new Answer();
		answer1.setAnswerId(344);
		answer1.setAnswer("API to work with object in java");
		answer1.setQuestion(q2);
		q2.setAnswer(answer1);
		
		
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(q1);
		session.save(q2);
		session.save(answer);
		session.save(answer1);
		
		tx.commit();
		
//		feching
//		Question newQ =(Question)session.get(Question.class, 1212);
//		System.out.println(newQ.getQuestion());
//		System.out.println(newQ.getAnswer().getAnswer());
		session.close();
		factory.close();

	}

}
