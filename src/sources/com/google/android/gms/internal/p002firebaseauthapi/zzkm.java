package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkm extends zzlg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzku f10669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzw f10670b;

    public zzkm(zzku zzkuVar, zzzw zzzwVar) {
        this.f10669a = zzkuVar;
        this.f10670b = zzzwVar;
    }

    public static zzkm e(zzku zzkuVar, zzzw zzzwVar) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        zzkk zzkkVar = zzkuVar.f10681a;
        zzkk.zzf zzfVar = zzkkVar.f10640a;
        int length = zzzwVar.f11063a.f11062a.length;
        String str = "Encoded private key byte length for " + String.valueOf(zzfVar) + " must be %d, not " + length;
        zzkk.zzf zzfVar2 = zzkk.zzf.f10663f;
        zzkk.zzf zzfVar3 = zzkk.zzf.f10662e;
        zzkk.zzf zzfVar4 = zzkk.zzf.f10661d;
        zzkk.zzf zzfVar5 = zzkk.zzf.f10660c;
        if (zzfVar == zzfVar5) {
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (zzfVar == zzfVar4) {
            if (length != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (zzfVar == zzfVar3) {
            if (length != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (zzfVar != zzfVar2) {
                throw new GeneralSecurityException("Unable to validate private key length for ".concat(String.valueOf(zzfVar)));
            }
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        zzkk.zzf zzfVar6 = zzkkVar.f10640a;
        byte[] bArrB = zzkuVar.f10682b.b();
        byte[] bArrC = zzzwVar.c(zzcw.f10287a);
        if (zzfVar6 == zzfVar5 || zzfVar6 == zzfVar4 || zzfVar6 == zzfVar3) {
            if (zzfVar6 == zzfVar5) {
                eCParameterSpec = zzni.f10769a;
            } else if (zzfVar6 == zzfVar4) {
                eCParameterSpec = zzni.f10770b;
            } else {
                if (zzfVar6 != zzfVar3) {
                    throw new IllegalArgumentException("Unable to determine NIST curve params for ".concat(String.valueOf(zzfVar6)));
                }
                eCParameterSpec = zzni.f10771c;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger bigIntegerA = zznh.a(bArrC);
            if (bigIntegerA.signum() <= 0 || bigIntegerA.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!zzni.f(bigIntegerA, eCParameterSpec).equals(zzyr.d(eCParameterSpec.getCurve(), zzyt.zza, bArrB))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            if (zzfVar6 != zzfVar2) {
                throw new IllegalArgumentException("Unable to validate key pair for ".concat(String.valueOf(zzfVar6)));
            }
            if (!Arrays.equals(zzzt.a(bArrC), bArrB)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        }
        return new zzkm(zzkuVar, zzzwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10669a.f10681a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzlh a() {
        return this.f10669a.f10681a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzlj zzc() {
        return this.f10669a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg, com.google.android.gms.internal.p002firebaseauthapi.zzcp
    public final /* synthetic */ zzbt zzc() {
        return this.f10669a;
    }
}
