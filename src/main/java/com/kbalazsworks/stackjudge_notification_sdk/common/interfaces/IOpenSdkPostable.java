package com.kbalazsworks.stackjudge_notification_sdk.common.interfaces;

import org.springframework.util.MultiValueMap;

public interface IOpenSdkPostable
{
    MultiValueMap<String, Object> toOpenSdkPost();
}
