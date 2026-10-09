package bt;

import android.media.MediaRecorder;
import android.view.ActionMode;
import androidx.compose.ui.window.PopupLayout;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j1 implements l1.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5561b;

    public /* synthetic */ j1(Object obj, int i11) {
        this.f5560a = i11;
        this.f5561b = obj;
    }

    @Override // l1.i0
    public final void dispose() {
        qy.b0 b0Var;
        switch (this.f5560a) {
            case 0:
                av.b bVar = (av.b) this.f5561b;
                MediaRecorder mediaRecorder = bVar.f3110c;
                if (mediaRecorder != null) {
                    mediaRecorder.reset();
                    bVar.f3110c.release();
                    bVar.f3110c = null;
                    return;
                }
                return;
            case 1:
                i.h hVar = ((g.a) this.f5561b).f28284a;
                if (hVar != null) {
                    hVar.b();
                    b0Var = qy.b0.f48488a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                return;
            case 2:
                ((g.f) this.f5561b).e();
                return;
            case 3:
                ((g.l) this.f5561b).e();
                return;
            case 4:
                androidx.compose.material3.b bVar2 = (androidx.compose.material3.b) this.f5561b;
                bVar2.dismiss();
                bVar2.f1132t.d();
                return;
            case 5:
                ((fz.a) this.f5561b).invoke();
                return;
            case 6:
                rt.j2 j2Var = (rt.j2) this.f5561b;
                uz.i1 i1Var = j2Var.L;
                j2Var.H = false;
                rz.z1 z1Var = j2Var.K;
                if (z1Var != null) {
                    z1Var.cancel(null);
                }
                j2Var.K = null;
                rt.n1 n1Var = j2Var.f49910t;
                Long lValueOf = n1Var != null ? Long.valueOf(n1Var.f50113a) : null;
                Object loadState = (rt.h1) i1Var.getValue();
                kotlin.jvm.internal.m.f(loadState, "loadState");
                if (lValueOf != null && (loadState instanceof rt.e1)) {
                    loadState = new rt.f1(lValueOf.longValue());
                }
                i1Var.l(null, loadState);
                return;
            case 7:
                rt.b4 b4Var = (rt.b4) this.f5561b;
                b4Var.getClass();
                rz.e0.B(ViewModelKt.getViewModelScope(b4Var), null, null, new rt.n3(0, b4Var, null), 3);
                return;
            case 8:
                ((n0.x) this.f5561b).f43024d = null;
                return;
            case 9:
                n0.l0 l0Var = (n0.l0) this.f5561b;
                bq.f fVar = l0Var.f42970c;
                if (fVar != null) {
                    fVar.f4943a = false;
                }
                l0Var.f42970c = null;
                return;
            case 10:
                ((n0.h0) this.f5561b).f42954f = true;
                return;
            case 11:
                ((tu.e0) this.f5561b).a(tu.w.f52629a);
                return;
            case 12:
                ((d1.z0) this.f5561b).n();
                return;
            case 13:
                x0.f fVar2 = (x0.f) this.f5561b;
                x1.u uVar = fVar2.f55585e;
                ui.k kVar = uVar.f55731h;
                if (kVar != null) {
                    kVar.b();
                }
                uVar.a();
                ActionMode actionMode = fVar2.f55588h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                fVar2.f55588h = null;
                return;
            case 14:
                ((av.n) this.f5561b).b();
                return;
            case 15:
                ((fz.c) ((l1.b1) this.f5561b).getValue()).invoke(Boolean.FALSE);
                return;
            case 16:
                z0.b bVar3 = (z0.b) ((z0.c) this.f5561b).f58417c.getValue();
                if (bVar3 != null) {
                    bVar3.close();
                    return;
                }
                return;
            case 17:
                ((z2.j1) this.f5561b).f58594b.invoke();
                return;
            case 18:
                androidx.compose.ui.window.d dVar = (androidx.compose.ui.window.d) this.f5561b;
                dVar.dismiss();
                dVar.f1247t.d();
                return;
            default:
                PopupLayout popupLayout = (PopupLayout) this.f5561b;
                popupLayout.d();
                ViewTreeLifecycleOwner.set(popupLayout, null);
                popupLayout.Q.removeViewImmediate(popupLayout);
                return;
        }
    }
}
