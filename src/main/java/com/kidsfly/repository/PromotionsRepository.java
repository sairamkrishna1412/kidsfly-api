
package com.kidsfly.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kidsfly.entity.Promotion;


@Repository
public interface PromotionsRepository extends JpaRepository<Promotion, Long> {

    // Add custom query methods if needed

}



