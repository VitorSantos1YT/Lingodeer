package com.lingodeer.network.model;

import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseUserDbAuthResponse {
    private String custom_uid_jwt;

    /* JADX WARN: Multi-variable type inference failed */
    public FirebaseUserDbAuthResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FirebaseUserDbAuthResponse copy$default(FirebaseUserDbAuthResponse firebaseUserDbAuthResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = firebaseUserDbAuthResponse.custom_uid_jwt;
        }
        return firebaseUserDbAuthResponse.copy(str);
    }

    public final String component1() {
        return this.custom_uid_jwt;
    }

    public final FirebaseUserDbAuthResponse copy(String custom_uid_jwt) {
        m.f(custom_uid_jwt, "custom_uid_jwt");
        return new FirebaseUserDbAuthResponse(custom_uid_jwt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirebaseUserDbAuthResponse) && m.a(this.custom_uid_jwt, ((FirebaseUserDbAuthResponse) obj).custom_uid_jwt);
    }

    public final String getCustom_uid_jwt() {
        return this.custom_uid_jwt;
    }

    public int hashCode() {
        return this.custom_uid_jwt.hashCode();
    }

    public final void setCustom_uid_jwt(String str) {
        m.f(str, "<set-?>");
        this.custom_uid_jwt = str;
    }

    public String toString() {
        return a.g("FirebaseUserDbAuthResponse(custom_uid_jwt=", this.custom_uid_jwt, ")");
    }

    public FirebaseUserDbAuthResponse(String custom_uid_jwt) {
        m.f(custom_uid_jwt, "custom_uid_jwt");
        this.custom_uid_jwt = custom_uid_jwt;
    }

    public /* synthetic */ FirebaseUserDbAuthResponse(String str, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str);
    }
}
