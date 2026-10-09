package com.lingodeer.network.model;

import com.google.android.material.datepicker.d;
import com.google.gson.annotations.SerializedName;
import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class AssAclResponse {

    @SerializedName("Expiration")
    private final String expiration;

    @SerializedName("Expiration2")
    private final String expiration2;

    @SerializedName("KeyId")
    private final String keyId;

    @SerializedName("KeySecret")
    private final String keySecret;

    @SerializedName("Token")
    private final String token;

    public AssAclResponse(String keyId, String keySecret, String token, String expiration, String expiration2) {
        m.f(keyId, "keyId");
        m.f(keySecret, "keySecret");
        m.f(token, "token");
        m.f(expiration, "expiration");
        m.f(expiration2, "expiration2");
        this.keyId = keyId;
        this.keySecret = keySecret;
        this.token = token;
        this.expiration = expiration;
        this.expiration2 = expiration2;
    }

    public static /* synthetic */ AssAclResponse copy$default(AssAclResponse assAclResponse, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = assAclResponse.keyId;
        }
        if ((i11 & 2) != 0) {
            str2 = assAclResponse.keySecret;
        }
        if ((i11 & 4) != 0) {
            str3 = assAclResponse.token;
        }
        if ((i11 & 8) != 0) {
            str4 = assAclResponse.expiration;
        }
        if ((i11 & 16) != 0) {
            str5 = assAclResponse.expiration2;
        }
        String str6 = str5;
        String str7 = str3;
        return assAclResponse.copy(str, str2, str7, str4, str6);
    }

    public final String component1() {
        return this.keyId;
    }

    public final String component2() {
        return this.keySecret;
    }

    public final String component3() {
        return this.token;
    }

    public final String component4() {
        return this.expiration;
    }

    public final String component5() {
        return this.expiration2;
    }

    public final AssAclResponse copy(String keyId, String keySecret, String token, String expiration, String expiration2) {
        m.f(keyId, "keyId");
        m.f(keySecret, "keySecret");
        m.f(token, "token");
        m.f(expiration, "expiration");
        m.f(expiration2, "expiration2");
        return new AssAclResponse(keyId, keySecret, token, expiration, expiration2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssAclResponse)) {
            return false;
        }
        AssAclResponse assAclResponse = (AssAclResponse) obj;
        return m.a(this.keyId, assAclResponse.keyId) && m.a(this.keySecret, assAclResponse.keySecret) && m.a(this.token, assAclResponse.token) && m.a(this.expiration, assAclResponse.expiration) && m.a(this.expiration2, assAclResponse.expiration2);
    }

    public final String getExpiration() {
        return this.expiration;
    }

    public final String getExpiration2() {
        return this.expiration2;
    }

    public final String getKeyId() {
        return this.keyId;
    }

    public final String getKeySecret() {
        return this.keySecret;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.expiration2.hashCode() + e.d(e.d(e.d(this.keyId.hashCode() * 31, 31, this.keySecret), 31, this.token), 31, this.expiration);
    }

    public String toString() {
        String str = this.keyId;
        String str2 = this.keySecret;
        String str3 = this.token;
        String str4 = this.expiration;
        String str5 = this.expiration2;
        StringBuilder sbS = e.s("AssAclResponse(keyId=", str, ", keySecret=", str2, ", token=");
        d.w(sbS, str3, ", expiration=", str4, ", expiration2=");
        return a.k(sbS, str5, ")");
    }
}
