package wc;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import lf.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f54935e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f54936a = new LinkedHashSet(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f54937b = new LinkedHashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f54938c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile a0 f54939d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f54935e = new s.a(1);
        } else {
            f54935e = Executors.newCachedThreadPool(new kd.e());
        }
    }

    public b0(h hVar) {
        d(new a0(hVar));
    }

    public final synchronized void a(y yVar) {
        Throwable th2;
        try {
            a0 a0Var = this.f54939d;
            if (a0Var != null && (th2 = a0Var.f54934b) != null) {
                yVar.onResult(th2);
            }
            this.f54937b.add(yVar);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b(y yVar) {
        h hVar;
        try {
            a0 a0Var = this.f54939d;
            if (a0Var != null && (hVar = a0Var.f54933a) != null) {
                yVar.onResult(hVar);
            }
            this.f54936a.add(yVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        a0 a0Var = this.f54939d;
        if (a0Var == null) {
            return;
        }
        h hVar = a0Var.f54933a;
        int i11 = 0;
        if (hVar != null) {
            synchronized (this) {
                ArrayList arrayList = new ArrayList(this.f54936a);
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((y) obj).onResult(hVar);
                }
            }
            return;
        }
        Throwable th2 = a0Var.f54934b;
        synchronized (this) {
            ArrayList arrayList2 = new ArrayList(this.f54937b);
            if (arrayList2.isEmpty()) {
                kd.d.c("Lottie encountered an error but no failure listener was added:", th2);
                return;
            }
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                ((y) obj2).onResult(th2);
            }
        }
    }

    public final void d(a0 a0Var) {
        if (this.f54939d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f54939d = a0Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.f54938c.post(new i0(this, 24));
        }
    }

    public b0(Callable callable, boolean z11) {
        if (z11) {
            try {
                d((a0) callable.call());
                return;
            } catch (Throwable th2) {
                d(new a0(th2));
                return;
            }
        }
        Executor executor = f54935e;
        w6.b bVar = new w6.b(callable);
        bVar.f54658b = this;
        executor.execute(bVar);
    }
}
