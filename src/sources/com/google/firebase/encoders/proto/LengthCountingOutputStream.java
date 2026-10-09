package com.google.firebase.encoders.proto;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class LengthCountingOutputStream extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f19647a = 0;

    @Override // java.io.OutputStream
    public final void write(int i11) {
        this.f19647a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f19647a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i11, int i12) {
        int i13;
        if (i11 >= 0 && i11 <= bArr.length && i12 >= 0 && (i13 = i11 + i12) <= bArr.length && i13 >= 0) {
            this.f19647a += (long) i12;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
