package z2;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.lingodeer.R;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3 f58736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.e f58737c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(b3 b3Var, fz.e eVar, int i11) {
        super(2);
        this.f58735a = i11;
        this.f58736b = b3Var;
        this.f58737c = eVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58735a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AndroidCompositionLocals_androidKt.a(this.f58736b.f58510a, this.f58737c, sVar, 0);
                } else {
                    sVar.W();
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    b3 b3Var = this.f58736b;
                    AndroidComposeView androidComposeView = b3Var.f58510a;
                    Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
                    vy.d dVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof gz.a) && !(tag instanceof gz.f))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = androidComposeView.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof gz.a) && !(tag2 instanceof gz.f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(sVar2.z());
                        sVar2.f39449q = true;
                        sVar2.C = true;
                        sVar2.f39436c.d();
                        sVar2.H.d();
                        l1.p2 p2Var = sVar2.I;
                        l1.m2 m2Var = p2Var.f39396a;
                        p2Var.f39400e = m2Var.L;
                        p2Var.f39401f = m2Var.M;
                    }
                    boolean zH = sVar2.h(b3Var);
                    Object objQ = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zH || objQ == gVar) {
                        objQ = new y2(b3Var, dVar, 0);
                        sVar2.o0(objQ);
                    }
                    l1.t.f((fz.e) objQ, androidComposeView, sVar2);
                    boolean zH2 = sVar2.h(b3Var);
                    Object objQ2 = sVar2.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new y2(b3Var, dVar, 1);
                        sVar2.o0(objQ2);
                    }
                    l1.t.f((fz.e) objQ2, androidComposeView, sVar2);
                    l1.t.a(y1.f.f56817a.a(set), t1.e.d(-280240369, new z2(b3Var, this.f58737c, 0), sVar2), sVar2, 56);
                } else {
                    sVar2.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
