
package com.kidsfly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kidsfly.entity.Cart;


@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    // Add custom query methods if needed

}

