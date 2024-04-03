package ar.edu.itba.pod.gprc.client;

import ar.edu.itba.pod.grpc.health.HealthServiceGrpc;
import ar.edu.itba.pod.grpc.health.PingRequest;
import ar.edu.itba.pod.grpc.health.PingResponse;
import ar.edu.itba.pod.grpc.user.LoginInformation;
import ar.edu.itba.pod.grpc.user.User;
import ar.edu.itba.pod.grpc.user.UserRoles;
import ar.edu.itba.pod.grpc.user.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class Client {
    private static Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) throws InterruptedException {
        logger.info("grpc-com-patterns Client Starting ...");
        logger.info("grpc-com-patterns Client Starting ...");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        try {
//            HealthServiceGrpc.HealthServiceBlockingStub stub = HealthServiceGrpc.newBlockingStub(channel);
//            PingResponse response = stub.ping(PingRequest.newBuilder().build());
//            logger.info("Response: " + response.getMessage());

            UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
            User user = stub.doLogin(LoginInformation.newBuilder().setUserName("user").setPassword("pass").build());
            UserRoles roles = stub.getRoles(user);

            roles.getRolesBySiteMap().forEach((site, role) -> {
                logger.info("Site: " + site + " Role: " + role);
            });

        } finally {
            channel.shutdown().awaitTermination(10, TimeUnit.SECONDS);
        }
    }
}
