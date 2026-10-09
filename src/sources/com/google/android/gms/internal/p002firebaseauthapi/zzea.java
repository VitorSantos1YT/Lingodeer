package com.google.android.gms.internal.p002firebaseauthapi;

import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzpn f10362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzny f10363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzec f10364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzeb f10365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzjb.zza f10366e;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.firebase-auth-api.zzec] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.firebase-auth-api.zzeb] */
    static {
        new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdz
        };
        f10362a = new zzpm(zzdw.class, zzbm.class);
        zzwj.zza zzaVar = zzwj.zza.SYMMETRIC;
        zztp.B();
        f10363b = new zzny(bjXGJ.dOMFHe, zzaVar);
        f10364c = new zzoo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzec
        };
        f10365d = new zzno() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzno
            public final zzbt a(zzcq zzcqVar, Integer num) throws GeneralSecurityException {
                zzed zzedVar = (zzed) zzcqVar;
                zzpn zzpnVar = zzea.f10362a;
                int i11 = zzedVar.f10367a;
                if (i11 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                zzdw.zza zzaVar2 = new zzdw.zza(0);
                zzaVar2.f10359a = zzedVar;
                zzaVar2.f10361c = num;
                zzaVar2.f10360b = zzzw.a(i11);
                return zzaVar2.a();
            }
        };
        f10366e = zzjb.zza.zzb;
    }
}
