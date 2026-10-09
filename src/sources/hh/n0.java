package hh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.lingodeer.R;
import fr.j3;
import hj.b6;
import hj.k4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f32269a = new n0(3, k4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentPdLearnSpeakBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_pd_learn_speak, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.iv_ctl;
        ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_ctl);
        if (imageView != null) {
            i11 = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.recycler_view);
            if (recyclerView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i11 = R.id.scroll_view;
                NestedScrollView nestedScrollView = (NestedScrollView) j3.q(viewInflate, R.id.scroll_view);
                if (nestedScrollView != null) {
                    i11 = R.id.status_bar_view;
                    View viewQ = j3.q(viewInflate, R.id.status_bar_view);
                    if (viewQ != null) {
                        i11 = R.id.toolbar;
                        View viewQ2 = j3.q(viewInflate, R.id.toolbar);
                        if (viewQ2 != null) {
                            return new k4(constraintLayout, imageView, recyclerView, nestedScrollView, viewQ, b6.b(viewQ2));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
