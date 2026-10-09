package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbw extends zzcc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f11478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11480d;

    public final zzcd a() {
        if (this.f11478b == 1 && this.f11477a != null && this.f11479c != 0 && this.f11480d != 0) {
            return new zzbx(this.f11477a, this.f11479c, this.f11480d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f11477a == null) {
            sb2.append(" fileOwner");
        }
        if (this.f11478b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f11479c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f11480d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
