package h1;

import com.yalantis.ucrop.view.CropImageView;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a8 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29990a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f29991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f29993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f29994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(kw.h hVar, boolean z11, kotlin.jvm.internal.v vVar, kotlin.jvm.internal.v vVar2) {
        super(0);
        this.f29992c = hVar;
        this.f29991b = z11;
        this.f29993d = vVar;
        this.f29994e = vVar2;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f29990a) {
            case 0:
                return new e8(this.f29991b, (v3.c) this.f29992c, (f8) this.f29993d, (fz.c) this.f29994e);
            default:
                kw.h hVar = (kw.h) this.f29992c;
                boolean zB = hVar.b();
                rz.b0 b0Var = hVar.f38864a;
                l1.g1 g1Var = hVar.f38871h;
                vy.d dVar = null;
                boolean z11 = this.f29991b;
                if (zB != z11) {
                    hVar.f38867d.setValue(Boolean.valueOf(z11));
                    l1.g1 g1Var2 = hVar.f38869f;
                    float fL = CropImageView.DEFAULT_ASPECT_RATIO;
                    g1Var2.m(CropImageView.DEFAULT_ASPECT_RATIO);
                    if (z11) {
                        fL = g1Var.l();
                    }
                    rz.e0.B(b0Var, null, null, new f3.c(fL, 3, hVar, dVar), 3);
                }
                hVar.f38870g.m(((kotlin.jvm.internal.v) this.f29993d).f38358a);
                float f5 = ((kotlin.jvm.internal.v) this.f29994e).f38358a;
                if (g1Var.l() != f5) {
                    g1Var.m(f5);
                    if (hVar.b()) {
                        rz.e0.B(b0Var, null, null, new f3.c(f5, 3, hVar, dVar), 3);
                    }
                }
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(boolean z11, v3.c cVar, f8 f8Var, fz.c cVar2) {
        super(0);
        this.f29991b = z11;
        this.f29992c = cVar;
        this.f29993d = f8Var;
        this.f29994e = cVar2;
    }
}
