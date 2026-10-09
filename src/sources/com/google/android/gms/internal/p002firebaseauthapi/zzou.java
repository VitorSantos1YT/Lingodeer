package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzou {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzou f10818b = (zzou) zzqh.a(new zzqg() { // from class: com.google.android.gms.internal.firebase-auth-api.zzox
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqg
        public final Object zza() {
            zzou zzouVar = new zzou();
            zzouVar.f(new zznx(zzoa.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzow
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
                public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
                    zzpx zzpxVar = ((zzoa) zzbtVar).f10800a;
                    int i11 = zzoc.f10804b[zzpxVar.f10848d.ordinal()];
                    if (i11 != 1 && i11 != 2) {
                        return zzpxVar;
                    }
                    zzcw.a(zzcwVar);
                    return zzpxVar;
                }
            }));
            return zzouVar;
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f10819a = new AtomicReference(new zzqa(new zzqd()));

    public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
        zzqa zzqaVar = (zzqa) this.f10819a.get();
        zzqaVar.getClass();
        zzqc zzqcVar = new zzqc(zzpx.class, zzpxVar.f10846b);
        HashMap map = zzqaVar.f10853b;
        if (map.containsKey(zzqcVar)) {
            return ((zznq) map.get(zzqcVar)).a(zzpxVar, zzcwVar);
        }
        throw new GeneralSecurityException(a.g("No Key Parser for requested key type ", String.valueOf(zzqcVar), " available"));
    }

    public final zzcq b(zzpw zzpwVar) throws GeneralSecurityException {
        zzqa zzqaVar = (zzqa) this.f10819a.get();
        zzqaVar.getClass();
        zzqc zzqcVar = new zzqc(zzpw.class, zzpwVar.f10843a);
        HashMap map = zzqaVar.f10855d;
        if (map.containsKey(zzqcVar)) {
            return ((zzoy) map.get(zzqcVar)).a(zzpwVar);
        }
        throw new GeneralSecurityException(a.g("No Parameters Parser for requested key type ", String.valueOf(zzqcVar), " available"));
    }

    public final zzqb c(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
        zzqa zzqaVar = (zzqa) this.f10819a.get();
        zzqaVar.getClass();
        zzqf zzqfVar = new zzqf(zzbtVar.getClass(), zzpx.class);
        HashMap map = zzqaVar.f10852a;
        if (map.containsKey(zzqfVar)) {
            return ((zznu) map.get(zzqfVar)).a(zzbtVar, zzcwVar);
        }
        throw new GeneralSecurityException(a.g("No Key serializer for ", String.valueOf(zzqfVar), " available"));
    }

    public final zzqb d(zzcq zzcqVar) throws GeneralSecurityException {
        zzqa zzqaVar = (zzqa) this.f10819a.get();
        zzqaVar.getClass();
        zzqf zzqfVar = new zzqf(zzcqVar.getClass(), zzpw.class);
        HashMap map = zzqaVar.f10854c;
        if (map.containsKey(zzqfVar)) {
            return ((zzpc) map.get(zzqfVar)).a(zzcqVar);
        }
        throw new GeneralSecurityException(a.g("No Key Format serializer for ", String.valueOf(zzqfVar), " available"));
    }

    public final synchronized void e(zznq zznqVar) {
        zzqd zzqdVar = new zzqd((zzqa) this.f10819a.get());
        zzqdVar.a(zznqVar);
        this.f10819a.set(new zzqa(zzqdVar));
    }

    public final synchronized void f(zznu zznuVar) {
        zzqd zzqdVar = new zzqd((zzqa) this.f10819a.get());
        zzqdVar.b(zznuVar);
        this.f10819a.set(new zzqa(zzqdVar));
    }

    public final synchronized void g(zzoy zzoyVar) {
        zzqd zzqdVar = new zzqd((zzqa) this.f10819a.get());
        zzqdVar.c(zzoyVar);
        this.f10819a.set(new zzqa(zzqdVar));
    }

    public final synchronized void h(zzpc zzpcVar) {
        zzqd zzqdVar = new zzqd((zzqa) this.f10819a.get());
        zzqdVar.d(zzpcVar);
        this.f10819a.set(new zzqa(zzqdVar));
    }
}
