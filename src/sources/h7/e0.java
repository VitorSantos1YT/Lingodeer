package h7;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import b7.f0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends z6.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f31854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f31855l;
    public byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f31856n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f31857o;

    @Override // z6.g, z6.f
    public final boolean a() {
        return super.a() && this.f31856n == 0;
    }

    @Override // z6.g, z6.f
    public final ByteBuffer b() {
        int i11;
        if (super.a() && (i11 = this.f31856n) > 0) {
            j(i11).put(this.m, 0, this.f31856n).flip();
            this.f31856n = 0;
        }
        return super.b();
    }

    @Override // z6.f
    public final void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        if (i11 == 0) {
            return;
        }
        int iMin = Math.min(i11, this.f31855l);
        this.f31857o += (long) (iMin / this.f58944b.f58942d);
        this.f31855l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f31855l > 0) {
            return;
        }
        int i12 = i11 - iMin;
        int length = (this.f31856n + i12) - this.m.length;
        ByteBuffer byteBufferJ = j(length);
        int iG = f0.g(length, 0, this.f31856n);
        byteBufferJ.put(this.m, 0, iG);
        int iG2 = f0.g(length - iG, 0, i12);
        byteBuffer.limit(byteBuffer.position() + iG2);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i13 = i12 - iG2;
        int i14 = this.f31856n - iG;
        this.f31856n = i14;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iG, bArr, 0, i14);
        byteBuffer.get(this.m, this.f31856n, i13);
        this.f31856n += i13;
        byteBufferJ.flip();
    }

    @Override // z6.g
    public final z6.e f(z6.e eVar) throws AudioProcessor$UnhandledAudioFormatException {
        if (!f0.H(eVar.f58941c)) {
            throw new AudioProcessor$UnhandledAudioFormatException(eVar);
        }
        this.f31854k = true;
        return (this.f31852i == 0 && this.f31853j == 0) ? z6.e.f58938e : eVar;
    }

    @Override // z6.g
    public final void g() {
        if (this.f31854k) {
            this.f31854k = false;
            int i11 = this.f31853j;
            int i12 = this.f58944b.f58942d;
            this.m = new byte[i11 * i12];
            this.f31855l = this.f31852i * i12;
        }
        this.f31856n = 0;
    }

    @Override // z6.g
    public final void h() {
        if (this.f31854k) {
            int i11 = this.f31856n;
            if (i11 > 0) {
                this.f31857o += (long) (i11 / this.f58944b.f58942d);
            }
            this.f31856n = 0;
        }
    }

    @Override // z6.g
    public final void i() {
        this.m = f0.f3976b;
    }
}
