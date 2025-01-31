package productcrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.ProductDao;
import productcrudapp.model.Product;

@Controller
public class MainController {

	@Autowired
	private ProductDao productDao;

	// HOME PAGE
	@RequestMapping("/")
	public String home(Model m) {
		List<Product> products = this.productDao.getAllProducts();
		m.addAttribute("product", products);
		m.addAttribute("title", "home page");
		return "index";
	}

	// ADD PRODUCT FORM
	@RequestMapping("/add-product")
	public String addProduct(Model m) {
		m.addAttribute("title", "product page");
		return "add_product";
	}

	// ADDING THE PRODUCT
	@RequestMapping(path = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		this.productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath());
		return redirectView;
	}

	// DELETING A PRODUCT
	@RequestMapping("/delete-product/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request) {
		this.productDao.deleteProduct(productId);

		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath());
		return redirectView;
	}

	// UPDATING A PRODUCT
	@RequestMapping("/update-product/{productId}")
	public String updateProduct(@PathVariable("productId") int productId, Model m) {
		Product product = this.productDao.getProduct(productId);
		m.addAttribute("product", product);
		m.addAttribute("title", "update product");
		return "update_product";
	}

}
