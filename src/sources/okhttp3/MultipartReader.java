package okhttp3;

import defpackage.e;
import fr.p3;
import java.io.Closeable;
import kotlin.jvm.internal.m;
import m00.i;
import m00.i0;
import m00.k0;
import m00.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class MultipartReader implements Closeable {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Part implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class PartSource implements i0 {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // m00.i0
        public final long read(i sink, long j11) {
            m.f(sink, "sink");
            if (j11 >= 0) {
                throw null;
            }
            throw new IllegalArgumentException(e.h(j11, "byteCount < 0: ").toString());
        }

        @Override // m00.i0
        public final k0 timeout() {
            return null;
        }
    }

    static {
        new Companion(0);
        l lVar = l.f40723d;
        m00.b.f(p3.l("\r\n"), p3.l("--"), p3.l(" "), p3.l("\t"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
