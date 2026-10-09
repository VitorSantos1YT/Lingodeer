package ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.lingo.lingoskill.chineseskill.ui.pinyin.adapter.PinyinLessonStudySimpleAdapter;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.q4;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class q extends bp.m implements a {
    public xi.c O;
    public PinyinLessonStudySimpleAdapter P;
    public PinyinLessonStudySimpleAdapter Q;
    public a9.i R;
    public ImageView S;

    public q() {
        super(p.f53006a, BuildConfig.VERSION_NAME);
    }

    @Override // ui.a
    public final HashMap k(xi.c pinyinLesson) {
        kotlin.jvm.internal.m.f(pinyinLesson, "pinyinLesson");
        HashMap map = new HashMap();
        e00.i iVarA = kotlin.jvm.internal.l.a(pinyinLesson.f56098d.split(";"));
        while (iVarA.hasNext()) {
            String str = (String) iVarA.next();
            qy.q qVar = fv.f.f28191a;
            kotlin.jvm.internal.m.c(str);
            map.put(fv.f.d(str), fv.f.e(str));
        }
        e00.i iVarA2 = kotlin.jvm.internal.l.a(pinyinLesson.f56099e.split(";"));
        while (iVarA2.hasNext()) {
            String str2 = (String) iVarA2.next();
            qy.q qVar2 = fv.f.f28191a;
            kotlin.jvm.internal.m.c(str2);
            map.put(fv.f.f(1, str2), fv.f.g(1, str2));
        }
        return map;
    }

    @Override // ji.e
    public final void q() {
        a9.i iVar = this.R;
        if (iVar != null) {
            iVar.y();
            a9.i iVar2 = this.R;
            kotlin.jvm.internal.m.c(iVar2);
            iVar2.l();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        this.O = (xi.c) requireArguments().getParcelable(INTENTS.EXTRA_OBJECT);
        a9.i iVar = new a9.i(1);
        this.R = iVar;
        iVar.f521e = new k(this, 1);
        x();
        y();
        z();
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        bq.z.b(((q4) aVar).f33159b, new s0.a(this, 11));
    }

    public void x() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xi.a("b", getString(R.string.cn_alp_b_in_bed)));
        arrayList.add(new xi.a("p", getString(R.string.cn_alp_p_in_pig)));
        arrayList.add(new xi.a("m", getString(R.string.cn_alp_m_in_money)));
        arrayList.add(new xi.a("f", getString(R.string.cn_alp_f_in_four)));
        arrayList.add(new xi.a("d", getString(R.string.cn_alp_d_dog)));
        arrayList.add(new xi.a("t", getString(R.string.cn_alp_t_in_top)));
        arrayList.add(new xi.a("n", getString(R.string.cn_alp_n_in_nest)));
        arrayList.add(new xi.a("l", getString(R.string.cn_alp_l_in_lady)));
        this.Q = new PinyinLessonStudySimpleAdapter(arrayList, new o(this, 1));
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((q4) aVar).f33161d.setLayoutManager(new GridLayoutManager(4));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((q4) aVar2).f33161d.setAdapter(this.Q);
    }

    public void y() {
        ArrayList arrayList = new ArrayList();
        xi.a aVar = new xi.a("a", getString(R.string.cn_alp_a_in_father));
        xi.a aVar2 = new xi.a("ai", getString(R.string.cn_alp_y_in_my));
        xi.a aVar3 = new xi.a("ao", getString(R.string.cn_alp_ow_in_how));
        xi.a aVar4 = new xi.a("an", getString(R.string.cn_alp_aren_in_arent));
        xi.a aVar5 = new xi.a("ang", getString(R.string.cn_alp_ang_in_mango));
        arrayList.add(aVar);
        arrayList.add(aVar2);
        arrayList.add(aVar3);
        arrayList.add(aVar4);
        arrayList.add(aVar5);
        this.P = new PinyinLessonStudySimpleAdapter(arrayList, new o(this, 0));
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        ((q4) aVar6).f33160c.setLayoutManager(new GridLayoutManager(4));
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        ((q4) aVar7).f33160c.setAdapter(this.P);
    }

    public void z() {
        xi.c cVar = this.O;
        kotlin.jvm.internal.m.c(cVar);
        String str = cVar.f56096b;
        kotlin.jvm.internal.m.e(str, "getLessonName(...)");
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(str, mVar, view);
        if (ry.l.D(new Integer[]{18, 57, 51}, Integer.valueOf(r().locateLanguage))) {
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ((q4) aVar).f33165h.setVisibility(8);
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((q4) aVar2).f33164g.setVisibility(8);
            return;
        }
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((q4) aVar3).f33165h.setVisibility(0);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((q4) aVar4).f33164g.setVisibility(0);
    }
}
