package com.flipkart.poseidon.exception;

import com.flipkart.poseidon.serviceclients.RetryableException;

public final class DataSourceExceptionFactory {


    public static DataSourceException getDataSourceException(Object response, Exception e) {
        return getDataSourceException(response, e instanceof RetryableException);
    }

    public static DataSourceException getDataSourceException(int statusCode, Exception e) {
        return getDataSourceException(java.util.Optional.of(statusCode), e instanceof RetryableException);
    }

    public static DataSourceException getDataSourceException(Object response, int statusCode, Exception e) {
        return getDataSourceException(response, statusCode, e instanceof RetryableException);
    }

    public static DataSourceException getDataSourceException(int statusCode, Boolean retryable) {
        return retryable ? new RetryableDataSourceException(null, statusCode) : new NonRetryableDataSourceException(null, statusCode);
    }

    public static DataSourceException getDataSourceException(Object response, Boolean retryable) {
        return retryable ? new RetryableDataSourceException(response, -1) : new NonRetryableDataSourceException(response, -1);
    }


    public static DataSourceException getDataSourceException(Object response, int statusCode, Boolean retryable) {
        return retryable ? new RetryableDataSourceException(response, statusCode) : new NonRetryableDataSourceException(response, statusCode);
    }

    public static DataSourceException getDataSourceException(Object response) {
        return getDataSourceException(response, false);
    }

    public static DataSourceException getDataSourceException(int statusCode) {
        return getDataSourceException(java.util.Optional.of(statusCode), false);
    }

    public static DataSourceException getDataSourceException(Object response, int statusCode) {
        return getDataSourceException(response, statusCode, false);
    }

}
