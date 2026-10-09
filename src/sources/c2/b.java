package c2;

import a0.b2;
import a0.o0;
import android.view.DragEvent;
import android.view.View;
import kotlin.jvm.internal.u;
import y2.f2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnDragListener, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f6500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.f f6501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f6502c;

    public b() {
        g gVar = new g();
        gVar.S = 0L;
        this.f6500a = gVar;
        this.f6501b = new y.f(0);
        this.f6502c = new a(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        b2 b2Var = new b2(dragEvent, 3);
        int action = dragEvent.getAction();
        y.f fVar = this.f6501b;
        g gVar = this.f6500a;
        switch (action) {
            case 1:
                u uVar = new u();
                f fVar2 = new f(b2Var, gVar, uVar);
                if (fVar2.invoke(gVar) == f2.ContinueTraversal) {
                    y2.f.C(gVar, fVar2);
                }
                boolean z11 = uVar.f38357a;
                fVar.getClass();
                y.a aVar = new y.a(fVar);
                while (aVar.hasNext()) {
                    ((g) aVar.next()).X0(b2Var);
                }
                return z11;
            case 2:
                gVar.W0(b2Var);
                return false;
            case 3:
                return gVar.T0(b2Var);
            case 4:
                o0 o0Var = new o0(b2Var, 4);
                if (o0Var.invoke(gVar) == f2.ContinueTraversal) {
                    y2.f.C(gVar, o0Var);
                }
                fVar.clear();
                return false;
            case 5:
                gVar.U0(b2Var);
                return false;
            case 6:
                gVar.V0(b2Var);
                return false;
            default:
                return false;
        }
    }
}
