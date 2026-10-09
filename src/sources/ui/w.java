package ui;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.lingo.lingoskill.chineseskill.ui.pinyin.adapter.PinyinLessonStudySimpleAdapter;
import com.lingodeer.R;
import hj.q4;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends q {
    @Override // ui.q
    public final void x() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xi.a("i", getString(R.string.cn_alp_ee_in_tee)));
        arrayList.add(new xi.a("ia", getString(R.string.cn_alp_ya_in_hi_ya)));
        arrayList.add(new xi.a("ian", getString(R.string.cn_alp_icon_in_million)));
        arrayList.add(new xi.a("iang", getString(R.string.cn_alp_young)));
        arrayList.add(new xi.a("ie", getString(R.string.cn_alp_ye_in_yes)));
        arrayList.add(new xi.a("iong", getString(R.string.cn_alp_i_in_pin_plus_ong_in_long)));
        arrayList.add(new xi.a("iu", getString(R.string.cn_alp_you)));
        arrayList.add(new xi.a("in", getString(R.string.cn_alp_inn)));
        arrayList.add(new xi.a("ing", getString(R.string.cn_alp_en_in_english)));
        this.P = new PinyinLessonStudySimpleAdapter(arrayList, new v(this, 1));
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
        arrayList.add(new xi.a("j", getString(R.string.cn_alp_j_in_jeep)));
        arrayList.add(new xi.a("q", getString(R.string.cn_alp_q_in_chin)));
        arrayList.add(new xi.a("x", getString(R.string.cn_alp_sh_in_shy)));
        arrayList.add(new xi.a("y", getString(R.string.cn_alp_y_in_yes)));
        this.Q = new PinyinLessonStudySimpleAdapter(arrayList, new v(this, 0));
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
        ((q4) aVar).f33162e.setText(getString(R.string.pinyin_lesson_4_desc_1));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((q4) aVar2).f33164g.setText(getString(R.string.pinyin_lesson_4_tips));
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((q4) aVar3).f33163f.setText(getString(R.string.pinyin_lesson_4_desc_2));
    }
}
