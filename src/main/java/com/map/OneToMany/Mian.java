package com.map.OneToMany;

	import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

	

	public class Mian {

		public static void main(String[] args) {
			Configuration cfg = new Configuration();
			cfg.configure("com/map/OneToMany/Hiber.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();
			
			Question q1 = new Question();
			q1.setQuestionId(1212);
			q1.setQuestion("What is java?");
			
			Answer answer = new Answer();
			answer.setAnswerId(343);
			answer.setAnswer("java is programming language");
			answer.setQuestion(q1);
			
			
			Answer answer1 = new Answer();
			answer1.setAnswerId(33);
			answer1.setAnswer("With the help of java we can create software");
			answer1.setQuestion(q1);
			
			Answer answer2 = new Answer();
			answer2.setAnswerId(35);
			answer2.setAnswer("java has different types of framework");
			answer2.setQuestion(q1);
			
			List<Answer> list = new ArrayList<Answer>();
			list.add(answer);
			list.add(answer1);
			list.add(answer2);
			
			q1.setAnswers(list);
			
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			
			session.save(q1);
			
			tx.commit();
			
//			feching
//			Question newQ =(Question)session.get(Question.class, 1212);
//			System.out.println(newQ.getQuestion());
//			System.out.println(newQ.getAnswer().getAnswer());
			session.close();
			factory.close();

		}

	}



