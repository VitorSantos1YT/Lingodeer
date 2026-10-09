package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpn f10340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzny f10341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzdv f10342c;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.firebase-auth-api.zzdv] */
    static {
        new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzds
        };
        f10340a = new zzpm(zzdp.class, zzbm.class);
        zzwj.zza zzaVar = zzwj.zza.SYMMETRIC;
        zztg.D();
        f10341b = new zzny("type.googleapis.com/google.crypto.tink.AesEaxKey", zzaVar);
        f10342c = new zzno() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdv
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzno
            public final zzbt a(zzcq zzcqVar, Integer num) throws GeneralSecurityException {
                zzdu zzduVar = (zzdu) zzcqVar;
                zzpn zzpnVar = zzdt.f10340a;
                int i11 = zzduVar.f10343a;
                if (i11 == 24) {
                    throw new GeneralSecurityException("192 bit AES EAX Parameters are not valid");
                }
                zzdp.zza zzaVar2 = new zzdp.zza(0);
                zzaVar2.f10337a = zzduVar;
                zzaVar2.f10339c = num;
                zzaVar2.f10338b = zzzw.a(i11);
                return zzaVar2.a();
            }
        };
    }
}
