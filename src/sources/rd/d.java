package rd;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import qd.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileInputStream f49103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f49104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f49105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49107e;

    public d(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(e.f49108a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f49103a = fileInputStream;
        this.f49104b = charset;
        this.f49105c = new byte[OSSConstants.DEFAULT_BUFFER_SIZE];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String a() {
        int i11;
        synchronized (this.f49103a) {
            try {
                byte[] bArr = this.f49105c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f49106d >= this.f49107e) {
                    int i12 = this.f49103a.read(bArr, 0, bArr.length);
                    if (i12 == -1) {
                        throw new EOFException();
                    }
                    this.f49106d = 0;
                    this.f49107e = i12;
                }
                for (int i13 = this.f49106d; i13 != this.f49107e; i13++) {
                    byte[] bArr2 = this.f49105c;
                    if (bArr2[i13] == 10) {
                        int i14 = this.f49106d;
                        if (i13 != i14) {
                            i11 = i13 - 1;
                            if (bArr2[i11] != 13) {
                                i11 = i13;
                            }
                        } else {
                            i11 = i13;
                        }
                        String str = new String(bArr2, i14, i11 - i14, this.f49104b.name());
                        this.f49106d = i13 + 1;
                        return str;
                    }
                }
                f fVar = new f(this, (this.f49107e - this.f49106d) + 80);
                while (true) {
                    byte[] bArr3 = this.f49105c;
                    int i15 = this.f49106d;
                    fVar.write(bArr3, i15, this.f49107e - i15);
                    this.f49107e = -1;
                    FileInputStream fileInputStream = this.f49103a;
                    byte[] bArr4 = this.f49105c;
                    int i16 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i16 == -1) {
                        throw new EOFException();
                    }
                    this.f49106d = 0;
                    this.f49107e = i16;
                    for (int i17 = 0; i17 != this.f49107e; i17++) {
                        byte[] bArr5 = this.f49105c;
                        if (bArr5[i17] == 10) {
                            int i18 = this.f49106d;
                            if (i17 != i18) {
                                fVar.write(bArr5, i18, i17 - i18);
                            }
                            this.f49106d = i17 + 1;
                            return fVar.toString();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f49103a) {
            try {
                if (this.f49105c != null) {
                    this.f49105c = null;
                    this.f49103a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
