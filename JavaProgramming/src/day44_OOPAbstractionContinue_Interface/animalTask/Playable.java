package day44_OOPAbstractionContinue_Interface.animalTask;

public interface Playable {

    void play();  //this method is abstract by default

//public abstract void play();// here we don't use public because in interface we can just use public access modifier
//we don't use abstract keyword because we can use interface only abstract class


    boolean isFriendly = true;  // static and final by default



}
