package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzjf extends zzje {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13203b;

    public zzjf(zzic zzicVar) {
        super(zzicVar);
        this.f13202a.A++;
    }

    public abstract boolean h();

    public final void i() {
        if (!this.f13203b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f13203b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (h()) {
            return;
        }
        this.f13202a.C.incrementAndGet();
        this.f13203b = true;
    }
}
