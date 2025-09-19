package edu.nd.paradigms.hw2;

public class GameAlreadyOverException extends IllegalStateException {
    public GameAlreadyOverException(String message) {
        super(message);
    }
}
