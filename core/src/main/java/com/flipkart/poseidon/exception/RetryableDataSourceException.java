package com.flipkart.poseidon.exception;

public class RetryableDataSourceException extends DataSourceException{
    public RetryableDataSourceException(Object response) {
        super(response);
    }

    public RetryableDataSourceException(int statusCode) {
        super(statusCode);
    }

    public RetryableDataSourceException(Object response, int statusCode) {
        super(response, statusCode);
    }
}
