package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzafl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzafl f11317c = new zzafl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11319b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzaet f11318a = new zzaet();

    private zzafl() {
    }

    public final zzafp a(Class cls) {
        zzafp zzafgVar;
        ConcurrentHashMap concurrentHashMap = this.f11319b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (zzafp) obj;
        }
        zzaet zzaetVar = this.f11318a;
        zzaetVar.getClass();
        zzagb zzagbVar = zzafq.f11328a;
        if (!zzadu.class.isAssignableFrom(cls)) {
            int i11 = zzacf.f11197a;
        }
        zzaez zzaezVarZzc = zzaetVar.f11289a.zzc(cls);
        if (zzaezVarZzc.zza()) {
            int i12 = zzacf.f11197a;
            zzafgVar = new zzafg(zzafq.f11328a, zzadi.f11256a, zzaezVarZzc.zzb());
        } else {
            int i13 = zzacf.f11197a;
            int i14 = zzafi.f11316a;
            int i15 = zzaep.f11282a;
            zzagb zzagbVar2 = zzafq.f11328a;
            zzadh zzadhVar = zzaezVarZzc.zzc() + (-1) != 1 ? zzadi.f11256a : null;
            int i16 = zzaey.f11296a;
            zzafgVar = zzaff.y(zzaezVarZzc, zzagbVar2, zzadhVar);
        }
        zzafp zzafpVar = (zzafp) concurrentHashMap.putIfAbsent(cls, zzafgVar);
        return zzafpVar != null ? zzafpVar : zzafgVar;
    }
}
