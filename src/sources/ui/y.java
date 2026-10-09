package ui;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.lingo.lingoskill.chineseskill.ui.pinyin.adapter.PinyinLessonStudySimpleAdapter;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingodeer.R;
import hj.q4;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends q {
    @Override // ui.q
    public final void x() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xi.a("u", getString(R.string.cn_alp_oo_in_book)));
        arrayList.add(new xi.a("ua", getString(R.string.cn_alp_oo_in_book_plus_a_in_father)));
        arrayList.add(new xi.a("uai", getString(R.string.cn_alp_why)));
        arrayList.add(new xi.a("uan", getString(R.string.cn_alp_one)));
        arrayList.add(new xi.a("uang", getString(R.string.cn_alp_oo_in_book_plus_un_in_uncle)));
        arrayList.add(new xi.a("ui", getString(R.string.cn_alp_way)));
        arrayList.add(new xi.a("un", getString(R.string.cn_alp_oun_in_wound)));
        arrayList.add(new xi.a("ueng", getString(R.string.cn_alp_oo_in_book_plus_ung_in_hung)));
        arrayList.add(new xi.a("uo", getString(R.string.cn_alp_w_in_war)));
        this.P = new PinyinLessonStudySimpleAdapter(arrayList, new x(this, 1));
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((q4) aVar).f33160c.setLayoutManager(new GridLayoutManager(4));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((q4) aVar2).f33160c.setAdapter(this.P);
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
        ((q4) aVar).f33162e.setText(getString(R.string.pinyin_lesson_5_desc));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((q4) aVar2).f33164g.setText(getString(R.string.pinyin_lesson_5_tips));
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((q4) aVar3).f33163f.setText(getString(R.string.pinyin_lesson_5_desc_2));
    }

    @Override // ui.q
    public final void y() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xi.a("z", getString(R.string.cn_alp_ds_in_kids)));
        arrayList.add(new xi.a("c", getString(R.string.cn_alp_ts_in_pants)));
        arrayList.add(new xi.a("s", getString(R.string.cn_alp_s_in_see)));
        arrayList.add(new xi.a("r", getString(R.string.cn_alp_r_in_raw)));
        arrayList.add(new xi.a("zh", getString(R.string.cn_alp_g_in_merge)));
        arrayList.add(new xi.a("ch", getString(R.string.cn_alp_ch_in_teacher)));
        arrayList.add(new xi.a(bjXGJ.edYJHfwfp, getString(R.string.cn_alp_sh_in_shirt)));
        arrayList.add(new xi.a("w", getString(R.string.cn_alp_w_in_war)));
        this.Q = new PinyinLessonStudySimpleAdapter(arrayList, new x(this, 0));
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((q4) aVar).f33161d.setLayoutManager(new GridLayoutManager(4));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((q4) aVar2).f33161d.setAdapter(this.Q);
    }
}
