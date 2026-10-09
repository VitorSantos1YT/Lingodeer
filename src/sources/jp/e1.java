package jp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingodeer.R;
import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e1 extends kotlin.jvm.internal.j implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f36466a = new e1(1, hj.u.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/lingo/lingoskill/databinding/ActivityGenFilterSentenceBinding;", 0);

    @Override // fz.c
    public final Object invoke(Object obj) {
        LayoutInflater p4 = (LayoutInflater) obj;
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.activity_gen_filter_sentence, (ViewGroup) null, false);
        int i11 = R.id.btn_filter_one_word_sentence;
        Button button = (Button) j3.q(viewInflate, R.id.btn_filter_one_word_sentence);
        if (button != null) {
            i11 = R.id.btn_go;
            Button button2 = (Button) j3.q(viewInflate, R.id.btn_go);
            if (button2 != null) {
                return new hj.u((ConstraintLayout) viewInflate, button, button2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
