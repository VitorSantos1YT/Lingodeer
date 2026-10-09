package com.google.firebase.crashlytics.internal.metadata;

import a.ar.MFeWs;
import hh.p0;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class QueueFile implements Closeable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Logger f18406t = Logger.getLogger(QueueFile.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f18407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Element f18410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Element f18411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f18412f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Element {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Element f18415c = new Element(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18417b;

        public Element(int i11, int i12) {
            this.f18416a = i11;
            this.f18417b = i12;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append("[position = ");
            sb2.append(this.f18416a);
            sb2.append(", length = ");
            return p0.i(this.f18417b, "]", sb2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ElementReader {
        void a(InputStream inputStream, int i11);
    }

    public static int f(byte[] bArr, int i11) {
        return ((bArr[i11] & 255) << 24) + ((bArr[i11 + 1] & 255) << 16) + ((bArr[i11 + 2] & 255) << 8) + (bArr[i11 + 3] & 255);
    }

    public static void y(byte[] bArr, int i11, int i12) {
        bArr[i11] = (byte) (i12 >> 24);
        bArr[i11 + 1] = (byte) (i12 >> 16);
        bArr[i11 + 2] = (byte) (i12 >> 8);
        bArr[i11 + 3] = (byte) i12;
    }

    public final void a(byte[] bArr) {
        int iV;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    b(length);
                    boolean zD = d();
                    if (zD) {
                        iV = 16;
                    } else {
                        Element element = this.f18411e;
                        iV = v(element.f18416a + 4 + element.f18417b);
                    }
                    Element element2 = new Element(iV, length);
                    y(this.f18412f, 0, length);
                    p(this.f18412f, iV, 4);
                    p(bArr, iV + 4, length);
                    x(this.f18408b, this.f18409c + 1, zD ? iV : this.f18410d.f18416a, iV);
                    this.f18411e = element2;
                    this.f18409c++;
                    if (zD) {
                        this.f18410d = element2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void b(int i11) throws IOException {
        int i12 = i11 + 4;
        int iQ = this.f18408b - q();
        if (iQ >= i12) {
            return;
        }
        int i13 = this.f18408b;
        do {
            iQ += i13;
            i13 <<= 1;
        } while (iQ < i12);
        RandomAccessFile randomAccessFile = this.f18407a;
        randomAccessFile.setLength(i13);
        randomAccessFile.getChannel().force(true);
        Element element = this.f18411e;
        int iV = v(element.f18416a + 4 + element.f18417b);
        if (iV < this.f18410d.f18416a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f18408b);
            long j11 = iV - 4;
            if (channel.transferTo(16L, j11, channel) != j11) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i14 = this.f18411e.f18416a;
        int i15 = this.f18410d.f18416a;
        if (i14 < i15) {
            int i16 = (this.f18408b + i14) - 16;
            x(i13, this.f18409c, i15, i16);
            this.f18411e = new Element(i16, this.f18411e.f18417b);
        } else {
            x(i13, this.f18409c, i15, i14);
        }
        this.f18408b = i13;
    }

    public final synchronized void c(ElementReader elementReader) {
        int iV = this.f18410d.f18416a;
        for (int i11 = 0; i11 < this.f18409c; i11++) {
            Element elementE = e(iV);
            elementReader.a(new ElementInputStream(elementE), elementE.f18417b);
            iV = v(elementE.f18416a + 4 + elementE.f18417b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f18407a.close();
    }

    public final synchronized boolean d() {
        return this.f18409c == 0;
    }

    public final Element e(int i11) throws IOException {
        if (i11 == 0) {
            return Element.f18415c;
        }
        RandomAccessFile randomAccessFile = this.f18407a;
        randomAccessFile.seek(i11);
        return new Element(i11, randomAccessFile.readInt());
    }

    public final synchronized void h() {
        if (d()) {
            throw new NoSuchElementException();
        }
        if (this.f18409c == 1) {
            synchronized (this) {
                x(4096, 0, 0, 0);
                this.f18409c = 0;
                Element element = Element.f18415c;
                this.f18410d = element;
                this.f18411e = element;
                if (this.f18408b > 4096) {
                    RandomAccessFile randomAccessFile = this.f18407a;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f18408b = 4096;
            }
        } else {
            Element element2 = this.f18410d;
            int iV = v(element2.f18416a + 4 + element2.f18417b);
            i(iV, this.f18412f, 0, 4);
            int iF = f(this.f18412f, 0);
            x(this.f18408b, this.f18409c - 1, iV, this.f18411e.f18416a);
            this.f18409c--;
            this.f18410d = new Element(iV, iF);
        }
    }

    public final void i(int i11, byte[] bArr, int i12, int i13) throws IOException {
        int iV = v(i11);
        int i14 = iV + i13;
        int i15 = this.f18408b;
        RandomAccessFile randomAccessFile = this.f18407a;
        if (i14 <= i15) {
            randomAccessFile.seek(iV);
            randomAccessFile.readFully(bArr, i12, i13);
            return;
        }
        int i16 = i15 - iV;
        randomAccessFile.seek(iV);
        randomAccessFile.readFully(bArr, i12, i16);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i12 + i16, i13 - i16);
    }

    public final void p(byte[] bArr, int i11, int i12) throws IOException {
        int iV = v(i11);
        int i13 = iV + i12;
        int i14 = this.f18408b;
        RandomAccessFile randomAccessFile = this.f18407a;
        if (i13 <= i14) {
            randomAccessFile.seek(iV);
            randomAccessFile.write(bArr, 0, i12);
            return;
        }
        int i15 = i14 - iV;
        randomAccessFile.seek(iV);
        randomAccessFile.write(bArr, 0, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i15, i12 - i15);
    }

    public final int q() {
        if (this.f18409c == 0) {
            return 16;
        }
        Element element = this.f18411e;
        int i11 = element.f18416a;
        int i12 = this.f18410d.f18416a;
        return i11 >= i12 ? (i11 - i12) + 4 + element.f18417b + 16 : (((i11 + 4) + element.f18417b) + this.f18408b) - i12;
    }

    public final String toString() {
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f18408b);
        sb2.append(", size=");
        sb2.append(this.f18409c);
        sb2.append(", first=");
        sb2.append(this.f18410d);
        sb2.append(", last=");
        sb2.append(this.f18411e);
        sb2.append(", element lengths=[");
        try {
            c(new ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFile.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public boolean f18413a = true;

                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public final void a(InputStream inputStream, int i11) {
                    boolean z11 = this.f18413a;
                    StringBuilder sb3 = sb2;
                    if (z11) {
                        this.f18413a = false;
                    } else {
                        sb3.append(", ");
                    }
                    sb3.append(i11);
                }
            });
        } catch (IOException e8) {
            f18406t.log(Level.WARNING, "read error", (Throwable) e8);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final int v(int i11) {
        int i12 = this.f18408b;
        return i11 < i12 ? i11 : (i11 + 16) - i12;
    }

    public final void x(int i11, int i12, int i13, int i14) throws IOException {
        int[] iArr = {i11, i12, i13, i14};
        int i15 = 0;
        int i16 = 0;
        while (true) {
            byte[] bArr = this.f18412f;
            if (i15 >= 4) {
                RandomAccessFile randomAccessFile = this.f18407a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                y(bArr, i16, iArr[i15]);
                i16 += 4;
                i15++;
            }
        }
    }

    public QueueFile(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f18412f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + MFeWs.MiBxOlHRrlAcO);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i11 = 0;
                for (int i12 = 0; i12 < 4; i12++) {
                    y(bArr2, i11, iArr[i12]);
                    i11 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f18407a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iF = f(bArr, 0);
        this.f18408b = iF;
        if (iF <= randomAccessFile2.length()) {
            this.f18409c = f(bArr, 4);
            int iF2 = f(bArr, 8);
            int iF3 = f(bArr, 12);
            this.f18410d = e(iF2);
            this.f18411e = e(iF3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f18408b + ", Actual length: " + randomAccessFile2.length());
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ElementInputStream extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18419b;

        public ElementInputStream(Element element) {
            int i11 = element.f18416a + 4;
            Logger logger = QueueFile.f18406t;
            this.f18418a = QueueFile.this.v(i11);
            this.f18419b = element.f18417b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i11, int i12) throws IOException {
            Logger logger = QueueFile.f18406t;
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i11 | i12) < 0 || i12 > bArr.length - i11) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i13 = this.f18419b;
            if (i13 <= 0) {
                return -1;
            }
            if (i12 > i13) {
                i12 = i13;
            }
            int i14 = this.f18418a;
            QueueFile queueFile = QueueFile.this;
            queueFile.i(i14, bArr, i11, i12);
            this.f18418a = queueFile.v(this.f18418a + i12);
            this.f18419b -= i12;
            return i12;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.f18419b == 0) {
                return -1;
            }
            QueueFile queueFile = QueueFile.this;
            queueFile.f18407a.seek(this.f18418a);
            int i11 = queueFile.f18407a.read();
            this.f18418a = queueFile.v(this.f18418a + 1);
            this.f18419b--;
            return i11;
        }
    }
}
