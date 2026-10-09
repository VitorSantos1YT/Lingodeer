package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzos extends zzol {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13562c;

    public zzos(zzpg zzpgVar) {
        super(zzpgVar);
        this.f13552b.f13611r++;
    }

    public final void h() {
        if (!this.f13562c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void i() {
        if (this.f13562c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.f13552b.f13612s++;
        this.f13562c = true;
    }

    public abstract void j();
}
