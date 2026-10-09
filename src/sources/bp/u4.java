package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u4 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u4 f4842a = new u4(1, hj.x0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivitySplashWhyLearnBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_splash_why_learn, (ViewGroup) null, false);
        int i11 = R.id.card_family;
        MaterialCardView materialCardView = (MaterialCardView) fr.j3.q(viewInflate, R.id.card_family);
        if (materialCardView != null) {
            i11 = R.id.card_other;
            MaterialCardView materialCardView2 = (MaterialCardView) fr.j3.q(viewInflate, R.id.card_other);
            if (materialCardView2 != null) {
                i11 = R.id.card_person_interest;
                MaterialCardView materialCardView3 = (MaterialCardView) fr.j3.q(viewInflate, R.id.card_person_interest);
                if (materialCardView3 != null) {
                    i11 = R.id.card_school;
                    MaterialCardView materialCardView4 = (MaterialCardView) fr.j3.q(viewInflate, R.id.card_school);
                    if (materialCardView4 != null) {
                        i11 = R.id.card_skill_improvement;
                        MaterialCardView materialCardView5 = (MaterialCardView) fr.j3.q(viewInflate, R.id.card_skill_improvement);
                        if (materialCardView5 != null) {
                            i11 = R.id.card_travel;
                            MaterialCardView materialCardView6 = (MaterialCardView) fr.j3.q(viewInflate, R.id.card_travel);
                            if (materialCardView6 != null) {
                                i11 = R.id.card_work;
                                MaterialCardView materialCardView7 = (MaterialCardView) fr.j3.q(viewInflate, R.id.card_work);
                                if (materialCardView7 != null) {
                                    i11 = R.id.status_bar_view;
                                    View viewQ = fr.j3.q(viewInflate, R.id.status_bar_view);
                                    if (viewQ != null) {
                                        i11 = R.id.tv_title;
                                        TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_title);
                                        if (textView != null) {
                                            return new hj.x0((LinearLayout) viewInflate, materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5, materialCardView6, materialCardView7, viewQ, textView);
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
