package a0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f145c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146a;

    static {
        int i11 = 2;
        f144b = new n(i11, 0);
        f145c = new n(i11, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i11, int i12) {
        super(i11);
        this.f146a = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f146a) {
            case 0:
                long j11 = ((v3.l) obj).f53498a;
                long j12 = ((v3.l) obj2).f53498a;
                long j13 = 1;
                return b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new v3.l((j13 & 4294967295L) | (j13 << 32)), 1);
            default:
                v0 v0Var = (v0) obj2;
                return Boolean.valueOf(((v0) obj) == v0Var && v0Var == v0.PostExit);
        }
    }
}
