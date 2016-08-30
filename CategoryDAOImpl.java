package com.niit.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
	
	@Autowired
	private SessionFactory sessionFactory;


	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	
	}

    @Transactional
	public List<Category> list() {
    	List<Category> listCategory = (List<Category>) 
		          sessionFactory.getCurrentSession()
				.createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
	}

	@Transactional
	public Category get(int cid) {
		String hql = "from Category where cid=" + "'"+ cid +"'";
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) query.list();
		
		if (listCategory != null && !listCategory.isEmpty()) {
			return listCategory.get(0);
		}
		return null;
	}

	@Transactional
	public void saveOrUpdate(Category category) {
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();

		sessionFactory.getCurrentSession().saveOrUpdate(category);
		System.out.println("In categoryDAOImpl");
		t.commit();

	}

	@Transactional
	public void delete(int cid) {
		Category category=new Category();
		category.setCid(cid);
		sessionFactory.getCurrentSession().delete(category);		
	}
	
	
	@Transactional
	public Category getCategoryByName(String uname) {
		System.out.println("getting data in dao based on name");
		Session session=this.sessionFactory.getCurrentSession();
		Category category=(Category) session.get(Category.class,uname);
		System.out.println("data of category by name="+category);
		return category;	


	}

	@Transactional
     public boolean isValidCredentials(String category,Boolean isAdmin, String pass) {
		
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();
		String hql = "from Category where cid= '" + category + "' and spassword = '" + pass + "'";
		//String hql = "from Category where cid= '" + category + "' and " + " cpassword ='" + pass+"'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		List list = q.list();
		System.out.println("categoryDAOIMPL");
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
