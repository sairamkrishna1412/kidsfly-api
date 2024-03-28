
package com.kidsfly.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kidsfly.entity.Product;


@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {

    // Add custom query methods if needed

}



