package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.lingodeer.course.stroke_order_view_new.HwViewNew;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f33372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f33373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f33374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f33375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f33376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f33377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f33378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f33379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HwViewNew f33380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HwViewNew f33381j;

    public u1(MotionLayout motionLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView, TextView textView2, HwViewNew hwViewNew, HwViewNew hwViewNew2) {
        this.f33372a = motionLayout;
        this.f33373b = imageView;
        this.f33374c = imageView2;
        this.f33375d = imageView3;
        this.f33376e = imageView4;
        this.f33377f = imageView5;
        this.f33378g = textView;
        this.f33379h = textView2;
        this.f33380i = hwViewNew;
        this.f33381j = hwViewNew2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33372a;
    }
}
