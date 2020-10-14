package com.ghsoft.java01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ghsoft.java01.spring.MemberDAO;
import com.ghsoft.java01.spring.MemberInfoPrinter;
import com.ghsoft.java01.spring.MemberPrinter;
import com.ghsoft.java01.spring.MemberRegisterService;

//Annotation for notifying that this class will use for spring !
@Configuration
public class JavaConfig {

	
		/**
		 * 
		 * @return memberDAO()
		 */
		@Bean
		public MemberDAO memberDAO() {
			
			return new MemberDAO();
		}
		// Same as <beab id="memberDAO" class="spring.MemberDAO"/>
		
		
		/**
		 * 
		 * @return
		 */
		@Bean
		public MemberRegisterService memberRegSvc(){
			return new MemberRegisterService(memberDAO());
		}
		
		@Bean
		public MemberPrinter printer() {
			
			return new MemberPrinter();
		}
		
		@Bean
		public MemberInfoPrinter infoPrinter() {
			MemberInfoPrinter info = new MemberInfoPrinter();
			info.setMemberDAO(memberDAO());
			info.setPrinter(printer());
			return info;
		}
		
}
