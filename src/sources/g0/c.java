package g0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fz.c f28321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f28323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28324d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, xy.c cVar) {
        super(cVar);
        this.f28323c = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f28322b = obj;
        this.f28324d |= Integer.MIN_VALUE;
        return this.f28323c.c(null, CropImageView.DEFAULT_ASPECT_RATIO, null, this);
    }
}
