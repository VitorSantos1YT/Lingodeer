package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjg extends zzjp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzjn f10571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzw f10572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzzv f10573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f10574d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zzjn f10575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zzzw f10576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f10577c;

        public /* synthetic */ zza(int i11) {
            this();
        }

        public final zzjg a() throws GeneralSecurityException {
            zzzw zzzwVar;
            zzzv zzzvVarB;
            zzjn zzjnVar = this.f10575a;
            if (zzjnVar == null || (zzzwVar = this.f10576b) == null) {
                throw new IllegalArgumentException("Cannot build without parameters and/or key material");
            }
            if (zzjnVar.f10582a != zzzwVar.f11063a.f11062a.length) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (zzjnVar.a() && this.f10577c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f10575a.a() && this.f10577c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            zzjn.zzb zzbVar = this.f10575a.f10583b;
            if (zzbVar == zzjn.zzb.f10588d) {
                zzzvVarB = zzoz.f10823a;
            } else if (zzbVar == zzjn.zzb.f10587c) {
                zzzvVarB = zzoz.a(this.f10577c.intValue());
            } else {
                if (zzbVar != zzjn.zzb.f10586b) {
                    throw new IllegalStateException("Unknown AesSivParameters.Variant: ".concat(String.valueOf(this.f10575a.f10583b)));
                }
                zzzvVarB = zzoz.b(this.f10577c.intValue());
            }
            return new zzjg(this.f10575a, this.f10576b, zzzvVarB, this.f10577c);
        }

        private zza() {
            this.f10575a = null;
            this.f10576b = null;
            this.f10577c = null;
        }
    }

    public zzjg(zzjn zzjnVar, zzzw zzzwVar, zzzv zzzvVar, Integer num) {
        this.f10571a = zzjnVar;
        this.f10572b = zzzwVar;
        this.f10573c = zzzvVar;
        this.f10574d = num;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzjp, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10571a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10574d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzjp
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzjn a() {
        return this.f10571a;
    }
}
