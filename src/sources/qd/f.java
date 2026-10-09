package qd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47720a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f47721b;

    public f(a aVar, int i11) {
        this.f47721b = aVar;
        ((ByteArrayOutputStream) this).buf = aVar.a(Math.max(i11, 256));
    }

    public void a(int i11) {
        a aVar = (a) this.f47721b;
        int i12 = ((ByteArrayOutputStream) this).count;
        if (i12 + i11 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] bArrA = aVar.a((i12 + i11) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
        aVar.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrA;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f47720a) {
            case 0:
                ((a) this.f47721b).b(((ByteArrayOutputStream) this).buf);
                ((ByteArrayOutputStream) this).buf = null;
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    public void finalize() throws Throwable {
        switch (this.f47720a) {
            case 0:
                ((a) this.f47721b).b(((ByteArrayOutputStream) this).buf);
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // java.io.ByteArrayOutputStream
    public String toString() {
        switch (this.f47720a) {
            case 1:
                int i11 = ((ByteArrayOutputStream) this).count;
                if (i11 > 0 && ((ByteArrayOutputStream) this).buf[i11 - 1] == 13) {
                    i11--;
                }
                try {
                    return new String(((ByteArrayOutputStream) this).buf, 0, i11, ((rd.d) this.f47721b).f49104b.name());
                } catch (UnsupportedEncodingException e8) {
                    throw new AssertionError(e8);
                }
            default:
                return super.toString();
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i11, int i12) {
        switch (this.f47720a) {
            case 0:
                synchronized (this) {
                    a(i12);
                    super.write(bArr, i11, i12);
                }
                return;
            default:
                super.write(bArr, i11, i12);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(rd.d dVar, int i11) {
        super(i11);
        this.f47721b = dVar;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i11) {
        switch (this.f47720a) {
            case 0:
                synchronized (this) {
                    a(1);
                    super.write(i11);
                }
                return;
            default:
                super.write(i11);
                return;
        }
    }
}
