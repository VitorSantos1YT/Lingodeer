package li;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingodeer.R;
import fr.j3;
import hj.z0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i extends j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f40172a = new i(1, z0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivitySubscriptionSuccessBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_subscription_success, (ViewGroup) null, false);
        int i11 = R.id.iv_close;
        ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_close);
        if (imageView != null) {
            i11 = R.id.iv_main;
            if (((ImageView) j3.q(viewInflate, R.id.iv_main)) != null) {
                i11 = R.id.iv_success;
                if (((ImageView) j3.q(viewInflate, R.id.iv_success)) != null) {
                    i11 = R.id.status_bar_view;
                    View viewQ = j3.q(viewInflate, R.id.status_bar_view);
                    if (viewQ != null) {
                        return new z0((ConstraintLayout) viewInflate, imageView, viewQ);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
