package project20_oop_pillars;

abstract class Animal {
	
	  public abstract void animalSound();
	
	  public void sleep() {
	    System.out.println("sleeping sound is  Zz");
	  }
	}

	
	class Pig extends Animal {
	  public void animalSound() {
	   
	    System.out.println(" pig sound : wee wee");
	  }
	}

	class Abstraction {
	  public static void main(String[] args) {
	    Pig myPig = new Pig();
	    myPig.animalSound();
	    myPig.sleep();
	  }
	}