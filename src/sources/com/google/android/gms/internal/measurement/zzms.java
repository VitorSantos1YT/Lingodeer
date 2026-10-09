package com.google.android.gms.internal.measurement;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzms extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzacv f11738a;

    public zzms(zzmu zzmuVar, zzacv zzacvVar) {
        this.f11738a = zzacvVar;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (this.f11738a.f(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final long skip(long j11) {
        if (j11 <= 0) {
            return 0L;
        }
        int i11 = j11 > 2147483647L ? Integer.MAX_VALUE : (int) j11;
        this.f11738a.g(i11);
        return i11;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) {
        return this.f11738a.f(bArr, i11, i12);
    }
}
