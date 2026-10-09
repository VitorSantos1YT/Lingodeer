package okhttp3.internal.http;

import java.io.IOException;
import m00.h0;
import m00.i0;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface ExchangeCodec {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Carrier {
        void a(RealCall realCall, IOException iOException);

        void cancel();

        void e();

        Route h();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        static {
            new Companion();
        }

        private Companion() {
        }
    }

    void a();

    void b(Request request);

    boolean c();

    void cancel();

    i0 d(Response response);

    Response.Builder e(boolean z11);

    void f();

    long g(Response response);

    Carrier h();

    h0 i(Request request, long j11);
}
