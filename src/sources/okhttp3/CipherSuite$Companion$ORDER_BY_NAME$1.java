package okhttp3;

import java.util.Comparator;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CipherSuite$Companion$ORDER_BY_NAME$1 implements Comparator<String> {
    @Override // java.util.Comparator
    public final int compare(String str, String str2) {
        String a3 = str;
        String b3 = str2;
        m.f(a3, "a");
        m.f(b3, "b");
        int iMin = Math.min(a3.length(), b3.length());
        for (int i11 = 4; i11 < iMin; i11++) {
            char cCharAt = a3.charAt(i11);
            char cCharAt2 = b3.charAt(i11);
            if (cCharAt != cCharAt2) {
                return m.h(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = a3.length();
        int length2 = b3.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
