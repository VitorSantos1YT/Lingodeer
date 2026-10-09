package okhttp3;

import fz.f;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.ConnectionListener;
import okhttp3.internal.connection.ConnectionUser;
import okhttp3.internal.connection.FastFallbackExchangeFinder;
import okhttp3.internal.connection.ForceConnectRoutePlanner;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RealRoutePlanner;
import okhttp3.internal.connection.RouteDatabase;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ConnectionPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealConnectionPool f44991a;

    /* JADX WARN: Type inference failed for: r2v5, types: [okhttp3.a] */
    public ConnectionPool(TaskRunner taskRunner, ConnectionListener connectionListener, int i11, int i12, int i13, int i14, boolean z11, boolean z12, RouteDatabase routeDatabase, int i15) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        final TaskRunner taskRunner2 = (i15 & 8) != 0 ? TaskRunner.N : taskRunner;
        if ((i15 & 16) != 0) {
            ConnectionListener.f45249a.getClass();
            connectionListener = ConnectionListener.f45250b;
        }
        final int i16 = (i15 & 32) != 0 ? 10000 : i11;
        final int i17 = (i15 & 64) != 0 ? 10000 : i12;
        final int i18 = (i15 & 128) != 0 ? 10000 : i13;
        final int i19 = (i15 & 256) != 0 ? 10000 : i14;
        final int i21 = (i15 & 512) == 0 ? 0 : 10000;
        final boolean z13 = (i15 & 1024) != 0 ? true : z11;
        final boolean z14 = (i15 & 2048) != 0 ? true : z12;
        final RouteDatabase routeDatabase2 = (i15 & 4096) != 0 ? new RouteDatabase() : routeDatabase;
        m.f(timeUnit, "timeUnit");
        m.f(taskRunner2, "taskRunner");
        m.f(connectionListener, "connectionListener");
        this.f44991a = new RealConnectionPool(taskRunner2, 5, 5L, timeUnit, connectionListener, new f() { // from class: okhttp3.a
            @Override // fz.f
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                RealConnectionPool pool = (RealConnectionPool) obj;
                Address address = (Address) obj2;
                ConnectionUser user = (ConnectionUser) obj3;
                m.f(pool, "pool");
                m.f(address, "address");
                m.f(user, "user");
                TaskRunner taskRunner3 = taskRunner2;
                return new FastFallbackExchangeFinder(new ForceConnectRoutePlanner(new RealRoutePlanner(taskRunner3, pool, i16, i17, i18, i19, i21, z13, z14, address, routeDatabase2, user)), taskRunner3);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConnectionPool() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        m.f(timeUnit, "timeUnit");
        TaskRunner taskRunner = TaskRunner.N;
        ConnectionListener.f45249a.getClass();
        this(taskRunner, ConnectionListener.f45250b, 0, 0, 0, 0, false, false, null, 8160);
    }
}
