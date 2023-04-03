package com.practice.ProjectWithMaven;




import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
   
	public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
//        
        	Configuration config = new Configuration();

        	
            config.configure("/com/practice/ProjectWithMaven/hibernate.cfg.xml");
            
            
            SessionFactory sessionfactory = config.buildSessionFactory();
    	
   
            
            
            Student std=  new Student();
            std.setId(02);
            std.setName("Ronaldo");
            std.setAddress("Portugal");
            std.setPhoneNumber("9836524342");
            
           Session session=sessionfactory.openSession();  
          
          Transaction txt = session.beginTransaction();
          
          
          session.save(std);
          txt.commit();
          
          session.close();
            
            
            
       
        
        
        
        
        
        
    }
}
