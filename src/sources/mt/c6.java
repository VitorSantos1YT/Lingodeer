package mt;

import rt.y8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c6 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41322d;

    public /* synthetic */ c6(Object obj, Object obj2, Object obj3, int i11) {
        this.f41319a = i11;
        this.f41320b = obj;
        this.f41321c = obj2;
        this.f41322d = obj3;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f41319a) {
            case 0:
                rt.k6 content = (rt.k6) obj;
                kotlin.jvm.internal.m.f(content, "content");
                if (((y8) this.f41320b).f50699i) {
                    ((fz.c) this.f41321c).invoke(content);
                } else {
                    ((fz.a) this.f41322d).invoke();
                }
                break;
            case 1:
                String it = (String) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ((l1.b1) this.f41322d).setValue(new qy.l(null, new v3.j(0L)));
                ((fz.e) this.f41320b).invoke(it, Integer.valueOf(((vs.g) this.f41321c).f54161b));
                break;
            case 2:
                String it2 = (String) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                ((l1.b1) this.f41322d).setValue(new qy.l(null, new v3.j(0L)));
                ((fz.e) this.f41320b).invoke(it2, Integer.valueOf(((vs.i) this.f41321c).f54165b));
                break;
            case 3:
                String it3 = (String) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                ((l1.b1) this.f41322d).setValue(new qy.l(null, new v3.j(0L)));
                ((fz.e) this.f41320b).invoke(it3, Integer.valueOf(((vs.l) this.f41321c).f54172b));
                break;
            default:
                String it4 = (String) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                ((l1.b1) this.f41322d).setValue(new qy.l(null, new v3.j(0L)));
                ((fz.e) this.f41320b).invoke(it4, Integer.valueOf(((vs.f) this.f41321c).f54159b));
                break;
        }
        return qy.b0.f48488a;
    }
}
