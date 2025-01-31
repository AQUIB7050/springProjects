package productcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productcrudapp.model.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// insert
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}

	// get
	public Product getProduct(int pid) {
		return this.hibernateTemplate.get(Product.class, pid);
	}

	// getAll
	public List<Product> getAllProducts() {
		return this.hibernateTemplate.loadAll(Product.class);
	}

	// delete
	@Transactional
	public void deleteProduct(int pid) {
		this.hibernateTemplate.delete(this.hibernateTemplate.load(Product.class, pid));
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
