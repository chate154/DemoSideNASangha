package PracticeInfo;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks extends MyPractice {
	
	@Before
	public void Befr() throws InterruptedException {
		System.out.println("launch Browser");
		lauchBrowser();
		System.out.println("A");
	}
	
		@After
		public void Befor() {
			System.out.println("close Browser");
			Close();
		}
	
		@BeforeStep
		public void takeScreenshots1() throws IOException {
			takeS();
			
			
			System.out.println("After Step Excuated");
			}
		
	
	

}
