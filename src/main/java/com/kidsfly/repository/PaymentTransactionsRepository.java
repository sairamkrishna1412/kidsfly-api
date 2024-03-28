
package com.kidsfly.repository;



import com.kidsfly.entity.PaymentTransaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaymentTransactionsRepository extends JpaRepository<PaymentTransaction, Long> {

    // Add custom query methods if needed

}



