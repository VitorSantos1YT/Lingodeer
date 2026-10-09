package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c5 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c5 f4526a = new c5(1, hj.u0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivitySettingBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_setting, (ViewGroup) null, false);
        if (((FrameLayout) fr.j3.q(viewInflate, R.id.fl_container)) != null) {
            return new hj.u0((LinearLayout) viewInflate, 0);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.fl_container)));
    }
}
