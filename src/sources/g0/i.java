package g0;

import b0.n;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f28343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f28344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f28345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f28346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28347e;

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f28346d = obj;
        this.f28347e |= Integer.MIN_VALUE;
        return k.a(null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, this);
    }
}
