package org.test.pom;

public class ExecutableClass extends BaseClass {
	public static void main(String[] args) {

		openBrowser();
		loadUrl("https://www.facebook.com/");
		LoginPojo l = new LoginPojo();
		fill(l.getTxtEmail(), "java");
		fill(l.getTxtPass(), "selenium");
		driver.navigate().refresh();
		LoginPojo l1 = new LoginPojo();
		fill(l1.getTxtEmail(), "python");
		fill(l1.getTxtPass(), "Aws");

	}

}
