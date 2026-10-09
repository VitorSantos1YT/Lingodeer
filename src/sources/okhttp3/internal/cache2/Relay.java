package okhttp3.internal.cache2;

import fr.p3;
import kotlin.jvm.internal.m;
import m00.i;
import m00.i0;
import m00.k0;
import m00.l;
import okhttp3.internal.concurrent.Lockable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Relay implements Lockable {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        l lVar = l.f40723d;
        p3.l("OkHttp cache v1\n");
        p3.l("OkHttp DIRTY :(\n");
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class RelaySource implements i0 {
        @Override // m00.i0
        public final long read(i sink, long j11) {
            m.f(sink, "sink");
            throw new IllegalStateException("Check failed.");
        }

        @Override // m00.i0
        public final k0 timeout() {
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
