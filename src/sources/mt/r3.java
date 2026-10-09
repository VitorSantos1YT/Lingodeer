package mt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r3 implements fz.c {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41833a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f41838f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f41839t;

    public /* synthetic */ r3(int i11, fz.j jVar, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, l1.b1 b1Var6, l1.b1 b1Var7) {
        this.f41834b = i11;
        this.f41835c = b1Var;
        this.L = jVar;
        this.f41836d = b1Var2;
        this.f41837e = b1Var3;
        this.f41838f = b1Var4;
        this.f41839t = b1Var5;
        this.H = b1Var6;
        this.K = b1Var7;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        l0.h hVar;
        boolean z11;
        String str;
        int i11;
        pr.a0 a0Var;
        int i12;
        l0.h hVar2;
        switch (this.f41833a) {
            case 0:
                fz.j jVar = (fz.j) this.L;
                l1.b1 b1Var = (l1.b1) this.f41838f;
                l1.b1 b1Var2 = (l1.b1) this.f41839t;
                l1.b1 b1Var3 = (l1.b1) this.H;
                l1.b1 b1Var4 = (l1.b1) this.K;
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == this.f41834b) {
                    iIntValue = -1;
                }
                int i13 = iIntValue;
                Integer numValueOf = Integer.valueOf(i13);
                l1.b1 b1Var5 = this.f41835c;
                b1Var5.setValue(numValueOf);
                g.D(jVar, this.f41836d, this.f41837e, b1Var, b1Var5, b1Var2, b1Var3, b1Var4, 0, 0, 0, i13, 0, false, 30464);
                break;
            default:
                List list = (List) this.f41838f;
                List list2 = (List) this.f41839t;
                List list3 = (List) this.H;
                rz.b0 b0Var = (rz.b0) this.K;
                ur.a aVar = (ur.a) this.L;
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                b0.a aVar2 = new b0.a(this.f41835c, this.f41836d, b0Var, aVar, 26);
                pr.a0 a0Var2 = new pr.a0(this.f41837e, b0Var, aVar);
                long jE = g2.f0.e(4284212882L);
                long jE2 = g2.f0.e(4284263423L);
                long jE3 = g2.f0.e(4294938254L);
                long jE4 = g2.f0.e(4282170722L);
                long jE5 = g2.f0.e(4278219767L);
                long jE6 = g2.f0.e(4294929776L);
                long jE7 = g2.f0.e(4278239310L);
                long jE8 = g2.f0.e(4285690482L);
                long jE9 = g2.f0.e(4294464601L);
                int size = list.size();
                qu.m mVar = new qu.m(0, list);
                int i14 = this.f41834b;
                LazyColumn.q(size, null, mVar, new t1.d(new qu.n(list, list, jE7, jE4, jE, i14, aVar2, a0Var2, 0), true, 2039820996));
                l0.h.p(LazyColumn, null, new t1.d(new dt.r0(jE7, 2), true, 1461696042), 3);
                if (list2.isEmpty()) {
                    hVar = LazyColumn;
                    z11 = true;
                    str = null;
                    i11 = 2039820996;
                    a0Var = a0Var2;
                    i12 = i14;
                } else {
                    a0Var = a0Var2;
                    i12 = i14;
                    i11 = 2039820996;
                    z11 = true;
                    hVar = LazyColumn;
                    str = null;
                    hVar.q(list2.size(), null, new qu.m(1, list2), new t1.d(new qu.n(list2, list2, jE8, jE5, jE2, i12, aVar2, a0Var, 1), true, 2039820996));
                }
                if (r26.isEmpty()) {
                    hVar2 = hVar;
                } else {
                    l0.h.p(hVar, str, new t1.d(new dt.r0(jE9, 3), z11, -924939908), 3);
                    int size2 = r26.size();
                    qu.m mVar2 = new qu.m(2, list3);
                    t1.d dVar = new t1.d(new qu.n(list3, list3, jE9, jE6, jE3, i12, aVar2, a0Var, 2), z11, i11);
                    hVar2 = hVar;
                    str = null;
                    hVar2.q(size2, null, mVar2, dVar);
                }
                l0.h.p(hVar2, str, qu.b.f48342b, 3);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ r3(List list, List list2, List list3, int i11, l1.b1 b1Var, l1.b1 b1Var2, rz.b0 b0Var, ur.a aVar, l1.b1 b1Var3) {
        this.f41838f = list;
        this.f41839t = list2;
        this.H = list3;
        this.f41834b = i11;
        this.f41835c = b1Var;
        this.f41836d = b1Var2;
        this.K = b0Var;
        this.L = aVar;
        this.f41837e = b1Var3;
    }
}
