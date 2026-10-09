package okhttp3;

import i0.pKy.shrCcjmOhAmRC;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.m;
import m00.a0;
import m00.i0;
import m00.j;
import ns.o;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import qy.c;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class RequestBody {
    public static final Companion Companion = new Companion(0);
    public static final RequestBody EMPTY;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        public static RequestBody$Companion$toRequestBody$3 a(String str, MediaType mediaType) {
            m.f(str, "<this>");
            l lVarA = Internal.a(mediaType);
            Charset charset = (Charset) lVarA.f48495a;
            MediaType mediaType2 = (MediaType) lVarA.f48496b;
            byte[] bytes = str.getBytes(charset);
            m.e(bytes, "getBytes(...)");
            return b(mediaType2, bytes, 0, bytes.length);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [okhttp3.RequestBody$Companion$toRequestBody$3] */
        public static RequestBody$Companion$toRequestBody$3 b(final MediaType mediaType, final byte[] bArr, final int i11, final int i12) {
            m.f(bArr, "<this>");
            _UtilCommonKt.a(bArr.length, i11, i12);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$3
                @Override // okhttp3.RequestBody
                public final long contentLength() {
                    return i12;
                }

                @Override // okhttp3.RequestBody
                public final MediaType contentType() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                public final void writeTo(j jVar) {
                    jVar.write(bArr, i11, i12);
                }
            };
        }

        public static /* synthetic */ RequestBody$Companion$toRequestBody$3 c(MediaType mediaType, byte[] bArr, int i11, int i12) {
            if ((i12 & 1) != 0) {
                mediaType = null;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return b(mediaType, bArr, i11, bArr.length);
        }

        private Companion() {
        }
    }

    static {
        m00.l lVar = m00.l.f40723d;
        m.f(lVar, "<this>");
        EMPTY = new RequestBody$Companion$toRequestBody$1(lVar, null);
    }

    public static final RequestBody create(final FileDescriptor fileDescriptor, final MediaType mediaType) {
        Companion.getClass();
        m.f(fileDescriptor, "<this>");
        return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
            @Override // okhttp3.RequestBody
            public final MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public final boolean isOneShot() {
                return true;
            }

            @Override // okhttp3.RequestBody
            public final void writeTo(j jVar) throws IOException {
                FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    jVar.n().m0(m00.b.i(fileInputStream));
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        o.m(fileInputStream, th2);
                        throw th3;
                    }
                }
            }
        };
    }

    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(j jVar);

    public static final RequestBody create(String str, MediaType mediaType) {
        Companion.getClass();
        return Companion.a(str, mediaType);
    }

    public static final RequestBody create(final a0 a0Var, final m00.o fileSystem, final MediaType mediaType) {
        Companion.getClass();
        m.f(a0Var, "<this>");
        m.f(fileSystem, "fileSystem");
        return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$2
            @Override // okhttp3.RequestBody
            public final long contentLength() {
                Long l9 = (Long) fileSystem.p(a0Var).f24794e;
                if (l9 != null) {
                    return l9.longValue();
                }
                return -1L;
            }

            @Override // okhttp3.RequestBody
            public final MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public final void writeTo(j jVar) throws IOException {
                i0 i0VarY = fileSystem.y(a0Var);
                try {
                    jVar.m0(i0VarY);
                    i0VarY.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        o.m(i0VarY, th2);
                        throw th3;
                    }
                }
            }
        };
    }

    @c
    public static final RequestBody create(MediaType mediaType, File file) {
        Companion.getClass();
        m.f(file, "file");
        return new RequestBody$Companion$asRequestBody$1(mediaType, file);
    }

    @c
    public static final RequestBody create(MediaType mediaType, String content) {
        Companion.getClass();
        m.f(content, "content");
        return Companion.a(content, mediaType);
    }

    @c
    public static final RequestBody create(MediaType mediaType, m00.l content) {
        Companion.getClass();
        m.f(content, "content");
        return new RequestBody$Companion$toRequestBody$1(content, mediaType);
    }

    @c
    public static final RequestBody create(MediaType mediaType, byte[] content) {
        Companion.getClass();
        m.f(content, "content");
        return Companion.b(mediaType, content, 0, content.length);
    }

    @c
    public static final RequestBody create(MediaType mediaType, byte[] bArr, int i11) {
        Companion.getClass();
        m.f(bArr, shrCcjmOhAmRC.jKiHH);
        return Companion.b(mediaType, bArr, i11, bArr.length);
    }

    public static final RequestBody create(byte[] bArr) {
        Companion.getClass();
        m.f(bArr, "<this>");
        return Companion.c(null, bArr, 0, 7);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType) {
        Companion.getClass();
        m.f(bArr, "<this>");
        return Companion.c(mediaType, bArr, 0, 6);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i11) {
        Companion.getClass();
        m.f(bArr, "<this>");
        return Companion.c(mediaType, bArr, i11, 4);
    }

    public static final RequestBody create(byte[] bArr, MediaType mediaType, int i11, int i12) {
        Companion.getClass();
        return Companion.b(mediaType, bArr, i11, i12);
    }

    public static final RequestBody create(m00.l lVar, MediaType mediaType) {
        Companion.getClass();
        m.f(lVar, "<this>");
        return new RequestBody$Companion$toRequestBody$1(lVar, mediaType);
    }

    public static final RequestBody create(File file, MediaType mediaType) {
        Companion.getClass();
        m.f(file, "<this>");
        return new RequestBody$Companion$asRequestBody$1(mediaType, file);
    }

    @c
    public static final RequestBody create(MediaType mediaType, byte[] content, int i11, int i12) {
        Companion.getClass();
        m.f(content, "content");
        return Companion.b(mediaType, content, i11, i12);
    }
}
