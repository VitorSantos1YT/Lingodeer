package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpc f10493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzoy f10494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zznu f10495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zznq f10496d;

    static {
        zzzv zzzvVarC = zzqj.c("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f10493a = new zzpf(zzdu.class, new zzpe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgs
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpe
            public final zzpw a(zzcq zzcqVar) throws GeneralSecurityException {
                zzdu zzduVar = (zzdu) zzcqVar;
                zzpc zzpcVar = zzgp.f10493a;
                zzwn.zza zzaVarV = zzwn.v();
                zzaVarV.l("type.googleapis.com/google.crypto.tink.AesEaxKey");
                zztj.zza zzaVarZ = zztj.z();
                zztm zztmVarC = zzgp.c(zzduVar);
                zzaVarZ.i();
                zztj.y((zztj) zzaVarZ.f10131b, zztmVarC);
                int i11 = zzduVar.f10343a;
                zzaVarZ.i();
                ((zztj) zzaVarZ.f10131b).zzg = i11;
                zzaVarV.m(((zztj) zzaVarZ.g()).f());
                zzaVarV.k(zzgp.b(zzduVar.f10346d));
                return zzpw.a((zzwn) zzaVarV.g());
            }
        });
        f10494b = new zzpb(zzzvVarC, new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgr
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
            public final zzcq a(zzpw zzpwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzgp.f10493a;
                zzwn zzwnVar = zzpwVar.f10844b;
                if (!zzwnVar.E().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", zzwnVar.E()));
                }
                try {
                    zztj zztjVarW = zztj.w(zzwnVar.D(), zzakj.f10117b);
                    zzdu.zzb zzbVarB = zzdu.b();
                    zzbVarB.c(zztjVarW.v());
                    zzbVarB.b(zztjVarW.B().v());
                    zzbVarB.d();
                    zzbVarB.f10354d = zzgp.a(zzwnVar.C());
                    return zzbVarB.a();
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e8);
                }
            }
        });
        f10495c = new zznx(zzdp.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgu
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzdp zzdpVar = (zzdp) zzbtVar;
                zzpc zzpcVar = zzgp.f10493a;
                zztg.zza zzaVarZ = zztg.z();
                zztm zztmVarC = zzgp.c(zzdpVar.f10333a);
                zzaVarZ.i();
                zztg.y((zztg) zzaVarZ.f10131b, zztmVarC);
                zzzw zzzwVar = zzdpVar.f10334b;
                zzcw.a(zzcwVar);
                byte[] bArrC = zzzwVar.c(zzcwVar);
                zzaje zzajeVarG = zzaje.g(bArrC, 0, bArrC.length);
                zzaVarZ.i();
                zztg.x((zztg) zzaVarZ.f10131b, zzajeVarG);
                return zzpx.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zztg) zzaVarZ.g()).f(), zzwj.zza.SYMMETRIC, zzgp.b(zzdpVar.f10333a.f10346d), zzdpVar.f10336d);
            }
        });
        f10496d = new zznt(zzzvVarC, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgt
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzgp.f10493a;
                if (!zzpxVar.f10845a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    zztg zztgVarW = zztg.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zztgVarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzdu.zzb zzbVarB = zzdu.b();
                    zzbVarB.c(zztgVarW.C().d());
                    zzbVarB.b(zztgVarW.B().v());
                    zzbVarB.d();
                    zzbVarB.f10354d = zzgp.a(zzpxVar.f10849e);
                    zzdu zzduVarA = zzbVarB.a();
                    zzdp.zza zzaVar = new zzdp.zza(0);
                    zzaVar.f10337a = zzduVarA;
                    byte[] bArrR = zztgVarW.C().r();
                    zzcw.a(zzcwVar);
                    zzaVar.f10338b = zzzw.b(bArrR, zzcwVar);
                    zzaVar.f10339c = zzpxVar.f10850f;
                    return zzaVar.a();
                } catch (zzale unused) {
                    throw new GeneralSecurityException("Parsing AesEaxKey failed");
                }
            }
        });
    }

    public static zzdu.zza a(zzxl zzxlVar) throws GeneralSecurityException {
        int i11 = zzgw.f10500a[zzxlVar.ordinal()];
        if (i11 == 1) {
            return zzdu.zza.f10347b;
        }
        if (i11 == 2 || i11 == 3) {
            return zzdu.zza.f10348c;
        }
        if (i11 == 4) {
            return zzdu.zza.f10349d;
        }
        throw new GeneralSecurityException(p.j(zzxlVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static zzxl b(zzdu.zza zzaVar) throws GeneralSecurityException {
        if (zzdu.zza.f10347b.equals(zzaVar)) {
            return zzxl.TINK;
        }
        if (zzdu.zza.f10348c.equals(zzaVar)) {
            return zzxl.CRUNCHY;
        }
        if (zzdu.zza.f10349d.equals(zzaVar)) {
            return zzxl.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }

    public static zztm c(zzdu zzduVar) throws GeneralSecurityException {
        if (zzduVar.f10345c != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(zzduVar.f10345c)));
        }
        zztm.zza zzaVarX = zztm.x();
        int i11 = zzduVar.f10344b;
        zzaVarX.i();
        ((zztm) zzaVarX.f10131b).zze = i11;
        return (zztm) zzaVarX.g();
    }
}
