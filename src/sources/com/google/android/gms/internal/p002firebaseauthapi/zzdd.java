package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzwn f10292a = a(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzwn f10293b = a(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzwn f10294c;

    static {
        c(16);
        c(32);
        zzvk zzvkVar = zzvk.SHA256;
        f10294c = b(16, 16, zzvkVar);
        b(32, 32, zzvkVar);
        zzwn.zza zzaVarV = zzwn.v();
        zzpn zzpnVar = zzep.f10402a;
        zzaVarV.l("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzxl zzxlVar = zzxl.TINK;
        zzaVarV.k(zzxlVar);
        zzwn.zza zzaVarV2 = zzwn.v();
        zzpn zzpnVar2 = zzge.f10476a;
        zzaVarV2.l("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzaVarV2.k(zzxlVar);
    }

    public static zzwn a(int i11) {
        zzts.zza zzaVarZ = zzts.z();
        zzaVarZ.i();
        ((zzts) zzaVarZ.f10131b).zze = i11;
        zzts zztsVar = (zzts) zzaVarZ.g();
        zzwn.zza zzaVarV = zzwn.v();
        zzaVarV.m(zztsVar.f());
        zzpn zzpnVar = zzea.f10362a;
        zzaVarV.l("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzaVarV.k(zzxl.TINK);
        return (zzwn) zzaVarV.g();
    }

    public static zzwn b(int i11, int i12, zzvk zzvkVar) {
        zzta.zza zzaVarY = zzta.y();
        zztd.zza zzaVarX = zztd.x();
        zzaVarX.i();
        ((zztd) zzaVarX.f10131b).zze = 16;
        zztd zztdVar = (zztd) zzaVarX.g();
        zzaVarY.i();
        zzta.x((zzta) zzaVarY.f10131b, zztdVar);
        zzaVarY.i();
        ((zzta) zzaVarY.f10131b).zzg = i11;
        zzta zztaVar = (zzta) zzaVarY.g();
        zzvm.zza zzaVarA = zzvm.A();
        zzvp.zza zzaVarZ = zzvp.z();
        zzaVarZ.i();
        ((zzvp) zzaVarZ.f10131b).zze = zzvkVar.zza();
        zzaVarZ.i();
        ((zzvp) zzaVarZ.f10131b).zzf = i12;
        zzvp zzvpVar = (zzvp) zzaVarZ.g();
        zzaVarA.i();
        zzvm.y((zzvm) zzaVarA.f10131b, zzvpVar);
        zzaVarA.i();
        ((zzvm) zzaVarA.f10131b).zzg = 32;
        zzvm zzvmVar = (zzvm) zzaVarA.g();
        zzsu.zza zzaVarV = zzsu.v();
        zzaVarV.i();
        zzsu.x((zzsu) zzaVarV.f10131b, zztaVar);
        zzaVarV.i();
        zzsu.y((zzsu) zzaVarV.f10131b, zzvmVar);
        zzsu zzsuVar = (zzsu) zzaVarV.g();
        zzwn.zza zzaVarV2 = zzwn.v();
        zzaVarV2.m(zzsuVar.f());
        zzpn zzpnVar = zzdl.f10306a;
        zzaVarV2.l("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzaVarV2.k(zzxl.TINK);
        return (zzwn) zzaVarV2.g();
    }

    public static void c(int i11) {
        zztj.zza zzaVarZ = zztj.z();
        zzaVarZ.i();
        ((zztj) zzaVarZ.f10131b).zzg = i11;
        zztm.zza zzaVarX = zztm.x();
        zzaVarX.i();
        ((zztm) zzaVarX.f10131b).zze = 16;
        zztm zztmVar = (zztm) zzaVarX.g();
        zzaVarZ.i();
        zztj.y((zztj) zzaVarZ.f10131b, zztmVar);
        zztj zztjVar = (zztj) zzaVarZ.g();
        zzwn.zza zzaVarV = zzwn.v();
        zzaVarV.m(zztjVar.f());
        zzpn zzpnVar = zzdt.f10340a;
        zzaVarV.l("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzaVarV.k(zzxl.TINK);
    }
}
