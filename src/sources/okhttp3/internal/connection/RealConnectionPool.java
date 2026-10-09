package okhttp3.internal.connection;

import defpackage.e;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import okhttp3.a;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import ry.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RealConnectionPool {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f45295h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectionListener f45297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Map f45299d = s.f50855a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TaskQueue f45300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RealConnectionPool$cleanupTask$1 f45301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentLinkedQueue f45302g;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AddressState {
    }

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
        AtomicReferenceFieldUpdater.newUpdater(RealConnectionPool.class, Map.class, "d");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner, int i11, long j11, TimeUnit timeUnit, ConnectionListener connectionListener, a aVar) {
        this.f45296a = i11;
        this.f45297b = connectionListener;
        this.f45298c = timeUnit.toNanos(j11);
        this.f45300e = taskRunner.d();
        final String strK = ep.a.k(new StringBuilder(), _UtilJvmKt.f45205b, " ConnectionPool connection closer");
        this.f45301f = new Task(strK) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                RealConnectionPool realConnectionPool = this.f45303e;
                long jNanoTime = System.nanoTime();
                Map map = realConnectionPool.f45299d;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((RealConnectionPool.AddressState) it.next()).getClass();
                }
                Iterator it2 = realConnectionPool.f45302g.iterator();
                m.e(it2, "iterator(...)");
                while (it2.hasNext()) {
                    RealConnection realConnection = (RealConnection) it2.next();
                    if (((RealConnectionPool.AddressState) map.get(realConnection.f45291d.f45185a)) != null) {
                        synchronized (realConnection) {
                        }
                    }
                }
                long j12 = (jNanoTime - realConnectionPool.f45298c) + 1;
                Iterator it3 = realConnectionPool.f45302g.iterator();
                m.e(it3, "iterator(...)");
                int i12 = 0;
                long j13 = Long.MAX_VALUE;
                RealConnection realConnection2 = null;
                RealConnection realConnection3 = null;
                int i13 = 0;
                while (it3.hasNext()) {
                    RealConnection realConnection4 = (RealConnection) it3.next();
                    m.c(realConnection4);
                    synchronized (realConnection4) {
                        if (realConnectionPool.a(realConnection4, jNanoTime) > 0) {
                            i13++;
                        } else {
                            int i14 = i13;
                            long j14 = realConnection4.W;
                            if (j14 < j12) {
                                j12 = j14;
                                realConnection2 = realConnection4;
                            }
                            if (((RealConnectionPool.AddressState) map.get(realConnection4.f45291d.f45185a)) != null) {
                                throw null;
                            }
                            i12++;
                            if (j14 < j13) {
                                j13 = j14;
                                realConnection3 = realConnection4;
                            }
                            i13 = i14;
                        }
                    }
                }
                int i15 = i13;
                if (realConnection2 == null) {
                    if (i12 > realConnectionPool.f45296a) {
                        j12 = j13;
                        realConnection2 = realConnection3;
                    } else {
                        j12 = -1;
                        realConnection2 = null;
                    }
                }
                if (realConnection2 == null) {
                    if (realConnection3 != null) {
                        return (j13 + realConnectionPool.f45298c) - jNanoTime;
                    }
                    if (i15 > 0) {
                        return realConnectionPool.f45298c;
                    }
                    return -1L;
                }
                synchronized (realConnection2) {
                    if (!realConnection2.V.isEmpty()) {
                        return 0L;
                    }
                    if (realConnection2.W != j12) {
                        return 0L;
                    }
                    realConnection2.P = true;
                    realConnectionPool.f45302g.remove(realConnection2);
                    RealConnectionPool.AddressState addressState = (RealConnectionPool.AddressState) map.get(realConnection2.f45291d.f45185a);
                    if (addressState != null) {
                        realConnectionPool.b(addressState);
                        throw null;
                    }
                    _UtilJvmKt.c(realConnection2.f45293f);
                    if (!realConnectionPool.f45302g.isEmpty()) {
                        return 0L;
                    }
                    TaskQueue taskQueue = realConnectionPool.f45300e;
                    synchronized (taskQueue.f45218a) {
                        if (taskQueue.a()) {
                            taskQueue.f45218a.c(taskQueue);
                        }
                    }
                    return 0L;
                }
            }
        };
        this.f45302g = new ConcurrentLinkedQueue();
        if (j11 <= 0) {
            throw new IllegalArgumentException(e.h(j11, "keepAliveDuration <= 0: ").toString());
        }
    }

    public final int a(RealConnection realConnection, long j11) {
        TimeZone timeZone = _UtilJvmKt.f45204a;
        ArrayList arrayList = realConnection.V;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i11);
            if (reference.get() != null) {
                i11++;
            } else {
                String str = "A connection to " + realConnection.f45291d.f45185a.f44940i + " was leaked. Did you forget to close a response body?";
                Platform.f45527a.getClass();
                Platform.f45528b.k(((RealCall.CallReference) reference).f45288a, str);
                arrayList.remove(i11);
                if (arrayList.isEmpty()) {
                    realConnection.W = j11 - this.f45298c;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public final void b(final AddressState addressState) {
        final String strK = ep.a.k(new StringBuilder(), _UtilJvmKt.f45205b, " ConnectionPool connection opener");
        new Task(strK) { // from class: okhttp3.internal.connection.RealConnectionPool$scheduleOpener$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                int i11 = RealConnectionPool.f45295h;
                this.f45304e.getClass();
                addressState.getClass();
                throw null;
            }
        };
        throw null;
    }
}
