package ax;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements yw.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3257a;

    public b(String filePath, int i11) {
        switch (i11) {
            case 1:
                m.f(filePath, "filePath");
                this.f3257a = filePath;
                break;
            default:
                this.f3257a = filePath;
                break;
        }
    }

    public void a() throws IOException {
        String str = this.f3257a;
        m.c(str);
        long size = new FileInputStream(new File(str)).getChannel().size() - ((long) 44);
        long j11 = ((long) 36) + size;
        long j12 = 16000;
        long j13 = 32000;
        byte[] bArr = {82, 73, 70, 70, (byte) (j11 & 255), (byte) ((j11 >> 8) & 255), (byte) ((j11 >> 16) & 255), (byte) ((j11 >> 24) & 255), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, (byte) 1, 0, (byte) (j12 & 255), (byte) ((j12 >> 8) & 255), (byte) ((j12 >> 16) & 255), (byte) ((j12 >> 24) & 255), (byte) (j13 & 255), (byte) ((j13 >> 8) & 255), (byte) ((j13 >> 16) & 255), (byte) ((j13 >> 24) & 255), (byte) 2, 0, (byte) 16, 0, 100, 97, 116, 97, (byte) (size & 255), (byte) ((size >> 8) & 255), (byte) ((size >> 16) & 255), (byte) ((size >> 24) & 255)};
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str), "rw");
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
        randomAccessFile.close();
    }

    @Override // yw.d
    public boolean test(Object obj) {
        String str = this.f3257a;
        if (obj != str) {
            return obj != null && obj.equals(str);
        }
        return true;
    }
}
