package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import java.security.Security;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f10768a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    public static Provider a() {
        for (int i11 = 0; i11 < 3; i11++) {
            Provider provider = Security.getProvider(f10768a[i11]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
