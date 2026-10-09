package com.google.firebase.inappmessaging.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ForegroundNotifier implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f20004d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f20001a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20002b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20003c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ny.b f20005e = new ny.b();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f20003c = true;
        e eVar = this.f20004d;
        Handler handler = this.f20001a;
        if (eVar != null) {
            handler.removeCallbacks(eVar);
        }
        e eVar2 = new e(this);
        this.f20004d = eVar2;
        handler.postDelayed(eVar2, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f20003c = false;
        boolean z11 = this.f20002b;
        this.f20002b = true;
        e eVar = this.f20004d;
        if (eVar != null) {
            this.f20001a.removeCallbacks(eVar);
        }
        if (z11) {
            return;
        }
        this.f20005e.onNext("ON_FOREGROUND");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
