package dt;

import com.lingodeer.data.model.CourseUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24049f;

    public /* synthetic */ o(int i11, String str, String str2, boolean z11, z1.r rVar, int i12) {
        this.f24044a = 3;
        this.f24047d = i11;
        this.f24048e = str;
        this.f24046c = str2;
        this.f24045b = z11;
        this.f24049f = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24044a) {
            case 0:
                ((Integer) obj2).getClass();
                a0.t((ht.l) this.f24048e, this.f24045b, (fz.a) this.f24046c, (fz.a) this.f24049f, (l1.n) obj, l1.t.M(this.f24047d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                et.a.e((et.o) this.f24048e, this.f24045b, (fz.c) this.f24049f, (fz.a) this.f24046c, (l1.n) obj, l1.t.M(this.f24047d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                us.b.j((vs.c) this.f24048e, this.f24045b, (fz.a) this.f24046c, (fz.e) this.f24049f, (l1.n) obj, l1.t.M(this.f24047d | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                xu.a1.i(this.f24047d, (String) this.f24048e, (String) this.f24046c, this.f24045b, (z1.r) this.f24049f, (l1.n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                ys.a3.g((CourseUnit) this.f24048e, this.f24045b, (fz.c) this.f24046c, (z1.r) this.f24049f, (l1.n) obj, l1.t.M(this.f24047d | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ o(et.o oVar, boolean z11, fz.c cVar, fz.a aVar, int i11) {
        this.f24044a = 1;
        this.f24048e = oVar;
        this.f24045b = z11;
        this.f24049f = cVar;
        this.f24046c = aVar;
        this.f24047d = i11;
    }

    public /* synthetic */ o(Object obj, boolean z11, qy.e eVar, Object obj2, int i11, int i12) {
        this.f24044a = i12;
        this.f24048e = obj;
        this.f24045b = z11;
        this.f24046c = eVar;
        this.f24049f = obj2;
        this.f24047d = i11;
    }
}
