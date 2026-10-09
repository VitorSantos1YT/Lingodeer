package com.google.firebase.sessions;

import c00.e;
import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class Time {
    public static final Companion Companion = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21024c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return Time$$serializer.f21025a;
        }

        public /* synthetic */ Companion(int i11) {
            this();
        }
    }

    public /* synthetic */ Time(int i11, long j11, long j12, long j13) {
        if (1 != (i11 & 1)) {
            d1.k(i11, 1, Time$$serializer.f21025a.getDescriptor());
            throw null;
        }
        this.f21022a = j11;
        this.f21023b = (i11 & 2) == 0 ? ((long) 1000) * j11 : j12;
        if ((i11 & 4) == 0) {
            this.f21024c = j11 / ((long) 1000);
        } else {
            this.f21024c = j13;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Time) && this.f21022a == ((Time) obj).f21022a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21022a);
    }

    public final String toString() {
        return "Time(ms=" + this.f21022a + ')';
    }

    public Time(long j11) {
        this.f21022a = j11;
        long j12 = 1000;
        this.f21023b = j11 * j12;
        this.f21024c = j11 / j12;
    }
}
