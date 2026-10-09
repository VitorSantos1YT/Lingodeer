package com.google.android.gms.internal.p002firebaseauthapi;

import hh.p0;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpn f10578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzny f10579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzjm f10580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzjl f10581d;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.firebase-auth-api.zzjm] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.firebase-auth-api.zzjl] */
    static {
        new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjj
        };
        f10578a = new zzpm(zzjg.class, zzbp.class);
        zzwj.zza zzaVar = zzwj.zza.SYMMETRIC;
        zzub.B();
        f10579b = new zzny("type.googleapis.com/google.crypto.tink.AesSivKey", zzaVar);
        f10580c = new zzoo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjm
        };
        f10581d = new zzno() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjl
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzno
            public final zzbt a(zzcq zzcqVar, Integer num) throws InvalidAlgorithmParameterException {
                zzjn zzjnVar = (zzjn) zzcqVar;
                zzpn zzpnVar = zzjk.f10578a;
                int i11 = zzjnVar.f10582a;
                if (i11 != 64) {
                    throw new InvalidAlgorithmParameterException(p0.h(i11, "invalid key size: ", ". Valid keys must have 64 bytes."));
                }
                zzjg.zza zzaVar2 = new zzjg.zza(0);
                zzaVar2.f10575a = zzjnVar;
                zzaVar2.f10577c = num;
                zzaVar2.f10576b = zzzw.a(i11);
                return zzaVar2.a();
            }
        };
    }
}
