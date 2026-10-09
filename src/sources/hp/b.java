package hp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.lingodeer.R;
import fr.j3;
import fz.f;
import hj.v3;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b extends j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f33686a = new b(3, v3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentCnHandWriteIndexBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_cn_hand_write_index, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.ll_progress;
        LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_progress);
        if (linearLayout != null) {
            i11 = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.recycler_view);
            if (recyclerView != null) {
                i11 = R.id.tv_progress;
                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_progress);
                if (textView != null) {
                    return new v3((ConstraintLayout) viewInflate, linearLayout, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
