package u3;

import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import com.yalantis.ucrop.view.CropImageView;
import dl.ExOZ.xItStCyvVEZ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f52740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f52741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f52742d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f52743a;

    static {
        a(CropImageView.DEFAULT_ASPECT_RATIO);
        a(0.5f);
        f52740b = 0.5f;
        a(-1.0f);
        f52741c = -1.0f;
        a(1.0f);
        f52742d = 1.0f;
    }

    public static void a(float f5) {
        if ((CropImageView.DEFAULT_ASPECT_RATIO > f5 || f5 > 1.0f) && f5 != -1.0f) {
            p3.a.c(IMCc.XAbgCLmJ);
        }
    }

    public static String b(float f5) {
        if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f5 == f52740b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f5 == f52741c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f5 == f52742d) {
            return xItStCyvVEZ.ZVKnJefEb;
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f5 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f52743a, ((f) obj).f52743a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f52743a);
    }

    public final String toString() {
        return b(this.f52743a);
    }
}
