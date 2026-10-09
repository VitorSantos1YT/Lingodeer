package nw;

import com.google.common.base.Preconditions;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;
import lf.x0;
import lw.v1;
import mw.k1;
import mw.n3;
import mw.r5;
import mw.z2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends lw.w {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final io.grpc.okhttp.internal.c f44215p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final x0 f44216q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z2 f44217d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SSLSocketFactory f44221h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n3 f44218e = r5.f42666c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x0 f44219f = f44216q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x0 f44220g = new x0(k1.f42502q, 4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.grpc.okhttp.internal.c f44222i = f44215p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f44223j = h.TLS;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f44224k = Long.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f44225l = k1.f42498l;
    public final int m = 65535;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f44226n = 4194304;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f44227o = Integer.MAX_VALUE;

    static {
        Logger.getLogger(j.class.getName());
        io.grpc.okhttp.internal.b bVar = new io.grpc.okhttp.internal.b(io.grpc.okhttp.internal.c.f34509e);
        bVar.a(io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        bVar.b(io.grpc.okhttp.internal.m.TLS_1_2);
        if (!bVar.f34505a) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        bVar.f34508d = true;
        f44215p = new io.grpc.okhttp.internal.c(bVar);
        TimeUnit.DAYS.toNanos(1000L);
        f44216q = new x0(new tw.c(23), 4);
        EnumSet.of(v1.MTLS, v1.CUSTOM_MANAGERS);
    }

    public j(String str) {
        this.f44217d = new z2(str, new a5.f(this, 29), new n9.q(this, 1));
    }

    public static j forTarget(String str) {
        return new j(str);
    }

    public j scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        Preconditions.k(scheduledExecutorService, "scheduledExecutorService");
        this.f44220g = new x0(scheduledExecutorService);
        return this;
    }

    public j sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f44221h = sSLSocketFactory;
        this.f44223j = h.TLS;
        return this;
    }

    public j transportExecutor(Executor executor) {
        if (executor == null) {
            this.f44219f = f44216q;
            return this;
        }
        this.f44219f = new x0(executor);
        return this;
    }
}
