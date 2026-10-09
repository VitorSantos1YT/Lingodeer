package com.google.firebase.crashlytics.internal.metadata;

import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18394f;

    public AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j11) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f18390b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f18391c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f18392d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f18393e = str4;
        this.f18394f = j11;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String b() {
        return this.f18391c;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String c() {
        return this.f18392d;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String d() {
        return this.f18390b;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final long e() {
        return this.f18394f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        return this.f18390b.equals(rolloutAssignment.d()) && this.f18391c.equals(rolloutAssignment.b()) && this.f18392d.equals(rolloutAssignment.c()) && this.f18393e.equals(rolloutAssignment.f()) && this.f18394f == rolloutAssignment.e();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String f() {
        return this.f18393e;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f18390b.hashCode() ^ 1000003) * 1000003) ^ this.f18391c.hashCode()) * 1000003) ^ this.f18392d.hashCode()) * 1000003) ^ this.f18393e.hashCode()) * 1000003;
        long j11 = this.f18394f;
        return iHashCode ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f18390b);
        sb2.append(", parameterKey=");
        sb2.append(this.f18391c);
        sb2.append(", parameterValue=");
        sb2.append(this.f18392d);
        sb2.append(", variantId=");
        sb2.append(this.f18393e);
        sb2.append(", templateVersion=");
        return e.i(this.f18394f, "}", sb2);
    }
}
