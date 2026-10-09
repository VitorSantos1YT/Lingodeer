package xu;

import android.content.Context;
import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f56571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f56572d;

    public /* synthetic */ y1(Object obj, Object obj2, Object obj3, int i11) {
        this.f56569a = i11;
        this.f56570b = obj;
        this.f56571c = obj2;
        this.f56572d = obj3;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f56569a) {
            case 0:
                fz.a aVar = (fz.a) this.f56570b;
                fz.c cVar = (fz.c) this.f56571c;
                l1.a1 a1Var = (l1.a1) this.f56572d;
                aVar.invoke();
                cVar.invoke(Integer.valueOf(((l1.h1) a1Var).l()));
                break;
            case 1:
                fz.a aVar2 = (fz.a) this.f56570b;
                l1.b1 b1Var = (l1.b1) this.f56571c;
                b3 b3Var = (b3) this.f56572d;
                fz.c cVar2 = (fz.c) b1Var.getValue();
                if (!((Boolean) b3Var.getValue()).booleanValue() || cVar2 == null) {
                    aVar2.invoke();
                } else {
                    cVar2.invoke(Boolean.TRUE);
                }
                return qy.b0.f48488a;
            default:
                rz.e0.B((rz.b0) this.f56570b, null, null, new cj.b((Context) this.f56571c, (String) this.f56572d, (vy.d) null), 3);
                break;
        }
        return qy.b0.f48488a;
    }
}
