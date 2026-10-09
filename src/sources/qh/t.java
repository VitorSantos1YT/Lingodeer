package qh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingodeer.R;
import fr.j3;
import hj.e1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f47783a = new t(1, e1.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityWordGameIndexBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_word_game_index, (ViewGroup) null, false);
        int i11 = R.id.iv_close;
        if (((ImageView) j3.q(viewInflate, R.id.iv_close)) != null) {
            i11 = R.id.ll_items;
            LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_items);
            if (linearLayout != null) {
                i11 = R.id.progress_bar;
                ProgressBar progressBar = (ProgressBar) j3.q(viewInflate, R.id.progress_bar);
                if (progressBar != null) {
                    i11 = R.id.status_bar_view;
                    View viewQ = j3.q(viewInflate, R.id.status_bar_view);
                    if (viewQ != null) {
                        return new e1((ConstraintLayout) viewInflate, linearLayout, progressBar, viewQ);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
