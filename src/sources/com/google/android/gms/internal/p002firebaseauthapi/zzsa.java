package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzsa extends zzsb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzrz f10935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzzw f10936b;

    public zzsa(zzrz zzrzVar, zzzw zzzwVar) {
        this.f10935a = zzrzVar;
        this.f10936b = zzzwVar;
    }

    public static zzsa d(zzrz zzrzVar, zzzw zzzwVar) throws GeneralSecurityException {
        if (zzrzVar.f10934a == zzzwVar.f11063a.f11062a.length) {
            return new zzsa(zzrzVar, zzzwVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsb, com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final /* synthetic */ zzcq a() {
        return this.f10935a;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbt
    public final Integer b() {
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzsb
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzrz a() {
        return this.f10935a;
    }
}
