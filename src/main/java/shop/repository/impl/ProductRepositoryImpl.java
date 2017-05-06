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
    public boolean addProduct(Product stoneSort) {
        em.persist(stoneSort);
        return true;
    }

    @Override
    public boolean deleteProduct(long id) {
        em.remove(em.find(StoneSort.class,id));
        return true;
    }

    @Override
    public Product findProductById(long id) {
        Product stoneSort = em.find(StoneSort.class,id);
        return stoneSort;
    }

    @Override
    public void updateProduct(Product stoneSort) {
        em.merge(stoneSort);
    }

    @Override
    public List<Product> findProductsList() {
        TypedQuery<Product> query = em.createQuery("SELECT stone FROM StoneSort stone ", Product.class);
        return query.getResultList();
    }
}
