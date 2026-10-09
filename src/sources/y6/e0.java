package y6;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f57184d = new e0(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f57186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57187c;

    static {
        b7.f0.G(0);
        b7.f0.G(1);
    }

    public e0(float f5, float f11) {
        b7.a.d(f5 > CropImageView.DEFAULT_ASPECT_RATIO);
        b7.a.d(f11 > CropImageView.DEFAULT_ASPECT_RATIO);
        this.f57185a = f5;
        this.f57186b = f11;
        this.f57187c = Math.round(f5 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class == obj.getClass()) {
            e0 e0Var = (e0) obj;
            if (this.f57185a == e0Var.f57185a && this.f57186b == e0Var.f57186b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f57186b) + ((Float.floatToRawIntBits(this.f57185a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f57185a), Float.valueOf(this.f57186b)};
        String str = b7.f0.f3975a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
