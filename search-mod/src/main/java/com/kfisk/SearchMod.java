package com.kfisk;

import java.util.List;

import io.javalin.Javalin;
import io.javalin.http.Context;

/**
 *
 * @author kotteletfisk
 */
public class SearchMod {

    public static void main(String[] args) {
        var handler = new RequestHandler();

        Javalin.create(/*config*/)
                .get("/", ctx -> handler.handleSearch(ctx))
                .start(7070);
    }
}

class RequestHandler {

    SearchDAO dao = new ContentDAOFake();

    void handleSearch(Context ctx) {

        String input = ctx.queryParam("search");
        List<ContentMeta> results = dao.searchContent(input);
        ctx.status(200);
        ctx.json(results);
    }
}
