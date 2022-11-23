package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{
	Member findByEmail(String email);

}
