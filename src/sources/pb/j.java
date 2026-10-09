package pb;

import aw.t;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f46740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f46741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f46742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f46743e;

    public j(Executor executor, int i11) {
        this.f46739a = i11;
        switch (i11) {
            case 1:
                kotlin.jvm.internal.m.f(executor, "executor");
                this.f46740b = executor;
                this.f46741c = new ArrayDeque();
                this.f46743e = new Object();
                break;
            default:
                this.f46740b = executor;
                this.f46741c = new ArrayDeque();
                this.f46743e = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.f46739a) {
            case 0:
                Runnable runnable = (Runnable) this.f46741c.poll();
                this.f46742d = runnable;
                if (runnable != null) {
                    this.f46740b.execute(runnable);
                    return;
                }
                return;
            case 1:
                synchronized (this.f46743e) {
                    Object objPoll = this.f46741c.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.f46742d = runnable2;
                    if (objPoll != null) {
                        this.f46740b.execute(runnable2);
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f46743e) {
                    try {
                        Runnable runnable3 = (Runnable) this.f46741c.poll();
                        this.f46742d = runnable3;
                        if (runnable3 != null) {
                            ((l.q) this.f46740b).execute(runnable3);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f46739a) {
            case 0:
                synchronized (this.f46743e) {
                    try {
                        this.f46741c.add(new t(this, runnable, false, 17));
                        if (this.f46742d == null) {
                            a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 1:
                kotlin.jvm.internal.m.f(runnable, ualZoVVCQs.vSnjLmxKjtPE);
                synchronized (this.f46743e) {
                    this.f46741c.offer(new b(23, runnable, this));
                    if (this.f46742d == null) {
                        a();
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f46743e) {
                    try {
                        this.f46741c.add(new b2.c(25, this, runnable));
                        if (this.f46742d == null) {
                            a();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
        }
    }

    public j(l.q qVar) {
        this.f46739a = 2;
        this.f46743e = new Object();
        this.f46741c = new ArrayDeque();
        this.f46740b = qVar;
    }
}
