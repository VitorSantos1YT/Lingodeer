package okhttp3;

import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface CookieJar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CookieJar f45018a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f45019a = 0;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public final void a(HttpUrl url, List list) {
                m.f(url, "url");
            }

            @Override // okhttp3.CookieJar
            public final void b(HttpUrl url) {
                m.f(url, "url");
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i11 = Companion.f45019a;
        f45018a = new Companion.NoCookies();
    }

    void a(HttpUrl httpUrl, List list);

    void b(HttpUrl httpUrl);
}
