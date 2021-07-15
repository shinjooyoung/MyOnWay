package kr.co.mind.blog;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import kr.co.mind.blog.controller.BlogController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:Webcontent/WEB-INF/spring/*.xml"})
public class BlogTest {
	
	@Autowired
	BlogController con;
	
//	private MockMvc mockMvc;
	
	@Before
	public void setUp() {
//		mockMvc = MockMvcBuilders.standaloneSetup(con).build();
	}

	@Test
	public void insertTest() {
		try {
			assert(con != null);
			
//			MockHttpServletRequestBuilder builder = 
//			post("/blog/test")
//			.param("id", "1");

//	System.out.println(mockMvc.perform(builder).andReturn());
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
