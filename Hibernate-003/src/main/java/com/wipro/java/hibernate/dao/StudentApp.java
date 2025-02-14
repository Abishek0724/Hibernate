package com.wipro.java.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.wipro.java.hibernate.entities.Student;
import com.wipro.java.hibernate.utilities.HibernateUtil;

public class StudentApp {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Student student = new Student("swetha", 116);
        Student student1 = new Student("Abi", 126);
        Student student2 = new Student("Kavi", 131);
        session.save(student);
        session.save(student1);
        session.save(student2);

        transaction.commit();
        session.close();
        System.out.println("Student record inserted successfully!");
    }
}