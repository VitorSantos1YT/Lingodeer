package b7;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f3949b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f3950a;

    public a0(Handler handler) {
        this.f3950a = handler;
    }

    public static z b() {
        z zVar;
        ArrayList arrayList = f3949b;
        synchronized (arrayList) {
            try {
                zVar = arrayList.isEmpty() ? new z() : (z) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zVar;
    }

    public final z a(int i11, Object obj) {
        z zVarB = b();
        zVarB.f4046a = this.f3950a.obtainMessage(i11, obj);
        return zVarB;
    }

    public final boolean c(Runnable runnable) {
        return this.f3950a.post(runnable);
    }

    public final void d(int i11) {
        a.d(i11 != 0);
        this.f3950a.removeMessages(i11);
    }

    public final boolean e(int i11) {
        return this.f3950a.sendEmptyMessage(i11);
    }
}
