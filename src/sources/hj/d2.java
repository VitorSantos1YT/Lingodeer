package hj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.dreamtobe.kpswitch.widget.KPSwitchPanelFrameLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f32481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f32482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b6 f32483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f32484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f32485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f32486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f32487h;

    public d2(LinearLayout linearLayout, ImageView imageView, EditText editText, b6 b6Var, ImageView imageView2, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.f32480a = linearLayout;
        this.f32481b = imageView;
        this.f32482c = editText;
        this.f32483d = b6Var;
        this.f32484e = imageView2;
        this.f32485f = linearLayout2;
        this.f32486g = textView;
        this.f32487h = textView2;
    }

    public static d2 a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.cn_sentence_model_view_13_not_use, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_try;
        ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.btn_try);
        if (imageView != null) {
            i11 = R.id.edit_content;
            EditText editText = (EditText) fr.j3.q(viewInflate, R.id.edit_content);
            if (editText != null) {
                i11 = R.id.fl_deer_audio;
                View viewQ = fr.j3.q(viewInflate, R.id.fl_deer_audio);
                if (viewQ != null) {
                    b6 b6VarA = b6.a(viewQ);
                    i11 = R.id.iv_audio_small;
                    ImageView imageView2 = (ImageView) fr.j3.q(viewInflate, R.id.iv_audio_small);
                    if (imageView2 != null) {
                        i11 = R.id.kp_frame;
                        if (((KPSwitchPanelFrameLayout) fr.j3.q(viewInflate, R.id.kp_frame)) != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            i11 = R.id.tv_hint;
                            TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_hint);
                            if (textView != null) {
                                i11 = R.id.tv_trans;
                                TextView textView2 = (TextView) fr.j3.q(viewInflate, R.id.tv_trans);
                                if (textView2 != null) {
                                    return new d2(linearLayout, imageView, editText, b6VarA, imageView2, linearLayout, textView, textView2);
                                }
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
        return this.f32480a;
    }
}
