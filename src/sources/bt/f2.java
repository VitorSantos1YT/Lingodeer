package bt;

import com.lingodeer.data.model.CourseWord;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f2 implements fz.c {
    public final /* synthetic */ qy.e H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5384f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5385t;

    public /* synthetic */ f2(List list, ArrayList arrayList, List list2, fz.c cVar, boolean z11, fz.c cVar2, fz.c cVar3, fz.c cVar4) {
        this.f5379a = 2;
        this.f5380b = list;
        this.f5382d = arrayList;
        this.f5383e = list2;
        this.f5384f = cVar;
        this.f5381c = z11;
        this.f5385t = cVar2;
        this.H = cVar3;
        this.K = cVar4;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f5379a) {
            case 0:
                l1.b1 b1Var = (l1.b1) this.f5380b;
                l1.b1 b1Var2 = (l1.b1) this.f5382d;
                rz.b0 b0Var = (rz.b0) this.f5383e;
                ht.o oVar = (ht.o) this.f5384f;
                l1.i1 i1Var = (l1.i1) this.f5385t;
                fz.e eVar = (fz.e) this.H;
                jt.m1 m1Var = (jt.m1) this.K;
                CourseWord option = (CourseWord) obj;
                kotlin.jvm.internal.m.f(option, "option");
                if (!(b1Var.getValue() instanceof ht.c) && !(b1Var.getValue() instanceof ht.i) && !(b1Var.getValue() instanceof ht.j) && this.f5381c) {
                    Objects.toString(option.getAudioUri());
                    if (((Boolean) b1Var2.getValue()).booleanValue()) {
                        d3.e(oVar, i1Var, eVar, ns.o.K(option.getAudioUri().toString()), new ht.e(ry.r.f50854a, 0, 1.0f));
                    }
                }
                rz.e0.B(b0Var, null, null, new c3(m1Var, option, null, 0), 3);
                break;
            case 1:
                l1.b1 b1Var3 = (l1.b1) this.f5380b;
                l1.b1 b1Var4 = (l1.b1) this.f5382d;
                rz.b0 b0Var2 = (rz.b0) this.f5383e;
                ht.o oVar2 = (ht.o) this.f5384f;
                l1.i1 i1Var2 = (l1.i1) this.f5385t;
                fz.e eVar2 = (fz.e) this.H;
                jt.m1 m1Var2 = (jt.m1) this.K;
                CourseWord option2 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(option2, "option");
                if (!(b1Var3.getValue() instanceof ht.c) && !(b1Var3.getValue() instanceof ht.i) && this.f5381c) {
                    Objects.toString(option2.getAudioUri());
                    if (((Boolean) b1Var4.getValue()).booleanValue()) {
                        b.c0(oVar2, i1Var2, eVar2, b7.e0.l(option2, "toString(...)"), new ht.e(ry.r.f50854a, 0, 1.0f));
                    }
                }
                rz.e0.B(b0Var2, null, null, new c3(m1Var2, option2, null, 2), 3);
                break;
            default:
                List list = (List) this.f5380b;
                ArrayList arrayList = (ArrayList) this.f5382d;
                List list2 = (List) this.f5383e;
                fz.c cVar = (fz.c) this.f5384f;
                fz.c cVar2 = (fz.c) this.f5385t;
                fz.c cVar3 = (fz.c) this.H;
                fz.c cVar4 = (fz.c) this.K;
                m0.j LazyVerticalGrid = (m0.j) obj;
                kotlin.jvm.internal.m.f(LazyVerticalGrid, "$this$LazyVerticalGrid");
                LazyVerticalGrid.q(list.size(), null, null, new bp.p0(27, list), new t1.d(new pr.e(3, cVar, list), true, -1117249557));
                if (!arrayList.isEmpty()) {
                    m0.j.p(LazyVerticalGrid, new ot.f2(5), new t1.d(new dt.n2(this.f5381c, cVar2, arrayList, 5), true, 710680862), 5);
                    List listU0 = ry.m.U0(arrayList, 9);
                    LazyVerticalGrid.q(listU0.size(), null, null, new bp.p0(28, listU0), new t1.d(new pr.e(1, cVar3, listU0), true, -1117249557));
                }
                if (!list2.isEmpty()) {
                    m0.j.p(LazyVerticalGrid, new ot.f2(6), pr.f0.f47037g, 5);
                    LazyVerticalGrid.q(list2.size(), null, null, new bp.p0(26, list2), new t1.d(new pr.e(2, cVar4, list2), true, -1117249557));
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ f2(l1.b1 b1Var, boolean z11, l1.b1 b1Var2, rz.b0 b0Var, ht.o oVar, l1.i1 i1Var, fz.e eVar, jt.m1 m1Var, int i11) {
        this.f5379a = i11;
        this.f5380b = b1Var;
        this.f5381c = z11;
        this.f5382d = b1Var2;
        this.f5383e = b0Var;
        this.f5384f = oVar;
        this.f5385t = i1Var;
        this.H = eVar;
        this.K = m1Var;
    }
}
