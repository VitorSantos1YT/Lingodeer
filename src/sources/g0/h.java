package g0;

import bp.e1;
import bp.p0;
import com.yalantis.ucrop.view.CropImageView;
import f0.n1;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.v;
import l1.b1;
import l1.k1;
import mt.d5;
import qy.b0;
import rt.b5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f28339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f28342e;

    public /* synthetic */ h(float f5, v vVar, n1 n1Var, fz.c cVar, int i11) {
        this.f28338a = i11;
        this.f28339b = f5;
        this.f28340c = vVar;
        this.f28341d = n1Var;
        this.f28342e = cVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        float fA;
        switch (this.f28338a) {
            case 0:
                v vVar = (v) this.f28340c;
                n1 n1Var = (n1) this.f28341d;
                b0.l lVar = (b0.l) obj;
                k1 k1Var = lVar.f3591e;
                float fAbs = Math.abs(((Number) k1Var.getValue()).floatValue());
                float f5 = this.f28339b;
                float fAbs2 = Math.abs(f5);
                fz.c cVar = this.f28342e;
                if (fAbs >= fAbs2) {
                    float fD = k.d(((Number) k1Var.getValue()).floatValue(), f5);
                    k.c(lVar, n1Var, cVar, fD - vVar.f38358a);
                    lVar.a();
                    vVar.f38358a = fD;
                } else {
                    k.c(lVar, n1Var, cVar, ((Number) k1Var.getValue()).floatValue() - vVar.f38358a);
                    vVar.f38358a = ((Number) k1Var.getValue()).floatValue();
                }
                return b0.f48488a;
            case 1:
                v vVar2 = (v) this.f28340c;
                n1 n1Var2 = (n1) this.f28341d;
                b0.l lVar2 = (b0.l) obj;
                float fD2 = k.d(((Number) lVar2.f3591e.getValue()).floatValue(), this.f28339b);
                float f11 = fD2 - vVar2.f38358a;
                try {
                    fA = n1Var2.a(f11);
                } catch (CancellationException unused) {
                    lVar2.a();
                    fA = CropImageView.DEFAULT_ASPECT_RATIO;
                }
                this.f28342e.invoke(Float.valueOf(fA));
                if (Math.abs(f11 - fA) > 0.5f || fD2 != ((Number) lVar2.f3591e.getValue()).floatValue()) {
                    lVar2.a();
                }
                vVar2.f38358a += fA;
                break;
            default:
                b5 b5Var = (b5) this.f28340c;
                b1 b1Var = (b1) this.f28341d;
                l0.h LazyColumn = (l0.h) obj;
                m.f(LazyColumn, "$this$LazyColumn");
                l0.h.p(LazyColumn, null, mt.j.f41559b, 3);
                List list = b5Var.f49510c;
                LazyColumn.q(list.size(), null, new p0(20, list), new t1.d(new e1(list, b5Var, this.f28342e, b1Var, 4), true, 2039820996));
                l0.h.p(LazyColumn, null, new t1.d(new d5(0, this.f28339b), true, 73732688), 3);
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ h(b5 b5Var, fz.c cVar, b1 b1Var, float f5) {
        this.f28338a = 2;
        this.f28340c = b5Var;
        this.f28342e = cVar;
        this.f28341d = b1Var;
        this.f28339b = f5;
    }
}
