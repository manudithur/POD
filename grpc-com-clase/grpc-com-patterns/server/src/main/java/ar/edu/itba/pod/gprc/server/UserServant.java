package ar.edu.itba.pod.gprc.server;

import ar.edu.itba.pod.grpc.user.*;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.ClientResponseObserver;
import io.grpc.stub.StreamObserver;

import java.util.Map;

public class UserServant extends UserServiceGrpc.UserServiceImplBase{

    @Override
    public void doLogin(LoginInformation request, StreamObserver<User> responseObserver) {
        request.getUserName();
        request.getPassword();
        //EN CASO DE ERROR
        //responseObserver.onError(new StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED));

        User response = User.newBuilder()
                .setUserName(request.getUserName())
                .addPreferences("unsercure")
                .addPreferences("darkMode")
                .setStatus(AccountStatus.ACCOUNT_STATUS_ACTIVE)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getRoles(User request, StreamObserver<UserRoles> responseObserver) {
        UserRoles response = UserRoles.newBuilder()
                        .putRolesBySite("site1", Role.ADMIN)
                        .putRolesBySite("site2", Role.BUYER)
                        .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
