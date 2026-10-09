package mw;

import com.google.common.base.Charsets;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f42623a = Logger.getLogger(p5.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f42624b = "-bin".getBytes(Charsets.f16352a);

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i11 = length; i11 < bArr.length; i11++) {
            if (bArr[i11] != bArr2[i11 - length]) {
                return false;
            }
        }
        return true;
    }
}
