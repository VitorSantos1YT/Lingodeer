package com.lingodeer.network.model;

import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class GrantUserCampCodeResponse {
    private final String code;

    public GrantUserCampCodeResponse(String code) {
        m.f(code, "code");
        this.code = code;
    }

    public static /* synthetic */ GrantUserCampCodeResponse copy$default(GrantUserCampCodeResponse grantUserCampCodeResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = grantUserCampCodeResponse.code;
        }
        return grantUserCampCodeResponse.copy(str);
    }

    public final String component1() {
        return this.code;
    }

    public final GrantUserCampCodeResponse copy(String code) {
        m.f(code, "code");
        return new GrantUserCampCodeResponse(code);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GrantUserCampCodeResponse) && m.a(this.code, ((GrantUserCampCodeResponse) obj).code);
    }

    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        return this.code.hashCode();
    }

    public String toString() {
        return a.g("GrantUserCampCodeResponse(code=", this.code, ")");
    }
}
