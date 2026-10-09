package a0;

import com.yalantis.ucrop.view.CropImageView;
import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f206c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j11, b3 b3Var) {
        super(1);
        this.f204a = 2;
        this.f206c = j11;
        this.f205b = b3Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        long j11;
        b0.c0 c0Var;
        long j12;
        switch (this.f204a) {
            case 0:
                b0.w1 w1Var = (b0.w1) obj;
                Object objA = w1Var.a();
                w wVar = (w) this.f205b;
                if (kotlin.jvm.internal.m.a(objA, wVar.T.a())) {
                    j11 = v3.l.a(wVar.U, o.f151a) ? this.f206c : wVar.U;
                } else {
                    b3 b3Var = (b3) wVar.T.f237d.g(w1Var.a());
                    j11 = b3Var != null ? ((v3.l) b3Var.getValue()).f53498a : 0L;
                }
                b3 b3Var2 = (b3) wVar.T.f237d.g(w1Var.c());
                long j13 = b3Var2 != null ? ((v3.l) b3Var2.getValue()).f53498a : 0L;
                z1 z1Var = (z1) wVar.S.getValue();
                return (z1Var == null || (c0Var = (b0.c0) z1Var.f245a.invoke(new v3.l(j11), new v3.l(j13))) == null) ? b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5) : c0Var;
            case 1:
                w wVar2 = (w) this.f205b;
                if (kotlin.jvm.internal.m.a(obj, wVar2.T.a())) {
                    j12 = v3.l.a(wVar2.U, o.f151a) ? this.f206c : wVar2.U;
                } else {
                    b3 b3Var3 = (b3) wVar2.T.f237d.g(obj);
                    j12 = b3Var3 != null ? ((v3.l) b3Var3.getValue()).f53498a : 0L;
                }
                return new v3.l(j12);
            default:
                i2.d.U((i2.d) obj, this.f206c, 0L, 0L, hz.b.k(((Number) ((b3) this.f205b).getValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), 118);
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(w wVar, long j11, int i11) {
        super(1);
        this.f204a = i11;
        this.f205b = wVar;
        this.f206c = j11;
    }
}
