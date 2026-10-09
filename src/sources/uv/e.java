package uv;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f53205a;

    static {
        r rVar = new r();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ew.b("EventPool"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        rVar.f53230a = threadPoolExecutor;
        rVar.f53231b = new HashMap();
        f53205a = rVar;
    }
}
