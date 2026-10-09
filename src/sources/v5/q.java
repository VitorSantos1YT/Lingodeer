package v5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import b7.c0;
import hh.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lf.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements i {
    public ob.f H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f53547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.d f53548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re.v f53549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f53550d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f53551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f53552f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ThreadPoolExecutor f53553t;

    public q(Context context, w4.d dVar) {
        ns.o.l(context, "Context cannot be null");
        this.f53547a = context.getApplicationContext();
        this.f53548b = dVar;
        this.f53549c = r.f53554d;
    }

    @Override // v5.i
    public final void a(ob.f fVar) {
        synchronized (this.f53550d) {
            this.H = fVar;
        }
        synchronized (this.f53550d) {
            try {
                if (this.H == null) {
                    return;
                }
                if (this.f53552f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new c0("emojiCompat", 1));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f53553t = threadPoolExecutor;
                    this.f53552f = threadPoolExecutor;
                }
                this.f53552f.execute(new i0(this, 17));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f53550d) {
            try {
                this.H = null;
                Handler handler = this.f53551e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f53551e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f53553t;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f53552f = null;
                this.f53553t = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final w4.h c() {
        try {
            re.v vVar = this.f53549c;
            Context context = this.f53547a;
            w4.d dVar = this.f53548b;
            vVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            m0.u uVarA = w4.b.a(context, Collections.unmodifiableList(arrayList));
            int i11 = uVarA.f40633a;
            if (i11 != 0) {
                throw new RuntimeException(p0.h(i11, "fetchFonts failed (", ")"));
            }
            w4.h[] hVarArr = (w4.h[]) uVarA.f40634b.get(0);
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e8) {
            throw new RuntimeException("provider not found", e8);
        }
    }
}
