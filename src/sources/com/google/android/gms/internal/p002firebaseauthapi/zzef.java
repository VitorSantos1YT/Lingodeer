package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzef extends zzde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzek f10379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzw f10380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzzv f10381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f10382d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zzek f10383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zzzw f10384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f10385c;

        public /* synthetic */ zza(int i11) {
            this();
        }

        public final zzef a() throws GeneralSecurityException {
            zzzw zzzwVar;
            zzzv zzzvVarB;
            zzek zzekVar = this.f10383a;
            if (zzekVar == null || (zzzwVar = this.f10384b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzekVar.f10390a != zzzwVar.f11063a.f11062a.length) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (zzekVar.a() && this.f10385c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f10383a.a() && this.f10385c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            zzek.zza zzaVar = this.f10383a.f10391b;
            if (zzaVar == zzek.zza.f10394d) {
                zzzvVarB = zzoz.f10823a;
            } else if (zzaVar == zzek.zza.f10393c) {
                zzzvVarB = zzoz.a(this.f10385c.intValue());
            } else {
                if (zzaVar != zzek.zza.f10392b) {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.f10383a.f10391b)));
                }
                zzzvVarB = zzoz.b(this.f10385c.intValue());
            }
            return new zzef(this.f10383a, this.f10384b, zzzvVarB, this.f10385c);
        }

        private zza() {
            this.f10383a = null;
            this.f10384b = null;
            this.f10385c = null;
        }
    }

    public zzef(zzek zzekVar, zzzw zzzwVar, zzzv zzzvVar, Integer num) {
        this.f10379a = zzekVar;
        this.f10380b = zzzwVar;
        this.f10381c = zzzvVar;
        this.f10382d = num;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10379a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10382d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzdg a() {
        return this.f10379a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    public final zzzv d() {
        return this.f10381c;
    }
}
