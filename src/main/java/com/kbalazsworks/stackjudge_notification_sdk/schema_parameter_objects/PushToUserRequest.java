package com.kbalazsworks.stackjudge_notification_sdk.schema_parameter_objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kbalazsworks.stackjudge_notification_sdk.common.interfaces.IOpenSdkPostable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.annotation.processing.Generated;
import java.util.List;

@Generated("OpenSDK: https://github.com/balazskrizsan/OpenSdk")
@Jacksonized
@Builder(access = AccessLevel.PUBLIC)
@AllArgsConstructor
@Getter
public final class PushToUserRequest implements IOpenSdkPostable
{
    @JsonProperty("userId")
    private final String userId;
    @JsonProperty("title")
    private final String title;
    @JsonProperty("message")
    private final String message;

    @Override
    public MultiValueMap<String, Object> toOpenSdkPost()
    {
        return new LinkedMultiValueMap<>()
        {{
            addAll("userId", List.of(userId));
            addAll("title", List.of(title));
            addAll("message", List.of(message));
        }};
    }
}
