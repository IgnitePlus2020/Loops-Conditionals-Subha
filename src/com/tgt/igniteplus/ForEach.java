package com.tgt.igniteplus;

public class ForEach {
    public static void main(String[] args) {
        /* Problem statement: Sam is 5 years old. Since he's not tall enough to see the different flavours of ice-cream
        in the freezer, please list it out for him.
        Output:
        The different ice-cream flavours present in the freezer are:
        vanilla
        chocolate
        butterscotch
        kesar pista
        strawberry
         */
        String freezer[]={"vanilla","chocolate","butterscotch","kesar pista","strawberry"};
        System.out.println("The different ice-cream flavours present in the freezer are:");
        for (String flavour : freezer) {
            System.out.println(flavour);
        }
    }
}
