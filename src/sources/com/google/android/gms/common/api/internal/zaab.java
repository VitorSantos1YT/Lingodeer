package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import y.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zaab extends zap {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f8769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GoogleApiManager f8770f;

    public zaab(LifecycleFragment lifecycleFragment, GoogleApiManager googleApiManager, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment, googleApiAvailability);
        this.f8769e = new f(0);
        this.f8770f = googleApiManager;
        this.mLifecycleFragment.c("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void a(ConnectionResult connectionResult, int i11) {
        this.f8770f.h(connectionResult, i11);
    }

    @Override // com.google.android.gms.common.api.internal.zap
    public final void b() {
        com.google.android.gms.internal.base.zao zaoVar = this.f8770f.P;
        zaoVar.sendMessage(zaoVar.obtainMessage(3));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        if (this.f8769e.isEmpty()) {
            return;
        }
        this.f8770f.e(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        if (this.f8769e.isEmpty()) {
            return;
        }
        this.f8770f.e(this);
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        this.f8846a = false;
        GoogleApiManager googleApiManager = this.f8770f;
        googleApiManager.getClass();
        synchronized (GoogleApiManager.T) {
            try {
                if (googleApiManager.M == this) {
                    googleApiManager.M = null;
                    googleApiManager.N.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
