package com.ghsoft.di01.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.ghsoft.di01.spring.AlreadyExistingMemberException;
import com.ghsoft.di01.spring.ChangePasswordService;
import com.ghsoft.di01.spring.IdPasswordNotMatchingException;
import com.ghsoft.di01.spring.MemberInfoPrinter;
import com.ghsoft.di01.spring.MemberListPrinter;
import com.ghsoft.di01.spring.MemberNotFoundException;
import com.ghsoft.di01.spring.MemberRegisterService;
import com.ghsoft.di01.spring.RegisterRequest;
import com.ghsoft.di01.spring.VersionPrinter;

public class MainForSpring3 {

	private static ApplicationContext ctx = null;

	public static void main(String[] args) throws IOException {
		//스프링 컨테이너를 생성한다.
		//스프링 컨테이너는 객체를 생성하고 의존 객체를 주입하는 것.
		String[] conf = {"classpath:conf1.xml", "classpath:conf2.xml"};
		ctx = new GenericXmlApplicationContext(conf);

		//명령어를 입력하기 위해서 사용한다.
		BufferedReader reader
			= new BufferedReader(new InputStreamReader(System.in));
		
		//화면에 안내문을 보여준다.
		while(true) {
			//사용자에게 보여줄 도움말 화면을 출력한다.
			printHelp();
			
			
			//사용자의 입력을 받는다.
			String command = reader.readLine();
			
			//입력한 값에 맞는 프로그램을 호출한다.
			if(command.equalsIgnoreCase("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} 
			if(command.startsWith("new ")) {
				//입력받은 문자열을 공백을 기준으로 분리하여 넘겨준다.
				processNewCommand(command.split(" "));
				continue;
			}else if(command.startsWith("change ")) {
				processChangeCommand(command.split(" "));
				continue;
			}else if(command.equals("list")) {
				processListCommand();
				continue;
			} else if (command.startsWith("info ")) {
			processInfoCommand(command.split(" "));
			continue;
			}else if (command.equals("version")) {
				processVersionCommand();
				continue;
			}
			printHelp();
		}
	} // End - public static void main(String[] args)
	
		
	private static void processVersionCommand() {
		VersionPrinter versionPrinter = 
				ctx.getBean("versionPrinter", VersionPrinter.class);
		versionPrinter.print();
	}
	
	private static void processInfoCommand(String[] arg) {
			if (arg.length != 2) {
				printHelp();
				return;
			}
			MemberInfoPrinter infoPrinter = 
					ctx.getBean("infoPrinter", MemberInfoPrinter.class);
			infoPrinter.printMemberInfo(arg[1]);
		}
		
	private static void processListCommand() {
		MemberListPrinter printer = ctx.getBean("listPrinter",MemberListPrinter.class);
		
		printer.printAll();
		
	}

	//매개변수로 넘어오는 값이 여러개이므로, 배열로 받는다.
	private static void processNewCommand(String[] arg) {
		//넘어오는 매개변수가 5개 필요하다.
		if(arg.length != 5) {
			printHelp();
			return;
		}
		//회원정보 등록을 하는 메서드이므로 회원정보등록에 관련된 bean을 가져온다.
		MemberRegisterService regSvc
			//스프링 컨테이너로부터 이름이 memberRegSvc인 Bean객체를 구한다.
			= ctx.getBean("memberRegSvc", MemberRegisterService.class);
		RegisterRequest req = new RegisterRequest();
		req.setEmail(arg[1]);
		req.setName(arg[2]);
		req.setPassword(arg[3]);
		req.setConfirmPassword(arg[4]);
		
		//비밀번호와 비밀번호확인이 일치하지 않을 경우
		if(!req.isPasswordEqualToConfirmPassword()) {
			System.out.println("비밀번호와 비밀번호확인이 같지 않습니다.");
			return;
		}
		try {
			regSvc.regist(req);
			System.out.println("회원정보를 등록하였습니다.");
		} catch (AlreadyExistingMemberException e) {
			System.out.println("이미 존재하는 이메일입니다.\n다시 작성해주십시오.");
		}
	} // End -private static void processNewCommand(String[] arg)
	
	private static void processChangeCommand(String[] arg) {
		if(arg.length != 4) {
			printHelp();
			return;
		}
		//비밀번호변경을 하는 메서드이므로 비밀번호 변경에 관련된 bean을 가져온다.
		ChangePasswordService changePwdSvc
			//스프링 컨테이너로부터 이름이 changePwdSvc인 Bean객체를 구한다.
			= ctx.getBean("changePwdSvc", ChangePasswordService.class);
		
		try {
			changePwdSvc.changePassword(arg[1], arg[2], arg[3]);
			System.out.println("비밀번호가 변경되었습니다.");
		} catch (MemberNotFoundException e) {
			System.out.println("존재하지 않는 이메일입니다.");
		} catch (IdPasswordNotMatchingException e) {
			System.out.println("이메일과 비밀번호가 일치하지 않습니다.");
		}
	} // End - private static void processChangeCommand(String[] arg)
	
	//사용자에게 보여줄 도움말 화면
	private static void printHelp() {
		System.out.println("-------------------------------------------");
		System.out.println("명령어 사용법 : 단어간에는 띄어쓰기를 해주십시오.");
		System.out.println("new 이메일 이름 암호 암호확인");
		System.out.println("change 이메일 현재비밀번호 변경할비밀번호");
		System.out.println("List");
	} // End - private static void printHelp()
}
