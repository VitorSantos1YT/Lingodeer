package br;

import com.lingodeer.data.model.ShareStreakType;
import gp.l1;
import j0.t0;
import java.util.Map;
import l1.b1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5071f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ qy.e f5072t;

    public /* synthetic */ n(int i11, int i12, l1 l1Var, fz.e eVar, fz.a aVar, t1.d dVar, t1.d dVar2, int i13) {
        this.f5066a = 0;
        this.f5067b = i11;
        this.f5069d = i12;
        this.f5070e = l1Var;
        this.f5068c = eVar;
        this.f5071f = aVar;
        this.f5072t = dVar;
        this.H = dVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5066a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(14155783);
                q.a(this.f5067b, this.f5069d, (l1) this.f5070e, (fz.e) this.f5068c, (fz.a) this.f5071f, (t1.d) this.f5072t, (t1.d) this.H, (l1.n) obj, iM);
                break;
            case 1:
                ((Integer) obj2).getClass();
                fu.a.t((b1) this.f5070e, this.f5067b, (ShareStreakType) this.f5071f, (fz.f) this.f5072t, (fz.e) this.f5068c, (fz.c) this.H, (l1.n) obj, l1.t.M(this.f5069d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                gs.a.w((bs.f) this.f5070e, (String) this.f5068c, (fz.a) this.f5071f, (fz.a) this.f5072t, (fz.c) this.H, this.f5067b, (l1.n) obj, l1.t.M(this.f5069d | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                iv.o.k((fz.a) this.f5071f, (fz.a) this.f5070e, (fz.c) this.f5068c, (fz.c) this.f5072t, (z1.r) this.H, (l1.n) obj, l1.t.M(this.f5067b | 1), this.f5069d);
                break;
            case 4:
                ((Integer) obj2).getClass();
                j0.c.b((z1.r) this.f5070e, (j0.f) this.f5068c, (j0.h) this.f5071f, this.f5067b, (t0) this.H, (t1.d) this.f5072t, (l1.n) obj, l1.t.M(this.f5069d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                tg.h0.a((tg.i0) this.f5070e, (j3.h) this.f5068c, (z1.r) this.f5071f, (fz.c) this.f5072t, (Map) this.H, (l1.n) obj, l1.t.M(this.f5067b | 1), this.f5069d);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ n(fz.a aVar, fz.a aVar2, fz.c cVar, fz.c cVar2, z1.r rVar, int i11, int i12) {
        this.f5066a = 3;
        this.f5071f = aVar;
        this.f5070e = aVar2;
        this.f5068c = cVar;
        this.f5072t = cVar2;
        this.H = rVar;
        this.f5067b = i11;
        this.f5069d = i12;
    }

    public /* synthetic */ n(Object obj, CharSequence charSequence, Object obj2, qy.e eVar, Object obj3, int i11, int i12, int i13) {
        this.f5066a = i13;
        this.f5070e = obj;
        this.f5068c = charSequence;
        this.f5071f = obj2;
        this.f5072t = eVar;
        this.H = obj3;
        this.f5067b = i11;
        this.f5069d = i12;
    }

    public /* synthetic */ n(b1 b1Var, int i11, ShareStreakType shareStreakType, fz.f fVar, fz.e eVar, fz.c cVar, int i12) {
        this.f5066a = 1;
        this.f5070e = b1Var;
        this.f5067b = i11;
        this.f5071f = shareStreakType;
        this.f5072t = fVar;
        this.f5068c = eVar;
        this.H = cVar;
        this.f5069d = i12;
    }

    public /* synthetic */ n(z1.r rVar, j0.f fVar, j0.h hVar, int i11, t0 t0Var, t1.d dVar, int i12) {
        this.f5066a = 4;
        this.f5070e = rVar;
        this.f5068c = fVar;
        this.f5071f = hVar;
        this.f5067b = i11;
        this.H = t0Var;
        this.f5072t = dVar;
        this.f5069d = i12;
    }
}
