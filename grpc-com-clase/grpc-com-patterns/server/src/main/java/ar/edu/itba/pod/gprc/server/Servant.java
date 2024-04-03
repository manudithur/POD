package ar.edu.itba.pod.gprc.server;


import ar.edu.itba.pod.grpc.health.HealthServiceGrpc;
import ar.edu.itba.pod.grpc.health.PingRequest;
import ar.edu.itba.pod.grpc.health.PingResponse;

public class Servant extends HealthServiceGrpc.HealthServiceImplBase {
    @Override
    public void ping(PingRequest request, io.grpc.stub.StreamObserver<PingResponse> responseObserver) {
        PingResponse response = PingResponse.newBuilder().setMessage("Hello world").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
