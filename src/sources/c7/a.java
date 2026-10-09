package c7;

import b7.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6641a;

    public a(String filePath, int i11) {
        switch (i11) {
            case 2:
                kotlin.jvm.internal.m.f(filePath, "filePath");
                this.f6641a = filePath;
                break;
            default:
                this.f6641a = filePath;
                break;
        }
    }

    public static a a(w wVar) {
        String str;
        wVar.J(2);
        int iW = wVar.w();
        int i11 = iW >> 1;
        int iW2 = ((wVar.w() >> 3) & 31) | ((iW & 1) << 5);
        if (i11 == 4 || i11 == 5 || i11 == 7 || i11 == 8) {
            str = "dvhe";
        } else if (i11 == 9) {
            str = "dvav";
        } else {
            if (i11 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbN = ep.a.n(str);
        sbN.append(i11 < 10 ? ".0" : ".");
        sbN.append(i11);
        return new a(defpackage.e.g(iW2, iW2 < 10 ? ".0" : ".", sbN), 0);
    }

    public void b() throws IOException {
        String str = this.f6641a;
        kotlin.jvm.internal.m.c(str);
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
}
