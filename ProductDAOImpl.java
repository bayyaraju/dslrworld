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

import com.niit.model.Product;
@Transactional
@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO
{
	
	@Autowired
	private SessionFactory sessionFactory;


	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	
	}

    @Transactional
	public List<Product> list() {
   
    	Session s = sessionFactory.getCurrentSession();
		Transaction tx = s.beginTransaction();
		List<Product> listProduct = s.createCriteria(Product.class).list();
		return listProduct;
		
	}

	@Transactional
	public Product get(int pid) {
		String hql = "from Product where pid=" + "'"+ pid +"'";
		Query query =  sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>) query.list();
		
		if (listProduct != null && !listProduct.isEmpty()) {
			return listProduct.get(0);
		}
		return null;
	}
	
	@Transactional
	public void saveOrUpdate(Product product) {
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();
		
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		System.out.println("In productDAOImpl");
		t.commit();

	}

	/*@Transactional
	public void delete(int pid) {
		
		Product product=new Product();
		
		product.setPid(pid);
		Session session=sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Query query=session.createQuery("delete from Product where pid=:status");
		query.setInteger("status",pid);
		int rowsDeleted=query.executeUpdate();
	 
		tx.commit();
		  System.out.println("Rows deleted:"+rowsDeleted);

	}*/
	@Transactional
	public void delete(int pid) {
	System.out.println("Id in deleteProduct(int pid):"+pid);

	    Session session=sessionFactory.getCurrentSession();
	    Transaction tx=session.beginTransaction();
	    Product product = (Product)session.load(Product.class, pid);
	   // Query query=session.createQuery("delete from product  where pid=:status");
	   // query.setInteger("status",pid);
	   // int rowsDeleted=query.executeUpdate();
	    session.delete(product);
	    tx.commit();
	 //   System.out.println("Rows deleted:"+rowsDeleted);
	    System.out.println("deleted");
	}
	
	@Transactional
	public Product getProductByName(String pname) {
		System.out.println("getting data in dao based on name");
		Session session=this.sessionFactory.getCurrentSession();
		Product product=(Product) session.get(Product.class,pname);
		System.out.println("data of product by name="+product);
		return product;	


	}

	@Transactional
     public boolean isValidCredentials(String product,Boolean isAdmin, String pass) {
		
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();
		String hql = "from Product where pid= '" + product + "' and upassword = '" + pass + "'";
		//String hql = "from Product where pid= '" + product + "' and " + " upassword ='" + pass+"'";
		Query q = sessionFactory.getCurrentSession().createQuery(hql);
		List list = q.list();
		System.out.println("productDAOIMPL");
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
/*
	public List<Product> getProducts(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product");
        List<Product> productList = query.list();
        
        session.flush();
        return getProducts();
    }

	public void editProduct (Product product){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }
*/

}
