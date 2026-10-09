package com.google.firebase.sessions;

import defpackage.e;
import hh.p0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DataCollectionStatus f20975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20977g;

    public SessionInfo(String sessionId, String firstSessionId, int i11, long j11, DataCollectionStatus dataCollectionStatus, String str, String firebaseAuthenticationToken) {
        m.f(sessionId, "sessionId");
        m.f(firstSessionId, "firstSessionId");
        m.f(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f20971a = sessionId;
        this.f20972b = firstSessionId;
        this.f20973c = i11;
        this.f20974d = j11;
        this.f20975e = dataCollectionStatus;
        this.f20976f = str;
        this.f20977g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return m.a(this.f20971a, sessionInfo.f20971a) && m.a(this.f20972b, sessionInfo.f20972b) && this.f20973c == sessionInfo.f20973c && this.f20974d == sessionInfo.f20974d && m.a(this.f20975e, sessionInfo.f20975e) && m.a(this.f20976f, sessionInfo.f20976f) && m.a(this.f20977g, sessionInfo.f20977g);
    }

    public final int hashCode() {
        return this.f20977g.hashCode() + e.d((this.f20975e.hashCode() + e.f(this.f20974d, e.b(this.f20973c, e.d(this.f20971a.hashCode() * 31, 31, this.f20972b), 31), 31)) * 31, 31, this.f20976f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.f20971a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f20972b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f20973c);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.f20974d);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.f20975e);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f20976f);
        sb2.append(", firebaseAuthenticationToken=");
        return p0.o(sb2, this.f20977g, ')');
    }
}
