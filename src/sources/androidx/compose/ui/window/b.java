package androidx.compose.ui.window;

import android.view.View;
import androidx.datastore.preferences.protobuf.l;
import java.util.List;
import qp.o2;
import z4.g1;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DialogLayout f1242c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DialogLayout dialogLayout) {
        super(1);
        this.f1242c = dialogLayout;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final v1 g(v1 v1Var, List list) {
        DialogLayout dialogLayout = this.f1242c;
        if (!dialogLayout.N) {
            View childAt = dialogLayout.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return v1Var.f58905a.n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return v1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final o2 h(g1 g1Var, o2 o2Var) {
        DialogLayout dialogLayout = this.f1242c;
        if (!dialogLayout.N) {
            View childAt = dialogLayout.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                r4.d dVarC = r4.d.c(iMax, iMax2, iMax3, iMax4);
                int i11 = dVarC.f48793a;
                r4.d dVar = (r4.d) o2Var.f48095b;
                int i12 = dVarC.f48794b;
                int i13 = dVarC.f48795c;
                int i14 = dVarC.f48796d;
                return new o2(11, v1.e(dVar, i11, i12, i13, i14), v1.e((r4.d) o2Var.f48096c, i11, i12, i13, i14));
            }
        }
        return o2Var;
    }
}
