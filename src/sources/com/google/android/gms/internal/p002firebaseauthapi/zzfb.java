package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzfb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpc f10424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzoy f10425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zznu f10426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zznq f10427d;

    static {
        zzzv zzzvVarC = zzqj.c("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f10424a = new zzpf(zzez.class, new zzpe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfa
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpe
            public final zzpw a(zzcq zzcqVar) {
                zzez zzezVar = (zzez) zzcqVar;
                zzpc zzpcVar = zzfb.f10424a;
                zzwn.zza zzaVarV = zzwn.v();
                zzaVarV.l("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                zzxc.zza zzaVarV2 = zzxc.v();
                String str = zzezVar.f10419a;
                zzaVarV2.i();
                zzxc.x((zzxc) zzaVarV2.f10131b, str);
                zzaVarV.m(((zzxc) zzaVarV2.g()).f());
                zzaVarV.k(zzfb.b(zzezVar.f10420b));
                return zzpw.a((zzwn) zzaVarV.g());
            }
        });
        f10425b = new zzpb(zzzvVarC, new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
            public final zzcq a(zzpw zzpwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzfb.f10424a;
                zzwn zzwnVar = zzpwVar.f10844b;
                if (!zzwnVar.E().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", zzwnVar.E()));
                }
                try {
                    return new zzez(zzxc.w(zzwnVar.D(), zzakj.f10117b).A(), zzfb.a(zzwnVar.C()));
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e8);
                }
            }
        });
        f10426c = new zznx(zzex.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) {
                zzex zzexVar = (zzex) zzbtVar;
                zzpc zzpcVar = zzfb.f10424a;
                zzwz.zza zzaVarY = zzwz.y();
                zzxc.zza zzaVarV = zzxc.v();
                String str = zzexVar.f10416a.f10419a;
                zzaVarV.i();
                zzxc.x((zzxc) zzaVarV.f10131b, str);
                zzxc zzxcVar = (zzxc) zzaVarV.g();
                zzaVarY.i();
                zzwz.x((zzwz) zzaVarY.f10131b, zzxcVar);
                return zzpx.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzwz) zzaVarY.g()).f(), zzwj.zza.REMOTE, zzfb.b(zzexVar.f10416a.f10420b), zzexVar.f10418c);
            }
        });
        f10427d = new zznt(zzzvVarC, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzff
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzfb.f10424a;
                if (!zzpxVar.f10845a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    zzwz zzwzVarW = zzwz.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zzwzVarW.v() == 0) {
                        return zzex.e(new zzez(zzwzVarW.A().A(), zzfb.a(zzpxVar.f10849e)), zzpxVar.f10850f);
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(zzwzVarW)));
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e8);
                }
            }
        });
    }

    public static zzez.zza a(zzxl zzxlVar) throws GeneralSecurityException {
        int i11 = zzfe.f10428a[zzxlVar.ordinal()];
        if (i11 == 1) {
            return zzez.zza.f10421b;
        }
        if (i11 == 2) {
            return zzez.zza.f10422c;
        }
        throw new GeneralSecurityException(p.j(zzxlVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static zzxl b(zzez.zza zzaVar) throws GeneralSecurityException {
        if (zzez.zza.f10421b.equals(zzaVar)) {
            return zzxl.TINK;
        }
        if (zzez.zza.f10422c.equals(zzaVar)) {
            return zzxl.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzaVar)));
    }
}
