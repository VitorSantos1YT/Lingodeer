package com.google.android.gms.measurement.internal;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzoc extends zzg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.zzcl f13536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzob f13538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzoa f13539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzny f13540g;

    public zzoc(zzic zzicVar) {
        super(zzicVar);
        this.f13537d = true;
        this.f13538e = new zzob(this);
        this.f13539f = new zzoa(this);
        this.f13540g = new zzny(this);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean j() {
        return false;
    }

    public final void k() {
        g();
        if (this.f13536c == null) {
            this.f13536c = new com.google.android.gms.internal.measurement.zzcl(Looper.getMainLooper());
        }
    }
}
