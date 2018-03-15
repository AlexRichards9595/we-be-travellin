package org.wecancodeit.columbus.webetravelin;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StateTest {
	
	@Test
	public void stateShouldHaveAbrreviation() {
		State underTest = new State("OH");
		
		String check = underTest.getAbb();
		
		assertThat(check, is("OH"));
	}
	
}
