package g0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f28332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28333c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, xy.c cVar) {
        super(cVar);
        this.f28332b = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f28331a = obj;
        this.f28333c |= Integer.MIN_VALUE;
        return g.b(this.f28332b, null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, this);
    }
}
