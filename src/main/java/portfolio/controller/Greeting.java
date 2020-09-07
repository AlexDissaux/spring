package portfolio.controller;


import lombok.Getter;

public class Greeting {

    private final @Getter long id;
    private final @Getter String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
