package jt;

import android.content.res.Resources;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36884a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f36886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f36887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f36888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f36889f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f36890t;

    public /* synthetic */ b(int i11, boolean z11, fz.a aVar, fz.a aVar2, fz.a aVar3, fz.a aVar4, z1.r rVar, int i12) {
        this.f36885b = i11;
        this.f36886c = z11;
        this.f36887d = aVar;
        this.f36888e = aVar2;
        this.f36889f = aVar3;
        this.f36890t = aVar4;
        this.H = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36884a) {
            case 0:
                ((Integer) obj2).getClass();
                hz.b.c((x1.p) this.f36887d, (l1.b1) this.f36888e, (HashMap) this.f36889f, (i2) this.f36890t, (fz.c) this.H, this.f36886c, (l1.n) obj, l1.t.M(this.f36885b | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(3457);
                mt.b1.i(this.f36885b, this.f36886c, (fz.a) this.f36887d, (fz.a) this.f36888e, (fz.a) this.f36889f, (fz.a) this.f36890t, (z1.r) this.H, (l1.n) obj, iM);
                break;
            case 2:
                ((Integer) obj2).getClass();
                uu.a.a((String) this.f36887d, this.f36886c, (e2.l) this.f36888e, (Resources) this.f36889f, (e2.v) this.f36890t, (fz.c) this.H, (l1.n) obj, l1.t.M(this.f36885b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                xu.h1.b((LeaderBoardUser) this.f36887d, this.f36886c, (fz.c) this.H, (fz.c) this.f36888e, (fz.c) this.f36889f, (fz.c) this.f36890t, (l1.n) obj, l1.t.M(this.f36885b | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ b(LeaderBoardUser leaderBoardUser, boolean z11, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4, int i11) {
        this.f36887d = leaderBoardUser;
        this.f36886c = z11;
        this.H = cVar;
        this.f36888e = cVar2;
        this.f36889f = cVar3;
        this.f36890t = cVar4;
        this.f36885b = i11;
    }

    public /* synthetic */ b(String str, boolean z11, e2.l lVar, Resources resources, e2.v vVar, fz.c cVar, int i11) {
        this.f36887d = str;
        this.f36886c = z11;
        this.f36888e = lVar;
        this.f36889f = resources;
        this.f36890t = vVar;
        this.H = cVar;
        this.f36885b = i11;
    }

    public /* synthetic */ b(x1.p pVar, l1.b1 b1Var, HashMap map, i2 i2Var, fz.c cVar, boolean z11, int i11) {
        this.f36887d = pVar;
        this.f36888e = b1Var;
        this.f36889f = map;
        this.f36890t = i2Var;
        this.H = cVar;
        this.f36886c = z11;
        this.f36885b = i11;
    }
}
