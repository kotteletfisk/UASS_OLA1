package com.kfisk;

import java.util.List;

import io.javalin.Javalin;
import io.javalin.http.Context;

/**
 *
 * @author kotteletfisk
 */
public class RecommendMod {

    public static void main(String[] args) {

        var handler = new RecommendHandler();

        Javalin.create(/*config*/)
                .get("/", ctx -> handler.handleRecommend(ctx))
                .start(7071);
    }
}

class RecommendHandler {

    RecommendDAO dao = new RecommendDAOFake();

    void handleRecommend(Context ctx) {

        List<ContentMeta> results = dao.recommendContent();

        ctx.status(200);
        ctx.json(results);
    }
}
