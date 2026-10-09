package z2;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f58633a;

    public o0(p0 p0Var) {
        this.f58633a = p0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        this.f58633a.f58638b.removeCallbacks(this);
        p0.d(this.f58633a);
        p0 p0Var = this.f58633a;
        synchronized (p0Var.f58639c) {
            if (p0Var.H) {
                p0Var.H = false;
                ArrayList arrayList = p0Var.f58641e;
                p0Var.f58641e = p0Var.f58642f;
                p0Var.f58642f = arrayList;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((Choreographer.FrameCallback) arrayList.get(i11)).doFrame(j11);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        p0.d(this.f58633a);
        p0 p0Var = this.f58633a;
        synchronized (p0Var.f58639c) {
            if (p0Var.f58641e.isEmpty()) {
                p0Var.f58637a.removeFrameCallback(this);
                p0Var.H = false;
            }
        }
    }
}
