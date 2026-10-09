package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatButton f32396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatButton f32397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CardView f32398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f32399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FlexboxLayout f32400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f32401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f32402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ProgressBar f32403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f32404j;

    public b5(LinearLayout linearLayout, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, CardView cardView, FrameLayout frameLayout, FlexboxLayout flexboxLayout, ImageView imageView, ImageView imageView2, ProgressBar progressBar, TextView textView) {
        this.f32395a = linearLayout;
        this.f32396b = appCompatButton;
        this.f32397c = appCompatButton2;
        this.f32398d = cardView;
        this.f32399e = frameLayout;
        this.f32400f = flexboxLayout;
        this.f32401g = imageView;
        this.f32402h = imageView2;
        this.f32403i = progressBar;
        this.f32404j = textView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32395a;
    }
}
