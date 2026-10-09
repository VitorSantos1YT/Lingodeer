package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzrt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zznk f10928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zznk f10929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzpc f10930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzoy f10931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zznu f10932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zznq f10933f;

    static {
        zzzv zzzvVarC = zzqj.c("type.googleapis.com/google.crypto.tink.HmacKey");
        zznn zznnVarA = zznk.a();
        zznnVarA.b(zzxl.RAW, zzra.zzb.f10910e);
        zznnVarA.b(zzxl.TINK, zzra.zzb.f10907b);
        zznnVarA.b(zzxl.LEGACY, zzra.zzb.f10909d);
        zznnVarA.b(zzxl.CRUNCHY, zzra.zzb.f10908c);
        f10928a = zznnVarA.a();
        zznn zznnVarA2 = zznk.a();
        zznnVarA2.b(zzvk.SHA1, zzra.zzc.f10912b);
        zznnVarA2.b(zzvk.SHA224, zzra.zzc.f10913c);
        zznnVarA2.b(zzvk.SHA256, zzra.zzc.f10914d);
        zznnVarA2.b(zzvk.SHA384, zzra.zzc.f10915e);
        zznnVarA2.b(zzvk.SHA512, zzra.zzc.f10916f);
        f10929b = zznnVarA2.a();
        f10930c = new zzpf(zzra.class, new zzpe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrw
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpe
            public final zzpw a(zzcq zzcqVar) {
                zzra zzraVar = (zzra) zzcqVar;
                zznk zznkVar = zzrt.f10928a;
                zzwn.zza zzaVarV = zzwn.v();
                zzaVarV.l("type.googleapis.com/google.crypto.tink.HmacKey");
                zzvm.zza zzaVarA = zzvm.A();
                zzvp.zza zzaVarZ = zzvp.z();
                int i11 = zzraVar.f10900b;
                zzaVarZ.i();
                ((zzvp) zzaVarZ.f10131b).zzf = i11;
                zzvk zzvkVar = (zzvk) zzrt.f10929b.b(zzraVar.f10902d);
                zzaVarZ.i();
                ((zzvp) zzaVarZ.f10131b).zze = zzvkVar.zza();
                zzvp zzvpVar = (zzvp) zzaVarZ.g();
                zzaVarA.i();
                zzvm.y((zzvm) zzaVarA.f10131b, zzvpVar);
                int i12 = zzraVar.f10899a;
                zzaVarA.i();
                ((zzvm) zzaVarA.f10131b).zzg = i12;
                zzaVarV.m(((zzvm) zzaVarA.g()).f());
                zzaVarV.k((zzxl) zzrt.f10928a.b(zzraVar.f10901c));
                return zzpw.a((zzwn) zzaVarV.g());
            }
        });
        f10931d = new zzpb(zzzvVarC, new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpa
            public final zzcq a(zzpw zzpwVar) throws GeneralSecurityException {
                zznk zznkVar = zzrt.f10928a;
                zzwn zzwnVar = zzpwVar.f10844b;
                if (!zzwnVar.E().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException(a.e("Wrong type URL in call to HmacProtoSerialization.parseParameters: ", zzwnVar.E()));
                }
                try {
                    zzvm zzvmVarW = zzvm.w(zzwnVar.D(), zzakj.f10117b);
                    if (zzvmVarW.z() != 0) {
                        throw new GeneralSecurityException(p.j(zzvmVarW.z(), "Parsing HmacParameters failed: unknown Version "));
                    }
                    zzra.zza zzaVarB = zzra.b();
                    zzaVarB.f10903a = Integer.valueOf(zzvmVarW.v());
                    zzaVarB.f10904b = Integer.valueOf(zzvmVarW.D().v());
                    zzaVarB.f10905c = (zzra.zzc) zzrt.f10929b.c(zzvmVarW.D().y());
                    zzaVarB.f10906d = (zzra.zzb) zzrt.f10928a.c(zzwnVar.C());
                    return zzaVarB.a();
                } catch (zzale e8) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e8);
                }
            }
        });
        f10932e = new zznx(zzqt.class, new zznw() { // from class: com.google.android.gms.internal.firebase-auth-api.zzry
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zznw
            public final zzpx a(zzbt zzbtVar, zzcw zzcwVar) throws GeneralSecurityException {
                zzqt zzqtVar = (zzqt) zzbtVar;
                zznk zznkVar = zzrt.f10928a;
                zzvj.zza zzaVarZ = zzvj.z();
                zzra zzraVar = zzqtVar.f10887a;
                zzvp.zza zzaVarZ2 = zzvp.z();
                int i11 = zzraVar.f10900b;
                zzaVarZ2.i();
                ((zzvp) zzaVarZ2.f10131b).zzf = i11;
                zzvk zzvkVar = (zzvk) zzrt.f10929b.b(zzraVar.f10902d);
                zzaVarZ2.i();
                ((zzvp) zzaVarZ2.f10131b).zze = zzvkVar.zza();
                zzvp zzvpVar = (zzvp) zzaVarZ2.g();
                zzaVarZ.i();
                zzvj.y((zzvj) zzaVarZ.f10131b, zzvpVar);
                zzzw zzzwVar = zzqtVar.f10888b;
                zzcw.a(zzcwVar);
                byte[] bArrC = zzzwVar.c(zzcwVar);
                zzaje zzajeVarG = zzaje.g(bArrC, 0, bArrC.length);
                zzaVarZ.i();
                zzvj.x((zzvj) zzaVarZ.f10131b, zzajeVarG);
                return zzpx.a("type.googleapis.com/google.crypto.tink.HmacKey", ((zzvj) zzaVarZ.g()).f(), zzwj.zza.SYMMETRIC, (zzxl) zzrt.f10928a.b(zzqtVar.f10887a.f10901c), zzqtVar.f10889c);
            }
        });
        f10933f = new zznt(zzzvVarC, new zzns() { // from class: com.google.android.gms.internal.firebase-auth-api.zzrx
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzns
            public final zzbt a(zzpx zzpxVar, zzcw zzcwVar) throws GeneralSecurityException {
                zznk zznkVar = zzrt.f10928a;
                if (!zzpxVar.f10845a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    zzvj zzvjVarW = zzvj.w(zzpxVar.f10847c, zzakj.f10117b);
                    if (zzvjVarW.v() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzra.zza zzaVarB = zzra.b();
                    zzaVarB.f10903a = Integer.valueOf(zzvjVarW.D().d());
                    zzaVarB.f10904b = Integer.valueOf(zzvjVarW.C().v());
                    zzaVarB.f10905c = (zzra.zzc) zzrt.f10929b.c(zzvjVarW.C().y());
                    zzaVarB.f10906d = (zzra.zzb) zzrt.f10928a.c(zzpxVar.f10849e);
                    zzra zzraVarA = zzaVarB.a();
                    zzqt.zza zzaVar = new zzqt.zza(0);
                    zzaVar.f10890a = zzraVarA;
                    byte[] bArrR = zzvjVarW.D().r();
                    zzcw.a(zzcwVar);
                    zzaVar.f10891b = zzzw.b(bArrR, zzcwVar);
                    zzaVar.f10892c = zzpxVar.f10850f;
                    return zzaVar.a();
                } catch (zzale | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
            }
        });
    }
}
