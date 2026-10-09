package a0;

import androidx.lifecycle.LifecycleOwner;
import dt.p4;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements l1.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f103d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i11) {
        this.f100a = i11;
        this.f101b = obj;
        this.f102c = obj2;
        this.f103d = obj3;
    }

    @Override // l1.i0
    public final void dispose() {
        switch (this.f100a) {
            case 0:
                x1.p pVar = (x1.p) this.f101b;
                Object obj = this.f102c;
                pVar.remove(obj);
                ((y) this.f103d).f237d.k(obj);
                break;
            case 1:
                ((fz.a) this.f101b).invoke();
                ((LifecycleOwner) this.f102c).getLifecycle().removeObserver((p4) this.f103d);
                break;
            case 2:
                ((LifecycleOwner) this.f101b).getLifecycle().removeObserver((p4) this.f102c);
                ((mv.n) this.f103d).a(mv.c.f42192a);
                break;
            case 3:
                k9.o oVar = (k9.o) this.f102c;
                j9.e eVar = (j9.e) this.f103d;
                oVar.b().c(eVar);
                ((x1.p) this.f101b).remove(eVar);
                break;
            case 4:
                w1.c cVar = (w1.c) this.f101b;
                y.i0 i0Var = cVar.f54459b;
                Object obj2 = this.f102c;
                Object objK = i0Var.k(obj2);
                w1.h hVar = (w1.h) this.f103d;
                if (objK == hVar) {
                    Map map = cVar.f54458a;
                    Map mapA = hVar.a();
                    if (!mapA.isEmpty()) {
                        map.put(obj2, mapA);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
            default:
                rz.g1 g1Var = (rz.g1) ((kotlin.jvm.internal.y) this.f101b).f38361a;
                if (g1Var != null) {
                    g1Var.cancel(null);
                }
                ((av.n) this.f102c).b();
                ((av.n) this.f103d).b();
                break;
        }
    }

    public i(k9.o oVar, j9.e eVar, x1.p pVar) {
        this.f100a = 3;
        this.f102c = oVar;
        this.f103d = eVar;
        this.f101b = pVar;
    }
}
