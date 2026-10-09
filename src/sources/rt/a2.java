package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.ReviewVisibilityMode;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a2 extends ViewModel {
    public final uz.i1 H;
    public final uz.i1 K;
    public final uz.i1 L;
    public final uz.i1 M;
    public final uz.i1 N;
    public final uz.r0 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.b0 f49418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.c f49419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz.i1 f49421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz.i1 f49422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uz.i1 f49423f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uz.i1 f49424t;

    public a2(wt.b0 b0Var, vt.n0 n0Var, vt.c cVar) {
        this.f49418a = b0Var;
        this.f49419b = cVar;
        this.f49420c = ry.l.D(new Integer[]{11, 0}, Integer.valueOf(((fr.o0) n0Var).f27733a.keyLanguage));
        ry.r rVar = ry.r.f50854a;
        uz.i1 i1VarC = uz.x0.c(rVar);
        this.f49421d = i1VarC;
        me meVar = me.UNIT_LIST;
        uz.i1 i1VarC2 = uz.x0.c(meVar);
        this.f49422e = i1VarC2;
        ke keVar = ke.WORDS_EXPRESSION;
        uz.i1 i1VarC3 = uz.x0.c(keVar);
        this.f49423f = i1VarC3;
        uz.i1 i1VarC4 = uz.x0.c(Boolean.FALSE);
        this.f49424t = i1VarC4;
        uz.i1 i1VarC5 = uz.x0.c(BuildConfig.VERSION_NAME);
        this.H = i1VarC5;
        pe peVar = pe.f50253a;
        uz.i1 i1VarC6 = uz.x0.c(peVar);
        this.K = i1VarC6;
        ry.t tVar = ry.t.f50856a;
        uz.i1 i1VarC7 = uz.x0.c(tVar);
        this.L = i1VarC7;
        uz.i1 i1VarC8 = uz.x0.c(tVar);
        this.M = i1VarC8;
        vy.d dVar = null;
        uz.i1 i1VarC9 = uz.x0.c(null);
        this.N = i1VarC9;
        int i11 = 3;
        this.O = uz.x0.A(new bh.r(new no.g(uz.x0.j(uz.x0.k(i1VarC, i1VarC2, i1VarC3, i1VarC4, new no.g(i1VarC5, i1VarC6, new fr.f4(i11, 7, dVar)), new x1(null)), i1VarC7, i1VarC8, new y1(this, dVar, 0)), i1VarC9, new fr.f4(i11, 6, dVar)), this, 21), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new o1(false, meVar, keVar, false, BuildConfig.VERSION_NAME, ry.s.f50855a, rVar, rVar, tVar, tVar, 0, 0, false, peVar, null, true, false, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ry.r] */
    public final void a(ie ieVar, LocalDate localDate, Instant instant, ZoneId zoneId) {
        ?? arrayList;
        int iIntValue;
        Set set = (Set) this.L.getValue();
        if (set.isEmpty() || this.f49423f.getValue() == ke.HIDDEN) {
            return;
        }
        boolean zIsEmpty = set.isEmpty();
        uz.i1 i1Var = this.f49421d;
        if (zIsEmpty) {
            arrayList = ry.r.f50854a;
        } else {
            Iterable iterable = (Iterable) i1Var.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                c1 c1Var = (c1) obj;
                if (set.contains(c1Var.f49553a.getId()) && !c1Var.f49553a.isExcludedFromReview()) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(ry.n.W(arrayList2, 10));
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                arrayList.add(((c1) obj2).f49553a);
            }
        }
        if (arrayList.isEmpty()) {
            d();
            return;
        }
        int i12 = ieVar.f49890a;
        int i13 = i12 >= 0 ? i12 : 0;
        Integer num = ieVar.f49891b;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            long j11 = ((long) i13) + ((long) AchievementLevelType.DAY_STREAK_LV_10);
            if (j11 > 2147483647L) {
                j11 = 2147483647L;
            }
            iIntValue = (int) j11;
        }
        if (iIntValue < i13) {
            iIntValue = i13;
        }
        Iterable iterable2 = (Iterable) i1Var.getValue();
        ArrayList arrayList3 = new ArrayList(ry.n.W(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((c1) it.next()).f49553a);
        }
        LocalDate localDatePlusDays = localDate.plusDays(i13);
        kotlin.jvm.internal.m.e(localDatePlusDays, "plusDays(...)");
        LocalDate localDatePlusDays2 = localDate.plusDays(iIntValue);
        kotlin.jvm.internal.m.e(localDatePlusDays2, "plusDays(...)");
        List listG = com.bumptech.glide.d.g(arrayList3, arrayList, localDatePlusDays, localDatePlusDays2, localDate, instant, zoneId);
        d();
        b(listG);
    }

    public final void b(List list) {
        uz.i1 i1Var;
        Object value;
        ArrayList arrayList;
        uz.i1 i1Var2;
        Object value2;
        if (list.isEmpty()) {
            return;
        }
        int iW = ry.x.W(ry.n.W(list, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (Object obj : list) {
            linkedHashMap.put(((SRSStatus) obj).getId(), obj);
        }
        do {
            i1Var = this.f49421d;
            value = i1Var.getValue();
            List<c1> list2 = (List) value;
            arrayList = new ArrayList(ry.n.W(list2, 10));
            for (c1 c1Var : list2) {
                SRSStatus sRSStatus = (SRSStatus) linkedHashMap.get(c1Var.f49553a.getId());
                if (sRSStatus != null) {
                    String unitName = c1Var.f49554b;
                    int i11 = c1Var.f49555c;
                    WordSentenceCharacterType wordSentenceCharacterType = c1Var.f49556d;
                    kotlin.jvm.internal.m.f(unitName, "unitName");
                    c1Var = new c1(sRSStatus, unitName, i11, wordSentenceCharacterType);
                }
                arrayList.add(c1Var);
            }
        } while (!i1Var.j(value, arrayList));
        Set setA0 = nz.n.a0(nz.n.W(nz.n.R(ry.m.g0(list), new ro.e(9)), new ro.e(12)));
        vy.d dVar = null;
        if (!setA0.isEmpty()) {
            do {
                i1Var2 = this.L;
                value2 = i1Var2.getValue();
            } while (!i1Var2.j(value2, qx.b.z((Set) value2, setA0)));
            uz.i1 i1Var3 = this.N;
            String str = (String) i1Var3.getValue();
            if (str != null && setA0.contains(str)) {
                i1Var3.k(null);
            }
        }
        h((List) i1Var.getValue(), (String) this.H.getValue(), (ke) this.f49423f.getValue(), (se) this.K.getValue());
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new w1(this, list, dVar, 1), 3);
    }

    public final sy.c c() {
        sy.c cVarO = ns.o.o();
        cVarO.add(ke.WORDS_EXPRESSION);
        if (this.f49420c) {
            cVarO.add(ke.CHARACTER);
        }
        cVarO.add(ke.HIDDEN);
        return ns.o.e(cVarO);
    }

    public final void d() {
        uz.i1 i1Var = this.L;
        i1Var.getClass();
        i1Var.l(null, ry.t.f50856a);
    }

    public final boolean f(c1 c1Var, ke keVar) {
        if (v1.f50519a[g(keVar).ordinal()] == 1) {
            return c1Var.f49553a.isExcludedFromReview();
        }
        return !c1Var.f49553a.isExcludedFromReview();
    }

    public final ke g(ke keVar) {
        sy.c cVarC = c();
        return cVarC.contains(keVar) ? keVar : (ke) ry.m.q0(cVarC);
    }

    public final void h(List list, String str, ke keVar, se seVar) {
        uz.i1 i1Var;
        Object value;
        ke keVarG = g(keVar);
        List listZ = nz.n.Z(nz.n.R(ry.m.g0(list), new p1(keVarG, oz.q.i1(str).toString(), seVar, 1)));
        Set setA0 = nz.n.a0(nz.n.W(nz.n.R(ry.m.g0(listZ), new q1(this, keVarG, 1)), new ro.e(14)));
        ArrayList arrayList = new ArrayList(ry.n.W(listZ, 10));
        Iterator it = listZ.iterator();
        while (it.hasNext()) {
            arrayList.add(((c1) it.next()).f49553a.getId());
        }
        Set setF1 = ry.m.f1(arrayList);
        do {
            i1Var = this.L;
            value = i1Var.getValue();
        } while (!i1Var.j(value, ry.m.v0((Set) value, setA0)));
        uz.i1 i1Var2 = this.N;
        String str2 = (String) i1Var2.getValue();
        if (str2 == null || !(!setF1.contains(str2))) {
            return;
        }
        i1Var2.k(null);
    }

    public final void i() {
        uz.i1 i1Var;
        Object value;
        Set setE1;
        List list = (List) this.f49421d.getValue();
        String str = (String) this.H.getValue();
        ke keVar = (ke) this.f49423f.getValue();
        se seVar = (se) this.K.getValue();
        ke keVarG = g(keVar);
        Set setA0 = nz.n.a0(nz.n.W(nz.n.R(nz.n.R(ry.m.g0(list), new p1(keVarG, oz.q.i1(str).toString(), seVar, 0)), new q1(this, keVarG, 0)), new ro.e(11)));
        if (setA0.isEmpty()) {
            return;
        }
        do {
            i1Var = this.L;
            value = i1Var.getValue();
            Set set = (Set) value;
            kotlin.jvm.internal.m.f(set, "<this>");
            setE1 = ry.m.e1(set);
            ry.m.d0(setE1, setA0);
        } while (!i1Var.j(value, setE1));
    }

    public final void j(String str) {
        uz.i1 i1Var = this.N;
        if (str == null) {
            i1Var.k(null);
            return;
        }
        Iterable iterable = (Iterable) this.f49421d.getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m.a(((c1) it.next()).f49553a.getId(), str)) {
                i1Var.getClass();
                i1Var.l(null, str);
                return;
            }
        }
    }

    public final void k() {
        uz.i1 i1Var = this.f49424t;
        boolean zBooleanValue = ((Boolean) i1Var.getValue()).booleanValue();
        Boolean boolValueOf = Boolean.valueOf(!zBooleanValue);
        i1Var.getClass();
        i1Var.l(null, boolValueOf);
        if (zBooleanValue) {
            m(BuildConfig.VERSION_NAME);
        }
    }

    public final void l(Set set, boolean z11) {
        if (set.isEmpty()) {
            return;
        }
        long epochSecond = Instant.now().getEpochSecond();
        ReviewVisibilityMode reviewVisibilityModeFromExplicitExcluded = ReviewVisibilityMode.Companion.fromExplicitExcluded(z11);
        b(nz.n.Z(nz.n.W(nz.n.R(nz.n.W(nz.n.R(ry.m.g0((Iterable) this.f49421d.getValue()), new q(1, set)), new ro.e(13)), new mt.x4(z11, reviewVisibilityModeFromExplicitExcluded)), new mt.k4(epochSecond, reviewVisibilityModeFromExplicitExcluded))));
    }

    public final void m(String query) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.m.f(query, "query");
        int length = query.length();
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                charSequenceSubSequence = BuildConfig.VERSION_NAME;
                break;
            } else {
                if (!qx.p.s(query.charAt(i11))) {
                    charSequenceSubSequence = query.subSequence(i11, query.length());
                    break;
                }
                i11++;
            }
        }
        String string = charSequenceSubSequence.toString();
        uz.i1 i1Var = this.H;
        if (kotlin.jvm.internal.m.a(i1Var.getValue(), string)) {
            return;
        }
        i1Var.k(string);
        h((List) this.f49421d.getValue(), string, (ke) this.f49423f.getValue(), (se) this.K.getValue());
    }
}
