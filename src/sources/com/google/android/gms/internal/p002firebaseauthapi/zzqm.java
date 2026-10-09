package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzql f10871a = new zzno() { // from class: com.google.android.gms.internal.firebase-auth-api.zzql
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzno
        public final zzbt a(zzcq zzcqVar, Integer num) throws GeneralSecurityException {
            zzqp zzqpVar = (zzqp) zzcqVar;
            zzql zzqlVar = zzqm.f10871a;
            int i11 = zzqpVar.f10875a;
            if (i11 != 32) {
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            }
            zzqi.zza zzaVar = new zzqi.zza(0);
            zzaVar.f10867a = zzqpVar;
            zzaVar.f10868b = zzzw.a(i11);
            zzaVar.f10869c = num;
            return zzaVar.a();
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzpn f10872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzpn f10873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzny f10874d;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.firebase-auth-api.zzql] */
    static {
        new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqo
        };
        f10872b = new zzpm(zzqi.class, zzqs.class);
        new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqn
        };
        f10873c = new zzpm(zzqi.class, zzcn.class);
        zzwj.zza zzaVar = zzwj.zza.SYMMETRIC;
        zzsi.D();
        f10874d = new zzny("type.googleapis.com/google.crypto.tink.AesCmacKey", zzaVar);
    }
}
