package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmz implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentName f13461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zznf f13462b;

    public zzmz(zznf zznfVar, ComponentName componentName) {
        this.f13461a = componentName;
        this.f13462b = zznfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13462b.f13474c.r(this.f13461a);
    }
}
