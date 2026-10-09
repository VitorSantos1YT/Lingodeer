package com.lingo.lingoskill.http.object;

import com.lingodeer.data.env.Env;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class OssToken {
    private String Expiration;
    private Long Expiration2;
    private String KeyId;
    private String KeySecret;
    private String Token;
    private String error;
    private long servertime;
    private int status;

    public String getError() {
        return this.error;
    }

    public String getExpiration() {
        return this.Expiration;
    }

    public Long getExpiration2() {
        return this.Expiration2;
    }

    public String getKeyId() {
        return this.KeyId;
    }

    public String getKeySecret() {
        return this.KeySecret;
    }

    public long getServertime() {
        return this.servertime;
    }

    public int getStatus() {
        return this.status;
    }

    public String getToken() {
        return this.Token;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setExpiration(String str) {
        this.Expiration = str;
    }

    public void setExpiration2(Long l9) {
        this.Expiration2 = l9;
    }

    public void setKeyId(String str) {
        this.KeyId = str;
    }

    public void setKeySecret(String str) {
        this.KeySecret = str;
    }

    public void setServertime(long j11) {
        this.servertime = j11;
    }

    public void setStatus(int i11) {
        this.status = i11;
    }

    public void setToken(String str) {
        this.Token = str;
    }

    public void updateEnv(Env env) {
        env.ossExpires = this.Expiration2.longValue();
        env.ossAccessKeyId = getKeyId();
        env.ossAccessKeySecret = getKeySecret();
        env.ossToken = getToken();
        env.updateEntries(new String[]{"ossExpires", "ossAccessKeyId", "ossAccessKeySecret", "ossToken"});
    }
}
