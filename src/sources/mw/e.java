package mw;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f42395c = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f42397b;

    public e(long j11) {
        AtomicLong atomicLong = new AtomicLong();
        this.f42397b = atomicLong;
        Preconditions.e("value must be positive", j11 > 0);
        this.f42396a = "keepalive time nanos";
        atomicLong.set(j11);
    }
}
