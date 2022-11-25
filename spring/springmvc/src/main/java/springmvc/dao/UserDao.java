package springmvc.dao;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user)
	{
		int id =(Integer)this.hibernateTemplate.save(user);
		return id;
	}

	

	/*public void addUser(User user) {
		// TODO Auto-generated method stub
	      hibernateTemplate.saveOrUpdate(user);
		
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		((User)) hibernateTemplate)).createQuery("Delete from User where id= "+user.getId()).executeUpdate();
	}*/

	

}
