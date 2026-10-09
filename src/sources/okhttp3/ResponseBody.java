package okhttp3;

import cf.x;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import defpackage.e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.m;
import m00.i;
import m00.k;
import m00.l;
import nv.p;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(0);
    public static final ResponseBody EMPTY = Companion.c(l.f40723d, null);
    private Reader reader;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class BomAwareReader extends Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f45178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Charset f45179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InputStreamReader f45181d;

        public BomAwareReader(k source, Charset charset) {
            m.f(source, "source");
            m.f(charset, "charset");
            this.f45178a = source;
            this.f45179b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f45180c = true;
            InputStreamReader inputStreamReader = this.f45181d;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.f45178a.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cbuf, int i11, int i12) throws IOException {
            m.f(cbuf, "cbuf");
            if (this.f45180c) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f45181d;
            if (inputStreamReader == null) {
                k kVar = this.f45178a;
                inputStreamReader = new InputStreamReader(kVar.C1(), _UtilJvmKt.f(kVar, this.f45179b));
                this.f45181d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i11, i12);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.ResponseBody$Companion$asResponseBody$1] */
        public static ResponseBody$Companion$asResponseBody$1 b(final k kVar, final MediaType mediaType, final long j11) {
            m.f(kVar, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public final long contentLength() {
                    return j11;
                }

                @Override // okhttp3.ResponseBody
                public final MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                public final k source() {
                    return kVar;
                }
            };
        }

        public static ResponseBody$Companion$asResponseBody$1 c(l lVar, MediaType mediaType) {
            m.f(lVar, "<this>");
            i iVar = new i();
            iVar.I(lVar);
            return b(iVar, mediaType, lVar.e());
        }

        private Companion() {
        }

        public static ResponseBody$Companion$asResponseBody$1 a(String string, MediaType mediaType) {
            m.f(string, bjXGJ.gPUFYC);
            qy.l lVarA = Internal.a(mediaType);
            Charset charset = (Charset) lVarA.f48495a;
            MediaType mediaType2 = (MediaType) lVarA.f48496b;
            i iVar = new i();
            m.f(charset, "charset");
            int length = string.length();
            m.f(string, "string");
            m.f(charset, "charset");
            if (length < 0) {
                throw new IllegalArgumentException(p.p("endIndex < beginIndex: ", length, 0, " < ").toString());
            }
            if (length > string.length()) {
                StringBuilder sbI = c.i(length, "endIndex > string.length: ", " > ");
                sbI.append(string.length());
                throw new IllegalArgumentException(sbI.toString().toString());
            }
            if (charset.equals(oz.a.f46133a)) {
                iVar.W(0, length, string);
            } else {
                String strSubstring = string.substring(0, length);
                m.e(strSubstring, "substring(...)");
                byte[] bytes = strSubstring.getBytes(charset);
                m.e(bytes, "getBytes(...)");
                iVar.m229write(bytes, 0, bytes.length);
            }
            return b(iVar, mediaType2, iVar.f40718b);
        }
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        Companion.getClass();
        return Companion.a(str, mediaType);
    }

    public final InputStream byteStream() {
        return source().C1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final l byteString() throws IllegalAccessException, IOException, InvocationTargetException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(e.h(jContentLength, "Cannot buffer entire body for content length: "));
        }
        k kVarSource = source();
        l th2 = null;
        try {
            l lVarD0 = kVarSource.D0();
            try {
                kVarSource.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            th2 = lVarD0;
        } catch (Throwable th4) {
            th = th4;
            if (kVarSource != null) {
                try {
                    kVarSource.close();
                } catch (Throwable th5) {
                    x.b(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int iE = th2.e();
        if (jContentLength == -1 || jContentLength == iE) {
            return th2;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iE + ") disagree");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final byte[] bytes() throws IllegalAccessException, IOException, InvocationTargetException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException(e.h(jContentLength, "Cannot buffer entire body for content length: "));
        }
        k kVarSource = source();
        byte[] th2 = null;
        try {
            byte[] bArrM = kVarSource.M();
            try {
                kVarSource.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            th2 = bArrM;
        } catch (Throwable th4) {
            th = th4;
            if (kVarSource != null) {
                try {
                    kVarSource.close();
                } catch (Throwable th5) {
                    x.b(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th2.length;
        if (jContentLength == -1 || jContentLength == length) {
            return th2;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
    }

    public final Reader charStream() {
        Charset charsetA;
        Reader bomAwareReader = this.reader;
        if (bomAwareReader == null) {
            k kVarSource = source();
            MediaType mediaTypeContentType = contentType();
            if (mediaTypeContentType == null || (charsetA = MediaType.a(mediaTypeContentType)) == null) {
                charsetA = oz.a.f46133a;
            }
            bomAwareReader = new BomAwareReader(kVarSource, charsetA);
            this.reader = bomAwareReader;
        }
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        _UtilCommonKt.b(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract k source();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final String string() throws IllegalAccessException, InvocationTargetException {
        Charset charsetA;
        k kVarSource = source();
        String th2 = null;
        try {
            MediaType mediaTypeContentType = contentType();
            if (mediaTypeContentType == null || (charsetA = MediaType.a(mediaTypeContentType)) == null) {
                charsetA = oz.a.f46133a;
            }
            String strS0 = kVarSource.s0(_UtilJvmKt.f(kVarSource, charsetA));
            try {
                kVarSource.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            th = th2;
            th2 = strS0;
        } catch (Throwable th4) {
            th = th4;
            if (kVarSource != null) {
                try {
                    kVarSource.close();
                } catch (Throwable th5) {
                    x.b(th, th5);
                }
            }
        }
        if (th == 0) {
            return th2;
        }
        throw th;
    }

    public static final ResponseBody create(k kVar, MediaType mediaType, long j11) {
        Companion.getClass();
        return Companion.b(kVar, mediaType, j11);
    }

    public static final ResponseBody create(l lVar, MediaType mediaType) {
        Companion.getClass();
        return Companion.c(lVar, mediaType);
    }

    @qy.c
    public static final ResponseBody create(MediaType mediaType, long j11, k content) {
        Companion.getClass();
        m.f(content, "content");
        return Companion.b(content, mediaType, j11);
    }

    @qy.c
    public static final ResponseBody create(MediaType mediaType, String content) {
        Companion.getClass();
        m.f(content, "content");
        return Companion.a(content, mediaType);
    }

    @qy.c
    public static final ResponseBody create(MediaType mediaType, l content) {
        Companion.getClass();
        m.f(content, "content");
        return Companion.c(content, mediaType);
    }

    @qy.c
    public static final ResponseBody create(MediaType mediaType, byte[] content) {
        Companion.getClass();
        m.f(content, "content");
        i iVar = new i();
        iVar.m228write(content);
        return Companion.b(iVar, mediaType, content.length);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        Companion.getClass();
        m.f(bArr, "<this>");
        i iVar = new i();
        iVar.m228write(bArr);
        return Companion.b(iVar, mediaType, bArr.length);
    }
}
