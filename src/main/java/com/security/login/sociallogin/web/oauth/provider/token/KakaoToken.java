package com.security.login.sociallogin.web.oauth.provider.token;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class KakaoToken {

    private String access_token;
    private String refresh_token;
    private String token_type;
    private int expires_in;

    private String id_token;
    private String scope;
    private int refresh_token_expires_in;
}
