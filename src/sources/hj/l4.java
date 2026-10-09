package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f32857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f32858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f32859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b6 f32860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f32861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewPager2 f32862g;

    public l4(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, View view, b6 b6Var, TextView textView, ViewPager2 viewPager2) {
        this.f32856a = constraintLayout;
        this.f32857b = imageView;
        this.f32858c = imageView2;
        this.f32859d = view;
        this.f32860e = b6Var;
        this.f32861f = textView;
        this.f32862g = viewPager2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32856a;
    }
}
