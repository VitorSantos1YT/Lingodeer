package km;

import com.lingodeer.course.smarttips.data.model.Hint;
import rt.jd;
import ys.e3;
import ys.l3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f38294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38295d;

    public /* synthetic */ v0(long j11, fz.a aVar, jd jdVar, int i11) {
        this.f38292a = 5;
        this.f38294c = j11;
        this.f38295d = aVar;
        this.f38293b = jdVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38292a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                b1.h((i) this.f38295d, this.f38294c, (z1.r) this.f38293b, (l1.n) obj, iM);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                s0.d.a((d1.l) this.f38295d, (z1.r) this.f38293b, this.f38294c, (l1.n) obj, iM2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM3 = l1.t.M(385);
                us.b.h((Hint) this.f38295d, this.f38294c, (fz.a) this.f38293b, (l1.n) obj, iM3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iM4 = l1.t.M(1);
                ys.a.f((String) this.f38295d, this.f38294c, (fz.a) this.f38293b, (l1.n) obj, iM4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iM5 = l1.t.M(1);
                ys.y0.a((l3) this.f38295d, (z1.r) this.f38293b, this.f38294c, (l1.n) obj, iM5);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM6 = l1.t.M(49);
                e3.a(this.f38294c, (fz.a) this.f38295d, (jd) this.f38293b, (l1.n) obj, iM6);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ v0(Object obj, long j11, Object obj2, int i11, int i12) {
        this.f38292a = i12;
        this.f38295d = obj;
        this.f38294c = j11;
        this.f38293b = obj2;
    }

    public /* synthetic */ v0(Object obj, z1.r rVar, long j11, int i11, int i12) {
        this.f38292a = i12;
        this.f38295d = obj;
        this.f38293b = rVar;
        this.f38294c = j11;
    }
}
