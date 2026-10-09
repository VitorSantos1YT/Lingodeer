package uu;

import android.content.res.Resources;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.dc;
import h1.fc;
import h1.g7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.b2;
import j0.t;
import j0.u;
import j0.v;
import j0.z1;
import j3.y0;
import kotlin.jvm.internal.m;
import l1.c3;
import l1.n;
import l1.q1;
import l1.s;
import qy.b0;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Resources f53135b;

    public /* synthetic */ c(Resources resources, int i11) {
        this.f53134a = i11;
        this.f53135b = resources;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f53134a) {
            case 0:
                b2 AppGradientButton = (b2) obj;
                n nVar = (n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                m.f(AppGradientButton, "$this$AppGradientButton");
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String string = this.f53135b.getString(R.string.sign_up);
                    m.e(string, "getString(...)");
                    iu.k.d(string, null, null, sVar, 0, 6);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                v Card = (v) obj;
                n nVar2 = (n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                m.f(Card, "$this$Card");
                s sVar2 = (s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    o oVar = o.f58481a;
                    r rVarA = j0.c.A(oVar, 24);
                    float f5 = 16;
                    u uVarA = t.a(j0.i.g(f5), z1.c.O, sVar2, 6);
                    int iHashCode = Long.hashCode(sVar2.T);
                    q1 q1VarL = sVar2.l();
                    r rVarC = z1.a.c(sVar2, rVarA);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, uVarA, sVar2);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar2);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar2);
                    Resources resources = this.f53135b;
                    String string2 = resources.getString(R.string.login);
                    m.e(string2, "getString(...)");
                    c3 c3Var = fc.f30256a;
                    ua.b(string2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar2.j(c3Var)).f30174g, sVar2, 0, 0, 65534);
                    a2 a2VarA = z1.a(j0.i.g(f5), z1.c.M, sVar2, 54);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    r rVarC2 = z1.a.c(sVar2, oVar);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar, a2VarA, sVar2);
                    l1.t.J(hVar2, q1VarL2, sVar2);
                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar2);
                    g7.b(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 31, 0L, 0L, sVar2, null);
                    String string3 = resources.getString(R.string.please_wait);
                    m.e(string3, "getString(...)");
                    ua.b(string3, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar2.j(c3Var)).f30178k, sVar2, 0, 0, 65534);
                    sVar2.p(true);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                b2 TextButton = (b2) obj;
                n nVar3 = (n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                m.f(TextButton, "$this$TextButton");
                s sVar3 = (s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String string4 = this.f53135b.getString(R.string.forgot_password);
                    m.e(string4, "getString(...)");
                    iu.k.n(string4, null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, y0.a((y0) sVar3.j(ua.f31167a), ((s1) sVar3.j(v1.f31180a)).f31036s, j3.A(14), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar3, 0, 0, 65534);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                b2 AppGradientButton2 = (b2) obj;
                n nVar4 = (n) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                m.f(AppGradientButton2, "$this$AppGradientButton");
                s sVar4 = (s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String string5 = this.f53135b.getString(R.string.sign_in);
                    m.e(string5, "getString(...)");
                    iu.k.d(string5, null, null, sVar4, 0, 6);
                } else {
                    sVar4.W();
                }
                break;
            default:
                b2 TextButton2 = (b2) obj;
                n nVar5 = (n) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                m.f(TextButton2, "$this$TextButton");
                s sVar5 = (s) nVar5;
                if (sVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    String string6 = this.f53135b.getString(R.string.sign_up);
                    m.e(string6, "getString(...)");
                    ua.b(string6, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(((dc) sVar5.j(fc.f30256a)).f30175h, ((s1) sVar5.j(v1.f31180a)).f31034q, 0L, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777210), sVar5, 0, 0, 65534);
                } else {
                    sVar5.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
