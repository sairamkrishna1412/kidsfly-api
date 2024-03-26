
package com.kidsfly.repository;



import com.kidsfly.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoriesRepository extends JpaRepository<Category, Long> {

    // Add custom query methods if needed

}

