package com.alibaba.sdk.android.oss.common.auth;

import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.DateUtil;
import defpackage.e;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class OSSFederationToken {
    private long expiration;
    private String securityToken;
    private String tempAk;
    private String tempSk;

    public OSSFederationToken(String str, String str2, String str3, long j11) {
        setTempAk(str);
        setTempSk(str2);
        setSecurityToken(str3);
        setExpiration(j11);
    }

    public long getExpiration() {
        return this.expiration;
    }

    public String getSecurityToken() {
        return this.securityToken;
    }

    public String getTempAK() {
        return this.tempAk;
    }

    public String getTempSK() {
        return this.tempSk;
    }

    public void setExpiration(long j11) {
        this.expiration = j11;
    }

    public void setExpirationInGMTFormat(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            this.expiration = simpleDateFormat.parse(str).getTime() / 1000;
        } catch (ParseException e8) {
            if (OSSLog.isEnableLog()) {
                e8.printStackTrace();
            }
            this.expiration = (DateUtil.getFixedSkewedTimeMillis() / 1000) + 30;
        }
    }

    public void setSecurityToken(String str) {
        this.securityToken = str;
    }

    public void setTempAk(String str) {
        this.tempAk = str;
    }

    public void setTempSk(String str) {
        this.tempSk = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OSSFederationToken [tempAk=");
        sb2.append(this.tempAk);
        sb2.append(", tempSk=");
        sb2.append(this.tempSk);
        sb2.append(", securityToken=");
        sb2.append(this.securityToken);
        sb2.append(", expiration=");
        return e.i(this.expiration, "]", sb2);
    }

    public boolean useSecurityToken() {
        return this.securityToken != null;
    }

    public OSSFederationToken(String str, String str2, String str3, String str4) {
        setTempAk(str);
        setTempSk(str2);
        setSecurityToken(str3);
        setExpirationInGMTFormat(str4);
    }
}
