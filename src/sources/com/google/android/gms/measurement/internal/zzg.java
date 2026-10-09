package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzg extends zzf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12895b;

    public zzg(zzic zzicVar) {
        super(zzicVar);
        this.f13202a.A++;
    }

    public final void h() {
        if (!this.f12895b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void i() {
        if (this.f12895b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (j()) {
            return;
        }
        this.f13202a.C.incrementAndGet();
        this.f12895b = true;
    }

    public abstract boolean j();
}
