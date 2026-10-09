package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class MarginPageTransformer implements ViewPager2.PageTransformer {
    private final int mMarginPx;

    public MarginPageTransformer(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Margin must be non-negative");
        }
        this.mMarginPx = i11;
    }

    private ViewPager2 requireViewPager(View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float f5) {
        ViewPager2 viewPager2RequireViewPager = requireViewPager(view);
        float f11 = this.mMarginPx * f5;
        if (viewPager2RequireViewPager.getOrientation() != 0) {
            view.setTranslationY(f11);
            return;
        }
        if (viewPager2RequireViewPager.isRtl()) {
            f11 = -f11;
        }
        view.setTranslationX(f11);
    }
}
