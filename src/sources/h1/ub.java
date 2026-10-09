package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ub extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f31168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31171d;

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f31170c = obj;
        this.f31171d |= Integer.MIN_VALUE;
        return wb.p(null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, 0L, this);
    }
}
