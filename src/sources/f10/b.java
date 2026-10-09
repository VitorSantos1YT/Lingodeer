package f10;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;
import z2.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26517a;

    public /* synthetic */ b(int i11) {
        this.f26517a = i11;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f26517a) {
            case 0:
                return new d();
            case 1:
                return new Random();
            case 2:
                return new PathMeasure();
            case 3:
                return new Path();
            case 4:
                return new Path();
            case 5:
                return new float[4];
            default:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                p0 p0Var = new p0(choreographer, md.a.h(looperMyLooper));
                return p0Var.plus(p0Var.L);
        }
    }
}
