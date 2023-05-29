package com.example.skeleton.filter;

import com.amazonaws.serverless.proxy.internal.servlet.AwsProxyHttpServletRequest;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Slf4j
@Component
public class HttpHeaderFilter extends OncePerRequestFilter {

    private static final String X_REQ_ID_HEADER_KEY = "X-Req-Id";

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        boolean isAwsProxy = request instanceof AwsProxyHttpServletRequest;
        if (isAwsProxy) {
            AwsProxyHttpServletRequest awsProxyHttpServletRequest = (AwsProxyHttpServletRequest) request;
            String value = awsProxyHttpServletRequest.getAwsProxyRequest().getHeaders().get(X_REQ_ID_HEADER_KEY);
            response.addHeader(X_REQ_ID_HEADER_KEY, value);
        }
        filterChain.doFilter(request, response);
    }
}
