package com.bhavna.service;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestOperation {

	@Test
	void test() {
		Operation obj=new Operation();
		boolean res=obj.isGreater(5, 5);
		assertEquals(false,res);
		assertNotNull(res);
		assertNull(null);
	}
	
	@BeforeEach
	void BeforeEach() {
		System.out.println("Before each!");
	}
	
	@AfterEach
	void AfterEach() {
		System.out.println("After each!");
	}
	
	@BeforeAll
	static void BeforeAll() {
		System.out.println("Before All!");
	}
	
	@AfterAll
	static void AfterAll() {
		System.out.println("After All!");
	}
	
	@Test  
	@DisplayName("Assert Tester")
    public void testAssert(){                    
                
        //Variable declaration        
        String str1="Java";                    
        String str2="Java";                    
        String str3="testing";                    
        //String str4="testing";                    
        String str5=null;                    
        int var1=1;                    
        int var2=2;               
        boolean res=(var1<var2);
                
        //Assert statements        
        assertEquals(str1,str2);                    
        assertNotEquals(str1, str3);                           
        assertNotNull(str1);            
        assertNull(str5);            
        assertNotEquals(str2,str3);                    
        assertTrue(res);
        assertFalse(!res);
    }        
}
/*
Write a program to demonstrate use of following JUnit 4 annotation without logical call.
1. @Test 2.@assertEquals,3@assertNull
4.assertNotNull 5.assertNotEquals
6. assertTrue 6.assertFalse 7.@displayName 8.@BeforeEach 9.@BeforeAll 10.@AfterEach 11.@AfterAll

*/