package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.lingodeer.course.stroke_order_view_new.old.HwCharThumbView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f33239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HwCharThumbView f33240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b6 f33241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f33242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CardView f33243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CardView f33244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f33245h;

    public r6(LinearLayout linearLayout, CardView cardView, HwCharThumbView hwCharThumbView, b6 b6Var, ImageView imageView, CardView cardView2, CardView cardView3, TextView textView) {
        this.f33238a = linearLayout;
        this.f33239b = cardView;
        this.f33240c = hwCharThumbView;
        this.f33241d = b6Var;
        this.f33242e = imageView;
        this.f33243f = cardView2;
        this.f33244g = cardView3;
        this.f33245h = textView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33238a;
    }
}
