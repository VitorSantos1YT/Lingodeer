package ci;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.d3;
import hj.e3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f7157a = new w(1, hj.i.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityArSyllableTestIndexBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_ar_syllable_test_index, (ViewGroup) null, false);
        int i11 = R.id.app_bar;
        View viewQ = j3.q(viewInflate, R.id.app_bar);
        if (viewQ != null) {
            d3.a(viewQ);
            i11 = R.id.btn_practice;
            MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_practice);
            if (materialButton != null) {
                i11 = R.id.fl_container;
                if (((FrameLayout) j3.q(viewInflate, R.id.fl_container)) != null) {
                    i11 = R.id.ll_download;
                    View viewQ2 = j3.q(viewInflate, R.id.ll_download);
                    if (viewQ2 != null) {
                        return new hj.i((ConstraintLayout) viewInflate, materialButton, e3.a(viewQ2));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
