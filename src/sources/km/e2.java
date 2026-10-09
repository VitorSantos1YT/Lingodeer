package km;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import com.lingodeer.R;
import fr.j3;
import hj.f3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e2 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e2 f38179a = new e2(3, f3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmenYinTuBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragmen_yin_tu, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_alphabet_chart;
        MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_alphabet_chart);
        if (materialButton != null) {
            i11 = R.id.tl_title;
            TabLayout tabLayout = (TabLayout) j3.q(viewInflate, R.id.tl_title);
            if (tabLayout != null) {
                i11 = R.id.toolbar;
                if (((Toolbar) j3.q(viewInflate, R.id.toolbar)) != null) {
                    i11 = R.id.vp_container;
                    ViewPager2 viewPager2 = (ViewPager2) j3.q(viewInflate, R.id.vp_container);
                    if (viewPager2 != null) {
                        return new f3((LinearLayout) viewInflate, materialButton, tabLayout, viewPager2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
