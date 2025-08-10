package repo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import entity.PanDemo2;

public class PanRepo {

	public static void updatePan()
	{
		Scanner ev=new Scanner(System.in);
		System.out.println("Please enter pan id");
    	int id= ev.nextInt();
    	System.out.println("Please enter pan holder name");
    	String holderName= ev.next();
    	System.out.println("Please enter pan holder fathers language");
    	String fathersName= ev.next();
    	PanDemo2 pd= new PanDemo2(id,holderName,fathersName);
    	save(pd);
    }
	public static void createpan() {
		Scanner ev=new Scanner(System.in);
		System.out.println("Please enter pan id");
    	int id= ev.nextInt();
    	System.out.println("Please enter pan holder name");
    	String holderName= ev.next();
    	System.out.println("Please enter pan holder fathers language");
    	String fathersName= ev.next();
    	PanDemo2 pd= new PanDemo2(id,holderName,fathersName);
    	save(pd);
	}

 static void save(PanDemo2 pd) {
	 Session session= HibernateUtil1.getSessionFactory().getCurrentSession();
 	 Transaction transaction=session.beginTransaction();
 	 if(pd.getId()!=0) {
 		 PanDemo2 pd1=findById(pd.getId());
 		 pd1.setFathersName(pd.getFathersName());
 		 pd1.setHolderName(pd.getHolderName());
 	 }
 	 else {
 		 session.persist(pd);
 	 }
 	transaction.commit(); 
	 
		
	}
 static PanDemo2 findById(int id) {
	 Session session= HibernateUtil1.getSessionFactory().getCurrentSession();
 	Transaction transaction=session.beginTransaction();
 	PanDemo2 pd=session.find(PanDemo2.class, id);
 	return pd;
}
  static PanDemo2 deleteById(int id)
 {
  	Session session= HibernateUtil1.getSessionFactory().getCurrentSession();
 	Transaction transaction=session.beginTransaction();
 	PanDemo2 pd=session.find(PanDemo2.class, id);
 	return pd;
	}
  public static List<PanDemo2> findAll()
  {
  	Session session= HibernateUtil1.getSessionFactory().getCurrentSession();
  	Transaction transaction=session.beginTransaction();
  	String hqlQuery="from PanDemo2 ";
  	Query query=session.createQuery(hqlQuery);
	List<PanDemo2> list=query.list();
	return list;
}
}



