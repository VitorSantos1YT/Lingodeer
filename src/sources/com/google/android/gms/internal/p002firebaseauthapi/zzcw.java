package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzcw f10287a = new zzcw();

    private zzcw() {
    }

    public static void a(zzcw zzcwVar) throws GeneralSecurityException {
        if (zzcwVar == null) {
            throw new GeneralSecurityException("SecretKeyAccess is required");
        }
    }
}
