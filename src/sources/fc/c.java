package fc;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import okhttp3.Headers;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static Headers a(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strD = headers.d(i11);
            String strG = headers.g(i11);
            if ((!"Warning".equalsIgnoreCase(strD) || !x.s0(strG, "1", false)) && (HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(strD) || HttpHeaders.CONTENT_ENCODING.equalsIgnoreCase(strD) || HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strD) || !b(strD) || headers2.b(strD) == null)) {
                builder.c(strD, strG);
            }
        }
        int size2 = headers2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            String strD2 = headers2.d(i12);
            if (!HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(strD2) && !HttpHeaders.CONTENT_ENCODING.equalsIgnoreCase(strD2) && !HttpHeaders.CONTENT_TYPE.equalsIgnoreCase(strD2) && b(strD2)) {
                builder.c(strD2, headers2.g(i12));
            }
        }
        return builder.d();
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
