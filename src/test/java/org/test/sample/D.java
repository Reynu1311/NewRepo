package org.test.sample;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class D {
	@Test
	public void tc1() {
		Result runClasses = JUnitCore.runClasses(A.class, B.class, C.class);
		System.out.println("Run count is" + runClasses.getRunCount());
		System.out.println("Run Time is" + runClasses.getRunTime());
		System.out.println("Failure count is" + runClasses.getFailureCount());
		System.out.println("Ignore count is" + runClasses.getIgnoreCount());
		List<Failure> failures = runClasses.getFailures();
		for (Failure x : failures) {
			System.out.println(x);
			
		}

		}
	}


