package hh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingodeer.R;
import fr.j3;
import hj.e3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f32299a = new u(1, hj.k0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityPdLearnBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_pd_learn, (ViewGroup) null, false);
        int i11 = R.id.fl_container;
        if (((FrameLayout) j3.q(viewInflate, R.id.fl_container)) != null) {
            i11 = R.id.llDownload;
            View viewQ = j3.q(viewInflate, R.id.llDownload);
            if (viewQ != null) {
                e3 e3VarA = e3.a(viewQ);
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                View viewQ2 = j3.q(viewInflate, R.id.status_bar_view);
                if (viewQ2 != null) {
                    return new hj.k0(constraintLayout, e3VarA, viewQ2);
                }
                i11 = R.id.status_bar_view;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
