package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements vy.h, v2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h2.d f39298b = new h2.d(18);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g f39299c = new g(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f39300d = new g(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f39301e = new g(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f39302f = new g(4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f39303t = new g(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39304a;

    public /* synthetic */ g(int i11) {
        this.f39304a = i11;
    }

    public static final void b(g gVar) {
        uz.i1 i1Var;
        o1.e eVar;
        r1.b bVar;
        uz.i1 i1Var2 = d2.A;
        do {
            i1Var = d2.A;
            eVar = (o1.e) i1Var.getValue();
            bVar = (r1.b) eVar;
            q1.c cVarB = bVar.f48740c;
            r1.a aVar = (r1.a) cVarB.get(gVar);
            if (aVar != null) {
                Object obj = aVar.f48735a;
                Object obj2 = aVar.f48736b;
                q1.l lVar = cVarB.f47361a;
                q1.l lVarV = lVar.v(gVar != null ? gVar.hashCode() : 0, 0, gVar);
                if (lVar != lVarV) {
                    cVarB = lVarV == null ? q1.c.f47360c : new q1.c(lVarV, cVarB.f47362b - 1);
                }
                s1.b bVar2 = s1.b.f51280a;
                if (obj != bVar2) {
                    Object obj3 = cVarB.get(obj);
                    kotlin.jvm.internal.m.c(obj3);
                    cVarB = cVarB.b(obj, new r1.a(((r1.a) obj3).f48735a, obj2));
                }
                if (obj2 != bVar2) {
                    Object obj4 = cVarB.get(obj2);
                    kotlin.jvm.internal.m.c(obj4);
                    cVarB = cVarB.b(obj2, new r1.a(obj, ((r1.a) obj4).f48736b));
                }
                Object obj5 = obj != bVar2 ? bVar.f48738a : obj2;
                if (obj2 != bVar2) {
                    obj = bVar.f48739b;
                }
                bVar = new r1.b(obj5, obj, cVarB);
            }
            if (eVar == bVar) {
                return;
            }
        } while (!i1Var.j(eVar, bVar));
    }

    @Override // l1.v2
    public boolean a(Object obj, Object obj2) {
        switch (this.f39304a) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return kotlin.jvm.internal.m.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f39304a) {
            case 2:
                return "NeverEqualPolicy";
            case 3:
                return "ReferentialEqualityPolicy";
            case 4:
            case 6:
            default:
                return super.toString();
            case 5:
                return "StructuralEqualityPolicy";
            case 7:
                return "Empty";
        }
    }
}
