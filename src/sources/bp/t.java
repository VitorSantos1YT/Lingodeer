package bp;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import bt.b8;
import bt.g8;
import com.google.api.Service;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.k7;
import h1.ua;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import rt.ja;
import rt.ka;
import rt.r8;
import rt.se;
import rt.x8;
import rt.z5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4813e;

    public /* synthetic */ t(int i11, fz.c cVar, Object obj, Object obj2, Object obj3) {
        this.f4809a = i11;
        this.f4811c = obj;
        this.f4812d = obj2;
        this.f4810b = cVar;
        this.f4813e = obj3;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        boolean z11;
        l1.s sVar;
        long jC;
        long jC2;
        j3.y0 y0VarB;
        boolean z12;
        String word;
        ja jaVar;
        switch (this.f4809a) {
            case 0:
                ((Integer) obj2).getClass();
                g1.j((fz.c) this.f4810b, (fz.a) this.f4811c, (z1.r) this.f4812d, (gp.m) this.f4813e, (l1.n) obj, l1.t.M(49));
                break;
            case 1:
                l1.b1 b1Var = (l1.b1) this.f4810b;
                l1.b1 b1Var2 = (l1.b1) this.f4811c;
                ep.c cVar = (ep.c) this.f4812d;
                Context context = (Context) this.f4813e;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z1.r rVarE = j0.e2.e(z1.o.f58481a, 1.0f);
                    Object objQ = sVar2.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        objQ = new p(7, b1Var);
                        sVar2.o0(objQ);
                    }
                    z1.r rVarA = j0.c.A(iu.k.q(24582, 7, (fz.a) objQ, sVar2, rVarE, false), 16);
                    Object objQ2 = sVar2.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new h0(0, b1Var2);
                        sVar2.o0(objQ2);
                    }
                    z1.r rVarM = w2.a0.m(rVarA, (fz.c) objQ2);
                    j0.a2 a2VarA = j0.z1.a(j0.i.f35309g, z1.c.M, sVar2, 54);
                    int iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarM);
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
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar2);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.c.g(sVar2, new j0.i1(1.0f, true));
                    kotlin.jvm.internal.m.f(context, "context");
                    String deviceLanguage = cVar.f25725t;
                    kotlin.jvm.internal.m.e(deviceLanguage, "deviceLanguage");
                    ua.b(ep.c.r(R.string.ls_section_header, context, deviceLanguage), null, 0L, 0L, null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 196608, 0, 131038);
                    h1.r4.b(se.k.y(R.drawable.keyboard_arrow_down_24px, sVar2, 0), null, null, 0L, sVar2, 56, 12);
                    sVar2.p(true);
                } else {
                    sVar2.W();
                }
                return qy.b0.f48488a;
            case 2:
                ht.o oVar = (ht.o) this.f4810b;
                jt.u uVar = (jt.u) this.f4811c;
                ys.d0 d0Var = (ys.d0) this.f4812d;
                ot.a aVar = (ot.a) this.f4813e;
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar2;
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (oVar.f33757e) {
                        sVar3.d0(1103982109);
                    } else {
                        sVar3.d0(1109478440);
                        boolean z13 = uVar.f37192d.getValue() instanceof ht.i;
                        long j11 = ((h1.s1) sVar3.j(h1.v1.f31180a)).f31017a;
                        boolean zH = sVar3.h(d0Var) | sVar3.h(aVar) | sVar3.h(uVar);
                        Object objQ3 = sVar3.Q();
                        if (zH || objQ3 == l1.m.f39353a) {
                            objQ3 = new bt.j0(d0Var, aVar, uVar, 2);
                            sVar3.o0(objQ3);
                        }
                        dt.a0.b(z13, null, j11, (fz.a) objQ3, sVar3, 0, 2);
                    }
                    sVar3.p(false);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 3:
                ht.q qVar = (ht.q) this.f4811c;
                ht.l lVar = (ht.l) this.f4812d;
                final fz.c cVar2 = (fz.c) this.f4810b;
                final ot.t1 t1Var = (ot.t1) this.f4813e;
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar3;
                if (sVar4.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) sVar4.j(ju.f.f37373g)).booleanValue();
                    l1.g gVar2 = l1.m.f39353a;
                    if (zBooleanValue) {
                        sVar4.d0(-1641269556);
                        Object objQ4 = sVar4.Q();
                        if (objQ4 == gVar2) {
                            objQ4 = new bq.u(10);
                            sVar4.o0(objQ4);
                        }
                        fz.a aVar2 = (fz.a) objQ4;
                        boolean zF = sVar4.f(cVar2) | sVar4.h(t1Var);
                        Object objQ5 = sVar4.Q();
                        if (zF || objQ5 == gVar2) {
                            final int i11 = 0;
                            objQ5 = new fz.a() { // from class: bt.d6
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            String string = t1Var.f45998b.getAudioUri().toString();
                                            kotlin.jvm.internal.m.e(string, "toString(...)");
                                            cVar2.invoke(string);
                                            break;
                                        default:
                                            String string2 = t1Var.f45998b.getAudioUri().toString();
                                            kotlin.jvm.internal.m.e(string2, "toString(...)");
                                            cVar2.invoke(string2);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar4.o0(objQ5);
                        }
                        dt.e.o(qVar, lVar, aVar2, (fz.a) objQ5, sVar4, 384);
                        sVar4.p(false);
                    } else {
                        sVar4.d0(-1640890209);
                        z1.o oVar2 = z1.o.f58481a;
                        j0.c.g(sVar4, j0.e2.g(oVar2, 12));
                        z1.r rVarN = j0.e2.n(oVar2, 72);
                        boolean z14 = lVar instanceof ht.c;
                        boolean zF2 = sVar4.f(cVar2) | sVar4.h(t1Var);
                        Object objQ6 = sVar4.Q();
                        if (zF2 || objQ6 == gVar2) {
                            final int i12 = 1;
                            objQ6 = new fz.a() { // from class: bt.d6
                                @Override // fz.a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            String string = t1Var.f45998b.getAudioUri().toString();
                                            kotlin.jvm.internal.m.e(string, "toString(...)");
                                            cVar2.invoke(string);
                                            break;
                                        default:
                                            String string2 = t1Var.f45998b.getAudioUri().toString();
                                            kotlin.jvm.internal.m.e(string2, "toString(...)");
                                            cVar2.invoke(string2);
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            };
                            sVar4.o0(objQ6);
                        }
                        dt.a0.f(rVarN, CropImageView.DEFAULT_ASPECT_RATIO, z14, (fz.a) objQ6, sVar4, 6, 2);
                        ep.a.C(oVar2, 26, sVar4, false);
                    }
                } else {
                    sVar4.W();
                }
                return qy.b0.f48488a;
            case 4:
                g8 g8Var = (g8) this.f4810b;
                ot.a2 a2Var = (ot.a2) this.f4811c;
                CourseWord courseWord = (CourseWord) this.f4812d;
                l1.b3 b3Var = (l1.b3) this.f4813e;
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar4;
                if (sVar5.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    int i13 = b8.f5240b[g8Var.ordinal()];
                    if (i13 == 1) {
                        sVar5.d0(2087086693);
                        if (b8.f5239a[a2Var.ordinal()] == 1) {
                            sVar5.d0(2087156722);
                            String zhuYin = courseWord.getWordType() == 3 ? courseWord.getZhuYin() : courseWord.getTranslation();
                            if (courseWord.getWordType() == 3) {
                                sVar5.d0(2087479618);
                                jC = ct.c.c(sVar5);
                                sVar5.p(false);
                            } else {
                                sVar5.d0(2087582135);
                                jC = ((ct.b) sVar5.j(ct.c.f22476a)).f22468c;
                                sVar5.p(false);
                            }
                            long j12 = jC;
                            iu.k.c(zhuYin, null, j3.y0.a((j3.y0) sVar5.j(ua.f31167a), ((g2.x) b3Var.getValue()).f28624a, j12, n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), 0, false, 2, 0, new s0.g(fr.j3.A(10), j12, fr.j3.A(1)), sVar5, 1572864, 186);
                            sVar5.p(false);
                            sVar = sVar5;
                            z11 = false;
                        } else {
                            sVar5.d0(2088573546);
                            int wordType = courseWord.getWordType();
                            String luoMa = BuildConfig.VERSION_NAME;
                            String zhuYin2 = wordType == 3 ? BuildConfig.VERSION_NAME : courseWord.getZhuYin();
                            if (courseWord.getWordType() != 3) {
                                luoMa = courseWord.getLuoMa();
                            }
                            z11 = false;
                            dt.g4.b(CourseWord.copy$default(courseWord, 0L, null, zhuYin2, luoMa, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -13, 63, null), j3.y0.a(ct.c.b(sVar5), ((g2.x) b3Var.getValue()).f28624a, ct.c.c(sVar5), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), null, false, null, false, false, false, 0, null, sVar5, 0, 1020);
                            sVar = sVar5;
                            sVar.p(false);
                        }
                        sVar.p(z11);
                    } else {
                        if (i13 != 2) {
                            throw nv.p.x(sVar5, -71220977, false);
                        }
                        sVar5.d0(2089891697);
                        int[] iArr = b8.f5239a;
                        int i14 = iArr[a2Var.ordinal()];
                        if (i14 == 1) {
                            sVar5.d0(-71130128);
                            jC2 = ct.c.c(sVar5);
                            sVar5.p(false);
                        } else if (i14 != 2) {
                            sVar5.d0(-71125573);
                            jC2 = ((ct.b) sVar5.j(ct.c.f22476a)).f22468c;
                            sVar5.p(false);
                        } else {
                            sVar5.d0(-71127440);
                            jC2 = ct.c.c(sVar5);
                            sVar5.p(false);
                        }
                        long j13 = jC2;
                        if (a2Var == ot.a2.AudioWord || a2Var == ot.a2.AudioAudio) {
                            sVar5.d0(2090304834);
                            y0VarB = ct.c.b(sVar5);
                            sVar5.p(false);
                        } else {
                            sVar5.d0(2090406917);
                            y0VarB = (j3.y0) sVar5.j(ua.f31167a);
                            sVar5.p(false);
                        }
                        j3.y0 y0Var = y0VarB;
                        if (courseWord.getWordType() == 4) {
                            sVar5.d0(2090572612);
                            dt.g4.b(courseWord, j3.y0.a(y0Var, ((g2.x) b3Var.getValue()).f28624a, j13, n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), null, false, null, false, false, false, 0, null, sVar5, 0, 1020);
                            sVar5.p(false);
                            z12 = false;
                        } else {
                            z12 = false;
                            sVar5.d0(2091116166);
                            switch (iArr[a2Var.ordinal()]) {
                                case 1:
                                    word = courseWord.getWord();
                                    break;
                                case 2:
                                    word = courseWord.getWord();
                                    break;
                                case 3:
                                    word = courseWord.getTranslation();
                                    break;
                                case 4:
                                    word = courseWord.getTranslation();
                                    break;
                                case 5:
                                    word = courseWord.getZhuYin();
                                    break;
                                case 6:
                                    word = courseWord.getZhuYin();
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            iu.k.c(word, null, j3.y0.a(y0Var, ((g2.x) b3Var.getValue()).f28624a, j13, n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), 0, false, 2, 0, new s0.g(fr.j3.A(10), j13, fr.j3.A(1)), sVar5, 1572864, 186);
                            sVar5 = sVar5;
                            sVar5.p(false);
                        }
                        sVar5.p(z12);
                    }
                } else {
                    sVar5.W();
                }
                return qy.b0.f48488a;
            case 5:
                z5 z5Var = (z5) this.f4810b;
                ns.z zVar = (ns.z) this.f4811c;
                l1.b1 b1Var3 = (l1.b1) this.f4812d;
                l1.b1 b1Var4 = (l1.b1) this.f4813e;
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar5;
                if (sVar6.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zH2 = sVar6.h(z5Var) | sVar6.f(zVar);
                    Object objQ7 = sVar6.Q();
                    if (zH2 || objQ7 == l1.m.f39353a) {
                        objQ7 = new b0.k0(z5Var, zVar, b1Var3, b1Var4, 9);
                        sVar6.o0(objQ7);
                    }
                    k7.m((fz.a) objQ7, null, false, null, null, null, dt.e.f23755b, sVar6, 805306368, 510);
                } else {
                    sVar6.W();
                }
                return qy.b0.f48488a;
            case 6:
                fz.e eVar = (fz.e) this.f4810b;
                fz.e eVar2 = (fz.e) this.f4811c;
                l1.b1 b1Var5 = (l1.b1) this.f4812d;
                l1.b1 b1Var6 = (l1.b1) this.f4813e;
                Integer num = (Integer) obj;
                num.getClass();
                Integer num2 = (Integer) obj2;
                num2.getClass();
                if (kotlin.jvm.internal.m.a((String) b1Var5.getValue(), "daily")) {
                    eVar.invoke(num, num2);
                } else {
                    eVar2.invoke(num, num2);
                }
                b1Var6.setValue(Boolean.FALSE);
                break;
            case 7:
                ((Integer) obj2).getClass();
                fu.a.b((String) this.f4810b, (z1.r) this.f4812d, (fz.a) this.f4811c, (fz.a) this.f4813e, (l1.n) obj, l1.t.M(1));
                break;
            case 8:
                fz.a aVar3 = (fz.a) this.f4811c;
                fz.a aVar4 = (fz.a) this.f4810b;
                l1.b1 b1Var7 = (l1.b1) this.f4812d;
                l1.b1 b1Var8 = (l1.b1) this.f4813e;
                s2.t change = (s2.t) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                kotlin.jvm.internal.m.f(change, "change");
                if (!((Boolean) b1Var7.getValue()).booleanValue()) {
                    if (fFloatValue > 50.0f) {
                        b1Var8.setValue(Boolean.FALSE);
                        aVar3.invoke();
                        b1Var7.setValue(Boolean.TRUE);
                    } else if (fFloatValue < -50.0f) {
                        Boolean bool = Boolean.TRUE;
                        b1Var8.setValue(bool);
                        aVar4.invoke();
                        b1Var7.setValue(bool);
                    }
                }
                return qy.b0.f48488a;
            case 9:
                ((Integer) obj2).getClass();
                iv.a.g((kv.i0) this.f4810b, (fz.a) this.f4811c, (fz.a) this.f4812d, (mv.y) this.f4813e, (l1.n) obj, l1.t.M(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                iv.a.r((kv.i0) this.f4811c, (String) this.f4812d, (kv.e0) this.f4813e, (fz.c) this.f4810b, (l1.n) obj, l1.t.M(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                iv.a.m((kv.i0) this.f4810b, (mv.n) this.f4812d, (fz.a) this.f4811c, (fz.a) this.f4813e, (l1.n) obj, l1.t.M(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                iv.a.q((kv.i0) this.f4811c, (String) this.f4812d, (kv.q) this.f4813e, (fz.c) this.f4810b, (l1.n) obj, l1.t.M(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                iv.b1.d((fz.a) this.f4811c, (fz.a) this.f4813e, (fz.c) this.f4810b, (z1.r) this.f4812d, (l1.n) obj, l1.t.M(1));
                break;
            case 14:
                List list = (List) this.f4812d;
                String str = (String) this.f4813e;
                fz.c cVar3 = (fz.c) this.f4810b;
                ((Integer) obj2).getClass();
                mt.g.p(l1.t.M(3073), (fz.a) this.f4811c, cVar3, str, list, (l1.n) obj);
                break;
            case 15:
                ((Integer) obj2).getClass();
                mt.g.r((x8) this.f4812d, (rt.e0) this.f4813e, (fz.a) this.f4811c, (fz.c) this.f4810b, (l1.n) obj, l1.t.M(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                mt.g.c((mt.c) this.f4812d, (rt.p) this.f4813e, (fz.a) this.f4811c, (fz.c) this.f4810b, (l1.n) obj, l1.t.M(1));
                break;
            case 17:
                l1.b1 b1Var9 = (l1.b1) this.f4811c;
                rt.x0 x0Var = (rt.x0) this.f4812d;
                fz.c cVar4 = (fz.c) this.f4810b;
                l1.b1 b1Var10 = (l1.b1) this.f4813e;
                l1.n nVar6 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar7 = (l1.s) nVar6;
                if (sVar7.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zF3 = sVar7.f(b1Var9) | sVar7.h(x0Var) | sVar7.f(cVar4);
                    Object objQ8 = sVar7.Q();
                    if (zF3 || objQ8 == l1.m.f39353a) {
                        b0.k0 k0Var = new b0.k0(x0Var, cVar4, b1Var10, b1Var9, 13);
                        sVar7.o0(k0Var);
                        objQ8 = k0Var;
                    }
                    k7.m((fz.a) objQ8, null, !((List) b1Var9.getValue()).isEmpty(), null, null, null, mt.g.C, sVar7, 805306368, 506);
                } else {
                    sVar7.W();
                }
                return qy.b0.f48488a;
            case 18:
                rt.a2 a2Var2 = (rt.a2) this.f4810b;
                l1.b3 b3Var2 = (l1.b3) this.f4811c;
                l1.b1 b1Var11 = (l1.b1) this.f4812d;
                l1.g1 g1Var = (l1.g1) this.f4813e;
                l1.n nVar7 = (l1.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                l1.s sVar8 = (l1.s) nVar7;
                if (sVar8.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    float f5 = 8;
                    z1.o oVar3 = z1.o.f58481a;
                    z1.r rVarE2 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7);
                    j0.u uVarA = j0.t.a(j0.i.g(f5), z1.c.P, sVar8, 54);
                    int iHashCode2 = Long.hashCode(sVar8.T);
                    l1.q1 q1VarL2 = sVar8.l();
                    z1.r rVarC2 = z1.a.c(sVar8, rVarE2);
                    y2.k.J.getClass();
                    y2.i iVar2 = y2.j.f56913b;
                    sVar8.h0();
                    if (sVar8.S) {
                        sVar8.k(iVar2);
                    } else {
                        sVar8.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar8);
                    l1.t.J(y2.j.f56916e, q1VarL2, sVar8);
                    y2.h hVar2 = y2.j.f56918g;
                    if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar8, iHashCode2, hVar2);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, sVar8);
                    String strE0 = ub.a.e0(sVar8, R.string.srs_future_reviews_feature_desc);
                    long jA = fr.j3.A(12);
                    long j14 = ((h1.s1) sVar8.j(h1.v1.f31180a)).f31036s;
                    float f11 = mt.n1.f41680a;
                    ua.b(strE0, j0.c.C(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2), j14, jA, new n3.o(1), null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar8, 3120, 0, 130528);
                    boolean z15 = ((rt.o1) b3Var2.getValue()).f50166d;
                    String str2 = ((rt.o1) b3Var2.getValue()).f50167e;
                    se seVar = ((rt.o1) b3Var2.getValue()).f50175n;
                    int i15 = ((rt.o1) b3Var2.getValue()).f50173k;
                    int i16 = ((rt.o1) b3Var2.getValue()).f50174l;
                    boolean z16 = ((rt.o1) b3Var2.getValue()).m;
                    boolean zBooleanValue2 = ((Boolean) b1Var11.getValue()).booleanValue();
                    boolean zH3 = sVar8.h(a2Var2);
                    Object objQ9 = sVar8.Q();
                    l1.g gVar3 = l1.m.f39353a;
                    if (zH3 || objQ9 == gVar3) {
                        objQ9 = new mt.e1(a2Var2, b1Var11, 2);
                        sVar8.o0(objQ9);
                    }
                    fz.a aVar5 = (fz.a) objQ9;
                    boolean zH4 = sVar8.h(a2Var2);
                    Object objQ10 = sVar8.Q();
                    if (zH4 || objQ10 == gVar3) {
                        objQ10 = new mt.k1(a2Var2, 2);
                        sVar8.o0(objQ10);
                    }
                    fz.c cVar5 = (fz.c) objQ10;
                    boolean zH5 = sVar8.h(a2Var2);
                    Object objQ11 = sVar8.Q();
                    if (zH5 || objQ11 == gVar3) {
                        objQ11 = new mt.f1(a2Var2, 3);
                        sVar8.o0(objQ11);
                    }
                    fz.a aVar6 = (fz.a) objQ11;
                    Object objQ12 = sVar8.Q();
                    if (objQ12 == gVar3) {
                        objQ12 = new mt.q(23, b1Var11);
                        sVar8.o0(objQ12);
                    }
                    fz.a aVar7 = (fz.a) objQ12;
                    boolean zF4 = sVar8.f(b3Var2) | sVar8.h(a2Var2);
                    Object objQ13 = sVar8.Q();
                    if (zF4 || objQ13 == gVar3) {
                        objQ13 = new mt.h1(a2Var2, b3Var2, 1);
                        sVar8.o0(objQ13);
                    }
                    fz.a aVar8 = (fz.a) objQ13;
                    z1.r rVarC3 = j0.c.C(j0.e2.e(oVar3, 1.0f), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    Object objQ14 = sVar8.Q();
                    if (objQ14 == gVar3) {
                        objQ14 = new mt.l1(g1Var, 0);
                        sVar8.o0(objQ14);
                    }
                    mt.v1.a(z15, str2, seVar, i15, i16, z16, zBooleanValue2, aVar5, cVar5, aVar6, aVar7, aVar8, w2.a0.m(rVarC3, (fz.c) objQ14), sVar8, 0, 390);
                    sVar8.p(true);
                } else {
                    sVar8.W();
                }
                return qy.b0.f48488a;
            case 19:
                ((Integer) obj2).getClass();
                mt.v1.f((se) this.f4813e, (fz.c) this.f4810b, (fz.a) this.f4811c, (z1.r) this.f4812d, (l1.n) obj, l1.t.M(3073));
                break;
            case 20:
                ((Integer) obj2).getClass();
                mt.v1.h((String) this.f4813e, (fz.c) this.f4810b, (fz.a) this.f4811c, (z1.r) this.f4812d, (l1.n) obj, l1.t.M(3073));
                break;
            case 21:
                rt.q2 q2Var = (rt.q2) this.f4810b;
                fz.a aVar9 = (fz.a) this.f4811c;
                l1.b1 b1Var12 = (l1.b1) this.f4812d;
                l1.b1 b1Var13 = (l1.b1) this.f4813e;
                l1.n nVar8 = (l1.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                l1.s sVar9 = (l1.s) nVar8;
                if (sVar9.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    int i17 = q2Var.f50268f;
                    int i18 = q2Var.f50269g;
                    int i19 = q2Var.f50270h;
                    Object objQ15 = sVar9.Q();
                    l1.g gVar4 = l1.m.f39353a;
                    if (objQ15 == gVar4) {
                        objQ15 = new mt.w1(15, b1Var12);
                        sVar9.o0(objQ15);
                    }
                    fz.a aVar10 = (fz.a) objQ15;
                    Object objQ16 = sVar9.Q();
                    if (objQ16 == gVar4) {
                        objQ16 = new mt.w1(16, b1Var13);
                        sVar9.o0(objQ16);
                    }
                    mt.y3.c(i17, i18, i19, aVar10, null, (fz.a) objQ16, false, false, q2Var.f50274l, aVar9, sVar9, 199680, 208);
                } else {
                    sVar9.W();
                }
                return qy.b0.f48488a;
            case 22:
                rt.q2 q2Var2 = (rt.q2) this.f4812d;
                fz.a aVar11 = (fz.a) this.f4811c;
                fz.c cVar6 = (fz.c) this.f4810b;
                fz.c cVar7 = (fz.c) this.f4813e;
                l1.n nVar9 = (l1.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                l1.s sVar10 = (l1.s) nVar9;
                if (sVar10.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    mt.m3.d(q2Var2.f50266d, q2Var2.f50264b, q2Var2.f50265c, aVar11, cVar6, cVar7, sVar10, 0);
                } else {
                    sVar10.W();
                }
                return qy.b0.f48488a;
            case 23:
                rt.e3 e3Var = (rt.e3) this.f4810b;
                l1.b1 b1Var14 = (l1.b1) this.f4811c;
                l1.b1 b1Var15 = (l1.b1) this.f4812d;
                l1.b1 b1Var16 = (l1.b1) this.f4813e;
                String bookmarkValue = (String) obj;
                long jLongValue = ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f(bookmarkValue, "bookmarkValue");
                ja jaVarF = e3Var.f(jLongValue, -1L, bookmarkValue);
                boolean z17 = false;
                if (jaVarF != null && ((ka) e3Var.h(jLongValue, bookmarkValue).getValue()).f49982b) {
                    z17 = true;
                }
                if (jaVarF == null || z17) {
                    e3Var.H(jLongValue, -1L, bookmarkValue);
                } else {
                    if (((Boolean) b1Var14.getValue()).booleanValue()) {
                        ja jaVar2 = (ja) b1Var15.getValue();
                        if (!kotlin.jvm.internal.m.a(jaVar2 != null ? jaVar2.f49927a : null, jaVarF.f49927a) && (jaVar = (ja) b1Var15.getValue()) != null) {
                            e3Var.c(jaVar, "__default_bookmark_folder__");
                        }
                    }
                    b1Var16.setValue(jaVarF);
                }
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                x8 x8Var = (x8) this.f4811c;
                fz.c cVar8 = (fz.c) this.f4810b;
                fz.e eVar3 = (fz.e) this.f4812d;
                l1.b1 b1Var17 = (l1.b1) this.f4813e;
                List filteredReviews = (List) obj;
                r8 selectedPracticeModel = (r8) obj2;
                kotlin.jvm.internal.m.f(filteredReviews, "filteredReviews");
                kotlin.jvm.internal.m.f(selectedPracticeModel, "selectedPracticeModel");
                if (!filteredReviews.isEmpty()) {
                    if (x8Var != x8.CHARACTER) {
                        cVar8.invoke(selectedPracticeModel);
                    }
                    b1Var17.setValue(Boolean.FALSE);
                    eVar3.invoke(filteredReviews, selectedPracticeModel);
                }
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((Integer) obj2).getClass();
                n0.l.a((fz.a) this.f4811c, (z1.r) this.f4812d, (n0.l0) this.f4810b, (n0.c0) this.f4813e, (l1.n) obj, l1.t.M(1));
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((Integer) obj2).getClass();
                nh.a.c((String) this.f4812d, (fz.c) this.f4810b, (fz.a) this.f4811c, (ph.k) this.f4813e, (l1.n) obj, l1.t.M(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                nh.d.c((fz.c) this.f4810b, (fz.c) this.f4811c, (z1.r) this.f4812d, (ph.a0) this.f4813e, (l1.n) obj, l1.t.M(1));
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                nh.a.d((fz.c) this.f4810b, (fz.a) this.f4811c, (z1.r) this.f4812d, (ph.o) this.f4813e, (l1.n) obj, l1.t.M(1));
                break;
            default:
                ((Integer) obj2).getClass();
                nv.a.m((ArrayList) this.f4812d, (String) this.f4813e, (fz.a) this.f4811c, (fz.c) this.f4810b, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ t(fz.a aVar, fz.a aVar2, fz.c cVar, z1.r rVar, int i11) {
        this.f4809a = 13;
        this.f4811c = aVar;
        this.f4813e = aVar2;
        this.f4810b = cVar;
        this.f4812d = rVar;
    }

    public /* synthetic */ t(fz.a aVar, z1.r rVar, n0.l0 l0Var, n0.c0 c0Var, int i11) {
        this.f4809a = 25;
        this.f4811c = aVar;
        this.f4812d = rVar;
        this.f4810b = l0Var;
        this.f4813e = c0Var;
    }

    public /* synthetic */ t(Object obj, fz.c cVar, fz.a aVar, z1.r rVar, int i11, int i12) {
        this.f4809a = i12;
        this.f4813e = obj;
        this.f4810b = cVar;
        this.f4811c = aVar;
        this.f4812d = rVar;
    }

    public /* synthetic */ t(Object obj, Object obj2, fz.a aVar, fz.a aVar2, int i11, int i12) {
        this.f4809a = i12;
        this.f4810b = obj;
        this.f4812d = obj2;
        this.f4811c = aVar;
        this.f4813e = aVar2;
    }

    public /* synthetic */ t(Object obj, Object obj2, fz.a aVar, fz.c cVar, int i11, int i12) {
        this.f4809a = i12;
        this.f4812d = obj;
        this.f4813e = obj2;
        this.f4811c = aVar;
        this.f4810b = cVar;
    }

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f4809a = i11;
        this.f4810b = obj;
        this.f4811c = obj2;
        this.f4812d = obj3;
        this.f4813e = obj4;
    }

    public /* synthetic */ t(Object obj, qy.e eVar, Object obj2, ViewModel viewModel, int i11, int i12) {
        this.f4809a = i12;
        this.f4810b = obj;
        this.f4811c = eVar;
        this.f4812d = obj2;
        this.f4813e = viewModel;
    }

    public /* synthetic */ t(Object obj, qy.e eVar, Object obj2, l1.b1 b1Var, int i11) {
        this.f4809a = i11;
        this.f4811c = obj;
        this.f4810b = eVar;
        this.f4812d = obj2;
        this.f4813e = b1Var;
    }

    public /* synthetic */ t(String str, fz.c cVar, fz.a aVar, ph.k kVar, int i11) {
        this.f4809a = 26;
        this.f4812d = str;
        this.f4810b = cVar;
        this.f4811c = aVar;
        this.f4813e = kVar;
    }

    public /* synthetic */ t(List list, String str, fz.c cVar, fz.a aVar, int i11) {
        this.f4809a = 14;
        this.f4812d = list;
        this.f4813e = str;
        this.f4810b = cVar;
        this.f4811c = aVar;
    }

    public /* synthetic */ t(kv.i0 i0Var, String str, Object obj, fz.c cVar, int i11, int i12) {
        this.f4809a = i12;
        this.f4811c = i0Var;
        this.f4812d = str;
        this.f4813e = obj;
        this.f4810b = cVar;
    }

    public /* synthetic */ t(rt.q2 q2Var, fz.a aVar, fz.c cVar, fz.c cVar2) {
        this.f4809a = 22;
        this.f4812d = q2Var;
        this.f4811c = aVar;
        this.f4810b = cVar;
        this.f4813e = cVar2;
    }
}
