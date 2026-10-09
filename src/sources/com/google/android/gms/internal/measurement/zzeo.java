package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzeo implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzez f11563d;

    public zzeo(zzez zzezVar, boolean z11) {
        Objects.requireNonNull(zzezVar);
        this.f11563d = zzezVar;
        zzezVar.f11583a.getClass();
        this.f11560a = System.currentTimeMillis();
        this.f11561b = SystemClock.elapsedRealtime();
        this.f11562c = z11;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        zzez zzezVar = this.f11563d;
        if (zzezVar.f11588f) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e8) {
            zzezVar.g(e8, false, this.f11562c);
            b();
        }
    }

    public void b() {
    }
}
