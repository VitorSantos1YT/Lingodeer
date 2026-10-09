package hj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f32406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f32407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f32408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f32409e;

    public /* synthetic */ b6(ViewGroup viewGroup, ViewGroup viewGroup2, View view, View view2, int i11) {
        this.f32405a = i11;
        this.f32406b = viewGroup;
        this.f32407c = viewGroup2;
        this.f32408d = view;
        this.f32409e = view2;
    }

    public static b6 a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R.id.iv_audio;
        ImageView imageView = (ImageView) fr.j3.q(view, R.id.iv_audio);
        if (imageView != null) {
            i11 = R.id.iv_deer;
            if (((ImageView) fr.j3.q(view, R.id.iv_deer)) != null) {
                i11 = R.id.iv_deer_huzi;
                ImageView imageView2 = (ImageView) fr.j3.q(view, R.id.iv_deer_huzi);
                if (imageView2 != null) {
                    return new b6(frameLayout, frameLayout, imageView, imageView2, 0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static b6 b(View view) {
        int i11 = R.id.img_back_arrow;
        ImageView imageView = (ImageView) fr.j3.q(view, R.id.img_back_arrow);
        if (imageView != null) {
            i11 = R.id.tv_toolbar_title;
            TextView textView = (TextView) fr.j3.q(view, R.id.tv_toolbar_title);
            if (textView != null) {
                i11 = R.id.tv_toolbar_trans;
                TextView textView2 = (TextView) fr.j3.q(view, R.id.tv_toolbar_trans);
                if (textView2 != null) {
                    return new b6((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static b6 c(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        View viewInflate = layoutInflater.inflate(R.layout.include_sentence_ab_b, (ViewGroup) linearLayout, false);
        int i11 = R.id.flex_top;
        FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_top);
        if (flexboxLayout != null) {
            i11 = R.id.flex_top_bg_with_line;
            FlexboxLayout flexboxLayout2 = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_top_bg_with_line);
            if (flexboxLayout2 != null) {
                i11 = R.id.iv_top;
                if (((ImageView) fr.j3.q(viewInflate, R.id.iv_top)) != null) {
                    i11 = R.id.tv_trans;
                    TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_trans);
                    if (textView != null) {
                        return new b6((LinearLayout) viewInflate, flexboxLayout, flexboxLayout2, textView, 3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f32405a) {
            case 0:
                return (FrameLayout) this.f32406b;
            case 1:
                return (LinearLayout) this.f32406b;
            case 2:
                return (ConstraintLayout) this.f32406b;
            case 3:
                return (LinearLayout) this.f32406b;
            default:
                return (FrameLayout) this.f32406b;
        }
    }

    public b6(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f32405a = 2;
        this.f32406b = constraintLayout;
        this.f32408d = imageView;
        this.f32407c = textView;
        this.f32409e = textView2;
    }

    public b6(FrameLayout frameLayout, d3 d3Var, d3 d3Var2, d3 d3Var3, d3 d3Var4, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.f32405a = 4;
        this.f32406b = frameLayout;
        this.f32407c = textView;
        this.f32408d = textView2;
        this.f32409e = textView3;
    }
}
