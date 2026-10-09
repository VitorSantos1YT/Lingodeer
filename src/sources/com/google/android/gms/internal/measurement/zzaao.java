package com.google.android.gms.internal.measurement;

import android.os.Build;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaao extends zzaag {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f11140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f11141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f11142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReference f11143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicLong f11144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f11145h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile zzzf f11146b;

    public static void e() {
        while (true) {
            zzaan zzaanVar = (zzaan) f11145h.poll();
            if (zzaanVar == null) {
                return;
            }
            f11144g.getAndDecrement();
            zzzf zzzfVar = zzaanVar.f11138a;
            zzxz zzxzVar = zzaanVar.f11139b;
            zzxy zzxyVar = zzxzVar.f12166c;
            if ((zzxyVar != null && Boolean.TRUE.equals(zzxyVar.d(zzxx.f12158g))) || zzzfVar.b(zzxzVar.f12164a)) {
                zzzfVar.c(zzxzVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final boolean b(Level level) {
        return this.f11146b == null || this.f11146b.b(level);
    }

    @Override // com.google.android.gms.internal.measurement.zzzf
    public final void c(zzxz zzxzVar) {
        if (this.f11146b != null) {
            this.f11146b.c(zzxzVar);
            return;
        }
        if (f11144g.incrementAndGet() > 20) {
            f11145h.poll();
        }
        f11145h.offer(new zzaan(this, zzxzVar));
        if (this.f11146b != null) {
            e();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaag, com.google.android.gms.internal.measurement.zzzf
    public final void d(RuntimeException runtimeException, zzxz zzxzVar) {
        if (this.f11146b != null) {
            this.f11146b.d(runtimeException, zzxzVar);
        }
    }

    static {
        String str = Build.FINGERPRINT;
        f11140c = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        f11141d = gkbGsXmgaxRjJ.Zpj.equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        f11142e = "eng".equals(str3) || "userdebug".equals(str3);
        f11143f = new AtomicReference();
        f11144g = new AtomicLong();
        f11145h = new ConcurrentLinkedQueue();
    }
}
