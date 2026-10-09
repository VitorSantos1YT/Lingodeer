package mw;

import com.google.common.base.Stopwatch;
import io.grpc.StatusException;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f42640g = Logger.getLogger(q1.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Stopwatch f42642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedHashMap f42643c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StatusException f42645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f42646f;

    public q1(long j11, Stopwatch stopwatch) {
        this.f42641a = j11;
        this.f42642b = stopwatch;
    }
}
