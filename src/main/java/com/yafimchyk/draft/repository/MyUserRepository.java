package com.yafimchyk.draft.repository;

import com.yafimchyk.draft.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Long> {

     MyUser findByUsername(String username);



}
