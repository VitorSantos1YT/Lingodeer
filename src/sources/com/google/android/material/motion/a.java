package com.google.android.material.motion;

import android.window.OnBackInvokedCallback;
import f.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14819b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f14818a = i11;
        this.f14819b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f14818a) {
            case 0:
                ((MaterialBackHandler) this.f14819b).c();
                break;
            case 1:
                ((z) this.f14819b).invoke();
                break;
            case 2:
                ((androidx.appcompat.app.b) this.f14819b).E();
                break;
            default:
                ((Runnable) this.f14819b).run();
                break;
        }
    }
}
