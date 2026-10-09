package km;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f38216a = new j(1, hj.x.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityJpHwCharListBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_jp_hw_char_list, (ViewGroup) null, false);
        int i11 = R.id.btn_practice;
        MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_practice);
        if (materialButton != null) {
            i11 = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.recycler_view);
            if (recyclerView != null) {
                return new hj.x((LinearLayout) viewInflate, materialButton, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
