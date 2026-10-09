package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqi extends zzre {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzqp f10864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzw f10865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f10866c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zzqp f10867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zzzw f10868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f10869c;

        public /* synthetic */ zza(int i11) {
            this();
        }

        public final zzqi a() throws GeneralSecurityException {
            zzzw zzzwVar;
            zzqp zzqpVar = this.f10867a;
            if (zzqpVar == null || (zzzwVar = this.f10868b) == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzqpVar.f10875a != zzzwVar.f11063a.f11062a.length) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (zzqpVar.a() && this.f10869c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f10867a.a() && this.f10869c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            zzqp.zzb zzbVar = this.f10867a.f10877c;
            if (zzbVar == zzqp.zzb.f10884e) {
                zzzv zzzvVar = zzoz.f10823a;
            } else if (zzbVar == zzqp.zzb.f10883d || zzbVar == zzqp.zzb.f10882c) {
                zzoz.a(this.f10869c.intValue());
            } else {
                if (zzbVar != zzqp.zzb.f10881b) {
                    throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.f10867a.f10877c)));
                }
                zzoz.b(this.f10869c.intValue());
            }
            return new zzqi(this.f10867a, this.f10868b, this.f10869c);
        }

        private zza() {
            this.f10867a = null;
            this.f10868b = null;
            this.f10869c = null;
        }
    }

    public zzqi(zzqp zzqpVar, zzzw zzzwVar, Integer num) {
        this.f10864a = zzqpVar;
        this.f10865b = zzzwVar;
        this.f10866c = num;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzre, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10864a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10866c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzre
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzrd a() {
        return this.f10864a;
    }
}
