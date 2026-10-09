package hh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.lingodeer.R;
import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m1 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f32267a = new m1(1, hj.n0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityPdVocabularyDetailBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_pd_vocabulary_detail, (ViewGroup) null, false);
        int i11 = R.id.app_bar;
        if (((AppBarLayout) j3.q(viewInflate, R.id.app_bar)) != null) {
            i11 = R.id.toolbar;
            if (((Toolbar) j3.q(viewInflate, R.id.toolbar)) != null) {
                i11 = R.id.tv_index;
                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_index);
                if (textView != null) {
                    i11 = R.id.view_pager;
                    ViewPager viewPager = (ViewPager) j3.q(viewInflate, R.id.view_pager);
                    if (viewPager != null) {
                        return new hj.n0((ConstraintLayout) viewInflate, textView, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
