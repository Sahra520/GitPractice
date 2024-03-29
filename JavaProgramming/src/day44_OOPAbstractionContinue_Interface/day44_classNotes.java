package day44_OOPAbstractionContinue_Interface;

public class day44_classNotes {
}

    /*
   Java Day44
Topics: Abstraction Continue
				Interface Intro

Package name: day44_Abstraction

Warmup task:
	Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal

		Create the following subclasses of Animal:
				Dog
					eat(): eats Pizza

				Cat
					eat(): eats Biryani

				Tiger
					eat(): eats deer

				Parrot
					eat(): eats chocolate

				Eagle
					eat(): eats snake


OOP Abstraction: concentrating on essentials (what it is), not worrying about the details/implementation (how it's done)

		Abstract method: A method without the implementation/body

							meant to be overridden

				area();
				perimeter();
				...
				eat();
				..

		2 ways to achieve the abstraction:
				1. Abstract class
				2. Interface



		Abstract class: meant to be super class (parent)
						can not be final
						Not concrete ( can not create object)

						can have all the methods, variables, and blocks of non-abstract class + abstract methods



Animal Task:
	interface Swimmable:
		swim()

	interface Flyable:
		 fly();

	Interface Wild:
		hunt();

	interface Playable:
		play();

	Abstract Animal:
		 eat()
		 drink()



   Dog extends Animal implements Playable, Swimmable

   Cat extends Animal implements Playable

   Cow extends Animal implements Playable

   Horse extends Animal implements Playable

   Parrot extends Animal implements Playable, Flyable

   Tiger extends Animal implements Wild

   Lion extends Animal implements Wild

   Eagle extends Animal implements Wild, Flyable

   Falcon extends Animal implements Wild, Flyable

   Dolphin extends Animal implements Playable, Swimmable

   Shark extends Animal implements Wild, Swimmable

   Duck extends Animal implements Swimmable, Flyable, Playable

   Java extends Animal implements Swimmable, Flyable, Playable, Wild

   ...



Person implements Swimmable, Playable

Boat implements Swimmable

Airplane implements Flyable

CydeoCar implements Swimmable, Flyable
*/

















