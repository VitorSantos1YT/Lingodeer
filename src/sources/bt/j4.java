package bt;

import com.lingodeer.data.model.CourseWord;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j4 implements fz.c {
    public final /* synthetic */ qy.e H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5577f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f5578t;

    public /* synthetic */ j4(rz.b0 b0Var, jt.s0 s0Var, boolean z11, l1.b1 b1Var, ht.o oVar, boolean z12, fz.e eVar, int i11) {
        this.f5572a = i11;
        this.f5573b = b0Var;
        this.f5574c = s0Var;
        this.f5575d = z11;
        this.f5576e = b1Var;
        this.f5577f = oVar;
        this.f5578t = z12;
        this.H = eVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f5572a) {
            case 0:
                rz.b0 b0Var = (rz.b0) this.f5573b;
                jt.s0 s0Var = (jt.s0) this.f5574c;
                l1.b1 b1Var = (l1.b1) this.f5576e;
                ht.o oVar = (ht.o) this.f5577f;
                fz.e eVar = (fz.e) this.H;
                CourseWord option = (CourseWord) obj;
                kotlin.jvm.internal.m.f(option, "option");
                rz.e0.B(b0Var, null, null, new a5(s0Var, option, this.f5575d, b1Var, oVar, this.f5578t, eVar, null), 3);
                break;
            case 1:
                rz.b0 b0Var2 = (rz.b0) this.f5573b;
                jt.s0 s0Var2 = (jt.s0) this.f5574c;
                l1.b1 b1Var2 = (l1.b1) this.f5576e;
                ht.o oVar2 = (ht.o) this.f5577f;
                fz.e eVar2 = (fz.e) this.H;
                CourseWord option2 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(option2, "option");
                rz.e0.B(b0Var2, null, null, new a5(s0Var2, option2, this.f5575d, b1Var2, oVar2, this.f5578t, eVar2, null), 3);
                break;
            default:
                List list = (List) this.f5573b;
                fz.a aVar = (fz.a) this.f5574c;
                String str = (String) this.f5576e;
                fz.a aVar2 = (fz.a) this.f5577f;
                fz.c cVar = (fz.c) this.H;
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                if (this.f5575d) {
                    l0.h.p(LazyColumn, null, new t1.d(new bp.u(13, aVar), true, 555168327), 3);
                }
                LazyColumn.q(list.size(), null, new bp.p0(8, list), new t1.d(new iv.c0(list, str, this.f5578t, aVar2, cVar), true, 802480018));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ j4(boolean z11, List list, fz.a aVar, String str, boolean z12, fz.a aVar2, fz.c cVar) {
        this.f5572a = 2;
        this.f5575d = z11;
        this.f5573b = list;
        this.f5574c = aVar;
        this.f5576e = str;
        this.f5578t = z12;
        this.f5577f = aVar2;
        this.H = cVar;
    }
}
