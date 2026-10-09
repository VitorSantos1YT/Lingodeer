package androidx.fragment.app;

import android.view.View;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 {
    public static q2 a(View view) {
        kotlin.jvm.internal.m.f(view, "<this>");
        return (view.getAlpha() == CropImageView.DEFAULT_ASPECT_RATIO && view.getVisibility() == 0) ? q2.INVISIBLE : b(view.getVisibility());
    }

    public static q2 b(int i11) {
        if (i11 == 0) {
            return q2.VISIBLE;
        }
        if (i11 == 4) {
            return q2.INVISIBLE;
        }
        if (i11 == 8) {
            return q2.GONE;
        }
        throw new IllegalArgumentException(nv.p.j(i11, "Unknown visibility "));
    }
}
