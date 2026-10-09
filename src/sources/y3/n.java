package y3;

import android.graphics.Rect;
import android.view.View;
import e2.e0;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f57085b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i11) {
        super(1);
        this.f57084a = i11;
        this.f57085b = oVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f57084a) {
            case 0:
                e2.a aVar = (e2.a) obj;
                o oVar = this.f57085b;
                View viewC = h.c(oVar);
                if (!viewC.isFocused() && !viewC.hasFocus()) {
                    e2.l focusOwner = y2.f.y(oVar).getFocusOwner();
                    View viewZ = y2.f.z(oVar);
                    Integer numC = e2.h.c(aVar.f24704a);
                    int[] iArr = new int[2];
                    viewZ.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewC.getLocationOnScreen(iArr2);
                    e0 e0VarF = e2.d.f(((e2.p) focusOwner).f24738c);
                    Rect rect = null;
                    f2.c cVarI = e0VarF != null ? e2.d.i(e0VarF) : null;
                    if (cVarI != null) {
                        int i11 = (int) cVarI.f26572a;
                        int i12 = iArr[0];
                        int i13 = iArr2[0];
                        int i14 = (int) cVarI.f26573b;
                        int i15 = iArr[1];
                        int i16 = iArr2[1];
                        rect = new Rect((i11 + i12) - i13, (i14 + i15) - i16, (((int) cVarI.f26574c) + i12) - i13, (((int) cVarI.f26575d) + i15) - i16);
                    }
                    if (!e2.h.b(viewC, numC, rect)) {
                        aVar.f24705b = true;
                    }
                }
                break;
            default:
                h.c(this.f57085b);
                break;
        }
        return b0.f48488a;
    }
}
