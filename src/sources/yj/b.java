package yj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.lingodeer.R;
import fr.j3;
import hj.e3;
import hj.z3;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b extends j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f57861a = new b(1, z3.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/FragmentEnSyllableIntorductionBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_en_syllable_intorduction, (ViewGroup) null, false);
        int i11 = R.id.ll_center;
        LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_center);
        if (linearLayout != null) {
            i11 = R.id.ll_color;
            LinearLayout linearLayout2 = (LinearLayout) j3.q(viewInflate, R.id.ll_color);
            if (linearLayout2 != null) {
                i11 = R.id.ll_download;
                View viewQ = j3.q(viewInflate, R.id.ll_download);
                if (viewQ != null) {
                    e3 e3VarA = e3.a(viewQ);
                    i11 = R.id.ll_grey;
                    LinearLayout linearLayout3 = (LinearLayout) j3.q(viewInflate, R.id.ll_grey);
                    if (linearLayout3 != null) {
                        i11 = R.id.ll_parent;
                        if (((LinearLayout) j3.q(viewInflate, R.id.ll_parent)) != null) {
                            i11 = R.id.rv_1;
                            RecyclerView recyclerView = (RecyclerView) j3.q(viewInflate, R.id.rv_1);
                            if (recyclerView != null) {
                                i11 = R.id.rv_2;
                                RecyclerView recyclerView2 = (RecyclerView) j3.q(viewInflate, R.id.rv_2);
                                if (recyclerView2 != null) {
                                    i11 = R.id.rv_3;
                                    RecyclerView recyclerView3 = (RecyclerView) j3.q(viewInflate, R.id.rv_3);
                                    if (recyclerView3 != null) {
                                        i11 = R.id.rv_4;
                                        RecyclerView recyclerView4 = (RecyclerView) j3.q(viewInflate, R.id.rv_4);
                                        if (recyclerView4 != null) {
                                            return new z3((LinearLayout) viewInflate, linearLayout, linearLayout2, e3VarA, linearLayout3, recyclerView, recyclerView2, recyclerView3, recyclerView4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
