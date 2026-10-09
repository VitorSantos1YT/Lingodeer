package aw;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3245a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f3246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ob.e f3247c;

    public u(int i11, ob.e eVar) {
        this.f3247c = eVar;
        String strJ = nv.p.j(i11, "Flow-");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ew.b(strJ));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f3246b = threadPoolExecutor;
    }
}
