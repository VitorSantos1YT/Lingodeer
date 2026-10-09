package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgf extends zzde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzgi f10480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzw f10481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzzv f10482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f10483d;

    public zzgf(zzgi zzgiVar, zzzw zzzwVar, zzzv zzzvVar, Integer num) {
        this.f10480a = zzgiVar;
        this.f10481b = zzzwVar;
        this.f10482c = zzzvVar;
        this.f10483d = num;
    }

    public static zzgf e(zzgi.zza zzaVar, zzzw zzzwVar, Integer num) throws GeneralSecurityException {
        zzzv zzzvVarB;
        zzzv zzzvVar = zzzwVar.f11063a;
        zzgi.zza zzaVar2 = zzgi.zza.f10487d;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException(a.g("For given Variant ", String.valueOf(zzaVar), " the value of idRequirement must be non-null"));
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzvVar.f11062a.length != 32) {
            throw new GeneralSecurityException(p.j(zzzvVar.f11062a.length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzgi zzgiVar = new zzgi(zzaVar);
        zzgi.zza zzaVar3 = zzgiVar.f10484a;
        if (zzaVar3 == zzaVar2) {
            zzzvVarB = zzoz.f10823a;
        } else if (zzaVar3 == zzgi.zza.f10486c) {
            zzzvVarB = zzoz.a(num.intValue());
        } else {
            if (zzaVar3 != zzgi.zza.f10485b) {
                throw new IllegalStateException("Unknown Variant: ".concat(String.valueOf(zzaVar3)));
            }
            zzzvVarB = zzoz.b(num.intValue());
        }
        return new zzgf(zzgiVar, zzzwVar, zzzvVarB, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10480a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10483d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzdg a() {
        return this.f10480a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    public final zzzv d() {
        return this.f10482c;
    }
}
