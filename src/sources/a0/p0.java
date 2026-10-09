package a0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.g1 f164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z1 f165d;

    public p0(l1 l1Var, m1 m1Var, float f5, z1 z1Var) {
        this.f162a = l1Var;
        this.f163b = m1Var;
        this.f164c = new l1.g1(f5);
        this.f165d = z1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p0(l1 l1Var, m1 m1Var) {
        this(l1Var, m1Var, CropImageView.DEFAULT_ASPECT_RATIO, new z1(n.f144b));
        int i11 = o.f152b;
    }
}
