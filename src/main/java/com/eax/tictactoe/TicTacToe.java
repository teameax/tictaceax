package com.eax.tictactoe;

import static spark.Spark.*;
import spark.*;

public class TicTacToe {

    public static void main(String[] args) {
        staticFileLocation("/public");
        setPort(Integer.valueOf(System.getenv("PORT")));
        get(new Route("/game") {
            @Override
            public Object handle(Request request, Response response) {
                return "Welcome to Tic-Tac-Toe";
            }
        });
    }
}
