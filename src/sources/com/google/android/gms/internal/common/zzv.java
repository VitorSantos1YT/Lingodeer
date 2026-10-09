package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzv extends zzk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9631d;

    @Override // com.google.android.gms.internal.common.zzk
    public final String a() {
        int i11;
        int i12 = this.f9630c;
        if (i12 == -1) {
            this.f9628b = 3;
            return null;
        }
        int iB = b(i12);
        if (iB == -1) {
            throw null;
        }
        int iC = c(iB);
        this.f9630c = iC;
        if (iC == i12) {
            this.f9630c = iC + 1;
            throw null;
        }
        if (i12 < iB || i12 < iB || (i11 = this.f9631d) == 1) {
            throw null;
        }
        this.f9631d = i11 - 1;
        throw null;
    }

    public abstract int b(int i11);

    public abstract int c(int i11);
}
