package com.js.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.js.dao.LoginDAO;
import com.js.dto.Login;

public class LoginDAOImpl implements LoginDAO{

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public String loginVerify(Login login) throws Exception {
		String res = "error";
		Session session = null;
		try{
			System.out.println("DAOImpl : "+login);
			session= sessionFactory.openSession();
			Query query = session.createQuery("from com.js.dto.Login where userName =? and password=?");
			query.setString(0,login.getUserName());
			query.setString(1,login.getPassword());
			List <Login>list = query.list();
			if(list!=null && !list.isEmpty()){
				res = list.get(0).getLevel();
			}
		}finally{
			if(session!=null){
				session.close();
			}
		}
		return res;
	}
	
}
