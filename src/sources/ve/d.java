package ve;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static SensorManager f53981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static k f53982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f53983e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile boolean f53986h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f53979a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f53980b = new l();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f53984f = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f53985g = new AtomicBoolean(false);

    public static final String a() {
        if (qf.a.b(d.class)) {
            return null;
        }
        try {
            if (f53983e == null) {
                f53983e = UUID.randomUUID().toString();
            }
            String str = f53983e;
            m.d(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        } catch (Throwable th2) {
            qf.a.a(d.class, th2);
            return null;
        }
    }
}
