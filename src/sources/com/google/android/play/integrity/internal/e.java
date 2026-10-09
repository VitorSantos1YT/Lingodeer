package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16262b;

    public e(int i11, long j11) {
        this.f16261a = i11;
        this.f16262b = j11;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final int a() {
        return this.f16261a;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final long b() {
        return this.f16262b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f16261a == fVar.a() && this.f16262b == fVar.b();
    }

    public final int hashCode() {
        long j11 = this.f16262b;
        return ((int) ((j11 >>> 32) ^ j11)) ^ ((this.f16261a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventRecord{eventType=");
        sb2.append(this.f16261a);
        sb2.append(", eventTimestamp=");
        return defpackage.e.i(this.f16262b, "}", sb2);
    }
}
