package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e;
import java.security.GeneralSecurityException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzdc implements zzbq {
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.firebase-auth-api.zzdb] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbq
    public final Object a(zzbx zzbxVar, Class cls) throws GeneralSecurityException {
        zzzv zzzvVarC;
        if (cls != zzbm.class) {
            throw new GeneralSecurityException("AeadConfigurationV1 can only create AEADs");
        }
        zzbq zzbqVar = zzcz.f10289a;
        ?? r9 = new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdb
            public final Object a(zzck zzckVar) throws GeneralSecurityException {
                zzbq zzbqVar2 = zzcz.f10289a;
                zzbt zzbtVarZzb = zzckVar.zzb();
                if (zzbtVarZzb instanceof zzdh) {
                    return zzys.c((zzdh) zzbtVarZzb);
                }
                if (zzbtVarZzb instanceof zzdw) {
                    zzdw zzdwVar = (zzdw) zzbtVarZzb;
                    zzjb.zza zzaVar = zzyg.f11012c;
                    zzed zzedVar = zzdwVar.f10355a;
                    int i11 = zzedVar.f10368b;
                    int i12 = zzedVar.f10369c;
                    if (i11 != 12) {
                        throw new GeneralSecurityException(p.j(zzedVar.f10368b, "Expected IV Size 12, got "));
                    }
                    if (i12 == 16) {
                        return new zzyg(zzdwVar.f10356b.c(zzcw.f10287a), zzdwVar.f10357c);
                    }
                    throw new GeneralSecurityException(p.j(i12, "Expected tag Size 16, got "));
                }
                if (zzbtVarZzb instanceof zzef) {
                    zzef zzefVar = (zzef) zzbtVarZzb;
                    ThreadLocal threadLocal = zziw.f10565a;
                    zziv zzivVar = new zziv();
                    byte[] bArr = zzhd.f10506d;
                    if (zzhd.c(zzivVar.a())) {
                        return new zzhd(zzefVar.f10380b.c(zzcw.f10287a), zzefVar.f10381c.b(), zzivVar);
                    }
                    throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
                }
                if (zzbtVarZzb instanceof zzdp) {
                    zzdp zzdpVar = (zzdp) zzbtVarZzb;
                    if (!zzye.f11006e.a()) {
                        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
                    }
                    zzdu zzduVar = zzdpVar.f10333a;
                    if (zzduVar.f10345c != 16) {
                        throw new GeneralSecurityException(p.j(zzduVar.f10345c, "AesEaxJce only supports 16 byte tag size, not "));
                    }
                    return new zzye(zzduVar.f10344b, zzdpVar.f10334b.c(zzcw.f10287a), zzdpVar.f10335c.b());
                }
                if (zzbtVarZzb instanceof zzem) {
                    zzem zzemVar = (zzem) zzbtVarZzb;
                    zzzv zzzvVar = zzemVar.f10400c;
                    zzzw zzzwVar = zzemVar.f10399b;
                    try {
                        zzhl.c();
                        return new zzhl(zzzwVar.c(zzcw.f10287a), zzzvVar.b(), zzhl.c().getProvider());
                    } catch (GeneralSecurityException unused) {
                        return new zzyk(zzzwVar.c(zzcw.f10287a), zzzvVar.b());
                    }
                }
                if (zzbtVarZzb instanceof zzgf) {
                    zzgf zzgfVar = (zzgf) zzbtVarZzb;
                    zzzv zzzvVar2 = zzgfVar.f10482c;
                    zzzw zzzwVar2 = zzgfVar.f10481b;
                    zzjb.zza zzaVar2 = zzin.f10555d;
                    try {
                        zzhl.c();
                        return new zzin(zzzwVar2.c(zzcw.f10287a), zzzvVar2.b(), zzhl.c().getProvider());
                    } catch (GeneralSecurityException unused2) {
                        return new zzzs(zzzwVar2.c(zzcw.f10287a), zzzvVar2.b());
                    }
                }
                if (!(zzbtVarZzb instanceof zzga)) {
                    throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(zzbtVarZzb.getClass())));
                }
                zzga zzgaVar = (zzga) zzbtVarZzb;
                zzgd zzgdVar = zzgaVar.f10467a;
                int i13 = zzgdVar.f10472b;
                if (i13 < 8 || i13 > 12) {
                    throw new GeneralSecurityException("invalid salt size");
                }
                return new zzii(zzgaVar.f10468b.c(zzcw.f10287a), zzgaVar.f10469c, zzgdVar.f10472b);
            }
        };
        zzpi zzpiVar = new zzpi();
        for (int i11 = 0; i11 < zzbxVar.f10265a.size(); i11++) {
            zzcd zzcdVarF = zzbxVar.f(i11);
            if (zzcdVarF.f10279c.equals(zzbv.f10261b)) {
                zzbt zzbtVarZzb = zzcdVarF.zzb();
                if (zzbtVarZzb instanceof zzde) {
                    zzzvVarC = ((zzde) zzbtVarZzb).d();
                } else {
                    if (!(zzbtVarZzb instanceof zzoa)) {
                        throw new GeneralSecurityException(e.n("Cannot get output prefix for key of class ", zzbtVarZzb.getClass().getName(), " with parameters ", String.valueOf(zzbtVarZzb.a())));
                    }
                    zzzvVarC = ((zzoa) zzbtVarZzb).c();
                }
                zzpiVar.a(zzzvVarC, new zzid((zzbm) r9.a(zzcdVarF), zzcdVarF.f10280d));
            }
        }
        if (((zzof) zzbxVar.a()) != null) {
            throw null;
        }
        zzoi zzoiVar = zzol.f10808a;
        return cls.cast(new zzig(new zzid((zzbm) r9.a(zzbxVar.n()), zzbxVar.n().f10280d), new zzpg(zzpiVar.f10830a), zzoiVar, zzoiVar));
    }
}
