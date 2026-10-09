package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractStreamingHasher extends AbstractHasher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f17341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17343c;

    public AbstractStreamingHasher(int i11) {
        Preconditions.g(i11 % i11 == 0);
        this.f17341a = ByteBuffer.allocate(i11 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f17342b = i11;
        this.f17343c = i11;
    }

    @Override // com.google.common.hash.Hasher
    public final Hasher b(byte b3) {
        this.f17341a.put(b3);
        g();
        return this;
    }

    @Override // com.google.common.hash.Hasher
    public final HashCode c() {
        f();
        ByteBuffer byteBuffer = this.f17341a;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            i(byteBuffer);
            byteBuffer.position(byteBuffer.limit());
        }
        return e();
    }

    @Override // com.google.common.hash.AbstractHasher
    public final Hasher d(byte[] bArr, int i11) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, i11).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.f17341a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            g();
            return this;
        }
        int iPosition = this.f17342b - byteBuffer.position();
        for (int i12 = 0; i12 < iPosition; i12++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        f();
        while (byteBufferOrder.remaining() >= this.f17343c) {
            h(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }

    public abstract HashCode e();

    public final void f() {
        ByteBuffer byteBuffer = this.f17341a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.f17343c) {
            h(byteBuffer);
        }
        byteBuffer.compact();
    }

    public final void g() {
        if (this.f17341a.remaining() < 8) {
            f();
        }
    }

    public abstract void h(ByteBuffer byteBuffer);

    public void i(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.limit());
        int i11 = this.f17343c;
        byteBuffer.limit(i11 + 7);
        while (byteBuffer.position() < i11) {
            byteBuffer.putLong(0L);
        }
        byteBuffer.limit(i11);
        byteBuffer.flip();
        h(byteBuffer);
    }
}
