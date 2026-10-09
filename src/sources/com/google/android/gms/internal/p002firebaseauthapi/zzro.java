package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpc f10923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzoy f10924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zznu f10925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zznq f10926d;

    static {
        zzzv zzzvVarC = zzqj.c("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f10923a = new zzpf(zzqp.class, new zzpe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrn
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpe
            public final zzpw a(zzcq zzcqVar) {
                zzqp zzqpVar = (zzqp) zzcqVar;
                zzpc zzpcVar = zzro.f10923a;
                zzwn.zza zzaVarV = zzwn.v();
                zzaVarV.l("type.googleapis.com/google.crypto.tink.AesCmacKey");
                zzsl.zza zzaVarZ = zzsl.z();
                zzso.zza zzaVarX = zzso.x();
                int i11 = zzqpVar.f10876b;
                zzaVarX.i();
                ((zzso) zzaVarX.f10131b).zze = i11;
                zzso zzsoVar = (zzso) zzaVarX.g();
                zzaVarZ.i();
                zzsl.y((zzsl) zzaVarZ.f10131b, zzsoVar);
                int i12 = zzqpVar.f10875a;
                zzaVarZ.i();
                ((zzsl) zzaVarZ.f10131b).zzf = i12;
                zzaVarV.m(((zzsl) zzaVarZ.g()).f());
                zzaVarV.k(zzro.b(zzqpVar.f10877c));
                return zzpw.a((zzwn) zzaVarV.g());
            }
        });
        f10924b = new zzpb(zzzvVarC, new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrq
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
            public final zzcq a(zzpw zzpwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzro.f10923a;
                zzwn zzwnVar = zzpwVar.f10844b;
                if (!zzwnVar.E().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", zzwnVar.E()));
                }
                try {
                    zzsl zzslVarW = zzsl.w(zzwnVar.D(), zzakj.f10117b);
                    zzqp.zza zzaVar = new zzqp.zza(0);
                    zzaVar.b(zzslVarW.v());
                    zzaVar.c(zzslVarW.B().v());
                    zzaVar.f10880c = zzro.a(zzwnVar.C());
                    return zzaVar.a();
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e8);
                }
            }
        });
        f10925c = new zznx(zzqi.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrp
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzqi zzqiVar = (zzqi) zzbtVar;
                zzpc zzpcVar = zzro.f10923a;
                zzsi.zza zzaVarZ = zzsi.z();
                zzqp zzqpVar = zzqiVar.f10864a;
                zzso.zza zzaVarX = zzso.x();
                int i11 = zzqpVar.f10876b;
                zzaVarX.i();
                ((zzso) zzaVarX.f10131b).zze = i11;
                zzso zzsoVar = (zzso) zzaVarX.g();
                zzaVarZ.i();
                zzsi.y((zzsi) zzaVarZ.f10131b, zzsoVar);
                zzzw zzzwVar = zzqiVar.f10865b;
                zzcw.a(zzcwVar);
                byte[] bArrC = zzzwVar.c(zzcwVar);
                zzaje zzajeVarG = zzaje.g(bArrC, 0, bArrC.length);
                zzaVarZ.i();
                zzsi.x((zzsi) zzaVarZ.f10131b, zzajeVarG);
                return zzpx.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzsi) zzaVarZ.g()).f(), zzwj.zza.SYMMETRIC, zzro.b(zzqiVar.f10864a.f10877c), zzqiVar.f10866c);
            }
        });
        f10926d = new zznt(zzzvVarC, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrs
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzro.f10923a;
                if (!zzpxVar.f10845a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    zzsi zzsiVarW = zzsi.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zzsiVarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzqp.zza zzaVar = new zzqp.zza(0);
                    zzaVar.b(zzsiVarW.C().d());
                    zzaVar.c(zzsiVarW.B().v());
                    zzaVar.f10880c = zzro.a(zzpxVar.f10849e);
                    zzqp zzqpVarA = zzaVar.a();
                    zzqi.zza zzaVar2 = new zzqi.zza(0);
                    zzaVar2.f10867a = zzqpVarA;
                    byte[] bArrR = zzsiVarW.C().r();
                    zzcw.a(zzcwVar);
                    zzaVar2.f10868b = zzzw.b(bArrR, zzcwVar);
                    zzaVar2.f10869c = zzpxVar.f10850f;
                    return zzaVar2.a();
                } catch (zzale | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            }
        });
    }

    public static zzqp.zzb a(zzxl zzxlVar) throws GeneralSecurityException {
        int i11 = zzrr.f10927a[zzxlVar.ordinal()];
        if (i11 == 1) {
            return zzqp.zzb.f10881b;
        }
        if (i11 == 2) {
            return zzqp.zzb.f10882c;
        }
        if (i11 == 3) {
            return zzqp.zzb.f10883d;
        }
        if (i11 == 4) {
            return zzqp.zzb.f10884e;
        }
        throw new GeneralSecurityException(p.j(zzxlVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static zzxl b(zzqp.zzb zzbVar) throws GeneralSecurityException {
        if (zzqp.zzb.f10881b.equals(zzbVar)) {
            return zzxl.TINK;
        }
        if (zzqp.zzb.f10882c.equals(zzbVar)) {
            return zzxl.CRUNCHY;
        }
        if (zzqp.zzb.f10884e.equals(zzbVar)) {
            return zzxl.RAW;
        }
        if (zzqp.zzb.f10883d.equals(zzbVar)) {
            return zzxl.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }
}
