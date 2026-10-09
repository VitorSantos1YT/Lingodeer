package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqt extends zzre {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzra f10887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzw f10888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f10889c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zzra f10890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zzzw f10891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f10892c;

        public /* synthetic */ zza(int i11) {
            this();
        }

        public final zzqt a() throws GeneralSecurityException {
            zzzw zzzwVar;
            zzra zzraVar = this.f10890a;
            if (zzraVar == null || (zzzwVar = this.f10891b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzraVar.f10899a != zzzwVar.f11063a.f11062a.length) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (zzraVar.a() && this.f10892c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f10890a.a() && this.f10892c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            zzra.zzb zzbVar = this.f10890a.f10901c;
            if (zzbVar == zzra.zzb.f10910e) {
                zzzv zzzvVar = zzoz.f10823a;
            } else if (zzbVar == zzra.zzb.f10909d || zzbVar == zzra.zzb.f10908c) {
                zzoz.a(this.f10892c.intValue());
            } else {
                if (zzbVar != zzra.zzb.f10907b) {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.f10890a.f10901c)));
                }
                zzoz.b(this.f10892c.intValue());
            }
            return new zzqt(this.f10890a, this.f10891b, this.f10892c);
        }

        private zza() {
            this.f10890a = null;
            this.f10891b = null;
            this.f10892c = null;
        }
    }

    public zzqt(zzra zzraVar, zzzw zzzwVar, Integer num) {
        this.f10887a = zzraVar;
        this.f10888b = zzzwVar;
        this.f10889c = num;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzre, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10887a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10889c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzre
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzrd a() {
        return this.f10887a;
    }
}
