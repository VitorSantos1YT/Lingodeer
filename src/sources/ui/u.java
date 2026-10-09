package ui;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.lingo.lingoskill.chineseskill.ui.pinyin.adapter.PinyinLessonStudySimpleAdapter;
import com.lingodeer.R;
import hj.q4;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends q {
    @Override // ui.q
    public final void x() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xi.a("e", getString(R.string.cn_alp_ir_in_girl)));
        arrayList.add(new xi.a("ei", getString(R.string.cn_alp_ay_in_lay)));
        arrayList.add(new xi.a("en", getString(R.string.cn_alp_an_in_woman)));
        arrayList.add(new xi.a("eng", getString(R.string.cn_alp_ung_in_hung)));
        arrayList.add(new xi.a("er", getString(R.string.cn_alp_r_letter_name)));
        this.P = new PinyinLessonStudySimpleAdapter(arrayList, new t(this, 1));
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((q4) aVar).f33160c.setLayoutManager(new GridLayoutManager(4));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((q4) aVar2).f33160c.setAdapter(this.P);
    }

    @Override // ui.q
    public final void y() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xi.a("g", getString(R.string.cn_alp_g_in_good)));
        arrayList.add(new xi.a("k", getString(R.string.cn_alp_k_in_king)));
        arrayList.add(new xi.a("h", getString(R.string.cn_alp_h_in_hero)));
        this.Q = new PinyinLessonStudySimpleAdapter(arrayList, new t(this, 0));
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((q4) aVar).f33161d.setLayoutManager(new GridLayoutManager(4));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((q4) aVar2).f33161d.setAdapter(this.Q);
    }

    @Override // ui.q
    public final void z() {
        xi.c cVar = this.O;
        kotlin.jvm.internal.m.c(cVar);
        String str = cVar.f56096b;
        kotlin.jvm.internal.m.e(str, "getLessonName(...)");
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(str, mVar, view);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((q4) aVar).f33162e.setText(getString(R.string.pinyin_lesson_3_desc));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((q4) aVar2).f33164g.setText(getString(R.string.pinyin_lesson_3_tips));
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((q4) aVar3).f33163f.setText(getString(R.string.pinyin_lesson_3_desc_2));
        if (ry.l.D(new Integer[]{18, 57, 51}, Integer.valueOf(r().locateLanguage))) {
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            ((q4) aVar4).f33165h.setVisibility(8);
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            ((q4) aVar5).f33164g.setVisibility(8);
            return;
        }
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        ((q4) aVar6).f33165h.setVisibility(0);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        ((q4) aVar7).f33164g.setVisibility(0);
    }
}
