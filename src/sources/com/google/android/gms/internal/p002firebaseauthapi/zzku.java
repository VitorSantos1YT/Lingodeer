package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import ep.a;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzku extends zzlj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzkk f10681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzv f10682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzzv f10683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f10684d;

    public zzku(zzkk zzkkVar, zzzv zzzvVar, zzzv zzzvVar2, Integer num) {
        this.f10681a = zzkkVar;
        this.f10682b = zzzvVar;
        this.f10683c = zzzvVar2;
        this.f10684d = num;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10681a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10684d;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzlh a() {
        return this.f10681a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj
    public final zzzv d() {
        return this.f10683c;
    }

    public static zzku e(zzkk zzkkVar, zzzv zzzvVar, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        zzzv zzzvVarB;
        zzkk.zze zzeVar = zzkkVar.f10643d;
        zzkk.zze zzeVar2 = zzkk.zze.f10658d;
        if (!zzeVar.equals(zzeVar2) && num == null) {
            throw new GeneralSecurityException(a.g(gkbGsXmgaxRjJ.ZhqkOYS, String.valueOf(zzeVar), " variant."));
        }
        if (zzeVar.equals(zzeVar2) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        zzkk.zzf zzfVar = zzkkVar.f10640a;
        int length = zzzvVar.f11062a.length;
        String str = "Encoded public key byte length for " + String.valueOf(zzfVar) + " must be %d, not " + length;
        zzkk.zzf zzfVar2 = zzkk.zzf.f10662e;
        zzkk.zzf zzfVar3 = zzkk.zzf.f10661d;
        zzkk.zzf zzfVar4 = zzkk.zzf.f10660c;
        if (zzfVar == zzfVar4) {
            if (length != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (zzfVar == zzfVar3) {
            if (length != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (zzfVar == zzfVar2) {
            if (length != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else {
            if (zzfVar != zzkk.zzf.f10663f) {
                throw new GeneralSecurityException("Unable to validate public key length for ".concat(String.valueOf(zzfVar)));
            }
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (zzfVar == zzfVar4 || zzfVar == zzfVar3 || zzfVar == zzfVar2) {
            if (zzfVar == zzfVar4) {
                curve = zzni.f10769a.getCurve();
            } else if (zzfVar == zzfVar3) {
                curve = zzni.f10770b.getCurve();
            } else {
                if (zzfVar != zzfVar2) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zzfVar)));
                }
                curve = zzni.f10771c.getCurve();
            }
            zzni.g(zzyr.d(curve, zzyt.zza, zzzvVar.b()), curve);
        }
        if (zzeVar == zzeVar2) {
            zzzvVarB = zzoz.f10823a;
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant ".concat(String.valueOf(zzeVar)));
            }
            if (zzeVar == zzkk.zze.f10657c) {
                zzzvVarB = zzoz.a(num.intValue());
            } else {
                if (zzeVar != zzkk.zze.f10656b) {
                    throw new IllegalStateException("Unknown HpkeParameters.Variant: ".concat(String.valueOf(zzeVar)));
                }
                zzzvVarB = zzoz.b(num.intValue());
            }
        }
        return new zzku(zzkkVar, zzzvVar, zzzvVarB, num);
    }
}
