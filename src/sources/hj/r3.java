package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f33213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b6 f33214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f33215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f33216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AppCompatSeekBar f33217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f33218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f33219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f33220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f33221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f33222k;

    public r3(ConstraintLayout constraintLayout, FrameLayout frameLayout, b6 b6Var, ImageView imageView, ImageView imageView2, AppCompatSeekBar appCompatSeekBar, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f33212a = constraintLayout;
        this.f33213b = frameLayout;
        this.f33214c = b6Var;
        this.f33215d = imageView;
        this.f33216e = imageView2;
        this.f33217f = appCompatSeekBar;
        this.f33218g = view;
        this.f33219h = textView;
        this.f33220i = textView2;
        this.f33221j = textView3;
        this.f33222k = textView4;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33212a;
    }
}
