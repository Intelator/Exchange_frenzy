package org.frenzy;

import org.frenzy.*;


public class Main {

    public static void main(String... args) {
        System.out.println("TEST RUN");

        Department business = new Business();
        Department analytics = new Analytics();
        Department dev = new Dev();
        Department qa = new Qa();

        Helper.initialisation();
    }

}
