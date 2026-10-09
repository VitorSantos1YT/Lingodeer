package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import nv.p;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzem extends zzde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzeq f10398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzw f10399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzzv f10400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f10401d;

    public zzem(zzeq zzeqVar, zzzw zzzwVar, zzzv zzzvVar, Integer num) {
        this.f10398a = zzeqVar;
        this.f10399b = zzzwVar;
        this.f10400c = zzzvVar;
        this.f10401d = num;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10398a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10401d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzdg a() {
        return this.f10398a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    public final zzzv d() {
        return this.f10400c;
    }

    public static zzem e(zzeq.zza zzaVar, zzzw zzzwVar, Integer num) throws GeneralSecurityException {
        zzzv zzzvVarB;
        zzzv zzzvVar = zzzwVar.f11063a;
        zzeq.zza zzaVar2 = zzeq.zza.f10408d;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException(a.g("For given Variant ", String.valueOf(zzaVar), " the value of idRequirement must be non-null"));
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzvVar.f11062a.length != 32) {
            throw new GeneralSecurityException(p.j(zzzvVar.f11062a.length, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
        }
        zzeq zzeqVar = new zzeq(zzaVar);
        zzeq.zza zzaVar3 = zzeqVar.f10405a;
        if (zzaVar3 == zzaVar2) {
            zzzvVarB = zzoz.f10823a;
        } else if (zzaVar3 == zzeq.zza.f10407c) {
            zzzvVarB = zzoz.a(num.intValue());
        } else {
            if (zzaVar3 != zzeq.zza.f10406b) {
                throw new IllegalStateException(OYAvlbfUyD.CSctbwCBn.concat(String.valueOf(zzaVar3)));
            }
            zzzvVarB = zzoz.b(num.intValue());
        }
        return new zzem(zzeqVar, zzzwVar, zzzvVarB, num);
    }
}
