package app.model;

import org.springframework.stereotype.Component;

@Component("getTimer")
public class Timer extends Animal {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
