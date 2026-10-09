package q6;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f47475c = new b(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f47476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f47477b;

    public b(float f5, float f11) {
        this.f47476a = f5;
        this.f47477b = f11;
    }

    public /* synthetic */ b(int i11) {
        this((i11 & 1) != 0 ? 0.0f : 1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
    }
}
