package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkf extends zzlh {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f10605g = (Set) zzqh.a(new zzqg() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkh
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqg
        public final Object zza() throws InvalidAlgorithmParameterException {
            Set set = zzkf.f10605g;
            HashSet hashSet = new HashSet();
            zzed.zza zzaVarB = zzed.b();
            zzaVarB.b();
            zzaVarB.c(16);
            zzaVarB.d();
            zzed.zzb zzbVar = zzed.zzb.f10377d;
            zzaVarB.f10374d = zzbVar;
            hashSet.add(zzaVarB.a());
            zzed.zza zzaVarB2 = zzed.b();
            zzaVarB2.b();
            zzaVarB2.c(32);
            zzaVarB2.d();
            zzaVarB2.f10374d = zzbVar;
            hashSet.add(zzaVarB2.a());
            zzdo.zza zzaVarB3 = zzdo.b();
            zzaVarB3.b(16);
            zzaVarB3.c(32);
            zzaVarB3.e(16);
            zzaVarB3.d(16);
            zzdo.zzc zzcVar = zzdo.zzc.f10329d;
            zzaVarB3.f10321e = zzcVar;
            zzdo.zzb zzbVar2 = zzdo.zzb.f10325d;
            zzaVarB3.f10322f = zzbVar2;
            hashSet.add(zzaVarB3.a());
            zzdo.zza zzaVarB4 = zzdo.b();
            zzaVarB4.b(32);
            zzaVarB4.c(32);
            zzaVarB4.e(32);
            zzaVarB4.d(16);
            zzaVarB4.f10321e = zzcVar;
            zzaVarB4.f10322f = zzbVar2;
            hashSet.add(zzaVarB4.a());
            hashSet.add(new zzgi(zzgi.zza.f10487d));
            zzjn.zza zzaVar = new zzjn.zza(0);
            zzaVar.b(64);
            zzaVar.f10585b = zzjn.zzb.f10588d;
            hashSet.add(zzaVar.a());
            return Collections.unmodifiableSet(hashSet);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzc f10606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzb f10607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zze f10608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzd f10609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzcq f10610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzzv f10611f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zzc f10612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zzb f10613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public zze f10614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public zzcq f10615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public zzd f10616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public zzzv f10617f;

        public /* synthetic */ zza(int i11) {
            this();
        }

        public final zzkf a() throws GeneralSecurityException {
            zzc zzcVar = this.f10612a;
            if (zzcVar == null) {
                throw new GeneralSecurityException("Elliptic curve type is not set");
            }
            if (this.f10613b == null) {
                throw new GeneralSecurityException("Hash type is not set");
            }
            if (this.f10615d == null) {
                throw new GeneralSecurityException("DEM parameters are not set");
            }
            if (this.f10616e == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            zzc zzcVar2 = zzc.f10627e;
            if (zzcVar != zzcVar2 && this.f10614c == null) {
                throw new GeneralSecurityException("Point format is not set");
            }
            if (zzcVar != zzcVar2 || this.f10614c == null) {
                return new zzkf(this.f10612a, this.f10613b, this.f10614c, this.f10615d, this.f10616e, this.f10617f);
            }
            throw new GeneralSecurityException("For Curve25519 point format must not be set");
        }

        public final void b(zzcq zzcqVar) throws GeneralSecurityException {
            if (!zzkf.f10605g.contains(zzcqVar)) {
                throw new GeneralSecurityException(a.g("Invalid DEM parameters ", String.valueOf(zzcqVar), "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
            }
            this.f10615d = zzcqVar;
        }

        private zza() {
            this.f10612a = null;
            this.f10613b = null;
            this.f10614c = null;
            this.f10615d = null;
            this.f10616e = zzd.f10631d;
            this.f10617f = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zzb f10618b = new zzb("SHA1");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzb f10619c = new zzb("SHA224");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zzb f10620d = new zzb("SHA256");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final zzb f10621e = new zzb("SHA384");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final zzb f10622f = new zzb("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10623a;

        public zzb(String str) {
            this.f10623a = str;
        }

        public final String toString() {
            return this.f10623a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzc {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zzc f10624b = new zzc("NIST_P256");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzc f10625c = new zzc("NIST_P384");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zzc f10626d = new zzc("NIST_P521");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final zzc f10627e = new zzc("X25519");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10628a;

        public zzc(String str) {
            this.f10628a = str;
        }

        public final String toString() {
            return this.f10628a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzd {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zzd f10629b = new zzd("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zzd f10630c = new zzd(ealNNtLp.TKzgkjrkJxnfXk);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zzd f10631d = new zzd("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10632a;

        public zzd(String str) {
            this.f10632a = str;
        }

        public final String toString() {
            return this.f10632a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zze {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final zze f10633b = new zze("COMPRESSED");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final zze f10634c = new zze("UNCOMPRESSED");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final zze f10635d = new zze("LEGACY_UNCOMPRESSED");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10636a;

        public zze(String str) {
            this.f10636a = str;
        }

        public final String toString() {
            return this.f10636a;
        }
    }

    public zzkf(zzc zzcVar, zzb zzbVar, zze zzeVar, zzcq zzcqVar, zzd zzdVar, zzzv zzzvVar) {
        this.f10606a = zzcVar;
        this.f10607b = zzbVar;
        this.f10608c = zzeVar;
        this.f10610e = zzcqVar;
        this.f10609d = zzdVar;
        this.f10611f = zzzvVar;
    }

    public static zza b() {
        return new zza(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcq
    public final boolean a() {
        return this.f10609d != zzd.f10631d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkf)) {
            return false;
        }
        zzkf zzkfVar = (zzkf) obj;
        return Objects.equals(zzkfVar.f10606a, this.f10606a) && Objects.equals(zzkfVar.f10607b, this.f10607b) && Objects.equals(zzkfVar.f10608c, this.f10608c) && Objects.equals(zzkfVar.f10610e, this.f10610e) && Objects.equals(zzkfVar.f10609d, this.f10609d) && Objects.equals(zzkfVar.f10611f, this.f10611f);
    }

    public final int hashCode() {
        return Objects.hash(zzkf.class, this.f10606a, this.f10607b, this.f10608c, this.f10610e, this.f10609d, this.f10611f);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.f10606a, this.f10607b, this.f10608c, this.f10610e, this.f10609d, this.f10611f);
    }
}
