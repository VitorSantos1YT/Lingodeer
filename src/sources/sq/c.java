package sq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.o5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f51739a = new c(3, o5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentSyllableStudyBaseBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_syllable_study_base, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_practice;
        MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_practice);
        if (materialButton != null) {
            i11 = R.id.rv_final;
            RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.rv_final);
            if (recyclerView != null) {
                i11 = R.id.rv_inital;
                RecyclerView recyclerView2 = (RecyclerView) j3.q(viewInflate, R.id.rv_inital);
                if (recyclerView2 != null) {
                    i11 = R.id.tv_desc;
                    TextView textView = (TextView) j3.q(viewInflate, R.id.tv_desc);
                    if (textView != null) {
                        i11 = R.id.tv_finals;
                        if (((TextView) j3.q(viewInflate, R.id.tv_finals)) != null) {
                            i11 = R.id.tv_initals;
                            if (((TextView) j3.q(viewInflate, R.id.tv_initals)) != null) {
                                i11 = R.id.tv_tips;
                                TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_tips);
                                if (textView2 != null) {
                                    i11 = R.id.tv_tips_content;
                                    TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_tips_content);
                                    if (textView3 != null) {
                                        return new o5((LinearLayout) viewInflate, materialButton, recyclerView, recyclerView2, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
