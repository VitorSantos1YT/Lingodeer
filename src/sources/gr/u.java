package gr;

import bp.z1;
import com.lingo.splash.SplashIndexActivity;
import iv.b1;
import iv.f0;
import kv.g0;
import kv.i0;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j9.v f29749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29750c;

    public /* synthetic */ u(f0 f0Var, j9.v vVar) {
        this.f29748a = 2;
        this.f29750c = f0Var;
        this.f29749b = vVar;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11 = this.f29748a;
        b0 b0Var = b0.f48488a;
        l1.g gVar = l1.m.f39353a;
        j9.v vVar = this.f29749b;
        Object obj5 = this.f29750c;
        int i12 = 0;
        switch (i11) {
            case 0:
                SplashIndexActivity splashIndexActivity = (SplashIndexActivity) obj5;
                a0.r composable = (a0.r) obj;
                j9.e it = (j9.e) obj2;
                ((Integer) obj4).getClass();
                int i13 = SplashIndexActivity.M;
                kotlin.jvm.internal.m.f(composable, "$this$composable");
                kotlin.jvm.internal.m.f(it, "it");
                l1.s sVar = (l1.s) ((l1.n) obj3);
                boolean zH = sVar.h(vVar);
                Object objQ = sVar.Q();
                if (zH || objQ == gVar) {
                    objQ = new z1(vVar, 21);
                    sVar.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                boolean zH2 = sVar.h(splashIndexActivity);
                Object objQ2 = sVar.Q();
                if (zH2 || objQ2 == gVar) {
                    objQ2 = new s(splashIndexActivity, 0);
                    sVar.o0(objQ2);
                }
                fz.c cVar = (fz.c) objQ2;
                boolean zH3 = sVar.h(splashIndexActivity);
                Object objQ3 = sVar.Q();
                if (zH3 || objQ3 == gVar) {
                    objQ3 = new t(splashIndexActivity, i12);
                    sVar.o0(objQ3);
                }
                fz.a aVar2 = (fz.a) objQ3;
                boolean zH4 = sVar.h(splashIndexActivity);
                Object objQ4 = sVar.Q();
                if (zH4 || objQ4 == gVar) {
                    objQ4 = new t(splashIndexActivity, 1);
                    sVar.o0(objQ4);
                }
                fz.a aVar3 = (fz.a) objQ4;
                boolean zH5 = sVar.h(splashIndexActivity);
                Object objQ5 = sVar.Q();
                if (zH5 || objQ5 == gVar) {
                    objQ5 = new ch.b0(splashIndexActivity, 9);
                    sVar.o0(objQ5);
                }
                n.i(aVar, cVar, aVar2, aVar3, (fz.e) objQ5, null, null, sVar, 0);
                break;
            case 1:
                fz.a aVar4 = (fz.a) obj5;
                ep.a.A((Integer) obj4, (a0.r) obj, "$this$composable", (j9.e) obj2, "it");
                l1.s sVar2 = (l1.s) ((l1.n) obj3);
                boolean zH6 = sVar2.h(vVar);
                Object objQ6 = sVar2.Q();
                if (zH6 || objQ6 == gVar) {
                    objQ6 = new z1(vVar, 24);
                    sVar2.o0(objQ6);
                }
                b1.c((fz.a) objQ6, aVar4, null, sVar2, 0);
                break;
            default:
                a0.r composable2 = (a0.r) obj;
                j9.e it2 = (j9.e) obj2;
                l1.n nVar = (l1.n) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.m.f(composable2, "$this$composable");
                kotlin.jvm.internal.m.f(it2, "it");
                g0 g0Var = ((f0) obj5).f34724e;
                if (g0Var != null) {
                    l1.s sVar3 = (l1.s) nVar;
                    sVar3.d0(-1139060223);
                    i0 i0Var = g0Var.f38743a;
                    boolean zH7 = sVar3.h(vVar);
                    Object objQ7 = sVar3.Q();
                    if (zH7 || objQ7 == gVar) {
                        objQ7 = new z1(vVar, 26);
                        sVar3.o0(objQ7);
                    }
                    fz.a aVar5 = (fz.a) objQ7;
                    boolean zH8 = sVar3.h(vVar);
                    Object objQ8 = sVar3.Q();
                    if (zH8 || objQ8 == gVar) {
                        objQ8 = new z1(vVar, 27);
                        sVar3.o0(objQ8);
                    }
                    iv.a.g(i0Var, aVar5, (fz.a) objQ8, null, sVar3, 0);
                    sVar3.p(false);
                } else {
                    l1.s sVar4 = (l1.s) nVar;
                    sVar4.d0(-1139060224);
                    sVar4.p(false);
                }
                break;
        }
        return b0Var;
    }

    public /* synthetic */ u(j9.v vVar, Object obj, int i11) {
        this.f29748a = i11;
        this.f29749b = vVar;
        this.f29750c = obj;
    }
}
