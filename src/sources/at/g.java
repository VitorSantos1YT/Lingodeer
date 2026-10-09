package at;

import com.lingodeer.R;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.LessonType;
import com.lingodeer.data.model.StoryLessonType;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import g2.f0;
import h1.ua;
import j0.a2;
import j0.e2;
import j0.u;
import j0.v;
import j0.z1;
import j3.y0;
import l1.d0;
import l1.q1;
import l1.t;
import oz.x;
import qy.b0;
import rt.sf;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements fz.f {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f2875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f2879f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f2880t;

    public /* synthetic */ g(fz.c cVar, Object obj, int i11, long j11, int i12, String str, long j12, int i13) {
        this.f2874a = i13;
        this.f2875b = cVar;
        this.H = obj;
        this.f2876c = i11;
        this.f2877d = j11;
        this.f2878e = i12;
        this.f2879f = str;
        this.f2880t = j12;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:34:0x0107  */
    /* JADX WARN: Code duplicated, block: B:37:0x0138  */
    /* JADX WARN: Code duplicated, block: B:38:0x013c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0177  */
    /* JADX WARN: Code duplicated, block: B:45:0x019f  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x01be  */
    /* JADX WARN: Code duplicated, block: B:56:0x0245  */
    /* JADX WARN: Code duplicated, block: B:58:0x0276  */
    /* JADX WARN: Code duplicated, block: B:59:0x027a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0295  */
    /* JADX WARN: Code duplicated, block: B:67:0x031f  */
    /* JADX WARN: Code duplicated, block: B:70:0x032d  */
    /* JADX WARN: Code duplicated, block: B:72:0x034e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11;
        y2.h hVar;
        int iHashCode;
        long j11;
        float f5;
        j0.d dVar;
        int iHashCode2;
        y2.h hVar2;
        d0 d0Var;
        y2.h hVar3;
        l1.s sVar;
        ?? r9;
        l1.s sVar2;
        int iHashCode3;
        switch (this.f2874a) {
            case 0:
                CourseLesson courseLesson = (CourseLesson) this.H;
                v Card = (v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar3 = (l1.s) nVar;
                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarD = e2.d(oVar, 1.0f);
                    fz.c cVar = this.f2875b;
                    boolean zF = sVar3.f(cVar) | sVar3.h(courseLesson);
                    Object objQ = sVar3.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new e(cVar, courseLesson, 0);
                        sVar3.o0(objQ);
                    }
                    z1.r rVarO = d0.n.o(rVarD, false, null, (fz.a) objQ, 15);
                    float f11 = 20;
                    z1.r rVarE = j0.c.E(rVarO, f11, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                    a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar3, 48);
                    int iHashCode4 = Long.hashCode(sVar3.T);
                    q1 q1VarL = sVar3.l();
                    z1.r rVarC = z1.a.c(sVar3, rVarE);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    y2.h hVar4 = y2.j.f56917f;
                    t.J(hVar4, a2VarA, sVar3);
                    y2.h hVar5 = y2.j.f56916e;
                    t.J(hVar5, q1VarL, sVar3);
                    y2.h hVar6 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar3, iHashCode4, hVar6);
                    }
                    y2.h hVar7 = y2.j.f56915d;
                    t.J(hVar7, rVarC, sVar3);
                    q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode5 = Long.hashCode(sVar3.T);
                    q1 q1VarL2 = sVar3.l();
                    z1.r rVarC2 = z1.a.c(sVar3, oVar);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    t.J(hVar4, q0VarD, sVar3);
                    t.J(hVar5, q1VarL2, sVar3);
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar6);
                    }
                    t.J(hVar7, rVarC2, sVar3);
                    z1.r rVarN = e2.n(oVar, 42);
                    r0.e eVarD = r0.f.d(12);
                    long j12 = this.f2877d;
                    j0.o.a(d0.n.h(rVarN, j12, eVarD), sVar3, 0);
                    d0.n.c(se.k.y(this.f2878e, sVar3, 0), null, e2.n(oVar, 30), null, null, d0.n.t(sVar3) ? 0.8f : 1.0f, null, sVar3, 432, 88);
                    sVar3.p(true);
                    z1.r rVarE2 = j0.c.E(oVar, 18, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    z1.r rVarP = w4.c.p(1.0f, true, rVarE2);
                    u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, 0);
                    int iHashCode6 = Long.hashCode(sVar3.T);
                    q1 q1VarL3 = sVar3.l();
                    z1.r rVarC3 = z1.a.c(sVar3, rVarP);
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar);
                    } else {
                        sVar3.r0();
                    }
                    t.J(hVar4, uVarA, sVar3);
                    t.J(hVar5, q1VarL3, sVar3);
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode6))) {
                        defpackage.e.A(iHashCode6, sVar3, iHashCode6, hVar6);
                    }
                    t.J(hVar7, rVarC3, sVar3);
                    ua.b(this.f2879f, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar3.j(ua.f31167a), this.f2880t, j3.A(16), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar3, 0, 0, 65534);
                    sVar3.p(true);
                    if (courseLesson.getCanAccess()) {
                        sVar3.d0(-2026545672);
                        if (courseLesson.getLessonType() != LessonType.TypeCoffeeBreak) {
                            sVar3.d0(-2026468389);
                            d0.n.c(se.k.y(this.f2876c, sVar3, 0), null, d2.h.i(oVar, iu.k.p(sVar3), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j12, 5), sVar3, 48, 56);
                        } else {
                            sVar3.d0(-2040595678);
                        }
                        sVar3.p(false);
                        sVar3.p(false);
                    } else {
                        sVar3.d0(-2026762920);
                        d0.n.c(se.k.y(R.drawable.ic_lesson_index_pro, sVar3, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 48, 124);
                        sVar3.p(false);
                    }
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                break;
            default:
                sf sfVar = (sf) this.H;
                v Card2 = (v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                l1.s sVar4 = (l1.s) nVar2;
                if (sVar4.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z1.o oVar2 = z1.o.f58481a;
                    z1.r rVarD2 = e2.d(oVar2, 1.0f);
                    fz.c cVar2 = this.f2875b;
                    boolean zF2 = sVar4.f(cVar2) | sVar4.f(sfVar);
                    Object objQ2 = sVar4.Q();
                    if (zF2 || objQ2 == l1.m.f39353a) {
                        objQ2 = new f(0, cVar2, sfVar);
                        sVar4.o0(objQ2);
                    }
                    z1.r rVarO2 = d0.n.o(rVarD2, false, null, (fz.a) objQ2, 15);
                    float f12 = 20;
                    z1.r rVarE3 = j0.c.E(rVarO2, f12, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                    a2 a2VarA2 = z1.a(j0.i.f35303a, z1.c.M, sVar4, 48);
                    int iHashCode7 = Long.hashCode(sVar4.T);
                    q1 q1VarL4 = sVar4.l();
                    z1.r rVarC4 = z1.a.c(sVar4, rVarE3);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    y2.h hVar8 = y2.j.f56917f;
                    t.J(hVar8, a2VarA2, sVar4);
                    y2.h hVar9 = y2.j.f56916e;
                    t.J(hVar9, q1VarL4, sVar4);
                    y2.h hVar10 = y2.j.f56918g;
                    if (sVar4.S) {
                        i11 = 16;
                    } else {
                        i11 = 16;
                        if (!kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode7))) {
                        }
                        hVar = y2.j.f56915d;
                        t.J(hVar, rVarC4, sVar4);
                        q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                        iHashCode = Long.hashCode(sVar4.T);
                        q1 q1VarL5 = sVar4.l();
                        z1.r rVarC5 = z1.a.c(sVar4, oVar2);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar2);
                        } else {
                            sVar4.r0();
                        }
                        t.J(hVar8, q0VarD2, sVar4);
                        t.J(hVar9, q1VarL5, sVar4);
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar4, iHashCode, hVar10);
                        }
                        t.J(hVar, rVarC5, sVar4);
                        z1.r rVarN2 = e2.n(oVar2, 42);
                        r0.e eVarD2 = r0.f.d(12);
                        j11 = this.f2877d;
                        j0.o.a(d0.n.h(rVarN2, j11, eVarD2), sVar4, 0);
                        k2.b bVarY = se.k.y(this.f2878e, sVar4, 0);
                        z1.r rVarN3 = e2.n(oVar2, 30);
                        if (d0.n.t(sVar4)) {
                            f5 = 0.8f;
                        } else {
                            f5 = 1.0f;
                        }
                        d0.n.c(bVarY, null, rVarN3, null, null, f5, null, sVar4, 432, 88);
                        sVar4.p(true);
                        z1.r rVarE4 = j0.c.E(oVar2, 18, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        z1.r rVarP2 = w4.c.p(1.0f, true, rVarE4);
                        dVar = j0.i.f35305c;
                        u uVarA2 = j0.t.a(dVar, z1.c.O, sVar4, 0);
                        iHashCode2 = Long.hashCode(sVar4.T);
                        q1 q1VarL6 = sVar4.l();
                        z1.r rVarC6 = z1.a.c(sVar4, rVarP2);
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(iVar2);
                        } else {
                            sVar4.r0();
                        }
                        t.J(hVar8, uVarA2, sVar4);
                        t.J(hVar9, q1VarL6, sVar4);
                        if (sVar4.S && kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode2))) {
                            hVar2 = hVar10;
                        } else {
                            hVar2 = hVar10;
                            defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar2);
                        }
                        t.J(hVar, rVarC6, sVar4);
                        d0Var = ua.f31167a;
                        hVar3 = hVar2;
                        ua.b(this.f2879f, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(d0Var), this.f2880t, j3.A(i11), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 0, 0, 65534);
                        sVar = sVar4;
                        sVar.p(true);
                        if (sfVar.f50393d == StoryLessonType.TypeStoryLeaderBoard) {
                            sVar.d0(1914766597);
                            z1.h hVar11 = z1.c.P;
                            z1.r rVarE5 = j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, 11);
                            u uVarA3 = j0.t.a(dVar, hVar11, sVar, 48);
                            iHashCode3 = Long.hashCode(sVar.T);
                            q1 q1VarL7 = sVar.l();
                            z1.r rVarC7 = z1.a.c(sVar, rVarE5);
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar2);
                            } else {
                                sVar.r0();
                            }
                            t.J(hVar8, uVarA3, sVar);
                            t.J(hVar9, q1VarL7, sVar);
                            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                            }
                            t.J(hVar, rVarC7, sVar);
                            d0.n.c(se.k.y(R.drawable.ic_lesson_story_share_people, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
                            ua.b(x.q0(ub.a.e0(sVar, R.string.s_joined_voice_share), "%s", sfVar.f50395f), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), f0.e(4287203721L), j3.A(9), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 0, 0, 65534);
                            l1.s sVar5 = sVar;
                            sVar5.p(true);
                            r9 = 0;
                            sVar2 = sVar5;
                        } else {
                            r9 = 0;
                            sVar.d0(1905946911);
                            sVar2 = sVar;
                        }
                        sVar2.p(r9);
                        if (sfVar.f50394e) {
                            sVar2.d0(1915823666);
                            d0.n.c(se.k.y(this.f2876c, sVar2, r9), null, d2.h.i(oVar2, iu.k.p(sVar2), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j11, 5), sVar2, 48, 56);
                            sVar2.p(false);
                        } else {
                            sVar2.d0(1915612277);
                            d0.n.c(se.k.y(R.drawable.ic_lesson_index_pro, sVar2, r9), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 124);
                            sVar2.p(r9);
                        }
                        sVar2.p(true);
                    }
                    defpackage.e.A(iHashCode7, sVar4, iHashCode7, hVar10);
                    hVar = y2.j.f56915d;
                    t.J(hVar, rVarC4, sVar4);
                    q0 q0VarD3 = j0.o.d(z1.c.f58467e, false);
                    iHashCode = Long.hashCode(sVar4.T);
                    q1 q1VarL8 = sVar4.l();
                    z1.r rVarC8 = z1.a.c(sVar4, oVar2);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    t.J(hVar8, q0VarD3, sVar4);
                    t.J(hVar9, q1VarL8, sVar4);
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar10);
                    } else {
                        defpackage.e.A(iHashCode, sVar4, iHashCode, hVar10);
                    }
                    t.J(hVar, rVarC8, sVar4);
                    z1.r rVarN4 = e2.n(oVar2, 42);
                    r0.e eVarD3 = r0.f.d(12);
                    j11 = this.f2877d;
                    j0.o.a(d0.n.h(rVarN4, j11, eVarD3), sVar4, 0);
                    k2.b bVarY2 = se.k.y(this.f2878e, sVar4, 0);
                    z1.r rVarN5 = e2.n(oVar2, 30);
                    if (d0.n.t(sVar4)) {
                        f5 = 0.8f;
                    } else {
                        f5 = 1.0f;
                    }
                    d0.n.c(bVarY2, null, rVarN5, null, null, f5, null, sVar4, 432, 88);
                    sVar4.p(true);
                    z1.r rVarE6 = j0.c.E(oVar2, 18, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    z1.r rVarP3 = w4.c.p(1.0f, true, rVarE6);
                    dVar = j0.i.f35305c;
                    u uVarA4 = j0.t.a(dVar, z1.c.O, sVar4, 0);
                    iHashCode2 = Long.hashCode(sVar4.T);
                    q1 q1VarL9 = sVar4.l();
                    z1.r rVarC9 = z1.a.c(sVar4, rVarP3);
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar2);
                    } else {
                        sVar4.r0();
                    }
                    t.J(hVar8, uVarA4, sVar4);
                    t.J(hVar9, q1VarL9, sVar4);
                    if (sVar4.S) {
                        hVar2 = hVar10;
                        defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar2);
                    } else {
                        hVar2 = hVar10;
                        defpackage.e.A(iHashCode2, sVar4, iHashCode2, hVar2);
                    }
                    t.J(hVar, rVarC9, sVar4);
                    d0Var = ua.f31167a;
                    hVar3 = hVar2;
                    ua.b(this.f2879f, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(d0Var), this.f2880t, j3.A(i11), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar4, 0, 0, 65534);
                    sVar = sVar4;
                    sVar.p(true);
                    if (sfVar.f50393d == StoryLessonType.TypeStoryLeaderBoard) {
                        sVar.d0(1914766597);
                        z1.h hVar12 = z1.c.P;
                        z1.r rVarE7 = j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, 11);
                        u uVarA5 = j0.t.a(dVar, hVar12, sVar, 48);
                        iHashCode3 = Long.hashCode(sVar.T);
                        q1 q1VarL10 = sVar.l();
                        z1.r rVarC10 = z1.a.c(sVar, rVarE7);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar2);
                        } else {
                            sVar.r0();
                        }
                        t.J(hVar8, uVarA5, sVar);
                        t.J(hVar9, q1VarL10, sVar);
                        if (sVar.S) {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        } else {
                            defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
                        }
                        t.J(hVar, rVarC10, sVar);
                        d0.n.c(se.k.y(R.drawable.ic_lesson_story_share_people, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
                        ua.b(x.q0(ub.a.e0(sVar, R.string.s_joined_voice_share), "%s", sfVar.f50395f), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), f0.e(4287203721L), j3.A(9), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 0, 0, 65534);
                        l1.s sVar6 = sVar;
                        sVar6.p(true);
                        r9 = 0;
                        sVar2 = sVar6;
                    } else {
                        r9 = 0;
                        sVar.d0(1905946911);
                        sVar2 = sVar;
                    }
                    sVar2.p(r9);
                    if (sfVar.f50394e) {
                        sVar2.d0(1915612277);
                        d0.n.c(se.k.y(R.drawable.ic_lesson_index_pro, sVar2, r9), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 124);
                        sVar2.p(r9);
                    } else {
                        sVar2.d0(1915823666);
                        d0.n.c(se.k.y(this.f2876c, sVar2, r9), null, d2.h.i(oVar2, iu.k.p(sVar2), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(j11, 5), sVar2, 48, 56);
                        sVar2.p(false);
                    }
                    sVar2.p(true);
                } else {
                    sVar4.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
