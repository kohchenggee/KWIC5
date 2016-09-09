package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import CS3213.RequireWords;

public class RequireWordsTest {

	@Test
	public void test() {
		RequireWords requireWords=new RequireWords();
		String[] lines = {"test a line", "a simple line", "this is test", "easy task"};
		for (String str : lines) {
            requireWords.addWordToList(str);
        }
		
		String[] test ={"this"};
		ArrayList<String> output= requireWords.CheckRequireWords(test);
		assertEquals(1, requireWords.getSize());
	}

}
