package bp;

import rt.y8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m2 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f4709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f4710c;

    public /* synthetic */ m2(fz.a aVar, fz.e eVar, int i11) {
        this.f4708a = 0;
        this.f4710c = aVar;
        this.f4709b = eVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4708a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                g1.m(this.f4710c, this.f4709b, (l1.n) obj, iM);
                break;
            case 1:
                y8 courseReviewUnit = (y8) obj;
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                kotlin.jvm.internal.m.f(courseReviewUnit, "courseReviewUnit");
                if (courseReviewUnit.f50699i) {
                    this.f4709b.invoke(courseReviewUnit, bool);
                } else {
                    this.f4710c.invoke();
                }
                return qy.b0.f48488a;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                Boolean bool3 = (Boolean) obj2;
                bool3.booleanValue();
                this.f4709b.invoke(bool2, bool3);
                this.f4710c.invoke();
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ m2(fz.e eVar, fz.a aVar, int i11) {
        this.f4708a = i11;
        this.f4709b = eVar;
        this.f4710c = aVar;
    }
}
