package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzamn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzamn f10187c = new zzamn();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10189b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzalm f10188a = new zzalm();

    private zzamn() {
    }

    public final zzamr a(Class cls) {
        zzamr zzamrVarL;
        ConcurrentHashMap concurrentHashMap = this.f10189b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (zzamr) obj;
        }
        zzalm zzalmVar = this.f10188a;
        zzalmVar.getClass();
        zzanh zzanhVar = zzamq.f10194a;
        zzaku.class.isAssignableFrom(cls);
        zzalw zzalwVarZza = zzalmVar.f10148a.zza(cls);
        if (zzalwVarZza.zzc()) {
            zzamrVarL = new zzame(zzamq.f10194a, zzakn.f10123a, zzalwVarZza.zza());
        } else {
            zzamrVarL = zzamc.l(zzalwVarZza, zzami.f10182a, zzalk.f10146a, zzamq.f10194a, zzalo.f10152a[zzalwVarZza.zzb().ordinal()] != 1 ? zzakn.f10123a : null, zzalx.f10156a);
        }
        byte[] bArr = zzakw.f10134a;
        zzamr zzamrVar = (zzamr) concurrentHashMap.putIfAbsent(cls, zzamrVarL);
        return zzamrVar != null ? zzamrVar : zzamrVarL;
    }
}
