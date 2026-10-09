package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.e;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzkz implements zzbq {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbq
    public final Object a(zzbx zzbxVar, Class cls) throws Throwable {
        int i11;
        zzbs zzmbVar;
        zzzv zzzvVarC;
        zzbx zzbxVar2 = zzbxVar;
        Throwable th2 = null;
        String str = "EC";
        if (cls.equals(zzbr.class)) {
            zzbq zzbqVar = zzkw.f10685a;
            new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzky
            };
            if (((zzof) zzbxVar2.a()) != null) {
                throw null;
            }
            zzoi zzoiVar = zzol.f10808a;
            zzbt zzbtVarZzb = zzbxVar2.n().zzb();
            if (zzbtVarZzb instanceof zzkl) {
                zzkl zzklVar = (zzkl) zzbtVarZzb;
                zzkf zzkfVar = zzklVar.f10664a;
                zzyq zzyqVar = (zzyq) zzym.f11024a.b(zzkfVar.f10606a);
                ECPoint eCPoint = zzklVar.f10665b;
                byte[] byteArray = eCPoint.getAffineX().toByteArray();
                byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
                ECParameterSpec eCParameterSpecC = zzyr.c(zzyqVar);
                ECPoint eCPoint2 = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
                zzni.g(eCPoint2, eCParameterSpecC.getCurve());
                ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) zzyv.f11043f.f11044a.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint2, eCParameterSpecC));
                zzzv zzzvVar = zzkfVar.f10611f;
                if (zzzvVar != null) {
                    zzzvVar.b();
                }
                zzym.a(zzkfVar.f10607b);
                zzlk.a(zzkfVar);
                zzklVar.f10667d.b();
                zzni.g(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
            } else {
                if (!(zzbtVarZzb instanceof zzku)) {
                    throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(zzbtVarZzb.getClass())));
                }
                zzku zzkuVar = (zzku) zzbtVarZzb;
                zzkk zzkkVar = zzkuVar.f10681a;
                zzzv zzzvVar2 = zzkuVar.f10682b;
                zzme.b(zzkkVar.f10640a);
                zzme.c(zzkkVar.f10641b);
                zzme.a(zzkkVar.f10642c);
                zzzv zzzvVar3 = zzkuVar.f10683c;
                zzzvVar2.b();
                zzzvVar3.b();
            }
            return cls.cast(new zzmt());
        }
        if (!cls.equals(zzbs.class)) {
            throw new GeneralSecurityException("HybridConfigurationV1 can only create HybridEncrypt and HybridDecrypt primitives");
        }
        zzbq zzbqVar2 = zzkw.f10685a;
        new zzpu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlb
        };
        zzpi zzpiVar = new zzpi();
        int i12 = 0;
        int i13 = 0;
        while (i13 < zzbxVar2.f10265a.size()) {
            zzcd zzcdVarF = zzbxVar2.f(i13);
            if (zzcdVarF.f10279c.equals(zzbv.f10261b)) {
                zzbq zzbqVar3 = zzkw.f10685a;
                zzbt zzbtVarZzb2 = zzcdVarF.zzb();
                if (zzbtVarZzb2 instanceof zzki) {
                    zzki zzkiVar = (zzki) zzbtVarZzb2;
                    zzkl zzklVar2 = zzkiVar.f10637a;
                    zzyq zzyqVar2 = (zzyq) zzym.f11024a.b(zzklVar2.f10664a.f10606a);
                    zzzu zzzuVar = zzkiVar.f10638b;
                    if (zzcw.f10287a == null) {
                        zzzuVar.getClass();
                        throw new NullPointerException("SecretKeyAccess required");
                    }
                    ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) zzyv.f11043f.f11044a.zza(str)).generatePrivate(new ECPrivateKeySpec(zznh.a(zznh.b(zzzuVar.f11061a)), zzyr.c(zzyqVar2)));
                    byte[] bArrB = new byte[i12];
                    zzkf zzkfVar2 = zzklVar2.f10664a;
                    zzzv zzzvVar4 = zzkfVar2.f10611f;
                    if (zzzvVar4 != null) {
                        bArrB = zzzvVar4.b();
                    }
                    zzmbVar = new zzyn(eCPrivateKey, bArrB, zzym.a(zzkfVar2.f10607b), (zzyt) zzym.f11025b.b(zzkfVar2.f10608c), zzlk.a(zzkfVar2), ((zzlj) zzkiVar.zzc()).d().b());
                } else {
                    if (!(zzbtVarZzb2 instanceof zzkm)) {
                        throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(zzbtVarZzb2.getClass())));
                    }
                    zzkm zzkmVar = (zzkm) zzbtVarZzb2;
                    zzku zzkuVar2 = zzkmVar.f10669a;
                    zzkk zzkkVar2 = zzkuVar2.f10681a;
                    zzmc zzmcVarB = zzme.b(zzkkVar2.f10640a);
                    zzmd zzmdVarC = zzme.c(zzkkVar2.f10641b);
                    zzlz zzlzVarA = zzme.a(zzkkVar2.f10642c);
                    zzkk.zzf zzfVar = zzkkVar2.f10640a;
                    zzkk.zzf zzfVar2 = zzkk.zzf.f10663f;
                    boolean zEquals = zzfVar.equals(zzfVar2);
                    zzkk.zzf zzfVar3 = zzkk.zzf.f10662e;
                    zzkk.zzf zzfVar4 = zzkk.zzf.f10661d;
                    zzkk.zzf zzfVar5 = zzkk.zzf.f10660c;
                    if (zEquals) {
                        i11 = 32;
                    } else if (zzfVar.equals(zzfVar5)) {
                        i11 = 65;
                    } else if (zzfVar.equals(zzfVar4)) {
                        i11 = 97;
                    } else {
                        if (!zzfVar.equals(zzfVar3)) {
                            throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                        }
                        i11 = 133;
                    }
                    int i14 = i11;
                    zzkk.zzf zzfVar6 = zzkuVar2.f10681a.f10640a;
                    if (!zzfVar6.equals(zzfVar2) && !zzfVar6.equals(zzfVar5) && !zzfVar6.equals(zzfVar4) && !zzfVar6.equals(zzfVar3)) {
                        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                    }
                    zzmbVar = new zzmb(new zzmf(zzzv.a(zzkmVar.f10670b.c(zzcw.f10287a)), zzkuVar2.f10682b), zzmcVarB, zzmdVarC, zzlzVarA, i14, ((zzlj) zzkmVar.zzc()).d());
                }
                zzbt zzbtVarZzb3 = zzcdVarF.zzb();
                if (zzbtVarZzb3 instanceof zzlg) {
                    zzzvVarC = ((zzlj) ((zzlg) zzbtVarZzb3).zzc()).d();
                } else {
                    if (!(zzbtVarZzb3 instanceof zzoa)) {
                        throw new GeneralSecurityException(e.n("Cannot get output prefix for key of class ", zzbtVarZzb3.getClass().getName(), " with parameters ", String.valueOf(zzbtVarZzb3.a())));
                    }
                    zzzvVarC = ((zzoa) zzbtVarZzb3).c();
                }
                zzpiVar.a(zzzvVarC, new zzmp(zzmbVar, zzcdVarF.f10280d));
            } else {
                th2 = th2;
                str = str;
            }
            i13++;
            zzbxVar2 = zzbxVar;
            th2 = th2;
            str = str;
            i12 = 0;
        }
        Throwable th3 = th2;
        if (((zzof) zzbxVar.a()) != null) {
            throw th3;
        }
        return cls.cast(new zzmo(new zzpg(zzpiVar.f10830a), zzol.f10808a));
    }
}
