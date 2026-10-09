package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.Trace;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzvy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f12092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzrg f12093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f12094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzvx f12095d;

    static {
        ImmutableSet.l(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        f12092a = new AtomicReference(ImmutableSet.s());
        f12093b = new zzrg();
        f12094c = new WeakHashMap();
        f12095d = new zzvx();
        new ArrayDeque();
        new ArrayDeque();
    }

    public static zzws a() {
        zzwq zzwqVarC = c();
        zzws zzwsVar = zzwqVarC.f12135b;
        if (zzwsVar != null && zzwsVar != zzwg.f12104t) {
            return zzwsVar;
        }
        zzvr zzvrVar = zzwd.f12101t;
        UUID uuidB = zzvz.f12096c.b();
        String strA = zzvn.a(uuidB);
        ImmutableSet immutableSet = (ImmutableSet) f12092a.get();
        if (!immutableSet.isEmpty()) {
            immutableSet.forEach(new zzwc());
        }
        return new zzwd(uuidB, strA, zzwd.f12101t, zzwqVarC);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    public static zzws b(zzwq zzwqVar, zzws zzwsVar) {
        boolean zA;
        zzwqVar.getClass();
        zzws zzwsVar2 = zzwqVar.f12135b;
        if (zzwsVar2 != zzwsVar) {
            if (zzwsVar2 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    zA = Trace.isEnabled();
                } else {
                    zA = zzrj.f11906a.a(f12093b);
                }
                zzwqVar.f12134a = zA;
            }
            if (zzwqVar.f12134a) {
                if (zzwsVar2 != null) {
                    if (zzwsVar != null) {
                        if (zzwsVar2.zzb() == zzwsVar && zzwsVar2.zza() == Thread.currentThread()) {
                            Trace.endSection();
                        } else if (zzwsVar2 == zzwsVar.zzb() && zzwsVar.zza() == Thread.currentThread()) {
                            zzwr.c(zzwsVar);
                        }
                    }
                    zzwr.b(zzwsVar2);
                    if (zzwsVar != null) {
                        zzwr.a(zzwsVar);
                    }
                } else if (zzwsVar != null) {
                    zzwr.a(zzwsVar);
                }
            }
            if (zzwsVar2 != zzwsVar) {
                zzwqVar.f12135b = zzwsVar;
                return zzwsVar2;
            }
        }
        return zzwsVar;
    }

    public static zzwq c() {
        return (zzwq) f12095d.get();
    }
}
