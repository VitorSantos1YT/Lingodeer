package br;

import com.lingo.lingoskill.object.NewBillingTheme;
import com.lingodeer.data.model.DayStreakFinishedStatus;
import com.lingodeer.data.model.RecordingStatus;
import com.lingodeer.data.model.uistate.DayStreakUiState;
import com.lingodeer.data.model.uistate.LeaderBoardUiState;
import java.util.List;
import kr.s0;
import l1.b1;
import l1.q1;
import mt.g4;
import mt.j6;
import mt.w1;
import mt.y3;
import rt.ec;
import rt.fc;
import rt.gc;
import rt.l9;
import rt.nc;
import rt.o8;
import rt.qc;
import rt.rc;
import rt.x8;
import w2.q0;
import xu.a1;
import zu.k2;
import zu.y0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5024f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5025t;

    public /* synthetic */ d(DayStreakFinishedStatus dayStreakFinishedStatus, List list, fz.a aVar, fz.f fVar, fz.e eVar, fz.c cVar, int i11) {
        this.f5019a = 2;
        this.f5023e = dayStreakFinishedStatus;
        this.f5024f = list;
        this.f5022d = aVar;
        this.f5025t = fVar;
        this.H = eVar;
        this.f5021c = cVar;
        this.f5020b = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5019a) {
            case 0:
                ((Integer) obj2).getClass();
                e.c((String) this.f5023e, (String) this.f5024f, (String) this.f5025t, (NewBillingTheme) this.H, (z1.r) this.f5021c, (fz.a) this.f5022d, (l1.n) obj, l1.t.M(this.f5020b | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                bt.b.e0((ou.c) this.f5023e, this.f5020b, (z1.r) this.f5021c, (fz.a) this.f5022d, (fz.e) this.f5024f, (fz.e) this.f5025t, (fz.c) this.H, (l1.n) obj, l1.t.M(221193));
                break;
            case 2:
                ((Integer) obj2).getClass();
                fu.a.h((DayStreakFinishedStatus) this.f5023e, (List) this.f5024f, (fz.a) this.f5022d, (fz.f) this.f5025t, (fz.e) this.H, (fz.c) this.f5021c, (l1.n) obj, l1.t.M(this.f5020b | 1));
                break;
            case 3:
                gc gcVar = (gc) this.f5023e;
                fz.a aVar = (fz.a) this.f5022d;
                rz.b0 b0Var = (rz.b0) this.f5024f;
                fz.a aVar2 = (fz.a) this.f5025t;
                b1 b1Var = (b1) this.H;
                rc rcVar = (rc) this.f5021c;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else if (kotlin.jvm.internal.m.a(gcVar, ec.f49694a)) {
                    sVar.d0(-2108861615);
                    sVar.p(false);
                } else {
                    if (!(gcVar instanceof fc)) {
                        throw nv.p.x(sVar, -2108862402, false);
                    }
                    sVar.d0(-950076747);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    float f5 = ((fc) gcVar).f49762a;
                    int iIntValue2 = ((Number) aVar.invoke()).intValue();
                    boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                    boolean zH = sVar.h(b0Var) | sVar.f(aVar2);
                    Object objQ = sVar.Q();
                    if (zH || objQ == l1.m.f39353a) {
                        objQ = new fs.f(b0Var, aVar2, 1);
                        sVar.o0(objQ);
                    }
                    ys.a.v(f5, iIntValue2, zBooleanValue, (fz.a) objQ, t1.e.d(-1074563274, new gs.s(rcVar, this.f5020b, 1), sVar), sVar, 24576);
                    sVar.p(true);
                    sVar.p(false);
                }
                return qy.b0.f48488a;
            case 4:
                ((Integer) obj2).intValue();
                jr.a.n((s0) this.f5023e, (fz.a) this.f5022d, (fz.a) this.f5024f, (fz.a) this.f5025t, (fz.a) this.H, (fz.a) this.f5021c, (l1.n) obj, l1.t.M(this.f5020b | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                km.b1.r((km.f0) this.f5023e, (fz.a) this.f5022d, (fz.c) this.f5024f, (fz.c) this.f5025t, (fz.a) this.H, (z1.r) this.f5021c, (l1.n) obj, l1.t.M(this.f5020b | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                mt.g.b((x8) this.f5023e, (List) this.f5024f, (fz.c) this.f5025t, (fz.c) this.H, (fz.c) this.f5022d, (z1.r) this.f5021c, (l1.n) obj, l1.t.M(this.f5020b | 1));
                break;
            case 7:
                qc qcVar = (qc) this.f5023e;
                l9 l9Var = (l9) this.f5024f;
                b1 b1Var2 = (b1) this.f5025t;
                b1 b1Var3 = (b1) this.H;
                b1 b1Var4 = (b1) this.f5021c;
                b1 b1Var5 = (b1) this.f5022d;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean z11 = qcVar.f50304d;
                    int i11 = ((nc) b1Var2.getValue()).f50153a;
                    int i12 = ((nc) b1Var2.getValue()).f50154b;
                    int i13 = ((nc) b1Var2.getValue()).f50155c;
                    Object objQ2 = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (objQ2 == gVar) {
                        objQ2 = new w1(27, b1Var3);
                        sVar2.o0(objQ2);
                    }
                    fz.a aVar3 = (fz.a) objQ2;
                    Object objQ3 = sVar2.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new w1(28, b1Var4);
                        sVar2.o0(objQ3);
                    }
                    fz.a aVar4 = (fz.a) objQ3;
                    Object objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new w1(29, b1Var5);
                        sVar2.o0(objQ4);
                    }
                    fz.a aVar5 = (fz.a) objQ4;
                    boolean z12 = qcVar.f50302b;
                    boolean zH2 = sVar2.h(l9Var);
                    Object objQ5 = sVar2.Q();
                    if (zH2 || objQ5 == gVar) {
                        objQ5 = new g4(l9Var, 0);
                        sVar2.o0(objQ5);
                    }
                    y3.c(i11, i12, i13, aVar3, aVar4, aVar5, z12, z11, this.f5020b, (fz.a) objQ5, sVar2, 224256, 0);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 8:
                ((Integer) obj2).getClass();
                j6.a((x8) this.f5023e, (o8) this.f5024f, (fz.c) this.f5025t, (fz.c) this.H, (fz.a) this.f5022d, (fz.e) this.f5021c, (l1.n) obj, l1.t.M(this.f5020b | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                com.bumptech.glide.d.a((z1.r) this.f5021c, this.f5020b, (ht.l) this.f5023e, (RecordingStatus) this.f5024f, (ht.q) this.f5025t, (fz.a) this.f5022d, (fz.a) this.H, (l1.n) obj, l1.t.M(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((t1.d) this.f5023e).a((Integer) this.f5024f, (Integer) this.f5025t, (Integer) this.H, (Integer) this.f5021c, (Integer) this.f5022d, (l1.n) obj, l1.t.M(this.f5020b) | 1);
                break;
            case 11:
                ((Integer) obj2).getClass();
                vr.g.d((String) this.f5023e, (zr.h) this.f5024f, (fz.c) this.f5025t, (fz.a) this.f5022d, (fz.c) this.H, (fz.a) this.f5021c, (l1.n) obj, l1.t.M(this.f5020b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                a1.f((k2) this.f5023e, (DayStreakUiState) this.f5024f, (zu.t) this.f5025t, (LeaderBoardUiState) this.H, (y0) this.f5021c, (fz.c) this.f5022d, (l1.n) obj, l1.t.M(this.f5020b | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ d(Object obj, fz.a aVar, Object obj2, qy.e eVar, Object obj3, Object obj4, int i11, int i12) {
        this.f5019a = i12;
        this.f5023e = obj;
        this.f5022d = aVar;
        this.f5024f = obj2;
        this.f5025t = eVar;
        this.H = obj3;
        this.f5021c = obj4;
        this.f5020b = i11;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11, int i12) {
        this.f5019a = i12;
        this.f5023e = obj;
        this.f5024f = obj2;
        this.f5025t = obj3;
        this.H = obj4;
        this.f5021c = obj5;
        this.f5022d = obj6;
        this.f5020b = i11;
    }

    public /* synthetic */ d(String str, zr.h hVar, fz.c cVar, fz.a aVar, fz.c cVar2, fz.a aVar2, int i11) {
        this.f5019a = 11;
        this.f5023e = str;
        this.f5024f = hVar;
        this.f5025t = cVar;
        this.f5022d = aVar;
        this.H = cVar2;
        this.f5021c = aVar2;
        this.f5020b = i11;
    }

    public /* synthetic */ d(ou.c cVar, int i11, z1.r rVar, fz.a aVar, fz.e eVar, fz.e eVar2, fz.c cVar2, int i12) {
        this.f5019a = 1;
        this.f5023e = cVar;
        this.f5020b = i11;
        this.f5021c = rVar;
        this.f5022d = aVar;
        this.f5024f = eVar;
        this.f5025t = eVar2;
        this.H = cVar2;
    }

    public /* synthetic */ d(x8 x8Var, Object obj, fz.c cVar, fz.c cVar2, qy.e eVar, Object obj2, int i11, int i12) {
        this.f5019a = i12;
        this.f5023e = x8Var;
        this.f5024f = obj;
        this.f5025t = cVar;
        this.H = cVar2;
        this.f5022d = eVar;
        this.f5021c = obj2;
        this.f5020b = i11;
    }

    public /* synthetic */ d(qc qcVar, int i11, l9 l9Var, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4) {
        this.f5019a = 7;
        this.f5023e = qcVar;
        this.f5020b = i11;
        this.f5024f = l9Var;
        this.f5025t = b1Var;
        this.H = b1Var2;
        this.f5021c = b1Var3;
        this.f5022d = b1Var4;
    }

    public /* synthetic */ d(z1.r rVar, int i11, ht.l lVar, RecordingStatus recordingStatus, ht.q qVar, fz.a aVar, fz.a aVar2, int i12) {
        this.f5019a = 9;
        this.f5021c = rVar;
        this.f5020b = i11;
        this.f5023e = lVar;
        this.f5024f = recordingStatus;
        this.f5025t = qVar;
        this.f5022d = aVar;
        this.H = aVar2;
    }
}
