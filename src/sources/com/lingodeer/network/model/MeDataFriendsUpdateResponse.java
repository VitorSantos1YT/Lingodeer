package com.lingodeer.network.model;

import com.google.android.material.datepicker.d;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class MeDataFriendsUpdateResponse {
    private final List<String> all_followings;

    public MeDataFriendsUpdateResponse(List<String> all_followings) {
        m.f(all_followings, "all_followings");
        this.all_followings = all_followings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MeDataFriendsUpdateResponse copy$default(MeDataFriendsUpdateResponse meDataFriendsUpdateResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = meDataFriendsUpdateResponse.all_followings;
        }
        return meDataFriendsUpdateResponse.copy(list);
    }

    public final List<String> component1() {
        return this.all_followings;
    }

    public final MeDataFriendsUpdateResponse copy(List<String> all_followings) {
        m.f(all_followings, "all_followings");
        return new MeDataFriendsUpdateResponse(all_followings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MeDataFriendsUpdateResponse) && m.a(this.all_followings, ((MeDataFriendsUpdateResponse) obj).all_followings);
    }

    public final List<String> getAll_followings() {
        return this.all_followings;
    }

    public int hashCode() {
        return this.all_followings.hashCode();
    }

    public String toString() {
        return d.l(this.all_followings, "MeDataFriendsUpdateResponse(all_followings=", ")");
    }
}
