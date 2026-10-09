package hj;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingodeer.course.stroke_order_view_new.old.HwView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f33318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f33319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f33320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageButton f33321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HwView f33322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageButton f33323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageButton f33324h;

    public t1(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, ImageButton imageButton, HwView hwView, ImageButton imageButton2, ImageButton imageButton3) {
        this.f33317a = constraintLayout;
        this.f33318b = imageView;
        this.f33319c = textView;
        this.f33320d = textView2;
        this.f33321e = imageButton;
        this.f33322f = hwView;
        this.f33323g = imageButton2;
        this.f33324h = imageButton3;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33317a;
    }
}
