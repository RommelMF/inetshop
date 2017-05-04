package shop.repository.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import shop.models.Product;
import shop.models.impl.StoneSort;
import shop.repository.DAOProductRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Home on 22.04.2017.
 */
@Repository
@Transactional
public class ProductRepositoryImpl implements DAOProductRepository {
    @PersistenceContext
    EntityManager em;

    @Override
    public boolean addProduct(Product product) {
        em.persist(product);
        return true;
    }

    @Override
    public boolean deleteProduct(long id) {
        em.remove(em.find(Product.class,id));
        return true;
    }

    @Override
    public Product findProductById(long id) {
        Product product = em.find(Product.class,id);
        return product;
    }

    @Override
    public void updateProduct(Product product) {
        em.merge(product);
    }

    @Override
    public List<Product> findProductsList() {
        TypedQuery<Product> query = em.createQuery("SELECT stone FROM StoneSort stone ", Product.class);
        return query.getResultList();
    }
}
