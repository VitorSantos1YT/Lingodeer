package hj;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f32679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6 f32680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EditText f32681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlexboxLayout f32682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f32683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f32684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f32685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConstraintLayout f32686i;

    public i1(ConstraintLayout constraintLayout, ImageView imageView, a6 a6Var, EditText editText, FlexboxLayout flexboxLayout, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, ConstraintLayout constraintLayout2) {
        this.f32678a = constraintLayout;
        this.f32679b = imageView;
        this.f32680c = a6Var;
        this.f32681d = editText;
        this.f32682e = flexboxLayout;
        this.f32683f = imageView2;
        this.f32684g = imageView3;
        this.f32685h = linearLayout;
        this.f32686i = constraintLayout2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32678a;
    }
}
