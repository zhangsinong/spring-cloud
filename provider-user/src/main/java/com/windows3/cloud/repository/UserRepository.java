package com.windows3.cloud.repository;

import com.windows3.cloud.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 3 on 2018/10/8.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
