package com.chess.engine.player;

/**
 * Created by Sourav Mangla on Feb, 2018
 */
public enum MoveStatus {
    DONE {
        @Override
        boolean isDone() {
            return true;
        }
    },
    ILLEGAL_MOVE{
        @Override
        boolean isDone() {
            return false;
        }
    },
    LEAVE_PLAYER_IN_CHECK{
        @Override
        boolean isDone() {
            return false;
        }
    };

    abstract boolean isDone();
}
