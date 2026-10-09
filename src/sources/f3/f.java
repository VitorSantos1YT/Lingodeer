package f3;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f26609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, xy.c cVar) {
        super(cVar);
        this.f26609b = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f26608a = obj;
        this.f26610c |= Integer.MIN_VALUE;
        return this.f26609b.b(CropImageView.DEFAULT_ASPECT_RATIO, this);
    }
}
