package com.softjake.vtx.proto.one;

import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

    public static void main(String[] args) {
        Runner.runExample(MainVerticle.class);
    }

    @Override
    public void start() {
        vertx.createHttpServer().requestHandler(req -> {
           req.response()
           .putHeader("content-type", "text/html")
           .end("<html><body><h1>Hello world</h1></body></html>");
        }).listen(8001);
    }

}
