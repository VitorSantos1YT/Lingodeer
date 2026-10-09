package ia;

import android.view.View;
import android.view.ViewGroup;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SlidingPaneLayout f34287a;

    public d(SlidingPaneLayout slidingPaneLayout) {
        this.f34287a = slidingPaneLayout;
    }

    @Override // com.bumptech.glide.d
    public final void A(int i11, int i12) {
        if (O()) {
            SlidingPaneLayout slidingPaneLayout = this.f34287a;
            slidingPaneLayout.Q.c(slidingPaneLayout.f2698f, i12);
        }
    }

    @Override // com.bumptech.glide.d
    public final void B(int i11) {
        if (O()) {
            SlidingPaneLayout slidingPaneLayout = this.f34287a;
            slidingPaneLayout.Q.c(slidingPaneLayout.f2698f, i11);
        }
    }

    @Override // com.bumptech.glide.d
    public final void C(View view, int i11) {
        SlidingPaneLayout slidingPaneLayout = this.f34287a;
        int childCount = slidingPaneLayout.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = slidingPaneLayout.getChildAt(i12);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Override // com.bumptech.glide.d
    public final void D(int i11) {
        SlidingPaneLayout slidingPaneLayout = this.f34287a;
        CopyOnWriteArrayList copyOnWriteArrayList = slidingPaneLayout.P;
        if (slidingPaneLayout.Q.f39748a == 0) {
            if (slidingPaneLayout.f2699t != 1.0f) {
                Iterator it = copyOnWriteArrayList.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                slidingPaneLayout.sendAccessibilityEvent(32);
                slidingPaneLayout.R = true;
                return;
            }
            slidingPaneLayout.f(slidingPaneLayout.f2698f);
            Iterator it2 = copyOnWriteArrayList.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            slidingPaneLayout.sendAccessibilityEvent(32);
            slidingPaneLayout.R = false;
        }
    }

    @Override // com.bumptech.glide.d
    public final void E(View view, int i11, int i12) {
        SlidingPaneLayout slidingPaneLayout = this.f34287a;
        if (slidingPaneLayout.f2698f == null) {
            slidingPaneLayout.f2699t = CropImageView.DEFAULT_ASPECT_RATIO;
        } else {
            boolean zB = slidingPaneLayout.b();
            e eVar = (e) slidingPaneLayout.f2698f.getLayoutParams();
            int width = slidingPaneLayout.f2698f.getWidth();
            if (zB) {
                i11 = (slidingPaneLayout.getWidth() - i11) - width;
            }
            float paddingRight = (i11 - ((zB ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (zB ? ((ViewGroup.MarginLayoutParams) eVar).rightMargin : ((ViewGroup.MarginLayoutParams) eVar).leftMargin))) / slidingPaneLayout.K;
            slidingPaneLayout.f2699t = paddingRight;
            if (slidingPaneLayout.M != 0) {
                slidingPaneLayout.d(paddingRight);
            }
            Iterator it = slidingPaneLayout.P.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        slidingPaneLayout.invalidate();
    }

    @Override // com.bumptech.glide.d
    public final void F(View view, float f5, float f11) {
        int paddingLeft;
        e eVar = (e) view.getLayoutParams();
        SlidingPaneLayout slidingPaneLayout = this.f34287a;
        if (slidingPaneLayout.b()) {
            int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            if (f5 < CropImageView.DEFAULT_ASPECT_RATIO || (f5 == CropImageView.DEFAULT_ASPECT_RATIO && slidingPaneLayout.f2699t > 0.5f)) {
                paddingRight += slidingPaneLayout.K;
            }
            paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.f2698f.getWidth();
        } else {
            paddingLeft = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + slidingPaneLayout.getPaddingLeft();
            if (f5 > CropImageView.DEFAULT_ASPECT_RATIO || (f5 == CropImageView.DEFAULT_ASPECT_RATIO && slidingPaneLayout.f2699t > 0.5f)) {
                paddingLeft += slidingPaneLayout.K;
            }
        }
        slidingPaneLayout.Q.r(paddingLeft, view.getTop());
        slidingPaneLayout.invalidate();
    }

    @Override // com.bumptech.glide.d
    public final boolean M(View view, int i11) {
        if (O()) {
            return ((e) view.getLayoutParams()).f34290b;
        }
        return false;
    }

    public final boolean O() {
        SlidingPaneLayout slidingPaneLayout = this.f34287a;
        if (slidingPaneLayout.L || slidingPaneLayout.getLockMode() == 3) {
            return false;
        }
        if (slidingPaneLayout.c() && slidingPaneLayout.getLockMode() == 1) {
            return false;
        }
        return slidingPaneLayout.c() || slidingPaneLayout.getLockMode() != 2;
    }

    @Override // com.bumptech.glide.d
    public final int h(View view, int i11) {
        SlidingPaneLayout slidingPaneLayout = this.f34287a;
        e eVar = (e) slidingPaneLayout.f2698f.getLayoutParams();
        if (!slidingPaneLayout.b()) {
            int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            return Math.min(Math.max(i11, paddingLeft), slidingPaneLayout.K + paddingLeft);
        }
        int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.f2698f.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        return Math.max(Math.min(i11, width), width - slidingPaneLayout.K);
    }

    @Override // com.bumptech.glide.d
    public final int i(View view, int i11) {
        return view.getTop();
    }

    @Override // com.bumptech.glide.d
    public final int q(View view) {
        return this.f34287a.K;
    }
}
