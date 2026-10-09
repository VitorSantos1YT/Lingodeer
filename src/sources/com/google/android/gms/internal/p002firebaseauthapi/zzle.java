package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzwn f10690a;

    static {
        byte[] bArr = new byte[0];
        zzve zzveVar = zzve.NIST_P256;
        zzvk zzvkVar = zzvk.SHA256;
        zzun zzunVar = zzun.UNCOMPRESSED;
        zzwn zzwnVar = zzdd.f10292a;
        zzxl zzxlVar = zzxl.TINK;
        f10690a = a(zzveVar, zzvkVar, zzunVar, zzwnVar, zzxlVar, bArr);
        a(zzveVar, zzvkVar, zzun.COMPRESSED, zzwnVar, zzxl.RAW, bArr);
        a(zzveVar, zzvkVar, zzunVar, zzdd.f10294c, zzxlVar, bArr);
    }

    public static zzwn a(zzve zzveVar, zzvk zzvkVar, zzun zzunVar, zzwn zzwnVar, zzxl zzxlVar, byte[] bArr) {
        zzup.zza zzaVarV = zzup.v();
        zzvb.zza zzaVarV2 = zzvb.v();
        zzaVarV2.i();
        ((zzvb) zzaVarV2.f10131b).zze = zzveVar.zza();
        zzaVarV2.i();
        ((zzvb) zzaVarV2.f10131b).zzf = zzvkVar.zza();
        zzaje zzajeVarG = zzaje.g(bArr, 0, bArr.length);
        zzaVarV2.i();
        zzvb.w((zzvb) zzaVarV2.f10131b, zzajeVarG);
        zzvb zzvbVar = (zzvb) zzaVarV2.g();
        zzum.zza zzaVarV3 = zzum.v();
        zzaVarV3.i();
        zzum.w((zzum) zzaVarV3.f10131b, zzwnVar);
        zzum zzumVar = (zzum) zzaVarV3.g();
        zzus.zza zzaVarA = zzus.A();
        zzaVarA.i();
        zzus.y((zzus) zzaVarA.f10131b, zzvbVar);
        zzaVarA.i();
        zzus.w((zzus) zzaVarA.f10131b, zzumVar);
        zzaVarA.i();
        ((zzus) zzaVarA.f10131b).zzh = zzunVar.zza();
        zzus zzusVar = (zzus) zzaVarA.g();
        zzaVarV.i();
        zzup.x((zzup) zzaVarV.f10131b, zzusVar);
        zzup zzupVar = (zzup) zzaVarV.g();
        zzwn.zza zzaVarV4 = zzwn.v();
        zzpn zzpnVar = zzkb.f10600a;
        zzaVarV4.l("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zzaVarV4.k(zzxlVar);
        zzaVarV4.m(zzupVar.f());
        return (zzwn) zzaVarV4.g();
    }
}
