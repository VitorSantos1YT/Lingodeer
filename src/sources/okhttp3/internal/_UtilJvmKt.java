package okhttp3.internal;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import j$.util.DesugarTimeZone;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import m00.i;
import m00.i0;
import m00.k;
import nv.p;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http2.Header;
import oz.a;
import oz.q;
import ry.l;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class _UtilJvmKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f45204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f45205b;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        m.c(timeZone);
        f45204a = timeZone;
        f45205b = q.S0(q.R0(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(HttpUrl httpUrl, HttpUrl other) {
        m.f(httpUrl, "<this>");
        m.f(other, "other");
        return m.a(httpUrl.f45048d, other.f45048d) && httpUrl.f45049e == other.f45049e && m.a(httpUrl.f45045a, other.f45045a);
    }

    public static final int b(long j11, TimeUnit unit) {
        m.f(unit, "unit");
        if (j11 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        long millis = unit.toMillis(j11);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large").toString());
        }
        if (millis != 0 || j11 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small").toString());
    }

    public static final void c(Socket socket) {
        m.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e8) {
            throw e8;
        } catch (RuntimeException e10) {
            if (!m.a(e10.getMessage(), "bio == null")) {
                throw e10;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String format, Object... objArr) {
        m.f(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(Response response) {
        String strB = response.f45163f.b(HttpHeaders.CONTENT_LENGTH);
        if (strB == null) {
            return -1L;
        }
        byte[] bArr = _UtilCommonKt.f45202a;
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(k kVar, Charset charset) {
        m.f(kVar, "<this>");
        m.f(charset, "default");
        int iQ = kVar.Q(_UtilCommonKt.f45203b);
        if (iQ == -1) {
            return charset;
        }
        if (iQ == 0) {
            return a.f46133a;
        }
        if (iQ == 1) {
            return a.f46134b;
        }
        if (iQ == 2) {
            Charset charset2 = a.f46133a;
            Charset charset3 = a.f46138f;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            m.e(charsetForName, "forName(...)");
            a.f46138f = charsetForName;
            return charsetForName;
        }
        if (iQ == 3) {
            return a.f46135c;
        }
        if (iQ != 4) {
            throw new AssertionError();
        }
        Charset charset4 = a.f46133a;
        Charset charset5 = a.f46139g;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        m.e(charsetForName2, "forName(...)");
        a.f46139g = charsetForName2;
        return charsetForName2;
    }

    public static final boolean g(i0 i0Var, int i11) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m.f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = i0Var.timeout().e() ? i0Var.timeout().c() - jNanoTime : Long.MAX_VALUE;
        i0Var.timeout().d(Math.min(jC, timeUnit.toNanos(i11)) + jNanoTime);
        try {
            i iVar = new i();
            while (i0Var.read(iVar, 8192L) != -1) {
                iVar.a();
            }
            if (jC == Long.MAX_VALUE) {
                i0Var.timeout().a();
                return true;
            }
            i0Var.timeout().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                i0Var.timeout().a();
                return false;
            }
            i0Var.timeout().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                i0Var.timeout().a();
            } else {
                i0Var.timeout().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static final Headers h(List list) {
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            builder.b(header.f45395a.v(), header.f45396b.v());
        }
        return builder.d();
    }

    public static final String i(HttpUrl httpUrl, boolean z11) {
        m.f(httpUrl, "<this>");
        int i11 = httpUrl.f45049e;
        String strQ = httpUrl.f45048d;
        if (q.v0(strQ, ":", false)) {
            strQ = p.q("[", strQ, ']');
        }
        if (!z11) {
            HttpUrl.Companion companion = HttpUrl.f45044j;
            String str = httpUrl.f45045a;
            companion.getClass();
            if (i11 == HttpUrl.Companion.b(str)) {
                return strQ;
            }
        }
        return strQ + ':' + i11;
    }

    public static final List j(List list) {
        m.f(list, "<this>");
        if (list.isEmpty()) {
            return r.f50854a;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            m.e(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        m.e(array, "toArray(...)");
        List listUnmodifiableList = Collections.unmodifiableList(l.A(array));
        m.e(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return r.f50854a;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            m.e(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(l.A((Object[]) objArr.clone()));
        m.e(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
