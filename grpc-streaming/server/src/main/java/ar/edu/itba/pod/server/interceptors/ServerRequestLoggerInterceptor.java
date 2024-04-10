package ar.edu.itba.pod.server.interceptors;

import io.grpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class ServerRequestLoggerInterceptor implements ServerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(ServerRequestLoggerInterceptor.class);
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call, Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {
        final String rpcId = UUID.randomUUID().toString();
        final MethodDescriptor<ReqT, RespT> methodDescriptor =
                call.getMethodDescriptor();
        final String serviceName = methodDescriptor.getServiceName();
        final String methodName = methodDescriptor.getBareMethodName();
        logger.info("Call {}: {}#{}", rpcId, serviceName, methodName);
        return next.startCall(call, headers);
    }
}