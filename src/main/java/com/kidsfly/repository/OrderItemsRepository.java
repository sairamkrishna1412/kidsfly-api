
package com.kidsfly.repository;



import com.kidsfly.entity.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItem, Long> {

    // Add custom query methods if needed

}



