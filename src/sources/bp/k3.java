package bp;

import aj.uZCn.evRpcb;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k3 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k3 f4671a = new k3(1, hj.c0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityMoreLingodeerBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_more_lingodeer, (ViewGroup) null, false);
        int i11 = R.id.const_chat_with_us;
        ConstraintLayout constraintLayout = (ConstraintLayout) fr.j3.q(viewInflate, R.id.const_chat_with_us);
        if (constraintLayout != null) {
            i11 = R.id.const_premium;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) fr.j3.q(viewInflate, R.id.const_premium);
            if (constraintLayout2 != null) {
                i11 = R.id.const_what_s_new;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) fr.j3.q(viewInflate, R.id.const_what_s_new);
                if (constraintLayout3 != null) {
                    i11 = R.id.include_deerplus;
                    View viewQ = fr.j3.q(viewInflate, R.id.include_deerplus);
                    if (viewQ != null) {
                        hj.k.a(viewQ);
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        i11 = R.id.tv_chat_with_us;
                        if (((TextView) fr.j3.q(viewInflate, R.id.tv_chat_with_us)) != null) {
                            i11 = R.id.tv_premium;
                            if (((TextView) fr.j3.q(viewInflate, R.id.tv_premium)) != null) {
                                i11 = R.id.tv_premium_section;
                                TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_premium_section);
                                if (textView != null) {
                                    i11 = R.id.tv_what_new_title;
                                    if (((TextView) fr.j3.q(viewInflate, R.id.tv_what_new_title)) != null) {
                                        i11 = R.id.view_premium;
                                        View viewQ2 = fr.j3.q(viewInflate, R.id.view_premium);
                                        if (viewQ2 != null) {
                                            return new hj.c0(linearLayout, constraintLayout, constraintLayout2, constraintLayout3, textView, viewQ2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(evRpcb.nCJ.concat(viewInflate.getResources().getResourceName(i11)));
    }
}
