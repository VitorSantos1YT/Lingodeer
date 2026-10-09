package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f32738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f32739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e3 f32740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f32741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ProgressBar f32742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f32743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f32744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewPager2 f32745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewPager2 f32746j;

    public j0(ConstraintLayout constraintLayout, TextView textView, TextView textView2, e3 e3Var, ImageView imageView, ProgressBar progressBar, TextView textView3, TextView textView4, ViewPager2 viewPager2, ViewPager2 viewPager3) {
        this.f32737a = constraintLayout;
        this.f32738b = textView;
        this.f32739c = textView2;
        this.f32740d = e3Var;
        this.f32741e = imageView;
        this.f32742f = progressBar;
        this.f32743g = textView3;
        this.f32744h = textView4;
        this.f32745i = viewPager2;
        this.f32746j = viewPager3;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32737a;
    }
}
