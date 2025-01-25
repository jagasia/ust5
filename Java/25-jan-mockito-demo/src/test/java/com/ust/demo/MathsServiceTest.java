package com.ust.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.ust.demo.service.MathematicsService;

//@RunWith(MockitoJUnitRunner.class)
public class MathsServiceTest {

	
	@Test
	public void test1()
	{
		MathematicsService proxy = mock(MathematicsService.class,RETURNS_DEEP_STUBS);
		when(proxy.sum(2, 3)).thenReturn(5);
		
		
		int sum = proxy.sum(2, 3);
		System.out.println(sum);
		assertEquals(5, sum);
		
		
	}
}
