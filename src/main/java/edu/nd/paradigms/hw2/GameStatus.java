package edu.nd.paradigms.hw2;

/**
 * This enum describes the current state of the World game, either {@link GameStatus#IN_PROGRESS},
 * {@link GameStatus#WIN}, or {@link GameStatus#LOSS},
 */
public enum GameStatus {
    /**
     * The game is ongoing, and has not yet been resolved
     */
    IN_PROGRESS,
    /**
     * The game has ended in a loss due to running out of guesses
     */
    LOSS,
    /**
     * The game has ended in a win due to the user guessing the correct answer
     */
    WIN
}
