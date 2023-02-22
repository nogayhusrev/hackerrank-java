package com.nogayhusrev.object_oriented_programming;

class Sports {

    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }

//    Write your overridden getNumberOfTeamMembers method here
//    Note: When overriding a method, you should precede it with the @Override annotation.
//    The parameter(s) and return type of an overridden method must be exactly the same as those of the method inherited from the supertype.

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class JavaMethodOverriding {

    public static void main(String[] args) {
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }

}

