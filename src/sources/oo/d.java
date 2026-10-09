package oo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.d3;
import hj.e3;
import hj.j6;
import hj.y4;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f45642a = new d(3, y4.class, iFLeRCXvYCGdPW.YRHrE, "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentSpeakIndexBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_speak_index, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.app_bar;
        View viewQ = j3.q(viewInflate, R.id.app_bar);
        if (viewQ != null) {
            d3.a(viewQ);
            i11 = R.id.btn_huiben;
            View viewQ2 = j3.q(viewInflate, R.id.btn_huiben);
            if (viewQ2 != null) {
                i11 = R.id.btn_leadboard;
                MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_leadboard);
                if (materialButton != null) {
                    i11 = R.id.btn_peiyin;
                    View viewQ3 = j3.q(viewInflate, R.id.btn_peiyin);
                    if (viewQ3 != null) {
                        i11 = R.id.fl_main_sentence;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) j3.q(viewInflate, R.id.fl_main_sentence);
                        if (flexboxLayout != null) {
                            View viewQ4 = j3.q(viewInflate, R.id.fl_speak_video);
                            j6 j6VarA = viewQ4 != null ? j6.a(viewQ4) : null;
                            View viewQ5 = j3.q(viewInflate, R.id.ll_download);
                            e3 e3VarA = viewQ5 != null ? e3.a(viewQ5) : null;
                            i11 = R.id.tv_trans;
                            TextView textView = (TextView) j3.q(viewInflate, R.id.tv_trans);
                            if (textView != null) {
                                return new y4((FrameLayout) viewInflate, viewQ2, materialButton, viewQ3, flexboxLayout, j6VarA, e3VarA, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
