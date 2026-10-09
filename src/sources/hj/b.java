package hj;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f32364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f32365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f32366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f32367e;

    public b(LinearLayout linearLayout, MaterialButton materialButton, ImageView imageView, TextView textView, TextView textView2) {
        this.f32363a = linearLayout;
        this.f32364b = materialButton;
        this.f32365c = imageView;
        this.f32366d = textView;
        this.f32367e = textView2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32363a;
    }
}
