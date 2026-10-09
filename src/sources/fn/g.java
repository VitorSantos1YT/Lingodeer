package fn;

import a9.i;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b7.e0;
import bp.m;
import bq.z;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.koreanskill.ui.syllable.adapter.DoubleVowelAdapter;
import com.lingo.lingoskill.koreanskill.ui.syllable.adapter.FuyinTableAdapter;
import com.lingo.lingoskill.koreanskill.ui.syllable.adapter.FuyinTableAdapter2;
import com.lingo.lingoskill.koreanskill.ui.syllable.adapter.SingleVowelAdapter;
import com.lingo.lingoskill.koreanskill.ui.syllable.ui.KOYinTuActivity;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.lingodeer.R;
import com.lingodeer.data.model.LearnType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.y5;
import java.util.ArrayList;
import java.util.Arrays;
import qy.b0;
import qy.q;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends m {
    public i O;

    public g() {
        super(f.f27349a, "AlphabetIntro");
        LearnType learnType = LearnType.LEARN;
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        i iVar = this.O;
        if (iVar != null) {
            iVar.y();
        }
    }

    @Override // ji.e
    public final void q() {
        i iVar = this.O;
        if (iVar != null) {
            iVar.y();
            i iVar2 = this.O;
            kotlin.jvm.internal.m.c(iVar2);
            iVar2.l();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        t().c("jxz_alphabet_click_intro", new m9(26));
        String string = getString(R.string.introduction);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(string, mVar, view);
        getContext();
        this.O = new i(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add("ㅏ#a");
        arrayList.add("ㅓ#eo");
        arrayList.add("ㅗ#o");
        arrayList.add("ㅜ#u");
        arrayList.add("ㅡ#eu");
        arrayList.add("ㅣ#i");
        arrayList.add("ㅐ#ae");
        arrayList.add("ㅔ#e");
        i iVar = this.O;
        kotlin.jvm.internal.m.c(iVar);
        SingleVowelAdapter singleVowelAdapter = new SingleVowelAdapter(arrayList, iVar);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        RecyclerView recyclerView = ((y5) aVar).f33638j;
        getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((y5) aVar2).f33638j.setAdapter(singleVowelAdapter);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("ㅑ#ㅣ#ㅏ");
        arrayList2.add("ㅕ#ㅣ#ㅓ");
        arrayList2.add("ㅛ#ㅣ#ㅗ");
        arrayList2.add("ㅠ#ㅣ#ㅜ");
        arrayList2.add("ㅒ#ㅣ#ㅐ");
        arrayList2.add("ㅖ#ㅣ#ㅔ");
        i iVar2 = this.O;
        kotlin.jvm.internal.m.c(iVar2);
        DoubleVowelAdapter doubleVowelAdapter = new DoubleVowelAdapter(arrayList2, iVar2);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        RecyclerView recyclerView2 = ((y5) aVar3).f33634f;
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((y5) aVar4).f33634f.setAdapter(doubleVowelAdapter);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("ㅘ#ㅗ#ㅏ");
        arrayList3.add("ㅚ#ㅗ#ㅣ");
        arrayList3.add("ㅙ#ㅗ#ㅐ");
        arrayList3.add("ㅝ#ㅜ#ㅓ");
        arrayList3.add("ㅟ#ㅜ#ㅣ");
        arrayList3.add("ㅞ#ㅜ#ㅔ");
        arrayList3.add("ㅢ#ㅡ#ㅣ");
        i iVar3 = this.O;
        kotlin.jvm.internal.m.c(iVar3);
        DoubleVowelAdapter doubleVowelAdapter2 = new DoubleVowelAdapter(arrayList3, iVar3);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        RecyclerView recyclerView3 = ((y5) aVar5).f33635g;
        getContext();
        recyclerView3.setLayoutManager(new LinearLayoutManager(1));
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        ((y5) aVar6).f33635g.setAdapter(doubleVowelAdapter2);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add("ㄱ#g/k");
        arrayList4.add("ㄴ#n");
        arrayList4.add("ㄷ#d/t");
        arrayList4.add("ㄹ#r/l");
        arrayList4.add("ㅁ#m");
        arrayList4.add("ㅂ#b/p");
        arrayList4.add("ㅅ#s");
        arrayList4.add("ㅇ#(silent)");
        arrayList4.add("ㅈ#j");
        arrayList4.add("ㅊ#ch");
        arrayList4.add("ㅋ#k");
        arrayList4.add("ㅌ#t");
        arrayList4.add("ㅍ#p");
        arrayList4.add("ㅎ#h");
        i iVar4 = this.O;
        kotlin.jvm.internal.m.c(iVar4);
        SingleVowelAdapter singleVowelAdapter2 = new SingleVowelAdapter(arrayList4, iVar4);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        RecyclerView recyclerView4 = ((y5) aVar7).f33637i;
        getContext();
        recyclerView4.setLayoutManager(new GridLayoutManager(2));
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        ((y5) aVar8).f33637i.setAdapter(singleVowelAdapter2);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("ㄲ#kk");
        arrayList5.add("ㄸ#tt");
        arrayList5.add("ㅃ#pp");
        arrayList5.add("ㅉ#jj");
        arrayList5.add("ㅆ#ss");
        i iVar5 = this.O;
        kotlin.jvm.internal.m.c(iVar5);
        SingleVowelAdapter singleVowelAdapter3 = new SingleVowelAdapter(arrayList5, iVar5);
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        RecyclerView recyclerView5 = ((y5) aVar9).f33636h;
        getContext();
        recyclerView5.setLayoutManager(new GridLayoutManager(2));
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        ((y5) aVar10).f33636h.setAdapter(singleVowelAdapter3);
        final String[] strArr = {getString(R.string.plain), getString(R.string.aspireated), getString(R.string.tense), "ㄱ", "ㅋ", "ㄲ", "ㄷ", "ㅌ", "ㄸ", "ㅂ", "ㅍ", "ㅃ", "ㅈ", "ㅊ", "ㅉ", "ㅅ", BuildConfig.VERSION_NAME, "ㅆ"};
        FuyinTableAdapter fuyinTableAdapter = new FuyinTableAdapter(R.layout.item_fuyin_table, Arrays.asList(Arrays.copyOf(strArr, 18)));
        ta.a aVar11 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar11);
        RecyclerView recyclerView6 = ((y5) aVar11).f33631c;
        getContext();
        recyclerView6.setLayoutManager(new GridLayoutManager(3));
        ta.a aVar12 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar12);
        ((y5) aVar12).f33631c.setAdapter(fuyinTableAdapter);
        final int i11 = 0;
        fuyinTableAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener(this) { // from class: fn.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f27345b;

            {
                this.f27345b = this;
            }

            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i12) {
                switch (i11) {
                    case 0:
                        g gVar = this.f27345b;
                        String[] strArr2 = strArr;
                        i iVar6 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        q qVar = fv.b.f28186a;
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication);
                                }
                                break;
                            }
                        }
                        kotlin.jvm.internal.m.c(wm.a.f55177e);
                        String strA = wm.a.a(strArr2[i12]);
                        kotlin.jvm.internal.m.c(strA);
                        iVar6.v(fv.b.c(strA, null, null));
                        return;
                    default:
                        g gVar2 = this.f27345b;
                        String[] strArr3 = strArr;
                        i iVar7 = gVar2.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        q qVar2 = fv.b.f28186a;
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication2);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication2);
                                }
                                break;
                            }
                        }
                        kotlin.jvm.internal.m.c(wm.a.f55177e);
                        String strA2 = wm.a.a(String.valueOf(strArr3[i12].charAt(0)));
                        kotlin.jvm.internal.m.c(strA2);
                        iVar7.v(fv.b.c(strA2, null, null));
                        return;
                }
            }
        });
        final String[] strArr2 = {getString(R.string.actual_pronunciations), getString(R.string.finals), "ㄱ①", "ㄱ, ㅋ, ㄲ, ㄳ, ㄺ②", "ㄴ", "ㄴ, ㄵ, ㄶ", "ㄷ①", "ㄷ, ㅆ, ㅅ, ㅈ, ㅊ, ㅌ, ㅎ", "ㄹ", "ㄹ, ㄼ③, ㄽ, ㄾ, ㅀ, ㄺ②", "ㅁ", "ㅁ, ㄻ", "ㅂ①", "ㅂ, ㅍ, ㅄ, ㄿ, ㄼ③", "ㅇ", "ㅇ"};
        FuyinTableAdapter2 fuyinTableAdapter2 = new FuyinTableAdapter2(R.layout.item_fuyin_table_2, Arrays.asList(Arrays.copyOf(strArr2, 16)));
        ta.a aVar13 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar13);
        RecyclerView recyclerView7 = ((y5) aVar13).f33632d;
        getContext();
        recyclerView7.setLayoutManager(new GridLayoutManager(2));
        ta.a aVar14 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar14);
        ((y5) aVar14).f33632d.setAdapter(fuyinTableAdapter2);
        final int i12 = 1;
        fuyinTableAdapter2.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener(this) { // from class: fn.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f27345b;

            {
                this.f27345b = this;
            }

            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i13) {
                switch (i12) {
                    case 0:
                        g gVar = this.f27345b;
                        String[] strArr3 = strArr2;
                        i iVar6 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        q qVar = fv.b.f28186a;
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication);
                                }
                                break;
                            }
                        }
                        kotlin.jvm.internal.m.c(wm.a.f55177e);
                        String strA = wm.a.a(strArr3[i13]);
                        kotlin.jvm.internal.m.c(strA);
                        iVar6.v(fv.b.c(strA, null, null));
                        return;
                    default:
                        g gVar2 = this.f27345b;
                        String[] strArr4 = strArr2;
                        i iVar7 = gVar2.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        q qVar2 = fv.b.f28186a;
                        if (wm.a.f55177e == null) {
                            synchronized (wm.a.class) {
                                if (wm.a.f55177e == null) {
                                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                    kotlin.jvm.internal.m.c(lingoSkillApplication2);
                                    wm.a.f55177e = new wm.a(lingoSkillApplication2);
                                }
                                break;
                            }
                        }
                        kotlin.jvm.internal.m.c(wm.a.f55177e);
                        String strA2 = wm.a.a(String.valueOf(strArr4[i13].charAt(0)));
                        kotlin.jvm.internal.m.c(strA2);
                        iVar7.v(fv.b.c(strA2, null, null));
                        return;
                }
            }
        });
        for (int i13 = 1; i13 < 31; i13++) {
            int iA = w4.c.a(i13, "tv_ko_char_");
            View view2 = this.f36399e;
            kotlin.jvm.internal.m.c(view2);
            TextView textView = (TextView) view2.findViewById(iA);
            if (textView != null) {
                z.b(textView, new com.google.accompanist.permissions.a(16, this, textView));
            }
        }
        ta.a aVar15 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar15);
        final int i14 = 0;
        z.b(((y5) aVar15).f33633e.f32581f, new fz.c(this) { // from class: fn.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f27348b;

            {
                this.f27348b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i15 = i14;
                b0 b0Var = b0.f48488a;
                g gVar = this.f27348b;
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar6 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        q qVar = fv.b.f28186a;
                        iVar6.v(fv.b.c("h", null, null));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar7 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        q qVar2 = fv.b.f28186a;
                        iVar7.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar8 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        q qVar3 = fv.b.f28186a;
                        iVar8.v(fv.b.c("n", null, null));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar9 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        q qVar4 = fv.b.f28186a;
                        iVar9.v(fv.b.c("h", null, null));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar10 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        q qVar5 = fv.b.f28186a;
                        iVar10.v(fv.b.c("n", null, null));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar11 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        q qVar6 = fv.b.f28186a;
                        iVar11.v(fv.b.c("a", null, null));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        gVar.r().hasEnterAlphabet = true;
                        gVar.r().updateEntry(OCBJEWZHh.RFCxfrOtJKvjxG);
                        int i16 = KOYinTuActivity.H;
                        l.m mVar2 = gVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        gVar.startActivity(new Intent(mVar2, (Class<?>) KOYinTuActivity.class));
                        e0.A(gVar.t(), "jxz_alphabet_click_chart");
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar16 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar16);
        final int i15 = 1;
        z.b(((y5) aVar16).f33633e.f32582g, new fz.c(this) { // from class: fn.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f27348b;

            {
                this.f27348b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i16 = i15;
                b0 b0Var = b0.f48488a;
                g gVar = this.f27348b;
                View it = (View) obj;
                switch (i16) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar6 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        q qVar = fv.b.f28186a;
                        iVar6.v(fv.b.c("h", null, null));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar7 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        q qVar2 = fv.b.f28186a;
                        iVar7.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar8 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        q qVar3 = fv.b.f28186a;
                        iVar8.v(fv.b.c("n", null, null));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar9 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        q qVar4 = fv.b.f28186a;
                        iVar9.v(fv.b.c("h", null, null));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar10 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        q qVar5 = fv.b.f28186a;
                        iVar10.v(fv.b.c("n", null, null));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar11 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        q qVar6 = fv.b.f28186a;
                        iVar11.v(fv.b.c("a", null, null));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        gVar.r().hasEnterAlphabet = true;
                        gVar.r().updateEntry(OCBJEWZHh.RFCxfrOtJKvjxG);
                        int i17 = KOYinTuActivity.H;
                        l.m mVar2 = gVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        gVar.startActivity(new Intent(mVar2, (Class<?>) KOYinTuActivity.class));
                        e0.A(gVar.t(), "jxz_alphabet_click_chart");
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar17 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar17);
        final int i16 = 2;
        z.b(((y5) aVar17).f33633e.f32583h, new fz.c(this) { // from class: fn.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f27348b;

            {
                this.f27348b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i17 = i16;
                b0 b0Var = b0.f48488a;
                g gVar = this.f27348b;
                View it = (View) obj;
                switch (i17) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar6 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        q qVar = fv.b.f28186a;
                        iVar6.v(fv.b.c("h", null, null));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar7 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        q qVar2 = fv.b.f28186a;
                        iVar7.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar8 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        q qVar3 = fv.b.f28186a;
                        iVar8.v(fv.b.c("n", null, null));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar9 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        q qVar4 = fv.b.f28186a;
                        iVar9.v(fv.b.c("h", null, null));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar10 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        q qVar5 = fv.b.f28186a;
                        iVar10.v(fv.b.c("n", null, null));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar11 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        q qVar6 = fv.b.f28186a;
                        iVar11.v(fv.b.c("a", null, null));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        gVar.r().hasEnterAlphabet = true;
                        gVar.r().updateEntry(OCBJEWZHh.RFCxfrOtJKvjxG);
                        int i18 = KOYinTuActivity.H;
                        l.m mVar2 = gVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        gVar.startActivity(new Intent(mVar2, (Class<?>) KOYinTuActivity.class));
                        e0.A(gVar.t(), "jxz_alphabet_click_chart");
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar18 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar18);
        final int i17 = 3;
        z.b(((y5) aVar18).f33633e.f32579d, new fz.c(this) { // from class: fn.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f27348b;

            {
                this.f27348b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i18 = i17;
                b0 b0Var = b0.f48488a;
                g gVar = this.f27348b;
                View it = (View) obj;
                switch (i18) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar6 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        q qVar = fv.b.f28186a;
                        iVar6.v(fv.b.c("h", null, null));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar7 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        q qVar2 = fv.b.f28186a;
                        iVar7.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar8 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        q qVar3 = fv.b.f28186a;
                        iVar8.v(fv.b.c("n", null, null));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar9 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        q qVar4 = fv.b.f28186a;
                        iVar9.v(fv.b.c("h", null, null));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar10 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        q qVar5 = fv.b.f28186a;
                        iVar10.v(fv.b.c("n", null, null));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar11 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        q qVar6 = fv.b.f28186a;
                        iVar11.v(fv.b.c("a", null, null));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        gVar.r().hasEnterAlphabet = true;
                        gVar.r().updateEntry(OCBJEWZHh.RFCxfrOtJKvjxG);
                        int i19 = KOYinTuActivity.H;
                        l.m mVar2 = gVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        gVar.startActivity(new Intent(mVar2, (Class<?>) KOYinTuActivity.class));
                        e0.A(gVar.t(), "jxz_alphabet_click_chart");
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar19 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar19);
        final int i18 = 4;
        z.b(((y5) aVar19).f33633e.f32578c, new fz.c(this) { // from class: fn.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f27348b;

            {
                this.f27348b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i19 = i18;
                b0 b0Var = b0.f48488a;
                g gVar = this.f27348b;
                View it = (View) obj;
                switch (i19) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar6 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        q qVar = fv.b.f28186a;
                        iVar6.v(fv.b.c("h", null, null));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar7 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        q qVar2 = fv.b.f28186a;
                        iVar7.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar8 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        q qVar3 = fv.b.f28186a;
                        iVar8.v(fv.b.c("n", null, null));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar9 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        q qVar4 = fv.b.f28186a;
                        iVar9.v(fv.b.c("h", null, null));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar10 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        q qVar5 = fv.b.f28186a;
                        iVar10.v(fv.b.c("n", null, null));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar11 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        q qVar6 = fv.b.f28186a;
                        iVar11.v(fv.b.c("a", null, null));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        gVar.r().hasEnterAlphabet = true;
                        gVar.r().updateEntry(OCBJEWZHh.RFCxfrOtJKvjxG);
                        int i110 = KOYinTuActivity.H;
                        l.m mVar2 = gVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        gVar.startActivity(new Intent(mVar2, (Class<?>) KOYinTuActivity.class));
                        e0.A(gVar.t(), "jxz_alphabet_click_chart");
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar20 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar20);
        final int i19 = 5;
        z.b(((y5) aVar20).f33633e.f32580e, new fz.c(this) { // from class: fn.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f27348b;

            {
                this.f27348b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = i19;
                b0 b0Var = b0.f48488a;
                g gVar = this.f27348b;
                View it = (View) obj;
                switch (i110) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar6 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        q qVar = fv.b.f28186a;
                        iVar6.v(fv.b.c("h", null, null));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar7 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        q qVar2 = fv.b.f28186a;
                        iVar7.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar8 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        q qVar3 = fv.b.f28186a;
                        iVar8.v(fv.b.c("n", null, null));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar9 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        q qVar4 = fv.b.f28186a;
                        iVar9.v(fv.b.c("h", null, null));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar10 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        q qVar5 = fv.b.f28186a;
                        iVar10.v(fv.b.c("n", null, null));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar11 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        q qVar6 = fv.b.f28186a;
                        iVar11.v(fv.b.c("a", null, null));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        gVar.r().hasEnterAlphabet = true;
                        gVar.r().updateEntry(OCBJEWZHh.RFCxfrOtJKvjxG);
                        int i111 = KOYinTuActivity.H;
                        l.m mVar2 = gVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        gVar.startActivity(new Intent(mVar2, (Class<?>) KOYinTuActivity.class));
                        e0.A(gVar.t(), "jxz_alphabet_click_chart");
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar21 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar21);
        final int i21 = 6;
        z.b(((y5) aVar21).f33630b, new fz.c(this) { // from class: fn.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f27348b;

            {
                this.f27348b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = i21;
                b0 b0Var = b0.f48488a;
                g gVar = this.f27348b;
                View it = (View) obj;
                switch (i110) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar6 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        q qVar = fv.b.f28186a;
                        iVar6.v(fv.b.c("h", null, null));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar7 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        q qVar2 = fv.b.f28186a;
                        iVar7.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar8 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        q qVar3 = fv.b.f28186a;
                        iVar8.v(fv.b.c("n", null, null));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar9 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        q qVar4 = fv.b.f28186a;
                        iVar9.v(fv.b.c("h", null, null));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar10 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        q qVar5 = fv.b.f28186a;
                        iVar10.v(fv.b.c("n", null, null));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        i iVar11 = gVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        q qVar6 = fv.b.f28186a;
                        iVar11.v(fv.b.c("a", null, null));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        gVar.r().hasEnterAlphabet = true;
                        gVar.r().updateEntry(OCBJEWZHh.RFCxfrOtJKvjxG);
                        int i111 = KOYinTuActivity.H;
                        l.m mVar2 = gVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        gVar.startActivity(new Intent(mVar2, (Class<?>) KOYinTuActivity.class));
                        e0.A(gVar.t(), "jxz_alphabet_click_chart");
                        break;
                }
                return b0Var;
            }
        });
    }
}
