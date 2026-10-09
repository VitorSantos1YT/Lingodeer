package r;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.work.impl.WorkDatabase;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.card.MaterialCardView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingo.lingoskill.speak.object.PodSelect;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.TestModel;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.p3;
import hj.b6;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.m;
import oz.x;
import qy.b0;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements ki.a, tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f48709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f48710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f48711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f48712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f48713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f48714f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f48715t;

    public x2(Context context, fb.c cVar, qb.a aVar, gb.d dVar, WorkDatabase workDatabase, ob.p pVar, ArrayList arrayList) {
        kotlin.jvm.internal.m.f(context, "context");
        this.f48710b = cVar;
        this.f48711c = aVar;
        this.f48712d = dVar;
        this.f48713e = workDatabase;
        this.f48714f = pVar;
        this.f48715t = arrayList;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.m.e(applicationContext, "context.applicationContext");
        this.f48709a = applicationContext;
        new ob.l(8);
    }

    public static int g(List list, int i11, long j11) {
        Iterator it = list.iterator();
        int i12 = -1;
        while (it.hasNext()) {
            TestModel testModel = (TestModel) it.next();
            if (testModel.elemType == i11 && testModel.elemId == j11) {
                i12 = testModel.modelType;
            }
        }
        return i12;
    }

    public static ArrayList h(List list, int i11) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TestModel testModel = (TestModel) it.next();
            if (testModel.elemType == i11) {
                arrayList.add(Integer.valueOf(testModel.modelType));
            }
        }
        return arrayList;
    }

    public static void j(wv.c cVar) {
        Iterator it = cVar.iterator();
        p3 p3VarD = xv.c.f56595a.d();
        System.currentTimeMillis();
        while (it.hasNext()) {
            try {
                bw.c cVar2 = (bw.c) it.next();
                byte bA = cVar2.a();
                AtomicLong atomicLong = cVar2.f6396t;
                if (bA == 3 || cVar2.a() == 2 || cVar2.a() == -1 || (cVar2.a() == 1 && atomicLong.get() > 0)) {
                    cVar2.e((byte) -2);
                }
                String strB = cVar2.b();
                if (strB != null) {
                    File file = new File(strB);
                    if (cVar2.a() == -2 && ew.f.e(cVar2, cVar2.f6392c)) {
                        File file2 = new File(cVar2.c());
                        if (!file2.exists() && file.exists()) {
                            file.renameTo(file2);
                        }
                    }
                    if (cVar2.a() != 1 || atomicLong.get() > 0) {
                        if ((cVar2.c() == null ? false : ew.f.e(cVar2, cVar2.c())) && !file.exists()) {
                            int i11 = cVar2.f6390a;
                            String str = cVar2.f6391b;
                            String str2 = cVar2.f6392c;
                            boolean z11 = cVar2.f6393d;
                            p3VarD.getClass();
                            int iP = p3.p(str, str2, z11);
                            if (iP != i11) {
                                cVar2.f6390a = iP;
                                cVar.f55486a.put(i11, cVar2);
                            }
                            SparseArray sparseArray = cVar.f55488c;
                            if (sparseArray != null) {
                                sparseArray.put(cVar2.f6390a, cVar2);
                            }
                        }
                    }
                }
                it.remove();
            } catch (Throwable th2) {
                ew.f.h(ns.o.f44007a);
                cVar.b();
                throw th2;
            }
        }
        ew.f.h(ns.o.f44007a);
        cVar.b();
    }

    @Override // ki.a
    public void B() {
    }

    public vv.a a(String str) {
        Object vVar;
        ew.c cVar = (ew.c) this.f48711c;
        if (cVar == null) {
            synchronized (this) {
                try {
                    if (((ew.c) this.f48711c) == null) {
                        a0.b2 b2Var = (a0.b2) c().f32184b;
                        if (b2Var == null || (vVar = (ql.a) b2Var.f27b) == null) {
                            vVar = new re.v(8);
                        }
                        this.f48711c = vVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            cVar = (ew.c) this.f48711c;
        }
        return cVar.g(str);
    }

    public wv.a b() {
        wv.b bVar = (wv.b) this.f48713e;
        if (bVar != null) {
            return bVar;
        }
        synchronized (this) {
            try {
                if (((wv.b) this.f48713e) == null) {
                    Object obj = c().f32184b;
                    wv.b bVar2 = new wv.b();
                    this.f48713e = bVar2;
                    tp.e eVar = bVar2.f55480b;
                    qp.o2 o2Var = bVar2.f55479a;
                    SparseArray sparseArray = (SparseArray) o2Var.f48095b;
                    SparseArray sparseArray2 = (SparseArray) o2Var.f48096c;
                    eVar.getClass();
                    j(new wv.c(eVar, sparseArray, sparseArray2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (wv.b) this.f48713e;
    }

    public hd.b c() {
        hd.b bVar = (hd.b) this.f48709a;
        if (bVar != null) {
            return bVar;
        }
        synchronized (this) {
            try {
                if (((hd.b) this.f48709a) == null) {
                    this.f48709a = new hd.b(8);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (hd.b) this.f48709a;
    }

    public p3 d() {
        p3 p3Var = (p3) this.f48714f;
        if (p3Var != null) {
            return p3Var;
        }
        synchronized (this) {
            try {
                if (((p3) this.f48714f) == null) {
                    this.f48714f = ((a0.b2) c().f32184b) == null ? new p3(7) : new p3(7);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (p3) this.f48714f;
    }

    public List e() {
        List list = (List) this.f48710b;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.m.n("mTestModels");
        throw null;
    }

    public p20.c f() {
        p20.c cVar = (p20.c) this.f48712d;
        if (cVar != null) {
            return cVar;
        }
        synchronized (this) {
            try {
                if (((p20.c) this.f48712d) == null) {
                    this.f48712d = ((a0.b2) c().f32184b) == null ? new p20.c(7) : new p20.c(7);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (p20.c) this.f48712d;
    }

    public void i(TestModel testModel, ArrayList arrayList, boolean z11, int i11) {
        int i12;
        String str = (String) this.f48715t;
        int i13 = 4;
        int i14 = 3;
        vt.n0 n0Var = (vt.n0) this.f48709a;
        Integer num = 47;
        ArrayList arrayList2 = (ArrayList) this.f48712d;
        if (arrayList.size() == 1) {
            testModel.modelType = ((Number) arrayList.get(0)).intValue();
            return;
        }
        Env env = ((fr.o0) n0Var).f27733a;
        if (ry.l.D(new Integer[]{51, 55, 21, 61, 63, 65, 18, 19, 69}, Integer.valueOf(env.keyLanguage))) {
            Integer[] numArr = ry.l.D(new Integer[]{51, 55, 61, 63, 65, 19}, Integer.valueOf(env.keyLanguage)) ? new Integer[]{3, 4, 5, 8, 10} : new Integer[]{3, 4, 5, 8, 10, 13};
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                i15++;
                int iIntValue = ((Number) obj).intValue();
                if (ry.l.D(numArr, Integer.valueOf(iIntValue))) {
                    ((List) arrayList2.get(0)).add(Integer.valueOf(iIntValue));
                }
            }
            if (((List) arrayList2.get(0)).size() != 0) {
                int iG = g(e(), testModel.elemType, testModel.elemId);
                if (((List) arrayList2.get(0)).size() > 1) {
                    ((List) arrayList2.get(0)).remove(Integer.valueOf(iG));
                }
                testModel.typeList = (List) arrayList2.get(0);
                List list = (List) arrayList2.get(0);
                int size2 = ((List) arrayList2.get(0)).size();
                if (size2 <= 0) {
                    throw new RuntimeException();
                }
                testModel.modelType = ((Number) list.get(Math.abs(new Random().nextInt()) % size2)).intValue();
                return;
            }
            ArrayList arrayListC1 = ry.m.c1(arrayList);
            arrayListC1.remove((Object) 0);
            arrayListC1.remove((Object) 7);
            arrayListC1.remove((Object) 13);
            if (arrayListC1.size() <= 0) {
                testModel.modelType = -1;
                return;
            }
            int size3 = arrayListC1.size();
            if (size3 <= 0) {
                throw new RuntimeException();
            }
            testModel.modelType = ((Number) arrayListC1.get(Math.abs(new Random().nextInt()) % size3)).intValue();
            return;
        }
        if (z11) {
            int size4 = arrayList.size();
            int i16 = 0;
            while (i16 < size4) {
                i16++;
                int iIntValue2 = ((Number) arrayList.get(i16)).intValue();
                arrayList2 = arrayList2;
                num = num;
                if (ry.l.D(new Integer[]{num, 48, 49, 50, 53, 54}, Integer.valueOf(env.keyLanguage))) {
                    if (env.isAudioModel) {
                        if (iIntValue2 != 1) {
                            i12 = i13;
                            if (iIntValue2 == i12 || iIntValue2 == 10) {
                            }
                        } else {
                            i12 = i13;
                        }
                        ((List) arrayList2.get(0)).add(Integer.valueOf(iIntValue2));
                    } else {
                        i12 = i13;
                        if (iIntValue2 == 1 || iIntValue2 == 5 || iIntValue2 == 10) {
                            ((List) arrayList2.get(0)).add(Integer.valueOf(iIntValue2));
                        }
                    }
                    i13 = i12;
                } else {
                    int i17 = i13;
                    if (iIntValue2 == i14 || iIntValue2 == 2) {
                        ((List) arrayList2.get(0)).add(Integer.valueOf(iIntValue2));
                        i13 = 4;
                        i14 = 3;
                    } else if (iIntValue2 == 6) {
                        ((List) arrayList2.get(0)).add(Integer.valueOf(iIntValue2));
                        i13 = 4;
                        i14 = 3;
                    } else {
                        i13 = i17;
                        i14 = 3;
                    }
                }
            }
            ArrayList arrayList3 = arrayList2;
            if (oz.q.v0(str, nv.p.m(testModel.elemId, ";", ";"), false)) {
                ((List) arrayList3.get(0)).remove((Object) 4);
            }
            if (((List) arrayList3.get(0)).size() == 0) {
                int size5 = arrayList.size();
                if (size5 <= 0) {
                    throw new RuntimeException();
                }
                testModel.modelType = ((Number) arrayList.get(Math.abs(new Random().nextInt()) % size5)).intValue();
                return;
            }
            int iG2 = g(e(), testModel.elemType, testModel.elemId);
            if (((List) arrayList3.get(0)).size() > 1) {
                ((List) arrayList3.get(0)).remove(Integer.valueOf(iG2));
            }
            testModel.typeList = (List) arrayList3.get(0);
            List list2 = (List) arrayList3.get(0);
            int size6 = ((List) arrayList3.get(0)).size();
            if (size6 <= 0) {
                throw new RuntimeException();
            }
            int iIntValue3 = ((Number) list2.get(Math.abs(new Random().nextInt()) % size6)).intValue();
            testModel.modelType = iIntValue3;
            if (iIntValue3 == 12) {
                testModel.modelType = 3;
                return;
            }
            return;
        }
        Integer num2 = 47;
        ((ArrayList) this.f48713e).add(Integer.valueOf(i11));
        List<TestModel> listE = e();
        int i18 = testModel.elemType;
        Integer num3 = 49;
        long j11 = testModel.elemId;
        int i19 = 0;
        for (TestModel testModel2 : listE) {
            Integer num4 = num2;
            if (testModel2.elemType == i18 && testModel2.elemId == j11) {
                i19++;
            }
            num2 = num4;
        }
        Integer num5 = num2;
        if (i19 != 1) {
            if (i19 >= 2) {
                testModel.modelType = 13;
                return;
            }
            return;
        }
        int size7 = arrayList.size();
        int i21 = 0;
        while (i21 < size7) {
            int i22 = i21 + 1;
            int iIntValue4 = ((Number) arrayList.get(i21)).intValue();
            Integer num6 = num3;
            Integer num7 = num5;
            if (!ry.l.D(new Integer[]{num7, 48, num6, 50, 53, 54}, Integer.valueOf(env.keyLanguage))) {
                if (iIntValue4 != 1 && iIntValue4 != 5) {
                    if (iIntValue4 != 10) {
                    }
                }
                ((List) arrayList2.get(1)).add(Integer.valueOf(iIntValue4));
            } else if (env.isAudioModel) {
                if (iIntValue4 == 5 || iIntValue4 == 7) {
                    ((List) arrayList2.get(1)).add(Integer.valueOf(iIntValue4));
                }
            } else if (iIntValue4 == 1 || iIntValue4 == 5 || iIntValue4 == 10) {
                ((List) arrayList2.get(1)).add(Integer.valueOf(iIntValue4));
            }
            num5 = num7;
            num3 = num6;
            i21 = i22;
        }
        if (oz.q.v0(str, nv.p.m(testModel.elemId, ";", ";"), false)) {
            ((List) arrayList2.get(1)).remove((Object) 5);
        }
        if (env.keyLanguage == 7) {
            ArrayList arrayListH = h(e(), testModel.elemType);
            int size8 = arrayListH.size();
            if (1 <= size8 && size8 < 2 && ((List) arrayList2.get(1)).size() > 1) {
                ((List) arrayList2.get(1)).remove(Integer.valueOf(((Number) arrayListH.get(0)).intValue()));
            } else if (arrayListH.size() >= 2 && ((List) arrayList2.get(1)).size() > 2) {
                int iIntValue5 = ((Number) nv.p.f(1, arrayListH)).intValue();
                int iIntValue6 = ((Number) nv.p.f(2, arrayListH)).intValue();
                ((List) arrayList2.get(1)).remove(Integer.valueOf(iIntValue5));
                ((List) arrayList2.get(1)).remove(Integer.valueOf(iIntValue6));
            }
            int iG3 = g(e(), testModel.elemType, testModel.elemId);
            if (((List) arrayList2.get(1)).size() > 1) {
                ((List) arrayList2.get(1)).remove(Integer.valueOf(iG3));
            }
        }
        if (((List) arrayList2.get(1)).size() == 0) {
            testModel.modelType = 13;
            return;
        }
        List list3 = (List) arrayList2.get(1);
        int size9 = ((List) arrayList2.get(1)).size();
        if (size9 <= 0) {
            throw new RuntimeException();
        }
        testModel.modelType = ((Number) list3.get(Math.abs(new Random().nextInt()) % size9)).intValue();
        testModel.typeList = (List) arrayList2.get(1);
    }

    public void k() {
        ArrayList arrayList = (ArrayList) this.f48714f;
        PodSelect podSelect = (PodSelect) this.f48713e;
        b6 b6Var = (b6) this.f48711c;
        ArrayList arrayList2 = (ArrayList) this.f48715t;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ((MaterialCardView) obj).setVisibility(8);
        }
        op.a title = podSelect.getTitle();
        kotlin.jvm.internal.m.e(title, "getTitle(...)");
        TextView textView = (TextView) b6Var.f32409e;
        TextView textView2 = (TextView) b6Var.f32408d;
        zq.c.e(title, textView, textView2, (TextView) b6Var.f32407c, false);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (ry.l.D(new Integer[]{1, 12}, Integer.valueOf(cf.x.n().keyLanguage)) && cf.x.n().jsDisPlay == 2) {
            textView2.setText(podSelect.getTitle().getLuoma());
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            MaterialCardView materialCardView = (MaterialCardView) arrayList2.get(i12);
            materialCardView.setVisibility(0);
            TextView textView3 = (TextView) materialCardView.findViewById(R.id.tv_top);
            TextView textView4 = (TextView) materialCardView.findViewById(R.id.tv_middle);
            TextView textView5 = (TextView) materialCardView.findViewById(R.id.tv_bottom);
            LinearLayout linearLayout = (LinearLayout) materialCardView.findViewById(R.id.ll_option);
            ImageView imageView = (ImageView) materialCardView.findViewById(R.id.iv_option);
            int[] iArr = bq.r.f4959a;
            kotlin.jvm.internal.m.c(textView3);
            bq.m.J(textView3);
            kotlin.jvm.internal.m.c(textView4);
            bq.m.J(textView4);
            kotlin.jvm.internal.m.c(textView5);
            bq.m.J(textView5);
            op.a aVar = (op.a) arrayList.get(i12);
            if (kotlin.jvm.internal.m.a(aVar.getWord(), "✔️")) {
                imageView.setVisibility(0);
                linearLayout.setVisibility(8);
                imageView.setImageResource(R.drawable.ic_story_option_correct);
            } else if (kotlin.jvm.internal.m.a(aVar.getWord(), "✖️")) {
                imageView.setVisibility(0);
                linearLayout.setVisibility(8);
                imageView.setImageResource(R.drawable.ic_story_option_wrong);
            } else {
                imageView.setVisibility(8);
                linearLayout.setVisibility(0);
                zq.c.e(aVar, textView3, textView4, textView5, false);
                if (kotlin.jvm.internal.m.a(textView3.getText().toString(), textView4.getText().toString())) {
                    textView3.setVisibility(8);
                }
                if (kotlin.jvm.internal.m.a(textView5.getText().toString(), textView4.getText().toString())) {
                    textView5.setVisibility(8);
                }
            }
            materialCardView.setTag(Integer.valueOf(i12));
            bq.z.b(materialCardView, new j9.h(14, this, materialCardView));
        }
    }

    @Override // ki.a
    public void m() {
        FrameLayout frameLayout = (FrameLayout) this.f48712d;
        String str = (String) this.f48714f;
        FrameLayout frameLayout2 = (FrameLayout) this.f48713e;
        SpeakTryAdapter speakTryAdapter = (SpeakTryAdapter) this.f48709a;
        oo.k0 k0Var = speakTryAdapter.f22016c;
        AtomicBoolean atomicBoolean = speakTryAdapter.f22024k;
        if (!atomicBoolean.get()) {
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(k0Var), null, null, new b0.x0(speakTryAdapter, (View) this.f48710b, (String) this.f48714f, (WaveView) this.f48711c, frameLayout, (vy.d) null, 10), 3);
            return;
        }
        ((WaveView) this.f48711c).b();
        frameLayout.setBackgroundResource(R.drawable.bg_speak_btn_enable);
        kotlin.jvm.internal.m.c(frameLayout2);
        if (SpeakTryAdapter.c(frameLayout2, str)) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dy.j jVar = ky.e.f38937b;
            th.j.a(qx.h.m(300L, timeUnit, jVar).k(jVar).g(px.b.a()).h(new hd.d(frameLayout2, 19), io.b.f34498c), k0Var.f36401t);
        }
        k0Var.y();
        int i11 = 0;
        atomicBoolean.set(false);
        av.j0 j0Var = speakTryAdapter.f22015b;
        PodSentence podSentence = (PodSentence) this.f48715t;
        View itemView = (View) this.f48710b;
        j0Var.f();
        if (podSentence != null) {
            Iterator it = podSentence.getWords().iterator();
            String sentence = BuildConfig.VERSION_NAME;
            while (it.hasNext()) {
                sentence = ((Object) sentence) + ((op.b) it.next()).getWord();
            }
            File file = new File(str);
            if (file.exists()) {
                n9.q qVar = speakTryAdapter.f22025l;
                if (qVar != null) {
                    oo.k0 k0Var2 = (oo.k0) qVar.f43673b;
                    List words = podSentence.getWords();
                    ArrayList arrayListR = b7.e0.r("getWords(...)", words);
                    for (Object obj : words) {
                        if (((op.b) obj).getWordType() != 1) {
                            arrayListR.add(obj);
                        }
                    }
                    ArrayList arrayList = new ArrayList(ry.n.W(arrayListR, 10));
                    int size = arrayListR.size();
                    while (i11 < size) {
                        Object obj2 = arrayListR.get(i11);
                        i11++;
                        arrayList.add(((op.b) obj2).getWord());
                    }
                    kotlin.jvm.internal.m.f(itemView, "itemView");
                    kotlin.jvm.internal.m.f(sentence, "sentence");
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(k0Var2), null, null, new b0.x0(k0Var2, itemView, file, sentence, arrayList, (vy.d) null, 19), 3);
                }
                k0Var.y();
            }
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        Integer num;
        x2 x2Var = this;
        final View view = (View) x2Var.f48710b;
        final HashMap map = (HashMap) x2Var.f48714f;
        final Sentence sentence = (Sentence) obj;
        final ArrayList arrayList = (ArrayList) x2Var.f48715t;
        final HashMap map2 = (HashMap) x2Var.f48713e;
        FlexboxLayout flexboxLayout = (FlexboxLayout) x2Var.f48711c;
        FlexboxLayout flexboxLayout2 = (FlexboxLayout) x2Var.f48712d;
        final AbsDialogModelAdapter absDialogModelAdapter = (AbsDialogModelAdapter) x2Var.f48709a;
        Integer num2 = 1;
        if (sentence == null) {
            return;
        }
        List<Word> sentWordsNOMF = sentence.getSentWordsNOMF();
        kotlin.jvm.internal.m.e(sentWordsNOMF, "getSentWordsNOMF(...)");
        int[] iArr = bq.r.f4959a;
        ArrayList arrayListC1 = ry.m.c1(qi.b.g(sentWordsNOMF, !bq.m.F()));
        int size = arrayListC1.size();
        boolean z11 = false;
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            final Word word = (Word) arrayListC1.get(i11);
            HashMap map3 = map2;
            View viewInflate = LayoutInflater.from(((BaseQuickAdapter) absDialogModelAdapter).mContext).inflate(R.layout.item_dialog_word_card_framlayout, flexboxLayout, z11);
            kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
            final CardView cardView = (CardView) viewInflate;
            final TextView textView = (TextView) cardView.findViewById(R.id.tv_top);
            final TextView textView2 = (TextView) cardView.findViewById(R.id.tv_middle);
            Context context = ((BaseQuickAdapter) absDialogModelAdapter).mContext;
            kotlin.jvm.internal.m.e(context, "access$getMContext$p$s-1838890688(...)");
            cardView.setCardBackgroundColor(context.getColor(R.color.white));
            cardView.setCardElevation(ff.h.l(2.0f));
            cardView.setTag(word);
            AbsDialogModelAdapter.g(absDialogModelAdapter, cardView, word);
            flexboxLayout.addView(cardView);
            final FlexboxLayout flexboxLayout3 = (FlexboxLayout) x2Var.f48712d;
            final FlexboxLayout flexboxLayout4 = (FlexboxLayout) x2Var.f48711c;
            map2 = map3;
            bq.z.b(cardView, new fz.c() { // from class: kp.f
                @Override // fz.c
                public final Object invoke(Object obj2) {
                    View it = (View) obj2;
                    m.f(it, "it");
                    HashMap map4 = map2;
                    if (!map4.isEmpty()) {
                        ArrayList arrayList2 = arrayList;
                        Object obj3 = arrayList2.get(0);
                        m.e(obj3, "get(...)");
                        View view2 = (View) obj3;
                        Integer num3 = (Integer) map4.get(view2);
                        int iIntValue = num3 != null ? num3.intValue() : 1;
                        HashMap map5 = map;
                        Integer num4 = (Integer) map5.get(view2);
                        int iIntValue2 = num4 != null ? num4.intValue() : 1;
                        TextView textView3 = (TextView) view2.findViewById(R.id.tv_middle);
                        Object tag = view2.getTag();
                        m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                        Object tag2 = view2.getTag(R.id.tag_correct_str);
                        m.d(tag2, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) tag2;
                        TextView textView4 = (TextView) view2.findViewById(R.id.tv_top);
                        String zhuyin = ((Word) tag).getZhuyin();
                        Word word2 = word;
                        boolean zL0 = x.l0(word2.getWord(), String.valueOf(str.charAt(iIntValue - 1)), true);
                        CardView cardView2 = cardView;
                        AbsDialogModelAdapter absDialogModelAdapter2 = absDialogModelAdapter;
                        if (zL0) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                            int i13 = iIntValue2;
                            Context context2 = ((BaseQuickAdapter) absDialogModelAdapter2).mContext;
                            m.e(context2, "access$getMContext$p$s-1838890688(...)");
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(context2.getColor(R.color.primary_black)), 0, iIntValue, 33);
                            Context context3 = ((BaseQuickAdapter) absDialogModelAdapter2).mContext;
                            m.e(context3, "access$getMContext$p$s-1838890688(...)");
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(context3.getColor(R.color.transparent)), iIntValue, spannableStringBuilder.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(zhuyin);
                            int length = (word2.getZhuyin().length() + i13) - 1;
                            String string = spannableStringBuilder2.subSequence(0, length).toString();
                            StringBuilder sb2 = new StringBuilder();
                            int length2 = string.length();
                            String str2 = "null cannot be cast to non-null type com.lingo.lingoskill.object.Word";
                            int i14 = 0;
                            while (i14 < length2) {
                                int i15 = length2;
                                char cCharAt = string.charAt(i14);
                                String str3 = string;
                                if (m.a(String.valueOf(cCharAt), " ")) {
                                    sb2.append(cCharAt);
                                }
                                i14++;
                                length2 = i15;
                                string = str3;
                            }
                            int length3 = sb2.toString().length() + length;
                            Context context4 = ((BaseQuickAdapter) absDialogModelAdapter2).mContext;
                            m.e(context4, "access$getMContext$p$s-1838890688(...)");
                            spannableStringBuilder2.setSpan(new ForegroundColorSpan(context4.getColor(R.color.primary_black)), 0, length3, 33);
                            Context context5 = ((BaseQuickAdapter) absDialogModelAdapter2).mContext;
                            m.e(context5, "access$getMContext$p$s-1838890688(...)");
                            spannableStringBuilder2.setSpan(new ForegroundColorSpan(context5.getColor(R.color.transparent)), length3, spannableStringBuilder2.length(), 33);
                            textView3.setText(spannableStringBuilder);
                            textView4.setTag(R.id.tag_span_text, spannableStringBuilder2);
                            textView3.setTag(R.id.tag_span_text, spannableStringBuilder);
                            int i16 = 0;
                            cardView2.setEnabled(false);
                            TextView textView5 = textView;
                            m.c(textView5);
                            AbsDialogModelAdapter.e(absDialogModelAdapter2, cardView2, textView2, textView5);
                            if (iIntValue >= str.length()) {
                                map4.remove(view2);
                                arrayList2.remove(view2);
                                view2.setTag(R.id.tag_is_invisiable, Boolean.FALSE);
                                if (map4.isEmpty()) {
                                    ((CardView) view.findViewById(R.id.card_hint)).setVisibility(8);
                                    FlexboxLayout flexboxLayout5 = flexboxLayout3;
                                    int childCount = flexboxLayout5.getChildCount();
                                    int i17 = 1;
                                    while (i17 < childCount) {
                                        View childAt = flexboxLayout5.getChildAt(i17);
                                        Object tag3 = childAt.getTag();
                                        String str4 = str2;
                                        m.d(tag3, str4);
                                        Word word3 = (Word) tag3;
                                        if (m.a(word3.getWord(), " ")) {
                                            i16++;
                                        }
                                        AbsDialogModelAdapter.g(absDialogModelAdapter2, childAt, word3);
                                        TextView textView6 = (TextView) childAt.findViewById(R.id.tv_middle);
                                        List<Word> sentWordsNOMF2 = sentence.getSentWordsNOMF();
                                        m.e(sentWordsNOMF2, "getSentWordsNOMF(...)");
                                        m.c(textView6);
                                        AbsDialogModelAdapter.n((i17 - 1) - i16, sentWordsNOMF2, textView6);
                                        i17++;
                                        str2 = str4;
                                    }
                                    FlexboxLayout flexboxLayout6 = flexboxLayout4;
                                    m.c(flexboxLayout6);
                                    AbsDialogModelAdapter.b(absDialogModelAdapter2, flexboxLayout6);
                                }
                                if (m.a(word2.getWord(), " ")) {
                                    view2.findViewById(R.id.view_line).setVisibility(8);
                                }
                            } else {
                                map4.put(view2, Integer.valueOf(iIntValue + 1));
                                map5.put(view2, Integer.valueOf(word2.getZhuyin().length() + i13));
                            }
                        } else {
                            AbsDialogModelAdapter.f(absDialogModelAdapter2, cardView2);
                        }
                    }
                    return b0.f48488a;
                }
            });
            size = size;
            i11 = i12;
            arrayListC1 = arrayListC1;
            num2 = num2;
            z11 = false;
            x2Var = this;
        }
        Integer num3 = num2;
        View viewFindViewById = view.findViewById(R.id.card_hint);
        kotlin.jvm.internal.m.e(viewFindViewById, iFLeRCXvYCGdPW.GuuWQZutEnhl);
        bq.z.b(viewFindViewById, new fu.j0(map2, arrayList, flexboxLayout, 15));
        int childCount = flexboxLayout2.getChildCount();
        int i13 = 1;
        while (i13 < childCount) {
            View childAt = flexboxLayout2.getChildAt(i13);
            TextView textView3 = (TextView) childAt.findViewById(R.id.tv_top);
            TextView textView4 = (TextView) childAt.findViewById(R.id.tv_middle);
            Object tag = childAt.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            Word word2 = (Word) tag;
            i13++;
            Word word3 = i13 < flexboxLayout2.getChildCount() ? (Word) hh.p0.g(flexboxLayout2, i13, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word") : null;
            if (!(word3 != null && word3.getWordType() == 1 && kotlin.jvm.internal.m.a(word2.getWord(), " ")) && (word2.getWordType() != 1 || kotlin.jvm.internal.m.a(word2.getWord(), " "))) {
                if (kotlin.jvm.internal.m.a(word2.getWord(), " ")) {
                    childAt.findViewById(R.id.view_line).setVisibility(0);
                }
                Context context2 = ((BaseQuickAdapter) absDialogModelAdapter).mContext;
                kotlin.jvm.internal.m.e(context2, "access$getMContext$p$s-1838890688(...)");
                textView3.setTextColor(context2.getColor(R.color.transparent));
                Context context3 = ((BaseQuickAdapter) absDialogModelAdapter).mContext;
                kotlin.jvm.internal.m.e(context3, "access$getMContext$p$s-1838890688(...)");
                textView4.setTextColor(context3.getColor(R.color.transparent));
                Objects.toString(textView4.getText());
                childAt.setTag(R.id.tag_is_invisiable, Boolean.TRUE);
                childAt.setTag(R.id.tag_correct_str, textView4.getText().toString());
                num = num3;
                map2.put(childAt, num);
                map.put(childAt, num);
                arrayList.add(childAt);
            } else {
                num = num3;
            }
            num3 = num;
        }
        AbsDialogModelAdapter.d(absDialogModelAdapter, flexboxLayout2);
    }
}
