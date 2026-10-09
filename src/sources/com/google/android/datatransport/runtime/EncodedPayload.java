package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class EncodedPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Encoding f8018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8019b;

    public EncodedPayload(Encoding encoding, byte[] bArr) {
        if (encoding == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f8018a = encoding;
        this.f8019b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (this.f8018a.equals(encodedPayload.f8018a)) {
            return Arrays.equals(this.f8019b, encodedPayload.f8019b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8018a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8019b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f8018a + ", bytes=[...]}";
    }
}
