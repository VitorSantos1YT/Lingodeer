package hj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f32337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3 f32338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f32339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f32340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f32341e;

    public a3(FrameLayout frameLayout, d3 d3Var, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f32337a = frameLayout;
        this.f32338b = d3Var;
        this.f32339c = linearLayout;
        this.f32340d = linearLayout2;
        this.f32341e = linearLayout3;
    }

    public static a3 a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.cn_word_model_view_6, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.include_word_model_06_switch_btn;
        View viewQ = fr.j3.q(viewInflate, R.id.include_word_model_06_switch_btn);
        if (viewQ != null) {
            SlowPlaySwitchBtn slowPlaySwitchBtn = (SlowPlaySwitchBtn) viewQ;
            d3 d3Var = new d3(slowPlaySwitchBtn, 8, slowPlaySwitchBtn);
            i11 = R.id.ll_left;
            LinearLayout linearLayout = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_left);
            if (linearLayout != null) {
                i11 = R.id.ll_right;
                LinearLayout linearLayout2 = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_right);
                if (linearLayout2 != null) {
                    i11 = R.id.ll_top;
                    LinearLayout linearLayout3 = (LinearLayout) fr.j3.q(viewInflate, R.id.ll_top);
                    if (linearLayout3 != null) {
                        return new a3((FrameLayout) viewInflate, d3Var, linearLayout, linearLayout2, linearLayout3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32337a;
    }
}
