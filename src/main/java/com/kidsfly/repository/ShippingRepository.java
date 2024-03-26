
package com.kidsfly.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kidsfly.entity.Shipping;


@Repository
public interface ShippingRepository extends JpaRepository<Shipping, Long> {

    // Add custom query methods if needed

}



