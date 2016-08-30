package com.niit.dao;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.User;
import com.niit.model.UserRole;



@Repository("userDAO")
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	private User user;
	private Session session;

	public UserDAOImpl() {
		System.out.println("UserDAOImpl --One");
	}

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	
	}

    @Transactional
	public List<User> list() {
    	List<User> listUser = (List<User>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
	}

	@Transactional
	public User get(int uid) {
		String hql = "from User where uid=" + "'"+ uid +"'";
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) query.list();
		
		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		return null;
	}
/*
	@Transactional
	public void saveOrUpdate(User user) {
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
		UserRole role=new UserRole();
		role.setUser_role_id(user.getUid());
		role.setAuthority("ROLE_USER");
		session.save(role);
		System.out.println("In userDAOImpl");
		t.commit();

	}*/
	@Transactional
	public void saveOrUpdate(User user) {
	Session session=sessionFactory.getCurrentSession();
	Transaction tx=session.beginTransaction();
	user.setEnabled(true);
	System.out.println("user id"+user.getUid());
	session.save(user);
	UserRole userRole=new UserRole();
	userRole.setUser_role_id(user.getUid());
	userRole.setAuthority("ROLE_USER");
	session.save(userRole);
	System.out.println("Done saving user");
	tx.commit();
	}

	@Transactional
	public void delete(int uid) {
		User user=new User();
		user.setUid(uid);
		sessionFactory.getCurrentSession().delete(user);	
		
	}
	
	public List<User> viewUser() {
		Session session= sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<User>list= session.createCriteria(User.class).list();
		return list;
	}

	
	@Transactional
	public User getUserByName(String uname) {
		System.out.println("getting data in dao based on name");
		Session session=this.sessionFactory.getCurrentSession();
		User user=(User) session.get(User.class,uname);
		System.out.println("data of user by name="+user);
		return user;	


	}

	@Transactional
     public boolean isValidCredentials(String user,Boolean isAdmin, String pass) {
		
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();
		String hql = "from User where uid= '" + user + "' and upassword = '" + pass + "'";
		//String hql = "from User where uid= '" + user + "' and " + " upassword ='" + pass+"'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		List list = q.list();
		System.out.println("userDAOIMPL");
		t.commit();
		
		
		
		if(list == null || list.isEmpty())
		{
			return false;
		}
		
		else
		{
			return true;
		}
		
		
		
	}

	

}
