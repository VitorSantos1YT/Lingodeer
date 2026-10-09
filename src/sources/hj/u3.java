package hj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f33390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f33391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f33392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f33393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f33394f;

    public /* synthetic */ u3(ViewGroup viewGroup, View view, View view2, TextView textView, View view3, int i11) {
        this.f33389a = i11;
        this.f33391c = viewGroup;
        this.f33392d = view;
        this.f33393e = view2;
        this.f33390b = textView;
        this.f33394f = view3;
    }

    public static u3 a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R.id.iv_deer;
        ImageView imageView = (ImageView) fr.j3.q(view, R.id.iv_deer);
        if (imageView != null) {
            i11 = R.id.iv_star;
            ImageView imageView2 = (ImageView) fr.j3.q(view, R.id.iv_star);
            if (imageView2 != null) {
                i11 = R.id.iv_star_bg;
                ImageView imageView3 = (ImageView) fr.j3.q(view, R.id.iv_star_bg);
                if (imageView3 != null) {
                    i11 = R.id.tv_xp;
                    TextView textView = (TextView) fr.j3.q(view, R.id.tv_xp);
                    if (textView != null) {
                        return new u3(frameLayout, imageView, imageView2, imageView3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f33389a) {
            case 0:
                return (ConstraintLayout) this.f33391c;
            case 1:
                return (FrameLayout) this.f33391c;
            case 2:
                return (FrameLayout) this.f33391c;
            case 3:
                return (LinearLayout) this.f33391c;
            default:
                return (ConstraintLayout) this.f33391c;
        }
    }

    public u3(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f33389a = 3;
        this.f33391c = linearLayout;
        this.f33390b = textView;
        this.f33394f = textView2;
        this.f33392d = textView3;
        this.f33393e = textView4;
    }

    public u3(FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView) {
        this.f33389a = 2;
        this.f33391c = frameLayout;
        this.f33392d = imageView;
        this.f33393e = imageView2;
        this.f33394f = imageView3;
        this.f33390b = textView;
    }
}
