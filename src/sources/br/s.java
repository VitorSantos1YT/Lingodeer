package br;

import com.lingo.main.ui.MainComposeActivity;
import l1.b1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5084a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j9.v f5085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainComposeActivity f5086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f5087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f5088e;

    public /* synthetic */ s(MainComposeActivity mainComposeActivity, b1 b1Var, j9.v vVar, b1 b1Var2) {
        this.f5086c = mainComposeActivity;
        this.f5087d = b1Var;
        this.f5085b = vVar;
        this.f5088e = b1Var2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f5084a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                j9.t NavHost = (j9.t) obj;
                int i12 = MainComposeActivity.U;
                kotlin.jvm.internal.m.f(NavHost, "$this$NavHost");
                final int i13 = 0;
                final MainComposeActivity mainComposeActivity = this.f5086c;
                fz.g gVar = new fz.g() { // from class: br.t
                    @Override // fz.g
                    public final Object f(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i14 = i13;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        MainComposeActivity mainComposeActivity2 = mainComposeActivity;
                        a0.r composable = (a0.r) obj2;
                        j9.e it = (j9.e) obj3;
                        l1.n nVar = (l1.n) obj4;
                        ((Integer) obj5).intValue();
                        int i15 = MainComposeActivity.U;
                        kotlin.jvm.internal.m.f(composable, "$this$composable");
                        kotlin.jvm.internal.m.f(it, "it");
                        switch (i14) {
                            case 0:
                                q.b(mainComposeActivity2, nVar, 0);
                                break;
                            case 1:
                                e.h(mainComposeActivity2, nVar, 0);
                                break;
                            default:
                                e.f(mainComposeActivity2, nVar, 0);
                                break;
                        }
                        return b0Var2;
                    }
                };
                final int i14 = 1;
                c.a.g(NavHost, "learn", null, null, new t1.d(gVar, true, -1517997987), 254);
                c.a.g(NavHost, "review", null, null, new t1.d(new fz.g() { // from class: br.t
                    @Override // fz.g
                    public final Object f(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i15 = i14;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        MainComposeActivity mainComposeActivity2 = mainComposeActivity;
                        a0.r composable = (a0.r) obj2;
                        j9.e it = (j9.e) obj3;
                        l1.n nVar = (l1.n) obj4;
                        ((Integer) obj5).intValue();
                        int i16 = MainComposeActivity.U;
                        kotlin.jvm.internal.m.f(composable, "$this$composable");
                        kotlin.jvm.internal.m.f(it, "it");
                        switch (i15) {
                            case 0:
                                q.b(mainComposeActivity2, nVar, 0);
                                break;
                            case 1:
                                e.h(mainComposeActivity2, nVar, 0);
                                break;
                            default:
                                e.f(mainComposeActivity2, nVar, 0);
                                break;
                        }
                        return b0Var2;
                    }
                }, true, -303284346), 254);
                c.a.g(NavHost, "premium", null, null, new t1.d(new u((Object) mainComposeActivity, (Object) this.f5087d, this.f5085b, (Object) this.f5088e, 0), true, 428891109), 254);
                final int i15 = 2;
                c.a.g(NavHost, "me", null, null, new t1.d(new fz.g() { // from class: br.t
                    @Override // fz.g
                    public final Object f(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i16 = i15;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        MainComposeActivity mainComposeActivity2 = mainComposeActivity;
                        a0.r composable = (a0.r) obj2;
                        j9.e it = (j9.e) obj3;
                        l1.n nVar = (l1.n) obj4;
                        ((Integer) obj5).intValue();
                        int i17 = MainComposeActivity.U;
                        kotlin.jvm.internal.m.f(composable, "$this$composable");
                        kotlin.jvm.internal.m.f(it, "it");
                        switch (i16) {
                            case 0:
                                q.b(mainComposeActivity2, nVar, 0);
                                break;
                            case 1:
                                e.h(mainComposeActivity2, nVar, 0);
                                break;
                            default:
                                e.f(mainComposeActivity2, nVar, 0);
                                break;
                        }
                        return b0Var2;
                    }
                }, true, 1161066564), 254);
                break;
            default:
                String route = (String) obj;
                int i16 = MainComposeActivity.U;
                kotlin.jvm.internal.m.f(route, "route");
                MainComposeActivity.p(this.f5085b, this.f5086c, this.f5087d, this.f5088e, route);
                break;
        }
        return b0Var;
    }

    public /* synthetic */ s(j9.v vVar, MainComposeActivity mainComposeActivity, b1 b1Var, b1 b1Var2) {
        this.f5085b = vVar;
        this.f5086c = mainComposeActivity;
        this.f5087d = b1Var;
        this.f5088e = b1Var2;
    }
}
