package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzlk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f10692a = new byte[0];

    public static zzlo a(zzkf zzkfVar) throws GeneralSecurityException {
        zzcq zzcqVar = zzkfVar.f10610e;
        if (zzcqVar instanceof zzed) {
            return new zzlm((zzed) zzcqVar);
        }
        if (zzcqVar instanceof zzdo) {
            return new zzln((zzdo) zzcqVar);
        }
        if (zzcqVar instanceof zzjn) {
            return new zzlp((zzjn) zzcqVar);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(zzcqVar)));
    }
}
