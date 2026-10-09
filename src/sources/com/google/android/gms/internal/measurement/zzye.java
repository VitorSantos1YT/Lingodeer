package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzye implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzyd f12176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzyf f12177b;

    public zzye(zzyf zzyfVar, zzyd zzydVar) {
        this.f12176a = zzydVar;
        Objects.requireNonNull(zzyfVar);
        this.f12177b = zzyfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12177b.f12178a.remove(this.f12176a);
    }
}
