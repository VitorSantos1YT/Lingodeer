package dt;

import com.lingodeer.data.model.CourseCharacter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23875a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qy.e f23879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qy.e f23880f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f23881t;

    public /* synthetic */ i1(CourseCharacter courseCharacter, boolean z11, boolean z12, fz.a aVar, fz.a aVar2, z1.r rVar, int i11) {
        this.f23878d = courseCharacter;
        this.f23876b = z11;
        this.f23877c = z12;
        this.f23879e = aVar;
        this.f23880f = aVar2;
        this.f23881t = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23875a) {
            case 0:
                d dVar = (d) this.f23878d;
                fz.f fVar = (fz.f) this.f23879e;
                t1.d dVar2 = (t1.d) this.f23880f;
                fz.e eVar = (fz.e) this.f23881t;
                w2.q1 SubcomposeLayout = (w2.q1) obj;
                v3.a aVar = (v3.a) obj2;
                kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                List listC = SubcomposeLayout.C("left", new t1.d(new h1(dVar, this.f23876b, fVar), true, 1774154818));
                ArrayList arrayList = new ArrayList(ry.n.W(listC, 10));
                Iterator it = listC.iterator();
                while (it.hasNext()) {
                    arrayList.add(((w2.p0) it.next()).B(aVar.f53483a));
                }
                w2.g1 g1Var = (w2.g1) ry.m.q0(arrayList);
                int iE0 = (int) SubcomposeLayout.e0(c.f23670a);
                boolean z11 = this.f23877c;
                List<w2.p0> listC2 = SubcomposeLayout.C("right", new t1.d(new d1(z11, dVar2), true, 1337042945));
                ArrayList arrayList2 = new ArrayList(ry.n.W(listC2, 10));
                for (w2.p0 p0Var : listC2) {
                    long j11 = aVar.f53483a;
                    arrayList2.add(p0Var.B(v3.a.a(0, v3.a.h(j11) - g1Var.f54501a, 0, 0, 13, j11)));
                }
                w2.g1 g1Var2 = (w2.g1) ry.m.q0(arrayList2);
                List<w2.p0> listC3 = SubcomposeLayout.C("translation", new t1.d(new e1(0, eVar), true, 1303347682));
                ArrayList arrayList3 = new ArrayList(ry.n.W(listC3, 10));
                for (w2.p0 p0Var2 : listC3) {
                    long j12 = aVar.f53483a;
                    arrayList3.add(p0Var2.B(v3.a.a(0, v3.a.h(j12) - g1Var.f54501a, 0, 0, 13, j12)));
                }
                w2.g1 g1Var3 = (w2.g1) ry.m.s0(arrayList3);
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                wVar.f38359a = iE0;
                float f5 = g1Var2.f54502b;
                float f11 = c.f23671b;
                if (f5 <= SubcomposeLayout.e0(f11)) {
                    wVar.f38359a = (int) (((SubcomposeLayout.e0(f11) - g1Var2.f54502b) / 2) + iE0);
                }
                return SubcomposeLayout.q0(v3.a.h(aVar.f53483a), Math.max(g1Var.f54502b, wVar.f38359a + g1Var2.f54502b + (g1Var3 != null ? g1Var3.f54502b : 0)), ry.s.f50855a, new bt.o1(g1Var, g1Var2, wVar, g1Var3, z11));
            default:
                ((Integer) obj2).getClass();
                vr.g.a((CourseCharacter) this.f23878d, this.f23876b, this.f23877c, (fz.a) this.f23879e, (fz.a) this.f23880f, (z1.r) this.f23881t, (l1.n) obj, l1.t.M(196609));
                return qy.b0.f48488a;
        }
    }

    public /* synthetic */ i1(d dVar, boolean z11, fz.f fVar, boolean z12, t1.d dVar2, fz.e eVar) {
        this.f23878d = dVar;
        this.f23876b = z11;
        this.f23879e = fVar;
        this.f23877c = z12;
        this.f23880f = dVar2;
        this.f23881t = eVar;
    }
}
