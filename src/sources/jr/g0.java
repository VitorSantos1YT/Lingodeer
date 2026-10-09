package jr;

import bp.b2;
import bp.p0;
import com.google.accompanist.permissions.PermissionState;
import java.util.List;
import kr.c1;
import l1.b1;
import l1.b3;
import mt.b6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 implements fz.c {
    public final /* synthetic */ qy.e H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ b3 M;
    public final /* synthetic */ Object N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36619a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f36620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f36621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.c f36622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f36623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f36624f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ qy.e f36625t;

    public /* synthetic */ g0(c1 c1Var, PermissionState permissionState, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4, fz.c cVar5, b1 b1Var, b1 b1Var2, b1 b1Var3, fz.a aVar) {
        this.f36623e = c1Var;
        this.f36624f = permissionState;
        this.f36622d = cVar;
        this.f36625t = cVar2;
        this.H = cVar3;
        this.K = cVar4;
        this.L = cVar5;
        this.f36621c = b1Var;
        this.M = b1Var2;
        this.N = b1Var3;
        this.f36620b = aVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f36619a) {
            case 0:
                c1 c1Var = (c1) this.f36623e;
                PermissionState permissionState = (PermissionState) this.f36624f;
                fz.c cVar = (fz.c) this.f36625t;
                fz.c cVar2 = (fz.c) this.H;
                fz.c cVar3 = (fz.c) this.K;
                fz.c cVar4 = (fz.c) this.L;
                b1 b1Var = (b1) this.M;
                b1 b1Var2 = (b1) this.N;
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                List list = c1Var.f38434a;
                LazyColumn.q(list.size(), null, new p0(11, list), new t1.d(new l0(list, c1Var, permissionState, this.f36622d, cVar, cVar2, cVar3, cVar4, this.f36621c, b1Var, b1Var2), true, 2039820996));
                l0.h.p(LazyColumn, null, new t1.d(new at.p(17, this.f36620b, c1Var), true, 2065951912), 3);
                break;
            default:
                sv.h hVar = (sv.h) this.f36623e;
                qv.e eVar = (qv.e) this.f36624f;
                fz.a aVar = (fz.a) this.f36625t;
                fz.a aVar2 = (fz.a) this.H;
                sv.j jVar = (sv.j) this.K;
                j9.v vVar = (j9.v) this.L;
                fz.e eVar2 = (fz.e) this.N;
                j9.t NavHost = (j9.t) obj;
                kotlin.jvm.internal.m.f(NavHost, "$this$NavHost");
                fz.a aVar3 = this.f36620b;
                b1 b1Var3 = this.f36621c;
                b3 b3Var = this.M;
                c.a.g(NavHost, "syllable_index", null, null, new t1.d(new ei.j(hVar, eVar, aVar3, aVar, aVar2, jVar, vVar, b1Var3, b3Var), true, -1135293054), 254);
                c.a.g(NavHost, "syllable_intro_first", new b6(14), new b6(15), new t1.d(new br.u(vVar, jVar, hVar, b1Var3), true, -201663623), 230);
                c.a.g(NavHost, "syllable_test", new b6(16), new b6(17), new t1.d(new b2((Object) hVar, vVar, (Object) this.f36622d, 12), true, -1432956166), 230);
                c.a.g(NavHost, "syllable_write_intro", null, null, new t1.d(new b2((Object) b3Var, vVar, (Object) eVar2, 13), true, 1630718587), 254);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ g0(sv.h hVar, qv.e eVar, fz.a aVar, fz.a aVar2, fz.a aVar3, sv.j jVar, j9.v vVar, b1 b1Var, b1 b1Var2, fz.c cVar, fz.e eVar2) {
        this.f36623e = hVar;
        this.f36624f = eVar;
        this.f36620b = aVar;
        this.f36625t = aVar2;
        this.H = aVar3;
        this.K = jVar;
        this.L = vVar;
        this.f36621c = b1Var;
        this.M = b1Var2;
        this.f36622d = cVar;
        this.N = eVar2;
    }
}
