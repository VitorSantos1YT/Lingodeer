package m00;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import mw.m3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40716b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f40715a = i11;
        this.f40716b = obj;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f40715a) {
            case 0:
            case 2:
                break;
            case 1:
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        switch (this.f40715a) {
            case 0:
                break;
            case 1:
            default:
                super.flush();
                break;
            case 2:
                ((FileOutputStream) this.f40716b).flush();
                break;
        }
    }

    public String toString() {
        switch (this.f40715a) {
            case 0:
                return ((i) this.f40716b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i11) throws IOException {
        int i12 = this.f40715a;
        Object obj = this.f40716b;
        switch (i12) {
            case 0:
                ((i) obj).J(i11);
                break;
            case 1:
                write(new byte[]{(byte) i11}, 0, 1);
                break;
            default:
                ((FileOutputStream) obj).write(i11);
                break;
        }
    }

    public h(FileOutputStream fileOutputStream) {
        this.f40715a = 2;
        this.f40716b = fileOutputStream;
    }

    @Override // java.io.OutputStream
    public void write(byte[] b3) throws IOException {
        switch (this.f40715a) {
            case 2:
                kotlin.jvm.internal.m.f(b3, "b");
                ((FileOutputStream) this.f40716b).write(b3);
                break;
            default:
                super.write(b3);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i11, int i12) throws IOException {
        switch (this.f40715a) {
            case 0:
                kotlin.jvm.internal.m.f(data, "data");
                ((i) this.f40716b).m229write(data, i11, i12);
                break;
            case 1:
                ((m3) this.f40716b).g(data, i11, i12);
                break;
            default:
                kotlin.jvm.internal.m.f(data, "bytes");
                ((FileOutputStream) this.f40716b).write(data, i11, i12);
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
