package qp;

import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o3 implements y6.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f48098b;

    public /* synthetic */ o3(d dVar, int i11) {
        this.f48097a = i11;
        this.f48098b = dVar;
    }

    @Override // y6.h0
    public final void k(int i11) {
        switch (this.f48097a) {
            case 0:
                p3 p3Var = (p3) this.f48098b;
                f7.a0 a0Var = p3Var.f48115i;
                if (a0Var != null && a0Var.g() && i11 == 4) {
                    f7.a0 a0Var2 = p3Var.f48115i;
                    if (a0Var2 != null) {
                        a0Var2.r(false);
                    }
                    ta.a aVar = p3Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar);
                    ((LinearLayout) ((hj.i2) aVar).f32691e.f33679g).setVisibility(0);
                    ta.a aVar2 = p3Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((FrameLayout) ((hj.i2) aVar2).f32691e.f33678f).setVisibility(0);
                    break;
                }
                break;
            default:
                i0 i0Var = (i0) this.f48098b;
                f7.a0 a0Var3 = (f7.a0) i0Var.f47970p;
                if (a0Var3 != null && a0Var3.g() && i11 == 4) {
                    f7.a0 a0Var4 = (f7.a0) i0Var.f47970p;
                    if (a0Var4 != null) {
                        a0Var4.l0(5, 0L);
                    }
                    f7.a0 a0Var5 = (f7.a0) i0Var.f47970p;
                    if (a0Var5 != null) {
                        a0Var5.r(false);
                    }
                    ta.a aVar3 = i0Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    ((LinearLayout) ((hj.x2) aVar3).f33567b.f33679g).setVisibility(0);
                    ta.a aVar4 = i0Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar4);
                    ((FrameLayout) ((hj.x2) aVar4).f33567b.f33678f).setVisibility(0);
                    break;
                }
                break;
        }
    }
}
