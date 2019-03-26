package com.aws.codestar.projecttemplates.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.aws.codestar.projecttemplates.GatewayResponse;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Handler for requests to Lambda function.
 */
public class HelloWorldHandler implements RequestHandler<Object, Object> {

    private static AtomicInteger counter = new AtomicInteger();

    public Object handleRequest(final Object input, final Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return new GatewayResponse(new JSONObject().put("Output", "Hello World "+counter.incrementAndGet()+" !").toString(), headers, 200);
    }
}
