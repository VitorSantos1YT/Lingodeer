package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpc f10671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzoy f10672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zznu f10673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zznq f10674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zznu f10675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zznq f10676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zznk f10677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zznk f10678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final zznk f10679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final zznk f10680j;

    static {
        zzzv zzzvVarC = zzqj.c("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        zzzv zzzvVarC2 = zzqj.c("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        f10671a = new zzpf(zzkk.class, new zzpe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzko
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpe
            public final zzpw a(zzcq zzcqVar) {
                zzkk zzkkVar = (zzkk) zzcqVar;
                zzpc zzpcVar = zzkp.f10671a;
                zzwn.zza zzaVarV = zzwn.v();
                zzaVarV.l("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
                zzvx.zza zzaVarX = zzvx.x();
                zzwa zzwaVarD = zzkp.d(zzkkVar);
                zzaVarX.i();
                zzvx.w((zzvx) zzaVarX.f10131b, zzwaVarD);
                zzaVarV.m(((zzvx) zzaVarX.g()).f());
                zzaVarV.k((zzxl) zzkp.f10677g.b(zzkkVar.f10643d));
                return zzpw.a((zzwn) zzaVarV.g());
            }
        });
        f10672b = new zzpb(zzzvVarC, new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkr
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
            public final zzcq a(zzpw zzpwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzkp.f10671a;
                zzwn zzwnVar = zzpwVar.f10844b;
                if (!zzwnVar.E().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ", zzwnVar.E()));
                }
                try {
                    return zzkp.a(zzwnVar.C(), zzvx.v(zzwnVar.D(), zzakj.f10117b).z());
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e8);
                }
            }
        });
        f10673c = new zznx(zzku.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkq
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) {
                zzku zzkuVar = (zzku) zzbtVar;
                return zzpx.a("type.googleapis.com/google.crypto.tink.HpkePublicKey", zzkp.b(zzkuVar).f(), zzwj.zza.ASYMMETRIC_PUBLIC, (zzxl) zzkp.f10677g.b(zzkuVar.f10681a.f10643d), zzkuVar.f10684d);
            }
        });
        f10674d = new zznt(zzzvVarC2, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkt
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzkp.f10671a;
                String str = zzpxVar.f10845a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ", str));
                }
                try {
                    zzwg zzwgVarW = zzwg.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zzwgVarW.v() != 0) {
                        throw new GeneralSecurityException(txBUGYhC.wdkeWqkw);
                    }
                    zzkk zzkkVarA = zzkp.a(zzpxVar.f10849e, zzwgVarW.A());
                    return zzku.e(zzkkVarA, zzkp.c(zzkkVarA.f10640a, zzwgVarW.E().r()), zzpxVar.f10850f);
                } catch (zzale unused) {
                    throw new GeneralSecurityException("Parsing HpkePublicKey failed");
                }
            }
        });
        f10675e = new zznx(zzkm.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzks
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzkm zzkmVar = (zzkm) zzbtVar;
                zzpc zzpcVar = zzkp.f10671a;
                zzwd.zza zzaVarA = zzwd.A();
                zzaVarA.i();
                ((zzwd) zzaVarA.f10131b).zzf = 0;
                zzwg zzwgVarB = zzkp.b(zzkmVar.f10669a);
                zzaVarA.i();
                zzwd.z((zzwd) zzaVarA.f10131b, zzwgVarB);
                zzzw zzzwVar = zzkmVar.f10670b;
                zzcw.a(zzcwVar);
                byte[] bArrC = zzzwVar.c(zzcwVar);
                zzaje zzajeVarG = zzaje.g(bArrC, 0, bArrC.length);
                zzaVarA.i();
                zzwd.y((zzwd) zzaVarA.f10131b, zzajeVarG);
                return zzpx.a("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((zzwd) zzaVarA.g()).f(), zzwj.zza.ASYMMETRIC_PRIVATE, (zzxl) zzkp.f10677g.b(zzkmVar.f10669a.f10681a.f10643d), zzkmVar.b());
            }
        });
        f10676f = new zznt(zzzvVarC, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzkp.f10671a;
                String str = zzpxVar.f10845a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ", str));
                }
                try {
                    zzwd zzwdVarW = zzwd.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zzwdVarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzwg zzwgVarC = zzwdVarW.C();
                    if (zzwgVarC.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzkk zzkkVarA = zzkp.a(zzpxVar.f10849e, zzwgVarC.A());
                    zzkk.zzf zzfVar = zzkkVarA.f10640a;
                    zzku zzkuVarE = zzku.e(zzkkVarA, zzkp.c(zzfVar, zzwgVarC.E().r()), zzpxVar.f10850f);
                    byte[] bArrC = zznh.c(zznh.a(zzwdVarW.D().r()), zzml.a(zzfVar));
                    zzcw.a(zzcwVar);
                    return zzkm.e(zzkuVarE, zzzw.b(bArrC, zzcwVar));
                } catch (zzale unused) {
                    throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
                }
            }
        });
        zznn zznnVarA = zznk.a();
        zznnVarA.b(zzxl.RAW, zzkk.zze.f10658d);
        zznnVarA.b(zzxl.TINK, zzkk.zze.f10656b);
        zzxl zzxlVar = zzxl.LEGACY;
        zzkk.zze zzeVar = zzkk.zze.f10657c;
        zznnVarA.b(zzxlVar, zzeVar);
        zznnVarA.b(zzxl.CRUNCHY, zzeVar);
        f10677g = zznnVarA.a();
        zznn zznnVarA2 = zznk.a();
        zznnVarA2.b(zzvu.DHKEM_P256_HKDF_SHA256, zzkk.zzf.f10660c);
        zznnVarA2.b(zzvu.DHKEM_P384_HKDF_SHA384, zzkk.zzf.f10661d);
        zznnVarA2.b(zzvu.DHKEM_P521_HKDF_SHA512, zzkk.zzf.f10662e);
        zznnVarA2.b(zzvu.DHKEM_X25519_HKDF_SHA256, zzkk.zzf.f10663f);
        f10678h = zznnVarA2.a();
        zznn zznnVarA3 = zznk.a();
        zznnVarA3.b(zzvv.HKDF_SHA256, zzkk.zzc.f10649c);
        zznnVarA3.b(zzvv.HKDF_SHA384, zzkk.zzc.f10650d);
        zznnVarA3.b(zzvv.HKDF_SHA512, zzkk.zzc.f10651e);
        f10679i = zznnVarA3.a();
        zznn zznnVarA4 = zznk.a();
        zznnVarA4.b(zzvs.AES_128_GCM, zzkk.zzb.f10646c);
        zznnVarA4.b(zzvs.AES_256_GCM, zzkk.zzb.f10647d);
        zznnVarA4.b(zzvs.CHACHA20_POLY1305, zzkk.zzb.f10648e);
        f10680j = zznnVarA4.a();
    }

    public static zzkk a(zzxl zzxlVar, zzwa zzwaVar) {
        zzkk.zzd zzdVarB = zzkk.b();
        zzdVarB.f10655d = (zzkk.zze) f10677g.c(zzxlVar);
        zzdVarB.f10652a = (zzkk.zzf) f10678h.c(zzwaVar.A());
        zzdVarB.f10653b = (zzkk.zzc) f10679i.c(zzwaVar.z());
        zzdVarB.f10654c = (zzkk.zzb) f10680j.c(zzwaVar.v());
        return zzdVarB.a();
    }

    public static zzwg b(zzku zzkuVar) {
        zzwg.zza zzaVarB = zzwg.B();
        zzaVarB.i();
        ((zzwg) zzaVarB.f10131b).zzf = 0;
        zzwa zzwaVarD = d(zzkuVar.f10681a);
        zzaVarB.i();
        zzwg.z((zzwg) zzaVarB.f10131b, zzwaVarD);
        byte[] bArrB = zzkuVar.f10682b.b();
        zzaje zzajeVarG = zzaje.g(bArrB, 0, bArrB.length);
        zzaVarB.i();
        zzwg.y((zzwg) zzaVarB.f10131b, zzajeVarG);
        return (zzwg) zzaVarB.g();
    }

    public static zzzv c(zzkk.zzf zzfVar, byte[] bArr) throws GeneralSecurityException {
        int i11;
        BigInteger bigIntegerA = zznh.a(bArr);
        byte[] bArr2 = zzml.f10729a;
        if (zzfVar == zzkk.zzf.f10663f) {
            i11 = 32;
        } else if (zzfVar == zzkk.zzf.f10660c) {
            i11 = 65;
        } else if (zzfVar == zzkk.zzf.f10661d) {
            i11 = 97;
        } else {
            if (zzfVar != zzkk.zzf.f10662e) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i11 = 133;
        }
        return zzzv.a(zznh.c(bigIntegerA, i11));
    }

    public static zzwa d(zzkk zzkkVar) {
        zzwa.zza zzaVarB = zzwa.B();
        zzvu zzvuVar = (zzvu) f10678h.b(zzkkVar.f10640a);
        zzaVarB.i();
        ((zzwa) zzaVarB.f10131b).zze = zzvuVar.zza();
        zzvv zzvvVar = (zzvv) f10679i.b(zzkkVar.f10641b);
        zzaVarB.i();
        ((zzwa) zzaVarB.f10131b).zzf = zzvvVar.zza();
        zzvs zzvsVar = (zzvs) f10680j.b(zzkkVar.f10642c);
        zzaVarB.i();
        ((zzwa) zzaVarB.f10131b).zzg = zzvsVar.zza();
        return (zzwa) zzaVarB.g();
    }
}
