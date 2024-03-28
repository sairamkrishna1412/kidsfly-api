
package com.kidsfly.repository;



import com.kidsfly.entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrdersRepository extends JpaRepository<Order, Long> {

    // Add custom query methods if needed

}

