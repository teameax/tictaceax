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
                Integer player = g.getCurrentPlayer();
                Integer state = g.addMarker(pos);
                
                return (state + (10*player));
            }
        });

        get(new Route("/restart") {
            @Override
            public Object handle(Request request, Response response) {
                g = new Game();
                return null;

            }
        });

    }
}
