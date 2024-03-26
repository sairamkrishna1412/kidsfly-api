
package com.kidsfly.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kidsfly.entity.User;


@Repository
public interface UsersRepository extends JpaRepository<User, Long> {

    // Add custom query methods if needed

}



