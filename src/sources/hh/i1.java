package hh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.lingodeer.R;
import fr.j3;
import hj.d3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i1 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1 f32245a = new i1(1, hj.m0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityPdVocabularyBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_pd_vocabulary, (ViewGroup) null, false);
        int i11 = R.id.app_bar;
        View viewQ = j3.q(viewInflate, R.id.app_bar);
        if (viewQ != null) {
            d3 d3VarA = d3.a(viewQ);
            i11 = R.id.btn_all;
            TextView textView = (TextView) j3.q(viewInflate, R.id.btn_all);
            if (textView != null) {
                i11 = R.id.btn_fav;
                TextView textView2 = (TextView) j3.q(viewInflate, R.id.btn_fav);
                if (textView2 != null) {
                    i11 = R.id.progress_bar;
                    ProgressBar progressBar = (ProgressBar) j3.q(viewInflate, R.id.progress_bar);
                    if (progressBar != null) {
                        i11 = R.id.recycler_view_all;
                        RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.recycler_view_all);
                        if (recyclerView != null) {
                            i11 = R.id.recycler_view_fav;
                            RecyclerView recyclerView2 = (RecyclerView) j3.q(viewInflate, R.id.recycler_view_fav);
                            if (recyclerView2 != null) {
                                return new hj.m0((ConstraintLayout) viewInflate, d3VarA, textView, textView2, progressBar, recyclerView, recyclerView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
