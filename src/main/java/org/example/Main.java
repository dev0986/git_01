package org.example;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        System.out.println("First commit on all branches: dev, staging & prod.");

        Operation operation = null;


        //Design calculator
        //RLO-1111: Setup framework (classes, interfaces)
        //RLO-2222: Add add functionality
        //RLO-3333: Add subtract functionality
        //RLO-4444: Unit testing
        //Final checking - comments etc.

        //        staging -> RLO-1111 -> push RLO-1111 -> merge develop -> merge staging
        //        staging -> RLO-2222 -> push RLO-2222 -> merge develop -> merge staging
        //        staging -> RLO-3333 -> push RLO-3333 -> merge develop -> merge staging
        //        staging -> RLO-4444 -> push RLO-4444 -> merge develop -> merge staging
        //        staging -> RLO-5555 -> push RLO-5555 -> merge develop -> merge staging


    }

    //This is a method coded on branch 'one'
    public void onBranchOne() {
        System.out.println("Coming in from Branch 'one'");
    }
    //Second commit on branch one. (This changed in branch 2)
    //Third commit on branch one.
    //(Next change from branch 1)
    //Commit
}