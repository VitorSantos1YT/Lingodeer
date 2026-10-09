package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkl extends zzlj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzkf f10664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ECPoint f10665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzzv f10666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzzv f10667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f10668e;

    public zzkl(zzkf zzkfVar, ECPoint eCPoint, zzzv zzzvVar, zzzv zzzvVar2, Integer num) {
        this.f10664a = zzkfVar;
        this.f10665b = eCPoint;
        this.f10666c = zzzvVar;
        this.f10667d = zzzvVar2;
        this.f10668e = num;
    }

    public static zzkl e(zzkf zzkfVar, zzzv zzzvVar, Integer num) throws GeneralSecurityException {
        zzkf.zzc zzcVar = zzkfVar.f10606a;
        zzkf.zzd zzdVar = zzkfVar.f10609d;
        if (!zzcVar.equals(zzkf.zzc.f10627e)) {
            throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        h(zzdVar, num);
        if (zzzvVar.f11062a.length == 32) {
            return new zzkl(zzkfVar, null, zzzvVar, g(zzdVar, num), num);
        }
        throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    public static zzkl f(zzkf zzkfVar, ECPoint eCPoint, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        zzkf.zzc zzcVar = zzkfVar.f10606a;
        zzkf.zzd zzdVar = zzkfVar.f10609d;
        if (zzcVar.equals(zzkf.zzc.f10627e)) {
            throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        }
        h(zzdVar, num);
        if (zzcVar == zzkf.zzc.f10624b) {
            curve = zzni.f10769a.getCurve();
        } else if (zzcVar == zzkf.zzc.f10625c) {
            curve = zzni.f10770b.getCurve();
        } else {
            if (zzcVar != zzkf.zzc.f10626d) {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zzcVar)));
            }
            curve = zzni.f10771c.getCurve();
        }
        zzni.g(eCPoint, curve);
        return new zzkl(zzkfVar, eCPoint, null, g(zzdVar, num), num);
    }

    public static zzzv g(zzkf.zzd zzdVar, Integer num) {
        if (zzdVar == zzkf.zzd.f10631d) {
            return zzoz.f10823a;
        }
        if (num == null) {
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(zzdVar)));
        }
        if (zzdVar == zzkf.zzd.f10630c) {
            return zzoz.a(num.intValue());
        }
        if (zzdVar == zzkf.zzd.f10629b) {
            return zzoz.b(num.intValue());
        }
        throw new IllegalStateException("Unknown EciesParameters.Variant: ".concat(String.valueOf(zzdVar)));
    }

    public static void h(zzkf.zzd zzdVar, Integer num) throws GeneralSecurityException {
        zzkf.zzd zzdVar2 = zzkf.zzd.f10631d;
        if (!zzdVar.equals(zzdVar2) && num == null) {
            throw new GeneralSecurityException(a.g("'idRequirement' must be non-null for ", String.valueOf(zzdVar), " variant."));
        }
        if (zzdVar.equals(zzdVar2) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10664a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return this.f10668e;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzlh a() {
        return this.f10664a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlj
    public final zzzv d() {
        return this.f10667d;
    }
}
