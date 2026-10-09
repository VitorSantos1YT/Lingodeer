package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.type.bACG.scNRoQgKSYX;
import defpackage.e;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkk extends zzlh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzf f10640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzc f10641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzb f10642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zze f10643d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10645b;

        public zza(String str, int i11) {
            this.f10644a = str;
            this.f10645b = i11;
        }

        public String toString() {
            return String.format("%s(0x%04x)", this.f10644a, Integer.valueOf(this.f10645b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzb extends zza {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzb f10646c = new zzb("AES_128_GCM", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zzb f10647d = new zzb("AES_256_GCM", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final zzb f10648e = new zzb("CHACHA20_POLY1305", 3);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzc extends zza {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzc f10649c = new zzc("HKDF_SHA256", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zzc f10650d = new zzc("HKDF_SHA384", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final zzc f10651e = new zzc("HKDF_SHA512", 3);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zzf f10652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zzc f10653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public zzb f10654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public zze f10655d;

        public /* synthetic */ zzd(int i11) {
            this();
        }

        private zzd() {
            this.f10652a = null;
            this.f10653b = null;
            this.f10654c = null;
            this.f10655d = zze.f10658d;
        }

        public final zzkk a() throws GeneralSecurityException {
            zzf zzfVar = this.f10652a;
            if (zzfVar == null) {
                throw new GeneralSecurityException(scNRoQgKSYX.titByBxsQz);
            }
            zzc zzcVar = this.f10653b;
            if (zzcVar == null) {
                throw new GeneralSecurityException("HPKE KDF parameter is not set");
            }
            zzb zzbVar = this.f10654c;
            if (zzbVar == null) {
                throw new GeneralSecurityException("HPKE AEAD parameter is not set");
            }
            zze zzeVar = this.f10655d;
            if (zzeVar != null) {
                return new zzkk(zzfVar, zzcVar, zzbVar, zzeVar);
            }
            throw new GeneralSecurityException("HPKE variant is not set");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zze {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zze f10656b = new zze("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zze f10657c = new zze("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zze f10658d = new zze("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10659a;

        public zze(String str) {
            this.f10659a = str;
        }

        public final String toString() {
            return this.f10659a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzf extends zza {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzf f10660c = new zzf("DHKEM_P256_HKDF_SHA256", 16);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zzf f10661d = new zzf("DHKEM_P384_HKDF_SHA384", 17);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final zzf f10662e = new zzf("DHKEM_P521_HKDF_SHA512", 18);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final zzf f10663f = new zzf("DHKEM_X25519_HKDF_SHA256", 32);
    }

    public zzkk(zzf zzfVar, zzc zzcVar, zzb zzbVar, zze zzeVar) {
        this.f10640a = zzfVar;
        this.f10641b = zzcVar;
        this.f10642c = zzbVar;
        this.f10643d = zzeVar;
    }

    public static zzd b() {
        return new zzd(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10643d != zze.f10658d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkk)) {
            return false;
        }
        zzkk zzkkVar = (zzkk) obj;
        return this.f10640a == zzkkVar.f10640a && this.f10641b == zzkkVar.f10641b && this.f10642c == zzkkVar.f10642c && this.f10643d == zzkkVar.f10643d;
    }

    public final int hashCode() {
        return Objects.hash(zzkk.class, this.f10640a, this.f10641b, this.f10642c, this.f10643d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f10643d);
        String strValueOf2 = String.valueOf(this.f10640a);
        return e.p(e.s("HPKE Parameters (Variant: ", strValueOf, ", KemId: ", strValueOf2, ", KdfId: "), String.valueOf(this.f10641b), ", AeadId: ", String.valueOf(this.f10642c), ")");
    }
}
