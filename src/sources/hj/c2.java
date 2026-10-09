package hj;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f32444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f32445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EditText f32446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlexboxLayout f32447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b6 f32448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f32449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f32450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f32451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f32452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ConstraintLayout f32453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f32454l;
    public final TextView m;

    public c2(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, EditText editText, FlexboxLayout flexboxLayout, b6 b6Var, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.f32443a = constraintLayout;
        this.f32444b = imageView;
        this.f32445c = imageView2;
        this.f32446d = editText;
        this.f32447e = flexboxLayout;
        this.f32448f = b6Var;
        this.f32449g = imageView3;
        this.f32450h = imageView4;
        this.f32451i = imageView5;
        this.f32452j = linearLayout;
        this.f32453k = constraintLayout2;
        this.f32454l = textView;
        this.m = textView2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32443a;
    }
}
