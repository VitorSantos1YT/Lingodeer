package com.google.android.gms.internal.p002firebaseauthapi;

import ep.a;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzzv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f11062a;

    public zzzv(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f11062a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public static zzzv a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new zzzv(bArr, length);
    }

    public final byte[] b() {
        byte[] bArr = this.f11062a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzzv) {
            return Arrays.equals(((zzzv) obj).f11062a, this.f11062a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11062a);
    }

    public final String toString() {
        return a.g("Bytes(", zzzj.a(this.f11062a), ")");
    }
}
