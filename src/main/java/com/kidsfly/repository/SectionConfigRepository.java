
package com.kidsfly.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kidsfly.entity.SectionConfig;


@Repository
public interface SectionConfigRepository extends JpaRepository<SectionConfig, Long> {
	@Query("SELECT secs FROM SectionConfig secs")
    List<SectionConfig> findHomeSections();
    
//    @Query("SELECT s FROM SectionConfig s LEFT JOIN FETCH s.products p WHERE :productId MEMBER OF s.productIds")
//    List<SectionConfig> findByProductId(Integer productId);
    // Add custom query methods if needed
}



