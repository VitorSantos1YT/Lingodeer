package hj;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageButton f32546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatButton f32547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppCompatButton f32548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f32549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f32550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f32551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f32552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f32553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f32554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ViewPager2 f32555k;

    public f(LinearLayout linearLayout, ImageButton imageButton, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, ImageView imageView, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, ViewPager2 viewPager2) {
        this.f32545a = linearLayout;
        this.f32546b = imageButton;
        this.f32547c = appCompatButton;
        this.f32548d = appCompatButton2;
        this.f32549e = imageView;
        this.f32550f = view;
        this.f32551g = textView;
        this.f32552h = textView2;
        this.f32553i = textView3;
        this.f32554j = textView4;
        this.f32555k = viewPager2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32545a;
    }
}
