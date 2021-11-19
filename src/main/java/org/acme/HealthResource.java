package org.acme;

import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;
import io.vertx.ext.web.RoutingContext;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RouteBase(path = "/api/v1")
public class HealthResource {

    @Route(path = "health", methods = Route.HttpMethod.GET)
    void health(RoutingContext context) {
        context.response().end("Meck meck! That coyote is never going to catch me!");
    }
}