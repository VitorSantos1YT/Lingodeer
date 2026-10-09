package d0;

import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.SRSStatus;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import java.util.Set;
import rt.b4;
import rt.dd;
import rt.e3;
import rt.h3;
import rt.ja;
import rt.ke;
import rt.mb;
import rt.ue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 extends kotlin.jvm.internal.j implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22758a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i11, Object obj, Class cls, String str, String str2, int i12, int i13) {
        super(i11, i12, cls, obj, str, str2);
        this.f22758a = i13;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0222  */
    /* JADX WARN: Code duplicated, block: B:74:0x0242  */
    /* JADX WARN: Code duplicated, block: B:78:0x024c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0257  */
    /* JADX WARN: Code duplicated, block: B:82:0x0269  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [d0.n0, java.lang.Object, y2.b2, z1.q] */
    /* JADX WARN: Type inference failed for: r3v0, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [uz.i1] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        boolean zA;
        o0 o0VarX0;
        ue ueVar;
        Set setA0;
        Set set;
        ?? r9;
        Object value;
        Set set2;
        Set setT0;
        boolean zA2;
        int i11 = this.f22758a;
        boolean z11 = false;
        z11 = false;
        ?? r11 = 0;
        n0.h0 h0Var = null;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                e2.z zVar = (e2.z) obj;
                e2.z zVar2 = (e2.z) obj2;
                ?? r12 = (n0) this.receiver;
                if (r12.P && (zA = ((e2.b0) zVar2).a()) != ((e2.b0) zVar).a()) {
                    fz.c cVar = r12.T;
                    if (cVar != null) {
                        cVar.invoke(Boolean.valueOf(zA));
                    }
                    if (zA) {
                        rz.e0.B(r12.H0(), null, null, new b0.a1(r12, r11, 20), 3);
                        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                        y2.f.t(r12, new at.f(24, yVar, r12));
                        n0.h0 h0Var2 = (n0.h0) yVar.f38361a;
                        if (h0Var2 != null) {
                            h0Var2.a();
                        } else {
                            h0Var2 = null;
                        }
                        r12.V = h0Var2;
                        y2.k1 k1Var = r12.W;
                        if (k1Var != null && k1Var.c1().P && (o0VarX0 = r12.X0()) != null) {
                            o0VarX0.T0(r12.W);
                        }
                    } else {
                        n0.h0 h0Var3 = r12.V;
                        if (h0Var3 != null) {
                            h0Var3.b();
                        }
                        r12.V = null;
                        o0 o0VarX1 = r12.X0();
                        if (o0VarX1 != null) {
                            o0VarX1.T0(null);
                        }
                    }
                    y2.f.o(r12);
                    h0.i iVar = r12.S;
                    if (iVar != null) {
                        if (zA) {
                            h0.d dVar = r12.U;
                            if (dVar != null) {
                                r12.W0(iVar, new h0.e(dVar));
                                r12.U = null;
                            }
                            h0.d dVar2 = new h0.d();
                            r12.W0(iVar, dVar2);
                            r12.U = dVar2;
                        } else {
                            h0.d dVar3 = r12.U;
                            if (dVar3 != null) {
                                r12.W0(iVar, new h0.e(dVar3));
                                r12.U = null;
                            }
                        }
                    }
                }
                return b0Var;
            case 1:
                e00.g p4 = (e00.g) obj;
                int iIntValue = ((Number) obj2).intValue();
                kotlin.jvm.internal.m.f(p4, "p0");
                i00.i iVar2 = (i00.i) this.receiver;
                iVar2.getClass();
                if (!p4.j(iIntValue) && p4.i(iIntValue).c()) {
                    z11 = true;
                }
                iVar2.f33908b = z11;
                return Boolean.valueOf(z11);
            case 2:
                long jLongValue = ((Number) obj).longValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                rt.a2 a2Var = (rt.a2) this.receiver;
                ke keVar = (ke) a2Var.f49423f.getValue();
                for (Object obj3 : ((rt.o1) a2Var.O.f53391a.getValue()).f50170h) {
                    if (((ue) obj3).f50510a == jLongValue) {
                        r11 = obj3;
                        ueVar = (ue) r11;
                        if (ueVar != null) {
                            setA0 = nz.n.a0(nz.n.W(nz.n.R(ry.m.g0(ueVar.f50513d), new rt.q1(a2Var, keVar, 2)), new ro.e(10)));
                        } else {
                            setA0 = ry.t.f50856a;
                        }
                        set = setA0;
                        if (!set.isEmpty()) {
                            r9 = a2Var.L;
                            do {
                                value = r9.getValue();
                                set2 = (Set) value;
                                if (zBooleanValue) {
                                    Set set3 = set2;
                                    kotlin.jvm.internal.m.f(set3, "<this>");
                                    setT0 = ry.m.e1(set3);
                                    ry.m.d0(setT0, set);
                                } else {
                                    setT0 = ry.m.T0(set2, set);
                                }
                            } while (!r9.j(value, setT0));
                        }
                        return b0Var;
                    }
                }
                ueVar = (ue) r11;
                if (ueVar != null) {
                    setA0 = nz.n.a0(nz.n.W(nz.n.R(ry.m.g0(ueVar.f50513d), new rt.q1(a2Var, keVar, 2)), new ro.e(10)));
                } else {
                    setA0 = ry.t.f50856a;
                }
                set = setA0;
                if (!set.isEmpty()) {
                    r9 = a2Var.L;
                    do {
                        value = r9.getValue();
                        set2 = (Set) value;
                        if (zBooleanValue) {
                            Set set4 = set2;
                            kotlin.jvm.internal.m.f(set4, "<this>");
                            setT0 = ry.m.e1(set4);
                            ry.m.d0(setT0, set);
                        } else {
                            setT0 = ry.m.T0(set2, set);
                        }
                    } while (!r9.j(value, setT0));
                }
                return b0Var;
            case 3:
                String p11 = (String) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                kotlin.jvm.internal.m.f(p11, "p0");
                b4 b4Var = (b4) this.receiver;
                b4Var.getClass();
                b4Var.f49488b0.z(Instant.now().b(iIntValue2 >= 0 ? iIntValue2 : 0, ChronoUnit.DAYS).getEpochSecond(), p11);
                return b0Var;
            case 4:
                rt.m0 p12 = (rt.m0) obj;
                String p13 = (String) obj2;
                kotlin.jvm.internal.m.f(p12, "p0");
                kotlin.jvm.internal.m.f(p13, "p1");
                b4 b4Var2 = (b4) this.receiver;
                b4Var2.getClass();
                rz.b0 viewModelScope = ViewModelKt.getViewModelScope(b4Var2);
                yz.f fVar = rz.o0.f50940a;
                rz.e0.B(viewModelScope, yz.e.f58387a, null, new h3(b4Var2, p12, p13, null, 2), 2);
                return b0Var;
            case 5:
                rt.m0 p14 = (rt.m0) obj;
                String p15 = (String) obj2;
                kotlin.jvm.internal.m.f(p14, "p0");
                kotlin.jvm.internal.m.f(p15, "p1");
                ((b4) this.receiver).f(p14, p15);
                return b0Var;
            case 6:
                String p16 = (String) obj;
                long jLongValue2 = ((Number) obj2).longValue();
                kotlin.jvm.internal.m.f(p16, "p0");
                return ((b4) this.receiver).g(jLongValue2, p16);
            case 7:
                String p17 = (String) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                kotlin.jvm.internal.m.f(p17, "p0");
                e3 e3Var = (e3) this.receiver;
                e3Var.getClass();
                e3Var.A0.z(Instant.now().b(iIntValue3 >= 0 ? iIntValue3 : 0, ChronoUnit.DAYS).getEpochSecond(), p17);
                return b0Var;
            case 8:
                ja p18 = (ja) obj;
                String p19 = (String) obj2;
                kotlin.jvm.internal.m.f(p18, "p0");
                kotlin.jvm.internal.m.f(p19, "p1");
                ((e3) this.receiver).n(p18, p19);
                return b0Var;
            case 9:
                ja p21 = (ja) obj;
                String p22 = (String) obj2;
                kotlin.jvm.internal.m.f(p21, "p0");
                kotlin.jvm.internal.m.f(p22, "p1");
                ((e3) this.receiver).c(p21, p22);
                return b0Var;
            case 10:
                ja p23 = (ja) obj;
                String p24 = (String) obj2;
                kotlin.jvm.internal.m.f(p23, "p0");
                kotlin.jvm.internal.m.f(p24, "p1");
                ((e3) this.receiver).n(p23, p24);
                return b0Var;
            case 11:
                ja p25 = (ja) obj;
                String p26 = (String) obj2;
                kotlin.jvm.internal.m.f(p25, "p0");
                kotlin.jvm.internal.m.f(p26, "p1");
                ((e3) this.receiver).c(p25, p26);
                return b0Var;
            case 12:
                SRSStatus p27 = (SRSStatus) obj;
                wt.c0 p28 = (wt.c0) obj2;
                kotlin.jvm.internal.m.f(p27, "p0");
                kotlin.jvm.internal.m.f(p28, "p1");
                ((wt.b0) this.receiver).getClass();
                wt.b0.h(p27, p28);
                return p27;
            case 13:
                e2.z zVar3 = (e2.z) obj;
                e2.z zVar4 = (e2.z) obj2;
                y3.q qVar = (y3.q) this.receiver;
                if (qVar.P && (zA2 = ((e2.b0) zVar4).a()) != ((e2.b0) zVar3).a()) {
                    if (zA2) {
                        kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                        y2.f.t(qVar, new d2.c(15, yVar2, qVar));
                        n0.h0 h0Var4 = (n0.h0) yVar2.f38361a;
                        if (h0Var4 != null) {
                            h0Var4.a();
                            h0Var = h0Var4;
                        }
                        qVar.T = h0Var;
                    } else {
                        n0.h0 h0Var5 = qVar.T;
                        if (h0Var5 != null) {
                            h0Var5.b();
                        }
                        qVar.T = null;
                    }
                }
                return b0Var;
            case 14:
                ja p29 = (ja) obj;
                String p30 = (String) obj2;
                kotlin.jvm.internal.m.f(p29, "p0");
                kotlin.jvm.internal.m.f(p30, "p1");
                ((mb) this.receiver).n(p29, p30);
                return b0Var;
            case 15:
                ja p31 = (ja) obj;
                String p32 = (String) obj2;
                kotlin.jvm.internal.m.f(p31, "p0");
                kotlin.jvm.internal.m.f(p32, "p1");
                ((mb) this.receiver).c(p31, p32);
                return b0Var;
            case 16:
                ja p33 = (ja) obj;
                String p34 = (String) obj2;
                kotlin.jvm.internal.m.f(p33, "p0");
                kotlin.jvm.internal.m.f(p34, "p1");
                ((mb) this.receiver).n(p33, p34);
                return b0Var;
            case 17:
                ja p35 = (ja) obj;
                String p36 = (String) obj2;
                kotlin.jvm.internal.m.f(p35, "p0");
                kotlin.jvm.internal.m.f(p36, "p1");
                ((mb) this.receiver).c(p35, p36);
                return b0Var;
            case 18:
                ja p37 = (ja) obj;
                String p38 = (String) obj2;
                kotlin.jvm.internal.m.f(p37, "p0");
                kotlin.jvm.internal.m.f(p38, "p1");
                ((dd) this.receiver).n(p37, p38);
                return b0Var;
            case 19:
                ja p39 = (ja) obj;
                String p40 = (String) obj2;
                kotlin.jvm.internal.m.f(p39, "p0");
                kotlin.jvm.internal.m.f(p40, "p1");
                ((dd) this.receiver).c(p39, p40);
                return b0Var;
            case 20:
                ja p41 = (ja) obj;
                String p42 = (String) obj2;
                kotlin.jvm.internal.m.f(p41, "p0");
                kotlin.jvm.internal.m.f(p42, "p1");
                ((dd) this.receiver).n(p41, p42);
                return b0Var;
            default:
                ja p43 = (ja) obj;
                String p44 = (String) obj2;
                kotlin.jvm.internal.m.f(p43, "p0");
                kotlin.jvm.internal.m.f(p44, "p1");
                ((dd) this.receiver).c(p43, p44);
                return b0Var;
        }
    }
}
