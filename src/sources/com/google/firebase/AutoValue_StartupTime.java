package com.google.firebase;

import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_StartupTime extends StartupTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17710c;

    public AutoValue_StartupTime(long j11, long j12, long j13) {
        this.f17708a = j11;
        this.f17709b = j12;
        this.f17710c = j13;
    }

    @Override // com.google.firebase.StartupTime
    public final long a() {
        return this.f17709b;
    }

    @Override // com.google.firebase.StartupTime
    public final long b() {
        return this.f17708a;
    }

    @Override // com.google.firebase.StartupTime
    public final long c() {
        return this.f17710c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartupTime)) {
            return false;
        }
        StartupTime startupTime = (StartupTime) obj;
        return this.f17708a == startupTime.b() && this.f17709b == startupTime.a() && this.f17710c == startupTime.c();
    }

    public final int hashCode() {
        long j11 = this.f17708a;
        long j12 = this.f17709b;
        int i11 = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f17710c;
        return i11 ^ ((int) ((j13 >>> 32) ^ j13));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f17708a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f17709b);
        sb2.append(", uptimeMillis=");
        return e.i(this.f17710c, "}", sb2);
    }
}
