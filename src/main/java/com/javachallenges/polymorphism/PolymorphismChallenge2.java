package com.javachallenges.polymorphism;

/** Soon you will see the answers on
 *   nobugsproject.com   */
public class PolymorphismChallenge2 {
	public static void main(String... doYourBest) {
		Juggy juggy = new Juggy();
		
		juggy.force = 99999;
		
		Object object = juggy;
		System.out.println(((Juggy)object).force);
		//System.out.println(object.force);
	}
	static class Juggy {
		int force = 9999;
		void talk() {
			System.out.println("Yeah!");
		}
	}
}
