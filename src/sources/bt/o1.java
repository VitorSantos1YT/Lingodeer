package bt;

import com.lingodeer.data.model.CourseWord;
import java.util.List;
import rt.ae;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5786f;

    public /* synthetic */ o1(kotlin.jvm.internal.u uVar, kotlin.jvm.internal.u uVar2, m9.g gVar, boolean z11, ry.k kVar) {
        this.f5781a = 3;
        this.f5783c = uVar;
        this.f5784d = uVar2;
        this.f5785e = gVar;
        this.f5782b = z11;
        this.f5786f = kVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int density;
        switch (this.f5781a) {
            case 0:
                l1.b1 b1Var = (l1.b1) this.f5783c;
                fz.e eVar = (fz.e) this.f5784d;
                rz.b0 b0Var = (rz.b0) this.f5785e;
                jt.h0 h0Var = (jt.h0) this.f5786f;
                CourseWord option = (CourseWord) obj;
                kotlin.jvm.internal.m.f(option, "option");
                if (this.f5782b && !(b1Var.getValue() instanceof ht.c) && !(b1Var.getValue() instanceof ht.i)) {
                    eVar.invoke(ns.o.K(option.getAudioUri().toString()), new ht.e(option.getVisemedMap()));
                }
                rz.e0.B(b0Var, null, null, new t1(h0Var, option, null, 1), 3);
                break;
            case 1:
                l1.b1 b1Var2 = (l1.b1) this.f5783c;
                fz.e eVar2 = (fz.e) this.f5784d;
                rz.b0 b0Var2 = (rz.b0) this.f5785e;
                jt.q1 q1Var = (jt.q1) this.f5786f;
                CourseWord it = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it, "it");
                if (this.f5782b && !(b1Var2.getValue() instanceof ht.f) && !(b1Var2.getValue() instanceof ht.b)) {
                    eVar2.invoke(b7.e0.l(it, "toString(...)"), new ht.e(it.getVisemedMap()));
                }
                rz.e0.B(b0Var2, null, null, new b6(q1Var, it, null, 2), 3);
                break;
            case 2:
                w2.g1 g1Var = (w2.g1) this.f5783c;
                w2.g1 g1Var2 = (w2.g1) this.f5784d;
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f5785e;
                w2.g1 g1Var3 = (w2.g1) this.f5786f;
                w2.f1 layout = (w2.f1) obj;
                kotlin.jvm.internal.m.f(layout, "$this$layout");
                w2.f1.k(layout, g1Var, 0, 0);
                int density2 = (int) (layout.getDensity() * dt.c.f23672c);
                w2.f1.k(layout, g1Var2, g1Var.f54501a + density2, wVar.f38359a);
                if (g1Var3 != null) {
                    if (this.f5782b) {
                        density = ((g1Var2.f54501a - g1Var3.f54501a) / 2) + g1Var.f54501a + density2;
                    } else {
                        density = g1Var.f54501a + density2 + ((int) (layout.getDensity() * dt.c.f23673d));
                    }
                    w2.f1.k(layout, g1Var3, density, wVar.f38359a + g1Var2.f54502b);
                }
                return qy.b0.f48488a;
            case 3:
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f5783c;
                kotlin.jvm.internal.u uVar2 = (kotlin.jvm.internal.u) this.f5784d;
                m9.g gVar = (m9.g) this.f5785e;
                ry.k kVar = (ry.k) this.f5786f;
                j9.e entry = (j9.e) obj;
                kotlin.jvm.internal.m.f(entry, "entry");
                uVar.f38357a = true;
                uVar2.f38357a = true;
                gVar.o(entry, this.f5782b, kVar);
                break;
            default:
                ae aeVar = (ae) this.f5783c;
                fz.a aVar = (fz.a) this.f5784d;
                fz.c cVar = (fz.c) this.f5785e;
                fz.c cVar2 = (fz.c) this.f5786f;
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                l0.h.p(LazyColumn, null, mt.g.M0, 3);
                boolean z11 = this.f5782b;
                l0.h.p(LazyColumn, null, new t1.d(new dt.n2(aeVar, aVar, z11, 4), true, -1172622126), 3);
                List list = aeVar.f49467b;
                LazyColumn.q(list.size(), new av.r(14, new mt.b6(4), list), new bp.p0(23, list), new t1.d(new mt.o6(list, z11, cVar, cVar2), true, 802480018));
                l0.h.p(LazyColumn, null, mt.g.N0, 3);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ o1(ae aeVar, fz.a aVar, boolean z11, fz.c cVar, fz.c cVar2) {
        this.f5781a = 4;
        this.f5783c = aeVar;
        this.f5784d = aVar;
        this.f5782b = z11;
        this.f5785e = cVar;
        this.f5786f = cVar2;
    }

    public /* synthetic */ o1(w2.g1 g1Var, w2.g1 g1Var2, kotlin.jvm.internal.w wVar, w2.g1 g1Var3, boolean z11) {
        this.f5781a = 2;
        this.f5783c = g1Var;
        this.f5784d = g1Var2;
        this.f5785e = wVar;
        this.f5786f = g1Var3;
        this.f5782b = z11;
    }

    public /* synthetic */ o1(boolean z11, l1.b1 b1Var, fz.e eVar, rz.b0 b0Var, Object obj, int i11) {
        this.f5781a = i11;
        this.f5782b = z11;
        this.f5783c = b1Var;
        this.f5784d = eVar;
        this.f5785e = b0Var;
        this.f5786f = obj;
    }
}
