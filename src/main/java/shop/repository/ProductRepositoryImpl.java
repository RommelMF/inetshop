package shop.repository;

import shop.models.Product;

import java.util.List;

/**
 * Created by Home on 22.04.2017.
 */
public class ProductRepositoryImpl implements DAOProductRepository {

    @Override
    public boolean addProduct(Product product) {
        return false;
    }

    @Override
    public boolean deleteProduct(long id) {
        return false;
    }

    @Override
    public Product findProductById(long id) {
        return null;
    }

    @Override
    public List<Product> findProductsList() {
        return null;
    }
}
