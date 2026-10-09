package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdh extends zzde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzdo f10297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzw f10298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzzw f10299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzzv f10300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f10301e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zzdo f10302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zzzw f10303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public zzzw f10304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f10305d;

        public /* synthetic */ zza(int i11) {
            this();
        }

        public final zzdh a() throws GeneralSecurityException {
            zzzw zzzwVar;
            zzzv zzzvVarB;
            zzdo zzdoVar = this.f10302a;
            if (zzdoVar == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            zzzw zzzwVar2 = this.f10303b;
            if (zzzwVar2 == null || (zzzwVar = this.f10304c) == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (zzdoVar.f10311a != zzzwVar2.f11063a.f11062a.length) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (zzdoVar.f10312b != zzzwVar.f11063a.f11062a.length) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (zzdoVar.a() && this.f10305d == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f10302a.a() && this.f10305d != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            zzdo.zzb zzbVar = this.f10302a.f10315e;
            if (zzbVar == zzdo.zzb.f10325d) {
                zzzvVarB = zzoz.f10823a;
            } else if (zzbVar == zzdo.zzb.f10324c) {
                zzzvVarB = zzoz.a(this.f10305d.intValue());
            } else {
                if (zzbVar != zzdo.zzb.f10323b) {
                    throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.f10302a.f10315e)));
                }
                zzzvVarB = zzoz.b(this.f10305d.intValue());
            }
            return new zzdh(this.f10302a, this.f10303b, this.f10304c, zzzvVarB, this.f10305d);
        }

        private zza() {
            this.f10302a = null;
            this.f10303b = null;
            this.f10304c = null;
            this.f10305d = null;
        }
    }

    public zzdh(zzdo zzdoVar, zzzw zzzwVar, zzzw zzzwVar2, zzzv zzzvVar, Integer num) {
        this.f10297a = zzdoVar;
        this.f10298b = zzzwVar;
        this.f10299c = zzzwVar2;
        this.f10300d = zzzvVar;
        this.f10301e = num;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10297a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10301e;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzdg a() {
        return this.f10297a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    public final zzzv d() {
        return this.f10300d;
    }
}
