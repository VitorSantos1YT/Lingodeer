package ys;

import androidx.lifecycle.LifecycleOwner;
import rt.tf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m3 implements l1.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf f58163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f58164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f58165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.compose.e f58166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.i1 f58167e;

    public m3(tf tfVar, fz.c cVar, LifecycleOwner lifecycleOwner, androidx.lifecycle.compose.e eVar, l1.i1 i1Var) {
        this.f58163a = tfVar;
        this.f58164b = cVar;
        this.f58165c = lifecycleOwner;
        this.f58166d = eVar;
        this.f58167e = i1Var;
    }

    @Override // l1.i0
    public final void dispose() {
        l1.i1 i1Var = this.f58167e;
        if (i1Var.l() > 0) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - i1Var.l()) / 1000;
            tf tfVar = this.f58163a;
            tfVar.getClass();
            yz.f fVar = rz.o0.f50940a;
            rz.e0.B(rz.e0.c(yz.e.f58387a), null, null, new bp.h2(tfVar, (int) jCurrentTimeMillis, (vy.d) null, 12), 3);
            this.f58164b.invoke(Long.valueOf(jCurrentTimeMillis));
        }
        this.f58165c.getLifecycle().removeObserver(this.f58166d);
    }
}
