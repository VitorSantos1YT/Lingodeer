package pi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingodeer.R;
import fr.j3;
import hj.w3;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f46940a = new c(3, w3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentCsFunctionIndexBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_cs_function_index, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_alphabet_chart;
        LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.btn_alphabet_chart);
        if (linearLayout != null) {
            i11 = R.id.btn_introduction;
            LinearLayout linearLayout2 = (LinearLayout) j3.q(viewInflate, R.id.btn_introduction);
            if (linearLayout2 != null) {
                i11 = R.id.btn_lingo_word;
                if (((LinearLayout) j3.q(viewInflate, R.id.btn_lingo_word)) != null) {
                    i11 = R.id.btn_pronunciation;
                    LinearLayout linearLayout3 = (LinearLayout) j3.q(viewInflate, R.id.btn_pronunciation);
                    if (linearLayout3 != null) {
                        i11 = R.id.btn_sc;
                        LinearLayout linearLayout4 = (LinearLayout) j3.q(viewInflate, R.id.btn_sc);
                        if (linearLayout4 != null) {
                            i11 = R.id.iv_pro;
                            if (((ImageView) j3.q(viewInflate, R.id.iv_pro)) != null) {
                                i11 = R.id.iv_sc;
                                if (((ImageView) j3.q(viewInflate, R.id.iv_sc)) != null) {
                                    i11 = R.id.tv_pro;
                                    if (((TextView) j3.q(viewInflate, R.id.tv_pro)) != null) {
                                        i11 = R.id.tv_sc;
                                        if (((TextView) j3.q(viewInflate, R.id.tv_sc)) != null) {
                                            return new w3((LinearLayout) viewInflate, linearLayout, linearLayout2, linearLayout3, linearLayout4);
                                        }
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
