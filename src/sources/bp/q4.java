package bp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q4 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q4 f4778a = new q4(1, hj.o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityPicTestBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_pic_test, (ViewGroup) null, false);
        int i11 = R.id.btn_clear_cache;
        MaterialButton materialButton = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_clear_cache);
        if (materialButton != null) {
            i11 = R.id.btn_debug_test;
            MaterialButton materialButton2 = (MaterialButton) fr.j3.q(viewInflate, R.id.btn_debug_test);
            if (materialButton2 != null) {
                i11 = R.id.edt_text;
                EditText editText = (EditText) fr.j3.q(viewInflate, R.id.edt_text);
                if (editText != null) {
                    i11 = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) fr.j3.q(viewInflate, R.id.recycler_view);
                    if (recyclerView != null) {
                        i11 = R.id.status_bar_view;
                        View viewQ = fr.j3.q(viewInflate, R.id.status_bar_view);
                        if (viewQ != null) {
                            i11 = R.id.switch_animation;
                            MaterialSwitch materialSwitch = (MaterialSwitch) fr.j3.q(viewInflate, R.id.switch_animation);
                            if (materialSwitch != null) {
                                return new hj.o0((ConstraintLayout) viewInflate, materialButton, materialButton2, editText, recyclerView, viewQ, materialSwitch);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
