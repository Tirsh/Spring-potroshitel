package org.example;


import jakarta.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 10)
    private int repeat;
    private String message;

    public TerminatorQuoter() {
        System.out.println("Phase one");
        System.out.println("Constructor run");
        System.out.println("---------------");
    }

    @PostConstruct
    public void init(){
        System.out.println("Phase two");
        System.out.println("PostConstruct");
        System.out.println(repeat);
        System.out.println("---------------");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("Phase three");
        for (int i = 0; i < repeat; i++) {
            System.out.println("Message: " + message);
        }
    }
}
