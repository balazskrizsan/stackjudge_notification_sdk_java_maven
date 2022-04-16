package com.kbalazsworks.stackjudge_notification_sdk.schema_interfaces;

import com.kbalazsworks.stackjudge_notification_sdk.common.exceptions.ResponseException;
import com.kbalazsworks.stackjudge_notification_sdk.common.entities.StdResponse;
import com.kbalazsworks.stackjudge_notification_sdk.common.interfaces.IOpenSdkPostable;
import com.kbalazsworks.stackjudge_notification_sdk.schema_parameter_objects.*;

import javax.annotation.processing.Generated;

@Generated("OpenSDK: https://github.com/balazskrizsan/OpenSdk")
public interface IPushTouser
{
    default String getApiUri()
    {
        return "/push/to-user";
    }

    void execute(IOpenSdkPostable pushToUserRequest)
    throws ResponseException;
}
