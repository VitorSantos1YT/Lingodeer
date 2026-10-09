package hj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewPager f32996b;

    public n5(LinearLayout linearLayout, ViewPager viewPager) {
        this.f32995a = linearLayout;
        this.f32996b = viewPager;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32995a;
    }
}
