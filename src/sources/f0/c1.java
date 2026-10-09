package f0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i2 f26218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.v f26219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f26220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f26221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f26222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26223f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(g1 g1Var, xy.c cVar) {
        super(cVar);
        this.f26222e = g1Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f26221d = obj;
        this.f26223f |= Integer.MIN_VALUE;
        return g1.a(this.f26222e, null, null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, this);
    }
}
