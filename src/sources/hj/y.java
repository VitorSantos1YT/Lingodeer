package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager f33605b;

    public y(ConstraintLayout constraintLayout, ViewPager viewPager) {
        this.f33604a = constraintLayout;
        this.f33605b = viewPager;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33604a;
    }
}
