package jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import ay.g0;
import com.lingo.lingoskill.base.refill.k;
import com.lingo.lingoskill.japanskill.ui.speak.object.JPPodQuesWord;
import com.lingo.lingoskill.japanskill.ui.speak.object.JPPodSentence;
import com.lingo.lingoskill.japanskill.ui.speak.object.JPPodWord;
import com.lingodeer.R;
import kotlin.jvm.internal.m;
import oo.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends h<JPPodWord, JPPodQuesWord, JPPodSentence> {
    @Override // oo.h
    public final g0 x() {
        k kVar;
        String str;
        String str2;
        if (r().keyLanguage == 1) {
            kVar = new k("http://192.168.31.31:1818/AdminZG/", 0);
            str = r().jsDataDir;
            str2 = "JPPodLesson";
        } else {
            kVar = new k("http://192.168.31.31:3838/AdminZG/", 0);
            str = r().jpupDataDir;
            str2 = "JPUPPodLesson";
        }
        return ep.a.a(str, str2, kVar);
    }

    @Override // oo.h
    public final void y() {
        new bm.a(this, 5);
    }

    @Override // oo.h
    public final void z() {
        if (this.P == null) {
            this.P = LayoutInflater.from(this.f36398d).inflate(R.layout.layout_js_lesson_test_setting_dialog_2, (ViewGroup) null, false);
        }
        View view = this.P;
        m.c(view);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.rg_chinese_display);
        radioGroup.setOnCheckedChangeListener(new cn.a(this, 6));
        View childAt = radioGroup.getChildAt(r().jsDisPlay);
        m.d(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
        ((RadioButton) childAt).setChecked(true);
    }
}
