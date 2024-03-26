
package com.kidsfly.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kidsfly.entity.Review;


@Repository
public interface ReviewsRepository extends JpaRepository<Review, Long> {

    // Add custom query methods if needed

}



