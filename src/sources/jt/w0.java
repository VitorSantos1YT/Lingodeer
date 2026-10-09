package jt;

import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.android.material.button.a f37240a = qx.b.h(new j9.a0(28), new j9.a0(29), new t0(0));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.material.button.a f37241b = qx.b.h(new t0(1), new t0(2));

    public static final k2 a(int i11, List list, List list2) {
        int size = list.size();
        int size2 = list2.size();
        int i12 = size + 1;
        int[][] iArr = new int[i12][];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            iArr[i14] = new int[size2 + 1];
        }
        l2[][] l2VarArr = new l2[i12][];
        for (int i15 = 0; i15 < i12; i15++) {
            l2VarArr[i15] = new l2[size2 + 1];
        }
        if (1 <= size) {
            int i16 = 1;
            while (true) {
                iArr[i16][0] = iArr[i16 - 1][0] + 1;
                l2VarArr[i16][0] = l2.MISSING;
                if (i16 == size) {
                    break;
                }
                i16++;
            }
        }
        if (1 <= size2) {
            int i17 = 1;
            while (true) {
                int[] iArr2 = iArr[0];
                iArr2[i17] = iArr2[i17 - 1] + 1;
                l2VarArr[0][i17] = l2.EXTRA;
                if (i17 == size2) {
                    break;
                }
                i17++;
            }
        }
        if (1 <= size) {
            int i18 = 1;
            while (true) {
                if (1 <= size2) {
                    int i19 = 1;
                    while (true) {
                        int i21 = i18 - 1;
                        int i22 = i19 - 1;
                        l2 l2Var = dt.a0.C(i11, ((CourseWord) list.get(i21)).getWord()).equals(dt.a0.C(i11, ((CourseWord) list2.get(i22)).getWord())) ? l2.MATCH : l2.REPLACE;
                        j2 j2Var = (j2) ry.m.E0(ns.o.L(new j2(iArr[i21][i22] + (l2Var == l2.MATCH ? i13 : 3), l2Var), new j2(iArr[i18][i22] + 1, l2.EXTRA), new j2(iArr[i21][i19] + 1, l2.MISSING)), f37241b);
                        iArr[i18][i19] = j2Var.f36999a;
                        l2VarArr[i18][i19] = j2Var.f37000b;
                        if (i19 == size2) {
                            break;
                        }
                        i19++;
                        i13 = 0;
                    }
                }
                if (i18 == size) {
                    break;
                }
                i18++;
                i13 = 0;
            }
        }
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size2);
        int i23 = size;
        int i24 = size2;
        int i25 = 0;
        int i26 = 0;
        while (true) {
            if (i23 <= 0 && i24 <= 0) {
                break;
            }
            l2 l2Var2 = l2VarArr[i23][i24];
            int i27 = l2Var2 == null ? -1 : u0.f37202a[l2Var2.ordinal()];
            if (i27 == -1) {
                break;
            }
            if (i27 == 1) {
                CourseWord courseWord = (CourseWord) list.get(i23 - 1);
                OptionItemSelectedState optionItemSelectedState = OptionItemSelectedState.CORRECT;
                arrayList.add(CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, optionItemSelectedState, null, null, 0, -1, 59, null));
                arrayList2.add(CourseWord.copy$default((CourseWord) list2.get(i24 - 1), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, optionItemSelectedState, null, null, 0, -1, 59, null));
                i25++;
            } else if (i27 == 2) {
                arrayList2.add(CourseWord.copy$default((CourseWord) list2.get(i24 - 1), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null));
                i26++;
                i24--;
            } else if (i27 == 3) {
                arrayList.add(CourseWord.copy$default((CourseWord) list.get(i23 - 1), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null));
                i26++;
                i23--;
            } else {
                if (i27 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                CourseWord courseWord2 = (CourseWord) list.get(i23 - 1);
                OptionItemSelectedState optionItemSelectedState2 = OptionItemSelectedState.WRONG;
                arrayList.add(CourseWord.copy$default(courseWord2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, optionItemSelectedState2, null, null, 0, -1, 59, null));
                arrayList2.add(CourseWord.copy$default((CourseWord) list2.get(i24 - 1), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, optionItemSelectedState2, null, null, 0, -1, 59, null));
                i26 += 2;
            }
            i23--;
            i24--;
        }
        return new k2(new ry.z(arrayList), new ry.z(arrayList2), iArr[size][size2], i25, i26);
    }

    public static final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (c((CourseWord) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    public static final boolean c(CourseWord courseWord) {
        if (courseWord.getWordType() != 1) {
            String str = courseWord.getWord();
            kotlin.jvm.internal.m.f(str, "str");
            Pattern patternCompile = Pattern.compile("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]");
            kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
            if (patternCompile.matcher(str).matches() || ry.l.D(new String[]{"..."}, str)) {
                if (kotlin.jvm.internal.m.a(courseWord.getWord(), "–") && !kotlin.jvm.internal.m.a(courseWord.getWord(), "-")) {
                    return false;
                }
            }
        } else if (kotlin.jvm.internal.m.a(courseWord.getWord(), "–")) {
        }
        return true;
    }

    public static final s0 d(CourseSentence courseSentence, List options, List answersWords, Long l9, l1.n nVar, int i11, int i12) {
        kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
        kotlin.jvm.internal.m.f(options, "options");
        kotlin.jvm.internal.m.f(answersWords, "answersWords");
        boolean z11 = (i12 & 16) == 0;
        boolean z12 = (i12 & 32) == 0;
        l1.s sVar = (l1.s) nVar;
        boolean zF = sVar.f(l9);
        Object objQ = sVar.Q();
        l1.g gVar = l1.m.f39353a;
        if (zF || objQ == gVar) {
            objQ = l1.t.B(ht.q.DEFAULT);
            sVar.o0(objQ);
        }
        l1.b1 b1Var = (l1.b1) objQ;
        boolean z13 = (i12 & 128) == 0;
        l1.s sVar2 = (l1.s) nVar;
        boolean zF2 = sVar2.f(l9);
        Object objQ2 = sVar2.Q();
        if (zF2 || objQ2 == gVar) {
            objQ2 = l1.t.B(ht.a.f33722e);
            sVar2.o0(objQ2);
        }
        l1.b1 b1Var2 = (l1.b1) objQ2;
        l1.s sVar3 = (l1.s) nVar;
        boolean zF3 = sVar3.f(l9);
        Object objQ3 = sVar3.Q();
        if (zF3 || objQ3 == gVar) {
            objQ3 = l1.t.B(Boolean.FALSE);
            sVar3.o0(objQ3);
        }
        l1.b1 b1Var3 = (l1.b1) objQ3;
        Object[] objArr = {l9};
        l1.s sVar4 = (l1.s) nVar;
        Object objQ4 = sVar4.Q();
        if (objQ4 == gVar) {
            objQ4 = new hh.y(20);
            sVar4.o0(objQ4);
        }
        l1.b1 b1Var4 = (l1.b1) w1.j.c(objArr, (fz.a) objQ4, sVar4, 48);
        l1.s sVar5 = (l1.s) nVar;
        boolean zF4 = sVar5.f(l9);
        Object objQ5 = sVar5.Q();
        if (zF4 || objQ5 == gVar) {
            objQ5 = l1.t.B(ns.s.NONE);
            sVar5.o0(objQ5);
        }
        l1.b1 b1Var5 = (l1.b1) objQ5;
        l1.s sVar6 = (l1.s) nVar;
        boolean zF5 = sVar6.f(l9);
        Object objQ6 = sVar6.Q();
        if (zF5 || objQ6 == gVar) {
            objQ6 = l1.t.B(null);
            sVar6.o0(objQ6);
        }
        l1.b1 b1Var6 = (l1.b1) objQ6;
        l1.s sVar7 = (l1.s) nVar;
        boolean zF6 = sVar7.f(l9);
        Object objQ7 = sVar7.Q();
        if (zF6 || objQ7 == gVar) {
            objQ7 = new x1.p();
            sVar7.o0(objQ7);
        }
        x1.p pVar = (x1.p) objQ7;
        l1.s sVar8 = (l1.s) nVar;
        boolean zF7 = sVar8.f(l9);
        Object objQ8 = sVar8.Q();
        if (zF7 || objQ8 == gVar) {
            objQ8 = l1.t.B(options);
            sVar8.o0(objQ8);
        }
        l1.b1 b1Var7 = (l1.b1) objQ8;
        l1.s sVar9 = (l1.s) nVar;
        boolean zF8 = sVar9.f(l9);
        Object objQ9 = sVar9.Q();
        if (zF8 || objQ9 == gVar) {
            objQ9 = l1.t.B(courseSentence.getDisplayCourseWords());
            sVar9.o0(objQ9);
        }
        l1.b1 b1Var8 = (l1.b1) objQ9;
        l1.s sVar10 = (l1.s) nVar;
        boolean zF9 = sVar10.f(l9) | sVar10.f(b1Var);
        Object objQ10 = sVar10.Q();
        if (zF9 || objQ10 == gVar) {
            objQ10 = l1.t.s(new i0(4, b1Var));
            sVar10.o0(objQ10);
        }
        b3 b3Var = (b3) objQ10;
        e20.a aVarC = w4.c.c(sVar10, -1168520582, sVar10, -1633490746);
        boolean zF10 = sVar10.f(null) | sVar10.f(aVarC);
        Object objQ11 = sVar10.Q();
        if (zF10 || objQ11 == gVar) {
            objQ11 = w4.c.e(ns.l.class, aVarC, null, null, sVar10);
        }
        sVar10.p(false);
        sVar10.p(false);
        ns.l lVar = (ns.l) objQ11;
        e20.a aVarC2 = w4.c.c(sVar10, -1168520582, sVar10, -1633490746);
        boolean zF11 = sVar10.f(null) | sVar10.f(aVarC2);
        Object objQ12 = sVar10.Q();
        if (zF11 || objQ12 == gVar) {
            objQ12 = w4.c.e(vt.n0.class, aVarC2, null, null, sVar10);
        }
        sVar10.p(false);
        sVar10.p(false);
        vt.n0 n0Var = (vt.n0) objQ12;
        boolean zF12 = sVar10.f(l9) | sVar10.f(b1Var) | sVar10.g(((Boolean) b3Var.getValue()).booleanValue()) | ((((29360128 & i11) ^ 12582912) > 8388608 && sVar10.g(z13)) || (i11 & 12582912) == 8388608) | ((((57344 & i11) ^ 24576) > 16384 && sVar10.g(z11)) || (i11 & 24576) == 16384) | ((((458752 & i11) ^ 196608) > 131072 && sVar10.g(z12)) || (i11 & 196608) == 131072) | sVar10.f(b1Var2) | sVar10.f(b1Var3) | sVar10.f(b1Var4) | sVar10.f(b1Var5) | sVar10.f(b1Var6) | sVar10.f(pVar) | sVar10.f(b1Var7) | sVar10.f(b1Var8);
        Object objQ13 = sVar10.Q();
        if (zF12 || objQ13 == gVar) {
            String sentence = courseSentence.getSentence();
            String translation = courseSentence.getTranslation();
            List<CourseWord> displayCourseWords = courseSentence.getDisplayCourseWords();
            boolean zBooleanValue = ((Boolean) b3Var.getValue()).booleanValue();
            Env env = ((fr.o0) n0Var).f27733a;
            s0 s0Var = new s0(sentence, translation, answersWords, displayCourseWords, zBooleanValue, z13, z12, env.keyLanguage, env.locateLanguage, b1Var, b1Var2, b1Var3, b1Var4, b1Var5, b1Var6, pVar, b1Var7, b1Var8, new v0(z11, n0Var, lVar, null, 0), new jp.t0(2, 2, null));
            sVar10.o0(s0Var);
            objQ13 = s0Var;
        }
        return (s0) objQ13;
    }
}
