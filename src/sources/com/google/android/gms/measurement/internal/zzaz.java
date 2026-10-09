package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzaz {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile com.google.android.gms.internal.measurement.zzcl f12667d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzjg f12668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f12669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f12670c;

    public zzaz(zzjg zzjgVar) {
        Preconditions.g(zzjgVar);
        this.f12668a = zzjgVar;
        this.f12669b = new zzay(this, zzjgVar);
    }

    public abstract void a();

    public final void b(long j11) {
        c();
        if (j11 >= 0) {
            zzjg zzjgVar = this.f12668a;
            this.f12670c = zzjgVar.c().a();
            if (d().postDelayed(this.f12669b, j11)) {
                return;
            }
            zzjgVar.b().f12942f.b(Long.valueOf(j11), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.f12670c = 0L;
        d().removeCallbacks(this.f12669b);
    }

    public final Handler d() {
        com.google.android.gms.internal.measurement.zzcl zzclVar;
        if (f12667d != null) {
            return f12667d;
        }
        synchronized (zzaz.class) {
            try {
                if (f12667d == null) {
                    f12667d = new com.google.android.gms.internal.measurement.zzcl(this.f12668a.f().getMainLooper());
                }
                zzclVar = f12667d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzclVar;
    }
}
