package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzga extends zzde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzgd f10467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzw f10468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzzv f10469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f10470d;

    public zzga(zzgd zzgdVar, zzzw zzzwVar, zzzv zzzvVar, Integer num) {
        this.f10467a = zzgdVar;
        this.f10468b = zzzwVar;
        this.f10469c = zzzvVar;
        this.f10470d = num;
    }

    public static zzga e(zzgd zzgdVar, zzzw zzzwVar, Integer num) throws GeneralSecurityException {
        zzzv zzzvVarB;
        zzzv zzzvVar = zzzwVar.f11063a;
        zzgd.zza zzaVar = zzgdVar.f10471a;
        zzgd.zza zzaVar2 = zzgd.zza.f10474c;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException(a.g("For given Variant ", String.valueOf(zzaVar), " the value of idRequirement must be non-null"));
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzvVar.f11062a.length != 32) {
            throw new GeneralSecurityException(p.j(zzzvVar.f11062a.length, "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
        }
        if (zzaVar == zzaVar2) {
            zzzvVarB = zzoz.f10823a;
        } else {
            if (zzaVar != zzgd.zza.f10473b) {
                throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(zzaVar)));
            }
            zzzvVarB = zzoz.b(num.intValue());
        }
        return new zzga(zzgdVar, zzzwVar, zzzvVarB, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10467a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10470d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzdg a() {
        return this.f10467a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    public final zzzv d() {
        return this.f10469c;
    }
}
