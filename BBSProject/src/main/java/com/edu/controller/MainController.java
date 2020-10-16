package com.edu.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.edu.dto.ProductDTO;
@Controller
public class MainController {

	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping("/") //url pattern mapping
	public String main(Model model) {
		logger.info("mainController start.....");
		//Mode : 데이터를 담는 그릇 역할을 한다. map구조로 저장된다.
		//model.addAttribute("변수명", 값);
		model.addAttribute("message", "gunny");
		//Controller에서 view페이지로 넘어갈 때
		//prefix와 subfix가 정의되어 있는 servlet-context.xml를 참조하여
		//view페이지로 이동하게 한다.
		//<beans:property name="prefix" value="/WEB-INF/views/" />
		//main
		//<beans:property name="subfix" value=".jsp" />
		//최종적으로 /WEB-INF/views/main.jsp가 된다.

		return "main";
	}
	
	
	@RequestMapping(value="gugu.dan", method=RequestMethod.GET)
	public String gugu(@RequestParam(defaultValue="3") int temp, Model model) {
		logger.info("Enter the gugu controller");
		
		String result="";
		for(int i =1; i <=9;i++) {
			result += temp + "*" + i +"="+temp * i +"<br>";
		}
		
		//데이터를 넘기기 전에 model에 저장해야 한다.
				//스프링을 사용하기 전의 JSP에서는 출력페이지에서 사용할 수 있도록 
				//request 영역에 저장해야 했다.
				//예) request.setAttribute("score", score);
		model.addAttribute("result", result);
		
		return "test/gugu"; // WEB-INF/views/test/gugu.jsp
		
		//menu.jsp에서 구구단의 단을 불러오려면?
				//public String gugu(HttpServletRequest request, Model model) {
				//int dan = Integer.parseInt(request.getParameter("dan"));
				
				//Spring에서는 GET방식에서 위와 같은 방식으로 사용하지 않는다.
				//좀 더 쉬운방법은 아래와 같이 선언부를 사용한다.
				//변수이름을 똑같이 사용한다.(int dan)
				//public String gugu(int dan, Model model) {
				
				//값을 넘겨주는 페이지에서는 String으로 넘어오지만,
				//Spring에서는 정수형으로도 잘 받는다.
				
				//public String gugu(@RequestParam int dan, Model model) {
				//실제적으로는 @RequestParam이 숨어있는 것이다. 이것은 명시하지 않아도 된다.
				//@RequestParam을 적지 않아도 실행하는데 상관은 없으나,
				//이것을 붙이면 int dan이 단독변수가 아니라,
				//앞의 페이지에서 넘어오는 값을 저장하는 변수라는 것을 알 수 있다.
				
				//(@RequestParam(defaultValue="3") int dan, Model model)
				//dan에 값이 없으면 defaultValue의 값으로 실행한다.
	}
	
	@RequestMapping(value="test.do", method=RequestMethod.GET)
	public String test() {
		logger.info("Enter the test controller");
		
		return "test/test";
	}
	
//	@RequestMapping("test")
//	public void test2() {}
	
	/**
	 * Url pattern and method name is not need to be mattched!
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value="test/testA")
	public String testA(Model model) {
		
		model.addAttribute("message", "hello, this is test");		
		return "test/testB";
	}
	
	@RequestMapping("test/testB")
	public String testB(Model model) {
		logger.info("Enter the test B Page!");
		model.addAttribute("message", "hello, this is test");		
		return "test/testB";
	}
	
//	@RequestMapping("test/testB")
//	public void testB(Model model) {
//		logger.info("Enter the test B Page!");
//		model.addAttribute("message", "hello, this is test");		
//		
//	}
	
	//forward : address not chage, screen  changed
	// redirect : address change , screen change, small 'get'way data convey
	// redirect : Not only out, but also move the different addres from pages
	
	/**
	 * Using ModelAndView : Model( Data repository), view (scree)
	 * @return
	 */
	@RequestMapping("test/testC")
	public ModelAndView testC() {
		Map<String, Object> map = new HashMap<String,Object>();
		
		map.put("product", new ProductDTO("Apple",100000));
	//map.put("SmartPhone", new ProductDTO("IPhone 12", 1350000));
		
		//new ModelAndWview("view name", "variable name", map)
		return new ModelAndView("test/testC","map",map);
	}
	
	@RequestMapping("test/testD")
	public String testD(){
		//When we useing Redirect, we need to return type as String!
		return "redirect:/test/testE";
	}
	
	@RequestMapping("test/testE")
	public void testE(){
		
	}
}

