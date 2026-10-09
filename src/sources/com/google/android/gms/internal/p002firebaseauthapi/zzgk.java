package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpc f10489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzoy f10490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zznu f10491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zznq f10492d;

    static {
        zzzv zzzvVarC = zzqj.c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f10489a = new zzpf(zzdo.class, new zzpe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpe
            public final zzpw a(zzcq zzcqVar) throws GeneralSecurityException {
                zzdo zzdoVar = (zzdo) zzcqVar;
                zzpc zzpcVar = zzgk.f10489a;
                zzwn.zza zzaVarV = zzwn.v();
                zzaVarV.l("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                zzsu.zza zzaVarV2 = zzsu.v();
                zzta.zza zzaVarY = zzta.y();
                zztd.zza zzaVarX = zztd.x();
                int i11 = zzdoVar.f10313c;
                zzaVarX.i();
                ((zztd) zzaVarX.f10131b).zze = i11;
                zztd zztdVar = (zztd) zzaVarX.g();
                zzaVarY.i();
                zzta.x((zzta) zzaVarY.f10131b, zztdVar);
                int i12 = zzdoVar.f10311a;
                zzaVarY.i();
                ((zzta) zzaVarY.f10131b).zzg = i12;
                zzta zztaVar = (zzta) zzaVarY.g();
                zzaVarV2.i();
                zzsu.x((zzsu) zzaVarV2.f10131b, zztaVar);
                zzvm.zza zzaVarA = zzvm.A();
                zzvp zzvpVarD = zzgk.d(zzdoVar);
                zzaVarA.i();
                zzvm.y((zzvm) zzaVarA.f10131b, zzvpVarD);
                int i13 = zzdoVar.f10312b;
                zzaVarA.i();
                ((zzvm) zzaVarA.f10131b).zzg = i13;
                zzvm zzvmVar = (zzvm) zzaVarA.g();
                zzaVarV2.i();
                zzsu.y((zzsu) zzaVarV2.f10131b, zzvmVar);
                zzaVarV.m(((zzsu) zzaVarV2.g()).f());
                zzaVarV.k(zzgk.c(zzdoVar.f10315e));
                return zzpw.a((zzwn) zzaVarV.g());
            }
        });
        f10490b = new zzpb(zzzvVarC, new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgl
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
            public final zzcq a(zzpw zzpwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzgk.f10489a;
                zzwn zzwnVar = zzpwVar.f10844b;
                if (!zzwnVar.E().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ", zzwnVar.E()));
                }
                try {
                    zzsu zzsuVarW = zzsu.w(zzwnVar.D(), zzakj.f10117b);
                    if (zzsuVarW.B().z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzdo.zza zzaVarB = zzdo.b();
                    zzaVarB.b(zzsuVarW.A().v());
                    zzaVarB.c(zzsuVarW.B().v());
                    zzaVarB.d(zzsuVarW.A().B().v());
                    zzaVarB.e(zzsuVarW.B().D().v());
                    zzaVarB.f10321e = zzgk.b(zzsuVarW.B().D().y());
                    zzaVarB.f10322f = zzgk.a(zzwnVar.C());
                    return zzaVarB.a();
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e8);
                }
            }
        });
        f10491c = new zznx(zzdh.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgo
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzdh zzdhVar = (zzdh) zzbtVar;
                zzpc zzpcVar = zzgk.f10489a;
                zzsr.zza zzaVarZ = zzsr.z();
                zzsx.zza zzaVarY = zzsx.y();
                zztd.zza zzaVarX = zztd.x();
                int i11 = zzdhVar.f10297a.f10313c;
                zzaVarX.i();
                ((zztd) zzaVarX.f10131b).zze = i11;
                zztd zztdVar = (zztd) zzaVarX.g();
                zzaVarY.i();
                zzsx.x((zzsx) zzaVarY.f10131b, zztdVar);
                zzzw zzzwVar = zzdhVar.f10298b;
                zzcw.a(zzcwVar);
                byte[] bArrC = zzzwVar.c(zzcwVar);
                zzaje zzajeVarG = zzaje.g(bArrC, 0, bArrC.length);
                zzaVarY.i();
                zzsx.w((zzsx) zzaVarY.f10131b, zzajeVarG);
                zzsx zzsxVar = (zzsx) zzaVarY.g();
                zzaVarZ.i();
                zzsr.x((zzsr) zzaVarZ.f10131b, zzsxVar);
                zzvj.zza zzaVarZ2 = zzvj.z();
                zzdo zzdoVar = zzdhVar.f10297a;
                zzvp zzvpVarD = zzgk.d(zzdoVar);
                zzaVarZ2.i();
                zzvj.y((zzvj) zzaVarZ2.f10131b, zzvpVarD);
                byte[] bArrC2 = zzdhVar.f10299c.c(zzcwVar);
                zzaje zzajeVarG2 = zzaje.g(bArrC2, 0, bArrC2.length);
                zzaVarZ2.i();
                zzvj.x((zzvj) zzaVarZ2.f10131b, zzajeVarG2);
                zzvj zzvjVar = (zzvj) zzaVarZ2.g();
                zzaVarZ.i();
                zzsr.y((zzsr) zzaVarZ.f10131b, zzvjVar);
                return zzpx.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzsr) zzaVarZ.g()).f(), zzwj.zza.SYMMETRIC, zzgk.c(zzdoVar.f10315e), zzdhVar.f10301e);
            }
        });
        f10492d = new zznt(zzzvVarC, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgn
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzgk.f10489a;
                if (!zzpxVar.f10845a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    zzsr zzsrVarW = zzsr.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zzsrVarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (zzsrVarW.B().v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (zzsrVarW.C().v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    zzdo.zza zzaVarB = zzdo.b();
                    zzaVarB.b(zzsrVarW.B().C().d());
                    zzaVarB.c(zzsrVarW.C().D().d());
                    zzaVarB.d(zzsrVarW.B().B().v());
                    zzaVarB.e(zzsrVarW.C().C().v());
                    zzaVarB.f10321e = zzgk.b(zzsrVarW.C().C().y());
                    zzaVarB.f10322f = zzgk.a(zzpxVar.f10849e);
                    zzdo zzdoVarA = zzaVarB.a();
                    zzdh.zza zzaVar = new zzdh.zza(0);
                    zzaVar.f10302a = zzdoVarA;
                    byte[] bArrR = zzsrVarW.B().C().r();
                    zzcw.a(zzcwVar);
                    zzaVar.f10303b = zzzw.b(bArrR, zzcwVar);
                    zzaVar.f10304c = zzzw.b(zzsrVarW.C().D().r(), zzcwVar);
                    zzaVar.f10305d = zzpxVar.f10850f;
                    return zzaVar.a();
                } catch (zzale unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            }
        });
    }

    public static zzdo.zzb a(zzxl zzxlVar) throws GeneralSecurityException {
        int i11 = zzgq.f10497a[zzxlVar.ordinal()];
        if (i11 == 1) {
            return zzdo.zzb.f10323b;
        }
        if (i11 == 2 || i11 == 3) {
            return zzdo.zzb.f10324c;
        }
        if (i11 == 4) {
            return zzdo.zzb.f10325d;
        }
        throw new GeneralSecurityException(p.j(zzxlVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static zzdo.zzc b(zzvk zzvkVar) throws GeneralSecurityException {
        int i11 = zzgq.f10498b[zzvkVar.ordinal()];
        if (i11 == 1) {
            return zzdo.zzc.f10327b;
        }
        if (i11 == 2) {
            return zzdo.zzc.f10328c;
        }
        if (i11 == 3) {
            return zzdo.zzc.f10329d;
        }
        if (i11 == 4) {
            return zzdo.zzc.f10330e;
        }
        if (i11 == 5) {
            return zzdo.zzc.f10331f;
        }
        throw new GeneralSecurityException(p.j(zzvkVar.zza(), "Unable to parse HashType: "));
    }

    public static zzxl c(zzdo.zzb zzbVar) throws GeneralSecurityException {
        if (zzdo.zzb.f10323b.equals(zzbVar)) {
            return zzxl.TINK;
        }
        if (zzdo.zzb.f10324c.equals(zzbVar)) {
            return zzxl.CRUNCHY;
        }
        if (zzdo.zzb.f10325d.equals(zzbVar)) {
            return zzxl.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    public static zzvp d(zzdo zzdoVar) throws GeneralSecurityException {
        zzvk zzvkVar;
        zzvp.zza zzaVarZ = zzvp.z();
        int i11 = zzdoVar.f10314d;
        zzaVarZ.i();
        ((zzvp) zzaVarZ.f10131b).zzf = i11;
        zzdo.zzc zzcVar = zzdoVar.f10316f;
        if (zzdo.zzc.f10327b.equals(zzcVar)) {
            zzvkVar = zzvk.SHA1;
        } else if (zzdo.zzc.f10328c.equals(zzcVar)) {
            zzvkVar = zzvk.SHA224;
        } else if (zzdo.zzc.f10329d.equals(zzcVar)) {
            zzvkVar = zzvk.SHA256;
        } else if (zzdo.zzc.f10330e.equals(zzcVar)) {
            zzvkVar = zzvk.SHA384;
        } else {
            if (!zzdo.zzc.f10331f.equals(zzcVar)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzcVar)));
            }
            zzvkVar = zzvk.SHA512;
        }
        zzaVarZ.i();
        ((zzvp) zzaVarZ.f10131b).zze = zzvkVar.zza();
        return (zzvp) zzaVarZ.g();
    }
}
