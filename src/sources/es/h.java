package es;

import android.content.Context;
import b0.k0;
import bp.h0;
import com.lingo.lingoskill.idnskill.ui.learn.IDNSyllableIntroductionActivity;
import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import com.lingo.lingoskill.thaiskill.ui.learn.THAISyllableIntroductionActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseACK;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.LessonState;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.d4;
import fr.j3;
import g2.f0;
import h1.dc;
import h1.fa;
import h1.fc;
import h1.ha;
import h1.k7;
import h1.la;
import h1.qa;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.c2;
import j0.e1;
import j0.e2;
import j0.i1;
import j0.t1;
import j0.u;
import j0.v;
import j0.z1;
import j3.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import js.a0;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.b3;
import l1.c3;
import l1.d0;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import m0.l;
import mt.q;
import mt.z;
import nv.p;
import oz.x;
import qp.n2;
import rt.ke;
import rt.oe;
import rt.ue;
import rt.x0;
import rt.x8;
import rz.b0;
import s0.r0;
import w2.q0;
import y2.k;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25819f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f25820t;

    public /* synthetic */ h(CourseACK courseACK, b0 b0Var, j2.c cVar, Context context, fz.e eVar, fz.a aVar) {
        this.f25814a = 4;
        this.f25815b = courseACK;
        this.f25817d = b0Var;
        this.f25818e = cVar;
        this.f25816c = context;
        this.f25819f = eVar;
        this.f25820t = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v26 */
    private final Object a(Object obj, Object obj2, Object obj3) {
        Object k0Var;
        float f5;
        ?? r13;
        ?? r14;
        boolean z11;
        boolean z12;
        CourseACK courseACK = (CourseACK) this.f25815b;
        b0 b0Var = (b0) this.f25817d;
        j2.c cVar = (j2.c) this.f25818e;
        Context context = (Context) this.f25816c;
        fz.e eVar = (fz.e) this.f25819f;
        fz.a aVar = (fz.a) this.f25820t;
        v Card = (v) obj;
        n nVar = (n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        m.f(Card, "$this$Card");
        s sVar = (s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            o oVar = o.f58481a;
            r rVarD = e2.d(oVar, 1.0f);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarD);
            k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            t.J(hVar4, rVarC, sVar);
            float f11 = 16;
            r rVarY = d0.n.y(j0.c.A(oVar, f11), d0.n.u(sVar), true, 12);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, rVarY);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, uVarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            r rVarC3 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            t.J(hVar4, rVarC3, sVar);
            ua.b(courseACK.getUnitName(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(18), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 0, 0, 65534);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.c.g(sVar, new i1(1.0f, true));
            boolean zH = sVar.h(b0Var) | sVar.h(cVar) | sVar.h(context) | sVar.h(courseACK);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                f5 = 1.0f;
                k0Var = new k0(b0Var, cVar, context, courseACK, 12);
                sVar.o0(k0Var);
            } else {
                f5 = 1.0f;
                k0Var = objQ;
            }
            k7.h((fz.a) k0Var, null, false, null, mt.g.f41433i, sVar, 196608, 30);
            boolean zF = sVar.f(eVar) | sVar.h(courseACK);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = new l1.z1(4, eVar, courseACK);
                sVar.o0(objQ2);
            }
            k7.h((fz.a) objQ2, null, false, null, t1.e.d(-1890171029, new ch.b0(courseACK, 27), sVar), sVar, 196608, 30);
            sVar.p(true);
            j0.c.g(sVar, e2.g(oVar, f11));
            String grammarACK = courseACK.getGrammarACK();
            c3 c3Var = fc.f30256a;
            y0 y0Var = ((dc) sVar.j(c3Var)).f30172e;
            c3 c3Var2 = v1.f31180a;
            ua.b(grammarACK, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, ((s1) sVar.j(c3Var2)).f31017a, j3.A(22), n3.s.N, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65534);
            if (courseACK.getTranslation().length() > 0) {
                sVar.d0(-350813579);
                ua.b(courseACK.getTranslation(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(((dc) sVar.j(c3Var)).f30173f, ((s1) sVar.j(c3Var2)).f31017a, j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 0, 0, 65534);
                r13 = 0;
            } else {
                r13 = 0;
                sVar.d0(-366015793);
            }
            sVar.p(r13);
            float f12 = 8;
            j0.c.g(sVar, e2.g(oVar, f12));
            mt.g.q(r13, courseACK.getExplanation(), sVar, null);
            j0.c.g(sVar, e2.g(oVar, f11));
            if (courseACK.getExampleSentences().isEmpty()) {
                r14 = 0;
                sVar.d0(-366015793);
            } else {
                sVar.d0(-350254370);
                ua.b("For example:", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 6, 0, 131070);
                for (CourseSentence courseSentence : courseACK.getExampleSentences()) {
                    j0.c.g(sVar, e2.g(oVar, f11));
                    d4.a(courseSentence.getDisplayCourseWords(), null, null, false, false, y0.a((y0) sVar.j(ua.f31167a), ((s1) sVar.j(v1.f31180a)).f31017a, j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), j0.i.f35303a, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar, 1572864, 0, 0, 4194206);
                    j0.c.g(sVar, e2.g(oVar, f12));
                    ua.b(courseSentence.getTranslation(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131070);
                }
                r14 = 0;
            }
            sVar.p(r14);
            ep.a.C(oVar, 72, sVar, true);
            k2.b bVarY = se.k.y(R.drawable.bg_ack_btm, sVar, r14);
            r rVarE = e2.e(oVar, f5);
            z1.j jVar = z1.c.H;
            j0.r rVar = j0.r.f35391a;
            d0.n.c(bVarY, null, rVar.a(rVarE, jVar), null, w2.i.f54517d, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 24624, 104);
            if (courseACK.getCanAccess()) {
                z11 = true;
                z12 = false;
                sVar.d0(-235490843);
            } else {
                sVar.d0(-218578421);
                r rVarD2 = e2.d(oVar, f5);
                q0 q0VarD2 = j0.o.d(jVar, false);
                int iHashCode4 = Long.hashCode(sVar.T);
                q1 q1VarL4 = sVar.l();
                r rVarC4 = z1.a.c(sVar, rVarD2);
                k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                t.J(y2.j.f56917f, q0VarD2, sVar);
                t.J(y2.j.f56916e, q1VarL4, sVar);
                y2.h hVar5 = y2.j.f56918g;
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                    defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar5);
                }
                t.J(y2.j.f56915d, rVarC4, sVar);
                z12 = false;
                ys.j3.a(0, aVar, sVar, rVar.a(e2.c(e2.e(oVar, f5), 0.8f), jVar));
                z11 = true;
                sVar.p(true);
            }
            sVar.p(z12);
            sVar.p(z11);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:102:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:106:0x060d  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0147  */
    /* JADX WARN: Code duplicated, block: B:25:0x0157  */
    /* JADX WARN: Code duplicated, block: B:28:0x01db  */
    /* JADX WARN: Code duplicated, block: B:31:0x0212  */
    /* JADX WARN: Code duplicated, block: B:32:0x0216  */
    /* JADX WARN: Code duplicated, block: B:37:0x0231  */
    /* JADX WARN: Code duplicated, block: B:40:0x026e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0291  */
    /* JADX WARN: Code duplicated, block: B:45:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x033a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0390  */
    /* JADX WARN: Code duplicated, block: B:65:0x0394  */
    /* JADX WARN: Code duplicated, block: B:70:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x044f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0453  */
    /* JADX WARN: Code duplicated, block: B:79:0x046e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0495  */
    /* JADX WARN: Code duplicated, block: B:84:0x049b  */
    /* JADX WARN: Code duplicated, block: B:88:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:91:0x052a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0530  */
    /* JADX WARN: Code duplicated, block: B:97:0x057b  */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, java.util.List] */
    private final Object c(Object obj, Object obj2, Object obj3) {
        fz.a aVar;
        List list;
        List list2;
        String strQ0;
        Object objQ;
        int iHashCode;
        o oVar;
        s sVar;
        boolean z11;
        s sVar2;
        int iHashCode2;
        y2.i iVar;
        y2.h hVar;
        int iHashCode3;
        int i11;
        boolean zF;
        Object objQ2;
        int i12;
        boolean zF2;
        Object objQ3;
        int i13;
        fz.a aVar2;
        boolean zF3;
        Object objQ4;
        ArrayList arrayList;
        Iterator it;
        int i14;
        boolean z12;
        int i15;
        int i16;
        String strM;
        b1 b1Var = (b1) this.f25815b;
        x0 x0Var = (x0) this.f25816c;
        b1 b1Var2 = (b1) this.f25817d;
        fz.a aVar3 = (fz.a) this.f25818e;
        fz.a aVar4 = (fz.a) this.f25819f;
        fz.a aVar5 = (fz.a) this.f25820t;
        v Card = (v) obj;
        n nVar = (n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        z1.i iVar2 = z1.c.M;
        m.f(Card, "$this$Card");
        s sVar3 = (s) nVar;
        if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            float f5 = 70;
            o oVar2 = o.f58481a;
            r rVarE = e2.e(e2.i(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
            Object objQ5 = sVar3.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ5 == gVar) {
                objQ5 = new q(7, b1Var);
                sVar3.o0(objQ5);
            }
            r rVarO = d0.n.o(rVarE, false, null, (fz.a) objQ5, 15);
            float f11 = 16;
            r rVarC = j0.c.C(rVarO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.e eVar = j0.i.f35309g;
            a2 a2VarA = z1.a(eVar, iVar2, sVar3, 54);
            int iHashCode4 = Long.hashCode(sVar3.T);
            q1 q1VarL = sVar3.l();
            r rVarC2 = z1.a.c(sVar3, rVarC);
            k.J.getClass();
            y2.i iVar3 = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar3);
            } else {
                sVar3.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            t.J(hVar2, a2VarA, sVar3);
            y2.h hVar3 = y2.j.f56916e;
            t.J(hVar3, q1VarL, sVar3);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar3.S) {
                aVar = aVar5;
            } else {
                aVar = aVar5;
                if (!m.a(sVar3.Q(), Integer.valueOf(iHashCode4))) {
                }
                y2.h hVar5 = y2.j.f56915d;
                t.J(hVar5, rVarC2, sVar3);
                String strE0 = ub.a.e0(sVar3, R.string.unit_to_practice);
                n3.s sVar4 = n3.s.H;
                ua.b(strE0, null, 0L, 0L, null, sVar4, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 196608, 0, 131038);
                list = x0Var.f50602d;
                list2 = x0Var.f50603e;
                if (list.size() == x0Var.f50599a.size()) {
                    strQ0 = ep.a.m(sVar3, 546069730, R.string.all, sVar3, false);
                } else {
                    sVar3.d0(546075876);
                    strQ0 = x.q0(ub.a.e0(sVar3, R.string._s_units), "%s", String.valueOf(x0Var.f50602d.size()));
                    sVar3.p(false);
                }
                ua.b(strQ0, null, ((s1) sVar3.j(v1.f31180a)).f31017a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131066);
                sVar3.p(true);
                k7.g(j0.c.C(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar3, 6, 6);
                r rVarE2 = e2.e(e2.i(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
                objQ = sVar3.Q();
                if (objQ == gVar) {
                    objQ = new q(8, b1Var2);
                    sVar3.o0(objQ);
                }
                r rVarC3 = j0.c.C(d0.n.o(rVarE2, false, null, (fz.a) objQ, 15), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                a2 a2VarA2 = z1.a(eVar, iVar2, sVar3, 54);
                iHashCode = Long.hashCode(sVar3.T);
                q1 q1VarL2 = sVar3.l();
                r rVarC4 = z1.a.c(sVar3, rVarC3);
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar3);
                } else {
                    sVar3.r0();
                }
                t.J(hVar2, a2VarA2, sVar3);
                t.J(hVar3, q1VarL2, sVar3);
                if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar4);
                }
                t.J(hVar5, rVarC4, sVar3);
                ua.b(ub.a.e0(sVar3, R.string.practice_focused_on), null, 0L, 0L, null, sVar4, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 196608, 0, 131038);
                if (list2.isEmpty()) {
                    oVar = oVar2;
                    sVar = sVar3;
                    z11 = false;
                    sVar.d0(886566484);
                } else {
                    sVar3.d0(898096593);
                    sVar3.d0(-802311489);
                    arrayList = new ArrayList(ry.n.W(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        i14 = z.f42100a[((x8) it.next()).ordinal()];
                        if (i14 != 1) {
                            z12 = false;
                            i15 = 1215639909;
                            i16 = R.string.characters;
                        } else if (i14 != 2) {
                            if (i14 != 3) {
                                z12 = false;
                                i15 = 1215647172;
                                i16 = R.string.sentences;
                            } else {
                                if (i14 == 4) {
                                    throw p.x(sVar3, 1215637822, false);
                                }
                                sVar3.d0(-969525811);
                                sVar3.p(false);
                                strM = BuildConfig.VERSION_NAME;
                            }
                            arrayList.add(strM);
                        } else {
                            z12 = false;
                            i15 = 1215643552;
                            i16 = R.string.words;
                        }
                        strM = ep.a.m(sVar3, i15, i16, sVar3, z12);
                        arrayList.add(strM);
                    }
                    sVar3.p(false);
                    oVar = oVar2;
                    ua.b(ry.m.y0(arrayList, " ", null, null, null, 62), j0.c.E(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), ((s1) sVar3.j(v1.f31180a)).f31017a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131064);
                    sVar = sVar3;
                    z11 = false;
                }
                sVar.p(z11);
                sVar.p(true);
                sVar2 = sVar;
                k7.g(j0.c.C(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 6, 6);
                r rVarC5 = j0.c.C(e2.e(e2.i(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                a2 a2VarA3 = z1.a(j0.i.f35309g, iVar2, sVar2, 54);
                iHashCode2 = Long.hashCode(sVar2.T);
                q1 q1VarL3 = sVar2.l();
                r rVarC6 = z1.a.c(sVar2, rVarC5);
                k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                y2.h hVar6 = y2.j.f56917f;
                t.J(hVar6, a2VarA3, sVar2);
                y2.h hVar7 = y2.j.f56916e;
                t.J(hVar7, q1VarL3, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                }
                y2.h hVar8 = y2.j.f56915d;
                t.J(hVar8, rVarC6, sVar2);
                ua.b(ub.a.e0(sVar2, R.string.select_mastery_level), null, 0L, 0L, null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 196608, 0, 131038);
                sVar2.p(true);
                j0.c.g(sVar2, e2.g(oVar, f11));
                o oVar3 = oVar;
                mt.g.z(j0.c.j(e2.e(j0.c.E(oVar3, 0, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 10), 1.0f), 2.3093526f), sVar2, 0);
                r rVarC7 = j0.c.C(j0.c.C(j0.c.q(e2.e(oVar3, 1.0f), e1.Min), CropImageView.DEFAULT_ASPECT_RATIO, f11, 1), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                a2 a2VarA4 = z1.a(j0.i.g(6), iVar2, sVar2, 54);
                iHashCode3 = Long.hashCode(sVar2.T);
                q1 q1VarL4 = sVar2.l();
                r rVarC8 = z1.a.c(sVar2, rVarC7);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                t.J(hVar6, a2VarA4, sVar2);
                t.J(hVar7, q1VarL4, sVar2);
                if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar);
                }
                t.J(hVar8, rVarC8, sVar2);
                c2 c2Var = c2.f35266a;
                j0.c.g(sVar2, c2Var.a(oVar3, 0.35f));
                boolean z13 = x0Var.f50604f;
                int size = x0Var.f50607i.size();
                String strE1 = ub.a.e0(sVar2, R.string.srs_fading);
                if (x0Var.f50604f) {
                    i11 = R.drawable.srs_fading_checked;
                } else {
                    i11 = R.drawable.srs_fading_unchecked;
                }
                int i17 = i11;
                int size2 = x0Var.f50610l.size();
                List listL = ns.o.L(new g2.x(f0.e(4294921036L)), new g2.x(f0.e(4294921036L)));
                long jE = f0.e(4294921036L);
                r rVarA = c2Var.a(oVar3, 1.0f);
                zF = sVar2.f(aVar3);
                objQ2 = sVar2.Q();
                if (zF || objQ2 == gVar) {
                    objQ2 = new jr.m(20, aVar3);
                    sVar2.o0(objQ2);
                }
                mt.g.E(z13, size, size2, strE1, i17, listL, jE, rVarA, (fz.a) objQ2, sVar2, 14155824);
                float f12 = 50;
                k7.n(e2.g(j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f12), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 6, 6);
                boolean z14 = x0Var.f50605g;
                int size3 = x0Var.f50608j.size();
                String strE2 = ub.a.e0(sVar2, R.string.srs_reinforcing);
                if (x0Var.f50605g) {
                    i12 = R.drawable.srs_reinforcing_checked;
                } else {
                    i12 = R.drawable.srs_reinforcing_unchecked;
                }
                int i18 = i12;
                int size4 = x0Var.m.size();
                List listL2 = ns.o.L(new g2.x(f0.e(4294941597L)), new g2.x(f0.e(4285464478L)));
                long jE2 = f0.e(4285768278L);
                r rVarA2 = c2Var.a(oVar3, 2.0f);
                zF2 = sVar2.f(aVar4);
                objQ3 = sVar2.Q();
                if (zF2 || objQ3 == gVar) {
                    objQ3 = new jr.m(21, aVar4);
                    sVar2.o0(objQ3);
                }
                mt.g.E(z14, size3, size4, strE2, i18, listL2, jE2, rVarA2, (fz.a) objQ3, sVar2, 14155824);
                k7.n(e2.g(j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f12), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 6, 6);
                boolean z15 = x0Var.f50606h;
                int size5 = x0Var.f50609k.size();
                String strE3 = ub.a.e0(sVar2, R.string.srs_mastered);
                if (x0Var.f50606h) {
                    i13 = R.drawable.srs_mastered_checked;
                } else {
                    i13 = R.drawable.srs_mastered_unchecked;
                }
                int i19 = i13;
                int size6 = x0Var.f50611n.size();
                List listL3 = ns.o.L(new g2.x(f0.e(4279417706L)), new g2.x(f0.e(4279417706L)));
                long jE3 = f0.e(4279417706L);
                r rVarA3 = c2Var.a(oVar3, 1.0f);
                aVar2 = aVar;
                zF3 = sVar2.f(aVar2);
                objQ4 = sVar2.Q();
                if (zF3 || objQ4 == gVar) {
                    objQ4 = new jr.m(22, aVar2);
                    sVar2.o0(objQ4);
                }
                mt.g.E(z15, size5, size6, strE3, i19, listL3, jE3, rVarA3, (fz.a) objQ4, sVar2, 14155824);
                j0.c.g(sVar2, c2Var.a(oVar3, 0.15f));
                sVar2.p(true);
                j0.c.g(sVar2, e2.g(oVar3, 22));
            }
            defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar4);
            y2.h hVar9 = y2.j.f56915d;
            t.J(hVar9, rVarC2, sVar3);
            String strE4 = ub.a.e0(sVar3, R.string.unit_to_practice);
            n3.s sVar5 = n3.s.H;
            ua.b(strE4, null, 0L, 0L, null, sVar5, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 196608, 0, 131038);
            list = x0Var.f50602d;
            list2 = x0Var.f50603e;
            if (list.size() == x0Var.f50599a.size()) {
                strQ0 = ep.a.m(sVar3, 546069730, R.string.all, sVar3, false);
            } else {
                sVar3.d0(546075876);
                strQ0 = x.q0(ub.a.e0(sVar3, R.string._s_units), "%s", String.valueOf(x0Var.f50602d.size()));
                sVar3.p(false);
            }
            ua.b(strQ0, null, ((s1) sVar3.j(v1.f31180a)).f31017a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131066);
            sVar3.p(true);
            k7.g(j0.c.C(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar3, 6, 6);
            r rVarE3 = e2.e(e2.i(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
            objQ = sVar3.Q();
            if (objQ == gVar) {
                objQ = new q(8, b1Var2);
                sVar3.o0(objQ);
            }
            r rVarC9 = j0.c.C(d0.n.o(rVarE3, false, null, (fz.a) objQ, 15), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            a2 a2VarA5 = z1.a(eVar, iVar2, sVar3, 54);
            iHashCode = Long.hashCode(sVar3.T);
            q1 q1VarL5 = sVar3.l();
            r rVarC10 = z1.a.c(sVar3, rVarC9);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar3);
            } else {
                sVar3.r0();
            }
            t.J(hVar2, a2VarA5, sVar3);
            t.J(hVar3, q1VarL5, sVar3);
            if (sVar3.S) {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar4);
            } else {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar4);
            }
            t.J(hVar9, rVarC10, sVar3);
            ua.b(ub.a.e0(sVar3, R.string.practice_focused_on), null, 0L, 0L, null, sVar5, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 196608, 0, 131038);
            if (list2.isEmpty()) {
                sVar3.d0(898096593);
                sVar3.d0(-802311489);
                arrayList = new ArrayList(ry.n.W(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    i14 = z.f42100a[((x8) it.next()).ordinal()];
                    if (i14 != 1) {
                        z12 = false;
                        i15 = 1215639909;
                        i16 = R.string.characters;
                    } else if (i14 != 2) {
                        if (i14 != 3) {
                            z12 = false;
                            i15 = 1215647172;
                            i16 = R.string.sentences;
                        } else {
                            if (i14 == 4) {
                                throw p.x(sVar3, 1215637822, false);
                            }
                            sVar3.d0(-969525811);
                            sVar3.p(false);
                            strM = BuildConfig.VERSION_NAME;
                        }
                        arrayList.add(strM);
                    } else {
                        z12 = false;
                        i15 = 1215643552;
                        i16 = R.string.words;
                    }
                    strM = ep.a.m(sVar3, i15, i16, sVar3, z12);
                    arrayList.add(strM);
                }
                sVar3.p(false);
                oVar = oVar2;
                ua.b(ry.m.y0(arrayList, " ", null, null, null, 62), j0.c.E(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), ((s1) sVar3.j(v1.f31180a)).f31017a, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 48, 0, 131064);
                sVar = sVar3;
                z11 = false;
            } else {
                oVar = oVar2;
                sVar = sVar3;
                z11 = false;
                sVar.d0(886566484);
            }
            sVar.p(z11);
            sVar.p(true);
            sVar2 = sVar;
            k7.g(j0.c.C(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 6, 6);
            r rVarC11 = j0.c.C(e2.e(e2.i(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            a2 a2VarA6 = z1.a(j0.i.f35309g, iVar2, sVar2, 54);
            iHashCode2 = Long.hashCode(sVar2.T);
            q1 q1VarL6 = sVar2.l();
            r rVarC12 = z1.a.c(sVar2, rVarC11);
            k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar10 = y2.j.f56917f;
            t.J(hVar10, a2VarA6, sVar2);
            y2.h hVar11 = y2.j.f56916e;
            t.J(hVar11, q1VarL6, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
            } else {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
            }
            y2.h hVar12 = y2.j.f56915d;
            t.J(hVar12, rVarC12, sVar2);
            ua.b(ub.a.e0(sVar2, R.string.select_mastery_level), null, 0L, 0L, null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 196608, 0, 131038);
            sVar2.p(true);
            j0.c.g(sVar2, e2.g(oVar, f11));
            o oVar4 = oVar;
            mt.g.z(j0.c.j(e2.e(j0.c.E(oVar4, 0, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 10), 1.0f), 2.3093526f), sVar2, 0);
            r rVarC13 = j0.c.C(j0.c.C(j0.c.q(e2.e(oVar4, 1.0f), e1.Min), CropImageView.DEFAULT_ASPECT_RATIO, f11, 1), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            a2 a2VarA7 = z1.a(j0.i.g(6), iVar2, sVar2, 54);
            iHashCode3 = Long.hashCode(sVar2.T);
            q1 q1VarL7 = sVar2.l();
            r rVarC14 = z1.a.c(sVar2, rVarC13);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(hVar10, a2VarA7, sVar2);
            t.J(hVar11, q1VarL7, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar);
            } else {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar);
            }
            t.J(hVar12, rVarC14, sVar2);
            c2 c2Var2 = c2.f35266a;
            j0.c.g(sVar2, c2Var2.a(oVar4, 0.35f));
            boolean z16 = x0Var.f50604f;
            int size7 = x0Var.f50607i.size();
            String strE5 = ub.a.e0(sVar2, R.string.srs_fading);
            if (x0Var.f50604f) {
                i11 = R.drawable.srs_fading_checked;
            } else {
                i11 = R.drawable.srs_fading_unchecked;
            }
            int i110 = i11;
            int size8 = x0Var.f50610l.size();
            List listL4 = ns.o.L(new g2.x(f0.e(4294921036L)), new g2.x(f0.e(4294921036L)));
            long jE4 = f0.e(4294921036L);
            r rVarA4 = c2Var2.a(oVar4, 1.0f);
            zF = sVar2.f(aVar3);
            objQ2 = sVar2.Q();
            if (zF) {
                objQ2 = new jr.m(20, aVar3);
                sVar2.o0(objQ2);
            } else {
                objQ2 = new jr.m(20, aVar3);
                sVar2.o0(objQ2);
            }
            mt.g.E(z16, size7, size8, strE5, i110, listL4, jE4, rVarA4, (fz.a) objQ2, sVar2, 14155824);
            float f13 = 50;
            k7.n(e2.g(j0.c.E(oVar4, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f13), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 6, 6);
            boolean z17 = x0Var.f50605g;
            int size9 = x0Var.f50608j.size();
            String strE6 = ub.a.e0(sVar2, R.string.srs_reinforcing);
            if (x0Var.f50605g) {
                i12 = R.drawable.srs_reinforcing_checked;
            } else {
                i12 = R.drawable.srs_reinforcing_unchecked;
            }
            int i111 = i12;
            int size10 = x0Var.m.size();
            List listL5 = ns.o.L(new g2.x(f0.e(4294941597L)), new g2.x(f0.e(4285464478L)));
            long jE5 = f0.e(4285768278L);
            r rVarA5 = c2Var2.a(oVar4, 2.0f);
            zF2 = sVar2.f(aVar4);
            objQ3 = sVar2.Q();
            if (zF2) {
                objQ3 = new jr.m(21, aVar4);
                sVar2.o0(objQ3);
            } else {
                objQ3 = new jr.m(21, aVar4);
                sVar2.o0(objQ3);
            }
            mt.g.E(z17, size9, size10, strE6, i111, listL5, jE5, rVarA5, (fz.a) objQ3, sVar2, 14155824);
            k7.n(e2.g(j0.c.E(oVar4, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f13), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 6, 6);
            boolean z18 = x0Var.f50606h;
            int size11 = x0Var.f50609k.size();
            String strE7 = ub.a.e0(sVar2, R.string.srs_mastered);
            if (x0Var.f50606h) {
                i13 = R.drawable.srs_mastered_checked;
            } else {
                i13 = R.drawable.srs_mastered_unchecked;
            }
            int i112 = i13;
            int size12 = x0Var.f50611n.size();
            List listL6 = ns.o.L(new g2.x(f0.e(4279417706L)), new g2.x(f0.e(4279417706L)));
            long jE6 = f0.e(4279417706L);
            r rVarA6 = c2Var2.a(oVar4, 1.0f);
            aVar2 = aVar;
            zF3 = sVar2.f(aVar2);
            objQ4 = sVar2.Q();
            if (zF3) {
                objQ4 = new jr.m(22, aVar2);
                sVar2.o0(objQ4);
            } else {
                objQ4 = new jr.m(22, aVar2);
                sVar2.o0(objQ4);
            }
            mt.g.E(z18, size11, size12, strE7, i112, listL6, jE6, rVarA6, (fz.a) objQ4, sVar2, 14155824);
            j0.c.g(sVar2, c2Var2.a(oVar4, 0.15f));
            sVar2.p(true);
            j0.c.g(sVar2, e2.g(oVar4, 22));
        } else {
            sVar3.W();
        }
        return qy.b0.f48488a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        c2 c2Var;
        l1.g gVar;
        int i11;
        IDNSyllableIntroductionActivity iDNSyllableIntroductionActivity = (IDNSyllableIntroductionActivity) this.f25815b;
        List list = (List) this.f25816c;
        List list2 = (List) this.f25817d;
        List list3 = (List) this.f25818e;
        List list4 = (List) this.f25819f;
        wl.a aVar = (wl.a) this.f25820t;
        l item = (l) obj;
        n nVar = (n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i12 = IDNSyllableIntroductionActivity.P;
        z1.i iVar = z1.c.L;
        m.f(item, "$this$item");
        s sVar = (s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            o oVar = o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, uVarA, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            iDNSyllableIntroductionActivity.s("Consonant", sVar, 6);
            iDNSyllableIntroductionActivity.q("Indonesian consonants are also very easy to pronounce. Note that the letters Q, V, and X are rarely used, primarily appearing in loanwords.", sVar, 6);
            float f5 = 8;
            j0.c.g(sVar, e2.g(oVar, f5));
            sVar.d0(644796709);
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c2Var = c2.f35266a;
                gVar = l1.m.f39353a;
                if (!zHasNext) {
                    break;
                }
                List list5 = (List) it.next();
                a2 a2VarA = z1.a(j0.i.f35303a, iVar, sVar, 0);
                Iterator it2 = it;
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, oVar);
                k.J.getClass();
                IDNSyllableIntroductionActivity iDNSyllableIntroductionActivity2 = iDNSyllableIntroductionActivity;
                y2.i iVar3 = y2.j.f56913b;
                sVar.h0();
                float f11 = f5;
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                t.J(y2.j.f56917f, a2VarA, sVar);
                t.J(y2.j.f56916e, q1VarL2, sVar);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                }
                t.J(y2.j.f56915d, rVarC2, sVar);
                String str = (String) list5.get(0);
                float f12 = 72;
                r rVarG = e2.g(c2Var.a(oVar, 1.0f), f12);
                boolean zH = sVar.h(aVar);
                Object objQ = sVar.Q();
                if (zH || objQ == gVar) {
                    objQ = new tl.c(aVar, 4);
                    sVar.o0(objQ);
                }
                fz.c cVar = (fz.c) objQ;
                List list6 = list2;
                o oVar2 = oVar;
                iDNSyllableIntroductionActivity = iDNSyllableIntroductionActivity2;
                List list7 = list3;
                iDNSyllableIntroductionActivity.u(str, BuildConfig.VERSION_NAME, rVarG, cVar, sVar, 48);
                String str2 = (String) list5.get(1);
                String str3 = (String) list5.get(0);
                r rVarG2 = e2.g(c2Var.a(oVar2, 2.0f), f12);
                boolean zH2 = sVar.h(aVar);
                Object objQ2 = sVar.Q();
                if (zH2 || objQ2 == gVar) {
                    objQ2 = new tl.c(aVar, 5);
                    sVar.o0(objQ2);
                }
                List list8 = list4;
                iDNSyllableIntroductionActivity.u(str2, str3, rVarG2, (fz.c) objQ2, sVar, 0);
                String str4 = (String) list5.get(2);
                String str5 = (String) list5.get(0);
                r rVarG3 = e2.g(c2Var.a(oVar2, 2.0f), f12);
                boolean zH3 = sVar.h(aVar);
                Object objQ3 = sVar.Q();
                if (zH3 || objQ3 == gVar) {
                    objQ3 = new tl.c(aVar, 6);
                    sVar.o0(objQ3);
                }
                iDNSyllableIntroductionActivity.u(str4, str5, rVarG3, (fz.c) objQ3, sVar, 0);
                sVar.p(true);
                f5 = f11;
                oVar = oVar2;
                list2 = list6;
                it = it2;
                list3 = list7;
                list4 = list8;
            }
            float f13 = f5;
            List list9 = list2;
            List<List> list10 = list3;
            List<List> list11 = list4;
            o oVar3 = oVar;
            sVar.p(false);
            j0.c.g(sVar, e2.g(oVar3, f13));
            iDNSyllableIntroductionActivity.q("Be careful with these consonants (p, t, k) that appear at the end of syllables. They are not actually pronounced; instead, they are articulated by \"stopping the airflow.\"", sVar, 6);
            j0.c.g(sVar, e2.g(oVar3, f13));
            sVar.d0(644852241);
            Iterator it3 = list9.iterator();
            while (it3.hasNext()) {
                List list12 = (List) it3.next();
                a2 a2VarA2 = z1.a(j0.i.f35303a, iVar, sVar, 0);
                int iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                r rVarC3 = z1.a.c(sVar, oVar3);
                k.J.getClass();
                y2.i iVar4 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar4);
                } else {
                    sVar.r0();
                }
                t.J(y2.j.f56917f, a2VarA2, sVar);
                t.J(y2.j.f56916e, q1VarL3, sVar);
                y2.h hVar3 = y2.j.f56918g;
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                }
                t.J(y2.j.f56915d, rVarC3, sVar);
                String str6 = (String) list12.get(0);
                float f14 = 72;
                r rVarG4 = e2.g(c2Var.a(oVar3, 1.0f), f14);
                boolean zH4 = sVar.h(aVar);
                Object objQ4 = sVar.Q();
                if (zH4 || objQ4 == gVar) {
                    objQ4 = new tl.c(aVar, 7);
                    sVar.o0(objQ4);
                }
                Iterator it4 = it3;
                iDNSyllableIntroductionActivity.u(str6, "p", rVarG4, (fz.c) objQ4, sVar, 48);
                String str7 = (String) list12.get(1);
                r rVarG5 = e2.g(c2Var.a(oVar3, 1.0f), f14);
                boolean zH5 = sVar.h(aVar);
                Object objQ5 = sVar.Q();
                if (zH5 || objQ5 == gVar) {
                    i11 = 8;
                    objQ5 = new tl.c(aVar, i11);
                    sVar.o0(objQ5);
                } else {
                    i11 = 8;
                }
                iDNSyllableIntroductionActivity.u(str7, "t", rVarG5, (fz.c) objQ5, sVar, 48);
                String str8 = (String) list12.get(2);
                r rVarG6 = e2.g(c2Var.a(oVar3, 1.0f), f14);
                boolean zH6 = sVar.h(aVar);
                Object objQ6 = sVar.Q();
                if (zH6 || objQ6 == gVar) {
                    objQ6 = new tl.c(aVar, 9);
                    sVar.o0(objQ6);
                }
                iDNSyllableIntroductionActivity.u(str8, "k", rVarG6, (fz.c) objQ6, sVar, 48);
                sVar.p(true);
                it3 = it4;
            }
            sVar.p(false);
            j0.c.g(sVar, e2.g(oVar3, f13));
            iDNSyllableIntroductionActivity.q("The Indonesian \"ng\" is pronounced just like \"ng\" in English words, as in \"sing.\"", sVar, 6);
            j0.c.g(sVar, e2.g(oVar3, f13));
            sVar.d0(644903992);
            for (List list13 : list10) {
                a2 a2VarA3 = z1.a(j0.i.f35303a, iVar, sVar, 0);
                int iHashCode4 = Long.hashCode(sVar.T);
                q1 q1VarL4 = sVar.l();
                r rVarC4 = z1.a.c(sVar, oVar3);
                k.J.getClass();
                y2.i iVar5 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar5);
                } else {
                    sVar.r0();
                }
                t.J(y2.j.f56917f, a2VarA3, sVar);
                t.J(y2.j.f56916e, q1VarL4, sVar);
                y2.h hVar4 = y2.j.f56918g;
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                    defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar4);
                }
                t.J(y2.j.f56915d, rVarC4, sVar);
                String str9 = (String) list13.get(0);
                float f15 = 72;
                r rVarG7 = e2.g(c2Var.a(oVar3, 1.0f), f15);
                boolean zH7 = sVar.h(aVar);
                Object objQ7 = sVar.Q();
                if (zH7 || objQ7 == gVar) {
                    objQ7 = new tl.c(aVar, 10);
                    sVar.o0(objQ7);
                }
                iDNSyllableIntroductionActivity.u(str9, "ng", rVarG7, (fz.c) objQ7, sVar, 48);
                String str10 = (String) list13.get(1);
                r rVarG8 = e2.g(c2Var.a(oVar3, 1.0f), f15);
                boolean zH8 = sVar.h(aVar);
                Object objQ8 = sVar.Q();
                if (zH8 || objQ8 == gVar) {
                    objQ8 = new tl.c(aVar, 11);
                    sVar.o0(objQ8);
                }
                iDNSyllableIntroductionActivity.u(str10, "ng", rVarG8, (fz.c) objQ8, sVar, 48);
                sVar.p(true);
            }
            sVar.p(false);
            j0.c.g(sVar, e2.g(oVar3, f13));
            iDNSyllableIntroductionActivity.q("In Indonesian, \"ny\" is similar to the Spanish \"ñ,\" like the \"ny\" in \"canyon\" with a nasal sound.", sVar, 6);
            j0.c.g(sVar, e2.g(oVar3, f13));
            sVar.d0(644943672);
            for (List list14 : list11) {
                a2 a2VarA4 = z1.a(j0.i.f35303a, iVar, sVar, 0);
                int iHashCode5 = Long.hashCode(sVar.T);
                q1 q1VarL5 = sVar.l();
                r rVarC5 = z1.a.c(sVar, oVar3);
                k.J.getClass();
                y2.i iVar6 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar6);
                } else {
                    sVar.r0();
                }
                t.J(y2.j.f56917f, a2VarA4, sVar);
                t.J(y2.j.f56916e, q1VarL5, sVar);
                y2.h hVar5 = y2.j.f56918g;
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                    defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar5);
                }
                t.J(y2.j.f56915d, rVarC5, sVar);
                String str11 = (String) list14.get(0);
                float f16 = 72;
                r rVarG9 = e2.g(c2Var.a(oVar3, 1.0f), f16);
                boolean zH9 = sVar.h(aVar);
                Object objQ9 = sVar.Q();
                if (zH9 || objQ9 == gVar) {
                    objQ9 = new tl.c(aVar, 12);
                    sVar.o0(objQ9);
                }
                iDNSyllableIntroductionActivity.u(str11, "ny", rVarG9, (fz.c) objQ9, sVar, 48);
                String str12 = (String) list14.get(1);
                r rVarG10 = e2.g(c2Var.a(oVar3, 1.0f), f16);
                boolean zH10 = sVar.h(aVar);
                Object objQ10 = sVar.Q();
                if (zH10 || objQ10 == gVar) {
                    objQ10 = new tl.c(aVar, 13);
                    sVar.o0(objQ10);
                }
                iDNSyllableIntroductionActivity.u(str12, "ny", rVarG10, (fz.c) objQ10, sVar, 48);
                sVar.p(true);
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0326  */
    /* JADX WARN: Code duplicated, block: B:74:0x035c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0360  */
    /* JADX WARN: Code duplicated, block: B:80:0x037b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0446  */
    /* JADX WARN: Code duplicated, block: B:87:0x0485  */
    /* JADX WARN: Code duplicated, block: B:88:0x0489  */
    /* JADX WARN: Code duplicated, block: B:93:0x04a4  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11;
        int i12;
        j3.h hVar;
        boolean zF;
        Object objQ;
        int iHashCode;
        int iHashCode2;
        int i13 = this.f25814a;
        o oVar = o.f58481a;
        l1.g gVar = l1.m.f39353a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj4 = this.f25818e;
        Object obj5 = this.f25817d;
        Object obj6 = this.f25816c;
        Object obj7 = this.f25820t;
        Object obj8 = this.f25819f;
        Object obj9 = this.f25815b;
        switch (i13) {
            case 0:
                a0 a0Var = (a0) obj9;
                Context context = (Context) obj6;
                xt.u uVar = (xt.u) obj5;
                js.t tVar = (js.t) obj4;
                fz.c cVar = (fz.c) obj8;
                fz.c cVar2 = (fz.c) obj7;
                l0.c item = (l0.c) obj;
                n nVar = (n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                m.f(item, "$this$item");
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ChineseToneLesson chineseToneLesson = a0Var.f36736a;
                    String strG = chineseToneLesson.getLessonId() > 0 ? j.g(context, uVar, chineseToneLesson.getLessonId(), chineseToneLesson.getDescription()) : chineseToneLesson.getDescription();
                    String lessonName = chineseToneLesson.getLessonName();
                    LessonState state = chineseToneLesson.getState();
                    Long l9 = tVar.f36835c;
                    boolean z11 = l9 != null && l9.longValue() == chineseToneLesson.getLessonId();
                    boolean zH = sVar.h(a0Var) | sVar.f(cVar) | sVar.f(cVar2);
                    Object objQ2 = sVar.Q();
                    if (zH || objQ2 == gVar) {
                        objQ2 = new androidx.lifecycle.compose.a(a0Var, cVar, cVar2, 13);
                        sVar.o0(objQ2);
                    }
                    j.d(lessonName, state, strG, (fz.a) objQ2, z11, sVar, 0);
                } else {
                    sVar.W();
                }
                return b0Var;
            case 1:
                hu.i iVar = (hu.i) obj9;
                b1 b1Var = (b1) obj6;
                fz.a aVar = (fz.a) obj5;
                fz.a aVar2 = (fz.a) obj4;
                b1 b1Var2 = (b1) obj8;
                b1 b1Var3 = (b1) obj7;
                v Card = (v) obj;
                n nVar2 = (n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                m.f(Card, "$this$Card");
                s sVar2 = (s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Object objQ3 = sVar2.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new h0(22, b1Var);
                        sVar2.o0(objQ3);
                    }
                    a0.o.b(iVar, null, (fz.c) objQ3, null, BuildConfig.VERSION_NAME, null, t1.e.d(-505625146, new fu.d(aVar, aVar2, b1Var, b1Var2, b1Var3), sVar2), sVar2, 1597824, 42);
                } else {
                    sVar2.W();
                }
                return b0Var;
            case 2:
                MALSyllableIntroductionActivity mALSyllableIntroductionActivity = (MALSyllableIntroductionActivity) obj9;
                List list = (List) obj6;
                List list2 = (List) obj5;
                List list3 = (List) obj4;
                List list4 = (List) obj8;
                ln.a aVar3 = (ln.a) obj7;
                l item2 = (l) obj;
                n nVar3 = (n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i14 = MALSyllableIntroductionActivity.Q;
                z1.i iVar2 = z1.c.L;
                m.f(item2, "$this$item");
                s sVar3 = (s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
                    int iHashCode3 = Long.hashCode(sVar3.T);
                    q1 q1VarL = sVar3.l();
                    r rVarC = z1.a.c(sVar3, oVar);
                    k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar3);
                    } else {
                        sVar3.r0();
                    }
                    t.J(y2.j.f56917f, uVarA, sVar3);
                    t.J(y2.j.f56916e, q1VarL, sVar3);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar2);
                    }
                    t.J(y2.j.f56915d, rVarC, sVar3);
                    mALSyllableIntroductionActivity.s("Consonant", sVar3, 6);
                    mALSyllableIntroductionActivity.q("Malay consonants are also very easy to pronounce. Note that the letters Q, V, and X are rarely used, primarily appearing in loanwords.", sVar3, 6);
                    float f5 = 8;
                    j0.c.g(sVar3, e2.g(oVar, f5));
                    sVar3.d0(932499920);
                    Iterator it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        c2 c2Var = c2.f35266a;
                        if (zHasNext) {
                            List list5 = (List) it.next();
                            a2 a2VarA = z1.a(j0.i.f35303a, iVar2, sVar3, 0);
                            List list6 = list4;
                            List list7 = list3;
                            int iHashCode4 = Long.hashCode(sVar3.T);
                            q1 q1VarL2 = sVar3.l();
                            Iterator it2 = it;
                            r rVarC2 = z1.a.c(sVar3, oVar);
                            k.J.getClass();
                            MALSyllableIntroductionActivity mALSyllableIntroductionActivity2 = mALSyllableIntroductionActivity;
                            y2.i iVar4 = y2.j.f56913b;
                            sVar3.h0();
                            if (sVar3.S) {
                                sVar3.k(iVar4);
                            } else {
                                sVar3.r0();
                            }
                            t.J(y2.j.f56917f, a2VarA, sVar3);
                            t.J(y2.j.f56916e, q1VarL2, sVar3);
                            y2.h hVar3 = y2.j.f56918g;
                            if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode4))) {
                                defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar3);
                            }
                            t.J(y2.j.f56915d, rVarC2, sVar3);
                            String str = (String) list5.get(0);
                            float f11 = 72;
                            r rVarG = e2.g(c2Var.a(oVar, 1.0f), f11);
                            boolean zH2 = sVar3.h(aVar3);
                            Object objQ4 = sVar3.Q();
                            if (zH2 || objQ4 == gVar) {
                                objQ4 = new in.f(aVar3, 6);
                                sVar3.o0(objQ4);
                            }
                            mALSyllableIntroductionActivity2.u(str, BuildConfig.VERSION_NAME, rVarG, false, false, (fz.c) objQ4, sVar3, 24624, 8);
                            String str2 = (String) list5.get(1);
                            String str3 = (String) list5.get(0);
                            r rVarG2 = e2.g(c2Var.a(oVar, 2.0f), f11);
                            boolean zH3 = sVar3.h(aVar3);
                            Object objQ5 = sVar3.Q();
                            if (zH3 || objQ5 == gVar) {
                                objQ5 = new in.f(aVar3, 7);
                                sVar3.o0(objQ5);
                            }
                            mALSyllableIntroductionActivity2.u(str2, str3, rVarG2, false, false, (fz.c) objQ5, sVar3, 0, 24);
                            String str4 = (String) list5.get(2);
                            String str5 = (String) list5.get(0);
                            r rVarG3 = e2.g(c2Var.a(oVar, 2.0f), f11);
                            boolean zH4 = sVar3.h(aVar3);
                            Object objQ6 = sVar3.Q();
                            if (zH4 || objQ6 == gVar) {
                                objQ6 = new in.f(aVar3, 8);
                                sVar3.o0(objQ6);
                            }
                            mALSyllableIntroductionActivity2.u(str4, str5, rVarG3, false, false, (fz.c) objQ6, sVar3, 0, 24);
                            mALSyllableIntroductionActivity = mALSyllableIntroductionActivity2;
                            sVar3.p(true);
                            it = it2;
                            list3 = list7;
                            list4 = list6;
                        } else {
                            List<List> list8 = list4;
                            List list9 = list3;
                            sVar3.p(false);
                            j0.c.g(sVar3, e2.g(oVar, f5));
                            mALSyllableIntroductionActivity.q("Be careful with these consonants (p, t, k) that appear at the end of syllables. They are not actually pronounced; instead, they are articulated by \"stopping the airflow.\"", sVar3, 6);
                            j0.c.g(sVar3, e2.g(oVar, f5));
                            sVar3.d0(932557095);
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                List list10 = (List) it3.next();
                                a2 a2VarA2 = z1.a(j0.i.f35303a, iVar2, sVar3, 0);
                                int iHashCode5 = Long.hashCode(sVar3.T);
                                q1 q1VarL3 = sVar3.l();
                                r rVarC3 = z1.a.c(sVar3, oVar);
                                k.J.getClass();
                                y2.i iVar5 = y2.j.f56913b;
                                sVar3.h0();
                                Iterator it4 = it3;
                                if (sVar3.S) {
                                    sVar3.k(iVar5);
                                } else {
                                    sVar3.r0();
                                }
                                t.J(y2.j.f56917f, a2VarA2, sVar3);
                                t.J(y2.j.f56916e, q1VarL3, sVar3);
                                y2.h hVar4 = y2.j.f56918g;
                                if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode5))) {
                                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar4);
                                }
                                t.J(y2.j.f56915d, rVarC3, sVar3);
                                String str6 = (String) list10.get(0);
                                float f12 = 72;
                                r rVarG4 = e2.g(c2Var.a(oVar, 1.0f), f12);
                                boolean zH5 = sVar3.h(aVar3);
                                Object objQ7 = sVar3.Q();
                                if (zH5 || objQ7 == gVar) {
                                    objQ7 = new in.f(aVar3, 9);
                                    sVar3.o0(objQ7);
                                }
                                MALSyllableIntroductionActivity mALSyllableIntroductionActivity3 = mALSyllableIntroductionActivity;
                                mALSyllableIntroductionActivity3.u(str6, "p", rVarG4, false, false, (fz.c) objQ7, sVar3, 48, 24);
                                String str7 = (String) list10.get(1);
                                r rVarG5 = e2.g(c2Var.a(oVar, 1.0f), f12);
                                boolean zH6 = sVar3.h(aVar3);
                                Object objQ8 = sVar3.Q();
                                if (zH6 || objQ8 == gVar) {
                                    objQ8 = new in.f(aVar3, 10);
                                    sVar3.o0(objQ8);
                                }
                                mALSyllableIntroductionActivity3.u(str7, "t", rVarG5, false, false, (fz.c) objQ8, sVar3, 48, 24);
                                String str8 = (String) list10.get(2);
                                r rVarG6 = e2.g(c2Var.a(oVar, 1.0f), f12);
                                boolean zH7 = sVar3.h(aVar3);
                                Object objQ9 = sVar3.Q();
                                if (zH7 || objQ9 == gVar) {
                                    objQ9 = new in.f(aVar3, 11);
                                    sVar3.o0(objQ9);
                                }
                                mALSyllableIntroductionActivity3.u(str8, "k", rVarG6, false, false, (fz.c) objQ9, sVar3, 48, 24);
                                mALSyllableIntroductionActivity = mALSyllableIntroductionActivity3;
                                sVar3.p(true);
                                it3 = it4;
                            }
                            sVar3.p(false);
                            j0.c.g(sVar3, e2.g(oVar, f5));
                            mALSyllableIntroductionActivity.q("The Malay \"ng\" is pronounced just like \"ng\" in English words, as in \"sing.\"", sVar3, 6);
                            j0.c.g(sVar3, e2.g(oVar, f5));
                            sVar3.d0(932608686);
                            Iterator it5 = list9.iterator();
                            while (it5.hasNext()) {
                                List list11 = (List) it5.next();
                                a2 a2VarA3 = z1.a(j0.i.f35303a, iVar2, sVar3, 0);
                                int iHashCode6 = Long.hashCode(sVar3.T);
                                q1 q1VarL4 = sVar3.l();
                                r rVarC4 = z1.a.c(sVar3, oVar);
                                k.J.getClass();
                                y2.i iVar6 = y2.j.f56913b;
                                sVar3.h0();
                                Iterator it6 = it5;
                                if (sVar3.S) {
                                    sVar3.k(iVar6);
                                } else {
                                    sVar3.r0();
                                }
                                t.J(y2.j.f56917f, a2VarA3, sVar3);
                                t.J(y2.j.f56916e, q1VarL4, sVar3);
                                y2.h hVar5 = y2.j.f56918g;
                                if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode6))) {
                                    defpackage.e.A(iHashCode6, sVar3, iHashCode6, hVar5);
                                }
                                t.J(y2.j.f56915d, rVarC4, sVar3);
                                String str9 = (String) list11.get(0);
                                float f13 = 72;
                                r rVarG7 = e2.g(c2Var.a(oVar, 1.0f), f13);
                                boolean zH8 = sVar3.h(aVar3);
                                Object objQ10 = sVar3.Q();
                                if (zH8 || objQ10 == gVar) {
                                    objQ10 = new in.f(aVar3, 12);
                                    sVar3.o0(objQ10);
                                }
                                MALSyllableIntroductionActivity mALSyllableIntroductionActivity4 = mALSyllableIntroductionActivity;
                                mALSyllableIntroductionActivity4.u(str9, "ng", rVarG7, false, false, (fz.c) objQ10, sVar3, 48, 24);
                                String str10 = (String) list11.get(1);
                                r rVarG8 = e2.g(c2Var.a(oVar, 1.0f), f13);
                                boolean zH9 = sVar3.h(aVar3);
                                Object objQ11 = sVar3.Q();
                                if (zH9 || objQ11 == gVar) {
                                    objQ11 = new in.f(aVar3, 13);
                                    sVar3.o0(objQ11);
                                }
                                mALSyllableIntroductionActivity4.u(str10, "ng", rVarG8, false, false, (fz.c) objQ11, sVar3, 48, 24);
                                mALSyllableIntroductionActivity = mALSyllableIntroductionActivity4;
                                sVar3.p(true);
                                it5 = it6;
                            }
                            sVar3.p(false);
                            j0.c.g(sVar3, e2.g(oVar, f5));
                            mALSyllableIntroductionActivity.q("In Malay, \"ny\" is similar to the Spanish \"ñ,\" like the \"ny\" in \"canyon\" with a nasal sound.", sVar3, 6);
                            j0.c.g(sVar3, e2.g(oVar, f5));
                            sVar3.d0(932648206);
                            for (List list12 : list8) {
                                a2 a2VarA4 = z1.a(j0.i.f35303a, iVar2, sVar3, 0);
                                int iHashCode7 = Long.hashCode(sVar3.T);
                                q1 q1VarL5 = sVar3.l();
                                r rVarC5 = z1.a.c(sVar3, oVar);
                                k.J.getClass();
                                y2.i iVar7 = y2.j.f56913b;
                                sVar3.h0();
                                if (sVar3.S) {
                                    sVar3.k(iVar7);
                                } else {
                                    sVar3.r0();
                                }
                                t.J(y2.j.f56917f, a2VarA4, sVar3);
                                t.J(y2.j.f56916e, q1VarL5, sVar3);
                                y2.h hVar6 = y2.j.f56918g;
                                if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode7))) {
                                    defpackage.e.A(iHashCode7, sVar3, iHashCode7, hVar6);
                                }
                                t.J(y2.j.f56915d, rVarC5, sVar3);
                                String str11 = (String) list12.get(0);
                                float f14 = 72;
                                r rVarG9 = e2.g(c2Var.a(oVar, 1.0f), f14);
                                boolean zH10 = sVar3.h(aVar3);
                                Object objQ12 = sVar3.Q();
                                if (zH10 || objQ12 == gVar) {
                                    objQ12 = new in.f(aVar3, 14);
                                    sVar3.o0(objQ12);
                                }
                                MALSyllableIntroductionActivity mALSyllableIntroductionActivity5 = mALSyllableIntroductionActivity;
                                mALSyllableIntroductionActivity5.u(str11, "ny", rVarG9, false, false, (fz.c) objQ12, sVar3, 48, 24);
                                String str12 = (String) list12.get(1);
                                r rVarG10 = e2.g(c2Var.a(oVar, 1.0f), f14);
                                boolean zH11 = sVar3.h(aVar3);
                                Object objQ13 = sVar3.Q();
                                if (zH11 || objQ13 == gVar) {
                                    objQ13 = new in.f(aVar3, 15);
                                    sVar3.o0(objQ13);
                                }
                                mALSyllableIntroductionActivity5.u(str12, "ny", rVarG10, false, false, (fz.c) objQ13, sVar3, 48, 24);
                                sVar3.p(true);
                                mALSyllableIntroductionActivity = mALSyllableIntroductionActivity5;
                            }
                            sVar3.p(false);
                            sVar3.p(true);
                        }
                    }
                } else {
                    sVar3.W();
                }
                return b0Var;
            case 3:
                o0.t tVar2 = (o0.t) obj9;
                b0 b0Var2 = (b0) obj6;
                iv.f0 f0Var = (iv.f0) obj5;
                fz.a aVar4 = (fz.a) obj4;
                fz.a aVar5 = (fz.a) obj8;
                fz.e eVar = (fz.e) obj7;
                t1 paddingValues = (t1) obj;
                n nVar4 = (n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                m.f(paddingValues, "paddingValues");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((s) nVar4).f(paddingValues) ? 4 : 2;
                }
                s sVar4 = (s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    r rVarZ = j0.c.z(d0.n.h(e2.d(oVar, 1.0f), ((s1) sVar4.j(v1.f31180a)).f31031n, f0.f28556b), paddingValues);
                    u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, 0);
                    int iHashCode8 = Long.hashCode(sVar4.T);
                    q1 q1VarL6 = sVar4.l();
                    r rVarC6 = z1.a.c(sVar4, rVarZ);
                    k.J.getClass();
                    y2.i iVar8 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar8);
                    } else {
                        sVar4.r0();
                    }
                    t.J(y2.j.f56917f, uVarA2, sVar4);
                    t.J(y2.j.f56916e, q1VarL6, sVar4);
                    y2.h hVar7 = y2.j.f56918g;
                    if (sVar4.S || !m.a(sVar4.Q(), Integer.valueOf(iHashCode8))) {
                        defpackage.e.A(iHashCode8, sVar4, iHashCode8, hVar7);
                    }
                    t.J(y2.j.f56915d, rVarC6, sVar4);
                    fa.a(tVar2.k(), null, 0L, 0L, null, null, t1.e.d(860363419, new fu.n(10, tVar2, b0Var2), sVar4), sVar4, 1572864, 62);
                    ve.i.d(tVar2, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-2107256828, new br.u(f0Var, aVar4, aVar5, eVar, 4), sVar4), sVar4, 0, 16382);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                return b0Var;
            case 4:
                return a(obj, obj2, obj3);
            case 5:
                return c(obj, obj2, obj3);
            case 6:
                ue ueVar = (ue) obj9;
                List<oe> list13 = ueVar.f50513d;
                Set set = (Set) obj6;
                fz.c cVar3 = (fz.c) obj8;
                fz.e eVar2 = (fz.e) obj5;
                ke keVar = (ke) obj4;
                Set set2 = (Set) obj7;
                l0.c item3 = (l0.c) obj;
                n nVar5 = (n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                m.f(item3, "$this$item");
                s sVar5 = (s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    if (list13.isEmpty()) {
                        i11 = 0;
                    } else {
                        Iterator it7 = list13.iterator();
                        i11 = 0;
                        while (it7.hasNext()) {
                            if (mt.b1.o((oe) it7.next(), keVar) && (i11 = i11 + 1) < 0) {
                                ns.o.U();
                                throw null;
                            }
                        }
                    }
                    if (list13.isEmpty()) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (oe oeVar : list13) {
                            if (mt.b1.o(oeVar, keVar) && set2.contains(oeVar.f50220a)) {
                                i12++;
                                if (i12 < 0) {
                                    ns.o.U();
                                    throw null;
                                }
                            }
                        }
                    }
                    boolean zContains = set.contains(Long.valueOf(ueVar.f50510a));
                    boolean zF2 = sVar5.f(cVar3) | sVar5.h(ueVar);
                    Object objQ14 = sVar5.Q();
                    if (zF2 || objQ14 == gVar) {
                        objQ14 = new l1.z1(8, cVar3, ueVar);
                        sVar5.o0(objQ14);
                    }
                    fz.a aVar6 = (fz.a) objQ14;
                    boolean zF3 = sVar5.f(eVar2) | sVar5.h(ueVar);
                    Object objQ15 = sVar5.Q();
                    if (zF3 || objQ15 == gVar) {
                        objQ15 = new j9.h(20, eVar2, ueVar);
                        sVar5.o0(objQ15);
                    }
                    mt.b1.l(ueVar, i12, i11, zContains, aVar6, (fz.c) objQ15, sVar5, 0);
                } else {
                    sVar5.W();
                }
                return b0Var;
            case 7:
                fz.a aVar7 = (fz.a) obj9;
                String str13 = (String) obj6;
                THAISyllableIntroductionActivity tHAISyllableIntroductionActivity = (THAISyllableIntroductionActivity) obj5;
                String str14 = (String) obj4;
                String str15 = (String) obj8;
                j3.h hVar8 = (j3.h) obj7;
                v Card2 = (v) obj;
                n nVar6 = (n) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i15 = THAISyllableIntroductionActivity.M;
                m.f(Card2, "$this$Card");
                s sVar6 = (s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    float f15 = 100;
                    r rVarG11 = e2.g(oVar, f15);
                    a2 a2VarA5 = z1.a(j0.i.f35303a, z1.c.L, sVar6, 0);
                    int iHashCode9 = Long.hashCode(sVar6.T);
                    q1 q1VarL7 = sVar6.l();
                    r rVarC7 = z1.a.c(sVar6, rVarG11);
                    k.J.getClass();
                    y2.i iVar9 = y2.j.f56913b;
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar9);
                    } else {
                        sVar6.r0();
                    }
                    y2.h hVar9 = y2.j.f56917f;
                    t.J(hVar9, a2VarA5, sVar6);
                    y2.h hVar10 = y2.j.f56916e;
                    t.J(hVar10, q1VarL7, sVar6);
                    y2.h hVar11 = y2.j.f56918g;
                    if (sVar6.S) {
                        hVar = hVar8;
                    } else {
                        hVar = hVar8;
                        if (!m.a(sVar6.Q(), Integer.valueOf(iHashCode9))) {
                        }
                        y2.h hVar12 = y2.j.f56915d;
                        t.J(hVar12, rVarC7, sVar6);
                        r rVarN = e2.n(oVar, f15);
                        zF = sVar6.f(aVar7);
                        objQ = sVar6.Q();
                        if (zF || objQ == gVar) {
                            objQ = new okhttp3.b(11, aVar7);
                            sVar6.o0(objQ);
                        }
                        r rVarO = d0.n.o(rVarN, false, null, (fz.a) objQ, 15);
                        z1.h hVar13 = z1.c.P;
                        j0.e eVar3 = j0.i.f35310h;
                        u uVarA3 = j0.t.a(eVar3, hVar13, sVar6, 54);
                        iHashCode = Long.hashCode(sVar6.T);
                        q1 q1VarL8 = sVar6.l();
                        r rVarC8 = z1.a.c(sVar6, rVarO);
                        sVar6.h0();
                        if (sVar6.S) {
                            sVar6.k(iVar9);
                        } else {
                            sVar6.r0();
                        }
                        t.J(hVar9, uVarA3, sVar6);
                        t.J(hVar10, q1VarL8, sVar6);
                        if (sVar6.S || !m.a(sVar6.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar6, iHashCode, hVar11);
                        }
                        t.J(hVar12, rVarC8, sVar6);
                        d0 d0Var = ua.f31167a;
                        ua.b(str13, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(d0Var), se.i.k(sVar6, R.color.primary_black), j3.A(26), null, null, tHAISyllableIntroductionActivity.L, 0L, null, null, 0, 0, 0L, null, 16777180), sVar6, 0, 0, 65534);
                        ua.b(str14, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(d0Var), se.i.k(sVar6, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar6, 0, 0, 65534);
                        sVar6.p(true);
                        j0.c.g(sVar6, d0.n.h(e2.s(e2.c(oVar, 1.0f), 1), se.i.k(sVar6, R.color.divider_line_color), f0.f28556b));
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        r rVarE = j0.c.E(e2.c(new i1(1.0f, true), 1.0f), 16, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                        u uVarA4 = j0.t.a(eVar3, z1.c.O, sVar6, 6);
                        iHashCode2 = Long.hashCode(sVar6.T);
                        q1 q1VarL9 = sVar6.l();
                        r rVarC9 = z1.a.c(sVar6, rVarE);
                        sVar6.h0();
                        if (sVar6.S) {
                            sVar6.k(iVar9);
                        } else {
                            sVar6.r0();
                        }
                        t.J(hVar9, uVarA4, sVar6);
                        t.J(hVar10, q1VarL9, sVar6);
                        if (sVar6.S || !m.a(sVar6.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar11);
                        }
                        t.J(hVar12, rVarC9, sVar6);
                        ua.b(str15, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(d0Var), se.i.k(sVar6, R.color.primary_black), j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar6, 0, 0, 65534);
                        ua.c(hVar, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0.a((y0) sVar6.j(d0Var), se.i.k(sVar6, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar6, 0, 0, 131070);
                        sVar6.p(true);
                        sVar6.p(true);
                    }
                    defpackage.e.A(iHashCode9, sVar6, iHashCode9, hVar11);
                    y2.h hVar14 = y2.j.f56915d;
                    t.J(hVar14, rVarC7, sVar6);
                    r rVarN2 = e2.n(oVar, f15);
                    zF = sVar6.f(aVar7);
                    objQ = sVar6.Q();
                    if (zF) {
                        objQ = new okhttp3.b(11, aVar7);
                        sVar6.o0(objQ);
                    } else {
                        objQ = new okhttp3.b(11, aVar7);
                        sVar6.o0(objQ);
                    }
                    r rVarO2 = d0.n.o(rVarN2, false, null, (fz.a) objQ, 15);
                    z1.h hVar15 = z1.c.P;
                    j0.e eVar4 = j0.i.f35310h;
                    u uVarA5 = j0.t.a(eVar4, hVar15, sVar6, 54);
                    iHashCode = Long.hashCode(sVar6.T);
                    q1 q1VarL10 = sVar6.l();
                    r rVarC10 = z1.a.c(sVar6, rVarO2);
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar9);
                    } else {
                        sVar6.r0();
                    }
                    t.J(hVar9, uVarA5, sVar6);
                    t.J(hVar10, q1VarL10, sVar6);
                    if (sVar6.S) {
                        defpackage.e.A(iHashCode, sVar6, iHashCode, hVar11);
                    } else {
                        defpackage.e.A(iHashCode, sVar6, iHashCode, hVar11);
                    }
                    t.J(hVar14, rVarC10, sVar6);
                    d0 d0Var2 = ua.f31167a;
                    ua.b(str13, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(d0Var2), se.i.k(sVar6, R.color.primary_black), j3.A(26), null, null, tHAISyllableIntroductionActivity.L, 0L, null, null, 0, 0, 0L, null, 16777180), sVar6, 0, 0, 65534);
                    ua.b(str14, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(d0Var2), se.i.k(sVar6, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar6, 0, 0, 65534);
                    sVar6.p(true);
                    j0.c.g(sVar6, d0.n.h(e2.s(e2.c(oVar, 1.0f), 1), se.i.k(sVar6, R.color.divider_line_color), f0.f28556b));
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    r rVarE2 = j0.c.E(e2.c(new i1(1.0f, true), 1.0f), 16, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                    u uVarA6 = j0.t.a(eVar4, z1.c.O, sVar6, 6);
                    iHashCode2 = Long.hashCode(sVar6.T);
                    q1 q1VarL11 = sVar6.l();
                    r rVarC11 = z1.a.c(sVar6, rVarE2);
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar9);
                    } else {
                        sVar6.r0();
                    }
                    t.J(hVar9, uVarA6, sVar6);
                    t.J(hVar10, q1VarL11, sVar6);
                    if (sVar6.S) {
                        defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar11);
                    } else {
                        defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar11);
                    }
                    t.J(hVar14, rVarC11, sVar6);
                    ua.b(str15, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(d0Var2), se.i.k(sVar6, R.color.primary_black), j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar6, 0, 0, 65534);
                    ua.c(hVar, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0.a((y0) sVar6.j(d0Var2), se.i.k(sVar6, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar6, 0, 0, 131070);
                    sVar6.p(true);
                    sVar6.p(true);
                } else {
                    sVar6.W();
                }
                return b0Var;
            case 8:
                return d(obj, obj2, obj3);
            default:
                e2.v vVar = (e2.v) obj9;
                fz.c cVar4 = (fz.c) obj8;
                fz.c cVar5 = (fz.c) obj7;
                String str16 = (String) obj6;
                fz.c cVar6 = (fz.c) obj5;
                fz.a aVar8 = (fz.a) obj4;
                v Card3 = (v) obj;
                n nVar7 = (n) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                m.f(Card3, "$this$Card");
                s sVar7 = (s) nVar7;
                if (sVar7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    o oVar2 = o.f58481a;
                    float f16 = 16;
                    r rVarB = j0.c.B(e2.e(oVar2, 1.0f), 38, f16);
                    c3 c3Var = v1.f31180a;
                    r rVarH = d0.n.h(rVarB, ((s1) sVar7.j(c3Var)).f31031n, r0.f.a());
                    a2 a2VarA6 = z1.a(j0.i.f35303a, z1.c.M, sVar7, 48);
                    int iHashCode10 = Long.hashCode(sVar7.T);
                    q1 q1VarL12 = sVar7.l();
                    r rVarC12 = z1.a.c(sVar7, rVarH);
                    k.J.getClass();
                    y2.i iVar10 = y2.j.f56913b;
                    sVar7.h0();
                    if (sVar7.S) {
                        sVar7.k(iVar10);
                    } else {
                        sVar7.r0();
                    }
                    t.J(y2.j.f56917f, a2VarA6, sVar7);
                    t.J(y2.j.f56916e, q1VarL12, sVar7);
                    y2.h hVar16 = y2.j.f56918g;
                    if (sVar7.S || !m.a(sVar7.Q(), Integer.valueOf(iHashCode10))) {
                        defpackage.e.A(iHashCode10, sVar7, iHashCode10, hVar16);
                    }
                    t.J(y2.j.f56915d, rVarC12, sVar7);
                    d0.n.c(se.k.y(R.drawable.ic_search_icon, sVar7, 0), "search icon", j0.c.E(oVar2, f16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar7, 432, 120);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    r rVarJ = e2.d.j(j0.c.C(new i1(1.0f, true), f16, CropImageView.DEFAULT_ASPECT_RATIO, 2), vVar);
                    boolean zF4 = sVar7.f(cVar4);
                    Object objQ16 = sVar7.Q();
                    if (zF4 || objQ16 == gVar) {
                        objQ16 = new uu.b(cVar4, 24);
                        sVar7.o0(objQ16);
                    }
                    r rVarT = e2.d.t(rVarJ, (fz.c) objQ16);
                    la laVar = la.f30616a;
                    long j11 = ((s1) sVar7.j(c3Var)).f31031n;
                    long j12 = ((s1) sVar7.j(c3Var)).f31031n;
                    long j13 = g2.x.f28621h;
                    ha haVarC = la.c(0L, 0L, 0L, j11, j12, 0L, 0L, 0L, j13, j13, sVar7, 2147477455);
                    r0 r0Var = new r0(0, 3, 119);
                    boolean zF5 = sVar7.f(cVar5) | sVar7.f(str16);
                    Object objQ17 = sVar7.Q();
                    if (zF5 || objQ17 == gVar) {
                        objQ17 = new n2(25, cVar5, str16);
                        sVar7.o0(objQ17);
                    }
                    qa.a(str16, cVar6, rVarT, false, null, xu.c.Y, null, false, null, r0Var, new s0.q0(null, (fz.c) objQ17, 47), false, 0, 0, null, haVarC, sVar7, 12582912, 196608, 4095864);
                    b3 b3VarB = b0.h.b(str16.length() > 0 ? 1.0f : 0.3f, b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), "清除按钮透明度动画", sVar7, 3120, 20);
                    b3 b3VarB2 = b0.h.b(str16.length() > 0 ? 1.0f : 0.8f, b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), "清除按钮缩放动画", sVar7, 3120, 20);
                    k2.b bVarY = se.k.y(R.drawable.ic_search_clear, sVar7, 0);
                    r rVarA = d2.h.a(e2.n(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f16, CropImageView.DEFAULT_ASPECT_RATIO, 11), f16), ((Number) b3VarB.getValue()).floatValue());
                    float fFloatValue = ((Number) b3VarB2.getValue()).floatValue();
                    r rVarI = d2.h.i(rVarA, fFloatValue, fFloatValue);
                    boolean zF6 = sVar7.f(aVar8);
                    Object objQ18 = sVar7.Q();
                    if (zF6 || objQ18 == gVar) {
                        objQ18 = new wo.c(18, aVar8);
                        sVar7.o0(objQ18);
                    }
                    d0.n.c(bVarY, "clear search", iu.k.q(0, 7, (fz.a) objQ18, sVar7, rVarI, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar7, 48, 120);
                    sVar7.p(true);
                } else {
                    sVar7.W();
                }
                return b0Var;
        }
    }

    public /* synthetic */ h(e2.v vVar, fz.c cVar, fz.c cVar2, String str, fz.c cVar3, fz.a aVar) {
        this.f25814a = 9;
        this.f25815b = vVar;
        this.f25819f = cVar;
        this.f25820t = cVar2;
        this.f25816c = str;
        this.f25817d = cVar3;
        this.f25818e = aVar;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.f25814a = i11;
        this.f25815b = obj;
        this.f25816c = obj2;
        this.f25817d = obj3;
        this.f25818e = obj4;
        this.f25819f = obj5;
        this.f25820t = obj6;
    }

    public /* synthetic */ h(ue ueVar, Set set, fz.c cVar, fz.e eVar, ke keVar, Set set2) {
        this.f25814a = 6;
        this.f25815b = ueVar;
        this.f25816c = set;
        this.f25819f = cVar;
        this.f25817d = eVar;
        this.f25818e = keVar;
        this.f25820t = set2;
    }
}
