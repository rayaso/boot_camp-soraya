package tags;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before("@SmokeTest")//in cucumber order before stats by 0

    public void doBefore() {
        System.out.println("...............before one.............");
    }

    @Before(order = 1)
    public void doBeforeTwo() {
        System.out.println("..........Before two..................");
    }

    @After(order = 1)
    public void doAfter() {
        System.out.println("..........After One..................");

    }

    @After(order = 0)
    public void doAfterTwo() {
        System.out.println("..........After two..................");

    }


}