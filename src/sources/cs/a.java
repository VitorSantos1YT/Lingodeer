package cs;

import bp.h0;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseCharacterGroup;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.yalantis.ucrop.view.CropImageView;
import dt.h2;
import fz.e;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.r9;
import h1.s1;
import h1.ua;
import h1.v1;
import hh.p0;
import ht.l;
import ht.q;
import j0.a2;
import j0.e2;
import j0.u;
import j0.z1;
import j3.y0;
import j9.v;
import java.util.ArrayList;
import java.util.List;
import js.i;
import km.f0;
import kotlin.jvm.internal.m;
import kr.l1;
import kv.i0;
import l1.b1;
import l1.c3;
import l1.g;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import qy.b0;
import rt.nd;
import rt.x;
import rt.z0;
import tg.v0;
import y2.h;
import y2.j;
import y2.k;
import ys.a3;
import ys.j3;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22457f;

    public /* synthetic */ a(int i11, Object obj, fz.a aVar, fz.a aVar2, Object obj2, int i12, int i13) {
        this.f22452a = i13;
        this.f22454c = i11;
        this.f22455d = obj;
        this.f22453b = aVar;
        this.f22456e = aVar2;
        this.f22457f = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x03ae  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z11;
        int i11;
        int i12;
        String[] strArrD;
        g gVar;
        h hVar;
        b1 b1Var;
        switch (this.f22452a) {
            case 0:
                ((Integer) obj2).getClass();
                hz.b.a((v) this.f22455d, (String) this.f22456e, (fz.a) this.f22453b, (i) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                dt.e.o((q) this.f22455d, (l) this.f22456e, (fz.a) this.f22453b, (fz.a) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
            case 2:
                List list = (List) this.f22455d;
                String str = (String) this.f22456e;
                ((Integer) obj2).getClass();
                dt.e.I(t.M(this.f22454c | 1), (fz.a) this.f22453b, (fz.c) this.f22457f, str, list, (n) obj);
                break;
            case 3:
                ((Integer) obj2).intValue();
                iv.a.s((i0) this.f22455d, (fz.a) this.f22453b, (fz.a) this.f22456e, (fz.c) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
            case 4:
                b1 b1Var2 = (b1) this.f22455d;
                b1 b1Var3 = (b1) this.f22456e;
                b1 b1Var4 = (b1) this.f22453b;
                b1 b1Var5 = (b1) this.f22457f;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o oVar = o.f58481a;
                    r rVarY = d0.n.y(e2.e(oVar, 1.0f), d0.n.u(sVar), true, 12);
                    u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL = sVar.l();
                    r rVarC = z1.a.c(sVar, rVarY);
                    k.J.getClass();
                    y2.i iVar = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    h hVar2 = j.f56917f;
                    t.J(hVar2, uVarA, sVar);
                    h hVar3 = j.f56916e;
                    t.J(hVar3, q1VarL, sVar);
                    h hVar4 = j.f56918g;
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                    }
                    h hVar5 = j.f56915d;
                    t.J(hVar5, rVarC, sVar);
                    int i13 = this.f22454c;
                    if (i13 == 0) {
                        z11 = false;
                        i11 = 1796255189;
                        i12 = R.array.cn_display_item;
                        strArrD = p0.D(sVar, i11, i12, sVar, z11);
                    } else if (i13 == 1) {
                        z11 = false;
                        i11 = 1796258971;
                        i12 = R.array.japanese_display_item;
                        strArrD = p0.D(sVar, i11, i12, sVar, z11);
                    } else if (i13 == 2) {
                        z11 = false;
                        i11 = 1796262937;
                        i12 = R.array.korean_display_item;
                        strArrD = p0.D(sVar, i11, i12, sVar, z11);
                    } else {
                        if (i13 == 51 || i13 == 55) {
                            z11 = false;
                            i11 = 1796266838;
                            i12 = R.array.ara_display_item;
                        } else if (i13 == 57) {
                            z11 = false;
                            i11 = 1796277015;
                            i12 = R.array.thai_display_item;
                        } else if (i13 == 61) {
                            z11 = false;
                            i11 = 1796270264;
                            i12 = R.array.hindi_display_item;
                        } else if (i13 != 65) {
                            switch (i13) {
                                case 11:
                                    z11 = false;
                                    i11 = 1796255189;
                                    i12 = R.array.cn_display_item;
                                    break;
                                case 12:
                                    z11 = false;
                                    i11 = 1796258971;
                                    i12 = R.array.japanese_display_item;
                                    break;
                                case 13:
                                    z11 = false;
                                    i11 = 1796262937;
                                    i12 = R.array.korean_display_item;
                                    break;
                                default:
                                    sVar.d0(1796280059);
                                    z11 = false;
                                    sVar.p(false);
                                    strArrD = new String[0];
                                    break;
                            }
                        } else {
                            z11 = false;
                            strArrD = p0.D(sVar, 1796273654, R.array.grk_display_item, sVar, false);
                        }
                        strArrD = p0.D(sVar, i11, i12, sVar, z11);
                    }
                    String[] strArr = strArrD;
                    int length = strArr.length;
                    g gVar2 = l1.m.f39353a;
                    if (length == 0) {
                        sVar.d0(-161669421);
                        sVar.p(z11);
                        hVar = hVar3;
                        gVar = gVar2;
                    } else {
                        sVar.d0(-149801536);
                        y0 y0VarA = y0.a(((dc) sVar.j(fc.f30256a)).f30175h, ((s1) sVar.j(v1.f31180a)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214);
                        String strE = ys.a.E(sVar, i13);
                        gVar = gVar2;
                        hVar = hVar3;
                        ua.b(strE, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, 0, 0, 65534);
                        int iIntValue2 = ((Number) b1Var2.getValue()).intValue();
                        Object objQ = sVar.Q();
                        if (objQ == gVar) {
                            sVar = sVar;
                            objQ = new h0(25, b1Var2);
                            sVar.o0(objQ);
                        }
                        sVar = sVar;
                        ys.a.x(strArr, iIntValue2, (fz.c) objQ, false, sVar, 384, 8);
                        sVar.p(false);
                    }
                    r rVarE = e2.e(oVar, 1.0f);
                    j0.e eVar = j0.i.f35309g;
                    z1.i iVar2 = z1.c.M;
                    a2 a2VarA = z1.a(eVar, iVar2, sVar, 54);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL2 = sVar.l();
                    r rVarC2 = z1.a.c(sVar, rVarE);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(hVar2, a2VarA, sVar);
                    t.J(hVar, q1VarL2, sVar);
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
                    }
                    t.J(hVar5, rVarC2, sVar);
                    String strE0 = ub.a.e0(sVar, R.string.show_translation);
                    c3 c3Var = fc.f30256a;
                    y0 y0Var = ((dc) sVar.j(c3Var)).f30175h;
                    c3 c3Var2 = v1.f31180a;
                    s sVar2 = sVar;
                    ua.b(strE0, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, ((s1) sVar.j(c3Var2)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar2, 0, 0, 65534);
                    boolean zBooleanValue = ((Boolean) b1Var3.getValue()).booleanValue();
                    Object objQ2 = sVar2.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new h0(26, b1Var3);
                        sVar2.o0(objQ2);
                    }
                    r9.a(zBooleanValue, (fz.c) objQ2, null, false, null, sVar2, 48, 124);
                    sVar2.p(true);
                    r rVarE2 = e2.e(oVar, 1.0f);
                    a2 a2VarA2 = z1.a(eVar, iVar2, sVar2, 54);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    q1 q1VarL3 = sVar2.l();
                    r rVarC3 = z1.a.c(sVar2, rVarE2);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    t.J(hVar2, a2VarA2, sVar2);
                    t.J(hVar, q1VarL3, sVar2);
                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar4);
                    }
                    t.J(hVar5, rVarC3, sVar2);
                    ua.b(ub.a.e0(sVar2, R.string.audio_speed), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(((dc) sVar2.j(c3Var)).f30175h, ((s1) sVar2.j(c3Var2)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar2, 0, 0, 65534);
                    a2 a2VarA3 = z1.a(j0.i.f35303a, iVar2, sVar2, 48);
                    int iHashCode4 = Long.hashCode(sVar2.T);
                    q1 q1VarL4 = sVar2.l();
                    r rVarC4 = z1.a.c(sVar2, oVar);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    t.J(hVar2, a2VarA3, sVar2);
                    t.J(hVar, q1VarL4, sVar2);
                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                        defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar4);
                    }
                    t.J(hVar5, rVarC4, sVar2);
                    Object objQ3 = sVar2.Q();
                    if (objQ3 == gVar) {
                        b1Var = b1Var4;
                        objQ3 = new h2(20, b1Var);
                        sVar2.o0(objQ3);
                    } else {
                        b1Var = b1Var4;
                    }
                    k7.h((fz.a) objQ3, null, ((Number) b1Var.getValue()).intValue() > 50, null, jr.a.f36559d, sVar2, 196614, 26);
                    float f5 = 8;
                    ua.b(w4.c.f(((Number) b1Var.getValue()).intValue(), "%"), j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 48, 0, 131068);
                    Object objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new h2(19, b1Var);
                        sVar2.o0(objQ4);
                    }
                    k7.h((fz.a) objQ4, null, ((Number) b1Var.getValue()).intValue() < 150, null, jr.a.f36560e, sVar2, 196614, 26);
                    sVar2.p(true);
                    sVar2.p(true);
                    ua.b(ub.a.e0(sVar2, R.string.textsize), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(((dc) sVar2.j(c3Var)).f30175h, ((s1) sVar2.j(c3Var2)).f31034q, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar2, 0, 0, 65534);
                    int iIntValue3 = ((Number) b1Var5.getValue()).intValue();
                    r rVarE3 = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    Object objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        objQ5 = new h0(24, b1Var5);
                        sVar2.o0(objQ5);
                    }
                    ys.a.y(iIntValue3, 432, (fz.c) objQ5, sVar2, rVarE3);
                    sVar2.p(true);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
            case 5:
                ((Integer) obj2).getClass();
                jr.a.q(this.f22454c, (l1) this.f22455d, (fz.a) this.f22453b, (fz.a) this.f22456e, (fz.a) this.f22457f, (n) obj, t.M(3073));
                break;
            case 6:
                ((Integer) obj2).getClass();
                km.b1.i((f0) this.f22455d, (fz.c) this.f22456e, (fz.c) this.f22453b, (r) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                mt.g.o((x) this.f22455d, (fz.a) this.f22453b, (e) this.f22456e, (fz.a) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                mt.g.t(this.f22454c, (fz.c) this.f22455d, (fz.a) this.f22453b, (fz.a) this.f22456e, (z0) this.f22457f, (n) obj, t.M(49));
                break;
            case 9:
                ((Integer) obj2).getClass();
                nh.a.e((List) this.f22455d, (fz.c) this.f22456e, (fz.c) this.f22453b, (r) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                nn.c.p((String) this.f22456e, (String) this.f22455d, (String) this.f22453b, (r) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ub.a.J((ou.c) this.f22455d, (nu.e) this.f22456e, (r) this.f22453b, (ou.e) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                nv.a.e((sv.b) this.f22455d, (fz.a) this.f22453b, (fz.a) this.f22456e, (fz.c) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
            case 13:
                String str2 = (String) this.f22456e;
                r rVar = (r) this.f22455d;
                String str3 = (String) this.f22457f;
                ((Integer) obj2).getClass();
                nv.a.l(t.M(this.f22454c | 1), (fz.a) this.f22453b, str2, str3, (n) obj, rVar);
                break;
            case 14:
                ((Integer) obj2).getClass();
                pv.a.a((ArrayList) this.f22455d, (String) this.f22456e, (fz.a) this.f22453b, (fz.c) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                qu.b.h((LeaderBoardUser) this.f22455d, (r) this.f22456e, (fz.c) this.f22453b, (fz.c) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                ((t1.d) this.f22455d).d(this.f22456e, this.f22453b, this.f22457f, (n) obj, t.M(this.f22454c) | 1);
                break;
            case 17:
                ((Integer) obj2).getClass();
                v0.a((tg.i0) this.f22455d, (r) this.f22456e, (fz.c) this.f22453b, (fz.c) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                vr.b.e((String) this.f22456e, (fz.c) this.f22455d, (fz.a) this.f22453b, (fz.a) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                vr.g.c((CourseCharacterGroup) this.f22455d, (fz.c) this.f22456e, (fz.a) this.f22453b, (r) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                a3.j((String) this.f22456e, (String) this.f22455d, (z1.h) this.f22453b, this.f22454c, (r) this.f22457f, (n) obj, t.M(385));
                break;
            default:
                ((Integer) obj2).getClass();
                j3.e((nd) this.f22455d, (r) this.f22456e, (fz.a) this.f22453b, (fz.c) this.f22457f, (n) obj, t.M(this.f22454c | 1));
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ a(int i11, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4) {
        this.f22452a = 4;
        this.f22454c = i11;
        this.f22455d = b1Var;
        this.f22456e = b1Var2;
        this.f22453b = b1Var3;
        this.f22457f = b1Var4;
    }

    public /* synthetic */ a(Object obj, fz.a aVar, qy.e eVar, qy.e eVar2, int i11, int i12) {
        this.f22452a = i12;
        this.f22455d = obj;
        this.f22453b = aVar;
        this.f22456e = eVar;
        this.f22457f = eVar2;
        this.f22454c = i11;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i11, int i12) {
        this.f22452a = i12;
        this.f22455d = obj;
        this.f22456e = obj2;
        this.f22453b = obj3;
        this.f22457f = obj4;
        this.f22454c = i11;
    }

    public /* synthetic */ a(String str, Object obj, Object obj2, Object obj3, int i11, int i12) {
        this.f22452a = i12;
        this.f22456e = str;
        this.f22455d = obj;
        this.f22453b = obj2;
        this.f22457f = obj3;
        this.f22454c = i11;
    }

    public /* synthetic */ a(String str, String str2, z1.h hVar, int i11, r rVar, int i12) {
        this.f22452a = 20;
        this.f22456e = str;
        this.f22455d = str2;
        this.f22453b = hVar;
        this.f22454c = i11;
        this.f22457f = rVar;
    }

    public /* synthetic */ a(String str, r rVar, String str2, fz.a aVar, int i11) {
        this.f22452a = 13;
        this.f22456e = str;
        this.f22455d = rVar;
        this.f22457f = str2;
        this.f22453b = aVar;
        this.f22454c = i11;
    }
}
