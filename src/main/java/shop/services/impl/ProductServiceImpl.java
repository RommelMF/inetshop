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
    public boolean saveProduct(Product stoneSort) {
        repository.addProduct(stoneSort);
        return true;
    }

    @Override
    public boolean deleteProduct(Long id) {
        repository.deleteProduct(id);
        return true;
    }

    @Override
    public boolean updateProduct(Product stoneSort) {
        repository.updateProduct(stoneSort);
        return true;
    }

    @Override
    public Product findProductById(Long id) {
       return repository.findProductById(id);
    }

    @Override
    public List<Product> findAllProducts() {
        return repository.findProductsList();
    }
}
