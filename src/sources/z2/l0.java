package z2;

import android.view.Choreographer;
import androidx.compose.ui.window.PopupLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f58608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f58609c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i11, Object obj, Object obj2) {
        super(1);
        this.f58607a = i11;
        this.f58608b = obj;
        this.f58609c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.c
    public final Object invoke(Object obj) {
        b1.x xVar;
        switch (this.f58607a) {
            case 0:
                q1 q1Var = (q1) this.f58608b;
                synchronized (q1Var.f58655c) {
                    try {
                        q1Var.f58657e = true;
                        n1.e eVar = q1Var.f58656d;
                        Object[] objArr = eVar.f43112a;
                        int i11 = eVar.f43114c;
                        for (int i12 = 0; i12 < i11; i12++) {
                            o3.l lVar = (o3.l) ((y2.i2) objArr[i12]).get();
                            if (lVar != null && (xVar = lVar.f44687b) != null) {
                                lVar.a(xVar);
                                lVar.f44687b = null;
                            }
                        }
                        q1Var.f58656d.h();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                o3.x xVar2 = ((m0) this.f58609c).f58615b;
                xVar2.f44708b.set(null);
                xVar2.f44707a.d();
                return qy.b0.f48488a;
            case 1:
                p0 p0Var = (p0) this.f58608b;
                q0 q0Var = (q0) this.f58609c;
                synchronized (p0Var.f58639c) {
                    p0Var.f58641e.remove(q0Var);
                }
                return qy.b0.f48488a;
            case 2:
                ((Choreographer) ((l1.f) this.f58608b).f39289b).removeFrameCallback((q0) this.f58609c);
                return qy.b0.f48488a;
            default:
                PopupLayout popupLayout = (PopupLayout) this.f58608b;
                popupLayout.setPositionProvider((z3.y) this.f58609c);
                popupLayout.o();
                return new z3.h();
        }
    }
}
