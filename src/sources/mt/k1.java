package mt;

import rt.me;
import rt.oe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rt.a2 f41590b;

    public /* synthetic */ k1(rt.a2 a2Var, int i11) {
        this.f41589a = i11;
        this.f41590b = a2Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f41589a) {
            case 0:
                oe item = (oe) obj;
                kotlin.jvm.internal.m.f(item, "item");
                this.f41590b.j(item.f50220a);
                break;
            case 1:
                me it = (me) obj;
                kotlin.jvm.internal.m.f(it, "it");
                rt.a2 a2Var = this.f41590b;
                uz.i1 i1Var = a2Var.f49422e;
                if (i1Var.getValue() != it) {
                    i1Var.l(null, it);
                    a2Var.d();
                }
                return qy.b0.f48488a;
            default:
                String it2 = (String) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                this.f41590b.m(it2);
                break;
        }
        return qy.b0.f48488a;
    }
}
