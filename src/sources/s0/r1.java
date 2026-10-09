package s0;

import androidx.compose.ui.window.PopupLayout;
import java.util.ArrayList;
import java.util.List;
import qp.n2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f51158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f51159c;

    public /* synthetic */ r1(int i11, Object obj, Object obj2) {
        this.f51157a = i11;
        this.f51158b = obj;
        this.f51159c = obj2;
    }

    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        ArrayList arrayList;
        qy.l lVar;
        switch (this.f51157a) {
            case 0:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj = list.get(i11);
                    if (!(((w2.p0) obj).G() instanceof s1)) {
                        arrayList2.add(obj);
                    }
                }
                List list2 = (List) ((fz.a) this.f51159c).invoke();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        f2.c cVar = (f2.c) list2.get(i12);
                        if (cVar != null) {
                            float f5 = cVar.f26573b;
                            float f11 = cVar.f26572a;
                            w2.g1 g1VarB = ((w2.p0) arrayList2.get(i12)).B(v3.b.b((int) Math.floor(cVar.f26574c - f11), (int) Math.floor(cVar.f26575d - f5), 5));
                            int iRound = Math.round(f11);
                            lVar = new qy.l(g1VarB, new v3.j((((long) Math.round(f5)) & 4294967295L) | (((long) iRound) << 32)));
                        } else {
                            lVar = null;
                        }
                        if (lVar != null) {
                            arrayList3.add(lVar);
                        }
                        i12++;
                        arrayList2 = arrayList2;
                        list2 = list2;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    Object obj2 = list.get(i13);
                    if (((w2.p0) obj2).G() instanceof s1) {
                        arrayList4.add(obj2);
                    }
                }
                return s0Var.q0(v3.a.h(j11), v3.a.g(j11), ry.s.f50855a, new n2(17, arrayList, o0.n(arrayList4, (fz.a) this.f51158b)));
            default:
                ((PopupLayout) this.f51158b).setParentLayoutDirection((v3.m) this.f51159c);
                return s0Var.q0(0, 0, ry.s.f50855a, z3.c.f58744d);
        }
    }
}
