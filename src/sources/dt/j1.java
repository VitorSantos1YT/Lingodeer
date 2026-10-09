package dt;

import bt.g7;
import com.lingo.lingoskill.object.PdLesson;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j1 implements fz.e {
    public final /* synthetic */ qy.e H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23906a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23911f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f23912t;

    public /* synthetic */ j1(PdLesson pdLesson, fz.a aVar, fz.c cVar, fz.c cVar2, boolean z11, ph.s sVar, int i11, int i12) {
        this.f23910e = pdLesson;
        this.f23911f = aVar;
        this.f23912t = cVar;
        this.H = cVar2;
        this.f23907b = z11;
        this.K = sVar;
        this.f23908c = i11;
        this.f23909d = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23906a) {
            case 0:
                ((Integer) obj2).getClass();
                e.q((d) this.f23910e, (z1.r) this.f23911f, this.f23907b, (fz.f) this.f23912t, (fz.e) this.H, (t1.d) this.K, (l1.n) obj, l1.t.M(this.f23908c | 1), this.f23909d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                kt.l.b((String) this.f23910e, (String) this.f23911f, (String) this.f23912t, (fz.a) this.H, (fz.a) this.K, this.f23907b, (l1.n) obj, l1.t.M(this.f23908c | 1), this.f23909d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                nh.i.b((PdLesson) this.f23910e, (fz.a) this.f23911f, (fz.c) this.f23912t, (fz.c) this.H, this.f23907b, (ph.s) this.K, (l1.n) obj, l1.t.M(this.f23908c | 1), this.f23909d);
                break;
            case 3:
                ((Integer) obj2).getClass();
                nv.a.b((String) this.f23910e, (String) this.f23911f, this.f23907b, (fz.a) this.f23912t, (t1.d) this.K, (fz.e) this.H, (l1.n) obj, l1.t.M(this.f23908c | 1), this.f23909d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                s0.o0.e((j3.h) this.f23910e, (z1.r) this.f23911f, (j3.y0) this.f23912t, this.f23907b, this.f23908c, this.f23909d, (fz.c) this.H, (g7) this.K, (l1.n) obj, iM);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ j1(d dVar, z1.r rVar, boolean z11, fz.f fVar, fz.e eVar, t1.d dVar2, int i11, int i12) {
        this.f23910e = dVar;
        this.f23911f = rVar;
        this.f23907b = z11;
        this.f23912t = fVar;
        this.H = eVar;
        this.K = dVar2;
        this.f23908c = i11;
        this.f23909d = i12;
    }

    public /* synthetic */ j1(j3.h hVar, z1.r rVar, j3.y0 y0Var, boolean z11, int i11, int i12, fz.c cVar, g7 g7Var, int i13) {
        this.f23910e = hVar;
        this.f23911f = rVar;
        this.f23912t = y0Var;
        this.f23907b = z11;
        this.f23908c = i11;
        this.f23909d = i12;
        this.H = cVar;
        this.K = g7Var;
    }

    public /* synthetic */ j1(String str, String str2, String str3, fz.a aVar, fz.a aVar2, boolean z11, int i11, int i12) {
        this.f23910e = str;
        this.f23911f = str2;
        this.f23912t = str3;
        this.H = aVar;
        this.K = aVar2;
        this.f23907b = z11;
        this.f23908c = i11;
        this.f23909d = i12;
    }

    public /* synthetic */ j1(String str, String str2, boolean z11, fz.a aVar, t1.d dVar, fz.e eVar, int i11, int i12) {
        this.f23910e = str;
        this.f23911f = str2;
        this.f23907b = z11;
        this.f23912t = aVar;
        this.K = dVar;
        this.H = eVar;
        this.f23908c = i11;
        this.f23909d = i12;
    }
}
