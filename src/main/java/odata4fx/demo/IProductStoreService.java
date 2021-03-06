package odata4fx.demo;

import java.util.List;

import odata4fx.core.ODataParameter;
import odata4fx.core.annotations.ODataController;
import odata4fx.core.annotations.ODataCreateEntity;
import odata4fx.core.annotations.ODataCreateResourceLink;
import odata4fx.core.annotations.ODataDeleteEntity;
import odata4fx.core.annotations.ODataNavigation;
import odata4fx.core.annotations.ODataReadEntity;
import odata4fx.core.annotations.ODataReadEntityCollection;
import odata4fx.core.annotations.ODataUpdateEntity;
import odata4fx.demo.Category;
import odata4fx.demo.Product;

@ODataController
public interface IProductStoreService {

	@ODataReadEntityCollection(Product.class)
	public List<Product> listAllProducts(List<ODataParameter> params);
	
	@ODataReadEntity(Product.class)
	public Product findProductByKey(List<ODataParameter> keys);
		
	@ODataCreateEntity(Product.class)
	public Product createProduct(List<ODataParameter> values);
	
	@ODataDeleteEntity(Product.class)
	public void deleteProduct(List<ODataParameter> keys);

	@ODataUpdateEntity(Product.class)
	public Product updateProduct(List<ODataParameter> params);
	
	
	@ODataReadEntityCollection(Category.class)
	public List<Category> listAllCategories(List<ODataParameter> keys);
	
	
	@ODataReadEntity(Category.class)
	public Category findCategoryByKey(List<ODataParameter> keys);
	
	@ODataCreateEntity(Category.class)
	public Category createCategory(List<ODataParameter> values);

	
	@ODataDeleteEntity(Category.class)
	public void deleteCategory(List<ODataParameter>  keys);
	
	@ODataUpdateEntity(Category.class)
	public Category updateCategory(List<ODataParameter> values);
	
	
	@ODataNavigation(fromEntity=Product.class, toEntity=Category.class)
	public Category getAssociatedCategory(Product item, List<ODataParameter> params);
	
	@ODataNavigation(fromEntity=Category.class, toEntity=Product.class)
	public List<Product> getAssociatedProducts(Category item, List<ODataParameter> params);
	
	@ODataCreateResourceLink(entity=Product.class, relatedEntity=Category.class)
	public void setCategory(Product p, Category c);
	

}