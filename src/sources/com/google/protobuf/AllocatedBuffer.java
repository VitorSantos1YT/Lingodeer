package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
abstract class AllocatedBuffer {

    /* JADX INFO: renamed from: com.google.protobuf.AllocatedBuffer$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends AllocatedBuffer {
    }

    /* JADX INFO: renamed from: com.google.protobuf.AllocatedBuffer$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends AllocatedBuffer {
    }

    public static AnonymousClass1 a(ByteBuffer byteBuffer) {
        Internal.a(byteBuffer, "buffer");
        return new AnonymousClass1();
    }

    public static void b(byte[] bArr, int i11, int i12) {
        if (i11 < 0 || i12 < 0 || i11 + i12 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        new AnonymousClass2();
    }
}
