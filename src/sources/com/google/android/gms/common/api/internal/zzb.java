package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f8857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzc f8859c;

    public zzb(zzc zzcVar, LifecycleCallback lifecycleCallback, String str) {
        this.f8857a = lifecycleCallback;
        this.f8858b = str;
        this.f8859c = zzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzc zzcVar = this.f8859c;
        int i11 = zzcVar.f8861b;
        LifecycleCallback lifecycleCallback = this.f8857a;
        if (i11 > 0) {
            Bundle bundle = zzcVar.f8862c;
            lifecycleCallback.onCreate(bundle != null ? bundle.getBundle(this.f8858b) : null);
        }
        if (zzcVar.f8861b >= 2) {
            lifecycleCallback.onStart();
        }
        if (zzcVar.f8861b >= 3) {
            lifecycleCallback.onResume();
        }
        if (zzcVar.f8861b >= 4) {
            lifecycleCallback.onStop();
        }
        if (zzcVar.f8861b >= 5) {
            lifecycleCallback.onDestroy();
        }
    }
}
