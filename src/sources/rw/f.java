package rw;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lw.c1;
import lw.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f50818a = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f50819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final lp.b f50820c;

    static {
        f50819b = !Strings.b(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f50820c = new lp.b("internal-stub-type", 1);
    }

    public static void a(lw.f fVar, Throwable th2) {
        try {
            fVar.a(null, th2);
        } catch (Error | RuntimeException e8) {
            f50818a.log(Level.SEVERE, "RuntimeException encountered while closing call", e8);
        }
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (!(th2 instanceof Error)) {
            throw new AssertionError(th2);
        }
        throw ((Error) th2);
    }

    public static b b(lw.f fVar, FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest) {
        b bVar = new b(fVar);
        fVar.p(new e(bVar), new c1());
        bVar.H.l();
        try {
            fVar.m(fetchEligibleCampaignsRequest);
            fVar.g();
            return bVar;
        } catch (Error | RuntimeException e8) {
            a(fVar, e8);
            throw null;
        }
    }

    public static Object c(b bVar) {
        try {
            return bVar.get();
        } catch (InterruptedException e8) {
            Thread.currentThread().interrupt();
            throw q1.f40435f.h("Thread interrupted").g(e8).a();
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            Preconditions.k(cause, "t");
            for (Throwable cause2 = cause; cause2 != null; cause2 = cause2.getCause()) {
                if (cause2 instanceof StatusException) {
                    throw new StatusRuntimeException(((StatusException) cause2).f34500a, null);
                }
                if (cause2 instanceof StatusRuntimeException) {
                    StatusRuntimeException statusRuntimeException = (StatusRuntimeException) cause2;
                    throw new StatusRuntimeException(statusRuntimeException.f34502a, statusRuntimeException.f34503b);
                }
            }
            throw q1.f40436g.h("unexpected exception").g(cause).a();
        }
    }
}
