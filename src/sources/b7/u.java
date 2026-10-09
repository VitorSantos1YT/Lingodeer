package b7;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static u f4025f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f4026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f4027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4030e;

    public u(Context context) {
        Executor executorQ = a.q();
        this.f4026a = executorQ;
        this.f4027b = new CopyOnWriteArrayList();
        this.f4028c = new Object();
        this.f4029d = 0;
        executorQ.execute(new b2.c(2, this, context));
    }

    public static synchronized u a(Context context) {
        try {
            if (f4025f == null) {
                f4025f = new u(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4025f;
    }

    public final int b() {
        int i11;
        synchronized (this.f4028c) {
            i11 = this.f4029d;
        }
        return i11;
    }

    public final void c(int i11) {
        CopyOnWriteArrayList<t> copyOnWriteArrayList = this.f4027b;
        for (t tVar : copyOnWriteArrayList) {
            if (tVar.f4022a.get() == null) {
                copyOnWriteArrayList.remove(tVar);
            }
        }
        synchronized (this.f4028c) {
            try {
                if (this.f4030e && this.f4029d == i11) {
                    return;
                }
                this.f4030e = true;
                this.f4029d = i11;
                for (t tVar2 : this.f4027b) {
                    tVar2.f4023b.execute(new b2.a(tVar2, 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
