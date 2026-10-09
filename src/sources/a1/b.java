package a1;

import s2.c0;
import y2.p;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f270a;

    static {
        float f5 = 40;
        float f11 = 10;
        f270a = new p(f11, f5, f11, f5);
    }

    public static final r a(boolean z11, boolean z12, fz.a aVar) {
        r c0Var = o.f58481a;
        if (!z11 || !f.f279a) {
            return c0Var;
        }
        if (z12) {
            c0Var = new c0(f270a);
        }
        return c0Var.i(new a(aVar));
    }
}
