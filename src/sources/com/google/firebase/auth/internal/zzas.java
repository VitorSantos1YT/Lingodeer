package com.google.firebase.auth.internal;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.FirebaseApp;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzas {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f17957f = new Logger("TokenRefresher", "FirebaseAuth:");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f17958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f17959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f17960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.p002firebaseauthapi.zze f17961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f17962e;

    public zzas(FirebaseApp firebaseApp) {
        f17957f.c("Initializing TokenRefresher", new Object[0]);
        Preconditions.g(firebaseApp);
        this.f17958a = firebaseApp;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        com.google.android.gms.internal.p002firebaseauthapi.zze zzeVar = new com.google.android.gms.internal.p002firebaseauthapi.zze(handlerThread.getLooper());
        Looper.getMainLooper();
        this.f17961d = zzeVar;
        firebaseApp.b();
        this.f17962e = new zzar(this, firebaseApp.f17715b);
    }

    public final void a() {
        Logger logger = f17957f;
        long j11 = this.f17959b;
        com.google.firebase.auth.zzad.d(this.f17958a).getClass();
        logger.c(e.h(j11 - 300000, "Scheduling refresh for "), new Object[0]);
        this.f17961d.removeCallbacks(this.f17962e);
        DefaultClock.f9117a.getClass();
        long jCurrentTimeMillis = this.f17959b - System.currentTimeMillis();
        com.google.firebase.auth.zzad.d(this.f17958a).getClass();
        this.f17960c = Math.max(jCurrentTimeMillis - 300000, 0L) / 1000;
        this.f17961d.postDelayed(this.f17962e, this.f17960c * 1000);
    }
}
