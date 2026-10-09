package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpn f10306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzny f10307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzdn f10308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzdm f10309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzjb.zza f10310e;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.firebase-auth-api.zzdn] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.firebase-auth-api.zzdm] */
    static {
        new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdk
        };
        f10306a = new zzpm(zzdh.class, zzbm.class);
        zzwj.zza zzaVar = zzwj.zza.SYMMETRIC;
        zzsr.D();
        f10307b = new zzny("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzaVar);
        f10308c = new zzoo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdn
        };
        f10309d = new zzno() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzno
            public final zzbt a(zzcq zzcqVar, Integer num) throws GeneralSecurityException {
                zzdo zzdoVar = (zzdo) zzcqVar;
                zzpn zzpnVar = zzdl.f10306a;
                int i11 = zzdoVar.f10311a;
                if (i11 != 16 && i11 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                zzdh.zza zzaVar2 = new zzdh.zza(0);
                zzaVar2.f10302a = zzdoVar;
                zzaVar2.f10305d = num;
                zzaVar2.f10303b = zzzw.a(i11);
                zzaVar2.f10304c = zzzw.a(zzdoVar.f10312b);
                return zzaVar2.a();
            }
        };
        f10310e = zzjb.zza.zzb;
    }
}
