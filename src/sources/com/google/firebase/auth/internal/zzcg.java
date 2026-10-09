package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.firebase.FirebaseApp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f18007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzas f18008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f18009c;

    public zzcg(FirebaseApp firebaseApp) {
        firebaseApp.b();
        Context context = firebaseApp.f17714a;
        zzas zzasVar = new zzas(firebaseApp);
        this.f18009c = false;
        this.f18007a = 0;
        this.f18008b = zzasVar;
        BackgroundDetector.b((Application) context.getApplicationContext());
        BackgroundDetector.f8715e.a(new zzcf(this));
    }

    public final void a(int i11) {
        if (i11 > 0 && this.f18007a == 0) {
            this.f18007a = i11;
            if (this.f18007a > 0 && !this.f18009c) {
                this.f18008b.a();
            }
        } else if (i11 == 0 && this.f18007a != 0) {
            zzas zzasVar = this.f18008b;
            zzasVar.f17961d.removeCallbacks(zzasVar.f17962e);
        }
        this.f18007a = i11;
    }
}
