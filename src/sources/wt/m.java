package wt;

import bh.a1;
import bh.y0;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.UnitState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n9.n1;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.i0 f55309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.n0 f55310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.k0 f55311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f55312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f55313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f55314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f55315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f55316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f55317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f55318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f55319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f55320l;
    public final String[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final no.g f55321n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final gp.r f55322o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kr.y f55323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gp.r f55324q;

    public m(vt.i0 i0Var, vt.n0 n0Var, vt.c cVar, vt.k0 k0Var) {
        this.f55309a = i0Var;
        this.f55310b = n0Var;
        this.f55311c = k0Var;
        List listL = ns.o.L(new g2.x(g2.f0.e(4294953216L)), new g2.x(g2.f0.e(4294953216L)), new g2.x(g2.f0.e(4294820352L)), new g2.x(g2.f0.e(4294687488L)), new g2.x(g2.f0.e(4294620160L)), new g2.x(g2.f0.e(4294487296L)), new g2.x(g2.f0.e(4294354432L)), new g2.x(g2.f0.e(4294221568L)), new g2.x(g2.f0.e(4294088704L)), new g2.x(g2.f0.e(4293890304L)), new g2.x(g2.f0.e(4293757440L)), new g2.x(g2.f0.e(4293624576L)));
        this.f55312d = listL;
        List listL2 = ns.o.L(new g2.x(g2.f0.e(4281519087L)), new g2.x(g2.f0.e(4281909487L)), new g2.x(g2.f0.e(4282234351L)), new g2.x(g2.f0.e(4282362607L)), new g2.x(g2.f0.e(4282425327L)), new g2.x(g2.f0.e(4282422510L)), new g2.x(g2.f0.e(4282354158L)), new g2.x(g2.f0.e(4282154734L)), new g2.x(g2.f0.e(4281889773L)), new g2.x(g2.f0.e(4281559277L)), new g2.x(g2.f0.e(4281032172L)));
        this.f55313e = listL2;
        List listL3 = ns.o.L(new g2.x(g2.f0.e(4293684981L)), new g2.x(g2.f0.e(4293159154L)), new g2.x(g2.f0.e(4292567791L)), new g2.x(g2.f0.e(4292041964L)), new g2.x(g2.f0.e(4291450601L)), new g2.x(g2.f0.e(4290925030L)), new g2.x(g2.f0.e(4290333666L)), new g2.x(g2.f0.e(4289742303L)), new g2.x(g2.f0.e(4289216476L)), new g2.x(g2.f0.e(4288625113L)), new g2.x(g2.f0.e(4288033750L)));
        this.f55314f = listL3;
        List listL4 = ns.o.L(new g2.x(g2.f0.e(4294929042L)), new g2.x(g2.f0.e(4294796937L)), new g2.x(g2.f0.e(4294599041L)), new g2.x(g2.f0.e(4294401400L)), new g2.x(g2.f0.e(4294203760L)), new g2.x(g2.f0.e(4294071399L)), new g2.x(g2.f0.e(4293873759L)), new g2.x(g2.f0.e(4293676119L)), new g2.x(g2.f0.e(4293412687L)), new g2.x(g2.f0.e(4293215046L)), new g2.x(g2.f0.e(4293017150L)));
        this.f55315g = listL4;
        List listL5 = ns.o.L(new g2.x(g2.f0.e(4294945617L)), new g2.x(g2.f0.e(4294945617L)), new g2.x(g2.f0.e(4294944331L)), new g2.x(g2.f0.e(4294942788L)), new g2.x(g2.f0.e(4294941246L)), new g2.x(g2.f0.e(4294939959L)), new g2.x(g2.f0.e(4294938417L)), new g2.x(g2.f0.e(4294936874L)), new g2.x(g2.f0.e(4294935330L)), new g2.x(g2.f0.e(4294933785L)), new g2.x(g2.f0.e(4294932238L)), new g2.x(g2.f0.e(4294930688L)));
        this.f55316h = listL5;
        List listL6 = ns.o.L(new g2.x(g2.f0.e(4283883422L)), new g2.x(g2.f0.e(4283883422L)), new g2.x(g2.f0.e(4283488663L)), new g2.x(g2.f0.e(4283093905L)), new g2.x(g2.f0.e(4282699146L)), new g2.x(g2.f0.e(4282304387L)), new g2.x(g2.f0.e(4281909885L)), new g2.x(g2.f0.e(4281449590L)), new g2.x(g2.f0.e(4280989296L)), new g2.x(g2.f0.e(4280463466L)), new g2.x(g2.f0.e(4279872355L)), new g2.x(g2.f0.e(4279018845L)));
        this.f55317i = listL6;
        List listL7 = ns.o.L(new g2.x(g2.f0.e(4294866604L)), new g2.x(g2.f0.e(4294866604L)), new g2.x(g2.f0.e(4294733734L)), new g2.x(g2.f0.e(4294535327L)), new g2.x(g2.f0.e(4294402713L)), new g2.x(g2.f0.e(4294204051L)), new g2.x(g2.f0.e(4294005645L)), new g2.x(g2.f0.e(4293872519L)), new g2.x(g2.f0.e(4293673857L)), new g2.x(g2.f0.e(4293474939L)), new g2.x(g2.f0.e(4293275765L)), new g2.x(g2.f0.e(4293076079L)));
        this.f55318j = listL7;
        this.f55319k = ns.o.L(new g2.x(g2.f0.e(4294151436L)), new g2.x(g2.f0.e(4282740449L)), new g2.x(g2.f0.e(4287709637L)), new g2.x(g2.f0.e(4292692554L)), new g2.x(g2.f0.e(4294342676L)), new g2.x(g2.f0.e(4279938664L)), new g2.x(g2.f0.e(4291900786L)));
        this.f55320l = ns.o.L(listL, listL2, listL3, listL4, listL5, listL6, listL7);
        this.m = new String[]{"new_learn_banner_bg_1", "new_learn_banner_bg_2", "new_learn_banner_bg_3", "new_learn_banner_bg_4", "new_learn_banner_bg_5", "new_learn_banner_bg_6", "new_learn_banner_bg_7"};
        vt.d dVar = (vt.d) cVar;
        vy.d dVar2 = null;
        no.g gVar = new no.g(dVar.f54191a, x0.B(dVar.f54192b, new dt.x(dVar2, this, 24)), new e6.g0(this, dVar2, 9));
        this.f55321n = gVar;
        this.f55322o = new gp.r(new kr.y(gVar, 1), 13);
        kr.y yVar = new kr.y(gVar, 2);
        this.f55323p = yVar;
        this.f55324q = new gp.r(yVar, 14);
    }

    public static ArrayList c(List courseUnits, HashMap lessonProgressMap) {
        kotlin.jvm.internal.m.f(courseUnits, "courseUnits");
        kotlin.jvm.internal.m.f(lessonProgressMap, "lessonProgressMap");
        ArrayList arrayList = new ArrayList(ry.n.W(courseUnits, 10));
        int i11 = 0;
        for (Object obj : courseUnits) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            CourseUnit courseUnit = (CourseUnit) obj;
            ArrayList arrayListN = ks.b.n(courseUnit.getLessonList());
            int size = arrayListN.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj2 = arrayListN.get(i13);
                i13++;
                Integer num = (Integer) lessonProgressMap.get(Long.valueOf(((Number) obj2).longValue()));
                if (num != null) {
                    num.intValue();
                }
            }
            ArrayList arrayListN2 = ks.b.n(courseUnit.getLessonList());
            int size2 = arrayListN2.size();
            int totalLessonCount = 0;
            int i14 = 0;
            int i15 = 0;
            while (i15 < size2) {
                Object obj3 = arrayListN2.get(i15);
                i15++;
                long jLongValue = ((Number) obj3).longValue();
                Integer num2 = (Integer) lessonProgressMap.get(Long.valueOf(jLongValue));
                if (num2 != null && num2.intValue() == 1) {
                    i14++;
                    totalLessonCount++;
                } else if (lessonProgressMap.containsKey(Long.valueOf(jLongValue))) {
                    i14++;
                }
            }
            if (totalLessonCount > courseUnit.getTotalLessonCount()) {
                totalLessonCount = courseUnit.getTotalLessonCount();
            }
            arrayList.add(CourseUnit.m213copypls4pCs$default(courseUnit, 0L, null, null, null, 0, 0L, false, null, false, false, false, false, 0L, 0L, null, null, null, totalLessonCount == courseUnit.getTotalLessonCount() ? UnitState.StateRedo : (i14 > 0 || i11 == 0) ? UnitState.StateOpen : UnitState.StateLocked, null, null, null, 0, 0, totalLessonCount, 8257535, null));
            i11 = i12;
        }
        return arrayList;
    }

    public final uz.i a(String character) {
        kotlin.jvm.internal.m.f(character, "character");
        bh.t tVar = (bh.t) this.f55309a;
        tVar.getClass();
        gp.r rVar = new gp.r(new b0.f(3, tVar, character, (vy.d) null));
        yz.f fVar = rz.o0.f50940a;
        return x0.w(rVar, yz.e.f58387a);
    }

    public final gp.r b() {
        return ((a1) this.f55311c).e(((fr.o0) this.f55310b).f27733a.keyLanguage, false);
    }

    public final gp.r d(long j11) {
        return new gp.r(new n1(new gp.r(new bh.e((bh.t) this.f55309a, j11, null, 0)), new bh.f(j11, null)), 12);
    }

    public final gp.r e(List lessonIds) {
        kotlin.jvm.internal.m.f(lessonIds, "lessonIds");
        return new gp.r(new b0.f(4, lessonIds, (bh.t) this.f55309a, (vy.d) null));
    }

    public final gp.r f(long j11) {
        return new gp.r(new bh.m((bh.t) this.f55309a, j11, null, 1));
    }

    public final gp.r g(long j11) {
        return new gp.r(new bh.c((bh.t) this.f55309a, j11, (vy.d) null, 13));
    }

    public final boolean h() {
        vt.n0 n0Var = this.f55310b;
        return (((fr.o0) n0Var).f27733a.locateLanguage != 3 || ((fr.o0) n0Var).f27733a.keyLanguage == 3 || ((fr.o0) n0Var).f27733a.keyLanguage == 7 || ((fr.o0) n0Var).f27733a.keyLanguage == 10 || ((fr.o0) n0Var).f27733a.keyLanguage == 22 || ((fr.o0) n0Var).f27733a.keyLanguage == 20 || ((fr.o0) n0Var).f27733a.keyLanguage == 40 || ((fr.o0) n0Var).f27733a.keyLanguage == 47 || ((fr.o0) n0Var).f27733a.keyLanguage == 48 || ((fr.o0) n0Var).f27733a.keyLanguage == 49 || ((fr.o0) n0Var).f27733a.keyLanguage == 50 || ((fr.o0) n0Var).f27733a.keyLanguage == 53 || ((fr.o0) n0Var).f27733a.keyLanguage == 54 || ((fr.o0) n0Var).f27733a.keyLanguage == 51 || ((fr.o0) n0Var).f27733a.keyLanguage == 55 || ((fr.o0) n0Var).f27733a.keyLanguage == 57 || ((fr.o0) n0Var).f27733a.keyLanguage == 21 || ((fr.o0) n0Var).f27733a.keyLanguage == 61 || ((fr.o0) n0Var).f27733a.keyLanguage == 63 || ((fr.o0) n0Var).f27733a.keyLanguage == 65 || ((fr.o0) n0Var).f27733a.keyLanguage == 18 || ((fr.o0) n0Var).f27733a.keyLanguage == 69 || ((fr.o0) n0Var).f27733a.keyLanguage == 19) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        if (((bh.a1) r4).i(r1, false, r2) == r3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r43, xy.c r44) {
        /*
            r42 = this;
            r0 = r42
            r1 = r44
            boolean r2 = r1 instanceof wt.k
            if (r2 == 0) goto L17
            r2 = r1
            wt.k r2 = (wt.k) r2
            int r3 = r2.f55297e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f55297e = r3
            goto L1c
        L17:
            wt.k r2 = new wt.k
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f55295c
            wy.a r3 = wy.a.COROUTINE_SUSPENDED
            int r4 = r2.f55297e
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L42
            if (r4 == r6) goto L37
            if (r4 != r5) goto L2f
            com.bumptech.glide.e.F(r1)
            goto Lad
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            int r4 = r2.f55293a
            vt.k0 r6 = r2.f55294b
            com.bumptech.glide.e.F(r1)
            r19 = r4
            r4 = r6
            goto L5c
        L42:
            com.bumptech.glide.e.F(r1)
            gp.r r1 = r0.b()
            vt.k0 r4 = r0.f55311c
            r2.f55294b = r4
            r7 = r43
            r2.f55293a = r7
            r2.f55297e = r6
            java.lang.Object r1 = uz.x0.u(r1, r2)
            if (r1 != r3) goto L5a
            goto Lac
        L5a:
            r19 = r7
        L5c:
            r6 = r1
            com.lingodeer.data.model.LearnProgress r6 = (com.lingodeer.data.model.LearnProgress) r6
            r40 = 2147482623(0x7ffffbff, float:NaN)
            r41 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            com.lingodeer.data.model.LearnProgress r1 = com.lingodeer.data.model.LearnProgress.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r7 = r19
            r6 = 0
            r2.f55294b = r6
            r2.f55293a = r7
            r2.f55297e = r5
            java.lang.Object r1 = vt.k0.b(r4, r1, r2)
            if (r1 != r3) goto Lad
        Lac:
            return r3
        Lad:
            qy.b0 r1 = qy.b0.f48488a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.m.i(int, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        if (((bh.a1) r4).i(r1, false, r2) == r3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(int r43, xy.c r44) {
        /*
            r42 = this;
            r0 = r42
            r1 = r44
            boolean r2 = r1 instanceof wt.l
            if (r2 == 0) goto L17
            r2 = r1
            wt.l r2 = (wt.l) r2
            int r3 = r2.f55305e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f55305e = r3
            goto L1c
        L17:
            wt.l r2 = new wt.l
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f55303c
            wy.a r3 = wy.a.COROUTINE_SUSPENDED
            int r4 = r2.f55305e
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L42
            if (r4 == r6) goto L37
            if (r4 != r5) goto L2f
            com.bumptech.glide.e.F(r1)
            goto Lad
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            int r4 = r2.f55301a
            vt.k0 r6 = r2.f55302b
            com.bumptech.glide.e.F(r1)
            r18 = r4
            r4 = r6
            goto L5c
        L42:
            com.bumptech.glide.e.F(r1)
            gp.r r1 = r0.b()
            vt.k0 r4 = r0.f55311c
            r2.f55302b = r4
            r7 = r43
            r2.f55301a = r7
            r2.f55305e = r6
            java.lang.Object r1 = uz.x0.u(r1, r2)
            if (r1 != r3) goto L5a
            goto Lac
        L5a:
            r18 = r7
        L5c:
            r6 = r1
            com.lingodeer.data.model.LearnProgress r6 = (com.lingodeer.data.model.LearnProgress) r6
            r40 = 2147483135(0x7ffffdff, float:NaN)
            r41 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            com.lingodeer.data.model.LearnProgress r1 = com.lingodeer.data.model.LearnProgress.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r7 = r18
            r6 = 0
            r2.f55302b = r6
            r2.f55301a = r7
            r2.f55305e = r5
            java.lang.Object r1 = vt.k0.b(r4, r1, r2)
            if (r1 != r3) goto Lad
        Lac:
            return r3
        Lad:
            qy.b0 r1 = qy.b0.f48488a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.m.j(int, xy.c):java.lang.Object");
    }

    public final Object k(String str, xy.c cVar) {
        a1 a1Var = (a1) this.f55311c;
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new y0(a1Var, str, null, 1), cVar);
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        qy.b0 b0Var = qy.b0.f48488a;
        if (objM != aVar) {
            objM = b0Var;
        }
        return objM == aVar ? objM : b0Var;
    }
}
