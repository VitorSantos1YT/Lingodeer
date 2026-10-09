package androidx.work;

import a4.l;
import android.content.Context;
import com.bumptech.glide.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import fb.h0;
import fb.u;
import fb.v;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        m.f(context, "context");
        m.f(workerParams, "workerParams");
    }

    @Override // fb.v
    public final l a() {
        ExecutorService backgroundExecutor = this.f27111b.f2790d;
        m.e(backgroundExecutor, "backgroundExecutor");
        return g.n(new e(backgroundExecutor, new h0(this, 0)));
    }

    @Override // fb.v
    public final l b() {
        ExecutorService backgroundExecutor = this.f27111b.f2790d;
        m.e(backgroundExecutor, "backgroundExecutor");
        return g.n(new e(backgroundExecutor, new h0(this, 1)));
    }

    public abstract u c();
}
