package com.kbalazsworks.stackjudge_notification_sdk.common.entities;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import java.util.Objects;

public final class StdResponse<T>
{
    private final HttpStatus  status;
    private final HttpHeaders headers;
    private final T           data;

    public StdResponse(HttpStatus status, HttpHeaders headers, T data)
    {
        this.status  = status;
        this.headers = headers;
        this.data    = data;
    }

    public HttpStatus status()
    {
        return status;
    }

    public HttpHeaders headers()
    {
        return headers;
    }

    public T data()
    {
        return data;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        var that = (StdResponse) obj;
        return Objects.equals(this.status, that.status) &&
            Objects.equals(this.headers, that.headers) &&
            Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(status, headers, data);
    }

    @Override
    public String toString()
    {
        return "OpenSdkStdResponse[" +
            "status=" + status + ", " +
            "headers=" + headers + ", " +
            "data=" + data + ']';
    }
}
