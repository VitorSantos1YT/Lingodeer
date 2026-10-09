package com.google.firebase.sessions;

import c00.e;
import g00.d1;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class SessionDetails {
    public static final Companion Companion = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20938d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return SessionDetails$$serializer.f20939a;
        }

        public /* synthetic */ Companion(int i11) {
            this();
        }
    }

    public /* synthetic */ SessionDetails(long j11, String str, String str2, int i11, int i12) {
        if (15 != (i11 & 15)) {
            d1.k(i11, 15, SessionDetails$$serializer.f20939a.getDescriptor());
            throw null;
        }
        this.f20935a = str;
        this.f20936b = str2;
        this.f20937c = i12;
        this.f20938d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) obj;
        return m.a(this.f20935a, sessionDetails.f20935a) && m.a(this.f20936b, sessionDetails.f20936b) && this.f20937c == sessionDetails.f20937c && this.f20938d == sessionDetails.f20938d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20938d) + defpackage.e.b(this.f20937c, defpackage.e.d(this.f20935a.hashCode() * 31, 31, this.f20936b), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f20935a + ", firstSessionId=" + this.f20936b + ", sessionIndex=" + this.f20937c + ", sessionStartTimestampUs=" + this.f20938d + ')';
    }

    public SessionDetails(int i11, String str, String str2, long j11) {
        this.f20935a = str;
        this.f20936b = str2;
        this.f20937c = i11;
        this.f20938d = j11;
    }
}
