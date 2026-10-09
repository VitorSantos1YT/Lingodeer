package mw;

import com.google.common.base.Stopwatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i4 f42441b;

    public /* synthetic */ h4(i4 i4Var, int i11) {
        this.f42440a = i11;
        this.f42441b = i4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42440a) {
            case 0:
                i4 i4Var = this.f42441b;
                if (!i4Var.f42468f) {
                    i4Var.f42469g = null;
                } else {
                    Stopwatch stopwatch = i4Var.f42466d;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long jA = i4Var.f42467e - stopwatch.a();
                    if (jA <= 0) {
                        i4Var.f42468f = false;
                        i4Var.f42469g = null;
                        i4Var.f42465c.run();
                    } else {
                        i4Var.f42469g = i4Var.f42463a.schedule(new h4(i4Var, 1), jA, timeUnit);
                    }
                }
                break;
            default:
                i4 i4Var2 = this.f42441b;
                i4Var2.f42464b.execute(new h4(i4Var2, 0));
                break;
        }
    }
}
