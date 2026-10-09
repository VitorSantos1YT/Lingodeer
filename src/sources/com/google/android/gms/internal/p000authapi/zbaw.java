package com.google.android.gms.internal.p000authapi;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbaw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SecureRandom f9402a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f9402a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
