package jUnit;

import java.util.ArrayList;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;


//Assume all the required imports are added

public class RuleDemo {
	private List<String> systemErrorMessages = new ArrayList<String>();
	@Rule
	public Verifier verifier = new Verifier() {
		@Override
		public void verify() {
			//assertThat(systemErrorMessages.size(), is(2));
		}
	};

	@Test
	public void testSomething() {
		systemErrorMessages.add("Oh, no!");
	}

	@Test
	public void testSomething1() {
		systemErrorMessages.add("Oh, ");

	}
}
