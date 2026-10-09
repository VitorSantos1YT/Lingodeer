package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l8 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p8 f30609b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8(p8 p8Var, int i11) {
        super(1);
        this.f30608a = i11;
        this.f30609b = p8Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11;
        switch (this.f30608a) {
            case 0:
                this.f30609b.f30861j.m((int) (((v3.l) obj).f53498a >> 32));
                return qy.b0.f48488a;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                p8 p8Var = this.f30609b;
                l1.g1 g1Var = p8Var.f30855d;
                lz.d dVar = p8Var.f30854c;
                float f5 = dVar.f40530a;
                float f11 = dVar.f40531b;
                float fK = hz.b.k(fFloatValue, f5, f11);
                int i12 = p8Var.f30852a;
                boolean z11 = false;
                if (i12 > 0 && (i11 = i12 + 1) >= 0) {
                    float fAbs = fK;
                    float f12 = fAbs;
                    int i13 = 0;
                    while (true) {
                        float fA = android.support.v4.media.session.a.A(dVar.f40530a, f11, i13 / i11);
                        float f13 = fA - fK;
                        if (Math.abs(f13) <= fAbs) {
                            fAbs = Math.abs(f13);
                            f12 = fA;
                        }
                        if (i13 != i11) {
                            i13++;
                        } else {
                            fK = f12;
                        }
                    }
                }
                if (fK != g1Var.l()) {
                    if (fK != g1Var.l()) {
                        fz.c cVar = p8Var.f30856e;
                        if (cVar != null) {
                            cVar.invoke(Float.valueOf(fK));
                        } else {
                            p8Var.c(fK);
                        }
                    }
                    fz.a aVar = p8Var.f30853b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            default:
                long j11 = ((f2.b) obj).f26570a;
                p8 p8Var2 = this.f30609b;
                p8Var2.b(CropImageView.DEFAULT_ASPECT_RATIO);
                p8Var2.f30863l.invoke();
                return qy.b0.f48488a;
        }
    }
}
