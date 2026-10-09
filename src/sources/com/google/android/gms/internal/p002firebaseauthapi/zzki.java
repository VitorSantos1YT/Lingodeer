package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzki extends zzlg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzkl f10637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzu f10638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzzw f10639c;

    public zzki(zzkl zzklVar, zzzu zzzuVar, zzzw zzzwVar) {
        this.f10637a = zzklVar;
        this.f10638b = zzzuVar;
        this.f10639c = zzzwVar;
    }

    public static zzki e(zzkl zzklVar, zzzu zzzuVar) throws GeneralSecurityException {
        ECPoint eCPoint = zzklVar.f10665b;
        if (eCPoint == null) {
            throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        }
        if (zzcw.f10287a == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        BigInteger bigInteger = zzzuVar.f11061a;
        zzkf.zzc zzcVar = zzklVar.f10664a.f10606a;
        BigInteger order = g(zzcVar).getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (zzni.f(bigInteger, g(zzcVar)).equals(eCPoint)) {
            return new zzki(zzklVar, zzzuVar, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public static zzki f(zzkl zzklVar, zzzw zzzwVar) throws GeneralSecurityException {
        zzzv zzzvVar = zzklVar.f10666c;
        if (zzzvVar == null) {
            throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        }
        byte[] bArrC = zzzwVar.c(zzcw.f10287a);
        byte[] bArrB = zzzvVar.b();
        if (bArrC.length != 32) {
            throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
        }
        if (Arrays.equals(zzzt.a(bArrC), bArrB)) {
            return new zzki(zzklVar, null, zzzwVar);
        }
        throw new GeneralSecurityException("Invalid private key for public key.");
    }

    public static ECParameterSpec g(zzkf.zzc zzcVar) {
        if (zzcVar == zzkf.zzc.f10624b) {
            return zzni.f10769a;
        }
        if (zzcVar == zzkf.zzc.f10625c) {
            return zzni.f10770b;
        }
        if (zzcVar == zzkf.zzc.f10626d) {
            return zzni.f10771c;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zzcVar)));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10637a.f10664a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzlh a() {
        return this.f10637a.f10664a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzlj zzc() {
        return this.f10637a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg, com.google.android.gms.internal.p002firebaseauthapi.zzcp
    public final /* synthetic */ zzbt zzc() {
        return this.f10637a;
    }
}
