package s20;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public enum a {
    SINGLE;

    private static final String GIF = ".gif";
    private static final String JPEG = ".jpeg";
    private static final String JPG = ".jpg";
    private static final String PNG = ".png";
    private static final String TAG = "Luban";
    private static final String WEBP = ".webp";
    private static List<String> format;
    private final byte[] JPEG_SIGNATURE = {-1, -40, -1};

    static {
        ArrayList arrayList = new ArrayList();
        format = arrayList;
        arrayList.add(JPG);
        format.add(JPEG);
        format.add(PNG);
        format.add(WEBP);
        format.add(GIF);
    }

    public static int b(byte[] bArr, int i11, int i12, boolean z11) {
        int i13;
        if (z11) {
            i11 += i12 - 1;
            i13 = -1;
        } else {
            i13 = 1;
        }
        int i14 = 0;
        while (true) {
            int i15 = i12 - 1;
            if (i12 <= 0) {
                return i14;
            }
            i14 = (bArr[i11] & 255) | (i14 << 8);
            i11 += i13;
            i12 = i15;
        }
    }

    public static byte[] c(InputStream inputStream) {
        if (inputStream == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                try {
                    int i11 = inputStream.read(bArr, 0, 4096);
                    if (i11 != -1) {
                        byteArrayOutputStream.write(bArr, 0, i11);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th2;
                }
            } catch (Exception unused3) {
                byte[] bArr2 = new byte[0];
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused4) {
                }
                return bArr2;
            }
        }
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public final boolean a(InputStream inputStream) {
        byte[] bArrC = c(inputStream);
        if (bArrC == null || bArrC.length < 3) {
            return false;
        }
        return Arrays.equals(this.JPEG_SIGNATURE, new byte[]{bArrC[0], bArrC[1], bArrC[2]});
    }
}
