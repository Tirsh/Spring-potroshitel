package org.example;


import jakarta.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 10)
    private int repeat;
    private String message;

    public TerminatorQuoter() {
        System.out.println("Phase one");
    }

    @PostConstruct
    public void init(){
        System.out.println("Phase two");
        System.out.println(repeat);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Message: " + message);
        }
    }
}
