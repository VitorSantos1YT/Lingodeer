package okhttp3.internal.http1;

import kotlin.jvm.internal.m;
import m00.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class HeadersReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f45363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f45364b;

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
    }

    public HeadersReader(k source) {
        m.f(source, "source");
        this.f45363a = source;
        this.f45364b = 262144L;
    }
}
