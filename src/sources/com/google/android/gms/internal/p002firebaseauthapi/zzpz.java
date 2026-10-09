package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzpz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f10851a = new zzpy();

    public static byte[] a(int i11) {
        byte[] bArr = new byte[i11];
        ((SecureRandom) f10851a.get()).nextBytes(bArr);
        return bArr;
    }
}
