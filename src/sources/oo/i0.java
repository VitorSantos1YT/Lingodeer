package oo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.widget.ResponsiveScrollView;
import com.lingodeer.R;
import fr.j3;
import hj.d3;
import hj.d5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f45684a = new i0(3, d5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentSpeakTryBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_speak_try, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        View viewQ = j3.q(viewInflate, R.id.app_bar);
        if (viewQ != null) {
            d3.a(viewQ);
        }
        int i11 = R.id.fl_progress;
        FlexboxLayout flexboxLayout = (FlexboxLayout) j3.q(viewInflate, R.id.fl_progress);
        if (flexboxLayout != null) {
            i11 = R.id.fl_sentence;
            if (((FlexboxLayout) j3.q(viewInflate, R.id.fl_sentence)) != null) {
                i11 = R.id.iv_pic;
                ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_pic);
                if (imageView != null) {
                    i11 = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.recycler_view);
                    if (recyclerView != null) {
                        i11 = R.id.scroll_view;
                        ResponsiveScrollView responsiveScrollView = (ResponsiveScrollView) j3.q(viewInflate, R.id.scroll_view);
                        if (responsiveScrollView != null) {
                            return new d5((LinearLayout) viewInflate, flexboxLayout, imageView, recyclerView, responsiveScrollView, j3.q(viewInflate, R.id.status_bar_view));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
