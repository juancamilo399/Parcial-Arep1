package edu.escuelaing.arep;

import com.google.gson.Gson;
import edu.escuelaing.arep.services.Solve;

import static spark.Spark.*;

/**
 * Web Spark app class
 * @author Juan Camilo Angel Hernandez
 */
public class SparkWebApp {

    /**
     * servicios ofrecidos por el servidor
     * @param args
     */
    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/views");
        Gson gson = new Gson();

        get("/hello", (req, res) -> { return "Hello :D";});

        get("/solve", (request, response) -> {
            response.redirect("/index.html");
            response.status(200);
            return null;
        });

        post("/solve/sort/", (req, res) -> {
            res.type("application/json");
            String result = Solve.calculate(req.body());
            return gson.toJson(result);

        });
    }

    /**
     * retorna el puerto a ser utilizado
     * @return el puerto a ser utilizado
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; // returns default port if heroku-port isn't set(i.e. on localhost)
    }
}
