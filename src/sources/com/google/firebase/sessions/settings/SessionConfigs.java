package com.google.firebase.sessions.settings;

import c00.a;
import c00.e;
import g00.d1;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class SessionConfigs {
    public static final Companion Companion = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f21084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f21085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f21086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f21087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f21088e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return SessionConfigs$$serializer.f21089a;
        }

        public /* synthetic */ Companion(int i11) {
            this();
        }
    }

    public /* synthetic */ SessionConfigs(int i11, Boolean bool, Double d5, Integer num, Integer num2, Long l9) {
        if (31 != (i11 & 31)) {
            d1.k(i11, 31, SessionConfigs$$serializer.f21089a.getDescriptor());
            throw null;
        }
        this.f21084a = bool;
        this.f21085b = d5;
        this.f21086c = num;
        this.f21087d = num2;
        this.f21088e = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) obj;
        return m.a(this.f21084a, sessionConfigs.f21084a) && m.a(this.f21085b, sessionConfigs.f21085b) && m.a(this.f21086c, sessionConfigs.f21086c) && m.a(this.f21087d, sessionConfigs.f21087d) && m.a(this.f21088e, sessionConfigs.f21088e);
    }

    public final int hashCode() {
        Boolean bool = this.f21084a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d5 = this.f21085b;
        int iHashCode2 = (iHashCode + (d5 == null ? 0 : d5.hashCode())) * 31;
        Integer num = this.f21086c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f21087d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l9 = this.f21088e;
        return iHashCode4 + (l9 != null ? l9.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f21084a + ", sessionSamplingRate=" + this.f21085b + ", sessionTimeoutSeconds=" + this.f21086c + ", cacheDurationSeconds=" + this.f21087d + ", cacheUpdatedTimeSeconds=" + this.f21088e + ')';
    }

    public SessionConfigs(Boolean bool, Double d5, Integer num, Integer num2, Long l9) {
        this.f21084a = bool;
        this.f21085b = d5;
        this.f21086c = num;
        this.f21087d = num2;
        this.f21088e = l9;
    }
}
