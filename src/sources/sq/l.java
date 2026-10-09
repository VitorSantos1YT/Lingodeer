package sq;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bq.z;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.vtskill.ui.syllable.adapter.VTSyllableIntroAdapter;
import com.lingodeer.R;
import hj.t5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import qp.n2;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends a {
    public a9.i O;
    public final cm.a P;
    public final k Q;
    public final String R;
    public final String S;
    public final String T;
    public final String U;
    public final String V;
    public final String W;
    public final String X;
    public final String Y;
    public final String Z;

    public l() {
        super(j.f51748a, "AlphabetIntro");
        this.P = new cm.a();
        this.Q = new k();
        this.R = "A a\tĂ ă\tÂ â\tB b\tC c\tD d\tĐ đ\tE e\tÊ ê\tG g\tH h\tI i\tK k\tL l\tM m\tN n\tO o\tÔ ô\tƠ ơ\tP p\tQ q\tR r\tS s\tT t\tU u\tƯ ư\tV v\tX x\tY y";
        this.S = "Ă (ă)\tÂ (â)\tÊ (ê)\tÔ (ô)\tƠ (ơ)\tƯ (ư)";
        this.T = "c\tn\tm\tp\tt\tng\tnh\tch";
        this.U = "a\tà\tã\tả\tá\tạ";
        this.V = "a\tă\tâ\te\tê\ti\ty\to\tô\tơ\tu\tư";
        this.W = "ai\tao\tau\tâu\tay\tây\teo\têu\tia\tiê/yê\tiu\toa\toă\toe\toi\tôi\tơi\too\tôô\tua\tuă\tuâ\tưa\tuê\tui\tưi\tuo\tuô\tuơ\tươ\tưu\tuy";
        this.X = "iêu\toai\toao\toeo\tuao\tuây\tuôi\tươi\tươu\tuya\tuyê\tuyu";
        this.Y = "b\tc\td\tđ\tg\th\tk\tl\tm\tn\tp\tr\tq\ts\tt\tv\tx";
        this.Z = "ph\tth\ttr\tch\tnh\tng\tngh\tgh\tgi\tkh";
    }

    @Override // bp.m, androidx.fragment.app.k0
    public final void onPause() {
        MediaPlayer mediaPlayer;
        super.onPause();
        a9.i iVar = this.O;
        if (iVar == null || (mediaPlayer = (MediaPlayer) iVar.f519c) == null || !mediaPlayer.isPlaying()) {
            return;
        }
        ((MediaPlayer) iVar.f519c).pause();
    }

    @Override // ji.e
    public final void q() {
        a9.i iVar = this.O;
        if (iVar != null) {
            kotlin.jvm.internal.m.c(iVar);
            iVar.l();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        final int i11;
        final int i12;
        t().c("jxz_alphabet_click_intro", new m9(26));
        String string = getString(R.string.introduction);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        p0 p0VarRequireActivity = requireActivity();
        kotlin.jvm.internal.m.d(p0VarRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        View viewRequireView = requireView();
        kotlin.jvm.internal.m.e(viewRequireView, "requireView(...)");
        ve.i.H(string, (l.m) p0VarRequireActivity, viewRequireView);
        final int i13 = 1;
        this.O = new a9.i(1);
        final int i14 = 0;
        String[] strArr = (String[]) oz.q.W0(this.R, new String[]{"\t"}, 0, 6).toArray(new String[0]);
        int length = strArr.length;
        int i15 = 0;
        while (true) {
            i11 = 2;
            if (i15 >= length) {
                break;
            }
            String str = strArr[i15];
            View viewInflate = LayoutInflater.from(this.f36398d).inflate(R.layout.item_pinyin_lesson_study_text, (ViewGroup) null, false);
            kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewInflate;
            textView.setText(str);
            z.b(textView, new h(str, this, 2));
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ((t5) aVar).f33352c.addView(textView);
            i15++;
        }
        String[] strArr2 = (String[]) oz.q.W0(this.S, new String[]{"\t"}, 0, 6).toArray(new String[0]);
        int length2 = strArr2.length;
        int i16 = 0;
        while (true) {
            i12 = 3;
            if (i16 >= length2) {
                break;
            }
            String str2 = strArr2[i16];
            View viewInflate2 = LayoutInflater.from(this.f36398d).inflate(R.layout.item_pinyin_lesson_study_text, (ViewGroup) null, false);
            kotlin.jvm.internal.m.d(viewInflate2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) viewInflate2;
            textView2.setText(str2);
            z.b(textView2, new h(str2, this, 3));
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((t5) aVar2).f33353d.addView(textView2);
            i16++;
        }
        for (String str3 : (String[]) oz.q.W0(this.T, new String[]{"\t"}, 0, 6).toArray(new String[0])) {
            View viewInflate3 = LayoutInflater.from(this.f36398d).inflate(R.layout.item_pinyin_lesson_study_text, (ViewGroup) null, false);
            kotlin.jvm.internal.m.d(viewInflate3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView3 = (TextView) viewInflate3;
            textView3.setText(str3);
            z.b(textView3, new h(this, str3, 0));
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ((t5) aVar3).f33354e.addView(textView3);
        }
        for (String str4 : (String[]) oz.q.W0(this.U, new String[]{"\t"}, 0, 6).toArray(new String[0])) {
            View viewInflate4 = LayoutInflater.from(this.f36398d).inflate(R.layout.item_pinyin_lesson_study_text, (ViewGroup) null, false);
            kotlin.jvm.internal.m.d(viewInflate4, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView4 = (TextView) viewInflate4;
            textView4.setText(str4);
            z.b(textView4, new h(this, str4, 1));
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            ((t5) aVar4).f33355f.addView(textView4);
        }
        String[] strArr3 = (String[]) oz.q.W0(this.V, new String[]{"\t"}, 0, 6).toArray(new String[0]);
        final List listAsList = Arrays.asList(Arrays.copyOf(strArr3, strArr3.length));
        kotlin.jvm.internal.m.c(listAsList);
        VTSyllableIntroAdapter vTSyllableIntroAdapter = new VTSyllableIntroAdapter(R.layout.vi_syllable_recycler_item_intro, listAsList);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        RecyclerView recyclerView = ((t5) aVar5).f33359j;
        getContext();
        final int i17 = 4;
        recyclerView.setLayoutManager(new GridLayoutManager(4));
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        ((t5) aVar6).f33359j.setAdapter(vTSyllableIntroAdapter);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        RecyclerView recyclerView2 = ((t5) aVar7).f33359j;
        k kVar = this.Q;
        recyclerView2.addItemDecoration(kVar);
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        ((t5) aVar8).f33359j.setNestedScrollingEnabled(false);
        vTSyllableIntroAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener(this) { // from class: sq.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f51746b;

            {
                this.f51746b = this;
            }

            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i18) {
                switch (i17) {
                    case 0:
                        Object obj = listAsList.get(i18);
                        kotlin.jvm.internal.m.e(obj, "get(...)");
                        this.f51746b.y((String) obj);
                        break;
                    case 1:
                        Object obj2 = listAsList.get(i18);
                        kotlin.jvm.internal.m.e(obj2, "get(...)");
                        this.f51746b.y((String) obj2);
                        break;
                    case 2:
                        Object obj3 = listAsList.get(i18);
                        kotlin.jvm.internal.m.e(obj3, "get(...)");
                        this.f51746b.y((String) obj3);
                        break;
                    case 3:
                        Object obj4 = listAsList.get(i18);
                        kotlin.jvm.internal.m.e(obj4, "get(...)");
                        this.f51746b.y((String) obj4);
                        break;
                    default:
                        Object obj5 = listAsList.get(i18);
                        kotlin.jvm.internal.m.e(obj5, "get(...)");
                        this.f51746b.y((String) obj5);
                        break;
                }
            }
        });
        String[] strArr4 = (String[]) oz.q.W0(this.W, new String[]{"\t"}, 0, 6).toArray(new String[0]);
        final List listAsList2 = Arrays.asList(Arrays.copyOf(strArr4, strArr4.length));
        kotlin.jvm.internal.m.c(listAsList2);
        VTSyllableIntroAdapter vTSyllableIntroAdapter2 = new VTSyllableIntroAdapter(R.layout.vi_syllable_recycler_item_intro, listAsList2);
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        RecyclerView recyclerView3 = ((t5) aVar9).f33357h;
        getContext();
        recyclerView3.setLayoutManager(new GridLayoutManager(4));
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        ((t5) aVar10).f33357h.setAdapter(vTSyllableIntroAdapter2);
        ta.a aVar11 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar11);
        ((t5) aVar11).f33357h.addItemDecoration(kVar);
        ta.a aVar12 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar12);
        ((t5) aVar12).f33357h.setNestedScrollingEnabled(false);
        vTSyllableIntroAdapter2.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener(this) { // from class: sq.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f51746b;

            {
                this.f51746b = this;
            }

            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i18) {
                switch (i11) {
                    case 0:
                        Object obj = listAsList2.get(i18);
                        kotlin.jvm.internal.m.e(obj, "get(...)");
                        this.f51746b.y((String) obj);
                        break;
                    case 1:
                        Object obj2 = listAsList2.get(i18);
                        kotlin.jvm.internal.m.e(obj2, "get(...)");
                        this.f51746b.y((String) obj2);
                        break;
                    case 2:
                        Object obj3 = listAsList2.get(i18);
                        kotlin.jvm.internal.m.e(obj3, "get(...)");
                        this.f51746b.y((String) obj3);
                        break;
                    case 3:
                        Object obj4 = listAsList2.get(i18);
                        kotlin.jvm.internal.m.e(obj4, "get(...)");
                        this.f51746b.y((String) obj4);
                        break;
                    default:
                        Object obj5 = listAsList2.get(i18);
                        kotlin.jvm.internal.m.e(obj5, "get(...)");
                        this.f51746b.y((String) obj5);
                        break;
                }
            }
        });
        String[] strArr5 = (String[]) oz.q.W0(this.X, new String[]{"\t"}, 0, 6).toArray(new String[0]);
        final List listAsList3 = Arrays.asList(Arrays.copyOf(strArr5, strArr5.length));
        kotlin.jvm.internal.m.c(listAsList3);
        VTSyllableIntroAdapter vTSyllableIntroAdapter3 = new VTSyllableIntroAdapter(R.layout.vi_syllable_recycler_item_intro, listAsList3);
        ta.a aVar13 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar13);
        RecyclerView recyclerView4 = ((t5) aVar13).f33360k;
        getContext();
        recyclerView4.setLayoutManager(new GridLayoutManager(4));
        ta.a aVar14 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar14);
        ((t5) aVar14).f33360k.setAdapter(vTSyllableIntroAdapter3);
        ta.a aVar15 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar15);
        ((t5) aVar15).f33360k.addItemDecoration(kVar);
        ta.a aVar16 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar16);
        ((t5) aVar16).f33360k.setNestedScrollingEnabled(false);
        vTSyllableIntroAdapter3.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener(this) { // from class: sq.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f51746b;

            {
                this.f51746b = this;
            }

            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i18) {
                switch (i13) {
                    case 0:
                        Object obj = listAsList3.get(i18);
                        kotlin.jvm.internal.m.e(obj, "get(...)");
                        this.f51746b.y((String) obj);
                        break;
                    case 1:
                        Object obj2 = listAsList3.get(i18);
                        kotlin.jvm.internal.m.e(obj2, "get(...)");
                        this.f51746b.y((String) obj2);
                        break;
                    case 2:
                        Object obj3 = listAsList3.get(i18);
                        kotlin.jvm.internal.m.e(obj3, "get(...)");
                        this.f51746b.y((String) obj3);
                        break;
                    case 3:
                        Object obj4 = listAsList3.get(i18);
                        kotlin.jvm.internal.m.e(obj4, "get(...)");
                        this.f51746b.y((String) obj4);
                        break;
                    default:
                        Object obj5 = listAsList3.get(i18);
                        kotlin.jvm.internal.m.e(obj5, "get(...)");
                        this.f51746b.y((String) obj5);
                        break;
                }
            }
        });
        String[] strArr6 = (String[]) oz.q.W0(this.Y, new String[]{"\t"}, 0, 6).toArray(new String[0]);
        final List listAsList4 = Arrays.asList(Arrays.copyOf(strArr6, strArr6.length));
        kotlin.jvm.internal.m.c(listAsList4);
        VTSyllableIntroAdapter vTSyllableIntroAdapter4 = new VTSyllableIntroAdapter(R.layout.vi_syllable_recycler_item_intro, listAsList4);
        ta.a aVar17 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar17);
        RecyclerView recyclerView5 = ((t5) aVar17).f33358i;
        getContext();
        recyclerView5.setLayoutManager(new GridLayoutManager(4));
        ta.a aVar18 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar18);
        ((t5) aVar18).f33358i.setAdapter(vTSyllableIntroAdapter4);
        ta.a aVar19 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar19);
        ((t5) aVar19).f33358i.addItemDecoration(kVar);
        ta.a aVar20 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar20);
        ((t5) aVar20).f33358i.setNestedScrollingEnabled(false);
        vTSyllableIntroAdapter4.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener(this) { // from class: sq.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f51746b;

            {
                this.f51746b = this;
            }

            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i18) {
                switch (i12) {
                    case 0:
                        Object obj = listAsList4.get(i18);
                        kotlin.jvm.internal.m.e(obj, "get(...)");
                        this.f51746b.y((String) obj);
                        break;
                    case 1:
                        Object obj2 = listAsList4.get(i18);
                        kotlin.jvm.internal.m.e(obj2, "get(...)");
                        this.f51746b.y((String) obj2);
                        break;
                    case 2:
                        Object obj3 = listAsList4.get(i18);
                        kotlin.jvm.internal.m.e(obj3, "get(...)");
                        this.f51746b.y((String) obj3);
                        break;
                    case 3:
                        Object obj4 = listAsList4.get(i18);
                        kotlin.jvm.internal.m.e(obj4, "get(...)");
                        this.f51746b.y((String) obj4);
                        break;
                    default:
                        Object obj5 = listAsList4.get(i18);
                        kotlin.jvm.internal.m.e(obj5, "get(...)");
                        this.f51746b.y((String) obj5);
                        break;
                }
            }
        });
        String[] strArr7 = (String[]) oz.q.W0(this.Z, new String[]{"\t"}, 0, 6).toArray(new String[0]);
        final List listAsList5 = Arrays.asList(Arrays.copyOf(strArr7, strArr7.length));
        kotlin.jvm.internal.m.c(listAsList5);
        VTSyllableIntroAdapter vTSyllableIntroAdapter5 = new VTSyllableIntroAdapter(R.layout.vi_syllable_recycler_item_intro, listAsList5);
        ta.a aVar21 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar21);
        RecyclerView recyclerView6 = ((t5) aVar21).f33356g;
        getContext();
        recyclerView6.setLayoutManager(new GridLayoutManager(4));
        ta.a aVar22 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar22);
        ((t5) aVar22).f33356g.setAdapter(vTSyllableIntroAdapter5);
        ta.a aVar23 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar23);
        ((t5) aVar23).f33356g.addItemDecoration(kVar);
        ta.a aVar24 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar24);
        ((t5) aVar24).f33356g.setNestedScrollingEnabled(false);
        vTSyllableIntroAdapter5.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener(this) { // from class: sq.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f51746b;

            {
                this.f51746b = this;
            }

            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i18) {
                switch (i14) {
                    case 0:
                        Object obj = listAsList5.get(i18);
                        kotlin.jvm.internal.m.e(obj, "get(...)");
                        this.f51746b.y((String) obj);
                        break;
                    case 1:
                        Object obj2 = listAsList5.get(i18);
                        kotlin.jvm.internal.m.e(obj2, "get(...)");
                        this.f51746b.y((String) obj2);
                        break;
                    case 2:
                        Object obj3 = listAsList5.get(i18);
                        kotlin.jvm.internal.m.e(obj3, "get(...)");
                        this.f51746b.y((String) obj3);
                        break;
                    case 3:
                        Object obj4 = listAsList5.get(i18);
                        kotlin.jvm.internal.m.e(obj4, "get(...)");
                        this.f51746b.y((String) obj4);
                        break;
                    default:
                        Object obj5 = listAsList5.get(i18);
                        kotlin.jvm.internal.m.e(obj5, "get(...)");
                        this.f51746b.y((String) obj5);
                        break;
                }
            }
        });
        ta.a aVar25 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar25);
        TextView textView5 = ((t5) aVar25).f33366r.f32581f;
        ta.a aVar26 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar26);
        LinearLayout linearLayout = ((t5) aVar26).f33366r.f32578c;
        ta.a aVar27 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar27);
        TextView textView6 = ((t5) aVar27).f33366r.f32582g;
        ta.a aVar28 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar28);
        LinearLayout linearLayout2 = ((t5) aVar28).f33366r.f32579d;
        ta.a aVar29 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar29);
        TextView textView7 = ((t5) aVar29).f33366r.f32583h;
        ta.a aVar30 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar30);
        LinearLayout linearLayout3 = ((t5) aVar30).f33366r.f32580e;
        ta.a aVar31 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar31);
        TextView textView8 = ((t5) aVar31).f33361l;
        ta.a aVar32 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar32);
        TextView textView9 = ((t5) aVar32).m;
        ta.a aVar33 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar33);
        TextView textView10 = ((t5) aVar33).f33362n;
        ta.a aVar34 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar34);
        TextView textView11 = ((t5) aVar34).f33363o;
        ta.a aVar35 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar35);
        TextView textView12 = ((t5) aVar35).f33364p;
        ta.a aVar36 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar36);
        View[] viewArr = {textView5, linearLayout, textView6, linearLayout2, textView7, linearLayout3, textView8, textView9, textView10, textView11, textView12, ((t5) aVar36).f33365q};
        for (int i18 = 0; i18 < 12; i18++) {
            View view = viewArr[i18];
            kotlin.jvm.internal.m.c(view);
            z.b(view, new n2(19, view, this));
        }
        ta.a aVar37 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar37);
        z.b(((t5) aVar37).f33351b, new s0.a(this, 5));
    }

    @Override // sq.a
    public final HashMap x(pq.b lesson) {
        cm.a aVar;
        kotlin.jvm.internal.m.f(lesson, "lesson");
        HashMap map = new HashMap();
        int i11 = 0;
        String[] strArr = (String[]) oz.q.W0(this.R, new String[]{"\t"}, 0, 6).toArray(new String[0]);
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i12 = 0;
        while (true) {
            aVar = this.P;
            if (i12 >= length) {
                break;
            }
            String str = ((String[]) oz.q.W0(strArr[i12], new String[]{" "}, 0, 6).toArray(new String[0]))[1];
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
            qy.q qVar = fv.b.f28186a;
            String strA = aVar.a(str);
            kotlin.jvm.internal.m.e(strA, "getCharName(...)");
            String strA2 = fv.b.a(strA, null, null);
            String strA3 = aVar.a(str);
            kotlin.jvm.internal.m.e(strA3, "getCharName(...)");
            map.put(strA2, fv.b.e(strA3));
            i12++;
        }
        for (String str2 : (String[]) oz.q.W0(this.T, new String[]{"\t"}, 0, 6).toArray(new String[0])) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
            qy.q qVar2 = fv.b.f28186a;
            String strA4 = aVar.a(str2);
            kotlin.jvm.internal.m.e(strA4, "getCharName(...)");
            String strA5 = fv.b.a(strA4, null, null);
            String strA6 = aVar.a(str2);
            kotlin.jvm.internal.m.e(strA6, "getCharName(...)");
            map.put(strA5, fv.b.e(strA6));
        }
        for (String str3 : (String[]) oz.q.W0(this.U, new String[]{"\t"}, 0, 6).toArray(new String[0])) {
            if (!arrayList.contains(str3)) {
                arrayList.add(str3);
            }
            qy.q qVar3 = fv.b.f28186a;
            String strA7 = aVar.a(str3);
            kotlin.jvm.internal.m.e(strA7, "getCharName(...)");
            String strA8 = fv.b.a(strA7, null, null);
            String strA9 = aVar.a(str3);
            kotlin.jvm.internal.m.e(strA9, "getCharName(...)");
            map.put(strA8, fv.b.e(strA9));
        }
        for (String str4 : (String[]) oz.q.W0(this.V, new String[]{"\t"}, 0, 6).toArray(new String[0])) {
            if (!arrayList.contains(str4)) {
                arrayList.add(str4);
            }
            qy.q qVar4 = fv.b.f28186a;
            String strA10 = aVar.a(str4);
            kotlin.jvm.internal.m.e(strA10, "getCharName(...)");
            String strA11 = fv.b.a(strA10, null, null);
            String strA12 = aVar.a(str4);
            kotlin.jvm.internal.m.e(strA12, "getCharName(...)");
            map.put(strA11, fv.b.e(strA12));
        }
        for (String str5 : (String[]) oz.q.W0(this.W, new String[]{"\t"}, 0, 6).toArray(new String[0])) {
            if (!arrayList.contains(str5)) {
                arrayList.add(str5);
            }
            qy.q qVar5 = fv.b.f28186a;
            String strA13 = aVar.a(str5);
            kotlin.jvm.internal.m.e(strA13, "getCharName(...)");
            String strA14 = fv.b.a(strA13, null, null);
            String strA15 = aVar.a(str5);
            kotlin.jvm.internal.m.e(strA15, "getCharName(...)");
            map.put(strA14, fv.b.e(strA15));
        }
        for (String str6 : (String[]) oz.q.W0(this.X, new String[]{"\t"}, 0, 6).toArray(new String[0])) {
            if (!arrayList.contains(str6)) {
                arrayList.add(str6);
            }
            qy.q qVar6 = fv.b.f28186a;
            String strA16 = aVar.a(str6);
            kotlin.jvm.internal.m.e(strA16, "getCharName(...)");
            String strA17 = fv.b.a(strA16, null, null);
            String strA18 = aVar.a(str6);
            kotlin.jvm.internal.m.e(strA18, "getCharName(...)");
            map.put(strA17, fv.b.e(strA18));
        }
        for (String str7 : (String[]) oz.q.W0(this.Y, new String[]{"\t"}, 0, 6).toArray(new String[0])) {
            if (!arrayList.contains(str7)) {
                arrayList.add(str7);
            }
            qy.q qVar7 = fv.b.f28186a;
            String strA19 = aVar.a(str7);
            kotlin.jvm.internal.m.e(strA19, "getCharName(...)");
            String strA20 = fv.b.a(strA19, null, null);
            String strA21 = aVar.a(str7);
            kotlin.jvm.internal.m.e(strA21, "getCharName(...)");
            map.put(strA20, fv.b.e(strA21));
        }
        for (String str8 : (String[]) oz.q.W0(this.Z, new String[]{"\t"}, 0, 6).toArray(new String[0])) {
            if (!arrayList.contains(str8)) {
                arrayList.add(str8);
            }
            qy.q qVar8 = fv.b.f28186a;
            String strA22 = aVar.a(str8);
            kotlin.jvm.internal.m.e(strA22, "getCharName(...)");
            String strA23 = fv.b.a(strA22, null, null);
            String strA24 = aVar.a(str8);
            kotlin.jvm.internal.m.e(strA24, "getCharName(...)");
            map.put(strA23, fv.b.e(strA24));
        }
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            kotlin.jvm.internal.m.e(obj, "next(...)");
            ((String) obj).concat(";");
        }
        return map;
    }

    public final void y(String str) {
        qy.q qVar = fv.b.f28186a;
        String strA = this.P.a(str);
        kotlin.jvm.internal.m.e(strA, "getCharName(...)");
        String strC = fv.b.c(strA, null, null);
        a9.i iVar = this.O;
        kotlin.jvm.internal.m.c(iVar);
        iVar.v(strC);
    }
}
