package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r4 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r4 f4794a = new r4(1, hj.s0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityRefundBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_refund, (ViewGroup) null, false);
        if (viewInflate != null) {
            return new hj.s0((LinearLayout) viewInflate, 0);
        }
        throw new NullPointerException("rootView");
    }
}
