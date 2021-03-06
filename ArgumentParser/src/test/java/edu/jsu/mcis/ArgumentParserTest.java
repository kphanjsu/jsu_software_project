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
		String[] data= {"7","5","2"};
		assertEquals(AP.getMessage(data), "just enough variables");
	}


	@Test

	public void testOnly1numberEntered(){

		String[] data={"7"};
		assertEquals(AP.getMessage(data), "usage: java VolumeCalculator length width heigh. VolumeCalculator.java: error: the following arguments are required: width height");


=======
		String[] data={"7"};
		assertEquals(AP.getMessage(data), "usage: java VolumeCalculator length width heigh. VolumeCalculator.java: error: the following arguments are required: width height");
>>>>>>> origin/master
	}

	@Test

	public void testIfNonumberEntered(){

		String[] data={};


		assertEquals(AP.getMessage(data), "no values entered");


=======
		String[] data={};
		assertEquals(AP.getMessage(data), "no values entered");
>>>>>>> origin/master
	}



	@Test

	public void testLessThan3NumbersEntered(){
		AP.addPositionalArguments("length");
		AP.addPositionalArguments("width");
		AP.addPositionalArguments("height");
		String[] data= {"7","5"};
		assertEquals(AP.getMessage(data), "usage: java VolumeCalculator length width heigh. VolumeCalculator.java: error: the following arguments are required: height");
	}

	@Test

	public void testMoreThan3NumbersEntered(){
		AP.addPositionalArguments("length");
		AP.addPositionalArguments("width");
		AP.addPositionalArguments("height");
		String[] data= {"7","5", "3", "7"};
		assertEquals(AP.getMessage(data), "usage: java VolumeCalculator length width height. VolumeCalculator.java: error: unrecognized arguments:" + data[3]);
	}


	/*
	@Test

	public void testGetLength(){

		AP.addPositionalArguments("length");
		AP.addPositionalArguments("width");
		AP.addPositionalArguments("height");
		String[] data= {"7","5", "3"};
		AP.parse(data);
		assertEquals(AP.getArg("length"), "7");



      }
      */


=======
>>>>>>> origin/master
	@Test

	public void testGetHelp(){

		String[] data = {"-h"};
		assertEquals(AP.getHelpMessage(data), "usage: java VolumeCalculator length width heigh. Calculate the volume of a box. positional arguments: length the length of the box. width the width of the box. height the height of the box");



=======
		String[] data = {"-h"};
		assertEquals(AP.getHelpMessage(data), "usage: java VolumeCalculator length width heigh. Calculate the volume of a box. positional arguments: length the length of the box. width the width of the box. height the height of the box");
>>>>>>> origin/master
	}


/*

	@Test

	public void testIntBeingEnteredReturnsTrue() {
		String s = "125";
		assertTrue(AP.checkDataType(s, ArgumentParser.dataType.ISANINT));
	}

	@Test

	public void testIntBeingEnteredReturnsFalse() {
		String s = "3.5";
		assertFalse(AP.checkDataType(s, ISASTRING));
	}

	@Test

	public void testDoubleBeingEnteredReturnsTrue() {
		String s = "1.0";
		assertTrue(AP.checkDataType(s, ISADOUBLE));
	}

	@Test

	public void testDoubleBeingEnteredReturnsFalse() {
		String s = "test";
		assertFalse(AP.checkDataType(s, ISASTRING));
	}
	*/

	@Test

	public void testStringBeingEnteredReturnsTrue() {
		String s = "test";
		assertTrue(AP.checkDataType(s, ISASTRING));
	}

	@Test
	public void testStringBeingEnteredReturnsFalse() {
		String s = "21";
		assertFalse(AP.checkDataType(s, ISANINT));
	}
}
