package z4;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends f1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f58805e = new PathInterpolator(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r6.a f58806f = new r6.a(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f58807g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f58808h = new AccelerateInterpolator(1.5f);

    public static void f(View view, g1 g1Var) {
        androidx.datastore.preferences.protobuf.l lVarK = k(view);
        if (lVarK != null) {
            lVarK.d(g1Var);
            if (lVarK.f1509a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                f(viewGroup.getChildAt(i11), g1Var);
            }
        }
    }

    public static void g(View view, g1 g1Var, v1 v1Var, boolean z11) {
        androidx.datastore.preferences.protobuf.l lVarK = k(view);
        if (lVarK != null) {
            lVarK.f1510b = v1Var;
            if (!z11) {
                lVarK.f(g1Var);
                z11 = lVarK.f1509a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                g(viewGroup.getChildAt(i11), g1Var, v1Var, z11);
            }
        }
    }

    public static void h(View view, v1 v1Var, List list) {
        androidx.datastore.preferences.protobuf.l lVarK = k(view);
        if (lVarK != null) {
            v1Var = lVarK.g(v1Var, list);
            if (lVarK.f1509a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                h(viewGroup.getChildAt(i11), v1Var, list);
            }
        }
    }

    public static void i(View view, g1 g1Var, o2 o2Var) {
        androidx.datastore.preferences.protobuf.l lVarK = k(view);
        if (lVarK != null) {
            lVarK.h(g1Var, o2Var);
            if (lVarK.f1509a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                i(viewGroup.getChildAt(i11), g1Var, o2Var);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static androidx.datastore.preferences.protobuf.l k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof z0) {
            return ((z0) tag).f58922a;
        }
        return null;
    }
}
