package m7;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends e7.d {
    public long L;
    public int M;
    public int N;

    @Override // e7.d
    public final void n() {
        super.n();
        this.M = 0;
    }

    public final boolean t(e7.d dVar) {
        ByteBuffer byteBuffer;
        b7.a.d(!dVar.e(1073741824));
        b7.a.d(!dVar.e(268435456));
        b7.a.d(!dVar.e(4));
        if (u()) {
            if (this.M >= this.N) {
                return false;
            }
            ByteBuffer byteBuffer2 = dVar.f25115e;
            if (byteBuffer2 != null && (byteBuffer = this.f25115e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i11 = this.M;
        this.M = i11 + 1;
        if (i11 == 0) {
            this.f25117t = dVar.f25117t;
            if (dVar.e(1)) {
                this.f6652b = 1;
            }
        }
        ByteBuffer byteBuffer3 = dVar.f25115e;
        if (byteBuffer3 != null) {
            q(byteBuffer3.remaining());
            this.f25115e.put(byteBuffer3);
        }
        this.L = dVar.f25117t;
        return true;
    }

    public final boolean u() {
        return this.M > 0;
    }
}
