package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzzb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyv<T_WRAPPER extends zzzb<JcePrimitiveT>, JcePrimitiveT> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzyv f11039b = new zzyv(new zzza());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzyv f11040c = new zzyv(new zzze());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzyv f11041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzyv f11042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzyv f11043f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzyz f11044a;

    static {
        new zzyv(new zzzg());
        new zzyv(new zzzh());
        f11041d = new zzyv(new zzzd());
        f11042e = new zzyv(new zzzf());
        f11043f = new zzyv(new zzzc());
    }

    public zzyv(zzzb zzzbVar) {
        if (zzjb.a()) {
            this.f11044a = new zzyw(zzzbVar);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f11044a = new zzyu(zzzbVar);
        } else {
            this.f11044a = new zzyx(zzzbVar);
        }
    }
}
