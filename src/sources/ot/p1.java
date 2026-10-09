package ot;

import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.TestModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f45944a = ry.l.m0(new Character[]{' ', 12288, '.', ',', 65292, 12290, 12289, 12539, 65381, '!', '?', 65281, 65311, '\'', '\"', 12300, 12301, 12302, 12303, '(', ')', 65288, 65289, '[', ']', 12304, 12305});

    public static final ht.o a(TestModel testModel) {
        return ht.o.a(f(testModel), 10, 0L, false, false, false, false, false, false, false, false, false, false, ht.r.M10, 262139);
    }

    public static final j1 b(j1 j1Var, ht.o oVar) {
        kotlin.jvm.internal.m.f(j1Var, "<this>");
        if (j1Var instanceof j0) {
            CourseCharacter data = ((j0) j1Var).f45861b;
            kotlin.jvm.internal.m.f(data, "data");
            return new j0(oVar, data);
        }
        if (j1Var instanceof l0) {
            return new l0(oVar, ((l0) j1Var).f45883b);
        }
        if (j1Var instanceof m0) {
            return new m0(oVar, ((m0) j1Var).f45892b);
        }
        if (j1Var instanceof p0) {
            return new p0(oVar, ((p0) j1Var).f45943b);
        }
        if (j1Var instanceof n0) {
            return new n0(oVar, ((n0) j1Var).f45911b);
        }
        if (j1Var instanceof o0) {
            return o0.b((o0) j1Var, oVar);
        }
        if (j1Var instanceof q0) {
            return new q0(oVar, ((q0) j1Var).f45951b);
        }
        if (j1Var instanceof r0) {
            return new r0(oVar, ((r0) j1Var).f45966b);
        }
        if (j1Var instanceof s0) {
            return new s0(oVar, ((s0) j1Var).f45985b);
        }
        if (j1Var instanceof t0) {
            return new t0(oVar, ((t0) j1Var).f45996b);
        }
        if (j1Var instanceof u0) {
            return new u0(oVar, ((u0) j1Var).f46011b);
        }
        if (j1Var instanceof v0) {
            return new v0(oVar, ((v0) j1Var).f46021b);
        }
        if (j1Var instanceof w0) {
            return new w0(oVar, ((w0) j1Var).f46033b);
        }
        if (j1Var instanceof x0) {
            return new x0(oVar, ((x0) j1Var).f46041b);
        }
        if (j1Var instanceof y0) {
            return new y0(oVar);
        }
        if (j1Var instanceof a1) {
            return new a1(oVar, ((a1) j1Var).f45741b);
        }
        if (j1Var instanceof z0) {
            return new z0(oVar, ((z0) j1Var).f46062b);
        }
        if (j1Var instanceof b1) {
            return new b1(oVar, ((b1) j1Var).f45753b);
        }
        if (j1Var instanceof c1) {
            return new c1(oVar, ((c1) j1Var).f45766b);
        }
        if (j1Var instanceof d1) {
            return new d1(oVar, ((d1) j1Var).f45785b);
        }
        if (j1Var instanceof e1) {
            return new e1(oVar, ((e1) j1Var).f45799b);
        }
        if (j1Var instanceof f1) {
            return new f1(oVar, ((f1) j1Var).f45813b);
        }
        if (j1Var instanceof g1) {
            return new g1(oVar, ((g1) j1Var).f45826b);
        }
        if (j1Var instanceof h1) {
            return new h1(oVar, ((h1) j1Var).f45837b);
        }
        if (j1Var instanceof i1) {
            return new i1(oVar, ((i1) j1Var).f45853b);
        }
        if (j1Var instanceof k0) {
            return new k0(oVar, ((k0) j1Var).f45869b);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final u1 c(u1 u1Var) {
        Integer num;
        List list = u1Var.f46013b;
        if (list.size() > 1) {
            long wordId = u1Var.f46012a.getWordId();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i11 = 0;
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    ns.o.V();
                    throw null;
                }
                CourseWord courseWord = (CourseWord) obj;
                String strE = e(courseWord);
                if (strE != null) {
                    Integer num2 = (Integer) linkedHashMap.get(strE);
                    if (num2 == null) {
                        linkedHashMap.put(strE, Integer.valueOf(i12));
                    } else if (((CourseWord) list.get(num2.intValue())).getWordId() != wordId && courseWord.getWordId() == wordId) {
                        linkedHashMap.put(strE, Integer.valueOf(i12));
                    }
                }
                i12 = i13;
            }
            if (!linkedHashMap.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    int i14 = i11 + 1;
                    if (i11 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    String strE2 = e((CourseWord) obj2);
                    if (strE2 == null || ((num = (Integer) linkedHashMap.get(strE2)) != null && num.intValue() == i11)) {
                        arrayList.add(obj2);
                    }
                    i11 = i14;
                }
                return u1.a(u1Var, arrayList);
            }
        }
        return u1Var;
    }

    public static final boolean d(u1 u1Var) {
        List list = u1Var.f46013b;
        if (list.size() < 2 || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((CourseWord) it.next()).getWordId() == u1Var.f46012a.getWordId()) {
                return true;
            }
        }
        return false;
    }

    public static final String e(CourseWord courseWord) {
        kotlin.jvm.internal.m.f(courseWord, "<this>");
        String soundChangePronunciation = courseWord.getSoundChangePronunciation();
        if (oz.q.K0(soundChangePronunciation)) {
            soundChangePronunciation = courseWord.getZhuYin();
        }
        if (oz.q.K0(soundChangePronunciation)) {
            soundChangePronunciation = courseWord.getLuoMa();
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < soundChangePronunciation.length(); i11++) {
            char cCharAt = soundChangePronunciation.charAt(i11);
            if (!qx.p.s(cCharAt) && !f45944a.contains(Character.valueOf(cCharAt))) {
                sb2.append(cCharAt);
            }
        }
        String lowerCase = sb2.toString().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() > 0) {
            return lowerCase;
        }
        return null;
    }

    public static final ht.o f(TestModel testModel) {
        kotlin.jvm.internal.m.f(testModel, "<this>");
        return new ht.o(testModel.elemId, testModel.elemType, testModel.modelType);
    }
}
