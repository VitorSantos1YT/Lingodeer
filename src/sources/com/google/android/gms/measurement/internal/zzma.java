package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzma implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzmb f13382a;

    public zzma(zzmb zzmbVar) {
        Objects.requireNonNull(zzmbVar);
        this.f13382a = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13382a.f13390j = null;
    }
}
