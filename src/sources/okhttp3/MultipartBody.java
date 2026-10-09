package okhttp3;

import fr.p3;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.m;
import m00.i;
import m00.j;
import m00.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class MultipartBody extends RequestBody {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final MediaType f45069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final MediaType f45070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f45071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f45072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f45073i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f45074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaType f45076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45077d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f45078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public MediaType f45079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f45080c;

        public Builder() {
            String string = UUID.randomUUID().toString();
            m.e(string, "toString(...)");
            l lVar = l.f40723d;
            this.f45078a = p3.l(string);
            this.f45079b = MultipartBody.f45069e;
            this.f45080c = new ArrayList();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Part {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Companion f45081c = new Companion(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Headers f45082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RequestBody f45083b;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class Companion {
            public /* synthetic */ Companion(int i11) {
                this();
            }

            private Companion() {
            }
        }

        public Part(Headers headers, RequestBody requestBody) {
            this.f45082a = headers;
            this.f45083b = requestBody;
        }
    }

    static {
        new Companion(0);
        MediaType.f45062e.getClass();
        f45069e = MediaType.Companion.a("multipart/mixed");
        MediaType.Companion.a("multipart/alternative");
        MediaType.Companion.a("multipart/digest");
        MediaType.Companion.a("multipart/parallel");
        f45070f = MediaType.Companion.a("multipart/form-data");
        f45071g = new byte[]{58, 32};
        f45072h = new byte[]{13, 10};
        f45073i = new byte[]{45, 45};
    }

    public MultipartBody(l boundaryByteString, MediaType type, List list) {
        m.f(boundaryByteString, "boundaryByteString");
        m.f(type, "type");
        this.f45074a = boundaryByteString;
        this.f45075b = list;
        MediaType.Companion companion = MediaType.f45062e;
        String str = type + "; boundary=" + boundaryByteString.v();
        companion.getClass();
        this.f45076c = MediaType.Companion.a(str);
        this.f45077d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(j jVar, boolean z11) throws EOFException {
        i iVar;
        j iVar2;
        if (z11) {
            iVar2 = new i();
            iVar = iVar2;
        } else {
            iVar = 0;
            iVar2 = jVar;
        }
        List list = this.f45075b;
        int size = list.size();
        long j11 = 0;
        int i11 = 0;
        while (true) {
            l lVar = this.f45074a;
            byte[] bArr = f45073i;
            byte[] bArr2 = f45072h;
            if (i11 >= size) {
                m.c(iVar2);
                iVar2.write(bArr);
                iVar2.Q0(lVar);
                iVar2.write(bArr);
                iVar2.write(bArr2);
                if (!z11) {
                    return j11;
                }
                m.c(iVar);
                long j12 = j11 + iVar.f40718b;
                iVar.a();
                return j12;
            }
            Part part = (Part) list.get(i11);
            Headers headers = part.f45082a;
            RequestBody requestBody = part.f45083b;
            m.c(iVar2);
            iVar2.write(bArr);
            iVar2.Q0(lVar);
            iVar2.write(bArr2);
            int size2 = headers.size();
            for (int i12 = 0; i12 < size2; i12++) {
                iVar2.l0(headers.d(i12)).write(f45071g).l0(headers.g(i12)).write(bArr2);
            }
            MediaType mediaTypeContentType = requestBody.contentType();
            if (mediaTypeContentType != null) {
                iVar2.l0("Content-Type: ").l0(mediaTypeContentType.f45065a).write(bArr2);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength == -1 && z11) {
                m.c(iVar);
                iVar.a();
                return -1L;
            }
            iVar2.write(bArr2);
            if (z11) {
                j11 += jContentLength;
            } else {
                requestBody.writeTo(iVar2);
            }
            iVar2.write(bArr2);
            i11++;
        }
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws EOFException {
        long j11 = this.f45077d;
        if (j11 != -1) {
            return j11;
        }
        long jA = a(null, true);
        this.f45077d = jA;
        return jA;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f45076c;
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        List list = this.f45075b;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Part) it.next()).f45083b.isOneShot()) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(j jVar) throws EOFException {
        a(jVar, false);
    }
}
