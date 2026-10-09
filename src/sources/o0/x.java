package o0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f44460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f44461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, xy.c cVar) {
        super(cVar);
        this.f44461b = yVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f44460a = obj;
        this.f44462c |= Integer.MIN_VALUE;
        return this.f44461b.a(null, CropImageView.DEFAULT_ASPECT_RATIO, this);
    }
}
