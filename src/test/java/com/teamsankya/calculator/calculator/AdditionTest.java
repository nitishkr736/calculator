package com.teamsankya.calculator.calculator;

import com.teamsankya.calculator.calculator.Addition;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
public class AdditionTest {
  //int a;
  //int b;
  //int expected;
 /* @Test
  public void addTestInt1() {
   this.a=a;
	  this.b=b;
	  this.expected=expected;			  
  }*/
  @Test
  public void test1() {
	  int sum=Addition.add(10, 20);
	 TestCase.assertEquals(30,sum);
  }
  @Before
  public void addTest() {
	  double sum=Addition.add(10.2, 20.3);
	  TestCase.assertEquals(30.5, sum);
  }
 
  }
