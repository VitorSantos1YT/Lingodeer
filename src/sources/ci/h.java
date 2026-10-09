package ci;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.lingodeer.R;
import fr.j3;
import hj.d3;
import hj.e3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f7133a = new h(1, hj.h.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityArSyllableIntroductionBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_ar_syllable_introduction, (ViewGroup) null, false);
        int i11 = R.id.app_bar;
        View viewQ = j3.q(viewInflate, R.id.app_bar);
        if (viewQ != null) {
            d3.a(viewQ);
            i11 = R.id.ll_download;
            View viewQ2 = j3.q(viewInflate, R.id.ll_download);
            if (viewQ2 != null) {
                e3 e3VarA = e3.a(viewQ2);
                ViewPager viewPager = (ViewPager) j3.q(viewInflate, R.id.view_pager);
                if (viewPager != null) {
                    return new hj.h((ConstraintLayout) viewInflate, e3VarA, viewPager);
                }
                i11 = R.id.view_pager;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
