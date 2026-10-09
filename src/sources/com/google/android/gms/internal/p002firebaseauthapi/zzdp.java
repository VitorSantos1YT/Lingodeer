package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdp extends zzde {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzdu f10333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzw f10334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzzv f10335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f10336d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zzdu f10337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zzzw f10338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f10339c;

        public /* synthetic */ zza(int i11) {
            this();
        }

        public final zzdp a() throws GeneralSecurityException {
            zzzw zzzwVar;
            zzzv zzzvVarB;
            zzdu zzduVar = this.f10337a;
            if (zzduVar == null || (zzzwVar = this.f10338b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzduVar.f10343a != zzzwVar.f11063a.f11062a.length) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (zzduVar.a() && this.f10339c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f10337a.a() && this.f10339c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            zzdu.zza zzaVar = this.f10337a.f10346d;
            if (zzaVar == zzdu.zza.f10349d) {
                zzzvVarB = zzoz.f10823a;
            } else if (zzaVar == zzdu.zza.f10348c) {
                zzzvVarB = zzoz.a(this.f10339c.intValue());
            } else {
                if (zzaVar != zzdu.zza.f10347b) {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.f10337a.f10346d)));
                }
                zzzvVarB = zzoz.b(this.f10339c.intValue());
            }
            return new zzdp(this.f10337a, this.f10338b, zzzvVarB, this.f10339c);
        }

        private zza() {
            this.f10337a = null;
            this.f10338b = null;
            this.f10339c = null;
        }
    }

    public zzdp(zzdu zzduVar, zzzw zzzwVar, zzzv zzzvVar, Integer num) {
        this.f10333a = zzduVar;
        this.f10334b = zzzwVar;
        this.f10335c = zzzvVar;
        this.f10336d = num;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10333a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10336d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzdg a() {
        return this.f10333a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzde
    public final zzzv d() {
        return this.f10335c;
    }
}
