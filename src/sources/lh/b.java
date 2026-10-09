package lh;

import com.lingodeer.data.model.AchievementLevel;
import fz.c;
import fz.e;
import l1.n;
import l1.t;
import mh.i;
import mt.l5;
import pr.f0;
import qy.b0;
import rt.w4;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40153a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f40155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f40156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f40157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40158f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f40159t;

    public /* synthetic */ b(int i11, boolean z11, AchievementLevel achievementLevel, AchievementLevel achievementLevel2, fz.a aVar, fz.a aVar2, int i12) {
        this.f40154b = i11;
        this.f40155c = z11;
        this.f40159t = achievementLevel;
        this.f40157e = achievementLevel2;
        this.f40156d = aVar;
        this.H = aVar2;
        this.f40158f = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40153a) {
            case 0:
                ((Integer) obj2).getClass();
                ew.a.d((i) this.f40159t, (fz.a) this.f40156d, (fz.a) this.H, (r) this.f40157e, this.f40155c, (n) obj, t.M(this.f40154b | 1), this.f40158f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                l5.c((w4) this.f40159t, this.f40154b, this.f40155c, (c) this.H, (fz.a) this.f40156d, (r) this.f40157e, (n) obj, t.M(this.f40158f | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                f0.v(this.f40154b, this.f40155c, (AchievementLevel) this.f40159t, (AchievementLevel) this.f40157e, (fz.a) this.f40156d, (fz.a) this.H, (n) obj, t.M(this.f40158f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                qu.b.g((String) this.f40159t, (String) this.f40156d, (qu.c) this.H, this.f40155c, this.f40154b, (r) this.f40157e, (n) obj, t.M(this.f40158f | 1));
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ b(String str, String str2, qu.c cVar, boolean z11, int i11, r rVar, int i12) {
        this.f40159t = str;
        this.f40156d = str2;
        this.H = cVar;
        this.f40155c = z11;
        this.f40154b = i11;
        this.f40157e = rVar;
        this.f40158f = i12;
    }

    public /* synthetic */ b(i iVar, fz.a aVar, fz.a aVar2, r rVar, boolean z11, int i11, int i12) {
        this.f40159t = iVar;
        this.f40156d = aVar;
        this.H = aVar2;
        this.f40157e = rVar;
        this.f40155c = z11;
        this.f40154b = i11;
        this.f40158f = i12;
    }

    public /* synthetic */ b(w4 w4Var, int i11, boolean z11, c cVar, fz.a aVar, r rVar, int i12) {
        this.f40159t = w4Var;
        this.f40154b = i11;
        this.f40155c = z11;
        this.H = cVar;
        this.f40156d = aVar;
        this.f40157e = rVar;
        this.f40158f = i12;
    }
}
