package com.coboltojava;

public class Perform1 {
	
	public void TopLevel() {
		System.out.println("In TopLevel. Starting to run program");
		OneLevelDown();
		System.out.println("Back in TopLevel.");
	}

	private void OneLevelDown() {
		System.out.println(">>>> Now in OneLevelDown");
		TwoLevelsDown();
		System.out.println(">>>> Back in OneLevelDown");
	}

	private void TwoLevelsDown() {
		System.out.println(">>>>>>>> Now in TwoLevelsDown.");
		ThreeLevelsDown();
		System.out.println(">>>>>>>> Back in TwoLevelsDown.");
	}

	private void ThreeLevelsDown() {
		System.out.println(">>>>>>>>>>>> Now in ThreeLevelsDown");

	}

	public static void main(String[] args) {

		Perform1 perform = new Perform1();
		perform.TopLevel();

	}


}