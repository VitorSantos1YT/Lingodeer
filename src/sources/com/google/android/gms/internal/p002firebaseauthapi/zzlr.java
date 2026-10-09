package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpc f10698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzoy f10699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zznu f10700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zznq f10701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zznu f10702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zznq f10703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zznk f10704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zznk f10705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final zznk f10706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final zznk f10707j;

    static {
        zzzv zzzvVarC = zzqj.c("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zzzv zzzvVarC2 = zzqj.c("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        f10698a = new zzpf(zzkf.class, new zzpe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlq
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpe
            public final zzpw a(zzcq zzcqVar) throws GeneralSecurityException {
                zzkf zzkfVar = (zzkf) zzcqVar;
                zzpc zzpcVar = zzlr.f10698a;
                zzwn.zza zzaVarV = zzwn.v();
                zzaVarV.l("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
                zzup.zza zzaVarV2 = zzup.v();
                zzus zzusVarD = zzlr.d(zzkfVar);
                zzaVarV2.i();
                zzup.x((zzup) zzaVarV2.f10131b, zzusVarD);
                zzaVarV.m(((zzup) zzaVarV2.g()).f());
                zzaVarV.k((zzxl) zzlr.f10704g.b(zzkfVar.f10609d));
                return zzpw.a((zzwn) zzaVarV.g());
            }
        });
        f10699b = new zzpb(zzzvVarC, new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlt
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
            public final zzcq a(zzpw zzpwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzlr.f10698a;
                zzwn zzwnVar = zzpwVar.f10844b;
                if (!zzwnVar.E().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to EciesProtoSerialization.parseParameters: ", zzwnVar.E()));
                }
                try {
                    return zzlr.b(zzwnVar.C(), zzup.w(zzwnVar.D(), zzakj.f10117b).z());
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing EciesParameters failed: ", e8);
                }
            }
        });
        f10700c = new zznx(zzkl.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzls
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) {
                zzkl zzklVar = (zzkl) zzbtVar;
                return zzpx.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzlr.c(zzklVar).f(), zzwj.zza.ASYMMETRIC_PUBLIC, (zzxl) zzlr.f10704g.b(zzklVar.f10664a.f10609d), zzklVar.f10668e);
            }
        });
        f10701d = new zznt(zzzvVarC2, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzlr.f10698a;
                String str = zzpxVar.f10845a;
                Integer num = zzpxVar.f10850f;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ", str));
                }
                try {
                    zzuy zzuyVarW = zzuy.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zzuyVarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzkf zzkfVarB = zzlr.b(zzpxVar.f10849e, zzuyVarW.A());
                    if (!zzkfVarB.f10606a.equals(zzkf.zzc.f10627e)) {
                        return zzkl.f(zzkfVarB, new ECPoint(zznh.a(zzuyVarW.F().r()), zznh.a(zzuyVarW.G().r())), num);
                    }
                    if (zzuyVarW.G().d() == 0) {
                        return zzkl.e(zzkfVarB, zzzv.a(zzuyVarW.F().r()), num);
                    }
                    throw new GeneralSecurityException("Y must be empty for X25519 points");
                } catch (zzale | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            }
        });
        f10702e = new zznx(zzki.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlu
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzki zzkiVar = (zzki) zzbtVar;
                zzpc zzpcVar = zzlr.f10698a;
                zzuv.zza zzaVarA = zzuv.A();
                zzaVarA.i();
                ((zzuv) zzaVarA.f10131b).zzf = 0;
                zzuy zzuyVarC = zzlr.c(zzkiVar.f10637a);
                zzaVarA.i();
                zzuv.z((zzuv) zzaVarA.f10131b, zzuyVarC);
                zzkf zzkfVar = zzkiVar.f10637a.f10664a;
                if (zzkfVar.f10606a.equals(zzkf.zzc.f10627e)) {
                    zzzw zzzwVar = zzkiVar.f10639c;
                    zzcw.a(zzcwVar);
                    byte[] bArrC = zzzwVar.c(zzcwVar);
                    zzaje zzajeVarG = zzaje.g(bArrC, 0, bArrC.length);
                    zzaVarA.i();
                    zzuv.y((zzuv) zzaVarA.f10131b, zzajeVarG);
                } else {
                    int iA = zzlr.a(zzkfVar.f10606a);
                    zzzu zzzuVar = zzkiVar.f10638b;
                    zzcw.a(zzcwVar);
                    byte[] bArrC2 = zznh.c(zzzuVar.f11061a, iA);
                    zzaje zzajeVar = zzaje.f10066b;
                    zzaje zzajeVarG2 = zzaje.g(bArrC2, 0, bArrC2.length);
                    zzaVarA.i();
                    zzuv.y((zzuv) zzaVarA.f10131b, zzajeVarG2);
                }
                return zzpx.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((zzuv) zzaVarA.g()).f(), zzwj.zza.ASYMMETRIC_PRIVATE, (zzxl) zzlr.f10704g.b(zzkfVar.f10609d), zzkiVar.b());
            }
        });
        f10703f = new zznt(zzzvVarC, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzlr.f10698a;
                String str = zzpxVar.f10845a;
                Integer num = zzpxVar.f10850f;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ", str));
                }
                try {
                    zzuv zzuvVarW = zzuv.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zzuvVarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzuy zzuyVarC = zzuvVarW.C();
                    if (zzuyVarC.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzkf zzkfVarB = zzlr.b(zzpxVar.f10849e, zzuyVarC.A());
                    if (zzkfVarB.f10606a.equals(zzkf.zzc.f10627e)) {
                        zzkl zzklVarE = zzkl.e(zzkfVarB, zzzv.a(zzuyVarC.F().r()), num);
                        byte[] bArrR = zzuvVarW.D().r();
                        zzcw.a(zzcwVar);
                        return zzki.f(zzklVarE, zzzw.b(bArrR, zzcwVar));
                    }
                    zzkl zzklVarF = zzkl.f(zzkfVarB, new ECPoint(zznh.a(zzuyVarC.F().r()), zznh.a(zzuyVarC.G().r())), num);
                    BigInteger bigIntegerA = zznh.a(zzuvVarW.D().r());
                    zzcw.a(zzcwVar);
                    return zzki.e(zzklVarF, new zzzu(bigIntegerA));
                } catch (zzale | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            }
        });
        zznn zznnVarA = zznk.a();
        zznnVarA.b(zzxl.RAW, zzkf.zzd.f10631d);
        zznnVarA.b(zzxl.TINK, zzkf.zzd.f10629b);
        zzxl zzxlVar = zzxl.LEGACY;
        zzkf.zzd zzdVar = zzkf.zzd.f10630c;
        zznnVarA.b(zzxlVar, zzdVar);
        zznnVarA.b(zzxl.CRUNCHY, zzdVar);
        f10704g = zznnVarA.a();
        zznn zznnVarA2 = zznk.a();
        zznnVarA2.b(zzvk.SHA1, zzkf.zzb.f10618b);
        zznnVarA2.b(zzvk.SHA224, zzkf.zzb.f10619c);
        zznnVarA2.b(zzvk.SHA256, zzkf.zzb.f10620d);
        zznnVarA2.b(zzvk.SHA384, zzkf.zzb.f10621e);
        zznnVarA2.b(zzvk.SHA512, zzkf.zzb.f10622f);
        f10705h = zznnVarA2.a();
        zznn zznnVarA3 = zznk.a();
        zznnVarA3.b(zzve.NIST_P256, zzkf.zzc.f10624b);
        zznnVarA3.b(zzve.NIST_P384, zzkf.zzc.f10625c);
        zznnVarA3.b(zzve.NIST_P521, zzkf.zzc.f10626d);
        zznnVarA3.b(zzve.CURVE25519, zzkf.zzc.f10627e);
        f10706i = zznnVarA3.a();
        zznn zznnVarA4 = zznk.a();
        zznnVarA4.b(zzun.UNCOMPRESSED, zzkf.zze.f10634c);
        zznnVarA4.b(zzun.COMPRESSED, zzkf.zze.f10633b);
        zznnVarA4.b(zzun.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzkf.zze.f10635d);
        f10707j = zznnVarA4.a();
    }

    public static int a(zzkf.zzc zzcVar) throws GeneralSecurityException {
        if (zzkf.zzc.f10624b.equals(zzcVar)) {
            return 33;
        }
        if (zzkf.zzc.f10625c.equals(zzcVar)) {
            return 49;
        }
        if (zzkf.zzc.f10626d.equals(zzcVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(String.valueOf(zzcVar)));
    }

    public static zzkf b(zzxl zzxlVar, zzus zzusVar) throws GeneralSecurityException {
        zzwn.zza zzaVarV = zzwn.v();
        zzaVarV.l(zzusVar.z().z().E());
        zzaVarV.k(zzxl.RAW);
        zzaVarV.m(zzusVar.z().z().D());
        zzwn zzwnVar = (zzwn) zzaVarV.g();
        zzkf.zza zzaVarB = zzkf.b();
        zzaVarB.f10616e = (zzkf.zzd) f10704g.c(zzxlVar);
        zzaVarB.f10612a = (zzkf.zzc) f10706i.c(zzusVar.D().B());
        zzaVarB.f10613b = (zzkf.zzb) f10705h.c(zzusVar.D().C());
        zzaVarB.b(zzcy.a(zzwnVar.g()));
        zzzv zzzvVarA = zzzv.a(zzusVar.D().D().r());
        if (zzzvVarA.f11062a.length == 0) {
            zzaVarB.f10617f = null;
        } else {
            zzaVarB.f10617f = zzzvVarA;
        }
        if (!zzusVar.D().B().equals(zzve.CURVE25519)) {
            zzaVarB.f10614c = (zzkf.zze) f10707j.c(zzusVar.v());
        } else if (!zzusVar.v().equals(zzun.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return zzaVarB.a();
    }

    public static zzuy c(zzkl zzklVar) throws GeneralSecurityException {
        zzkf zzkfVar = zzklVar.f10664a;
        if (zzkfVar.f10606a.equals(zzkf.zzc.f10627e)) {
            zzuy.zza zzaVarC = zzuy.C();
            zzaVarC.i();
            ((zzuy) zzaVarC.f10131b).zzf = 0;
            zzus zzusVarD = d(zzkfVar);
            zzaVarC.i();
            zzuy.z((zzuy) zzaVarC.f10131b, zzusVarD);
            byte[] bArrB = zzklVar.f10666c.b();
            zzaje zzajeVarG = zzaje.g(bArrB, 0, bArrB.length);
            zzaVarC.i();
            zzuy.y((zzuy) zzaVarC.f10131b, zzajeVarG);
            zzaje zzajeVar = zzaje.f10066b;
            zzaVarC.i();
            zzuy.B((zzuy) zzaVarC.f10131b, zzajeVar);
            return (zzuy) zzaVarC.g();
        }
        int iA = a(zzkfVar.f10606a);
        ECPoint eCPoint = zzklVar.f10665b;
        if (eCPoint == null) {
            throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
        }
        zzuy.zza zzaVarC2 = zzuy.C();
        zzaVarC2.i();
        ((zzuy) zzaVarC2.f10131b).zzf = 0;
        zzus zzusVarD2 = d(zzkfVar);
        zzaVarC2.i();
        zzuy.z((zzuy) zzaVarC2.f10131b, zzusVarD2);
        byte[] bArrC = zznh.c(eCPoint.getAffineX(), iA);
        zzaje zzajeVar2 = zzaje.f10066b;
        zzaje zzajeVarG2 = zzaje.g(bArrC, 0, bArrC.length);
        zzaVarC2.i();
        zzuy.y((zzuy) zzaVarC2.f10131b, zzajeVarG2);
        byte[] bArrC2 = zznh.c(eCPoint.getAffineY(), iA);
        zzaje zzajeVarG3 = zzaje.g(bArrC2, 0, bArrC2.length);
        zzaVarC2.i();
        zzuy.B((zzuy) zzaVarC2.f10131b, zzajeVarG3);
        return (zzuy) zzaVarC2.g();
    }

    public static zzus d(zzkf zzkfVar) throws GeneralSecurityException {
        zzvb.zza zzaVarV = zzvb.v();
        zzve zzveVar = (zzve) f10706i.b(zzkfVar.f10606a);
        zzaVarV.i();
        ((zzvb) zzaVarV.f10131b).zze = zzveVar.zza();
        zzvk zzvkVar = (zzvk) f10705h.b(zzkfVar.f10607b);
        zzaVarV.i();
        ((zzvb) zzaVarV.f10131b).zzf = zzvkVar.zza();
        zzzv zzzvVar = zzkfVar.f10611f;
        if (zzzvVar != null && zzzvVar.f11062a.length > 0) {
            byte[] bArrB = zzzvVar.b();
            zzaje zzajeVarG = zzaje.g(bArrB, 0, bArrB.length);
            zzaVarV.i();
            zzvb.w((zzvb) zzaVarV.f10131b, zzajeVarG);
        }
        zzvb zzvbVar = (zzvb) zzaVarV.g();
        try {
            zzwn zzwnVarW = zzwn.w(zzcy.b(zzkfVar.f10610e), zzakj.f10117b);
            zzum.zza zzaVarV2 = zzum.v();
            zzwn.zza zzaVarV3 = zzwn.v();
            zzaVarV3.l(zzwnVarW.E());
            zzaVarV3.k(zzxl.TINK);
            zzaVarV3.m(zzwnVarW.D());
            zzwn zzwnVar = (zzwn) zzaVarV3.g();
            zzaVarV2.i();
            zzum.w((zzum) zzaVarV2.f10131b, zzwnVar);
            zzum zzumVar = (zzum) zzaVarV2.g();
            zzkf.zze zzeVar = zzkfVar.f10608c;
            if (zzeVar == null) {
                zzeVar = zzkf.zze.f10633b;
            }
            zzus.zza zzaVarA = zzus.A();
            zzaVarA.i();
            zzus.y((zzus) zzaVarA.f10131b, zzvbVar);
            zzaVarA.i();
            zzus.w((zzus) zzaVarA.f10131b, zzumVar);
            zzun zzunVar = (zzun) f10707j.b(zzeVar);
            zzaVarA.i();
            ((zzus) zzaVarA.f10131b).zzh = zzunVar.zza();
            return (zzus) zzaVarA.g();
        } catch (zzale e8) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e8);
        }
    }
}
