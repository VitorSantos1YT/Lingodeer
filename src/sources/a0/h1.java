package a0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f96a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f97b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f98c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f99d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(w2.g1 g1Var, long j11, long j12, j jVar) {
        super(1);
        this.f96a = g1Var;
        this.f97b = j11;
        this.f98c = j12;
        this.f99d = jVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        w2.f1 f1Var = (w2.f1) obj;
        long j11 = this.f97b;
        long j12 = this.f98c;
        f1Var.getClass();
        w2.g1 g1Var = this.f96a;
        w2.f1.a(f1Var, g1Var);
        g1Var.i0(v3.j.e((((long) (((int) (j11 >> 32)) + ((int) (j12 >> 32)))) << 32) | (((long) (((int) (j11 & 4294967295L)) + ((int) (j12 & 4294967295L)))) & 4294967295L), g1Var.f54505e), CropImageView.DEFAULT_ASPECT_RATIO, this.f99d);
        return qy.b0.f48488a;
    }
}
