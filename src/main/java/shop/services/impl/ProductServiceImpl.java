package shop.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.models.Product;
import shop.repository.DAOProductRepository;
import shop.services.ProductService;

import java.util.List;

/**
 * Created by Home on 03.05.2017.
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private DAOProductRepository repository;

    @Override
    public boolean saveProduct(Product product) {
        repository.addProduct(product);
        return true;
    }

    @Override
    public boolean deleteProduct(long id) {
        repository.deleteProduct(id);
        return true;
    }

    @Override
    public boolean updateProduct(Product product) {
        repository.updateProduct(product);
        return true;
    }

    @Override
    public Product findProductById(long id) {
       return repository.findProductById(id);
    }

    @Override
    public List<Product> findAllProducts() {
        return repository.findProductsList();
    }
}
