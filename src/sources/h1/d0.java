package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f30120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0.i1 f30121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.v f30122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f30123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30124e;

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f30123d = obj;
        this.f30124e |= Integer.MIN_VALUE;
        return e0.e(null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, this);
    }
}
