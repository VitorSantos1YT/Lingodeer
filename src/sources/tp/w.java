package tp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.u3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f52504a = new w(3, hj.s.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/ActivityFlashCardFinishBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_flash_card_finish, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_quit;
        MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_quit);
        if (materialButton != null) {
            i11 = R.id.include_finish_pop_deer;
            View viewQ = j3.q(viewInflate, R.id.include_finish_pop_deer);
            if (viewQ != null) {
                u3 u3VarA = u3.a(viewQ);
                i11 = R.id.ll_srs_info;
                LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_srs_info);
                if (linearLayout != null) {
                    i11 = R.id.tv_remember_badly;
                    TextView textView = (TextView) j3.q(viewInflate, R.id.tv_remember_badly);
                    if (textView != null) {
                        i11 = R.id.tv_remember_normal;
                        TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_remember_normal);
                        if (textView2 != null) {
                            i11 = R.id.tv_remember_perfect;
                            TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_remember_perfect);
                            if (textView3 != null) {
                                i11 = R.id.tv_weak_complete;
                                TextView textView4 = (TextView) j3.q(viewInflate, R.id.tv_weak_complete);
                                if (textView4 != null) {
                                    return new hj.s((LinearLayout) viewInflate, materialButton, u3VarA, linearLayout, textView, textView2, textView3, textView4);
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
