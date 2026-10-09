package com.lingodeer.network.model;

import bw.ORXQ.ADSb;
import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UseShareFinishedLessonsResponse {
    private final String unique_key;

    public static /* synthetic */ UseShareFinishedLessonsResponse copy$default(UseShareFinishedLessonsResponse useShareFinishedLessonsResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = useShareFinishedLessonsResponse.unique_key;
        }
        return useShareFinishedLessonsResponse.copy(str);
    }

    public final String component1() {
        return this.unique_key;
    }

    public final UseShareFinishedLessonsResponse copy(String unique_key) {
        m.f(unique_key, "unique_key");
        return new UseShareFinishedLessonsResponse(unique_key);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UseShareFinishedLessonsResponse) && m.a(this.unique_key, ((UseShareFinishedLessonsResponse) obj).unique_key);
    }

    public final String getUnique_key() {
        return this.unique_key;
    }

    public int hashCode() {
        return this.unique_key.hashCode();
    }

    public String toString() {
        return a.g("UseShareFinishedLessonsResponse(unique_key=", this.unique_key, ")");
    }

    public UseShareFinishedLessonsResponse(String str) {
        m.f(str, ADSb.liTVrUTNW);
        this.unique_key = str;
    }
}
