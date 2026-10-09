package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfh extends zzde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzfg f10447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzv f10448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f10449c;

    public zzfh(zzfg zzfgVar, zzzv zzzvVar, Integer num) {
        this.f10447a = zzfgVar;
        this.f10448b = zzzvVar;
        this.f10449c = num;
    }

    public static zzfh e(zzfg zzfgVar, Integer num) throws GeneralSecurityException {
        zzzv zzzvVarB;
        zzfg.zzc zzcVar = zzfgVar.f10429a;
        if (zzcVar == zzfg.zzc.f10445c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzzvVarB = zzoz.f10823a;
        } else {
            if (zzcVar != zzfg.zzc.f10444b) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzcVar)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzzvVarB = zzoz.b(num.intValue());
        }
        return new zzfh(zzfgVar, zzzvVarB, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10447a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10449c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzdg a() {
        return this.f10447a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    public final zzzv d() {
        return this.f10448b;
    }
}
