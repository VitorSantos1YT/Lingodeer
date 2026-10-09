package wt;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f55272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f55273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(o0 o0Var, vy.d dVar) {
        super(dVar);
        this.f55273c = o0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f55272b = obj;
        this.f55274d |= Integer.MIN_VALUE;
        return this.f55273c.a(null, 0, CropImageView.DEFAULT_ASPECT_RATIO, this);
    }
}
