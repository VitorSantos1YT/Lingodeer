package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i4 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i4 f47982a = new i4(3, hj.z2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnWordModelView5Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_word_model_view_5, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.flex_bottom;
        FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_bottom);
        if (flexboxLayout != null) {
            i11 = R.id.flex_top;
            FlexboxLayout flexboxLayout2 = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_top);
            if (flexboxLayout2 != null) {
                i11 = R.id.include_word_sentence_audio_title;
                View viewQ = fr.j3.q(viewInflate, R.id.include_word_sentence_audio_title);
                if (viewQ != null) {
                    hj.e3 e3VarB = hj.e3.b(viewQ);
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    i11 = R.id.sps_btn;
                    SlowPlaySwitchBtn slowPlaySwitchBtn = (SlowPlaySwitchBtn) fr.j3.q(viewInflate, R.id.sps_btn);
                    if (slowPlaySwitchBtn != null) {
                        i11 = R.id.tv_trans;
                        if (((TextView) fr.j3.q(viewInflate, R.id.tv_trans)) != null) {
                            return new hj.z2(linearLayout, flexboxLayout, flexboxLayout2, e3VarB, slowPlaySwitchBtn);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
