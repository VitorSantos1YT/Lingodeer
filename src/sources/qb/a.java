package qb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import pb.j;
import rz.e0;
import rz.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f47694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f47695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f47696c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o20.a f47697d = new o20.a(this, 4);

    public a(ExecutorService executorService) {
        j jVar = new j(executorService, 0);
        this.f47694a = jVar;
        this.f47695b = e0.p(jVar);
    }

    public final void a(Runnable runnable) {
        this.f47694a.execute(runnable);
    }
}
