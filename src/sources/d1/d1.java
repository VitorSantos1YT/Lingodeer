package d1;

import android.os.Build;
import d0.k1;
import d0.w1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v3.c f22888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f22889c;

    public /* synthetic */ d1(v3.c cVar, l1.b1 b1Var, int i11) {
        this.f22887a = i11;
        this.f22888b = cVar;
        this.f22889c = b1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f22887a) {
            case 0:
                v3.h hVar = (v3.h) obj;
                float fB = v3.h.b(hVar.f53491a);
                v3.c cVar = this.f22888b;
                this.f22889c.setValue(new v3.l((((long) cVar.n0(fB)) << 32) | (((long) cVar.n0(v3.h.a(hVar.f53491a))) & 4294967295L)));
                break;
            case 1:
                bp.r0 r0Var = new bp.r0(2, (fz.a) obj);
                d1 d1Var = new d1(this.f22888b, this.f22889c, 0);
                if (k1.a()) {
                    return k1.a() ? new d0.h1(r0Var, d1Var, Build.VERSION.SDK_INT == 28 ? w1.f22821b : w1.f22822c) : z1.o.f58481a;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            case 2:
                w2.x it = (w2.x) obj;
                kotlin.jvm.internal.m.f(it, "it");
                this.f22889c.setValue(new v3.f(this.f22888b.Q((int) (it.m() >> 32))));
                break;
            case 3:
                w2.x it2 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                float fM = (int) (it2.m() >> 32);
                v3.c cVar2 = this.f22888b;
                this.f22889c.setValue(new v3.f(cVar2.T((fM - cVar2.e0(80)) / 2)));
                break;
            case 4:
                w2.x it3 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                this.f22889c.setValue(new v3.f(this.f22888b.T(((int) (it3.m() >> 32)) * 0.6f)));
                break;
            case 5:
                w2.x it4 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                this.f22889c.setValue(new v3.f(this.f22888b.Q((int) (it4.m() >> 32))));
                break;
            case 6:
                w2.x it5 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                l1.b1 b1Var = this.f22889c;
                if (v3.f.b(((v3.f) b1Var.getValue()).f53489a, 0)) {
                    b1Var.setValue(new v3.f(this.f22888b.Q((int) (it5.m() & 4294967295L))));
                }
                return qy.b0.f48488a;
            case 7:
                w2.x it6 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                l1.b1 b1Var2 = this.f22889c;
                if (v3.f.b(((v3.f) b1Var2.getValue()).f53489a, 0)) {
                    b1Var2.setValue(new v3.f(this.f22888b.Q((int) (it6.m() & 4294967295L))));
                }
                return qy.b0.f48488a;
            case 8:
                w2.x it7 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                l1.b1 b1Var3 = this.f22889c;
                if (v3.f.b(((v3.f) b1Var3.getValue()).f53489a, 0)) {
                    b1Var3.setValue(new v3.f(this.f22888b.Q((int) (it7.m() & 4294967295L))));
                }
                return qy.b0.f48488a;
            default:
                w2.x it8 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                l1.b1 b1Var4 = this.f22889c;
                if (v3.f.b(((v3.f) b1Var4.getValue()).f53489a, 0)) {
                    b1Var4.setValue(new v3.f(this.f22888b.Q((int) (it8.m() & 4294967295L))));
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }
}
