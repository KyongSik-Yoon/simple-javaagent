package simple.javaagent;

import java.lang.instrument.Instrumentation;

public class Main {
    public static void premain(
        String agentArgs,
        Instrumentation inst
    ) {
        System.out.println("simple javaagent is running!");
    }

    public static void main(String[] args) {
        System.out.println("I'm a simple javaagent!");
    }
}
