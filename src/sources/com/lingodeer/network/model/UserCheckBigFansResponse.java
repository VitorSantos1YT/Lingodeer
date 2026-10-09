package com.lingodeer.network.model;

import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import ep.a;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UserCheckBigFansResponse {
    private String create_profile_date;
    private String create_profile_version;
    private int user_type;

    public UserCheckBigFansResponse() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ UserCheckBigFansResponse copy$default(UserCheckBigFansResponse userCheckBigFansResponse, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = userCheckBigFansResponse.user_type;
        }
        if ((i12 & 2) != 0) {
            str = userCheckBigFansResponse.create_profile_version;
        }
        if ((i12 & 4) != 0) {
            str2 = userCheckBigFansResponse.create_profile_date;
        }
        return userCheckBigFansResponse.copy(i11, str, str2);
    }

    public final int component1() {
        return this.user_type;
    }

    public final String component2() {
        return this.create_profile_version;
    }

    public final String component3() {
        return this.create_profile_date;
    }

    public final UserCheckBigFansResponse copy(int i11, String create_profile_version, String create_profile_date) {
        m.f(create_profile_version, "create_profile_version");
        m.f(create_profile_date, "create_profile_date");
        return new UserCheckBigFansResponse(i11, create_profile_version, create_profile_date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCheckBigFansResponse)) {
            return false;
        }
        UserCheckBigFansResponse userCheckBigFansResponse = (UserCheckBigFansResponse) obj;
        return this.user_type == userCheckBigFansResponse.user_type && m.a(this.create_profile_version, userCheckBigFansResponse.create_profile_version) && m.a(this.create_profile_date, userCheckBigFansResponse.create_profile_date);
    }

    public final String getCreate_profile_date() {
        return this.create_profile_date;
    }

    public final String getCreate_profile_version() {
        return this.create_profile_version;
    }

    public final int getUser_type() {
        return this.user_type;
    }

    public int hashCode() {
        return this.create_profile_date.hashCode() + e.d(Integer.hashCode(this.user_type) * 31, 31, this.create_profile_version);
    }

    public final void setCreate_profile_date(String str) {
        m.f(str, "<set-?>");
        this.create_profile_date = str;
    }

    public final void setCreate_profile_version(String str) {
        m.f(str, "<set-?>");
        this.create_profile_version = str;
    }

    public final void setUser_type(int i11) {
        this.user_type = i11;
    }

    public String toString() {
        int i11 = this.user_type;
        String str = this.create_profile_version;
        String str2 = this.create_profile_date;
        StringBuilder sb2 = new StringBuilder("UserCheckBigFansResponse(user_type=");
        sb2.append(i11);
        sb2.append(", create_profile_version=");
        sb2.append(str);
        sb2.append(", create_profile_date=");
        return a.k(sb2, str2, ")");
    }

    public UserCheckBigFansResponse(int i11, String create_profile_version, String create_profile_date) {
        m.f(create_profile_version, "create_profile_version");
        m.f(create_profile_date, "create_profile_date");
        this.user_type = i11;
        this.create_profile_version = create_profile_version;
        this.create_profile_date = create_profile_date;
    }

    public /* synthetic */ UserCheckBigFansResponse(int i11, String str, String str2, int i12, f fVar) {
        this((i12 & 1) != 0 ? -1 : i11, (i12 & 2) != 0 ? BuildConfig.VERSION_NAME : str, (i12 & 4) != 0 ? BuildConfig.VERSION_NAME : str2);
    }
}
