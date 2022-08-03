package com.flipkart.poseidon.exception;

public class NonRetryableDataSourceException extends DataSourceException{
    public NonRetryableDataSourceException(Object response) {
        super(response);
    }

    public NonRetryableDataSourceException(int statusCode) {
        super(statusCode);
    }

    public NonRetryableDataSourceException(Object response, int statusCode) {
        super(response, statusCode);
    }
}
