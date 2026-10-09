package hj;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.lingodeer.course.stroke_order_view_new.old.HwCharThumbView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f33047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HwCharThumbView f33048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CardView f33049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CardView f33050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f33051f;

    public o6(LinearLayout linearLayout, CardView cardView, HwCharThumbView hwCharThumbView, CardView cardView2, CardView cardView3, TextView textView) {
        this.f33046a = linearLayout;
        this.f33047b = cardView;
        this.f33048c = hwCharThumbView;
        this.f33049d = cardView2;
        this.f33050e = cardView3;
        this.f33051f = textView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33046a;
    }
}
