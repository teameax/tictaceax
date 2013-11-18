package com.eax.tictactoe;

import static spark.Spark.*;
import spark.*;

public class TicTacToe {

    private static Game g = new Game();

    public static void main(String[] args) {
        staticFileLocation("/public");
        setPort(Integer.valueOf(System.getenv("PORT")));

        post(new Route("/") {
            @Override
            public Object handle(Request request, Response response) {
                Integer pos = Integer.valueOf(request.queryParams("pos"));
                String player = Integer.toString(g.getCurrentPlayer());
                String state = Integer.toString(g.addMarker(pos));
                return "{\"player\":" + player + ",\"state\":" + state + "}";
            }
        });

    }
}
