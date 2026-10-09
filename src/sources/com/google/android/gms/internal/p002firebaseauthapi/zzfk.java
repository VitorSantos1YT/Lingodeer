package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpc f10450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzoy f10451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zznu f10452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zznq f10453d;

    static {
        zzzv zzzvVarC = zzqj.c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f10450a = new zzpf(zzfg.class, new zzpe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfj
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpe
            public final zzpw a(zzcq zzcqVar) {
                zzfg zzfgVar = (zzfg) zzcqVar;
                zzpc zzpcVar = zzfk.f10450a;
                zzwn.zza zzaVarV = zzwn.v();
                zzaVarV.l("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                zzaVarV.m(zzfk.c(zzfgVar).f());
                zzaVarV.k(zzfk.b(zzfgVar.f10429a));
                return zzpw.a((zzwn) zzaVarV.g());
            }
        });
        f10451b = new zzpb(zzzvVarC, new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
            public final zzcq a(zzpw zzpwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzfk.f10450a;
                zzwn zzwnVar = zzpwVar.f10844b;
                if (!zzwnVar.E().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ", zzwnVar.E()));
                }
                try {
                    return zzfk.a(zzxi.w(zzwnVar.D(), zzakj.f10117b), zzwnVar.C());
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e8);
                }
            }
        });
        f10452c = new zznx(zzfh.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfl
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzfh zzfhVar = (zzfh) zzbtVar;
                zzpc zzpcVar = zzfk.f10450a;
                zzxf.zza zzaVarY = zzxf.y();
                zzxi zzxiVarC = zzfk.c(zzfhVar.f10447a);
                zzaVarY.i();
                zzxf.x((zzxf) zzaVarY.f10131b, zzxiVarC);
                return zzpx.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzxf) zzaVarY.g()).f(), zzwj.zza.REMOTE, zzfk.b(zzfhVar.f10447a.f10429a), zzfhVar.f10449c);
            }
        });
        f10453d = new zznt(zzzvVarC, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfo
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzfk.f10450a;
                if (!zzpxVar.f10845a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    zzxf zzxfVarW = zzxf.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zzxfVarW.v() == 0) {
                        return zzfh.e(zzfk.a(zzxfVarW.A(), zzpxVar.f10849e), zzpxVar.f10850f);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(zzxfVarW)));
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e8);
                }
            }
        });
    }

    public static zzfg a(zzxi zzxiVar, zzxl zzxlVar) throws GeneralSecurityException {
        zzfg.zza zzaVar;
        zzfg.zzc zzcVar;
        zzwn.zza zzaVarV = zzwn.v();
        zzaVarV.l(zzxiVar.v().E());
        zzaVarV.m(zzxiVar.v().D());
        zzaVarV.k(zzxl.RAW);
        zzcq zzcqVarA = zzcy.a(((zzwn) zzaVarV.g()).g());
        boolean z11 = zzcqVarA instanceof zzed;
        zzfg.zza zzaVar2 = zzfg.zza.f10438g;
        zzfg.zza zzaVar3 = zzfg.zza.f10437f;
        zzfg.zza zzaVar4 = zzfg.zza.f10436e;
        zzfg.zza zzaVar5 = zzfg.zza.f10434c;
        zzfg.zza zzaVar6 = zzfg.zza.f10435d;
        zzfg.zza zzaVar7 = zzfg.zza.f10433b;
        if (z11) {
            zzaVar = zzaVar7;
        } else if (zzcqVarA instanceof zzeq) {
            zzaVar = zzaVar6;
        } else if (zzcqVarA instanceof zzgi) {
            zzaVar = zzaVar5;
        } else if (zzcqVarA instanceof zzdo) {
            zzaVar = zzaVar4;
        } else if (zzcqVarA instanceof zzdu) {
            zzaVar = zzaVar3;
        } else {
            if (!(zzcqVarA instanceof zzek)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(String.valueOf(zzcqVarA)));
            }
            zzaVar = zzaVar2;
        }
        zzfg.zzb zzbVar = new zzfg.zzb(0);
        int i11 = zzfn.f10454a[zzxlVar.ordinal()];
        zzfg.zzc zzcVar2 = zzfg.zzc.f10445c;
        if (i11 == 1) {
            zzcVar = zzfg.zzc.f10444b;
        } else {
            if (i11 != 2) {
                throw new GeneralSecurityException(p.j(zzxlVar.zza(), "Unable to parse OutputPrefixType: "));
            }
            zzcVar = zzcVar2;
        }
        zzbVar.f10440a = zzcVar;
        String strC = zzxiVar.C();
        zzbVar.f10441b = strC;
        zzdg zzdgVar = (zzdg) zzcqVarA;
        zzbVar.f10443d = zzdgVar;
        zzbVar.f10442c = zzaVar;
        if (zzbVar.f10440a == null) {
            zzbVar.f10440a = zzcVar2;
        }
        if (strC == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (zzdgVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzdgVar.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        zzfg.zza zzaVar8 = zzbVar.f10442c;
        zzdg zzdgVar2 = zzbVar.f10443d;
        if ((zzaVar8.equals(zzaVar7) && (zzdgVar2 instanceof zzed)) || ((zzaVar8.equals(zzaVar6) && (zzdgVar2 instanceof zzeq)) || ((zzaVar8.equals(zzaVar5) && (zzdgVar2 instanceof zzgi)) || ((zzaVar8.equals(zzaVar4) && (zzdgVar2 instanceof zzdo)) || ((zzaVar8.equals(zzaVar3) && (zzdgVar2 instanceof zzdu)) || (zzaVar8.equals(zzaVar2) && (zzdgVar2 instanceof zzek))))))) {
            return new zzfg(zzbVar.f10440a, zzbVar.f10441b, zzbVar.f10442c, zzbVar.f10443d);
        }
        throw new GeneralSecurityException(a.h("Cannot use parsing strategy ", zzbVar.f10442c.f10439a, " when new keys are picked according to ", String.valueOf(zzbVar.f10443d), "."));
    }

    public static zzxl b(zzfg.zzc zzcVar) throws GeneralSecurityException {
        if (zzfg.zzc.f10444b.equals(zzcVar)) {
            return zzxl.TINK;
        }
        if (zzfg.zzc.f10445c.equals(zzcVar)) {
            return zzxl.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzcVar)));
    }

    public static zzxi c(zzfg zzfgVar) throws GeneralSecurityException {
        try {
            zzwn zzwnVarW = zzwn.w(zzcy.b(zzfgVar.f10432d), zzakj.f10117b);
            zzxi.zza zzaVarZ = zzxi.z();
            String str = zzfgVar.f10430b;
            zzaVarZ.i();
            zzxi.y((zzxi) zzaVarZ.f10131b, str);
            zzaVarZ.i();
            zzxi.x((zzxi) zzaVarZ.f10131b, zzwnVarW);
            return (zzxi) zzaVarZ.g();
        } catch (zzale e8) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e8);
        }
    }
}
