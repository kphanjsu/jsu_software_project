package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;


public class ArgumentParserTest {


	private ArgumentParser AP;
	
	
	@Before
	public void startUp(){
		
	
		AP=new ArgumentParser();
	}
	
	
	@Test
	
	public void testOnly3numbersEntered(){
		
		AP.addPositionalArguments("length");
		AP.addPositionalArguments("width");
		AP.addPositionalArguments("height");
		//AP.addPositionalArguments("other");
		String[] data= {"7","5","2"};
		
		//AP.parse(data);
		//(length,7);
		//(width,5);
		//(height,2);
		
		assertEquals(AP.getMessage(data), "just enough variables");
		
	
	}
	
	
	
	@Test
	
	public void testLessThan3NumbersEntered(){
	
		AP.addPositionalArguments("length");
		AP.addPositionalArguments("width");
		AP.addPositionalArguments("height");
		String[] data= {"7","5"};
		//AP.parse(data);
		assertEquals(AP.getMessage(data), "usage: java VolumeCalculator length width heigh. VolumeCalculator.java: error: the following arguments are required: height");
	
	
	
	}
	
	
	@Test
	
	public void testMoreThan3NumbersEntered(){
	
		AP.addPositionalArguments("length");
		AP.addPositionalArguments("width");
		AP.addPositionalArguments("height");
		String[] data= {"7","5", "3", "7"};
		//AP.parse(data);
		assertEquals(AP.getMessage(data), "usage: java VolumeCalculator length width height. VolumeCalculator.java: error: unrecognized arguments:" + data[3]);
	
	
	
	}
	


}
	