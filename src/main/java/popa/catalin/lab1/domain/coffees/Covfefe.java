package popa.catalin.lab1.domain.coffees;

import popa.catalin.lab1.domain.Coffee;

public class Covfefe extends Coffee {
    // coffee made with nuthin', yo ; used as a base for creating custom coffees
    @Override
    public String drink() {
        return "Donald Trump tweets it";
    }
}
