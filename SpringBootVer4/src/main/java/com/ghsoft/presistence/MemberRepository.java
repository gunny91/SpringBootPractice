package com.ghsoft.presistence;

import org.springframework.data.repository.CrudRepository;

import com.ghsoft.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String>{
	
	
}
