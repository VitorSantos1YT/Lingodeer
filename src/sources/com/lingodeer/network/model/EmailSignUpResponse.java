package com.lingodeer.network.model;

import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class EmailSignUpResponse {
    private String uid;

    /* JADX WARN: Multi-variable type inference failed */
    public EmailSignUpResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EmailSignUpResponse copy$default(EmailSignUpResponse emailSignUpResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = emailSignUpResponse.uid;
        }
        return emailSignUpResponse.copy(str);
    }

    public final String component1() {
        return this.uid;
    }

    public final EmailSignUpResponse copy(String uid) {
        m.f(uid, "uid");
        return new EmailSignUpResponse(uid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmailSignUpResponse) && m.a(this.uid, ((EmailSignUpResponse) obj).uid);
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return this.uid.hashCode();
    }

    public final void setUid(String str) {
        m.f(str, "<set-?>");
        this.uid = str;
    }

    public String toString() {
        return a.g("EmailSignUpResponse(uid=", this.uid, ")");
    }

    public EmailSignUpResponse(String uid) {
        m.f(uid, "uid");
        this.uid = uid;
    }

    public /* synthetic */ EmailSignUpResponse(String str, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str);
    }
}
