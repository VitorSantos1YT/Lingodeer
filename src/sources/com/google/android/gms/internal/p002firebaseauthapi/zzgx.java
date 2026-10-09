package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpc f10501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzoy f10502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zznu f10503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zznq f10504d;

    static {
        zzzv zzzvVarC = zzqj.c("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f10501a = new zzpf(zzed.class, new zzpe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzha
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpe
            public final zzpw a(zzcq zzcqVar) throws GeneralSecurityException {
                zzed zzedVar = (zzed) zzcqVar;
                zzgx.c(zzedVar);
                zzwn.zza zzaVarV = zzwn.v();
                zzaVarV.l("type.googleapis.com/google.crypto.tink.AesGcmKey");
                zzts.zza zzaVarZ = zzts.z();
                int i11 = zzedVar.f10367a;
                zzaVarZ.i();
                ((zzts) zzaVarZ.f10131b).zze = i11;
                zzaVarV.m(((zzts) zzaVarZ.g()).f());
                zzaVarV.k(zzgx.b(zzedVar.f10370d));
                return zzpw.a((zzwn) zzaVarV.g());
            }
        });
        f10502b = new zzpb(zzzvVarC, new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgz
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
            public final zzcq a(zzpw zzpwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzgx.f10501a;
                zzwn zzwnVar = zzpwVar.f10844b;
                if (!zzwnVar.E().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", zzwnVar.E()));
                }
                try {
                    zzts zztsVarW = zzts.w(zzwnVar.D(), zzakj.f10117b);
                    if (zztsVarW.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    zzed.zza zzaVarB = zzed.b();
                    zzaVarB.c(zztsVarW.v());
                    zzaVarB.b();
                    zzaVarB.d();
                    zzaVarB.f10374d = zzgx.a(zzwnVar.C());
                    return zzaVarB.a();
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e8);
                }
            }
        });
        f10503c = new zznx(zzdw.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhc
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzdw zzdwVar = (zzdw) zzbtVar;
                zzpc zzpcVar = zzgx.f10501a;
                zzgx.c(zzdwVar.f10355a);
                zztp.zza zzaVarY = zztp.y();
                zzzw zzzwVar = zzdwVar.f10356b;
                zzcw.a(zzcwVar);
                byte[] bArrC = zzzwVar.c(zzcwVar);
                zzaje zzajeVarG = zzaje.g(bArrC, 0, bArrC.length);
                zzaVarY.i();
                zztp.x((zztp) zzaVarY.f10131b, zzajeVarG);
                return zzpx.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zztp) zzaVarY.g()).f(), zzwj.zza.SYMMETRIC, zzgx.b(zzdwVar.f10355a.f10370d), zzdwVar.f10358d);
            }
        });
        f10504d = new zznt(zzzvVarC, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzpc zzpcVar = zzgx.f10501a;
                if (!zzpxVar.f10845a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    zztp zztpVarW = zztp.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zztpVarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzed.zza zzaVarB = zzed.b();
                    zzaVarB.c(zztpVarW.A().d());
                    zzaVarB.b();
                    zzaVarB.d();
                    zzaVarB.f10374d = zzgx.a(zzpxVar.f10849e);
                    zzed zzedVarA = zzaVarB.a();
                    zzdw.zza zzaVar = new zzdw.zza(0);
                    zzaVar.f10359a = zzedVarA;
                    byte[] bArrR = zztpVarW.A().r();
                    zzcw.a(zzcwVar);
                    zzaVar.f10360b = zzzw.b(bArrR, zzcwVar);
                    zzaVar.f10361c = zzpxVar.f10850f;
                    return zzaVar.a();
                } catch (zzale unused) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            }
        });
    }

    public static zzed.zzb a(zzxl zzxlVar) throws GeneralSecurityException {
        int i11 = zzhe.f10514a[zzxlVar.ordinal()];
        if (i11 == 1) {
            return zzed.zzb.f10375b;
        }
        if (i11 == 2 || i11 == 3) {
            return zzed.zzb.f10376c;
        }
        if (i11 == 4) {
            return zzed.zzb.f10377d;
        }
        throw new GeneralSecurityException(p.j(zzxlVar.zza(), "Unable to parse OutputPrefixType: "));
    }

    public static zzxl b(zzed.zzb zzbVar) throws GeneralSecurityException {
        if (zzed.zzb.f10375b.equals(zzbVar)) {
            return zzxl.TINK;
        }
        if (zzed.zzb.f10376c.equals(zzbVar)) {
            return zzxl.CRUNCHY;
        }
        if (zzed.zzb.f10377d.equals(zzbVar)) {
            return zzxl.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzbVar)));
    }

    public static void c(zzed zzedVar) throws GeneralSecurityException {
        int i11 = zzedVar.f10369c;
        int i12 = zzedVar.f10368b;
        if (i11 != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(zzedVar.f10369c)));
        }
        if (i12 != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(i12)));
        }
    }
}
