package z2;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface p2 {
    long a();

    long b();

    default float c() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    default float d() {
        return 2.0f;
    }

    default long e() {
        float f5 = 48;
        return ef.e.a(f5, f5);
    }

    default float f() {
        return Float.MAX_VALUE;
    }

    float g();

    default float h() {
        return 16.0f;
    }
}
