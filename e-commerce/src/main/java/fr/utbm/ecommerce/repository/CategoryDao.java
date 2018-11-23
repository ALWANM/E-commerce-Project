package fr.utbm.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.utbm.ecommerce.dto.Category;

@Repository("CategoryDao")
@Transactional
public interface CategoryDao extends CrudRepository<Category, Integer> {
 
}
