package io.github.venkat1701;

import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import reactor.core.publisher.Mono;

public class Main {
    public static void main(String[] args) {
        DiscordClient client = DiscordClient.create("");
        Mono<Void> login = client.withGateway((GatewayDiscordClient gateway) -> Mono.empty());
        login.block();
        System.out.println("Hello world!");
    }
}