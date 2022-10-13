package com.simplefunc;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SimpleResponseHandler implements RequestHandler<SimpleResponseDto, String> {

    @Override
    public String handleRequest(SimpleResponseDto simpleResponse, Context context) {
        return simpleResponse.getName();
    }
}
