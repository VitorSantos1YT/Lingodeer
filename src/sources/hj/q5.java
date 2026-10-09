package hj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f33166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f33167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f33168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f33169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e3 f33170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ProgressBar f33171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f33172g;

    public q5(FrameLayout frameLayout, MaterialButton materialButton, FrameLayout frameLayout2, ImageView imageView, e3 e3Var, ProgressBar progressBar, View view) {
        this.f33166a = frameLayout;
        this.f33167b = materialButton;
        this.f33168c = frameLayout2;
        this.f33169d = imageView;
        this.f33170e = e3Var;
        this.f33171f = progressBar;
        this.f33172g = view;
    }

    public static q5 a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_syllable_test, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.check_button;
        MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.check_button);
        if (materialButton != null) {
            i11 = R.id.fl_container;
            FrameLayout frameLayout = (FrameLayout) fr.j3.q(viewInflate, R.id.fl_container);
            if (frameLayout != null) {
                i11 = R.id.iv_close;
                ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.iv_close);
                if (imageView != null) {
                    i11 = R.id.ll_download;
                    View viewQ = fr.j3.q(viewInflate, R.id.ll_download);
                    if (viewQ != null) {
                        e3 e3VarA = e3.a(viewQ);
                        i11 = R.id.f22243pb;
                        ProgressBar progressBar = (ProgressBar) fr.j3.q(viewInflate, R.id.f22243pb);
                        if (progressBar != null) {
                            i11 = R.id.status_bar_view;
                            View viewQ2 = fr.j3.q(viewInflate, R.id.status_bar_view);
                            if (viewQ2 != null) {
                                return new q5((FrameLayout) viewInflate, materialButton, frameLayout, imageView, e3VarA, progressBar, viewQ2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33166a;
    }
}
