package cn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.lingo.lingoskill.koreanskill.ui.speak.object.KOPodQuesWord;
import com.lingo.lingoskill.koreanskill.ui.speak.object.KOPodSentence;
import com.lingo.lingoskill.koreanskill.ui.speak.object.KOPodWord;
import com.lingodeer.R;
import java.util.List;
import kotlin.jvm.internal.m;
import oo.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends d0<KOPodWord, KOPodQuesWord, KOPodSentence> {
    @Override // oo.d0
    public final void A() {
        if (this.V == null) {
            this.V = LayoutInflater.from(this.f36398d).inflate(R.layout.layout_ko_lesson_test_setting_dialog_2, (ViewGroup) null, false);
        }
        View view = this.V;
        m.c(view);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.rg_chinese_display);
        radioGroup.setOnCheckedChangeListener(new a(this, 1));
        View childAt = radioGroup.getChildAt(r().koDisPlay);
        m.d(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
        ((RadioButton) childAt).setChecked(true);
    }

    @Override // oo.d0
    public final List x(int i11) {
        return hz.b.E(i11);
    }
}
