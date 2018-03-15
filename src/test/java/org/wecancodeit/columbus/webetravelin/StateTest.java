package org.wecancodeit.columbus.webetravelin;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class StateTest {
	
	@Resource
	private TestEntityManager entityManager;
	
	@Resource
	private StateRepository stateRepo;
	
	@Test
	public void stateShouldHaveAbrreviation() {
		State underTest = new State("OH", "Ohio", null, null);
		
		String check = underTest.getAbb();
		
		assertThat(check, is("OH"));
	}
	@Test
	public void assertThatStateWasAddedToRepo() {
		State underTest = new State("OH", null, null, null);
		stateRepo.save(underTest);
		long stateId = underTest.getId();
		
		entityManager.flush();
		entityManager.clear();
		
		State check = stateRepo.findOne(stateId);
		
		
		assertThat(underTest, is(check));
		
		
	}
}


