package a0;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f38a = ViewConfiguration.getScrollFriction();

    public static final b0.x a(l1.n nVar) {
        l1.s sVar = (l1.s) nVar;
        v3.c cVar = (v3.c) sVar.j(z2.g1.f58547h);
        boolean zC = sVar.c(cVar.getDensity());
        Object objQ = sVar.Q();
        if (zC || objQ == l1.m.f39353a) {
            objQ = new b0.x(new b2(cVar));
            sVar.o0(objQ);
        }
        return (b0.x) objQ;
    }
}
