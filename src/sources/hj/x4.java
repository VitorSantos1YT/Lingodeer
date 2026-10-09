package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f33583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f33584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f33585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f33586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f33587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f33588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f33589h;

    public x4(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, FrameLayout frameLayout2, ImageView imageView2, LinearLayout linearLayout, View view, TextView textView) {
        this.f33582a = constraintLayout;
        this.f33583b = frameLayout;
        this.f33584c = imageView;
        this.f33585d = frameLayout2;
        this.f33586e = imageView2;
        this.f33587f = linearLayout;
        this.f33588g = view;
        this.f33589h = textView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33582a;
    }
}
