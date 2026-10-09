package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdw extends zzde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzed f10355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzw f10356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzzv f10357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f10358d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zzed f10359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zzzw f10360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f10361c;

        public /* synthetic */ zza(int i11) {
            this();
        }

        public final zzdw a() throws GeneralSecurityException {
            zzzw zzzwVar;
            zzzv zzzvVarB;
            zzed zzedVar = this.f10359a;
            if (zzedVar == null || (zzzwVar = this.f10360b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzedVar.f10367a != zzzwVar.f11063a.f11062a.length) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (zzedVar.a() && this.f10361c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f10359a.a() && this.f10361c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            zzed.zzb zzbVar = this.f10359a.f10370d;
            if (zzbVar == zzed.zzb.f10377d) {
                zzzvVarB = zzoz.f10823a;
            } else if (zzbVar == zzed.zzb.f10376c) {
                zzzvVarB = zzoz.a(this.f10361c.intValue());
            } else {
                if (zzbVar != zzed.zzb.f10375b) {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.f10359a.f10370d)));
                }
                zzzvVarB = zzoz.b(this.f10361c.intValue());
            }
            return new zzdw(this.f10359a, this.f10360b, zzzvVarB, this.f10361c);
        }

        private zza() {
            this.f10359a = null;
            this.f10360b = null;
            this.f10361c = null;
        }
    }

    public zzdw(zzed zzedVar, zzzw zzzwVar, zzzv zzzvVar, Integer num) {
        this.f10355a = zzedVar;
        this.f10356b = zzzwVar;
        this.f10357c = zzzvVar;
        this.f10358d = num;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10355a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10358d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzdg a() {
        return this.f10355a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    public final zzzv d() {
        return this.f10357c;
    }
}
