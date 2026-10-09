package gb;

import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkerStoppedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fb.v f28976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f28979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(fb.v vVar, boolean z11, String str, a0 a0Var) {
        super(1);
        this.f28976a = vVar;
        this.f28977b = z11;
        this.f28978c = str;
        this.f28979d = a0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        String str;
        Throwable th2 = (Throwable) obj;
        if (th2 instanceof WorkerStoppedException) {
            this.f28976a.f27112c.compareAndSet(-256, ((WorkerStoppedException) th2).f2800a);
        }
        if (this.f28977b && (str = this.f28978c) != null) {
            a0 a0Var = this.f28979d;
            fb.l lVar = a0Var.f28898e.f27057l;
            int iHashCode = a0Var.f28894a.hashCode();
            lVar.getClass();
            if (Build.VERSION.SDK_INT >= 29) {
                pa.a.b(v10.c.L(str), iHashCode);
            } else {
                String strL = v10.c.L(str);
                try {
                    if (v10.c.f53476e == null) {
                        v10.c.f53476e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                    }
                    v10.c.f53476e.invoke(null, Long.valueOf(v10.c.f53473b), strL, Integer.valueOf(iHashCode));
                } catch (Exception e8) {
                    v10.c.y(e8);
                }
            }
        }
        return qy.b0.f48488a;
    }
}
