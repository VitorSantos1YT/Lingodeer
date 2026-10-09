package l2;

import a0.b2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f39576b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i11) {
        super(1);
        this.f39575a = i11;
        this.f39576b = e0Var;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [fz.a, kotlin.jvm.internal.n] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f39575a) {
            case 0:
                e0 e0Var = this.f39576b;
                e0Var.f39591d = true;
                e0Var.f39593f.invoke();
                return qy.b0.f48488a;
            default:
                i2.d dVar = (i2.d) obj;
                e0 e0Var2 = this.f39576b;
                b bVar = e0Var2.f39589b;
                float f5 = e0Var2.f39598k;
                float f11 = e0Var2.f39599l;
                xq.c cVarJ0 = dVar.j0();
                long jH = cVarJ0.H();
                cVarJ0.x().e();
                try {
                    ((b2) cVarJ0.f56174b).n(0L, f5, f11);
                    bVar.a(dVar);
                    return qy.b0.f48488a;
                } finally {
                    com.google.android.material.datepicker.d.C(cVarJ0, jH);
                }
        }
    }
}
