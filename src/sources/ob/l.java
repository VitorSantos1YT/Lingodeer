package ob;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.p2;
import androidx.work.impl.WorkDatabase_Impl;
import b7.e0;
import com.google.api.Service;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.lingo.fluent.ui.base.adapter.PdLearnDetailAdapter;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.sc.adapter.ScDetailAdapter;
import com.lingo.me.MeAccountSettingsActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.TestModel;
import com.yalantis.ucrop.view.CropImageView;
import fb.g0;
import fr.j3;
import fr.o0;
import fr.p3;
import hh.c0;
import hh.p0;
import hj.w5;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jp.g1;
import jp.h1;
import jp.m0;
import km.w1;
import km.x1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.y;
import kr.a1;
import kr.l1;
import o20.b0;
import okhttp3.ResponseBody;
import oz.x;
import qp.f0;
import rz.z1;
import vt.n0;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements th.c, fv.e, d7.e, uw.c, uw.i, i10.a, uw.p, th.b, g1, av.k, l3.d, m7.k, o20.g, tx.c, o20.m, m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f44822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f44823c;

    public /* synthetic */ l(int i11, Object obj, Object obj2) {
        this.f44821a = i11;
        this.f44822b = obj;
        this.f44823c = obj2;
    }

    public static List E(ArrayList arrayList) {
        if (arrayList.size() <= 4) {
            return ns.o.K(arrayList);
        }
        ArrayList arrayListC1 = ry.m.c1(ry.m.g1(arrayList, 4, 4));
        if (arrayListC1.size() >= 2 && ((List) ry.m.z0(arrayListC1)).size() == 1) {
            ArrayList arrayListC2 = ry.m.c1((Collection) p0.f(1, arrayListC1));
            ArrayList arrayListC3 = ry.m.c1((Collection) p0.f(1, arrayListC1));
            arrayListC2.add(0, arrayListC3.remove(arrayListC3.size() - 1));
            arrayListC1.add(arrayListC3);
            arrayListC1.add(arrayListC2);
        }
        return arrayListC1;
    }

    public synchronized ArrayList A(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f44822b;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            List<ke.d> list = (List) ((HashMap) this.f44823c).get((String) obj);
            if (list != null) {
                for (ke.d dVar : list) {
                    if ((dVar.f38136a.isAssignableFrom(cls) && cls2.isAssignableFrom(dVar.f38137b)) && !arrayList.contains(dVar.f38137b)) {
                        arrayList.add(dVar.f38137b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x027c A[Catch: Exception -> 0x0274, TryCatch #5 {Exception -> 0x0274, blocks: (B:102:0x023f, B:104:0x025d, B:106:0x026a, B:109:0x0276, B:111:0x027c, B:113:0x0282, B:114:0x02a0, B:115:0x02a5), top: B:267:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0282 A[Catch: Exception -> 0x0274, TryCatch #5 {Exception -> 0x0274, blocks: (B:102:0x023f, B:104:0x025d, B:106:0x026a, B:109:0x0276, B:111:0x027c, B:113:0x0282, B:114:0x02a0, B:115:0x02a5), top: B:267:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02a0 A[Catch: Exception -> 0x0274, TryCatch #5 {Exception -> 0x0274, blocks: (B:102:0x023f, B:104:0x025d, B:106:0x026a, B:109:0x0276, B:111:0x027c, B:113:0x0282, B:114:0x02a0, B:115:0x02a5), top: B:267:0x023f }] */
    /* JADX WARN: Code duplicated, block: B:288:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v38 */
    public List B(String repeatRegex, String lessonID, boolean z11) throws Throwable {
        List listK;
        List listT;
        Throwable th2;
        String strQ0;
        List listK2;
        List listT2;
        List listK3;
        List listT3;
        int i11;
        String str;
        int i12;
        String str2;
        int i13;
        boolean zD;
        List listK4;
        List listT4;
        char c11;
        String str3;
        TestModel testModel;
        TestModel testModel2;
        Integer num;
        String str4;
        List listK5;
        List listT5;
        char c12;
        ArrayList arrayListC1;
        int size;
        Integer num2 = 2;
        kotlin.jvm.internal.m.f(repeatRegex, "repeatRegex");
        kotlin.jvm.internal.m.f(lessonID, "lessonID");
        this.f44823c = new ArrayList();
        Pattern patternCompile = Pattern.compile("#");
        String str5 = "compile(...)";
        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
        int i14 = 0;
        Integer num3 = 0;
        oz.q.U0(0);
        Matcher matcher = patternCompile.matcher(repeatRegex);
        int i15 = 10;
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = nv.p.c(matcher, repeatRegex, iC, arrayList);
            } while (matcher.find());
            nv.p.B(iC, repeatRegex, arrayList);
            listK = arrayList;
        } else {
            listK = ns.o.K(repeatRegex.toString());
        }
        boolean zIsEmpty = listK.isEmpty();
        ry.r rVar = ry.r.f50854a;
        int i16 = 1;
        if (zIsEmpty) {
            listT = rVar;
            break;
        }
        ListIterator listIterator = listK.listIterator(listK.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                listT = rVar;
                break;
            }
            if (((String) listIterator.previous()).length() != 0) {
                listT = e0.t(listIterator, 1, listK);
                break;
            }
        }
        String[] strArr = (String[]) listT.toArray(new String[0]);
        int length = strArr.length;
        int i17 = 0;
        while (true) {
            String str6 = "mTestModels";
            if (i17 >= length) {
                List list = (List) this.f44823c;
                if (list != null) {
                    return list;
                }
                kotlin.jvm.internal.m.n("mTestModels");
                throw null;
            }
            String str7 = strArr[i17];
            if (x.s0(str7, "3:", i14)) {
                th2 = null;
                strQ0 = x.q0(x.q0(str7, ":-", ":0-"), ":;", ":0;");
            } else {
                th2 = null;
                strQ0 = str7;
            }
            Matcher matcherW = nv.p.w(i14, ";", str5, strQ0);
            if (matcherW.find()) {
                ArrayList arrayList2 = new ArrayList(i15);
                int iC2 = i14;
                do {
                    iC2 = nv.p.c(matcherW, strQ0, iC2, arrayList2);
                } while (matcherW.find());
                nv.p.B(iC2, strQ0, arrayList2);
                listK2 = arrayList2;
            } else {
                listK2 = ns.o.K(strQ0.toString());
            }
            if (listK2.isEmpty()) {
                listT2 = rVar;
                break;
            }
            ListIterator listIterator2 = listK2.listIterator(listK2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    listT2 = rVar;
                    break;
                }
                if (((String) listIterator2.previous()).length() != 0) {
                    listT2 = e0.t(listIterator2, i16, listK2);
                    break;
                }
            }
            String[] strArr2 = (String[]) listT2.toArray(new String[i14]);
            int i18 = strArr2.length > 2 ? Integer.parseInt(strArr2[2]) : i16;
            String str8 = strArr2[i14];
            Matcher matcher2 = e0.u(i14, "-", str5, str8, "input").matcher(str8);
            if (matcher2.find()) {
                ArrayList arrayList3 = new ArrayList(10);
                int iC3 = 0;
                do {
                    iC3 = nv.p.c(matcher2, str8, iC3, arrayList3);
                } while (matcher2.find());
                nv.p.B(iC3, str8, arrayList3);
                listK3 = arrayList3;
            } else {
                listK3 = ns.o.K(str8.toString());
            }
            if (listK3.isEmpty()) {
                listT3 = rVar;
                break;
            }
            ListIterator listIterator3 = listK3.listIterator(listK3.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    listT3 = rVar;
                    break;
                }
                if (((String) listIterator3.previous()).length() != 0) {
                    listT3 = e0.t(listIterator3, 1, listK3);
                    break;
                }
            }
            String[] strArr3 = (String[]) listT3.toArray(new String[0]);
            ArrayList arrayList4 = new ArrayList();
            int length2 = strArr3.length;
            ry.r rVar2 = rVar;
            int i19 = length;
            int i21 = 0;
            while (true) {
                i11 = i17;
                str = str6;
                i12 = i18;
                str2 = ":";
                if (i21 < length2) {
                    String str9 = strArr3[i21];
                    int i22 = i21;
                    Matcher matcher3 = e0.u(0, ":", str5, str9, "input").matcher(str9);
                    if (matcher3.find()) {
                        ArrayList arrayList5 = new ArrayList(10);
                        int iC4 = 0;
                        do {
                            iC4 = nv.p.c(matcher3, str9, iC4, arrayList5);
                        } while (matcher3.find());
                        nv.p.B(iC4, str9, arrayList5);
                        listK5 = arrayList5;
                    } else {
                        listK5 = ns.o.K(str9.toString());
                    }
                    if (listK5.isEmpty()) {
                        listT5 = rVar2;
                        break;
                    }
                    ListIterator listIterator4 = listK5.listIterator(listK5.size());
                    while (true) {
                        if (!listIterator4.hasPrevious()) {
                            listT5 = rVar2;
                            break;
                        }
                        if (((String) listIterator4.previous()).length() != 0) {
                            listT5 = e0.t(listIterator4, 1, listK5);
                            break;
                        }
                    }
                    String[] strArr4 = (String[]) listT5.toArray(new String[0]);
                    if (strArr4.length >= 2) {
                        TestModel testModel3 = new TestModel();
                        try {
                            if (kotlin.jvm.internal.m.a(strArr4[0], "0")) {
                                testModel3.elemType = 0;
                            } else {
                                if (kotlin.jvm.internal.m.a(strArr4[0], "1")) {
                                    testModel3.elemType = 1;
                                    c12 = 1;
                                } else if (kotlin.jvm.internal.m.a(strArr4[0], "2")) {
                                    testModel3.elemType = 2;
                                } else if (kotlin.jvm.internal.m.a(strArr4[0], "3")) {
                                    testModel3.elemType = 3;
                                }
                                testModel3.elemId = Integer.valueOf(strArr4[c12]).intValue();
                                arrayListC1 = ry.m.c1(ks.b.m(strArr4[2]));
                                if (testModel3.elemType == 1 && ((o0) ((n0) this.f44822b)).f27733a.keyLanguage != 3) {
                                    arrayListC1.remove(Integer.valueOf("12"));
                                }
                                if (arrayListC1.size() <= 0) {
                                    continue;
                                } else {
                                    size = arrayListC1.size();
                                    if (size > 0) {
                                        throw new RuntimeException();
                                    }
                                    testModel3.modelType = ((Number) arrayListC1.get(Math.abs(new Random().nextInt()) % size)).intValue();
                                    arrayList4.add(testModel3);
                                }
                            }
                            testModel3.elemId = Integer.valueOf(strArr4[c12]).intValue();
                            arrayListC1 = ry.m.c1(ks.b.m(strArr4[2]));
                            if (testModel3.elemType == 1) {
                                arrayListC1.remove(Integer.valueOf("12"));
                            }
                            if (arrayListC1.size() <= 0) {
                                continue;
                            } else {
                                size = arrayListC1.size();
                                if (size > 0) {
                                    throw new RuntimeException();
                                }
                                testModel3.modelType = ((Number) arrayListC1.get(Math.abs(new Random().nextInt()) % size)).intValue();
                                arrayList4.add(testModel3);
                            }
                        } catch (Exception e8) {
                            ry.l.Z(strArr, str7);
                            String str10 = strArr3[i22];
                            e8.getMessage();
                        }
                        c12 = 1;
                    }
                    i21 = i22 + 1;
                    i17 = i11;
                    str6 = str;
                    i18 = i12;
                    length2 = length2;
                }
            }
            if (arrayList4.isEmpty()) {
                num = num2;
                str4 = str5;
                num3 = num3;
            } else {
                int i23 = ((TestModel) arrayList4.get(0)).modelType;
                if (z11) {
                    i13 = 6;
                    zD = ry.l.D(new Integer[]{5, 8}, Integer.valueOf(i23));
                } else {
                    i13 = 6;
                    zD = strArr3.length >= 2 && ry.l.D(new Integer[]{num3, num2}, Integer.valueOf(((TestModel) arrayList4.get(0)).elemType)) && ry.l.D(new Integer[]{num3, 6, 13, num2}, Integer.valueOf(i23)) && !(((TestModel) arrayList4.get(0)).elemType == 0 && i23 == 2);
                }
                if (zD) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = arrayList4.iterator();
                    kotlin.jvm.internal.m.e(it, "iterator(...)");
                    while (it.hasNext()) {
                        arrayList6.add(Long.valueOf(((TestModel) it.next()).elemId));
                    }
                    if (i23 == 0) {
                        i23 = i13;
                    }
                    for (List list2 : E(arrayList6)) {
                        TestModel testModel4 = new TestModel();
                        testModel4.elemType = ((TestModel) arrayList4.get(0)).elemType;
                        testModel4.elemId = 0L;
                        testModel4.modelType = i23;
                        testModel4.optionIds = new ArrayList(list2);
                        List list3 = (List) this.f44823c;
                        if (list3 == null) {
                            kotlin.jvm.internal.m.n(str);
                            throw th2;
                        }
                        list3.add(testModel4);
                    }
                } else if (((TestModel) arrayList4.get(0)).elemType == 3 && i23 == 0) {
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it2 = arrayList4.iterator();
                    kotlin.jvm.internal.m.e(it2, "iterator(...)");
                    while (it2.hasNext()) {
                        arrayList7.add(Long.valueOf(((TestModel) it2.next()).elemId));
                    }
                    for (List list4 : E(arrayList7)) {
                        TestModel testModel5 = new TestModel();
                        testModel5.elemType = 3;
                        testModel5.elemId = 0L;
                        testModel5.modelType = 14;
                        testModel5.optionIds = new ArrayList(list4);
                        List list5 = (List) this.f44823c;
                        if (list5 == null) {
                            kotlin.jvm.internal.m.n(str);
                            throw th2;
                        }
                        list5.add(testModel5);
                    }
                } else {
                    int[] iArrE = cf.x.E(strArr3.length, i12);
                    int length3 = iArrE.length;
                    int i24 = 0;
                    while (i24 < length3) {
                        int i25 = iArrE[i24];
                        String str11 = strArr3[i25];
                        Integer num4 = num2;
                        String[] strArr5 = strArr3;
                        Matcher matcher4 = e0.u(0, str2, str5, str11, "input").matcher(str11);
                        if (matcher4.find()) {
                            ArrayList arrayList8 = new ArrayList(10);
                            int iC5 = 0;
                            do {
                                iC5 = nv.p.c(matcher4, str11, iC5, arrayList8);
                            } while (matcher4.find());
                            nv.p.B(iC5, str11, arrayList8);
                            listK4 = arrayList8;
                        } else {
                            listK4 = ns.o.K(str11.toString());
                        }
                        if (listK4.isEmpty()) {
                            listT4 = rVar2;
                            break;
                        }
                        ListIterator listIterator5 = listK4.listIterator(listK4.size());
                        while (true) {
                            if (!listIterator5.hasPrevious()) {
                                listT4 = rVar2;
                                break;
                            }
                            if (!(((String) listIterator5.previous()).length() == 0)) {
                                listT4 = e0.t(listIterator5, 1, listK4);
                                break;
                            }
                        }
                        String[] strArr6 = (String[]) listT4.toArray(new String[0]);
                        TestModel testModel6 = new TestModel();
                        if (kotlin.jvm.internal.m.a(strArr6[0], "0")) {
                            testModel6.elemType = 0;
                            c11 = 1;
                        } else if (kotlin.jvm.internal.m.a(strArr6[0], "1")) {
                            c11 = 1;
                            testModel6.elemType = 1;
                        } else {
                            c11 = 1;
                            if (kotlin.jvm.internal.m.a(strArr6[0], "2")) {
                                testModel6.elemType = 2;
                            }
                        }
                        try {
                            try {
                                str3 = str5;
                                try {
                                    testModel6.elemId = Integer.valueOf(strArr6[c11]).intValue();
                                    try {
                                        ArrayList arrayListC2 = ry.m.c1(ks.b.m(strArr6[2]));
                                        testModel6.typeList = ks.b.m(strArr6[2]);
                                        List list6 = (List) this.f44823c;
                                        if (list6 == null) {
                                            kotlin.jvm.internal.m.n(str);
                                            throw th2;
                                        }
                                        if (list6.size() > 0) {
                                            List list7 = (List) this.f44823c;
                                            if (list7 == null) {
                                                kotlin.jvm.internal.m.n(str);
                                                throw th2;
                                            }
                                            testModel2 = (TestModel) list7.get(list7.size() - 1);
                                        } else {
                                            testModel = th2;
                                        }
                                        if (testModel == 0 || testModel.elemType != testModel6.elemType) {
                                            testModel = testModel2;
                                            testModel = testModel2;
                                        } else {
                                            testModel = testModel2;
                                            if (arrayListC2.size() > 1) {
                                                try {
                                                    if (arrayListC2.contains(Integer.valueOf(testModel.modelType))) {
                                                        arrayListC2.remove(Integer.valueOf(testModel.modelType));
                                                    }
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    ry.l.Z(strArr, str7);
                                                    String str12 = strArr5[i25];
                                                    e.getMessage();
                                                }
                                            }
                                        }
                                        int size2 = arrayListC2.size();
                                        if (size2 <= 0) {
                                            throw new RuntimeException();
                                        }
                                        testModel6.modelType = ((Number) arrayListC2.get(Math.abs(new Random().nextInt()) % size2)).intValue();
                                        List list8 = (List) this.f44823c;
                                        if (list8 == null) {
                                            kotlin.jvm.internal.m.n(str);
                                            throw th2;
                                        }
                                        list8.add(testModel6);
                                        i24++;
                                        num2 = num4;
                                        strArr3 = strArr5;
                                        str2 = str2;
                                        str5 = str3;
                                    } catch (Exception e11) {
                                        e = e11;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                str3 = str5;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            str3 = str5;
                        }
                        ry.l.Z(strArr, str7);
                        String str13 = strArr5[i25];
                        e.getMessage();
                        i24++;
                        num2 = num4;
                        strArr3 = strArr5;
                        str2 = str2;
                        str5 = str3;
                    }
                }
                num = num2;
                str4 = str5;
            }
            i17 = i11 + 1;
            i14 = 0;
            i16 = 1;
            rVar = rVar2;
            length = i19;
            num2 = num;
            num3 = num3;
            str5 = str4;
            i15 = 10;
        }
    }

    public void C(lw.a aVar, Object obj) {
        if (((IdentityHashMap) this.f44823c) == null) {
            this.f44823c = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.f44823c).put(aVar, obj);
    }

    @Override // jp.m0
    public void D(ConstraintLayout constraintLayout) {
        ((TextView) ((jp.p0) ((f0) this.f44822b).f47881a).y().findViewById(R.id.txt_answer_txt_2)).setText((SpannableStringBuilder) this.f44823c);
    }

    @Override // th.c, th.b
    public void a() {
        ArrayList arrayList;
        int i11 = 0;
        switch (this.f44821a) {
            case 3:
                ScDetailAdapter scDetailAdapter = (ScDetailAdapter) this.f44822b;
                if (scDetailAdapter.f21767i) {
                    th.e eVar = scDetailAdapter.f21759a;
                    String str = (String) this.f44823c;
                    eVar.m(scDetailAdapter.f21769k ? 0.8f : 1.0f, false);
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    if (cf.x.n().keyLanguage != 57) {
                        eVar.h(str);
                    } else {
                        Uri uri = Uri.parse(str);
                        kotlin.jvm.internal.m.e(uri, "parse(...)");
                        eVar.j(uri);
                    }
                }
                break;
            case 12:
                c0 c0Var = (c0) this.f44822b;
                rx.b bVar = c0Var.f32213a0;
                if (bVar != null) {
                    bVar.dispose();
                }
                Drawable background = ((ImageView) ((View) this.f44823c).findViewById(R.id.iv_audio)).getBackground();
                kotlin.jvm.internal.m.e(background, "getBackground(...)");
                if (background instanceof AnimationDrawable) {
                    AnimationDrawable animationDrawable = (AnimationDrawable) background;
                    animationDrawable.selectDrawable(0);
                    animationDrawable.stop();
                }
                int i12 = c0Var.Y + 1;
                c0Var.Y = i12;
                PdLearnDetailAdapter pdLearnDetailAdapter = c0Var.P;
                if (i12 >= ((pdLearnDetailAdapter == null || (arrayList = pdLearnDetailAdapter.f21637l) == null) ? 0 : arrayList.size())) {
                    c0Var.Y = 0;
                }
                xx.f fVar = c0Var.W;
                if (fVar != null) {
                    ux.b.a(fVar);
                }
                xx.f fVarH = qx.h.m(800L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new hd.b(c0Var, 17), vx.b.f54316e);
                th.j.a(fVarH, c0Var.f36401t);
                c0Var.W = fVarH;
                PdLearnDetailAdapter pdLearnDetailAdapter2 = c0Var.P;
                if (pdLearnDetailAdapter2 != null) {
                    pdLearnDetailAdapter2.b();
                }
                break;
            case 15:
                jp.p0 p0Var = (jp.p0) this.f44822b;
                dm.a aVar = new dm.a(p0Var, 19);
                p0Var.X = aVar;
                th.e eVar2 = p0Var.V;
                if (eVar2 != null) {
                    eVar2.f52417d = aVar;
                }
                if (eVar2 != null) {
                    eVar2.m(p0Var.r().audioSpeed / 100.0f, false);
                }
                th.e eVar3 = p0Var.V;
                if (eVar3 != null) {
                    eVar3.h(((String[]) this.f44823c)[1]);
                }
                break;
            default:
                l1 l1Var = (l1) this.f44822b;
                rz.e0.B(ViewModelKt.getViewModelScope(l1Var), null, null, new kr.g1(i11, l1Var, null), 3);
                break;
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f44821a) {
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                Long it = (Long) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ((om.b) this.f44822b).a((FrameLayout) this.f44823c);
                break;
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                qh.c0 c0Var = (qh.c0) this.f44822b;
                ArrayList arrayList = c0Var.O;
                View view = (View) arrayList.get(0);
                y yVar = (y) this.f44823c;
                view.setX(((LinearLayout) yVar.f38361a).getX() + (((LinearLayout) yVar.f38361a).getWidth() / 6));
                View view2 = (View) arrayList.get(0);
                float y10 = ((LinearLayout) yVar.f38361a).getY();
                Context contextRequireContext = c0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                view2.setY(y10 - j3.Z(21, contextRequireContext));
                ((View) arrayList.get(1)).setX(((LinearLayout) yVar.f38361a).getX() + ((((LinearLayout) yVar.f38361a).getWidth() * 2) / 6));
                View view3 = (View) arrayList.get(1);
                float y11 = ((LinearLayout) yVar.f38361a).getY();
                Context contextRequireContext2 = c0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                view3.setY(y11 - j3.Z(41, contextRequireContext2));
                ((View) arrayList.get(2)).setX(((LinearLayout) yVar.f38361a).getX() + ((((LinearLayout) yVar.f38361a).getWidth() * 3) / 6));
                View view4 = (View) arrayList.get(2);
                float y12 = ((LinearLayout) yVar.f38361a).getY();
                Context contextRequireContext3 = c0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                view4.setY(y12 - j3.Z(21, contextRequireContext3));
                ((View) arrayList.get(3)).setX(((LinearLayout) yVar.f38361a).getX() + ((((LinearLayout) yVar.f38361a).getWidth() * 4) / 6));
                View view5 = (View) arrayList.get(3);
                float y13 = ((LinearLayout) yVar.f38361a).getY();
                Context contextRequireContext4 = c0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                view5.setY(y13 - j3.Z(26, contextRequireContext4));
                ((View) arrayList.get(4)).setX(((LinearLayout) yVar.f38361a).getX() + ((((LinearLayout) yVar.f38361a).getWidth() * 5) / 6));
                View view6 = (View) arrayList.get(4);
                float y14 = ((LinearLayout) yVar.f38361a).getY();
                Context contextRequireContext5 = c0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
                view6.setY(y14 - j3.Z(36, contextRequireContext5));
                Iterator it3 = arrayList.iterator();
                kotlin.jvm.internal.m.e(it3, "iterator(...)");
                while (it3.hasNext()) {
                    Object next = it3.next();
                    kotlin.jvm.internal.m.e(next, "next(...)");
                    View view7 = (View) next;
                    view7.setVisibility(0);
                    ta.a aVar = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar);
                    float x11 = ((w5) aVar).f33526c.getX();
                    ta.a aVar2 = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    float x12 = ((w5) aVar2).f33531h.getX() + x11;
                    ta.a aVar3 = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar3);
                    float width = (x12 + (((w5) aVar3).f33531h.getWidth() / 2)) - (view7.getX() + (view7.getWidth() / 2));
                    ta.a aVar4 = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar4);
                    float y15 = ((w5) aVar4).f33526c.getY();
                    ta.a aVar5 = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar5);
                    float y16 = ((w5) aVar5).f33531h.getY() + y15;
                    ta.a aVar6 = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar6);
                    float height = (y16 + (((w5) aVar6).f33531h.getHeight() / 2)) - (view7.getY() + (view7.getHeight() / 2));
                    long jN = ((long) th.j.n(1, 10)) * 10;
                    w0 w0VarB = s0.b(view7);
                    w0VarB.k(width);
                    w0VarB.m(height);
                    w0VarB.c(CropImageView.DEFAULT_ASPECT_RATIO);
                    w0VarB.d(CropImageView.DEFAULT_ASPECT_RATIO);
                    w0VarB.e(400L);
                    w0VarB.h(jN);
                    w0VarB.i();
                }
                break;
        }
    }

    @Override // uw.c, uw.p
    public void b(ww.b bVar) {
        switch (this.f44821a) {
            case 6:
                zw.a.c((dx.a) this.f44822b, bVar);
                break;
            case 9:
                zw.a.f((fx.u) this.f44823c, bVar);
                break;
            default:
                ((uw.p) this.f44822b).b(bVar);
                break;
        }
    }

    @Override // i10.a
    public void c(Object obj, Object obj2) {
        ((HashMap) this.f44822b).put(obj, new WeakReference(obj2));
    }

    @Override // i10.a
    public void clear() {
        ReentrantLock reentrantLock = (ReentrantLock) this.f44823c;
        reentrantLock.lock();
        try {
            ((HashMap) this.f44822b).clear();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // i10.a
    public Object d(Object obj) {
        Reference reference = (Reference) ((HashMap) this.f44822b).get(obj);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    @Override // jp.g1
    public void e() {
        x1 x1Var = (x1) this.f44822b;
        l.m mVar = x1Var.f36398d;
        if (mVar != null) {
            mVar.setResult(INTENTS.RESULT_LESSON_QUIT);
            l.m mVar2 = x1Var.f36398d;
            kotlin.jvm.internal.m.c(mVar2);
            mVar2.finish();
        }
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(x1Var), null, null, new w1(x1Var, null, 2), 3);
    }

    @Override // jp.g1
    public void f() {
        ((h1) this.f44823c).v();
    }

    @Override // fv.e
    public void g() {
        MeAccountSettingsActivity meAccountSettingsActivity = (MeAccountSettingsActivity) this.f44822b;
        int i11 = MeAccountSettingsActivity.R;
        meAccountSettingsActivity.p().a(new zu.d(false), new ju.d(25), new ju.d(25));
        meAccountSettingsActivity.p().a(new zu.h((String) this.f44823c), new ju.d(25), new ju.d(25));
    }

    @Override // i10.a
    public Object get(Object obj) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f44823c;
        reentrantLock.lock();
        try {
            Reference reference = (Reference) ((HashMap) this.f44822b).get(obj);
            reentrantLock.unlock();
            if (reference != null) {
                return reference.get();
            }
            return null;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // l3.d
    public int i(int i11) {
        CharSequence charSequence = (CharSequence) this.f44822b;
        do {
            i11 = ((ar.f) this.f44823c).l(i11);
            if (i11 == -1 || i11 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i11)));
        return i11;
    }

    @Override // o20.m
    public Object j(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        JsonReader jsonReaderNewJsonReader = ((Gson) this.f44822b).newJsonReader(responseBody.charStream());
        try {
            Object obj2 = ((TypeAdapter) this.f44823c).read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            responseBody.close();
            return obj2;
        } catch (Throwable th2) {
            responseBody.close();
            throw th2;
        }
    }

    @Override // o20.g
    public Type k() {
        return (Type) this.f44822b;
    }

    @Override // l3.d
    public int l(int i11) {
        do {
            i11 = ((ar.f) this.f44823c).q(i11);
            if (i11 == -1 || i11 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f44822b).charAt(i11 - 1)));
        return i11;
    }

    @Override // i10.a
    public void lock() {
        ((ReentrantLock) this.f44823c).lock();
    }

    @Override // i10.a
    public boolean n(Object obj, Object obj2) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f44823c;
        reentrantLock.lock();
        try {
            if (get(obj) != obj2 || obj2 == null) {
                return false;
            }
            remove(obj);
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o20.g
    public Object o(b0 b0Var) {
        Executor executor = (Executor) this.f44823c;
        return executor == null ? b0Var : new o20.n(executor, b0Var);
    }

    @Override // uw.c
    public void onComplete() {
        switch (this.f44821a) {
            case 6:
                ((uw.c) this.f44823c).onComplete();
                break;
            default:
                ((uw.i) this.f44822b).onComplete();
                break;
        }
    }

    @Override // uw.c, uw.p
    public void onError(Throwable th2) {
        switch (this.f44821a) {
            case 6:
                ((uw.c) this.f44823c).onError(th2);
                break;
            case 9:
                ((uw.i) this.f44822b).onError(th2);
                break;
            default:
                ((uw.p) this.f44822b).onError(th2);
                break;
        }
    }

    @Override // uw.i
    public void onSuccess(Object obj) {
        switch (this.f44821a) {
            case 9:
                ((uw.i) this.f44822b).onSuccess(obj);
                break;
            default:
                uw.p pVar = (uw.p) this.f44822b;
                try {
                    ((yw.b) ((hx.b) this.f44823c).f33832c).accept(obj);
                    pVar.onSuccess(obj);
                } catch (Throwable th2) {
                    g0.D(th2);
                    pVar.onError(th2);
                }
                break;
        }
    }

    @Override // l3.d
    public int p(int i11) {
        do {
            i11 = ((ar.f) this.f44823c).q(i11);
            if (i11 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f44822b).charAt(i11)));
        return i11;
    }

    @Override // i10.a
    public void put(Object obj, Object obj2) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f44823c;
        reentrantLock.lock();
        try {
            ((HashMap) this.f44822b).put(obj, new WeakReference(obj2));
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l3.d
    public int q(int i11) {
        do {
            i11 = ((ar.f) this.f44823c).l(i11);
            if (i11 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f44822b).charAt(i11 - 1)));
        return i11;
    }

    @Override // fv.e
    public void r() {
        MeAccountSettingsActivity meAccountSettingsActivity = (MeAccountSettingsActivity) this.f44822b;
        int i11 = MeAccountSettingsActivity.R;
        meAccountSettingsActivity.p().a(new zu.d(false), new ju.d(25), new ju.d(25));
    }

    @Override // i10.a
    public void remove(Object obj) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f44823c;
        reentrantLock.lock();
        try {
            ((HashMap) this.f44822b).remove(obj);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // d7.e
    public d7.f s() {
        return new d7.i((Context) this.f44822b, ((ar.f) this.f44823c).s());
    }

    @Override // av.k
    public void start() {
        l1 l1Var = (l1) this.f44822b;
        z1 z1Var = l1Var.f38529t;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        l1Var.f38529t = rz.e0.B(ViewModelKt.getViewModelScope(l1Var), null, null, new kr.h1((a1) this.f44823c, l1Var, null), 3);
    }

    @Override // i10.a
    public void t(ArrayList arrayList) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f44823c;
        reentrantLock.lock();
        try {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((HashMap) this.f44822b).remove(obj);
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public String toString() {
        switch (this.f44821a) {
            case 1:
                String strH = "[ ";
                if (((b4.h) this.f44822b) != null) {
                    for (int i11 = 0; i11 < 9; i11++) {
                        strH = nv.p.h(((b4.h) this.f44822b).H[i11], " ", ep.a.n(strH));
                    }
                }
                StringBuilder sbR = defpackage.e.r(strH, "] ");
                sbR.append((b4.h) this.f44822b);
                return sbR.toString();
            default:
                return super.toString();
        }
    }

    public lw.b u() {
        if (((IdentityHashMap) this.f44823c) != null) {
            for (Map.Entry entry : ((lw.b) this.f44822b).f40343a.entrySet()) {
                if (!((IdentityHashMap) this.f44823c).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.f44823c).put((lw.a) entry.getKey(), entry.getValue());
                }
            }
            this.f44822b = new lw.b((IdentityHashMap) this.f44823c);
            this.f44823c = null;
        }
        return (lw.b) this.f44822b;
    }

    @Override // i10.a
    public void unlock() {
        ((ReentrantLock) this.f44823c).unlock();
    }

    public boolean v(int i11) {
        return ((y6.n) this.f44822b).f57235a.get(i11);
    }

    @Override // m7.k
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public m7.c h(oi.c cVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = ((m7.n) cVar.f44925a).f40984a;
        m7.c cVar2 = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                m7.c cVar3 = new m7.c(mediaCodecCreateByCodecName, (HandlerThread) ((m7.b) this.f44822b).get(), new m7.e(mediaCodecCreateByCodecName, (HandlerThread) ((m7.b) this.f44823c).get()), (m7.j) cVar.f44930f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) cVar.f44928d;
                    m7.c.p(cVar3, (MediaFormat) cVar.f44926b, surface, (MediaCrypto) cVar.f44929e, (surface == null && ((m7.n) cVar.f44925a).f40991h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    return cVar3;
                } catch (Exception e8) {
                    e = e8;
                    cVar2 = cVar3;
                    if (cVar2 != null) {
                        cVar2.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodecCreateByCodecName = null;
        }
    }

    public void x(f7.f fVar) {
        synchronized (fVar) {
        }
        Handler handler = (Handler) this.f44822b;
        if (handler != null) {
            handler.post(new b2.c(19, this, fVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0287  */
    /* JADX WARN: Code duplicated, block: B:107:0x028f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0450  */
    /* JADX WARN: Code duplicated, block: B:171:0x0458  */
    /* JADX WARN: Code duplicated, block: B:173:0x0468  */
    /* JADX WARN: Code duplicated, block: B:175:0x0472  */
    /* JADX WARN: Code duplicated, block: B:184:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:186:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:188:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:190:0x0505  */
    /* JADX WARN: Code duplicated, block: B:197:0x051b  */
    /* JADX WARN: Code duplicated, block: B:198:0x0520  */
    /* JADX WARN: Code duplicated, block: B:200:0x0526  */
    /* JADX WARN: Code duplicated, block: B:203:0x0557 A[LOOP:7: B:201:0x0551->B:203:0x0557, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x057c  */
    /* JADX WARN: Code duplicated, block: B:299:0x0587 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x057f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x020a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0218  */
    /* JADX WARN: Code duplicated, block: B:88:0x0224  */
    /* JADX WARN: Code duplicated, block: B:90:0x0228  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r10v14, types: [ry.r] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r43v1 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    public ArrayList y(String repeatRegex, boolean z11) throws Exception {
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        boolean z14;
        boolean z15;
        Iterator it;
        qt.c cVar;
        qt.l lVar;
        Object mVar;
        Object lVar2;
        List list;
        ArrayList arrayList;
        int i13;
        Object lVar3;
        Object lVar4;
        int i14;
        qt.n[] nVarArr;
        int[] iArrE;
        int length;
        int i15;
        qt.n nVar;
        qt.d dVar;
        qt.c cVar2;
        ArrayList arrayListC1;
        int size;
        ArrayList arrayList2;
        Iterator it2;
        qt.d dVar2;
        qt.f fVar;
        qt.n nVar2;
        qt.f fVar2;
        o0 o0Var = (o0) ((n0) this.f44822b);
        int i16 = o0Var.f27733a.keyLanguage;
        boolean z16 = o0Var.z();
        boolean z17 = xt.b.f56282d;
        kotlin.jvm.internal.m.f(repeatRegex, "repeatRegex");
        int i17 = 2;
        ?? r9 = 0;
        int i18 = 1;
        if (oz.q.K0(repeatRegex)) {
            z12 = z16;
            z13 = z17;
            lVar4 = new qt.l(new qt.g("整体配置"));
        } else {
            ArrayList arrayList3 = new ArrayList();
            int i19 = 6;
            List listW0 = oz.q.W0(repeatRegex, new String[]{"#"}, 0, 6);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : listW0) {
                if (!oz.q.K0((String) obj)) {
                    arrayList4.add(obj);
                }
            }
            Iterator it3 = arrayList4.iterator();
            int i21 = 0;
            while (it3.hasNext()) {
                int i22 = i21 + 1;
                String strQ0 = (String) it3.next();
                if (x.s0(strQ0, "3:", r9)) {
                    strQ0 = x.q0(x.q0(strQ0, ":-", ":0-"), ":;", ":0;");
                }
                ?? W0 = oz.q.W0(strQ0, new String[]{";"}, r9, i19);
                if (W0.isEmpty()) {
                    z14 = z16;
                    z15 = z17;
                    it = it3;
                    lVar3 = new qt.l(new qt.g(nv.p.j(i21, "段落")));
                } else {
                    String str = (String) W0.get(r9);
                    if (W0.size() > i17) {
                        try {
                            i11 = Integer.parseInt((String) W0.get(i17));
                            if (i11 < i18) {
                                i11 = i18;
                            }
                        } catch (NumberFormatException unused) {
                            Objects.toString(W0.get(i17));
                        }
                        i12 = i11;
                    } else {
                        i12 = i18;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    List listW1 = oz.q.W0(str, new String[]{"-"}, r9, i19);
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : listW1) {
                        if (!oz.q.K0((String) obj2)) {
                            arrayList6.add(obj2);
                        }
                    }
                    Iterator it4 = arrayList6.iterator();
                    ?? r11 = r9;
                    while (it4.hasNext()) {
                        int i23 = r11 + 1;
                        String str2 = (String) it4.next();
                        ?? r43 = r11;
                        boolean z18 = z16;
                        List listW2 = oz.q.W0(str2, new String[]{":"}, 0, i19);
                        if (listW2.size() < 3) {
                            z17 = z17;
                            it4 = it4;
                            it3 = it3;
                            mVar = new qt.l(new qt.j(str2, (i21 * 100) + (r43 == true ? 1 : 0)));
                        } else {
                            try {
                                qt.b bVar = qt.c.Companion;
                                String str3 = (String) listW2.get(0);
                                bVar.getClass();
                                kotlin.jvm.internal.m.f(str3, "str");
                                int i24 = Integer.parseInt(str3);
                                qt.c[] cVarArrValues = qt.c.values();
                                int length2 = cVarArrValues.length;
                                int i25 = 0;
                                while (true) {
                                    if (i25 >= length2) {
                                        cVar = null;
                                        break;
                                    }
                                    cVar = cVarArrValues[i25];
                                    int i26 = i25;
                                    if (cVar.a() == i24) {
                                        break;
                                    }
                                    i25 = i26 + 1;
                                }
                                qt.c cVar3 = cVar;
                                if (cVar3 != null) {
                                    try {
                                        Iterator it5 = it4;
                                        try {
                                            long j11 = Long.parseLong((String) listW2.get(1));
                                            z17 = z17;
                                            String str4 = (String) listW2.get(2);
                                            ArrayList arrayList7 = new ArrayList();
                                            try {
                                                ArrayList arrayListM = ks.b.m(str4);
                                                it3 = it3;
                                                try {
                                                    int size2 = arrayListM.size();
                                                    it4 = it5;
                                                    int i27 = 0;
                                                    while (i27 < size2) {
                                                        try {
                                                            Object obj3 = arrayListM.get(i27);
                                                            i27++;
                                                            int iIntValue = ((Number) obj3).intValue();
                                                            try {
                                                                qt.f.Companion.getClass();
                                                                arrayList = arrayListM;
                                                                try {
                                                                    qt.f fVarA = qt.e.a(iIntValue);
                                                                    i13 = size2;
                                                                    if (fVarA != qt.f.MODEL_12 || cVar3 != qt.c.SENTENCE || i16 == 3) {
                                                                        arrayList7.add(fVarA);
                                                                    }
                                                                } catch (IllegalArgumentException unused2) {
                                                                    i13 = size2;
                                                                }
                                                            } catch (IllegalArgumentException unused3) {
                                                                arrayList = arrayListM;
                                                            }
                                                            size2 = i13;
                                                            arrayListM = arrayList;
                                                        } catch (Exception unused4) {
                                                            lVar2 = new qt.l(new qt.k(str4));
                                                            if (lVar2 instanceof qt.m) {
                                                                list = (List) ((qt.m) lVar2).f48334a;
                                                                if (list.isEmpty()) {
                                                                    mVar = new qt.l(new qt.g("题型列表"));
                                                                } else {
                                                                    mVar = new qt.m(new qt.n(cVar3, j11, list));
                                                                }
                                                            } else {
                                                                if (!(lVar2 instanceof qt.l)) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                lVar = new qt.l(((qt.l) lVar2).f48333a);
                                                                mVar = lVar;
                                                            }
                                                            if (mVar instanceof qt.m) {
                                                                arrayList5.add(((qt.m) mVar).f48334a);
                                                            } else if (mVar instanceof qt.l) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            r11 = i23;
                                                            z16 = z18;
                                                            z17 = z17;
                                                            it3 = it3;
                                                            it4 = it4;
                                                            i19 = 6;
                                                        }
                                                    }
                                                    lVar2 = new qt.m(arrayList7);
                                                } catch (Exception unused5) {
                                                    it4 = it5;
                                                    lVar2 = new qt.l(new qt.k(str4));
                                                    if (lVar2 instanceof qt.m) {
                                                        list = (List) ((qt.m) lVar2).f48334a;
                                                        if (list.isEmpty()) {
                                                            mVar = new qt.l(new qt.g("题型列表"));
                                                        } else {
                                                            mVar = new qt.m(new qt.n(cVar3, j11, list));
                                                        }
                                                    } else {
                                                        if (!(lVar2 instanceof qt.l)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        lVar = new qt.l(((qt.l) lVar2).f48333a);
                                                        mVar = lVar;
                                                    }
                                                    if (mVar instanceof qt.m) {
                                                        arrayList5.add(((qt.m) mVar).f48334a);
                                                    } else if (mVar instanceof qt.l) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    r11 = i23;
                                                    z16 = z18;
                                                    z17 = z17;
                                                    it3 = it3;
                                                    it4 = it4;
                                                    i19 = 6;
                                                }
                                            } catch (Exception unused6) {
                                                it3 = it3;
                                            }
                                            if (lVar2 instanceof qt.m) {
                                                list = (List) ((qt.m) lVar2).f48334a;
                                                if (list.isEmpty()) {
                                                    mVar = new qt.l(new qt.g("题型列表"));
                                                } else {
                                                    mVar = new qt.m(new qt.n(cVar3, j11, list));
                                                }
                                            } else {
                                                if (!(lVar2 instanceof qt.l)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                lVar = new qt.l(((qt.l) lVar2).f48333a);
                                                mVar = lVar;
                                            }
                                        } catch (NumberFormatException e8) {
                                            e = e8;
                                            it4 = it5;
                                            lVar = new qt.l(new qt.h((String) listW2.get(1), e));
                                        }
                                    } catch (NumberFormatException e10) {
                                        e = e10;
                                        it4 = it4;
                                    }
                                } else {
                                    try {
                                        throw new IllegalArgumentException(nv.p.j(i24, "未知的元素类型: "));
                                    } catch (IllegalArgumentException unused7) {
                                        mVar = new qt.l(new qt.i((String) listW2.get(0)));
                                        if (mVar instanceof qt.m) {
                                            arrayList5.add(((qt.m) mVar).f48334a);
                                        } else if (mVar instanceof qt.l) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        r11 = i23;
                                        z16 = z18;
                                        z17 = z17;
                                        it3 = it3;
                                        it4 = it4;
                                        i19 = 6;
                                    }
                                }
                            } catch (IllegalArgumentException unused8) {
                            }
                        }
                        if (mVar instanceof qt.m) {
                            arrayList5.add(((qt.m) mVar).f48334a);
                        } else if (mVar instanceof qt.l) {
                            throw new NoWhenBranchMatchedException();
                        }
                        r11 = i23;
                        z16 = z18;
                        z17 = z17;
                        it3 = it3;
                        it4 = it4;
                        i19 = 6;
                    }
                    z14 = z16;
                    z15 = z17;
                    it = it3;
                    lVar3 = arrayList5.isEmpty() ? new qt.l(new qt.g(p0.h(i21, "段落", "的配置项"))) : new qt.m(new qt.o(i12, arrayList5));
                }
                if (lVar3 instanceof qt.m) {
                    arrayList3.add(((qt.m) lVar3).f48334a);
                } else if (!(lVar3 instanceof qt.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                i21 = i22;
                z16 = z14;
                z17 = z15;
                it3 = it;
                i17 = 2;
                r9 = 0;
                i18 = 1;
                i19 = 6;
            }
            z12 = z16;
            z13 = z17;
            lVar4 = arrayList3.isEmpty() ? new qt.l(new qt.g("所有段落")) : new qt.m(new qt.a(arrayList3));
        }
        if (!(lVar4 instanceof qt.m)) {
            throw new Exception("配置解析失败");
        }
        qt.a aVar = (qt.a) ((qt.m) lVar4).f48334a;
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = aVar.f48320a;
        int size3 = arrayList9.size();
        int i28 = 0;
        while (i28 < size3) {
            Object obj4 = arrayList9.get(i28);
            i28++;
            qt.o oVar = (qt.o) obj4;
            ArrayList arrayList10 = oVar.f48338a;
            boolean zIsEmpty = arrayList10.isEmpty();
            ?? arrayList11 = ry.r.f50854a;
            if (!zIsEmpty) {
                if (!arrayList10.isEmpty()) {
                    int size4 = arrayList10.size();
                    qt.n nVar3 = (qt.n) ry.m.q0(arrayList10);
                    List list2 = nVar3.f48337c;
                    qt.c cVar4 = nVar3.f48335a;
                    qt.f fVar3 = (qt.f) ry.m.s0(list2);
                    if (fVar3 != null) {
                        int iB = fVar3.b();
                        if (size4 >= 2 && ry.l.D(new Integer[]{Integer.valueOf(qt.c.WORD.a()), Integer.valueOf(qt.c.CHARACTER.a())}, Integer.valueOf(cVar4.a()))) {
                            qt.f.Companion.getClass();
                            List listL = ns.o.L(qt.f.MODEL_0, qt.f.MODEL_2, qt.f.MODEL_6, qt.f.MODEL_13);
                            ArrayList arrayList12 = new ArrayList(ry.n.W(listL, 10));
                            Iterator it6 = listL.iterator();
                            while (it6.hasNext()) {
                                arrayList12.add(Integer.valueOf(((qt.f) it6.next()).b()));
                            }
                            if (arrayList12.contains(Integer.valueOf(iB)) && !(cVar4 == qt.c.WORD && iB == qt.f.MODEL_2.b())) {
                                ArrayList arrayList13 = new ArrayList(ry.n.W(arrayList10, 10));
                                int size5 = arrayList10.size();
                                int i29 = 0;
                                while (i29 < size5) {
                                    Object obj5 = arrayList10.get(i29);
                                    i29++;
                                    arrayList13.add(Long.valueOf(((qt.n) obj5).f48336b));
                                }
                                qt.n nVar4 = (qt.n) ry.m.q0(arrayList10);
                                qt.f fVar4 = (qt.f) ry.m.s0(nVar4.f48337c);
                                if (fVar4 != null) {
                                    if (fVar4 == qt.f.MODEL_0) {
                                        fVar4 = qt.f.MODEL_6;
                                    }
                                    qt.f fVar5 = fVar4;
                                    List listT = tw.c.t(arrayList13);
                                    arrayList11 = new ArrayList(ry.n.W(listT, 10));
                                    Iterator it7 = listT.iterator();
                                    while (it7.hasNext()) {
                                        arrayList11.add(new qt.d(nVar4.f48335a, 0L, fVar5, (List) it7.next(), null, 16));
                                    }
                                }
                            } else if (arrayList10.isEmpty()) {
                                int i30 = oVar.f48339b;
                                arrayList11 = new ArrayList();
                                nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                                iArrE = cf.x.E(nVarArr.length, i30);
                                length = iArrE.length;
                                i15 = 0;
                                while (i15 < length) {
                                    nVar = nVarArr[iArrE[i15]];
                                    dVar = (qt.d) ry.m.A0(arrayList11);
                                    List list3 = nVar.f48337c;
                                    cVar2 = nVar.f48335a;
                                    arrayListC1 = ry.m.c1(list3);
                                    if (dVar != null) {
                                        fVar = dVar.f48323c;
                                        if (dVar.f48321a == cVar2) {
                                            arrayListC1.remove(fVar);
                                        }
                                    }
                                    if (arrayListC1.isEmpty()) {
                                        dVar2 = null;
                                    } else {
                                        size = arrayListC1.size();
                                        if (size <= 0) {
                                            throw new RuntimeException();
                                        }
                                        qt.f fVar6 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                                        long j12 = nVar.f48336b;
                                        List list4 = nVar.f48337c;
                                        arrayList2 = new ArrayList(ry.n.W(list4, 10));
                                        it2 = list4.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                                        }
                                        dVar2 = new qt.d(cVar2, j12, fVar6, null, arrayList2, 8);
                                    }
                                    if (dVar2 != null) {
                                        arrayList11.add(dVar2);
                                    }
                                    i15++;
                                    arrayList9 = arrayList9;
                                }
                            } else {
                                nVar2 = (qt.n) ry.m.q0(arrayList10);
                                fVar2 = (qt.f) ry.m.s0(nVar2.f48337c);
                                if (fVar2 != null) {
                                    int iB2 = fVar2.b();
                                    if (nVar2.f48335a == qt.c.PHRASE) {
                                        int i31 = oVar.f48339b;
                                        arrayList11 = new ArrayList();
                                        nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                                        iArrE = cf.x.E(nVarArr.length, i31);
                                        length = iArrE.length;
                                        i15 = 0;
                                        while (i15 < length) {
                                            nVar = nVarArr[iArrE[i15]];
                                            dVar = (qt.d) ry.m.A0(arrayList11);
                                            List list5 = nVar.f48337c;
                                            cVar2 = nVar.f48335a;
                                            arrayListC1 = ry.m.c1(list5);
                                            if (dVar != null) {
                                                fVar = dVar.f48323c;
                                                if (dVar.f48321a == cVar2) {
                                                    arrayListC1.remove(fVar);
                                                }
                                            }
                                            if (arrayListC1.isEmpty()) {
                                                dVar2 = null;
                                            } else {
                                                size = arrayListC1.size();
                                                if (size <= 0) {
                                                    throw new RuntimeException();
                                                }
                                                qt.f fVar7 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                                                long j13 = nVar.f48336b;
                                                List list6 = nVar.f48337c;
                                                arrayList2 = new ArrayList(ry.n.W(list6, 10));
                                                it2 = list6.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                                                }
                                                dVar2 = new qt.d(cVar2, j13, fVar7, null, arrayList2, 8);
                                            }
                                            if (dVar2 != null) {
                                                arrayList11.add(dVar2);
                                            }
                                            i15++;
                                            arrayList9 = arrayList9;
                                        }
                                    } else {
                                        int i32 = oVar.f48339b;
                                        arrayList11 = new ArrayList();
                                        nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                                        iArrE = cf.x.E(nVarArr.length, i32);
                                        length = iArrE.length;
                                        i15 = 0;
                                        while (i15 < length) {
                                            nVar = nVarArr[iArrE[i15]];
                                            dVar = (qt.d) ry.m.A0(arrayList11);
                                            List list7 = nVar.f48337c;
                                            cVar2 = nVar.f48335a;
                                            arrayListC1 = ry.m.c1(list7);
                                            if (dVar != null) {
                                                fVar = dVar.f48323c;
                                                if (dVar.f48321a == cVar2) {
                                                    arrayListC1.remove(fVar);
                                                }
                                            }
                                            if (arrayListC1.isEmpty()) {
                                                dVar2 = null;
                                            } else {
                                                size = arrayListC1.size();
                                                if (size <= 0) {
                                                    throw new RuntimeException();
                                                }
                                                qt.f fVar8 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                                                long j14 = nVar.f48336b;
                                                List list8 = nVar.f48337c;
                                                arrayList2 = new ArrayList(ry.n.W(list8, 10));
                                                it2 = list8.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                                                }
                                                dVar2 = new qt.d(cVar2, j14, fVar8, null, arrayList2, 8);
                                            }
                                            if (dVar2 != null) {
                                                arrayList11.add(dVar2);
                                            }
                                            i15++;
                                            arrayList9 = arrayList9;
                                        }
                                    }
                                } else {
                                    int i33 = oVar.f48339b;
                                    arrayList11 = new ArrayList();
                                    nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                                    iArrE = cf.x.E(nVarArr.length, i33);
                                    length = iArrE.length;
                                    i15 = 0;
                                    while (i15 < length) {
                                        nVar = nVarArr[iArrE[i15]];
                                        dVar = (qt.d) ry.m.A0(arrayList11);
                                        List list9 = nVar.f48337c;
                                        cVar2 = nVar.f48335a;
                                        arrayListC1 = ry.m.c1(list9);
                                        if (dVar != null) {
                                            fVar = dVar.f48323c;
                                            if (dVar.f48321a == cVar2) {
                                                arrayListC1.remove(fVar);
                                            }
                                        }
                                        if (arrayListC1.isEmpty()) {
                                            dVar2 = null;
                                        } else {
                                            size = arrayListC1.size();
                                            if (size <= 0) {
                                                throw new RuntimeException();
                                            }
                                            qt.f fVar9 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                                            long j15 = nVar.f48336b;
                                            List list10 = nVar.f48337c;
                                            arrayList2 = new ArrayList(ry.n.W(list10, 10));
                                            it2 = list10.iterator();
                                            while (it2.hasNext()) {
                                                arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                                            }
                                            dVar2 = new qt.d(cVar2, j15, fVar9, null, arrayList2, 8);
                                        }
                                        if (dVar2 != null) {
                                            arrayList11.add(dVar2);
                                        }
                                        i15++;
                                        arrayList9 = arrayList9;
                                    }
                                }
                            }
                        } else if (arrayList10.isEmpty()) {
                            int i34 = oVar.f48339b;
                            arrayList11 = new ArrayList();
                            nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                            iArrE = cf.x.E(nVarArr.length, i34);
                            length = iArrE.length;
                            i15 = 0;
                            while (i15 < length) {
                                nVar = nVarArr[iArrE[i15]];
                                dVar = (qt.d) ry.m.A0(arrayList11);
                                List list11 = nVar.f48337c;
                                cVar2 = nVar.f48335a;
                                arrayListC1 = ry.m.c1(list11);
                                if (dVar != null) {
                                    fVar = dVar.f48323c;
                                    if (dVar.f48321a == cVar2) {
                                        arrayListC1.remove(fVar);
                                    }
                                }
                                if (arrayListC1.isEmpty()) {
                                    dVar2 = null;
                                } else {
                                    size = arrayListC1.size();
                                    if (size <= 0) {
                                        throw new RuntimeException();
                                    }
                                    qt.f fVar10 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                                    long j16 = nVar.f48336b;
                                    List list12 = nVar.f48337c;
                                    arrayList2 = new ArrayList(ry.n.W(list12, 10));
                                    it2 = list12.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                                    }
                                    dVar2 = new qt.d(cVar2, j16, fVar10, null, arrayList2, 8);
                                }
                                if (dVar2 != null) {
                                    arrayList11.add(dVar2);
                                }
                                i15++;
                                arrayList9 = arrayList9;
                            }
                        } else {
                            nVar2 = (qt.n) ry.m.q0(arrayList10);
                            fVar2 = (qt.f) ry.m.s0(nVar2.f48337c);
                            if (fVar2 != null) {
                                int iB3 = fVar2.b();
                                if (nVar2.f48335a == qt.c.PHRASE) {
                                    int i35 = oVar.f48339b;
                                    arrayList11 = new ArrayList();
                                    nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                                    iArrE = cf.x.E(nVarArr.length, i35);
                                    length = iArrE.length;
                                    i15 = 0;
                                    while (i15 < length) {
                                        nVar = nVarArr[iArrE[i15]];
                                        dVar = (qt.d) ry.m.A0(arrayList11);
                                        List list13 = nVar.f48337c;
                                        cVar2 = nVar.f48335a;
                                        arrayListC1 = ry.m.c1(list13);
                                        if (dVar != null) {
                                            fVar = dVar.f48323c;
                                            if (dVar.f48321a == cVar2) {
                                                arrayListC1.remove(fVar);
                                            }
                                        }
                                        if (arrayListC1.isEmpty()) {
                                            dVar2 = null;
                                        } else {
                                            size = arrayListC1.size();
                                            if (size <= 0) {
                                                throw new RuntimeException();
                                            }
                                            qt.f fVar11 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                                            long j17 = nVar.f48336b;
                                            List list14 = nVar.f48337c;
                                            arrayList2 = new ArrayList(ry.n.W(list14, 10));
                                            it2 = list14.iterator();
                                            while (it2.hasNext()) {
                                                arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                                            }
                                            dVar2 = new qt.d(cVar2, j17, fVar11, null, arrayList2, 8);
                                        }
                                        if (dVar2 != null) {
                                            arrayList11.add(dVar2);
                                        }
                                        i15++;
                                        arrayList9 = arrayList9;
                                    }
                                } else {
                                    int i36 = oVar.f48339b;
                                    arrayList11 = new ArrayList();
                                    nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                                    iArrE = cf.x.E(nVarArr.length, i36);
                                    length = iArrE.length;
                                    i15 = 0;
                                    while (i15 < length) {
                                        nVar = nVarArr[iArrE[i15]];
                                        dVar = (qt.d) ry.m.A0(arrayList11);
                                        List list15 = nVar.f48337c;
                                        cVar2 = nVar.f48335a;
                                        arrayListC1 = ry.m.c1(list15);
                                        if (dVar != null) {
                                            fVar = dVar.f48323c;
                                            if (dVar.f48321a == cVar2) {
                                                arrayListC1.remove(fVar);
                                            }
                                        }
                                        if (arrayListC1.isEmpty()) {
                                            dVar2 = null;
                                        } else {
                                            size = arrayListC1.size();
                                            if (size <= 0) {
                                                throw new RuntimeException();
                                            }
                                            qt.f fVar12 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                                            long j18 = nVar.f48336b;
                                            List list16 = nVar.f48337c;
                                            arrayList2 = new ArrayList(ry.n.W(list16, 10));
                                            it2 = list16.iterator();
                                            while (it2.hasNext()) {
                                                arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                                            }
                                            dVar2 = new qt.d(cVar2, j18, fVar12, null, arrayList2, 8);
                                        }
                                        if (dVar2 != null) {
                                            arrayList11.add(dVar2);
                                        }
                                        i15++;
                                        arrayList9 = arrayList9;
                                    }
                                }
                            } else {
                                int i37 = oVar.f48339b;
                                arrayList11 = new ArrayList();
                                nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                                iArrE = cf.x.E(nVarArr.length, i37);
                                length = iArrE.length;
                                i15 = 0;
                                while (i15 < length) {
                                    nVar = nVarArr[iArrE[i15]];
                                    dVar = (qt.d) ry.m.A0(arrayList11);
                                    List list17 = nVar.f48337c;
                                    cVar2 = nVar.f48335a;
                                    arrayListC1 = ry.m.c1(list17);
                                    if (dVar != null) {
                                        fVar = dVar.f48323c;
                                        if (dVar.f48321a == cVar2) {
                                            arrayListC1.remove(fVar);
                                        }
                                    }
                                    if (arrayListC1.isEmpty()) {
                                        dVar2 = null;
                                    } else {
                                        size = arrayListC1.size();
                                        if (size <= 0) {
                                            throw new RuntimeException();
                                        }
                                        qt.f fVar13 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                                        long j19 = nVar.f48336b;
                                        List list18 = nVar.f48337c;
                                        arrayList2 = new ArrayList(ry.n.W(list18, 10));
                                        it2 = list18.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                                        }
                                        dVar2 = new qt.d(cVar2, j19, fVar13, null, arrayList2, 8);
                                    }
                                    if (dVar2 != null) {
                                        arrayList11.add(dVar2);
                                    }
                                    i15++;
                                    arrayList9 = arrayList9;
                                }
                            }
                        }
                    } else if (arrayList10.isEmpty()) {
                        int i38 = oVar.f48339b;
                        arrayList11 = new ArrayList();
                        nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                        iArrE = cf.x.E(nVarArr.length, i38);
                        length = iArrE.length;
                        i15 = 0;
                        while (i15 < length) {
                            nVar = nVarArr[iArrE[i15]];
                            dVar = (qt.d) ry.m.A0(arrayList11);
                            List list19 = nVar.f48337c;
                            cVar2 = nVar.f48335a;
                            arrayListC1 = ry.m.c1(list19);
                            if (dVar != null) {
                                fVar = dVar.f48323c;
                                if (dVar.f48321a == cVar2) {
                                    arrayListC1.remove(fVar);
                                }
                            }
                            if (arrayListC1.isEmpty()) {
                                dVar2 = null;
                            } else {
                                size = arrayListC1.size();
                                if (size <= 0) {
                                    throw new RuntimeException();
                                }
                                qt.f fVar14 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                                long j110 = nVar.f48336b;
                                List list110 = nVar.f48337c;
                                arrayList2 = new ArrayList(ry.n.W(list110, 10));
                                it2 = list110.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                                }
                                dVar2 = new qt.d(cVar2, j110, fVar14, null, arrayList2, 8);
                            }
                            if (dVar2 != null) {
                                arrayList11.add(dVar2);
                            }
                            i15++;
                            arrayList9 = arrayList9;
                        }
                    } else {
                        nVar2 = (qt.n) ry.m.q0(arrayList10);
                        fVar2 = (qt.f) ry.m.s0(nVar2.f48337c);
                        if (fVar2 != null) {
                            int iB4 = fVar2.b();
                            if (nVar2.f48335a == qt.c.PHRASE) {
                                int i39 = oVar.f48339b;
                                arrayList11 = new ArrayList();
                                nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                                iArrE = cf.x.E(nVarArr.length, i39);
                                length = iArrE.length;
                                i15 = 0;
                                while (i15 < length) {
                                    nVar = nVarArr[iArrE[i15]];
                                    dVar = (qt.d) ry.m.A0(arrayList11);
                                    List list111 = nVar.f48337c;
                                    cVar2 = nVar.f48335a;
                                    arrayListC1 = ry.m.c1(list111);
                                    if (dVar != null) {
                                        fVar = dVar.f48323c;
                                        if (dVar.f48321a == cVar2) {
                                            arrayListC1.remove(fVar);
                                        }
                                    }
                                    if (arrayListC1.isEmpty()) {
                                        dVar2 = null;
                                    } else {
                                        size = arrayListC1.size();
                                        if (size <= 0) {
                                            throw new RuntimeException();
                                        }
                                        qt.f fVar15 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                                        long j111 = nVar.f48336b;
                                        List list112 = nVar.f48337c;
                                        arrayList2 = new ArrayList(ry.n.W(list112, 10));
                                        it2 = list112.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                                        }
                                        dVar2 = new qt.d(cVar2, j111, fVar15, null, arrayList2, 8);
                                    }
                                    if (dVar2 != null) {
                                        arrayList11.add(dVar2);
                                    }
                                    i15++;
                                    arrayList9 = arrayList9;
                                }
                            } else {
                                int i310 = oVar.f48339b;
                                arrayList11 = new ArrayList();
                                nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                                iArrE = cf.x.E(nVarArr.length, i310);
                                length = iArrE.length;
                                i15 = 0;
                                while (i15 < length) {
                                    nVar = nVarArr[iArrE[i15]];
                                    dVar = (qt.d) ry.m.A0(arrayList11);
                                    List list113 = nVar.f48337c;
                                    cVar2 = nVar.f48335a;
                                    arrayListC1 = ry.m.c1(list113);
                                    if (dVar != null) {
                                        fVar = dVar.f48323c;
                                        if (dVar.f48321a == cVar2) {
                                            arrayListC1.remove(fVar);
                                        }
                                    }
                                    if (arrayListC1.isEmpty()) {
                                        dVar2 = null;
                                    } else {
                                        size = arrayListC1.size();
                                        if (size <= 0) {
                                            throw new RuntimeException();
                                        }
                                        qt.f fVar16 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                                        long j112 = nVar.f48336b;
                                        List list114 = nVar.f48337c;
                                        arrayList2 = new ArrayList(ry.n.W(list114, 10));
                                        it2 = list114.iterator();
                                        while (it2.hasNext()) {
                                            arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                                        }
                                        dVar2 = new qt.d(cVar2, j112, fVar16, null, arrayList2, 8);
                                    }
                                    if (dVar2 != null) {
                                        arrayList11.add(dVar2);
                                    }
                                    i15++;
                                    arrayList9 = arrayList9;
                                }
                            }
                        } else {
                            int i311 = oVar.f48339b;
                            arrayList11 = new ArrayList();
                            nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                            iArrE = cf.x.E(nVarArr.length, i311);
                            length = iArrE.length;
                            i15 = 0;
                            while (i15 < length) {
                                nVar = nVarArr[iArrE[i15]];
                                dVar = (qt.d) ry.m.A0(arrayList11);
                                List list115 = nVar.f48337c;
                                cVar2 = nVar.f48335a;
                                arrayListC1 = ry.m.c1(list115);
                                if (dVar != null) {
                                    fVar = dVar.f48323c;
                                    if (dVar.f48321a == cVar2) {
                                        arrayListC1.remove(fVar);
                                    }
                                }
                                if (arrayListC1.isEmpty()) {
                                    dVar2 = null;
                                } else {
                                    size = arrayListC1.size();
                                    if (size <= 0) {
                                        throw new RuntimeException();
                                    }
                                    qt.f fVar17 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                                    long j113 = nVar.f48336b;
                                    List list116 = nVar.f48337c;
                                    arrayList2 = new ArrayList(ry.n.W(list116, 10));
                                    it2 = list116.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                                    }
                                    dVar2 = new qt.d(cVar2, j113, fVar17, null, arrayList2, 8);
                                }
                                if (dVar2 != null) {
                                    arrayList11.add(dVar2);
                                }
                                i15++;
                                arrayList9 = arrayList9;
                            }
                        }
                    }
                } else if (arrayList10.isEmpty()) {
                    int i312 = oVar.f48339b;
                    arrayList11 = new ArrayList();
                    nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                    iArrE = cf.x.E(nVarArr.length, i312);
                    length = iArrE.length;
                    i15 = 0;
                    while (i15 < length) {
                        nVar = nVarArr[iArrE[i15]];
                        dVar = (qt.d) ry.m.A0(arrayList11);
                        List list117 = nVar.f48337c;
                        cVar2 = nVar.f48335a;
                        arrayListC1 = ry.m.c1(list117);
                        if (dVar != null) {
                            fVar = dVar.f48323c;
                            if (dVar.f48321a == cVar2 && arrayListC1.size() > 1 && arrayListC1.contains(fVar)) {
                                arrayListC1.remove(fVar);
                            }
                        }
                        if (arrayListC1.isEmpty()) {
                            dVar2 = null;
                        } else {
                            size = arrayListC1.size();
                            if (size <= 0) {
                                throw new RuntimeException();
                            }
                            qt.f fVar18 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                            long j114 = nVar.f48336b;
                            List list118 = nVar.f48337c;
                            arrayList2 = new ArrayList(ry.n.W(list118, 10));
                            it2 = list118.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                            }
                            dVar2 = new qt.d(cVar2, j114, fVar18, null, arrayList2, 8);
                        }
                        if (dVar2 != null) {
                            arrayList11.add(dVar2);
                        }
                        i15++;
                        arrayList9 = arrayList9;
                    }
                } else {
                    nVar2 = (qt.n) ry.m.q0(arrayList10);
                    fVar2 = (qt.f) ry.m.s0(nVar2.f48337c);
                    if (fVar2 != null) {
                        int iB5 = fVar2.b();
                        if (nVar2.f48335a == qt.c.PHRASE || iB5 != qt.f.MODEL_0.b()) {
                            int i313 = oVar.f48339b;
                            arrayList11 = new ArrayList();
                            nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                            iArrE = cf.x.E(nVarArr.length, i313);
                            length = iArrE.length;
                            i15 = 0;
                            while (i15 < length) {
                                nVar = nVarArr[iArrE[i15]];
                                dVar = (qt.d) ry.m.A0(arrayList11);
                                List list119 = nVar.f48337c;
                                cVar2 = nVar.f48335a;
                                arrayListC1 = ry.m.c1(list119);
                                if (dVar != null) {
                                    fVar = dVar.f48323c;
                                    if (dVar.f48321a == cVar2) {
                                        arrayListC1.remove(fVar);
                                    }
                                }
                                if (arrayListC1.isEmpty()) {
                                    dVar2 = null;
                                } else {
                                    size = arrayListC1.size();
                                    if (size <= 0) {
                                        throw new RuntimeException();
                                    }
                                    qt.f fVar19 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                                    long j115 = nVar.f48336b;
                                    List list1110 = nVar.f48337c;
                                    arrayList2 = new ArrayList(ry.n.W(list1110, 10));
                                    it2 = list1110.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                                    }
                                    dVar2 = new qt.d(cVar2, j115, fVar19, null, arrayList2, 8);
                                }
                                if (dVar2 != null) {
                                    arrayList11.add(dVar2);
                                }
                                i15++;
                                arrayList9 = arrayList9;
                            }
                        } else {
                            ArrayList arrayList14 = new ArrayList(ry.n.W(arrayList10, 10));
                            int size6 = arrayList10.size();
                            int i40 = 0;
                            while (i40 < size6) {
                                Object obj6 = arrayList10.get(i40);
                                i40++;
                                arrayList14.add(Long.valueOf(((qt.n) obj6).f48336b));
                            }
                            List listT2 = tw.c.t(arrayList14);
                            arrayList11 = new ArrayList(ry.n.W(listT2, 10));
                            Iterator it8 = listT2.iterator();
                            while (it8.hasNext()) {
                                arrayList11.add(new qt.d(qt.c.PHRASE, 0L, qt.f.MODEL_14, (List) it8.next(), null, 16));
                            }
                        }
                    } else {
                        int i314 = oVar.f48339b;
                        arrayList11 = new ArrayList();
                        nVarArr = (qt.n[]) arrayList10.toArray(new qt.n[0]);
                        iArrE = cf.x.E(nVarArr.length, i314);
                        length = iArrE.length;
                        i15 = 0;
                        while (i15 < length) {
                            nVar = nVarArr[iArrE[i15]];
                            dVar = (qt.d) ry.m.A0(arrayList11);
                            List list1111 = nVar.f48337c;
                            cVar2 = nVar.f48335a;
                            arrayListC1 = ry.m.c1(list1111);
                            if (dVar != null) {
                                fVar = dVar.f48323c;
                                if (dVar.f48321a == cVar2) {
                                    arrayListC1.remove(fVar);
                                }
                            }
                            if (arrayListC1.isEmpty()) {
                                dVar2 = null;
                            } else {
                                size = arrayListC1.size();
                                if (size <= 0) {
                                    throw new RuntimeException();
                                }
                                qt.f fVar110 = (qt.f) arrayListC1.get(Math.abs(new Random().nextInt()) % size);
                                long j116 = nVar.f48336b;
                                List list1112 = nVar.f48337c;
                                arrayList2 = new ArrayList(ry.n.W(list1112, 10));
                                it2 = list1112.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(Integer.valueOf(((qt.f) it2.next()).b()));
                                }
                                dVar2 = new qt.d(cVar2, j116, fVar110, null, arrayList2, 8);
                            }
                            if (dVar2 != null) {
                                arrayList11.add(dVar2);
                            }
                            i15++;
                            arrayList9 = arrayList9;
                        }
                    }
                }
            }
            ArrayList arrayList15 = arrayList9;
            arrayList8.addAll(arrayList11);
            arrayList9 = arrayList15;
        }
        ?? C1 = arrayList8;
        C1 = arrayList8;
        if (z12 && z13 && !arrayList8.isEmpty()) {
            C1 = arrayList8;
            C1 = ns.o.K(ry.m.q0(arrayList8));
        }
        if (z11 && !ry.l.D(new Integer[]{13, 12, 0, 11, 5, 47, 48, 49, 50, 53, 54, 51, 55, 57, 21, 61, 63, 65, 19, 18, 69}, Integer.valueOf(i16))) {
            C1 = ry.m.c1(C1);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList16 = new ArrayList();
            int size7 = C1.size();
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            while (i43 < size7) {
                Object obj7 = C1.get(i43);
                i43++;
                int i44 = i42 + 1;
                if (i42 < 0) {
                    ns.o.V();
                    throw null;
                }
                qt.d dVar3 = (qt.d) obj7;
                qt.c cVar5 = dVar3.f48321a;
                long j21 = dVar3.f48322b;
                qt.c cVar6 = qt.c.SENTENCE;
                if (cVar5 == cVar6 && dVar3.f48323c == qt.f.MODEL_13) {
                    i41++;
                    linkedHashSet.add(Long.valueOf(j21));
                } else if (cVar5 == cVar6 && !linkedHashSet.contains(Long.valueOf(j21))) {
                    arrayList16.add(Integer.valueOf(i42));
                }
                i42 = i44;
            }
            arrayList16.size();
            if (i41 < 2 && (i14 = 2 - i41) > 0) {
                ArrayList arrayListC2 = ry.m.c1(arrayList16);
                if (arrayListC2.size() > 1) {
                    Set setE1 = ry.m.e1(linkedHashSet);
                    int size8 = arrayListC2.size();
                    Random random = new Random();
                    ArrayList arrayList17 = new ArrayList();
                    for (int i45 = 0; i45 < size8; i45++) {
                        arrayList17.add(Integer.valueOf(i45));
                    }
                    int[] iArr = new int[size8];
                    int i46 = 0;
                    while (arrayList17.size() > 0) {
                        int iAbs = Math.abs(random.nextInt()) % arrayList17.size();
                        Object obj8 = arrayList17.get(iAbs);
                        kotlin.jvm.internal.m.e(obj8, "get(...)");
                        iArr[i46] = ((Number) obj8).intValue();
                        arrayList17.remove(iAbs);
                        i46++;
                    }
                    int i47 = 0;
                    for (int i48 = 0; i48 < size8; i48++) {
                        int i49 = iArr[i48];
                        if (i47 >= i14) {
                            break;
                        }
                        qt.d dVar4 = (qt.d) C1.get(((Number) arrayListC2.get(i49)).intValue());
                        if (!setE1.contains(Long.valueOf(dVar4.f48322b))) {
                            C1.add(new qt.d(dVar4.f48321a, dVar4.f48322b, qt.f.MODEL_13, dVar4.f48324d, dVar4.f48325e));
                            setE1.add(Long.valueOf(dVar4.f48322b));
                            i47++;
                        }
                    }
                } else if (arrayListC2.size() == 1) {
                    qt.d dVar5 = (qt.d) C1.get(((Number) ry.m.q0(arrayListC2)).intValue());
                    if (!linkedHashSet.contains(Long.valueOf(dVar5.f48322b))) {
                        C1.add(new qt.d(dVar5.f48321a, dVar5.f48322b, qt.f.MODEL_13, dVar5.f48324d, dVar5.f48325e));
                    }
                }
            }
        }
        ArrayList arrayList18 = new ArrayList(ry.n.W(C1, 10));
        for (qt.d dVar6 : C1) {
            dVar6.getClass();
            TestModel testModel = new TestModel();
            testModel.elemType = dVar6.f48321a.a();
            testModel.elemId = dVar6.f48322b;
            testModel.modelType = dVar6.f48323c.b();
            testModel.optionIds = new ArrayList(dVar6.f48324d);
            testModel.typeList = dVar6.f48325e;
            arrayList18.add(testModel);
        }
        return ry.m.c1(arrayList18);
    }

    public synchronized List z(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f44822b).contains(str)) {
                ((ArrayList) this.f44822b).add(str);
            }
            arrayList = (List) ((HashMap) this.f44823c).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f44823c).put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public /* synthetic */ l(Object obj, int i11) {
        this.f44821a = i11;
        this.f44822b = obj;
    }

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f44821a = 0;
        this.f44822b = workDatabase_Impl;
        this.f44823c = new b(workDatabase_Impl, 3);
    }

    public l(b4.f fVar) {
        this.f44821a = 1;
        this.f44823c = fVar;
    }

    public l(hx.b bVar, uw.p pVar) {
        this.f44821a = 14;
        this.f44823c = bVar;
        this.f44822b = pVar;
    }

    public l(Context context, String str) {
        this.f44821a = 5;
        ar.f fVar = new ar.f(2, (byte) 0);
        fVar.f2849e = str;
        this.f44822b = context.getApplicationContext();
        this.f44823c = fVar;
    }

    public l(y6.n nVar, SparseArray sparseArray) {
        this.f44821a = 10;
        this.f44822b = nVar;
        SparseBooleanArray sparseBooleanArray = nVar.f57235a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
            int iA = nVar.a(i11);
            g7.a aVar = (g7.a) sparseArray.get(iA);
            aVar.getClass();
            sparseArray2.append(iA, aVar);
        }
        this.f44823c = sparseArray2;
    }

    public l(int i11) {
        this.f44821a = i11;
        switch (i11) {
            case 13:
                this.f44822b = new HashMap();
                this.f44823c = new ReentrantLock();
                break;
            case 16:
                this.f44822b = new ArrayList();
                this.f44823c = new HashMap();
                break;
            case 22:
                this.f44822b = new p3(28);
                this.f44823c = new p2(16);
                break;
            default:
                List list = Collections.EMPTY_LIST;
                this.f44822b = list;
                this.f44823c = list;
                break;
        }
    }

    @Override // i10.a
    public void m(int i11) {
    }

    public l(List list, int[] iArr) {
        this.f44821a = 2;
        this.f44822b = ImmutableList.n(list);
        this.f44823c = iArr;
    }
}
