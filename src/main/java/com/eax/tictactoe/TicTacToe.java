package com.eax.tictactoe;

import static spark.Spark.*;
import spark.*;

public class TicTacToe {

    private static Game g = new Game();

    public static void main(String[] args) {
        staticFileLocation("/public");
        setPort(Integer.valueOf(System.getenv("PORT")));

        post(new Route("/game") {
            @Override
            public Object handle(Request request, Response response) {
                Integer pos = Integer.valueOf(request.queryParams("pos"));
                //String player = Integer.toString(g.getCurrentPlayer())
                Integer state = g.addMarker(pos);
                System.out.print(state);
                return state;
            }
        });

    }
}
