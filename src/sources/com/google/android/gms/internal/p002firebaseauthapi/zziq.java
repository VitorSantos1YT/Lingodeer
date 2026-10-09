package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zziq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpc f10560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzoy f10561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zznu f10562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zznq f10563d;

    static {
        zzzv zzzvVarC = zzqj.c("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f10560a = new zzpf(zzgi.class, new zzpe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzip
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpe
            public final zzpw a(zzcq zzcqVar) {
                zzpc zzpcVar = zziq.f10560a;
                zzwn.zza zzaVarV = zzwn.v();
                zzaVarV.l("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                zzaVarV.m(zzxz.y().f());
                zzaVarV.k(zziq.b(((zzgi) zzcqVar).f10484a));
                return zzpw.a((zzwn) zzaVarV.g());
            }
        });
        f10561b = new zzpb(zzzvVarC, new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzis
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
            public final zzcq a(zzpw zzpwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zziq.f10560a;
                zzwn zzwnVar = zzpwVar.f10844b;
                if (!zzwnVar.E().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", zzwnVar.E()));
                }
                try {
                    if (zzxz.w(zzwnVar.D(), zzakj.f10117b).v() == 0) {
                        return new zzgi(zziq.a(zzwnVar.C()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e8);
                }
            }
        });
        f10562c = new zznx(zzgf.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzir
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzgf zzgfVar = (zzgf) zzbtVar;
                zzpc zzpcVar = zziq.f10560a;
                zzxw.zza zzaVarY = zzxw.y();
                zzzw zzzwVar = zzgfVar.f10481b;
                zzcw.a(zzcwVar);
                byte[] bArrC = zzzwVar.c(zzcwVar);
                zzaje zzajeVarG = zzaje.g(bArrC, 0, bArrC.length);
                zzaVarY.i();
                zzxw.x((zzxw) zzaVarY.f10131b, zzajeVarG);
                return zzpx.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzxw) zzaVarY.g()).f(), zzwj.zza.SYMMETRIC, zziq.b(zzgfVar.f10480a.f10484a), zzgfVar.f10483d);
            }
        });
        f10563d = new zznt(zzzvVarC, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zziu
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zziq.f10560a;
                if (!zzpxVar.f10845a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    zzxw zzxwVarW = zzxw.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zzxwVarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzgi.zza zzaVarA = zziq.a(zzpxVar.f10849e);
                    byte[] bArrR = zzxwVarW.A().r();
                    zzcw.a(zzcwVar);
                    return zzgf.e(zzaVarA, zzzw.b(bArrR, zzcwVar), zzpxVar.f10850f);
                } catch (zzale unused) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            }
        });
    }

    public static zzgi.zza a(zzxl zzxlVar) throws GeneralSecurityException {
        int i11 = zzit.f10564a[zzxlVar.ordinal()];
        if (i11 == 1) {
            return zzgi.zza.f10485b;
        }
        if (i11 == 2 || i11 == 3) {
            return zzgi.zza.f10486c;
        }
        if (i11 == 4) {
            return zzgi.zza.f10487d;
        }
        throw new GeneralSecurityException(p.j(zzxlVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static zzxl b(zzgi.zza zzaVar) throws GeneralSecurityException {
        if (zzgi.zza.f10485b.equals(zzaVar)) {
            return zzxl.TINK;
        }
        if (zzgi.zza.f10486c.equals(zzaVar)) {
            return zzxl.CRUNCHY;
        }
        if (zzgi.zza.f10487d.equals(zzaVar)) {
            return zzxl.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }
}
