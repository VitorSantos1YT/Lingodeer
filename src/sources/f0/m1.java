package f0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.v f26365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26367c;

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f26366b = obj;
        this.f26367c |= Integer.MIN_VALUE;
        return t2.a(null, CropImageView.DEFAULT_ASPECT_RATIO, null, this);
    }
}
