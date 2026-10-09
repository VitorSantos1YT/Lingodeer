package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpc f10527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzoy f10528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zznu f10529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zznq f10530d;

    static {
        zzzv zzzvVarC = zzqj.c("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f10527a = new zzpf(zzeq.class, new zzpe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhn
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpe
            public final zzpw a(zzcq zzcqVar) {
                zzpc zzpcVar = zzho.f10527a;
                zzwn.zza zzaVarV = zzwn.v();
                zzaVarV.l("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                zzaVarV.m(zzuk.x().f());
                zzaVarV.k(zzho.b(((zzeq) zzcqVar).f10405a));
                return zzpw.a((zzwn) zzaVarV.g());
            }
        });
        f10528b = new zzpb(zzzvVarC, new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhq
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
            public final zzcq a(zzpw zzpwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzho.f10527a;
                zzwn zzwnVar = zzpwVar.f10844b;
                if (!zzwnVar.E().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ", zzwnVar.E()));
                }
                try {
                    zzuk.w(zzwnVar.D(), zzakj.f10117b);
                    return new zzeq(zzho.a(zzwnVar.C()));
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e8);
                }
            }
        });
        f10529c = new zznx(zzem.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhp
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzem zzemVar = (zzem) zzbtVar;
                zzpc zzpcVar = zzho.f10527a;
                zzuh.zza zzaVarY = zzuh.y();
                zzzw zzzwVar = zzemVar.f10399b;
                zzcw.a(zzcwVar);
                byte[] bArrC = zzzwVar.c(zzcwVar);
                zzaje zzajeVarG = zzaje.g(bArrC, 0, bArrC.length);
                zzaVarY.i();
                zzuh.x((zzuh) zzaVarY.f10131b, zzajeVarG);
                return zzpx.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzuh) zzaVarY.g()).f(), zzwj.zza.SYMMETRIC, zzho.b(zzemVar.f10398a.f10405a), zzemVar.f10401d);
            }
        });
        f10530d = new zznt(zzzvVarC, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhs
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzho.f10527a;
                if (!zzpxVar.f10845a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    zzuh zzuhVarW = zzuh.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zzuhVarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzeq.zza zzaVarA = zzho.a(zzpxVar.f10849e);
                    byte[] bArrR = zzuhVarW.A().r();
                    zzcw.a(zzcwVar);
                    return zzem.e(zzaVarA, zzzw.b(bArrR, zzcwVar), zzpxVar.f10850f);
                } catch (zzale unused) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            }
        });
    }

    public static zzeq.zza a(zzxl zzxlVar) throws GeneralSecurityException {
        int i11 = zzhr.f10531a[zzxlVar.ordinal()];
        if (i11 == 1) {
            return zzeq.zza.f10406b;
        }
        if (i11 == 2 || i11 == 3) {
            return zzeq.zza.f10407c;
        }
        if (i11 == 4) {
            return zzeq.zza.f10408d;
        }
        throw new GeneralSecurityException(p.j(zzxlVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static zzxl b(zzeq.zza zzaVar) throws GeneralSecurityException {
        if (zzeq.zza.f10406b.equals(zzaVar)) {
            return zzxl.TINK;
        }
        if (zzeq.zza.f10407c.equals(zzaVar)) {
            return zzxl.CRUNCHY;
        }
        if (zzeq.zza.f10408d.equals(zzaVar)) {
            return zzxl.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }
}
