package okhttp3.internal;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import e00.i;
import fr.p3;
import java.io.Closeable;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.m;
import m00.b;
import m00.k;
import m00.l;
import m00.z;
import oz.q;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class _UtilCommonKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f45202a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f45203b;

    static {
        l lVar = l.f40723d;
        f45203b = b.f(p3.j("efbbbf"), p3.j("feff"), p3.j("fffe0000"), p3.j("fffe"), p3.j("0000feff"));
    }

    public static final void a(long j11, long j12, long j13) {
        if ((j12 | j13) < 0 || j12 > j11 || j11 - j12 < j13) {
            StringBuilder sbJ = c.j(j11, "length=", ", offset=");
            sbJ.append(j12);
            sbJ.append(", count=");
            sbJ.append(j12);
            throw new ArrayIndexOutOfBoundsException(sbJ.toString());
        }
    }

    public static final void b(Closeable closeable) {
        m.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e8) {
            throw e8;
        } catch (Exception unused) {
        }
    }

    public static final int c(String str, char c11, int i11, int i12) {
        m.f(str, "<this>");
        while (i11 < i12) {
            if (str.charAt(i11) == c11) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static final boolean e(String[] strArr, String[] strArr2, Comparator comparator) {
        m.f(strArr, "<this>");
        m.f(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                i iVarA = kotlin.jvm.internal.l.a(strArr2);
                while (iVarA.hasNext()) {
                    if (comparator.compare(str, (String) iVarA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int f(String str) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (m.h(cCharAt, 31) <= 0 || m.h(cCharAt, 127) >= 0) {
                return i11;
            }
        }
        return -1;
    }

    public static final int g(int i11, int i12, String str) {
        m.f(str, "<this>");
        while (i11 < i12) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static final int h(int i11, int i12, String str) {
        m.f(str, "<this>");
        int i13 = i12 - 1;
        if (i11 <= i13) {
            while (true) {
                char cCharAt = str.charAt(i13);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i13 + 1;
                }
                if (i13 == i11) {
                    break;
                }
                i13--;
            }
        }
        return i11;
    }

    public static final String[] i(String[] strArr, String[] other, Comparator comparator) {
        m.f(strArr, "<this>");
        m.f(other, "other");
        m.f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean j(String name) {
        m.f(name, "name");
        return name.equalsIgnoreCase(HttpHeaders.AUTHORIZATION) || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int k(char c11) {
        if ('0' <= c11 && c11 < ':') {
            return c11 - '0';
        }
        if ('a' <= c11 && c11 < 'g') {
            return c11 - 'W';
        }
        if ('A' > c11 || c11 >= 'G') {
            return -1;
        }
        return c11 - '7';
    }

    public static final int l(k kVar) {
        m.f(kVar, "<this>");
        return (kVar.readByte() & 255) | ((kVar.readByte() & 255) << 16) | ((kVar.readByte() & 255) << 8);
    }

    public static final int m(m00.i iVar) throws EOFException {
        int i11 = 0;
        while (!iVar.R() && iVar.h(0L) == 61) {
            i11++;
            iVar.readByte();
        }
        return i11;
    }

    public static final int n(int i11, String str) {
        if (str == null) {
            return i11;
        }
        try {
            long j11 = Long.parseLong(str);
            if (j11 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j11 < 0) {
                return 0;
            }
            return (int) j11;
        } catch (NumberFormatException unused) {
            return i11;
        }
    }

    public static final String o(int i11, int i12, String str) {
        int iG = g(i11, i12, str);
        String strSubstring = str.substring(iG, h(iG, i12, str));
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int d(String str, int i11, int i12, String str2) {
        m.f(str, ualZoVVCQs.gMwpCAjtgSCa);
        while (i11 < i12) {
            if (q.w0(str2, str.charAt(i11))) {
                return i11;
            }
            i11++;
        }
        return i12;
    }
}
