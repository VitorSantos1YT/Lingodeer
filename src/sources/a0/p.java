package a0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2.g1[] f158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w2.g1[] g1VarArr, q qVar, int i11, int i12) {
        super(1);
        this.f158a = g1VarArr;
        this.f159b = qVar;
        this.f160c = i11;
        this.f161d = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        w2.f1 f1Var = (w2.f1) obj;
        for (w2.g1 g1Var : this.f158a) {
            if (g1Var != null) {
                long jA = this.f159b.f168a.f235b.a((((long) g1Var.f54501a) << 32) | (((long) g1Var.f54502b) & 4294967295L), (((long) this.f160c) << 32) | (((long) this.f161d) & 4294967295L), v3.m.Ltr);
                f1Var.f(g1Var, (int) (jA >> 32), (int) (jA & 4294967295L), CropImageView.DEFAULT_ASPECT_RATIO);
            }
        }
        return qy.b0.f48488a;
    }
}
