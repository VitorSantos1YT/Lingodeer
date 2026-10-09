package g0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f28329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, xy.c cVar) {
        super(cVar);
        this.f28329b = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f28328a = obj;
        this.f28330c |= Integer.MIN_VALUE;
        return this.f28329b.d(null, CropImageView.DEFAULT_ASPECT_RATIO, null, this);
    }
}
