package g0;

import b0.n;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f28348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f28349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f28350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f28351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f28352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28353f;

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f28352e = obj;
        this.f28353f |= Integer.MIN_VALUE;
        return k.b(null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, this);
    }
}
