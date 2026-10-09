package hj;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f32688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f32689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlexboxLayout f32690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z5 f32691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f32692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f32693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f32694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f32695i;

    public i2(LinearLayout linearLayout, FrameLayout frameLayout, EditText editText, FlexboxLayout flexboxLayout, z5 z5Var, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, TextView textView) {
        this.f32687a = linearLayout;
        this.f32688b = frameLayout;
        this.f32689c = editText;
        this.f32690d = flexboxLayout;
        this.f32691e = z5Var;
        this.f32692f = imageView;
        this.f32693g = imageView2;
        this.f32694h = linearLayout2;
        this.f32695i = textView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32687a;
    }
}
