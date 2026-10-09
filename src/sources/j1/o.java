package j1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f35506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f35507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f35508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f35509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35510e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, xy.c cVar) {
        super(cVar);
        this.f35509d = pVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f35508c = obj;
        this.f35510e |= Integer.MIN_VALUE;
        return this.f35509d.a1(CropImageView.DEFAULT_ASPECT_RATIO, this);
    }
}
