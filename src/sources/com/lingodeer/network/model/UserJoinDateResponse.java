package com.lingodeer.network.model;

import a.ar.MFeWs;
import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UserJoinDateResponse {
    private final String joined_date;

    public UserJoinDateResponse(String joined_date) {
        m.f(joined_date, "joined_date");
        this.joined_date = joined_date;
    }

    public static /* synthetic */ UserJoinDateResponse copy$default(UserJoinDateResponse userJoinDateResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userJoinDateResponse.joined_date;
        }
        return userJoinDateResponse.copy(str);
    }

    public final String component1() {
        return this.joined_date;
    }

    public final UserJoinDateResponse copy(String joined_date) {
        m.f(joined_date, "joined_date");
        return new UserJoinDateResponse(joined_date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserJoinDateResponse) && m.a(this.joined_date, ((UserJoinDateResponse) obj).joined_date);
    }

    public final String getJoined_date() {
        return this.joined_date;
    }

    public int hashCode() {
        return this.joined_date.hashCode();
    }

    public String toString() {
        return a.g("UserJoinDateResponse(joined_date=", this.joined_date, MFeWs.csotfDlkzJqKAL);
    }
}
