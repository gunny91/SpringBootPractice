package com.ghsoft;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import com.ghsoft.domain.Member;
import com.ghsoft.domain.Profile;
import com.ghsoft.presistence.MemberRepository;
import com.ghsoft.presistence.ProfileRepository;

import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log // to use log lombok
@Commit // Test result commit
public class ProfileTests {

	@Autowired
	protected MemberRepository member;
	@Autowired
	protected ProfileRepository profile;

	@Test
	public void testMember() {
		// IntStream.range(1, 101).forEach(i -> {
		for (int i = 1; i < 101; i++) {
			Member m = new Member();
			m.setUid("User " + i);
			m.setUpw("Pw " + i);
			m.setUname("User " + i);

			member.save(m);
		}

	}

	@Test
	public void testProfile() {
		Member m = new Member();
		m.setUid("user1");

		for (int i = 0; i < 5; i++) {
			Profile p = new Profile();
			p.setFname("face" + i + ".jpg");

			if (i == 1) {
				p.setCurrent(true);
			}

			p.setMember(m);
			profile.save(p);
		}
	}

}
