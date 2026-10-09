package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpc f10515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzoy f10516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zznu f10517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zznq f10518d;

    static {
        zzzv zzzvVarC = zzqj.c("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f10515a = new zzpf(zzek.class, new zzpe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhi
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpe
            public final zzpw a(zzcq zzcqVar) {
                zzek zzekVar = (zzek) zzcqVar;
                zzpc zzpcVar = zzhf.f10515a;
                zzwn.zza zzaVarV = zzwn.v();
                zzaVarV.l("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                zzty.zza zzaVarZ = zzty.z();
                int i11 = zzekVar.f10390a;
                zzaVarZ.i();
                ((zzty) zzaVarZ.f10131b).zze = i11;
                zzaVarV.m(((zzty) zzaVarZ.g()).f());
                zzaVarV.k(zzhf.b(zzekVar.f10391b));
                return zzpw.a((zzwn) zzaVarV.g());
            }
        });
        f10516b = new zzpb(zzzvVarC, new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
            public final zzcq a(zzpw zzpwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzhf.f10515a;
                zzwn zzwnVar = zzpwVar.f10844b;
                if (!zzwnVar.E().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", zzwnVar.E()));
                }
                try {
                    zzty zztyVarW = zzty.w(zzwnVar.D(), zzakj.f10117b);
                    if (zztyVarW.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    zzek.zzb zzbVarB = zzek.b();
                    zzbVarB.b(zztyVarW.v());
                    zzbVarB.f10397b = zzhf.a(zzwnVar.C());
                    return zzbVarB.a();
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e8);
                }
            }
        });
        f10517c = new zznx(zzef.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzef zzefVar = (zzef) zzbtVar;
                zzpc zzpcVar = zzhf.f10515a;
                zztv.zza zzaVarY = zztv.y();
                zzzw zzzwVar = zzefVar.f10380b;
                zzcw.a(zzcwVar);
                byte[] bArrC = zzzwVar.c(zzcwVar);
                zzaje zzajeVarG = zzaje.g(bArrC, 0, bArrC.length);
                zzaVarY.i();
                zztv.x((zztv) zzaVarY.f10131b, zzajeVarG);
                return zzpx.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zztv) zzaVarY.g()).f(), zzwj.zza.SYMMETRIC, zzhf.b(zzefVar.f10379a.f10391b), zzefVar.f10382d);
            }
        });
        f10518d = new zznt(zzzvVarC, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzhf.f10515a;
                if (!zzpxVar.f10845a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    zztv zztvVarW = zztv.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zztvVarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzek.zzb zzbVarB = zzek.b();
                    zzbVarB.b(zztvVarW.A().d());
                    zzbVarB.f10397b = zzhf.a(zzpxVar.f10849e);
                    zzek zzekVarA = zzbVarB.a();
                    zzef.zza zzaVar = new zzef.zza(0);
                    zzaVar.f10383a = zzekVarA;
                    byte[] bArrR = zztvVarW.A().r();
                    zzcw.a(zzcwVar);
                    zzaVar.f10384b = zzzw.b(bArrR, zzcwVar);
                    zzaVar.f10385c = zzpxVar.f10850f;
                    return zzaVar.a();
                } catch (zzale unused) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            }
        });
    }

    public static zzek.zza a(zzxl zzxlVar) throws GeneralSecurityException {
        int i11 = zzhm.f10526a[zzxlVar.ordinal()];
        if (i11 == 1) {
            return zzek.zza.f10392b;
        }
        if (i11 == 2 || i11 == 3) {
            return zzek.zza.f10393c;
        }
        if (i11 == 4) {
            return zzek.zza.f10394d;
        }
        throw new GeneralSecurityException(p.j(zzxlVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static zzxl b(zzek.zza zzaVar) throws GeneralSecurityException {
        if (zzek.zza.f10392b.equals(zzaVar)) {
            return zzxl.TINK;
        }
        if (zzek.zza.f10393c.equals(zzaVar)) {
            return zzxl.CRUNCHY;
        }
        if (zzek.zza.f10394d.equals(zzaVar)) {
            return zzxl.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }
}
