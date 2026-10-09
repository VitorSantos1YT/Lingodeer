package hj;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f32950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewPager f32951c;

    public n0(ConstraintLayout constraintLayout, TextView textView, ViewPager viewPager) {
        this.f32949a = constraintLayout;
        this.f32950b = textView;
        this.f32951c = viewPager;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32949a;
    }
}
