package okhttp3.internal.cache;

import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CacheStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Request f45210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Response f45211b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Factory {
    }

    static {
        new Companion(0);
    }

    public CacheStrategy(Request request, Response response) {
        this.f45210a = request;
        this.f45211b = response;
    }
}
