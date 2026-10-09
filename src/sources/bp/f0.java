package bp;

import bt.l7;
import com.lingo.lingoskill.thaiskill.ui.learn.THAISyllableIntroductionActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CourseQuestionPreferenceContext;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.RecordingStatus;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import h1.ua;
import java.util.Collection;
import java.util.List;
import l1.b1;
import mt.g4;
import rt.ac;
import rt.bc;
import rt.bd;
import rt.dd;
import rt.g9;
import rt.gc;
import rt.h9;
import rt.ja;
import rt.l9;
import rt.qa;
import rt.qc;
import rt.rc;
import rt.sc;
import rt.wb;
import rt.z8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4565f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4566t;

    public /* synthetic */ f0(THAISyllableIntroductionActivity tHAISyllableIntroductionActivity, String str, String str2, String str3, String str4, fz.a aVar, int i11) {
        this.f4560a = 13;
        this.f4566t = tHAISyllableIntroductionActivity;
        this.f4561b = str;
        this.f4562c = str2;
        this.f4563d = str3;
        this.f4564e = str4;
        this.f4565f = aVar;
    }

    private final Object a(Object obj, Object obj2) {
        j0.v1 v1Var;
        jt.v vVar;
        CoursePracticeType coursePracticeType;
        boolean z11;
        boolean z12;
        final l0.w wVar = (l0.w) this.f4561b;
        jt.v vVar2 = (jt.v) this.f4562c;
        l1.b1 b1Var = vVar2.f37221l;
        CoursePracticeType coursePracticeType2 = (CoursePracticeType) this.f4563d;
        final rz.b0 b0Var = (rz.b0) this.f4564e;
        fz.a aVar = (fz.a) this.f4565f;
        l1.b3 b3Var = (l1.b3) this.f4566t;
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarD = j0.e2.d(oVar, 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarD);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 0, 7);
            z1.r rVarH = d0.n.h(j0.v.a(j0.e2.e(oVar, 1.0f), 1.3f), ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b);
            float f5 = 20;
            float f11 = 16;
            j0.v1 v1Var2 = new j0.v1(f5, f11, f5, f11);
            j0.g gVarG = j0.i.g(f5);
            boolean zD = sVar.d(coursePracticeType2.ordinal()) | sVar.h(vVar2) | sVar.h(b0Var) | sVar.f(wVar);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zD || objQ == gVar) {
                v1Var = v1Var2;
                objQ = new b1.a(vVar2, coursePracticeType2, b0Var, wVar, b3Var, 8);
                vVar = vVar2;
                wVar = wVar;
                coursePracticeType = coursePracticeType2;
                sVar.o0(objQ);
            } else {
                coursePracticeType = coursePracticeType2;
                vVar = vVar2;
                v1Var = v1Var2;
            }
            final jt.v vVar3 = vVar;
            CoursePracticeType coursePracticeType3 = coursePracticeType;
            ue.f.a(rVarH, wVar, v1Var, gVarG, null, null, false, null, (fz.c) objQ, sVar, 24960, 488);
            if (coursePracticeType3 == CoursePracticeType.COURSE_DIALOG_SPEAKING) {
                sVar.d0(1868384589);
                boolean zBooleanValue = ((Boolean) vVar3.f37227s.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) b1Var.getValue()).booleanValue();
                RecordingStatus recordingStatus = (RecordingStatus) vVar3.f37214e.getValue();
                boolean zH = sVar.h(vVar3);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    objQ2 = new et.s(vVar3, 2);
                    sVar.o0(objQ2);
                }
                fz.a aVar2 = (fz.a) objQ2;
                boolean zH2 = sVar.h(vVar3);
                Object objQ3 = sVar.Q();
                if (zH2 || objQ3 == gVar) {
                    objQ3 = new et.s(vVar3, 3);
                    sVar.o0(objQ3);
                }
                fz.a aVar3 = (fz.a) objQ3;
                boolean zH3 = sVar.h(vVar3);
                Object objQ4 = sVar.Q();
                if (zH3 || objQ4 == gVar) {
                    objQ4 = new et.s(vVar3, 4);
                    sVar.o0(objQ4);
                }
                fz.a aVar4 = (fz.a) objQ4;
                boolean zH4 = sVar.h(vVar3) | sVar.h(b0Var) | sVar.f(wVar);
                Object objQ5 = sVar.Q();
                if (zH4 || objQ5 == gVar) {
                    final int i11 = 1;
                    objQ5 = new fz.a() { // from class: et.t
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i11) {
                                case 0:
                                    jt.v vVar4 = vVar3;
                                    vVar4.m.setValue(Boolean.TRUE);
                                    b1 b1Var2 = vVar4.f37222n;
                                    b1Var2.setValue(0);
                                    rz.e0.B(b0Var, null, null, new b0(wVar, ((Integer) b1Var2.getValue()).intValue(), (vy.d) null, 3), 3);
                                    break;
                                default:
                                    jt.v vVar5 = vVar3;
                                    vVar5.m.setValue(Boolean.TRUE);
                                    b1 b1Var3 = vVar5.f37222n;
                                    b1Var3.setValue(0);
                                    rz.e0.B(b0Var, null, null, new b0(wVar, ((Integer) b1Var3.getValue()).intValue(), (vy.d) null, 2), 3);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ5);
                }
                fz.a aVar5 = (fz.a) objQ5;
                boolean zH5 = sVar.h(vVar3);
                Object objQ6 = sVar.Q();
                if (zH5 || objQ6 == gVar) {
                    objQ6 = new et.s(vVar3, 5);
                    sVar.o0(objQ6);
                }
                z11 = true;
                et.q.a(zBooleanValue2, zBooleanValue, recordingStatus, aVar2, aVar3, aVar4, aVar5, (fz.a) objQ6, aVar, sVar, 0);
                sVar.p(false);
            } else {
                z11 = true;
                sVar.d0(1869462459);
                x1.p pVar = vVar3.f37218i;
                z1.r rVarV = j0.c.v(((Boolean) b1Var.getValue()).booleanValue() ? j0.e2.g(oVar, 160) : j0.c.C(j0.v.a(oVar, 1.0f), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2));
                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                int iHashCode2 = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarV);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, q0VarD, sVar);
                l1.t.J(hVar2, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC2, sVar);
                if (pVar.isEmpty()) {
                    z12 = false;
                    sVar.d0(948072927);
                } else {
                    sVar.d0(966594745);
                    et.o oVar2 = (et.o) ry.m.z0(pVar);
                    boolean zBooleanValue3 = ((Boolean) b1Var.getValue()).booleanValue();
                    boolean zH6 = sVar.h(vVar3);
                    Object objQ7 = sVar.Q();
                    if (zH6 || objQ7 == gVar) {
                        objQ7 = new et.x(vVar3, 0);
                        sVar.o0(objQ7);
                    }
                    fz.c cVar = (fz.c) objQ7;
                    boolean zH7 = sVar.h(vVar3);
                    Object objQ8 = sVar.Q();
                    if (zH7 || objQ8 == gVar) {
                        objQ8 = new et.s(vVar3, 0);
                        sVar.o0(objQ8);
                    }
                    fz.a aVar6 = (fz.a) objQ8;
                    boolean zH8 = sVar.h(vVar3) | sVar.h(b0Var) | sVar.f(wVar);
                    Object objQ9 = sVar.Q();
                    if (zH8 || objQ9 == gVar) {
                        final int i12 = 0;
                        objQ9 = new fz.a() { // from class: et.t
                            @Override // fz.a
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        jt.v vVar4 = vVar3;
                                        vVar4.m.setValue(Boolean.TRUE);
                                        b1 b1Var2 = vVar4.f37222n;
                                        b1Var2.setValue(0);
                                        rz.e0.B(b0Var, null, null, new b0(wVar, ((Integer) b1Var2.getValue()).intValue(), (vy.d) null, 3), 3);
                                        break;
                                    default:
                                        jt.v vVar5 = vVar3;
                                        vVar5.m.setValue(Boolean.TRUE);
                                        b1 b1Var3 = vVar5.f37222n;
                                        b1Var3.setValue(0);
                                        rz.e0.B(b0Var, null, null, new b0(wVar, ((Integer) b1Var3.getValue()).intValue(), (vy.d) null, 2), 3);
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar.o0(objQ9);
                    }
                    fz.a aVar7 = (fz.a) objQ9;
                    boolean zH9 = sVar.h(vVar3);
                    Object objQ10 = sVar.Q();
                    if (zH9 || objQ10 == gVar) {
                        objQ10 = new et.s(vVar3, 1);
                        sVar.o0(objQ10);
                    }
                    et.a.b(oVar2, zBooleanValue3, cVar, aVar6, aVar7, (fz.a) objQ10, aVar, sVar, 0);
                    z12 = false;
                }
                sVar.p(z12);
                sVar.p(true);
                sVar.p(z12);
            }
            sVar.p(z11);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }

    private final Object c(Object obj, Object obj2) {
        fz.e eVar = (fz.e) this.f4561b;
        l1.b1 b1Var = (l1.b1) this.f4562c;
        l1.b1 b1Var2 = (l1.b1) this.f4563d;
        l1.b1 b1Var3 = (l1.b1) this.f4564e;
        l1.b1 b1Var4 = (l1.b1) this.f4565f;
        l1.b1 b1Var5 = (l1.b1) this.f4566t;
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zF = sVar.f(eVar);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                l2 l2Var = new l2(eVar, b1Var, b1Var2, b1Var3, b1Var4, b1Var5, 1);
                sVar.o0(l2Var);
                objQ = l2Var;
            }
            k7.m((fz.a) objQ, null, (oz.q.K0((String) b1Var5.getValue()) || oz.q.K0((String) b1Var.getValue()) || oz.q.K0((String) b1Var2.getValue())) ? false : true, null, null, null, xu.c.f56354j, sVar, 805306368, 506);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0713  */
    /* JADX WARN: Code duplicated, block: B:193:0x0717  */
    /* JADX WARN: Code duplicated, block: B:198:0x0732  */
    /* JADX WARN: Code duplicated, block: B:201:0x0789  */
    /* JADX WARN: Code duplicated, block: B:202:0x078d  */
    /* JADX WARN: Code duplicated, block: B:207:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:210:0x0803  */
    /* JADX WARN: Code duplicated, block: B:213:0x0808  */
    /* JADX WARN: Code duplicated, block: B:214:0x080b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0827 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:219:0x0829  */
    /* JADX WARN: Code duplicated, block: B:223:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:226:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:228:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:231:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:233:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:234:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:236:0x0907  */
    /* JADX WARN: Code duplicated, block: B:239:0x0931  */
    /* JADX WARN: Code duplicated, block: B:241:0x0934  */
    /* JADX WARN: Code duplicated, block: B:242:0x0945  */
    /* JADX WARN: Code duplicated, block: B:243:0x0958  */
    /* JADX WARN: Code duplicated, block: B:246:0x097b  */
    /* JADX WARN: Code duplicated, block: B:248:0x097e  */
    /* JADX WARN: Code duplicated, block: B:250:0x0993  */
    /* JADX WARN: Code duplicated, block: B:251:0x09a6  */
    /* JADX WARN: Code duplicated, block: B:254:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:256:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:258:0x09e4  */
    /* JADX WARN: Code duplicated, block: B:259:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:262:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:263:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:266:0x0a55  */
    /* JADX WARN: Code duplicated, block: B:268:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:272:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:275:0x0a7a  */
    /* JADX WARN: Code duplicated, block: B:277:0x0a7e  */
    /* JADX WARN: Code duplicated, block: B:280:0x0abf  */
    /* JADX WARN: Code duplicated, block: B:282:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:285:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:286:0x0af2  */
    /* JADX WARN: Code duplicated, block: B:289:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:291:0x0b0d  */
    /* JADX WARN: Code duplicated, block: B:294:0x0b15  */
    /* JADX WARN: Code duplicated, block: B:295:0x0b21  */
    /* JADX WARN: Code duplicated, block: B:297:0x0b8f  */
    /* JADX WARN: Code duplicated, block: B:299:0x0ba4  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        z1.r rVar;
        l1.b1 b1Var;
        j0.b bVar;
        int iHashCode;
        float f5;
        int iHashCode2;
        l1.d0 d0Var;
        n3.s sVar;
        boolean zF;
        Object objQ;
        l1.g gVar;
        boolean zF2;
        Object objQ2;
        float f11;
        float f12;
        int i11;
        long jC;
        long j11;
        int i12;
        long jX;
        int i13;
        long jW;
        long j12;
        int i14;
        long jT;
        long j13;
        int iHashCode3;
        float f13;
        boolean zE;
        Object objQ3;
        int iHashCode4;
        boolean z11;
        qy.b0 b0Var;
        l1.b1 b1VarO;
        l1.b1 b1Var2;
        boolean z12;
        final l1.b1 b1Var3;
        l1.b1 b1Var4;
        l1.b1 b1Var5;
        boolean z13;
        boolean z14;
        int i15;
        int i16;
        int i17 = this.f4560a;
        z1.o oVar = z1.o.f58481a;
        vy.d dVar = null;
        l1.g gVar2 = l1.m.f39353a;
        qy.b0 b0Var2 = qy.b0.f48488a;
        Object obj3 = this.f4566t;
        Object obj4 = this.f4565f;
        Object obj5 = this.f4564e;
        Object obj6 = this.f4563d;
        Object obj7 = this.f4562c;
        Object obj8 = this.f4561b;
        switch (i17) {
            case 0:
                ((Integer) obj2).getClass();
                g1.n((String) obj8, (String) obj7, (String) obj6, (String) obj5, (fz.a) obj4, (fz.a) obj3, (l1.n) obj, l1.t.M(24577));
                return b0Var2;
            case 1:
                ys.d0 d0Var2 = (ys.d0) obj8;
                CourseCharacter courseCharacter = (CourseCharacter) obj7;
                l1.b1 b1Var6 = (l1.b1) obj6;
                l1.b1 b1Var7 = (l1.b1) obj5;
                rz.b0 b0Var3 = (rz.b0) obj4;
                vt.n0 n0Var = (vt.n0) obj3;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j0.a2 a2VarA = j0.z1.a(j0.i.g(4), z1.c.M, sVar2, 54);
                    int iHashCode5 = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, oVar);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar2, iHashCode5, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar2);
                    boolean z15 = ((ht.l) b1Var6.getValue()) instanceof ht.c;
                    l1.c3 c3Var = h1.v1.f31180a;
                    long j14 = ((h1.s1) sVar2.j(c3Var)).f31017a;
                    float f14 = 24;
                    z1.r rVarN = j0.e2.n(oVar, f14);
                    boolean zH = sVar2.h(d0Var2) | sVar2.h(courseCharacter) | sVar2.f(b1Var6);
                    Object objQ4 = sVar2.Q();
                    if (zH || objQ4 == gVar2) {
                        objQ4 = new androidx.lifecycle.compose.a(d0Var2, courseCharacter, b1Var6, 4);
                        sVar2.o0(objQ4);
                    }
                    dt.a0.a(z15, rVarN, j14, (fz.a) objQ4, sVar2, 48, 0);
                    String zhuYin = courseCharacter.getZhuYin();
                    l1.d0 d0Var3 = ua.f31167a;
                    j3.y0 y0VarA = j3.y0.a((j3.y0) sVar2.j(d0Var3), 0L, ct.c.c(sVar2), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213);
                    n3.s sVar3 = n3.s.H;
                    ua.b(zhuYin, d2.h.a(oVar, ct.c.d(sVar2)), 0L, 0L, null, sVar3, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar2, 196608, 0, 65500);
                    ua.b("/", null, 0L, 0L, null, sVar3, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(d0Var3), 0L, ct.c.c(sVar2), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213), sVar2, 196614, 0, 65502);
                    if (((Boolean) b1Var7.getValue()).booleanValue()) {
                        sVar2.d0(-1841399043);
                        z1.r rVarA = iw.d.a(sVar2);
                        sVar2.p(false);
                        rVar = rVarA;
                    } else {
                        sVar2.d0(-1841294511);
                        sVar2.p(false);
                        rVar = oVar;
                    }
                    ua.b(courseCharacter.getCharacter(), rVar, 0L, 0L, null, sVar3, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(d0Var3), 0L, ct.c.c(sVar2), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213), sVar2, 196608, 0, 65500);
                    k2.b bVarY = se.k.y(((Boolean) b1Var7.getValue()).booleanValue() ? R.drawable.hand_write_bg_hide : R.drawable.hand_write_bg_show, sVar2, 0);
                    z1.r rVarN2 = j0.e2.n(oVar, f14);
                    boolean zF3 = sVar2.f(b1Var7) | sVar2.h(b0Var3) | sVar2.h(n0Var);
                    Object objQ5 = sVar2.Q();
                    if (zF3 || objQ5 == gVar2) {
                        objQ5 = new androidx.lifecycle.compose.a(b0Var3, b1Var7, n0Var, 5);
                        sVar2.o0(objQ5);
                    }
                    d0.n.c(bVarY, null, iu.k.q(6, 7, (fz.a) objQ5, sVar2, rVarN2, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(((h1.s1) sVar2.j(c3Var)).f31036s, 5), sVar2, 48, 56);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                return b0Var2;
            case 2:
                l1.b1 b1Var8 = (l1.b1) obj8;
                jt.j0 j0Var = (jt.j0) obj7;
                l1.b1 b1Var9 = (l1.b1) obj6;
                ht.o oVar2 = (ht.o) obj5;
                fz.e eVar = (fz.e) obj4;
                CourseSentence courseSentence = (CourseSentence) obj3;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar2;
                if (sVar4.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j0.d dVar2 = j0.i.f35305c;
                    z1.h hVar2 = z1.c.O;
                    j0.u uVarA = j0.t.a(dVar2, hVar2, sVar4, 0);
                    int iHashCode6 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL2 = sVar4.l();
                    z1.o oVar3 = z1.o.f58481a;
                    z1.r rVarC2 = z1.a.c(sVar4, oVar3);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    y2.h hVar3 = y2.j.f56917f;
                    l1.t.J(hVar3, uVarA, sVar4);
                    y2.h hVar4 = y2.j.f56916e;
                    l1.t.J(hVar4, q1VarL2, sVar4);
                    y2.h hVar5 = y2.j.f56918g;
                    if (sVar4.S) {
                        b1Var = b1Var8;
                    } else {
                        b1Var = b1Var8;
                        if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode6))) {
                        }
                        y2.h hVar6 = y2.j.f56915d;
                        l1.t.J(hVar6, rVarC2, sVar4);
                        bVar = j0.i.f35303a;
                        z1.i iVar3 = z1.c.L;
                        j0.a2 a2VarA2 = j0.z1.a(bVar, iVar3, sVar4, 0);
                        iHashCode = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL3 = sVar4.l();
                        z1.r rVarC3 = z1.a.c(sVar4, oVar3);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar2);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar3, a2VarA2, sVar4);
                        l1.t.J(hVar4, q1VarL3, sVar4);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar4, iHashCode, hVar5);
                        }
                        l1.t.J(hVar6, rVarC3, sVar4);
                        float f15 = 0;
                        float f16 = 12;
                        z1.r rVarH = d0.n.h(oVar3, k7.t(sVar4).f31033p, r0.f.e(f15, f16, f16, f16));
                        float f17 = 2;
                        d0.v vVarA = d0.n.a(k7.t(sVar4).A, f17);
                        f5 = 16;
                        z1.r rVarA2 = j0.c.A(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.e(f15, f16, f16, f16), rVarH), f5);
                        j0.u uVarA2 = j0.t.a(dVar2, hVar2, sVar4, 0);
                        iHashCode2 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL4 = sVar4.l();
                        z1.r rVarC4 = z1.a.c(sVar4, rVarA2);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar2);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar3, uVarA2, sVar4);
                        l1.t.J(hVar4, q1VarL4, sVar4);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar5);
                        }
                        l1.t.J(hVar6, rVarC4, sVar4);
                        List<CourseWord> displayCourseWords = j0Var.f36989a.getDisplayCourseWords();
                        d0Var = ua.f31167a;
                        j3.y0 y0Var = (j3.y0) sVar4.j(d0Var);
                        long jC2 = ct.c.c(sVar4);
                        sVar = n3.s.H;
                        j3.y0 y0VarA2 = j3.y0.a(y0Var, 0L, jC2, sVar, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
                        boolean z16 = b1Var9.getValue() instanceof ht.f;
                        boolean z17 = !oVar2.f33757e;
                        zF = sVar4.f(eVar) | sVar4.h(j0Var);
                        objQ = sVar4.Q();
                        if (zF) {
                            gVar = gVar2;
                        } else {
                            gVar = gVar2;
                            if (objQ == gVar) {
                            }
                            fz.a aVar = (fz.a) objQ;
                            zF2 = sVar4.f(eVar);
                            objQ2 = sVar4.Q();
                            if (zF2 || objQ2 == gVar) {
                                objQ2 = new b0.p1(10, eVar);
                                sVar4.o0(objQ2);
                            }
                            dt.d4.a(displayCourseWords, null, null, z17, false, y0VarA2, bVar, z16, true, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, aVar, null, (fz.c) objQ2, sVar4, 102236160, 0, 0, 1572374);
                            dt.a0.r(j0Var.f36989a.getTranslation(), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0, 0, sVar4, 48, 12);
                            sVar4.p(true);
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f12 = Float.MAX_VALUE;
                                f11 = Float.MAX_VALUE;
                            } else {
                                f11 = Float.MAX_VALUE;
                                f12 = 1.0f;
                            }
                            j0.c.g(sVar4, new j0.i1(f12, true));
                            sVar4.p(true);
                            ht.q qVar = (ht.q) b1Var.getValue();
                            int[] iArr = bt.u5.f6071a;
                            i11 = iArr[qVar.ordinal()];
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    sVar4.d0(-961388760);
                                    j11 = k7.t(sVar4).A;
                                    sVar4.p(false);
                                    gVar = gVar;
                                    f5 = f5;
                                } else {
                                    sVar4.d0(-961391085);
                                    jC = g2.x.c(ob.f.u(k7.t(sVar4), sVar4), 0.5f);
                                    sVar4.p(false);
                                }
                                i12 = iArr[((ht.q) b1Var.getValue()).ordinal()];
                                if (i12 != 1) {
                                    sVar4.d0(-961383371);
                                    jX = ob.f.x(k7.t(sVar4), sVar4);
                                    sVar4.p(false);
                                } else if (i12 != 2) {
                                    sVar4.d0(-961378104);
                                    jX = k7.t(sVar4).f31033p;
                                    sVar4.p(false);
                                } else {
                                    sVar4.d0(-961380429);
                                    jX = ob.f.z(k7.t(sVar4), sVar4);
                                    sVar4.p(false);
                                }
                                i13 = iArr[((ht.q) b1Var.getValue()).ordinal()];
                                if (i13 != 1) {
                                    sVar4.d0(-961372820);
                                    jW = ob.f.w(k7.t(sVar4), sVar4);
                                    sVar4.p(false);
                                } else if (i13 != 2) {
                                    sVar4.d0(-961368120);
                                    jW = k7.t(sVar4).A;
                                    sVar4.p(false);
                                } else {
                                    sVar4.d0(-961370166);
                                    jW = ob.f.y(k7.t(sVar4), sVar4);
                                    sVar4.p(false);
                                }
                                long j15 = jW;
                                j12 = j11;
                                i14 = iArr[((ht.q) b1Var.getValue()).ordinal()];
                                if (i14 != 1) {
                                    sVar4.d0(-961362889);
                                    jT = ob.f.t(k7.t(sVar4), sVar4);
                                    sVar4.p(false);
                                } else if (i14 != 2) {
                                    sVar4.d0(-961357494);
                                    jT = k7.t(sVar4).f31034q;
                                    sVar4.p(false);
                                } else {
                                    sVar4.d0(-961359883);
                                    jT = ob.f.u(k7.t(sVar4), sVar4);
                                    sVar4.p(false);
                                }
                                j13 = jT;
                                z1.r rVarE = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, 26, 5);
                                j0.a2 a2VarA3 = j0.z1.a(bVar, iVar3, sVar4, 0);
                                long j16 = jX;
                                iHashCode3 = Long.hashCode(sVar4.T);
                                l1.q1 q1VarL5 = sVar4.l();
                                z1.r rVarC5 = z1.a.c(sVar4, rVarE);
                                sVar4.h0();
                                if (sVar4.S) {
                                    sVar4.k(iVar2);
                                } else {
                                    sVar4.r0();
                                }
                                l1.t.J(hVar3, a2VarA3, sVar4);
                                l1.t.J(hVar4, q1VarL5, sVar4);
                                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                                    defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                                }
                                l1.t.J(hVar6, rVarC5, sVar4);
                                if (1.0f <= 0.0d) {
                                    k0.a.a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > f11) {
                                    f13 = f11;
                                } else {
                                    f13 = 1.0f;
                                }
                                j0.c.g(sVar4, new j0.i1(f13, true));
                                z1.r rVarH2 = d0.n.h(oVar3, j16, r0.f.e(f16, f15, f16, f16));
                                d0.v vVarA2 = d0.n.a(j15, f17);
                                z1.r rVarI = j0.e2.i(j0.c.A(d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.e(f16, f15, f16, f16), rVarH2), f5), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                zE = sVar4.e(j12);
                                objQ3 = sVar4.Q();
                                if (zE || objQ3 == gVar) {
                                    objQ3 = new au.o(j12, 6);
                                    sVar4.o0(objQ3);
                                }
                                z1.r rVarD = d2.h.d(rVarI, (fz.c) objQ3);
                                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                                iHashCode4 = Long.hashCode(sVar4.T);
                                l1.q1 q1VarL6 = sVar4.l();
                                z1.r rVarC6 = z1.a.c(sVar4, rVarD);
                                sVar4.h0();
                                if (sVar4.S) {
                                    sVar4.k(iVar2);
                                } else {
                                    sVar4.r0();
                                }
                                l1.t.J(hVar3, q0VarD, sVar4);
                                l1.t.J(hVar4, q1VarL6, sVar4);
                                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                                    defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                                }
                                l1.t.J(hVar6, rVarC6, sVar4);
                                if (courseSentence == null) {
                                    sVar4.d0(1221946183);
                                    z11 = false;
                                    sVar4.p(false);
                                    b0Var = null;
                                } else {
                                    sVar4.d0(1221946184);
                                    dt.d4.a(courseSentence.getDisplayCourseWords(), null, null, false, false, j3.y0.a((j3.y0) sVar4.j(d0Var), j13, ct.c.c(sVar4), sVar, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), bVar, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar4, 1575936, 0, 0, 4194198);
                                    z11 = false;
                                    sVar4.p(false);
                                    b0Var = b0Var2;
                                }
                                if (b0Var == null) {
                                    sVar4.d0(-791846557);
                                    j0.c.g(sVar4, j0.e2.e(oVar3, 0.7f));
                                    sVar4.p(z11);
                                } else {
                                    sVar4.d0(-791866893);
                                    sVar4.p(z11);
                                }
                                com.google.android.material.datepicker.d.B(sVar4, true, true, true);
                            } else {
                                sVar4.d0(-961394637);
                                jC = g2.x.c(ob.f.t(k7.t(sVar4), sVar4), 0.5f);
                                sVar4.p(false);
                            }
                            j11 = jC;
                            i12 = iArr[((ht.q) b1Var.getValue()).ordinal()];
                            if (i12 != 1) {
                                sVar4.d0(-961383371);
                                jX = ob.f.x(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            } else if (i12 != 2) {
                                sVar4.d0(-961378104);
                                jX = k7.t(sVar4).f31033p;
                                sVar4.p(false);
                            } else {
                                sVar4.d0(-961380429);
                                jX = ob.f.z(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            }
                            i13 = iArr[((ht.q) b1Var.getValue()).ordinal()];
                            if (i13 != 1) {
                                sVar4.d0(-961372820);
                                jW = ob.f.w(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            } else if (i13 != 2) {
                                sVar4.d0(-961368120);
                                jW = k7.t(sVar4).A;
                                sVar4.p(false);
                            } else {
                                sVar4.d0(-961370166);
                                jW = ob.f.y(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            }
                            long j17 = jW;
                            j12 = j11;
                            i14 = iArr[((ht.q) b1Var.getValue()).ordinal()];
                            if (i14 != 1) {
                                sVar4.d0(-961362889);
                                jT = ob.f.t(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            } else if (i14 != 2) {
                                sVar4.d0(-961357494);
                                jT = k7.t(sVar4).f31034q;
                                sVar4.p(false);
                            } else {
                                sVar4.d0(-961359883);
                                jT = ob.f.u(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            }
                            j13 = jT;
                            z1.r rVarE2 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, 26, 5);
                            j0.a2 a2VarA4 = j0.z1.a(bVar, iVar3, sVar4, 0);
                            long j18 = jX;
                            iHashCode3 = Long.hashCode(sVar4.T);
                            l1.q1 q1VarL7 = sVar4.l();
                            z1.r rVarC7 = z1.a.c(sVar4, rVarE2);
                            sVar4.h0();
                            if (sVar4.S) {
                                sVar4.k(iVar2);
                            } else {
                                sVar4.r0();
                            }
                            l1.t.J(hVar3, a2VarA4, sVar4);
                            l1.t.J(hVar4, q1VarL7, sVar4);
                            if (sVar4.S) {
                                defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                            } else {
                                defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                            }
                            l1.t.J(hVar6, rVarC7, sVar4);
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > f11) {
                                f13 = f11;
                            } else {
                                f13 = 1.0f;
                            }
                            j0.c.g(sVar4, new j0.i1(f13, true));
                            z1.r rVarH3 = d0.n.h(oVar3, j18, r0.f.e(f16, f15, f16, f16));
                            d0.v vVarA3 = d0.n.a(j17, f17);
                            z1.r rVarI2 = j0.e2.i(j0.c.A(d0.n.k(vVarA3.f22811a, vVarA3.f22812b, r0.f.e(f16, f15, f16, f16), rVarH3), f5), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            zE = sVar4.e(j12);
                            objQ3 = sVar4.Q();
                            if (zE) {
                                objQ3 = new au.o(j12, 6);
                                sVar4.o0(objQ3);
                            } else {
                                objQ3 = new au.o(j12, 6);
                                sVar4.o0(objQ3);
                            }
                            z1.r rVarD2 = d2.h.d(rVarI2, (fz.c) objQ3);
                            w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                            iHashCode4 = Long.hashCode(sVar4.T);
                            l1.q1 q1VarL8 = sVar4.l();
                            z1.r rVarC8 = z1.a.c(sVar4, rVarD2);
                            sVar4.h0();
                            if (sVar4.S) {
                                sVar4.k(iVar2);
                            } else {
                                sVar4.r0();
                            }
                            l1.t.J(hVar3, q0VarD2, sVar4);
                            l1.t.J(hVar4, q1VarL8, sVar4);
                            if (sVar4.S) {
                                defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                            } else {
                                defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                            }
                            l1.t.J(hVar6, rVarC8, sVar4);
                            if (courseSentence == null) {
                                sVar4.d0(1221946183);
                                z11 = false;
                                sVar4.p(false);
                                b0Var = null;
                            } else {
                                sVar4.d0(1221946184);
                                dt.d4.a(courseSentence.getDisplayCourseWords(), null, null, false, false, j3.y0.a((j3.y0) sVar4.j(d0Var), j13, ct.c.c(sVar4), sVar, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), bVar, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar4, 1575936, 0, 0, 4194198);
                                z11 = false;
                                sVar4.p(false);
                                b0Var = b0Var2;
                            }
                            if (b0Var == null) {
                                sVar4.d0(-791846557);
                                j0.c.g(sVar4, j0.e2.e(oVar3, 0.7f));
                                sVar4.p(z11);
                            } else {
                                sVar4.d0(-791866893);
                                sVar4.p(z11);
                            }
                            com.google.android.material.datepicker.d.B(sVar4, true, true, true);
                        }
                        objQ = new at.f(16, eVar, j0Var);
                        sVar4.o0(objQ);
                        fz.a aVar2 = (fz.a) objQ;
                        zF2 = sVar4.f(eVar);
                        objQ2 = sVar4.Q();
                        if (zF2) {
                            objQ2 = new b0.p1(10, eVar);
                            sVar4.o0(objQ2);
                        } else {
                            objQ2 = new b0.p1(10, eVar);
                            sVar4.o0(objQ2);
                        }
                        dt.d4.a(displayCourseWords, null, null, z17, false, y0VarA2, bVar, z16, true, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, aVar2, null, (fz.c) objQ2, sVar4, 102236160, 0, 0, 1572374);
                        dt.a0.r(j0Var.f36989a.getTranslation(), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0, 0, sVar4, 48, 12);
                        sVar4.p(true);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f12 = Float.MAX_VALUE;
                            f11 = Float.MAX_VALUE;
                        } else {
                            f11 = Float.MAX_VALUE;
                            f12 = 1.0f;
                        }
                        j0.c.g(sVar4, new j0.i1(f12, true));
                        sVar4.p(true);
                        ht.q qVar2 = (ht.q) b1Var.getValue();
                        int[] iArr2 = bt.u5.f6071a;
                        i11 = iArr2[qVar2.ordinal()];
                        if (i11 != 1) {
                            if (i11 != 2) {
                                sVar4.d0(-961388760);
                                j11 = k7.t(sVar4).A;
                                sVar4.p(false);
                                gVar = gVar;
                                f5 = f5;
                            } else {
                                sVar4.d0(-961391085);
                                jC = g2.x.c(ob.f.u(k7.t(sVar4), sVar4), 0.5f);
                                sVar4.p(false);
                            }
                            i12 = iArr2[((ht.q) b1Var.getValue()).ordinal()];
                            if (i12 != 1) {
                                sVar4.d0(-961383371);
                                jX = ob.f.x(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            } else if (i12 != 2) {
                                sVar4.d0(-961378104);
                                jX = k7.t(sVar4).f31033p;
                                sVar4.p(false);
                            } else {
                                sVar4.d0(-961380429);
                                jX = ob.f.z(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            }
                            i13 = iArr2[((ht.q) b1Var.getValue()).ordinal()];
                            if (i13 != 1) {
                                sVar4.d0(-961372820);
                                jW = ob.f.w(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            } else if (i13 != 2) {
                                sVar4.d0(-961368120);
                                jW = k7.t(sVar4).A;
                                sVar4.p(false);
                            } else {
                                sVar4.d0(-961370166);
                                jW = ob.f.y(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            }
                            long j19 = jW;
                            j12 = j11;
                            i14 = iArr2[((ht.q) b1Var.getValue()).ordinal()];
                            if (i14 != 1) {
                                sVar4.d0(-961362889);
                                jT = ob.f.t(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            } else if (i14 != 2) {
                                sVar4.d0(-961357494);
                                jT = k7.t(sVar4).f31034q;
                                sVar4.p(false);
                            } else {
                                sVar4.d0(-961359883);
                                jT = ob.f.u(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            }
                            j13 = jT;
                            z1.r rVarE3 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, 26, 5);
                            j0.a2 a2VarA5 = j0.z1.a(bVar, iVar3, sVar4, 0);
                            long j110 = jX;
                            iHashCode3 = Long.hashCode(sVar4.T);
                            l1.q1 q1VarL9 = sVar4.l();
                            z1.r rVarC9 = z1.a.c(sVar4, rVarE3);
                            sVar4.h0();
                            if (sVar4.S) {
                                sVar4.k(iVar2);
                            } else {
                                sVar4.r0();
                            }
                            l1.t.J(hVar3, a2VarA5, sVar4);
                            l1.t.J(hVar4, q1VarL9, sVar4);
                            if (sVar4.S) {
                                defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                            } else {
                                defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                            }
                            l1.t.J(hVar6, rVarC9, sVar4);
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > f11) {
                                f13 = f11;
                            } else {
                                f13 = 1.0f;
                            }
                            j0.c.g(sVar4, new j0.i1(f13, true));
                            z1.r rVarH4 = d0.n.h(oVar3, j110, r0.f.e(f16, f15, f16, f16));
                            d0.v vVarA4 = d0.n.a(j19, f17);
                            z1.r rVarI3 = j0.e2.i(j0.c.A(d0.n.k(vVarA4.f22811a, vVarA4.f22812b, r0.f.e(f16, f15, f16, f16), rVarH4), f5), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            zE = sVar4.e(j12);
                            objQ3 = sVar4.Q();
                            if (zE) {
                                objQ3 = new au.o(j12, 6);
                                sVar4.o0(objQ3);
                            } else {
                                objQ3 = new au.o(j12, 6);
                                sVar4.o0(objQ3);
                            }
                            z1.r rVarD3 = d2.h.d(rVarI3, (fz.c) objQ3);
                            w2.q0 q0VarD3 = j0.o.d(z1.c.f58463a, false);
                            iHashCode4 = Long.hashCode(sVar4.T);
                            l1.q1 q1VarL10 = sVar4.l();
                            z1.r rVarC10 = z1.a.c(sVar4, rVarD3);
                            sVar4.h0();
                            if (sVar4.S) {
                                sVar4.k(iVar2);
                            } else {
                                sVar4.r0();
                            }
                            l1.t.J(hVar3, q0VarD3, sVar4);
                            l1.t.J(hVar4, q1VarL10, sVar4);
                            if (sVar4.S) {
                                defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                            } else {
                                defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                            }
                            l1.t.J(hVar6, rVarC10, sVar4);
                            if (courseSentence == null) {
                                sVar4.d0(1221946183);
                                z11 = false;
                                sVar4.p(false);
                                b0Var = null;
                            } else {
                                sVar4.d0(1221946184);
                                dt.d4.a(courseSentence.getDisplayCourseWords(), null, null, false, false, j3.y0.a((j3.y0) sVar4.j(d0Var), j13, ct.c.c(sVar4), sVar, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), bVar, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar4, 1575936, 0, 0, 4194198);
                                z11 = false;
                                sVar4.p(false);
                                b0Var = b0Var2;
                            }
                            if (b0Var == null) {
                                sVar4.d0(-791846557);
                                j0.c.g(sVar4, j0.e2.e(oVar3, 0.7f));
                                sVar4.p(z11);
                            } else {
                                sVar4.d0(-791866893);
                                sVar4.p(z11);
                            }
                            com.google.android.material.datepicker.d.B(sVar4, true, true, true);
                        } else {
                            sVar4.d0(-961394637);
                            jC = g2.x.c(ob.f.t(k7.t(sVar4), sVar4), 0.5f);
                            sVar4.p(false);
                        }
                        j11 = jC;
                        i12 = iArr2[((ht.q) b1Var.getValue()).ordinal()];
                        if (i12 != 1) {
                            sVar4.d0(-961383371);
                            jX = ob.f.x(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        } else if (i12 != 2) {
                            sVar4.d0(-961378104);
                            jX = k7.t(sVar4).f31033p;
                            sVar4.p(false);
                        } else {
                            sVar4.d0(-961380429);
                            jX = ob.f.z(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        }
                        i13 = iArr2[((ht.q) b1Var.getValue()).ordinal()];
                        if (i13 != 1) {
                            sVar4.d0(-961372820);
                            jW = ob.f.w(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        } else if (i13 != 2) {
                            sVar4.d0(-961368120);
                            jW = k7.t(sVar4).A;
                            sVar4.p(false);
                        } else {
                            sVar4.d0(-961370166);
                            jW = ob.f.y(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        }
                        long j111 = jW;
                        j12 = j11;
                        i14 = iArr2[((ht.q) b1Var.getValue()).ordinal()];
                        if (i14 != 1) {
                            sVar4.d0(-961362889);
                            jT = ob.f.t(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        } else if (i14 != 2) {
                            sVar4.d0(-961357494);
                            jT = k7.t(sVar4).f31034q;
                            sVar4.p(false);
                        } else {
                            sVar4.d0(-961359883);
                            jT = ob.f.u(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        }
                        j13 = jT;
                        z1.r rVarE4 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, 26, 5);
                        j0.a2 a2VarA6 = j0.z1.a(bVar, iVar3, sVar4, 0);
                        long j112 = jX;
                        iHashCode3 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL11 = sVar4.l();
                        z1.r rVarC11 = z1.a.c(sVar4, rVarE4);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar2);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar3, a2VarA6, sVar4);
                        l1.t.J(hVar4, q1VarL11, sVar4);
                        if (sVar4.S) {
                            defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                        } else {
                            defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                        }
                        l1.t.J(hVar6, rVarC11, sVar4);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > f11) {
                            f13 = f11;
                        } else {
                            f13 = 1.0f;
                        }
                        j0.c.g(sVar4, new j0.i1(f13, true));
                        z1.r rVarH5 = d0.n.h(oVar3, j112, r0.f.e(f16, f15, f16, f16));
                        d0.v vVarA5 = d0.n.a(j111, f17);
                        z1.r rVarI4 = j0.e2.i(j0.c.A(d0.n.k(vVarA5.f22811a, vVarA5.f22812b, r0.f.e(f16, f15, f16, f16), rVarH5), f5), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        zE = sVar4.e(j12);
                        objQ3 = sVar4.Q();
                        if (zE) {
                            objQ3 = new au.o(j12, 6);
                            sVar4.o0(objQ3);
                        } else {
                            objQ3 = new au.o(j12, 6);
                            sVar4.o0(objQ3);
                        }
                        z1.r rVarD4 = d2.h.d(rVarI4, (fz.c) objQ3);
                        w2.q0 q0VarD4 = j0.o.d(z1.c.f58463a, false);
                        iHashCode4 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL12 = sVar4.l();
                        z1.r rVarC12 = z1.a.c(sVar4, rVarD4);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar2);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar3, q0VarD4, sVar4);
                        l1.t.J(hVar4, q1VarL12, sVar4);
                        if (sVar4.S) {
                            defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                        } else {
                            defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                        }
                        l1.t.J(hVar6, rVarC12, sVar4);
                        if (courseSentence == null) {
                            sVar4.d0(1221946183);
                            z11 = false;
                            sVar4.p(false);
                            b0Var = null;
                        } else {
                            sVar4.d0(1221946184);
                            dt.d4.a(courseSentence.getDisplayCourseWords(), null, null, false, false, j3.y0.a((j3.y0) sVar4.j(d0Var), j13, ct.c.c(sVar4), sVar, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), bVar, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar4, 1575936, 0, 0, 4194198);
                            z11 = false;
                            sVar4.p(false);
                            b0Var = b0Var2;
                        }
                        if (b0Var == null) {
                            sVar4.d0(-791846557);
                            j0.c.g(sVar4, j0.e2.e(oVar3, 0.7f));
                            sVar4.p(z11);
                        } else {
                            sVar4.d0(-791866893);
                            sVar4.p(z11);
                        }
                        com.google.android.material.datepicker.d.B(sVar4, true, true, true);
                    }
                    defpackage.e.A(iHashCode6, sVar4, iHashCode6, hVar5);
                    y2.h hVar7 = y2.j.f56915d;
                    l1.t.J(hVar7, rVarC2, sVar4);
                    bVar = j0.i.f35303a;
                    z1.i iVar4 = z1.c.L;
                    j0.a2 a2VarA7 = j0.z1.a(bVar, iVar4, sVar4, 0);
                    iHashCode = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL13 = sVar4.l();
                    z1.r rVarC13 = z1.a.c(sVar4, oVar3);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar3, a2VarA7, sVar4);
                    l1.t.J(hVar4, q1VarL13, sVar4);
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar5);
                    } else {
                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar5);
                    }
                    l1.t.J(hVar7, rVarC13, sVar4);
                    float f18 = 0;
                    float f19 = 12;
                    z1.r rVarH6 = d0.n.h(oVar3, k7.t(sVar4).f31033p, r0.f.e(f18, f19, f19, f19));
                    float f110 = 2;
                    d0.v vVarA6 = d0.n.a(k7.t(sVar4).A, f110);
                    f5 = 16;
                    z1.r rVarA3 = j0.c.A(d0.n.k(vVarA6.f22811a, vVarA6.f22812b, r0.f.e(f18, f19, f19, f19), rVarH6), f5);
                    j0.u uVarA3 = j0.t.a(dVar2, hVar2, sVar4, 0);
                    iHashCode2 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL14 = sVar4.l();
                    z1.r rVarC14 = z1.a.c(sVar4, rVarA3);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar3, uVarA3, sVar4);
                    l1.t.J(hVar4, q1VarL14, sVar4);
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar5);
                    } else {
                        defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar5);
                    }
                    l1.t.J(hVar7, rVarC14, sVar4);
                    List<CourseWord> displayCourseWords2 = j0Var.f36989a.getDisplayCourseWords();
                    d0Var = ua.f31167a;
                    j3.y0 y0Var2 = (j3.y0) sVar4.j(d0Var);
                    long jC3 = ct.c.c(sVar4);
                    sVar = n3.s.H;
                    j3.y0 y0VarA3 = j3.y0.a(y0Var2, 0L, jC3, sVar, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
                    boolean z18 = b1Var9.getValue() instanceof ht.f;
                    boolean z19 = !oVar2.f33757e;
                    zF = sVar4.f(eVar) | sVar4.h(j0Var);
                    objQ = sVar4.Q();
                    if (zF) {
                        gVar = gVar2;
                        if (objQ == gVar) {
                        }
                        fz.a aVar3 = (fz.a) objQ;
                        zF2 = sVar4.f(eVar);
                        objQ2 = sVar4.Q();
                        if (zF2) {
                            objQ2 = new b0.p1(10, eVar);
                            sVar4.o0(objQ2);
                        } else {
                            objQ2 = new b0.p1(10, eVar);
                            sVar4.o0(objQ2);
                        }
                        dt.d4.a(displayCourseWords2, null, null, z19, false, y0VarA3, bVar, z18, true, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, aVar3, null, (fz.c) objQ2, sVar4, 102236160, 0, 0, 1572374);
                        dt.a0.r(j0Var.f36989a.getTranslation(), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0, 0, sVar4, 48, 12);
                        sVar4.p(true);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f12 = Float.MAX_VALUE;
                            f11 = Float.MAX_VALUE;
                        } else {
                            f11 = Float.MAX_VALUE;
                            f12 = 1.0f;
                        }
                        j0.c.g(sVar4, new j0.i1(f12, true));
                        sVar4.p(true);
                        ht.q qVar3 = (ht.q) b1Var.getValue();
                        int[] iArr3 = bt.u5.f6071a;
                        i11 = iArr3[qVar3.ordinal()];
                        if (i11 != 1) {
                            if (i11 != 2) {
                                sVar4.d0(-961388760);
                                j11 = k7.t(sVar4).A;
                                sVar4.p(false);
                                gVar = gVar;
                                f5 = f5;
                            } else {
                                sVar4.d0(-961391085);
                                jC = g2.x.c(ob.f.u(k7.t(sVar4), sVar4), 0.5f);
                                sVar4.p(false);
                            }
                            i12 = iArr3[((ht.q) b1Var.getValue()).ordinal()];
                            if (i12 != 1) {
                                sVar4.d0(-961383371);
                                jX = ob.f.x(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            } else if (i12 != 2) {
                                sVar4.d0(-961378104);
                                jX = k7.t(sVar4).f31033p;
                                sVar4.p(false);
                            } else {
                                sVar4.d0(-961380429);
                                jX = ob.f.z(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            }
                            i13 = iArr3[((ht.q) b1Var.getValue()).ordinal()];
                            if (i13 != 1) {
                                sVar4.d0(-961372820);
                                jW = ob.f.w(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            } else if (i13 != 2) {
                                sVar4.d0(-961368120);
                                jW = k7.t(sVar4).A;
                                sVar4.p(false);
                            } else {
                                sVar4.d0(-961370166);
                                jW = ob.f.y(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            }
                            long j113 = jW;
                            j12 = j11;
                            i14 = iArr3[((ht.q) b1Var.getValue()).ordinal()];
                            if (i14 != 1) {
                                sVar4.d0(-961362889);
                                jT = ob.f.t(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            } else if (i14 != 2) {
                                sVar4.d0(-961357494);
                                jT = k7.t(sVar4).f31034q;
                                sVar4.p(false);
                            } else {
                                sVar4.d0(-961359883);
                                jT = ob.f.u(k7.t(sVar4), sVar4);
                                sVar4.p(false);
                            }
                            j13 = jT;
                            z1.r rVarE5 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, 26, 5);
                            j0.a2 a2VarA8 = j0.z1.a(bVar, iVar4, sVar4, 0);
                            long j114 = jX;
                            iHashCode3 = Long.hashCode(sVar4.T);
                            l1.q1 q1VarL15 = sVar4.l();
                            z1.r rVarC15 = z1.a.c(sVar4, rVarE5);
                            sVar4.h0();
                            if (sVar4.S) {
                                sVar4.k(iVar2);
                            } else {
                                sVar4.r0();
                            }
                            l1.t.J(hVar3, a2VarA8, sVar4);
                            l1.t.J(hVar4, q1VarL15, sVar4);
                            if (sVar4.S) {
                                defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                            } else {
                                defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                            }
                            l1.t.J(hVar7, rVarC15, sVar4);
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > f11) {
                                f13 = f11;
                            } else {
                                f13 = 1.0f;
                            }
                            j0.c.g(sVar4, new j0.i1(f13, true));
                            z1.r rVarH7 = d0.n.h(oVar3, j114, r0.f.e(f19, f18, f19, f19));
                            d0.v vVarA7 = d0.n.a(j113, f110);
                            z1.r rVarI5 = j0.e2.i(j0.c.A(d0.n.k(vVarA7.f22811a, vVarA7.f22812b, r0.f.e(f19, f18, f19, f19), rVarH7), f5), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            zE = sVar4.e(j12);
                            objQ3 = sVar4.Q();
                            if (zE) {
                                objQ3 = new au.o(j12, 6);
                                sVar4.o0(objQ3);
                            } else {
                                objQ3 = new au.o(j12, 6);
                                sVar4.o0(objQ3);
                            }
                            z1.r rVarD5 = d2.h.d(rVarI5, (fz.c) objQ3);
                            w2.q0 q0VarD5 = j0.o.d(z1.c.f58463a, false);
                            iHashCode4 = Long.hashCode(sVar4.T);
                            l1.q1 q1VarL16 = sVar4.l();
                            z1.r rVarC16 = z1.a.c(sVar4, rVarD5);
                            sVar4.h0();
                            if (sVar4.S) {
                                sVar4.k(iVar2);
                            } else {
                                sVar4.r0();
                            }
                            l1.t.J(hVar3, q0VarD5, sVar4);
                            l1.t.J(hVar4, q1VarL16, sVar4);
                            if (sVar4.S) {
                                defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                            } else {
                                defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                            }
                            l1.t.J(hVar7, rVarC16, sVar4);
                            if (courseSentence == null) {
                                sVar4.d0(1221946183);
                                z11 = false;
                                sVar4.p(false);
                                b0Var = null;
                            } else {
                                sVar4.d0(1221946184);
                                dt.d4.a(courseSentence.getDisplayCourseWords(), null, null, false, false, j3.y0.a((j3.y0) sVar4.j(d0Var), j13, ct.c.c(sVar4), sVar, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), bVar, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar4, 1575936, 0, 0, 4194198);
                                z11 = false;
                                sVar4.p(false);
                                b0Var = b0Var2;
                            }
                            if (b0Var == null) {
                                sVar4.d0(-791846557);
                                j0.c.g(sVar4, j0.e2.e(oVar3, 0.7f));
                                sVar4.p(z11);
                            } else {
                                sVar4.d0(-791866893);
                                sVar4.p(z11);
                            }
                            com.google.android.material.datepicker.d.B(sVar4, true, true, true);
                        } else {
                            sVar4.d0(-961394637);
                            jC = g2.x.c(ob.f.t(k7.t(sVar4), sVar4), 0.5f);
                            sVar4.p(false);
                        }
                        j11 = jC;
                        i12 = iArr3[((ht.q) b1Var.getValue()).ordinal()];
                        if (i12 != 1) {
                            sVar4.d0(-961383371);
                            jX = ob.f.x(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        } else if (i12 != 2) {
                            sVar4.d0(-961378104);
                            jX = k7.t(sVar4).f31033p;
                            sVar4.p(false);
                        } else {
                            sVar4.d0(-961380429);
                            jX = ob.f.z(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        }
                        i13 = iArr3[((ht.q) b1Var.getValue()).ordinal()];
                        if (i13 != 1) {
                            sVar4.d0(-961372820);
                            jW = ob.f.w(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        } else if (i13 != 2) {
                            sVar4.d0(-961368120);
                            jW = k7.t(sVar4).A;
                            sVar4.p(false);
                        } else {
                            sVar4.d0(-961370166);
                            jW = ob.f.y(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        }
                        long j115 = jW;
                        j12 = j11;
                        i14 = iArr3[((ht.q) b1Var.getValue()).ordinal()];
                        if (i14 != 1) {
                            sVar4.d0(-961362889);
                            jT = ob.f.t(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        } else if (i14 != 2) {
                            sVar4.d0(-961357494);
                            jT = k7.t(sVar4).f31034q;
                            sVar4.p(false);
                        } else {
                            sVar4.d0(-961359883);
                            jT = ob.f.u(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        }
                        j13 = jT;
                        z1.r rVarE6 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, 26, 5);
                        j0.a2 a2VarA9 = j0.z1.a(bVar, iVar4, sVar4, 0);
                        long j116 = jX;
                        iHashCode3 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL17 = sVar4.l();
                        z1.r rVarC17 = z1.a.c(sVar4, rVarE6);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar2);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar3, a2VarA9, sVar4);
                        l1.t.J(hVar4, q1VarL17, sVar4);
                        if (sVar4.S) {
                            defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                        } else {
                            defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                        }
                        l1.t.J(hVar7, rVarC17, sVar4);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > f11) {
                            f13 = f11;
                        } else {
                            f13 = 1.0f;
                        }
                        j0.c.g(sVar4, new j0.i1(f13, true));
                        z1.r rVarH8 = d0.n.h(oVar3, j116, r0.f.e(f19, f18, f19, f19));
                        d0.v vVarA8 = d0.n.a(j115, f110);
                        z1.r rVarI6 = j0.e2.i(j0.c.A(d0.n.k(vVarA8.f22811a, vVarA8.f22812b, r0.f.e(f19, f18, f19, f19), rVarH8), f5), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        zE = sVar4.e(j12);
                        objQ3 = sVar4.Q();
                        if (zE) {
                            objQ3 = new au.o(j12, 6);
                            sVar4.o0(objQ3);
                        } else {
                            objQ3 = new au.o(j12, 6);
                            sVar4.o0(objQ3);
                        }
                        z1.r rVarD6 = d2.h.d(rVarI6, (fz.c) objQ3);
                        w2.q0 q0VarD6 = j0.o.d(z1.c.f58463a, false);
                        iHashCode4 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL18 = sVar4.l();
                        z1.r rVarC18 = z1.a.c(sVar4, rVarD6);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar2);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar3, q0VarD6, sVar4);
                        l1.t.J(hVar4, q1VarL18, sVar4);
                        if (sVar4.S) {
                            defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                        } else {
                            defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                        }
                        l1.t.J(hVar7, rVarC18, sVar4);
                        if (courseSentence == null) {
                            sVar4.d0(1221946183);
                            z11 = false;
                            sVar4.p(false);
                            b0Var = null;
                        } else {
                            sVar4.d0(1221946184);
                            dt.d4.a(courseSentence.getDisplayCourseWords(), null, null, false, false, j3.y0.a((j3.y0) sVar4.j(d0Var), j13, ct.c.c(sVar4), sVar, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), bVar, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar4, 1575936, 0, 0, 4194198);
                            z11 = false;
                            sVar4.p(false);
                            b0Var = b0Var2;
                        }
                        if (b0Var == null) {
                            sVar4.d0(-791846557);
                            j0.c.g(sVar4, j0.e2.e(oVar3, 0.7f));
                            sVar4.p(z11);
                        } else {
                            sVar4.d0(-791866893);
                            sVar4.p(z11);
                        }
                        com.google.android.material.datepicker.d.B(sVar4, true, true, true);
                    } else {
                        gVar = gVar2;
                    }
                    objQ = new at.f(16, eVar, j0Var);
                    sVar4.o0(objQ);
                    fz.a aVar4 = (fz.a) objQ;
                    zF2 = sVar4.f(eVar);
                    objQ2 = sVar4.Q();
                    if (zF2) {
                        objQ2 = new b0.p1(10, eVar);
                        sVar4.o0(objQ2);
                    } else {
                        objQ2 = new b0.p1(10, eVar);
                        sVar4.o0(objQ2);
                    }
                    dt.d4.a(displayCourseWords2, null, null, z19, false, y0VarA3, bVar, z18, true, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, aVar4, null, (fz.c) objQ2, sVar4, 102236160, 0, 0, 1572374);
                    dt.a0.r(j0Var.f36989a.getTranslation(), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0, 0, sVar4, 48, 12);
                    sVar4.p(true);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f12 = Float.MAX_VALUE;
                        f11 = Float.MAX_VALUE;
                    } else {
                        f11 = Float.MAX_VALUE;
                        f12 = 1.0f;
                    }
                    j0.c.g(sVar4, new j0.i1(f12, true));
                    sVar4.p(true);
                    ht.q qVar4 = (ht.q) b1Var.getValue();
                    int[] iArr4 = bt.u5.f6071a;
                    i11 = iArr4[qVar4.ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            sVar4.d0(-961388760);
                            j11 = k7.t(sVar4).A;
                            sVar4.p(false);
                            gVar = gVar;
                            f5 = f5;
                        } else {
                            sVar4.d0(-961391085);
                            jC = g2.x.c(ob.f.u(k7.t(sVar4), sVar4), 0.5f);
                            sVar4.p(false);
                        }
                        i12 = iArr4[((ht.q) b1Var.getValue()).ordinal()];
                        if (i12 != 1) {
                            sVar4.d0(-961383371);
                            jX = ob.f.x(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        } else if (i12 != 2) {
                            sVar4.d0(-961378104);
                            jX = k7.t(sVar4).f31033p;
                            sVar4.p(false);
                        } else {
                            sVar4.d0(-961380429);
                            jX = ob.f.z(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        }
                        i13 = iArr4[((ht.q) b1Var.getValue()).ordinal()];
                        if (i13 != 1) {
                            sVar4.d0(-961372820);
                            jW = ob.f.w(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        } else if (i13 != 2) {
                            sVar4.d0(-961368120);
                            jW = k7.t(sVar4).A;
                            sVar4.p(false);
                        } else {
                            sVar4.d0(-961370166);
                            jW = ob.f.y(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        }
                        long j117 = jW;
                        j12 = j11;
                        i14 = iArr4[((ht.q) b1Var.getValue()).ordinal()];
                        if (i14 != 1) {
                            sVar4.d0(-961362889);
                            jT = ob.f.t(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        } else if (i14 != 2) {
                            sVar4.d0(-961357494);
                            jT = k7.t(sVar4).f31034q;
                            sVar4.p(false);
                        } else {
                            sVar4.d0(-961359883);
                            jT = ob.f.u(k7.t(sVar4), sVar4);
                            sVar4.p(false);
                        }
                        j13 = jT;
                        z1.r rVarE7 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, 26, 5);
                        j0.a2 a2VarA10 = j0.z1.a(bVar, iVar4, sVar4, 0);
                        long j118 = jX;
                        iHashCode3 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL19 = sVar4.l();
                        z1.r rVarC19 = z1.a.c(sVar4, rVarE7);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar2);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar3, a2VarA10, sVar4);
                        l1.t.J(hVar4, q1VarL19, sVar4);
                        if (sVar4.S) {
                            defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                        } else {
                            defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                        }
                        l1.t.J(hVar7, rVarC19, sVar4);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > f11) {
                            f13 = f11;
                        } else {
                            f13 = 1.0f;
                        }
                        j0.c.g(sVar4, new j0.i1(f13, true));
                        z1.r rVarH9 = d0.n.h(oVar3, j118, r0.f.e(f19, f18, f19, f19));
                        d0.v vVarA9 = d0.n.a(j117, f110);
                        z1.r rVarI7 = j0.e2.i(j0.c.A(d0.n.k(vVarA9.f22811a, vVarA9.f22812b, r0.f.e(f19, f18, f19, f19), rVarH9), f5), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        zE = sVar4.e(j12);
                        objQ3 = sVar4.Q();
                        if (zE) {
                            objQ3 = new au.o(j12, 6);
                            sVar4.o0(objQ3);
                        } else {
                            objQ3 = new au.o(j12, 6);
                            sVar4.o0(objQ3);
                        }
                        z1.r rVarD7 = d2.h.d(rVarI7, (fz.c) objQ3);
                        w2.q0 q0VarD7 = j0.o.d(z1.c.f58463a, false);
                        iHashCode4 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL110 = sVar4.l();
                        z1.r rVarC110 = z1.a.c(sVar4, rVarD7);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar2);
                        } else {
                            sVar4.r0();
                        }
                        l1.t.J(hVar3, q0VarD7, sVar4);
                        l1.t.J(hVar4, q1VarL110, sVar4);
                        if (sVar4.S) {
                            defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                        } else {
                            defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                        }
                        l1.t.J(hVar7, rVarC110, sVar4);
                        if (courseSentence == null) {
                            sVar4.d0(1221946183);
                            z11 = false;
                            sVar4.p(false);
                            b0Var = null;
                        } else {
                            sVar4.d0(1221946184);
                            dt.d4.a(courseSentence.getDisplayCourseWords(), null, null, false, false, j3.y0.a((j3.y0) sVar4.j(d0Var), j13, ct.c.c(sVar4), sVar, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), bVar, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar4, 1575936, 0, 0, 4194198);
                            z11 = false;
                            sVar4.p(false);
                            b0Var = b0Var2;
                        }
                        if (b0Var == null) {
                            sVar4.d0(-791846557);
                            j0.c.g(sVar4, j0.e2.e(oVar3, 0.7f));
                            sVar4.p(z11);
                        } else {
                            sVar4.d0(-791866893);
                            sVar4.p(z11);
                        }
                        com.google.android.material.datepicker.d.B(sVar4, true, true, true);
                    } else {
                        sVar4.d0(-961394637);
                        jC = g2.x.c(ob.f.t(k7.t(sVar4), sVar4), 0.5f);
                        sVar4.p(false);
                    }
                    j11 = jC;
                    i12 = iArr4[((ht.q) b1Var.getValue()).ordinal()];
                    if (i12 != 1) {
                        sVar4.d0(-961383371);
                        jX = ob.f.x(k7.t(sVar4), sVar4);
                        sVar4.p(false);
                    } else if (i12 != 2) {
                        sVar4.d0(-961378104);
                        jX = k7.t(sVar4).f31033p;
                        sVar4.p(false);
                    } else {
                        sVar4.d0(-961380429);
                        jX = ob.f.z(k7.t(sVar4), sVar4);
                        sVar4.p(false);
                    }
                    i13 = iArr4[((ht.q) b1Var.getValue()).ordinal()];
                    if (i13 != 1) {
                        sVar4.d0(-961372820);
                        jW = ob.f.w(k7.t(sVar4), sVar4);
                        sVar4.p(false);
                    } else if (i13 != 2) {
                        sVar4.d0(-961368120);
                        jW = k7.t(sVar4).A;
                        sVar4.p(false);
                    } else {
                        sVar4.d0(-961370166);
                        jW = ob.f.y(k7.t(sVar4), sVar4);
                        sVar4.p(false);
                    }
                    long j119 = jW;
                    j12 = j11;
                    i14 = iArr4[((ht.q) b1Var.getValue()).ordinal()];
                    if (i14 != 1) {
                        sVar4.d0(-961362889);
                        jT = ob.f.t(k7.t(sVar4), sVar4);
                        sVar4.p(false);
                    } else if (i14 != 2) {
                        sVar4.d0(-961357494);
                        jT = k7.t(sVar4).f31034q;
                        sVar4.p(false);
                    } else {
                        sVar4.d0(-961359883);
                        jT = ob.f.u(k7.t(sVar4), sVar4);
                        sVar4.p(false);
                    }
                    j13 = jT;
                    z1.r rVarE8 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, 26, 5);
                    j0.a2 a2VarA11 = j0.z1.a(bVar, iVar4, sVar4, 0);
                    long j1110 = jX;
                    iHashCode3 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL111 = sVar4.l();
                    z1.r rVarC111 = z1.a.c(sVar4, rVarE8);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar3, a2VarA11, sVar4);
                    l1.t.J(hVar4, q1VarL111, sVar4);
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                    } else {
                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar5);
                    }
                    l1.t.J(hVar7, rVarC111, sVar4);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > f11) {
                        f13 = f11;
                    } else {
                        f13 = 1.0f;
                    }
                    j0.c.g(sVar4, new j0.i1(f13, true));
                    z1.r rVarH10 = d0.n.h(oVar3, j1110, r0.f.e(f19, f18, f19, f19));
                    d0.v vVarA10 = d0.n.a(j119, f110);
                    z1.r rVarI8 = j0.e2.i(j0.c.A(d0.n.k(vVarA10.f22811a, vVarA10.f22812b, r0.f.e(f19, f18, f19, f19), rVarH10), f5), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    zE = sVar4.e(j12);
                    objQ3 = sVar4.Q();
                    if (zE) {
                        objQ3 = new au.o(j12, 6);
                        sVar4.o0(objQ3);
                    } else {
                        objQ3 = new au.o(j12, 6);
                        sVar4.o0(objQ3);
                    }
                    z1.r rVarD8 = d2.h.d(rVarI8, (fz.c) objQ3);
                    w2.q0 q0VarD8 = j0.o.d(z1.c.f58463a, false);
                    iHashCode4 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL112 = sVar4.l();
                    z1.r rVarC112 = z1.a.c(sVar4, rVarD8);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(hVar3, q0VarD8, sVar4);
                    l1.t.J(hVar4, q1VarL112, sVar4);
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                    } else {
                        defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar5);
                    }
                    l1.t.J(hVar7, rVarC112, sVar4);
                    if (courseSentence == null) {
                        sVar4.d0(1221946183);
                        z11 = false;
                        sVar4.p(false);
                        b0Var = null;
                    } else {
                        sVar4.d0(1221946184);
                        dt.d4.a(courseSentence.getDisplayCourseWords(), null, null, false, false, j3.y0.a((j3.y0) sVar4.j(d0Var), j13, ct.c.c(sVar4), sVar, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), bVar, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar4, 1575936, 0, 0, 4194198);
                        z11 = false;
                        sVar4.p(false);
                        b0Var = b0Var2;
                    }
                    if (b0Var == null) {
                        sVar4.d0(-791846557);
                        j0.c.g(sVar4, j0.e2.e(oVar3, 0.7f));
                        sVar4.p(z11);
                    } else {
                        sVar4.d0(-791866893);
                        sVar4.p(z11);
                    }
                    com.google.android.material.datepicker.d.B(sVar4, true, true, true);
                } else {
                    sVar4.W();
                }
                return b0Var2;
            case 3:
                String str = (String) obj8;
                ht.o oVar4 = (ht.o) obj7;
                l1.b1 b1Var10 = (l1.b1) obj6;
                l1.i1 i1Var = (l1.i1) obj5;
                fz.e eVar2 = (fz.e) obj4;
                CourseWord courseWord = (CourseWord) obj3;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar3;
                if (sVar5.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    j0.a2 a2VarA12 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                    int iHashCode7 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL20 = sVar5.l();
                    z1.r rVarC20 = z1.a.c(sVar5, oVar);
                    y2.k.J.getClass();
                    y2.i iVar5 = y2.j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar5);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA12, sVar5);
                    l1.t.J(y2.j.f56916e, q1VarL20, sVar5);
                    y2.h hVar8 = y2.j.f56918g;
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode7))) {
                        defpackage.e.A(iHashCode7, sVar5, iHashCode7, hVar8);
                    }
                    l1.t.J(y2.j.f56915d, rVarC20, sVar5);
                    dt.a0.q(str, oVar4.f33764l, sVar5, 0, 0);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    w4.c.r(1.0f, true, sVar5);
                    if (oVar4.f33770s != ht.r.M5 || oVar4.f33762j) {
                        sVar5.d0(1685980904);
                        boolean z20 = b1Var10.getValue() instanceof ht.c;
                        long j21 = ((h1.s1) sVar5.j(h1.v1.f31180a)).f31017a;
                        boolean zF4 = sVar5.f(oVar4) | sVar5.f(i1Var) | sVar5.f(eVar2) | sVar5.h(courseWord);
                        Object objQ6 = sVar5.Q();
                        if (zF4 || objQ6 == gVar2) {
                            objQ6 = new l7(courseWord, oVar4, i1Var, eVar2, 1);
                            sVar5.o0(objQ6);
                        }
                        dt.a0.a(z20, null, j21, (fz.a) objQ6, sVar5, 0, 2);
                    } else {
                        sVar5.d0(1671907400);
                    }
                    sVar5.p(false);
                    sVar5.p(true);
                } else {
                    sVar5.W();
                }
                return b0Var2;
            case 4:
                ((Integer) obj2).getClass();
                ch.a.a((l1.b1) obj8, (l1.b1) obj7, (mu.x) obj6, (fz.a) obj4, (fz.a) obj3, (fz.a) obj5, (l1.n) obj, l1.t.M(3127));
                return b0Var2;
            case 5:
                return a(obj, obj2);
            case 6:
                ((Integer) obj2).getClass();
                et.a.g((List) obj8, (CoursePracticeType) obj7, (qa) obj6, (fz.c) obj5, (fz.c) obj3, (fz.a) obj4, (l1.n) obj, l1.t.M(24577));
                return b0Var2;
            case 7:
                ((Integer) obj2).getClass();
                iv.a.l((iv.f0) obj8, (fz.a) obj4, (fz.a) obj3, (fz.a) obj7, (fz.e) obj6, (fz.c) obj5, (l1.n) obj, l1.t.M(1));
                return b0Var2;
            case 8:
                fz.c cVar = (fz.c) obj8;
                kr.h0 h0Var = (kr.h0) obj7;
                l1.b1 b1Var11 = (l1.b1) obj6;
                l1.b1 b1Var12 = (l1.b1) obj5;
                l1.b1 b1Var13 = (l1.b1) obj4;
                l1.b1 b1Var14 = (l1.b1) obj3;
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar4;
                if (sVar6.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zF5 = sVar6.f(cVar) | sVar6.f(h0Var);
                    Object objQ7 = sVar6.Q();
                    if (zF5 || objQ7 == gVar2) {
                        bt.c2 c2Var = new bt.c2(cVar, h0Var, b1Var11, b1Var12, b1Var13, b1Var14);
                        sVar6.o0(c2Var);
                        objQ7 = c2Var;
                    }
                    k7.m((fz.a) objQ7, null, false, null, null, null, jr.a.f36556a, sVar6, 805306368, 510);
                } else {
                    sVar6.W();
                }
                return b0Var2;
            case 9:
                ((Integer) obj2).getClass();
                mt.j4.b((rt.e3) obj8, (l9) obj7, (fz.a) obj4, (fz.c) obj6, (fz.a) obj3, (fz.c) obj5, (l1.n) obj, l1.t.M(1));
                return b0Var2;
            case 10:
                ((Integer) obj2).getClass();
                nh.a.b((List) obj8, (List) obj7, (List) obj6, (List) obj5, (fz.e) obj3, (fz.a) obj4, (l1.n) obj, l1.t.M(196609));
                return b0Var2;
            case 11:
                ((Integer) obj2).getClass();
                nh.d.d((mh.b) obj8, (o9.b) obj7, (fz.c) obj6, (fz.c) obj5, (fz.c) obj4, (z1.r) obj3, (l1.n) obj, l1.t.M(65));
                return b0Var2;
            case 12:
                ((Integer) obj2).getClass();
                qu.b.b((tu.h) obj8, (mu.l) obj7, (fz.c) obj6, (fz.a) obj4, (fz.a) obj3, (fz.a) obj5, (l1.n) obj, l1.t.M(1));
                return b0Var2;
            case 13:
                ((Integer) obj2).getClass();
                int i18 = THAISyllableIntroductionActivity.M;
                ((THAISyllableIntroductionActivity) obj3).v((String) obj8, (String) obj7, (String) obj6, (String) obj5, (fz.a) obj4, (l1.n) obj, l1.t.M(55));
                return b0Var2;
            case 14:
                return c(obj, obj2);
            case 15:
                ((Integer) obj2).getClass();
                xu.c.g((zu.t) obj8, (fz.c) obj7, (fz.c) obj6, (fz.c) obj5, (fz.c) obj4, (fz.c) obj3, (l1.n) obj, l1.t.M(1));
                return b0Var2;
            default:
                final dd ddVar = (dd) obj8;
                final l9 l9Var = (l9) obj7;
                final fz.c cVar2 = (fz.c) obj6;
                final ys.q2 q2Var = (ys.q2) obj5;
                final fz.a aVar5 = (fz.a) obj4;
                final j9.v vVar = (j9.v) obj3;
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar5;
                if (sVar7.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    final l1.b1 b1VarO2 = l1.t.o(ddVar.D0, sVar7);
                    final l1.b1 b1VarO3 = l1.t.o(ddVar.f50719m0, sVar7);
                    final l1.b1 b1VarO4 = l1.t.o(l9Var.f50024d, sVar7);
                    l1.b1 b1VarO5 = l1.t.o(ddVar.f50716j0, sVar7);
                    Object objQ8 = sVar7.Q();
                    if (objQ8 == gVar2) {
                        objQ8 = l1.t.B(null);
                        sVar7.o0(objQ8);
                    }
                    l1.b1 b1Var15 = (l1.b1) objQ8;
                    Object objQ9 = sVar7.Q();
                    if (objQ9 == gVar2) {
                        objQ9 = l1.t.B(null);
                        sVar7.o0(objQ9);
                    }
                    l1.b1 b1Var16 = (l1.b1) objQ9;
                    Object objQ10 = sVar7.Q();
                    if (objQ10 == gVar2) {
                        objQ10 = l1.t.B(Boolean.FALSE);
                        sVar7.o0(objQ10);
                    }
                    l1.b1 b1Var17 = (l1.b1) objQ10;
                    Object objQ11 = sVar7.Q();
                    if (objQ11 == gVar2) {
                        objQ11 = l1.t.B(Boolean.FALSE);
                        sVar7.o0(objQ11);
                    }
                    final l1.b1 b1Var18 = (l1.b1) objQ11;
                    Object objQ12 = sVar7.Q();
                    if (objQ12 == gVar2) {
                        objQ12 = l1.t.B(Boolean.FALSE);
                        sVar7.o0(objQ12);
                    }
                    l1.b1 b1Var19 = (l1.b1) objQ12;
                    boolean zF6 = sVar7.f((ja) b1Var15.getValue());
                    Object objQ13 = sVar7.Q();
                    if (zF6 || objQ13 == gVar2) {
                        ja jaVar = (ja) b1Var15.getValue();
                        objQ13 = jaVar != null ? ddVar.y(jaVar) : null;
                        sVar7.o0(objQ13);
                    }
                    uz.g1 g1Var = (uz.g1) objQ13;
                    if (g1Var == null) {
                        sVar7.d0(850258976);
                        sVar7.p(false);
                        b1VarO = null;
                    } else {
                        sVar7.d0(165975041);
                        b1VarO = l1.t.o(g1Var, sVar7);
                        sVar7.p(false);
                    }
                    if (b1VarO == null) {
                        sVar7.d0(850280677);
                        Object objQ14 = sVar7.Q();
                        if (objQ14 == gVar2) {
                            objQ14 = l1.t.B(ry.r.f50854a);
                            sVar7.o0(objQ14);
                        }
                        b1Var2 = (l1.b1) objQ14;
                        sVar7.p(false);
                    } else {
                        sVar7.d0(165968456);
                        sVar7.p(false);
                        b1Var2 = b1VarO;
                    }
                    ja jaVar2 = (ja) b1Var15.getValue();
                    List list = (List) b1Var2.getValue();
                    rt.p pVar = (rt.p) b1VarO5.getValue();
                    boolean zBooleanValue = ((Boolean) b1Var19.getValue()).booleanValue();
                    boolean zH2 = sVar7.h(ddVar);
                    Object objQ15 = sVar7.Q();
                    if (zH2 || objQ15 == gVar2) {
                        objQ15 = new d0.m0(2, ddVar, dd.class, "createFolder", "createFolder(Lcom/lingodeer/course/viewmodels/CourseTestBookmarkTarget;Ljava/lang/String;)V", 0, 18);
                        sVar7.o0(objQ15);
                    }
                    fz.e eVar3 = (fz.e) ((mz.e) objQ15);
                    boolean zH3 = sVar7.h(ddVar);
                    Object objQ16 = sVar7.Q();
                    if (zH3 || objQ16 == gVar2) {
                        objQ16 = new d0.m0(2, ddVar, dd.class, "addBookmarkToFolder", "addBookmarkToFolder(Lcom/lingodeer/course/viewmodels/CourseTestBookmarkTarget;Ljava/lang/String;)V", 0, 19);
                        sVar7.o0(objQ16);
                    }
                    fz.e eVar4 = (fz.e) ((mz.e) objQ16);
                    Object objQ17 = sVar7.Q();
                    if (objQ17 == gVar2) {
                        objQ17 = new ch.h0(b1Var15, b1Var19, 15);
                        sVar7.o0(objQ17);
                    }
                    fz.a aVar6 = (fz.a) objQ17;
                    Object objQ18 = sVar7.Q();
                    if (objQ18 == gVar2) {
                        objQ18 = new i2(b1Var16, b1Var17, 26);
                        sVar7.o0(objQ18);
                    }
                    fz.c cVar3 = (fz.c) objQ18;
                    boolean zH4 = sVar7.h(ddVar);
                    Object objQ19 = sVar7.Q();
                    if (zH4 || objQ19 == gVar2) {
                        objQ19 = new mt.j5(0, ddVar, dd.class, "clearBookmarkFolderOperationResult", "clearBookmarkFolderOperationResult()V", 0, 12);
                        sVar7.o0(objQ19);
                    }
                    mt.g.i(jaVar2, list, pVar, zBooleanValue, null, eVar3, eVar4, aVar6, cVar3, (fz.a) ((mz.e) objQ19), sVar7, 113246208, 16);
                    if (((Boolean) b1Var17.getValue()).booleanValue()) {
                        sVar7.d0(851299089);
                        ja jaVar3 = (ja) b1Var16.getValue();
                        Object objQ20 = sVar7.Q();
                        if (objQ20 == gVar2) {
                            objQ20 = new fu.y(b1Var17, b1Var16, dVar, 9);
                            sVar7.o0(objQ20);
                        }
                        l1.t.f((fz.e) objQ20, jaVar3, sVar7);
                        z12 = false;
                    } else {
                        z12 = false;
                        sVar7.d0(843123025);
                    }
                    sVar7.p(z12);
                    Object objQ21 = sVar7.Q();
                    if (objQ21 == gVar2) {
                        b1Var4 = b1Var16;
                        b1Var5 = b1Var15;
                        objQ21 = new mt.i3(7, b1Var4, b1Var17, b1Var5, b1Var19);
                        b1Var3 = b1Var17;
                        sVar7.o0(objQ21);
                    } else {
                        b1Var3 = b1Var17;
                        b1Var4 = b1Var16;
                        b1Var5 = b1Var15;
                    }
                    final fz.a aVar7 = (fz.a) objQ21;
                    boolean zBooleanValue2 = ((Boolean) b1Var3.getValue()).booleanValue();
                    Object objQ22 = sVar7.Q();
                    if (objQ22 == gVar2) {
                        objQ22 = new xu.v(11, b1Var18);
                        sVar7.o0(objQ22);
                    }
                    dt.c1 c1Var = new dt.c1(zBooleanValue2, aVar7, (fz.c) objQ22);
                    Object objQ23 = sVar7.Q();
                    if (objQ23 == gVar2) {
                        objQ23 = l1.t.B(Boolean.FALSE);
                        sVar7.o0(objQ23);
                    }
                    final l1.b1 b1Var20 = (l1.b1) objQ23;
                    Object objQ24 = sVar7.Q();
                    if (objQ24 == gVar2) {
                        objQ24 = l1.t.B(Boolean.FALSE);
                        sVar7.o0(objQ24);
                    }
                    final l1.b1 b1Var21 = (l1.b1) objQ24;
                    if (((Boolean) b1Var20.getValue()).booleanValue()) {
                        sVar7.d0(852527588);
                        if (((Boolean) b1Var21.getValue()).booleanValue()) {
                            i15 = 852565749;
                            i16 = R.string.skip_speaking_title;
                            z14 = false;
                        } else {
                            z14 = false;
                            i15 = 852662996;
                            i16 = R.string.skip_listening_title;
                        }
                        String strM = ep.a.m(sVar7, i15, i16, sVar7, z14);
                        Object objQ25 = sVar7.Q();
                        if (objQ25 == gVar2) {
                            objQ25 = new ys.d1(18, b1Var20);
                            sVar7.o0(objQ25);
                        }
                        fz.a aVar8 = (fz.a) objQ25;
                        boolean zH5 = sVar7.h(ddVar);
                        Object objQ26 = sVar7.Q();
                        if (zH5 || objQ26 == gVar2) {
                            objQ26 = new sc(ddVar, 2);
                            sVar7.o0(objQ26);
                        }
                        ys.p2.b(strM, aVar8, (fz.a) objQ26, sVar7, 48);
                        z13 = false;
                    } else {
                        z13 = false;
                        sVar7.d0(843123025);
                    }
                    sVar7.p(z13);
                    final l1.b1 b1Var22 = b1Var4;
                    final l1.b1 b1Var23 = b1Var5;
                    l1.t.b(new l1.w1[]{ys.e.f57981a.a(cVar2), ys.w.f58298a.a(new ys.v(q2Var.f58223a, q2Var.f58224b)), dt.v2.f24278d.a(c1Var)}, t1.e.d(-221123791, new fz.e() { // from class: ys.n2
                        /* JADX WARN: Code duplicated, block: B:13:0x003b  */
                        @Override // fz.e
                        public final Object invoke(Object obj9, Object obj10) {
                            ot.j1 j1Var;
                            CourseQuestionPreferenceContext courseQuestionPreferenceContextY;
                            qs.b bVarX;
                            l1.b1 b1Var24;
                            boolean z21;
                            l1.n nVar6 = (l1.n) obj9;
                            int iIntValue6 = ((Integer) obj10).intValue();
                            l1.s sVar8 = (l1.s) nVar6;
                            if (sVar8.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                l1.b3 b3Var = b1VarO2;
                                rc rcVar = (rc) b3Var.getValue();
                                l1.b3 b3Var2 = b1VarO4;
                                h9 h9Var = (h9) b3Var2.getValue();
                                qc qcVar = rcVar instanceof qc ? (qc) rcVar : null;
                                if (qcVar != null) {
                                    g9 g9Var = h9Var instanceof g9 ? (g9) h9Var : null;
                                    if (g9Var == null || (j1Var = qcVar.f50301a) == null || (courseQuestionPreferenceContextY = vc.a.y(g9Var.f49786a, j1Var)) == null) {
                                        bVarX = null;
                                    } else {
                                        Collection collectionValues = g9Var.f49788c.values();
                                        z8 z8Var = g9Var.f49787b;
                                        bVarX = vc.a.x(courseQuestionPreferenceContextY, j1Var, collectionValues, z8Var.f50785d, z8Var.f50792k, z8Var.f50782a);
                                    }
                                } else {
                                    bVarX = null;
                                }
                                z1.r rVarD9 = j0.e2.d(z1.o.f58481a, 1.0f);
                                w2.q0 q0VarD9 = j0.o.d(z1.c.f58463a, false);
                                int iHashCode8 = Long.hashCode(sVar8.T);
                                l1.q1 q1VarL21 = sVar8.l();
                                z1.r rVarC21 = z1.a.c(sVar8, rVarD9);
                                y2.k.J.getClass();
                                y2.i iVar6 = y2.j.f56913b;
                                sVar8.h0();
                                if (sVar8.S) {
                                    sVar8.k(iVar6);
                                } else {
                                    sVar8.r0();
                                }
                                l1.t.J(y2.j.f56917f, q0VarD9, sVar8);
                                l1.t.J(y2.j.f56916e, q1VarL21, sVar8);
                                y2.h hVar9 = y2.j.f56918g;
                                if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode8))) {
                                    defpackage.e.A(iHashCode8, sVar8, iHashCode8, hVar9);
                                }
                                l1.t.J(y2.j.f56915d, rVarC21, sVar8);
                                rc rcVar2 = (rc) b3Var.getValue();
                                gc gcVar = (gc) b1VarO3.getValue();
                                h9 h9Var2 = (h9) b3Var2.getValue();
                                final q2 q2Var2 = q2Var;
                                CoursePracticeType coursePracticeType = q2Var2.f58225c;
                                long j22 = q2Var2.f58224b;
                                final dd ddVar2 = ddVar;
                                boolean zH6 = sVar8.h(ddVar2);
                                Object objQ27 = sVar8.Q();
                                l1.g gVar3 = l1.m.f39353a;
                                if (zH6 || objQ27 == gVar3) {
                                    objQ27 = new bd(ddVar2, 2);
                                    sVar8.o0(objQ27);
                                }
                                fz.c cVar4 = (fz.c) objQ27;
                                boolean zH7 = sVar8.h(ddVar2);
                                Object objQ28 = sVar8.Q();
                                if (zH7 || objQ28 == gVar3) {
                                    objQ28 = new i2(ddVar2, 3);
                                    sVar8.o0(objQ28);
                                }
                                fz.e eVar5 = (fz.e) objQ28;
                                boolean zH8 = sVar8.h(ddVar2);
                                Object objQ29 = sVar8.Q();
                                l1.b1 b1Var25 = b1Var3;
                                l1.b1 b1Var26 = b1Var22;
                                l1.b1 b1Var27 = b1Var23;
                                if (zH8 || objQ29 == gVar3) {
                                    b1Var24 = b1Var27;
                                    xu.q qVar5 = new xu.q(ddVar2, b1Var25, b1Var26, b1Var24, 2);
                                    sVar8.o0(qVar5);
                                    objQ29 = qVar5;
                                } else {
                                    b1Var24 = b1Var27;
                                }
                                fz.c cVar5 = (fz.c) objQ29;
                                boolean zH9 = sVar8.h(ddVar2);
                                Object objQ30 = sVar8.Q();
                                if (zH9 || objQ30 == gVar3) {
                                    objQ30 = new br.j(ddVar2, b1Var25, b1Var26, b1Var24, 23);
                                    sVar8.o0(objQ30);
                                }
                                fz.f fVar = (fz.f) objQ30;
                                boolean zH10 = sVar8.h(ddVar2);
                                Object objQ31 = sVar8.Q();
                                if (zH10 || objQ31 == gVar3) {
                                    objQ31 = new bd(ddVar2, 3);
                                    sVar8.o0(objQ31);
                                }
                                fz.c cVar6 = (fz.c) objQ31;
                                boolean zH11 = sVar8.h(ddVar2);
                                Object objQ32 = sVar8.Q();
                                if (zH11 || objQ32 == gVar3) {
                                    objQ32 = new i2(ddVar2, 0);
                                    sVar8.o0(objQ32);
                                }
                                fz.e eVar6 = (fz.e) objQ32;
                                l9 l9Var2 = l9Var;
                                boolean zH12 = sVar8.h(l9Var2);
                                Object objQ33 = sVar8.Q();
                                if (zH12 || objQ33 == gVar3) {
                                    objQ33 = new fs.b(l9Var2, 7);
                                    sVar8.o0(objQ33);
                                }
                                fz.c cVar7 = (fz.c) objQ33;
                                boolean zH13 = sVar8.h(l9Var2);
                                Object objQ34 = sVar8.Q();
                                if (zH13 || objQ34 == gVar3) {
                                    objQ34 = new g2(l9Var2, 1);
                                    sVar8.o0(objQ34);
                                }
                                fz.e eVar7 = (fz.e) objQ34;
                                boolean zH14 = sVar8.h(l9Var2);
                                Object objQ35 = sVar8.Q();
                                if (zH14 || objQ35 == gVar3) {
                                    objQ35 = new fs.b(l9Var2, 8);
                                    sVar8.o0(objQ35);
                                }
                                fz.c cVar8 = (fz.c) objQ35;
                                boolean zH15 = sVar8.h(ddVar2) | sVar8.h(q2Var2);
                                Object objQ36 = sVar8.Q();
                                if (zH15 || objQ36 == gVar3) {
                                    final int i19 = 0;
                                    objQ36 = new fz.e() { // from class: ys.j2
                                        @Override // fz.e
                                        public final Object invoke(Object obj11, Object obj12) {
                                            switch (i19) {
                                                case 0:
                                                    ddVar2.t(new wb(q2Var2.f58224b, ((Boolean) obj11).booleanValue(), ((Boolean) obj12).booleanValue()));
                                                    break;
                                                case 1:
                                                    ht.o courseTestParams = (ht.o) obj11;
                                                    long jLongValue = ((Long) obj12).longValue();
                                                    kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
                                                    ddVar2.t(new ac(jLongValue, q2Var2.f58224b, (courseTestParams.f33759g || courseTestParams.f33758f) ? false : true));
                                                    break;
                                                default:
                                                    ht.o courseTestParams2 = (ht.o) obj11;
                                                    long jLongValue2 = ((Long) obj12).longValue();
                                                    kotlin.jvm.internal.m.f(courseTestParams2, "courseTestParams");
                                                    ddVar2.t(new bc(jLongValue2, q2Var2.f58224b, (courseTestParams2.f33759g || courseTestParams2.f33758f) ? false : true));
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar8.o0(objQ36);
                                }
                                fz.e eVar8 = (fz.e) objQ36;
                                boolean zH16 = sVar8.h(ddVar2) | sVar8.h(q2Var2);
                                Object objQ37 = sVar8.Q();
                                if (zH16 || objQ37 == gVar3) {
                                    final int i21 = 1;
                                    objQ37 = new fz.e() { // from class: ys.j2
                                        @Override // fz.e
                                        public final Object invoke(Object obj11, Object obj12) {
                                            switch (i21) {
                                                case 0:
                                                    ddVar2.t(new wb(q2Var2.f58224b, ((Boolean) obj11).booleanValue(), ((Boolean) obj12).booleanValue()));
                                                    break;
                                                case 1:
                                                    ht.o courseTestParams = (ht.o) obj11;
                                                    long jLongValue = ((Long) obj12).longValue();
                                                    kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
                                                    ddVar2.t(new ac(jLongValue, q2Var2.f58224b, (courseTestParams.f33759g || courseTestParams.f33758f) ? false : true));
                                                    break;
                                                default:
                                                    ht.o courseTestParams2 = (ht.o) obj11;
                                                    long jLongValue2 = ((Long) obj12).longValue();
                                                    kotlin.jvm.internal.m.f(courseTestParams2, "courseTestParams");
                                                    ddVar2.t(new bc(jLongValue2, q2Var2.f58224b, (courseTestParams2.f33759g || courseTestParams2.f33758f) ? false : true));
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar8.o0(objQ37);
                                }
                                fz.e eVar9 = (fz.e) objQ37;
                                boolean zH17 = sVar8.h(ddVar2) | sVar8.h(q2Var2);
                                Object objQ38 = sVar8.Q();
                                if (zH17 || objQ38 == gVar3) {
                                    final int i22 = 2;
                                    objQ38 = new fz.e() { // from class: ys.j2
                                        @Override // fz.e
                                        public final Object invoke(Object obj11, Object obj12) {
                                            switch (i22) {
                                                case 0:
                                                    ddVar2.t(new wb(q2Var2.f58224b, ((Boolean) obj11).booleanValue(), ((Boolean) obj12).booleanValue()));
                                                    break;
                                                case 1:
                                                    ht.o courseTestParams = (ht.o) obj11;
                                                    long jLongValue = ((Long) obj12).longValue();
                                                    kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
                                                    ddVar2.t(new ac(jLongValue, q2Var2.f58224b, (courseTestParams.f33759g || courseTestParams.f33758f) ? false : true));
                                                    break;
                                                default:
                                                    ht.o courseTestParams2 = (ht.o) obj11;
                                                    long jLongValue2 = ((Long) obj12).longValue();
                                                    kotlin.jvm.internal.m.f(courseTestParams2, "courseTestParams");
                                                    ddVar2.t(new bc(jLongValue2, q2Var2.f58224b, (courseTestParams2.f33759g || courseTestParams2.f33758f) ? false : true));
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar8.o0(objQ38);
                                }
                                fz.e eVar10 = (fz.e) objQ38;
                                boolean zH18 = sVar8.h(ddVar2);
                                Object objQ39 = sVar8.Q();
                                if (zH18 || objQ39 == gVar3) {
                                    objQ39 = new sc(ddVar2, 1);
                                    sVar8.o0(objQ39);
                                }
                                fz.a aVar9 = (fz.a) objQ39;
                                boolean zH19 = sVar8.h(ddVar2);
                                Object objQ40 = sVar8.Q();
                                if (zH19 || objQ40 == gVar3) {
                                    objQ40 = new x0.j(ddVar2, b1Var21, b1Var20, 5);
                                    sVar8.o0(objQ40);
                                }
                                fz.c cVar9 = (fz.c) objQ40;
                                boolean zH20 = sVar8.h(l9Var2);
                                Object objQ41 = sVar8.Q();
                                if (zH20 || objQ41 == gVar3) {
                                    objQ41 = new g4(l9Var2, 3);
                                    sVar8.o0(objQ41);
                                }
                                fz.a aVar10 = (fz.a) objQ41;
                                boolean zH21 = sVar8.h(ddVar2);
                                fz.a aVar11 = aVar5;
                                boolean zF7 = zH21 | sVar8.f(aVar11);
                                Object objQ42 = sVar8.Q();
                                if (zF7 || objQ42 == gVar3) {
                                    objQ42 = new pv.c(28, ddVar2, aVar11);
                                    sVar8.o0(objQ42);
                                }
                                fz.a aVar12 = (fz.a) objQ42;
                                j9.v vVar2 = vVar;
                                boolean zH22 = sVar8.h(vVar2);
                                Object objQ43 = sVar8.Q();
                                if (zH22 || objQ43 == gVar3) {
                                    objQ43 = new j9.g(vVar2, 26);
                                    sVar8.o0(objQ43);
                                }
                                p2.d(rcVar2, gcVar, h9Var2, bVarX, coursePracticeType, j22, cVar4, eVar5, cVar5, fVar, cVar6, eVar6, cVar7, eVar7, cVar8, eVar8, eVar9, eVar10, aVar9, cVar9, aVar10, aVar12, (fz.a) objQ43, cVar2, sVar8, 0);
                                if (!((Boolean) b1Var25.getValue()).booleanValue() || ((Boolean) b1Var18.getValue()).booleanValue()) {
                                    z21 = false;
                                    sVar8.d0(-943747977);
                                } else {
                                    sVar8.d0(-925074693);
                                    mt.g.a(54, aVar7, sVar8, null);
                                    z21 = false;
                                }
                                sVar8.p(z21);
                                sVar8.p(true);
                            } else {
                                sVar8.W();
                            }
                            return qy.b0.f48488a;
                        }
                    }, sVar7), sVar7, 56);
                } else {
                    sVar7.W();
                }
                return b0Var2;
        }
    }

    public /* synthetic */ f0(iv.f0 f0Var, fz.a aVar, fz.a aVar2, fz.a aVar3, fz.e eVar, fz.c cVar, int i11) {
        this.f4560a = 7;
        this.f4561b = f0Var;
        this.f4565f = aVar;
        this.f4566t = aVar2;
        this.f4562c = aVar3;
        this.f4563d = eVar;
        this.f4564e = cVar;
    }

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, fz.a aVar, fz.a aVar2, fz.a aVar3, int i11, int i12) {
        this.f4560a = i12;
        this.f4561b = obj;
        this.f4562c = obj2;
        this.f4563d = obj3;
        this.f4565f = aVar;
        this.f4566t = aVar2;
        this.f4564e = aVar3;
    }

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.f4560a = i11;
        this.f4561b = obj;
        this.f4562c = obj2;
        this.f4563d = obj3;
        this.f4564e = obj4;
        this.f4565f = obj5;
        this.f4566t = obj6;
    }

    public /* synthetic */ f0(Object obj, Object obj2, Object obj3, Object obj4, qy.e eVar, Object obj5, int i11, int i12) {
        this.f4560a = i12;
        this.f4561b = obj;
        this.f4562c = obj2;
        this.f4563d = obj3;
        this.f4564e = obj4;
        this.f4565f = eVar;
        this.f4566t = obj5;
    }

    public /* synthetic */ f0(List list, Object obj, Object obj2, Object obj3, qy.e eVar, fz.a aVar, int i11, int i12) {
        this.f4560a = i12;
        this.f4561b = list;
        this.f4562c = obj;
        this.f4563d = obj2;
        this.f4564e = obj3;
        this.f4566t = eVar;
        this.f4565f = aVar;
    }

    public /* synthetic */ f0(rt.e3 e3Var, l9 l9Var, fz.a aVar, fz.c cVar, fz.a aVar2, fz.c cVar2, int i11) {
        this.f4560a = 9;
        this.f4561b = e3Var;
        this.f4562c = l9Var;
        this.f4565f = aVar;
        this.f4563d = cVar;
        this.f4566t = aVar2;
        this.f4564e = cVar2;
    }
}
