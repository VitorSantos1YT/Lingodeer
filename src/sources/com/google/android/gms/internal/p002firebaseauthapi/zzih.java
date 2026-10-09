package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import java.util.Objects;
import nv.p;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpc f10548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzoy f10549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zznu f10550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zznq f10551d;

    static {
        zzzv zzzvVarC = zzqj.c("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f10548a = new zzpf(zzgd.class, new zzpe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzik
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpe
            public final zzpw a(zzcq zzcqVar) {
                zzgd zzgdVar = (zzgd) zzcqVar;
                zzpc zzpcVar = zzih.f10548a;
                zzwn.zza zzaVarV = zzwn.v();
                zzaVarV.l("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                zzxq.zza zzaVarY = zzxq.y();
                zzxt.zza zzaVarX = zzxt.x();
                int i11 = zzgdVar.f10472b;
                zzaVarX.i();
                ((zzxt) zzaVarX.f10131b).zze = i11;
                zzxt zzxtVar = (zzxt) zzaVarX.g();
                zzaVarY.i();
                zzxq.x((zzxq) zzaVarY.f10131b, zzxtVar);
                zzaVarV.m(((zzxq) zzaVarY.g()).f());
                zzaVarV.k(zzih.b(zzgdVar.f10471a));
                return zzpw.a((zzwn) zzaVarV.g());
            }
        });
        f10549b = new zzpb(zzzvVarC, new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzij
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
            public final zzcq a(zzpw zzpwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzih.f10548a;
                zzwn zzwnVar = zzpwVar.f10844b;
                if (!zzwnVar.E().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ", zzwnVar.E()));
                }
                try {
                    zzxq zzxqVarW = zzxq.w(zzwnVar.D(), zzakj.f10117b);
                    if (zzxqVarW.v() == 0) {
                        return zzgd.b(zzih.a(zzwnVar.C()), zzxqVarW.A().v());
                    }
                    throw new GeneralSecurityException(OYAvlbfUyD.qyAaMNfwKKN);
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e8);
                }
            }
        });
        f10550c = new zznx(zzga.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzim
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzga zzgaVar = (zzga) zzbtVar;
                zzpc zzpcVar = zzih.f10548a;
                zzxn.zza zzaVarZ = zzxn.z();
                zzzw zzzwVar = zzgaVar.f10468b;
                zzcw.a(zzcwVar);
                byte[] bArrC = zzzwVar.c(zzcwVar);
                zzaje zzajeVarG = zzaje.g(bArrC, 0, bArrC.length);
                zzaVarZ.i();
                zzxn.x((zzxn) zzaVarZ.f10131b, zzajeVarG);
                zzxt.zza zzaVarX = zzxt.x();
                zzgd zzgdVar = zzgaVar.f10467a;
                int i11 = zzgdVar.f10472b;
                zzaVarX.i();
                ((zzxt) zzaVarX.f10131b).zze = i11;
                zzxt zzxtVar = (zzxt) zzaVarX.g();
                zzaVarZ.i();
                zzxn.y((zzxn) zzaVarZ.f10131b, zzxtVar);
                return zzpx.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzxn) zzaVarZ.g()).f(), zzwj.zza.SYMMETRIC, zzih.b(zzgdVar.f10471a), zzgaVar.f10470d);
            }
        });
        f10551d = new zznt(zzzvVarC, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzil
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzih.f10548a;
                if (!zzpxVar.f10845a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    zzxn zzxnVarW = zzxn.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zzxnVarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (zzxnVarW.C().d() != 32) {
                        throw new GeneralSecurityException("Only 32 byte key size is accepted");
                    }
                    zzgd zzgdVarB = zzgd.b(zzih.a(zzpxVar.f10849e), zzxnVarW.B().v());
                    byte[] bArrR = zzxnVarW.C().r();
                    zzcw.a(zzcwVar);
                    return zzga.e(zzgdVarB, zzzw.b(bArrR, zzcwVar), zzpxVar.f10850f);
                } catch (zzale unused) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            }
        });
    }

    public static zzgd.zza a(zzxl zzxlVar) throws GeneralSecurityException {
        int i11 = zzio.f10559a[zzxlVar.ordinal()];
        if (i11 == 1) {
            return zzgd.zza.f10473b;
        }
        if (i11 == 2) {
            return zzgd.zza.f10474c;
        }
        throw new GeneralSecurityException(p.j(zzxlVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static zzxl b(zzgd.zza zzaVar) throws GeneralSecurityException {
        if (Objects.equals(zzaVar, zzgd.zza.f10473b)) {
            return zzxl.TINK;
        }
        if (Objects.equals(zzaVar, zzgd.zza.f10474c)) {
            return zzxl.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }
}
