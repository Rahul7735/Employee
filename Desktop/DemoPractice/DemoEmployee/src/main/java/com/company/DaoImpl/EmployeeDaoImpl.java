package com.company.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.company.util.HIbernateUtil;
import com.company.dao.EmployeeDao;
import com.company.domain.Employee;
public class EmployeeDaoImpl implements EmployeeDao  {
		   EmployeeDaoImpl employeeDaoImpl=null;
	  SessionFactory sessionFactory = HIbernateUtil.getSessionFactory();
	 
	 
	 
	 
	 public int saveEmployee(Employee employee){
		 Session session = this.sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	        int id=(Integer) session.save(employee);
	        transaction.commit();
	        session.close();
	        return id;  
	 }




	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(employee);
		transaction.commit();
		session.close();
		
	}




	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.delete(id);
		transaction.commit();
		session.close();
		
	}




	public Employee findEmployeeById(int id) {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.openSession();
		Employee employee=(Employee) session.get(Employee.class, id);
		session.close();
		return employee;
	}



	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		Session session=this.sessionFactory.openSession();
		List<Employee> employeeList=session.createCriteria(Employee.class).list();
		return employeeList;
	}
}
