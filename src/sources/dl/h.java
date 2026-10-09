package dl;

import a0.k0;
import ch.o0;
import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import com.lingo.lingoskill.turskill.ui.learn.TURSyllableIntroductionActivity;
import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import et.p;
import fr.j3;
import g2.v0;
import h1.dc;
import h1.fc;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.e2;
import j0.t;
import j0.u;
import j0.v;
import j3.p0;
import j3.y0;
import java.util.ArrayList;
import l1.c3;
import l1.q1;
import l1.s;
import oz.q;
import oz.x;
import qy.b0;
import w2.q0;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f23462c;

    public /* synthetic */ h(fz.a aVar, String str, int i11) {
        this.f23460a = i11;
        this.f23462c = aVar;
        this.f23461b = str;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f23460a;
        l1.g gVar = l1.m.f39353a;
        fz.a aVar = this.f23462c;
        b0 b0Var = b0.f48488a;
        o oVar = o.f58481a;
        int i12 = 0;
        switch (i11) {
            case 0:
                v Card = (v) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i13 = GRKSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    r rVarD = e2.d(oVar, 1.0f);
                    boolean zF = sVar.f(aVar);
                    Object objQ = sVar.Q();
                    if (zF || objQ == gVar) {
                        objQ = new o0(3, aVar);
                        sVar.o0(objQ);
                    }
                    r rVarO = d0.n.o(rVarD, false, null, (fz.a) objQ, 15);
                    u uVarA = t.a(j0.i.f35310h, z1.c.P, sVar, 54);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    r rVarC = z1.a.c(sVar, rVarO);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    ua.b(this.f23461b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), se.i.k(sVar, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 0, 0, 65534);
                    sVar.p(true);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                k0 AnimatedVisibility = (k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                c3 c3Var = v1.f31180a;
                s sVar2 = (s) ((l1.n) obj2);
                long j11 = ((s1) sVar2.j(c3Var)).f31025g;
                long j12 = ((s1) sVar2.j(c3Var)).f31024f;
                long j13 = ((s1) sVar2.j(c3Var)).f31024f;
                float f5 = 36;
                r rVarD2 = j0.c.D(oVar, f5, 29, f5, f5);
                boolean zF2 = sVar2.f(aVar);
                Object objQ2 = sVar2.Q();
                if (zF2 || objQ2 == gVar) {
                    objQ2 = new p(11, aVar);
                    sVar2.o0(objQ2);
                }
                gr.n.b(this.f23461b, j11, j12, j13, rVarD2, (fz.a) objQ2, sVar2, 0);
                break;
            case 2:
                v OutlinedCard = (v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                s sVar3 = (s) nVar2;
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    r rVarD3 = e2.d(oVar, 1.0f);
                    boolean zF3 = sVar3.f(aVar);
                    Object objQ3 = sVar3.Q();
                    if (zF3 || objQ3 == gVar) {
                        objQ3 = new mt.e2(29, aVar);
                        sVar3.o0(objQ3);
                    }
                    r rVarO2 = d0.n.o(rVarD3, false, null, (fz.a) objQ3, 15);
                    q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode2 = Long.hashCode(sVar3.T);
                    q1 q1VarL2 = sVar3.l();
                    r rVarC2 = z1.a.c(sVar3, rVarO2);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar3.h0();
                    if (sVar3.S) {
                        sVar3.k(iVar2);
                    } else {
                        sVar3.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar3);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar3);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar3);
                    ua.b(this.f23461b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar3.j(fc.f30256a)).f30169b, sVar3, 0, 0, 65534);
                    sVar3.p(true);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                v Card2 = (v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i14 = TURSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(Card2, "$this$Card");
                s sVar4 = (s) nVar3;
                if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    r rVarD4 = e2.d(oVar, 1.0f);
                    boolean zF4 = sVar4.f(aVar);
                    Object objQ4 = sVar4.Q();
                    if (zF4 || objQ4 == gVar) {
                        objQ4 = new wo.c(i12, aVar);
                        sVar4.o0(objQ4);
                    }
                    r rVarO3 = d0.n.o(rVarD4, false, null, (fz.a) objQ4, 15);
                    u uVarA2 = t.a(j0.i.f35310h, z1.c.P, sVar4, 54);
                    int iHashCode3 = Long.hashCode(sVar4.T);
                    q1 q1VarL3 = sVar4.l();
                    r rVarC3 = z1.a.c(sVar4, rVarO3);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(iVar3);
                    } else {
                        sVar4.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA2, sVar4);
                    l1.t.J(y2.j.f56916e, q1VarL3, sVar4);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar3);
                    }
                    l1.t.J(y2.j.f56915d, rVarC3, sVar4);
                    ua.b(this.f23461b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), se.i.k(sVar4, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar4, 0, 0, 65534);
                    sVar4.p(true);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                v Card3 = (v) obj;
                l1.n nVar4 = (l1.n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i15 = UKRSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(Card3, "$this$Card");
                s sVar5 = (s) nVar4;
                if (sVar5.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    r rVarD5 = e2.d(oVar, 1.0f);
                    boolean zF5 = sVar5.f(aVar);
                    Object objQ5 = sVar5.Q();
                    if (zF5 || objQ5 == gVar) {
                        objQ5 = new wo.c(1, aVar);
                        sVar5.o0(objQ5);
                    }
                    r rVarO4 = d0.n.o(rVarD5, false, null, (fz.a) objQ5, 15);
                    u uVarA3 = t.a(j0.i.f35310h, z1.c.P, sVar5, 54);
                    int iHashCode4 = Long.hashCode(sVar5.T);
                    q1 q1VarL4 = sVar5.l();
                    r rVarC4 = z1.a.c(sVar5, rVarO4);
                    y2.k.J.getClass();
                    y2.i iVar4 = y2.j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar4);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA3, sVar5);
                    l1.t.J(y2.j.f56916e, q1VarL4, sVar5);
                    y2.h hVar4 = y2.j.f56918g;
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar4);
                    }
                    l1.t.J(y2.j.f56915d, rVarC4, sVar5);
                    ua.b(this.f23461b, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(ua.f31167a), se.i.k(sVar5, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar5, 0, 0, 65534);
                    sVar5.p(true);
                } else {
                    sVar5.W();
                }
                break;
            default:
                v ModalBottomSheet = (v) obj;
                l1.n nVar5 = (l1.n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                s sVar6 = (s) nVar5;
                if (sVar6.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    float f11 = 16;
                    r rVarA = j0.c.A(e2.e(oVar, 1.0f), f11);
                    u uVarA4 = t.a(j0.i.f35305c, z1.c.P, sVar6, 48);
                    int iHashCode5 = Long.hashCode(sVar6.T);
                    q1 q1VarL5 = sVar6.l();
                    r rVarC5 = z1.a.c(sVar6, rVarA);
                    y2.k.J.getClass();
                    y2.i iVar5 = y2.j.f56913b;
                    sVar6.h0();
                    if (sVar6.S) {
                        sVar6.k(iVar5);
                    } else {
                        sVar6.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA4, sVar6);
                    l1.t.J(y2.j.f56916e, q1VarL5, sVar6);
                    y2.h hVar5 = y2.j.f56918g;
                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar6, iHashCode5, hVar5);
                    }
                    l1.t.J(y2.j.f56915d, rVarC5, sVar6);
                    j0.c.g(sVar6, e2.g(oVar, f11));
                    d0.n.c(se.k.y(R.drawable.ic_streak_freeze_apply_icon, sVar6, 0), null, e2.s(oVar, 42), null, w2.i.f54517d, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar6, 25008, 104);
                    float f12 = 32;
                    j0.c.g(sVar6, e2.g(oVar, f12));
                    sVar6.d0(-48630829);
                    StringBuilder sb2 = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    String strE0 = ub.a.e0(sVar6, R.string.streak_freeze_used_on_d);
                    String str = this.f23461b;
                    String strQ0 = x.q0(strE0, "%d", str);
                    sb2.append(x.q0(strQ0, "%d", str));
                    arrayList.add(new j3.d(q.I0(strQ0, str, 0, false, 6), str.length() + q.I0(strQ0, str, 0, false, 6), 8, new p0(((s1) sVar6.j(v1.f31180a)).f31017a, 0L, (n3.s) null, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65534), null));
                    String string = sb2.toString();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        arrayList2.add(((j3.d) arrayList.get(i16)).a(sb2.length()));
                    }
                    j3.h hVar6 = new j3.h(string, arrayList2);
                    sVar6.p(false);
                    ua.c(hVar6, null, 0L, j3.A(20), n3.s.H, 0L, null, 0L, 0, false, 0, 0, null, null, null, sVar6, 199680, 0, 262102);
                    j0.c.g(sVar6, e2.g(oVar, f12));
                    iu.k.e(this.f23462c, e2.e(oVar, 1.0f), false, 0L, null, xu.c.M, sVar6, 196656, 28);
                    ep.a.C(oVar, f11, sVar6, true);
                } else {
                    sVar6.W();
                }
                break;
        }
        return b0Var;
    }

    public /* synthetic */ h(String str, fz.a aVar) {
        this.f23460a = 1;
        this.f23461b = str;
        this.f23462c = aVar;
    }
}
