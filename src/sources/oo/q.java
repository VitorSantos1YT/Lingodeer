package oo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.a5;
import hj.d3;
import hj.j6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f45699a = new q(3, a5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentSpeakPreviewBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_speak_preview, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_publish;
        MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_publish);
        if (materialButton != null) {
            i11 = R.id.btn_redo;
            MaterialButton materialButton2 = (MaterialButton) j3.q(viewInflate, R.id.btn_redo);
            if (materialButton2 != null) {
                i11 = R.id.fl_speak_video;
                View viewQ = j3.q(viewInflate, R.id.fl_speak_video);
                if (viewQ != null) {
                    j6 j6VarA = j6.a(viewQ);
                    View viewQ2 = j3.q(viewInflate, R.id.include_toolbar);
                    if (viewQ2 != null) {
                        d3.a(viewQ2);
                    }
                    i11 = R.id.tv_trans;
                    TextView textView = (TextView) j3.q(viewInflate, R.id.tv_trans);
                    if (textView != null) {
                        i11 = R.id.tv_xp;
                        TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_xp);
                        if (textView2 != null) {
                            return new a5(viewInflate, materialButton, materialButton2, j6VarA, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
