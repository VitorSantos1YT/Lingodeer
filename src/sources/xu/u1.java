package xu;

import android.graphics.DashPathEffect;
import com.lingodeer.R;
import com.lingodeer.data.model.DailyLearnWithLearnTimeHistory;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56523a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f56524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.r f56525c;

    public /* synthetic */ u1(List list, z1.r rVar) {
        this.f56524b = list;
        this.f56525c = rVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11;
        int i12;
        String strM;
        switch (this.f56523a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final j3.w0 w0VarI = j3.t.i(sVar);
                    final List list = this.f56524b;
                    boolean zF = sVar.f(list);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zF || objQ == gVar) {
                        objQ = defpackage.e.v(50, sVar);
                    }
                    final l1.a1 a1Var = (l1.a1) objQ;
                    Object objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = l1.t.B(ns.o.L(0, 10, 20, 30, 40, 50));
                        sVar.o0(objQ2);
                    }
                    final l1.b1 b1Var = (l1.b1) objQ2;
                    boolean zH = sVar.h(list) | sVar.f(a1Var);
                    Object objQ3 = sVar.Q();
                    if (zH || objQ3 == gVar) {
                        rt.h hVar = new rt.h(b1Var, a1Var, list, (vy.d) null, 28);
                        sVar.o0(hVar);
                        objQ3 = hVar;
                    }
                    l1.t.f((fz.e) objQ3, list, sVar);
                    sVar.d0(-1792045576);
                    final ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        switch (((DailyLearnWithLearnTimeHistory) it.next()).getDayOfWeek()) {
                            case 1:
                                i11 = -45539364;
                                i12 = R.string.sun;
                                break;
                            case 2:
                                i11 = -45537316;
                                i12 = R.string.mon;
                                break;
                            case 3:
                                i11 = -45535268;
                                i12 = R.string.tue;
                                break;
                            case 4:
                                i11 = -45533220;
                                i12 = R.string.wed;
                                break;
                            case 5:
                                i11 = -45531172;
                                i12 = R.string.thu;
                                break;
                            case 6:
                                i11 = -45529124;
                                i12 = R.string.fri;
                                break;
                            case 7:
                                i11 = -45527076;
                                i12 = R.string.sat;
                                break;
                            default:
                                sVar.d0(-1411274380);
                                sVar.p(false);
                                strM = BuildConfig.VERSION_NAME;
                                continue;
                                arrayList.add(strM);
                                break;
                        }
                        strM = ep.a.m(sVar, i11, i12, sVar, false);
                        arrayList.add(strM);
                    }
                    sVar.p(false);
                    final long j11 = ((h1.s1) sVar.j(h1.v1.f31180a)).f31017a;
                    l1.d0 d0Var = ua.f31167a;
                    final j3.y0 y0VarA = j3.y0.a((j3.y0) sVar.j(d0Var), g2.f0.e(4287861651L), j3.A(8), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212);
                    final j3.y0 y0VarA2 = j3.y0.a((j3.y0) sVar.j(d0Var), g2.f0.e(4287861651L), j3.A(8), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212);
                    boolean zF2 = sVar.f(w0VarI) | sVar.f(y0VarA) | sVar.h(arrayList) | sVar.f(y0VarA2) | sVar.h(list) | sVar.f(a1Var) | sVar.e(j11);
                    Object objQ4 = sVar.Q();
                    if (zF2 || objQ4 == gVar) {
                        fz.c cVar = new fz.c() { // from class: xu.x1
                            @Override // fz.c
                            public final Object invoke(Object obj3) throws Throwable {
                                char c11;
                                int i13;
                                float f5;
                                float f11;
                                float f12;
                                int i14;
                                g2.l lVar;
                                i2.d Canvas = (i2.d) obj3;
                                kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
                                float f13 = 4;
                                float fE0 = Canvas.e0(f13);
                                float fE1 = Canvas.e0(14);
                                char c12 = ' ';
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.d() >> 32)) - Canvas.e0(22);
                                int i15 = 5;
                                float f14 = 5;
                                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) - (fE0 + fE1)) / f14;
                                char c13 = 2;
                                float f15 = 2;
                                int i16 = 0;
                                int i17 = 1;
                                float[] fArr = {Canvas.e0(f15), Canvas.e0(f15)};
                                float f16 = CropImageView.DEFAULT_ASPECT_RATIO;
                                g2.l lVar2 = new g2.l(new DashPathEffect(fArr, CropImageView.DEFAULT_ASPECT_RATIO));
                                Iterator it2 = ry.m.O0((Iterable) b1Var.getValue()).iterator();
                                int i18 = 0;
                                while (true) {
                                    boolean zHasNext = it2.hasNext();
                                    Throwable th2 = null;
                                    char c14 = c12;
                                    j3.w0 w0Var = w0VarI;
                                    if (zHasNext) {
                                        Object next = it2.next();
                                        int i19 = i18 + 1;
                                        if (i18 < 0) {
                                            ns.o.V();
                                            throw null;
                                        }
                                        int iIntValue2 = ((Number) next).intValue();
                                        float f17 = (i18 * fIntBitsToFloat2) + fE0;
                                        if (i18 == i15) {
                                            long jE = g2.f0.e(4289243304L);
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f16)) << c14) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
                                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c14) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L);
                                            f12 = f15;
                                            f5 = f14;
                                            i14 = 1;
                                            i13 = 5;
                                            c11 = 2;
                                            f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                                            Canvas.f0(jE, jFloatToRawIntBits, jFloatToRawIntBits2, (480 & 8) != 0 ? 0.0f : CropImageView.DEFAULT_ASPECT_RATIO, (480 & 16) != 0 ? 0 : 0, (480 & 32) != 0 ? null : null, 3);
                                            lVar = lVar2;
                                        } else {
                                            c11 = c13;
                                            i13 = i15;
                                            f5 = f14;
                                            f11 = f16;
                                            f12 = f15;
                                            i14 = i17;
                                            lVar = lVar2;
                                            Canvas.f0(g2.f0.e(4289243304L), (((long) Float.floatToRawIntBits(f11)) << c14) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c14) | (((long) Float.floatToRawIntBits(f17)) & 4294967295L), (480 & 8) != 0 ? 0.0f : CropImageView.DEFAULT_ASPECT_RATIO, (480 & 16) != 0 ? 0 : 0, (480 & 32) != 0 ? null : lVar, 3);
                                        }
                                        String strValueOf = String.valueOf(iIntValue2);
                                        j3.y0 y0Var = y0VarA;
                                        j3.t.d(Canvas, w0Var, String.valueOf(iIntValue2), (((long) Float.floatToRawIntBits(Canvas.e0(f13) + fIntBitsToFloat)) << c14) | (((long) Float.floatToRawIntBits(f17 - (((int) (j3.w0.a(w0Var, strValueOf, y0Var, 0L, 1020).f35799c & 4294967295L)) / 2))) & 4294967295L), y0Var);
                                        c12 = c14;
                                        lVar2 = lVar;
                                        f15 = f12;
                                        i17 = i14;
                                        i18 = i19;
                                        f14 = f5;
                                        fE0 = fE0;
                                        fE1 = fE1;
                                        i15 = i13;
                                        c13 = c11;
                                        f16 = f11;
                                    } else {
                                        float f18 = f14;
                                        float f19 = fE0;
                                        float f21 = fE1;
                                        float f22 = f15;
                                        int i21 = i17;
                                        float fE2 = Canvas.e0(18);
                                        float f23 = (fIntBitsToFloat - (2.0f * fE2)) / 6.0f;
                                        ArrayList arrayList2 = arrayList;
                                        int size = arrayList2.size();
                                        int i22 = 0;
                                        int i23 = 0;
                                        while (i23 < size) {
                                            Object obj4 = arrayList2.get(i23);
                                            int i24 = i23 + 1;
                                            int i25 = i22 + 1;
                                            if (i22 < 0) {
                                                ns.o.V();
                                                throw null;
                                            }
                                            String str = (String) obj4;
                                            j3.y0 y0Var2 = y0VarA2;
                                            j3.t.d(Canvas, w0Var, str, (((long) Float.floatToRawIntBits(Canvas.e0(f13) + (Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) - f21))) & 4294967295L) | (((long) Float.floatToRawIntBits(((i22 * f23) + fE2) - (((int) (j3.w0.a(w0Var, str, y0Var2, 0L, 1020).f35799c >> c14)) / 2))) << c14), y0Var2);
                                            i23 = i24;
                                            i22 = i25;
                                        }
                                        g2.k kVarA = g2.o.a();
                                        List list2 = list;
                                        Iterator it3 = list2.iterator();
                                        int i26 = 0;
                                        while (true) {
                                            boolean zHasNext2 = it3.hasNext();
                                            l1.a1 a1Var2 = a1Var;
                                            if (zHasNext2) {
                                                Object next2 = it3.next();
                                                int i27 = i26 + 1;
                                                if (i26 < 0) {
                                                    Throwable th3 = th2;
                                                    ns.o.V();
                                                    throw th3;
                                                }
                                                float f24 = (i26 * f23) + fE2;
                                                Throwable th4 = th2;
                                                float xp2 = ((i21 - (((DailyLearnWithLearnTimeHistory) next2).getXp() / ((l1.h1) a1Var2).l())) * fIntBitsToFloat2 * f18) + f19;
                                                if (i26 == 0) {
                                                    kVarA.g(f24, xp2);
                                                } else {
                                                    kVarA.f(f24, xp2);
                                                }
                                                i26 = i27;
                                                th2 = th4;
                                            } else {
                                                Throwable th5 = th2;
                                                float f25 = i21;
                                                i2.h hVar2 = new i2.h(Canvas.e0(f25), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30);
                                                long j12 = j11;
                                                i2.d.o0(Canvas, kVarA, j12, CropImageView.DEFAULT_ASPECT_RATIO, hVar2, 52);
                                                long j13 = j12;
                                                Iterator it4 = list2.iterator();
                                                while (true) {
                                                    int i28 = i16;
                                                    if (!it4.hasNext()) {
                                                        return qy.b0.f48488a;
                                                    }
                                                    Object next3 = it4.next();
                                                    i16 = i28 + 1;
                                                    if (i28 < 0) {
                                                        ns.o.V();
                                                        throw th5;
                                                    }
                                                    float f26 = (i28 * f23) + fE2;
                                                    float xp3 = ((f25 - (((DailyLearnWithLearnTimeHistory) next3).getXp() / ((l1.h1) a1Var2).l())) * fIntBitsToFloat2 * f18) + f19;
                                                    i2.d.j(Canvas, j13, Canvas.e0(f13), (((long) Float.floatToRawIntBits(f26)) << c14) | (((long) Float.floatToRawIntBits(xp3)) & 4294967295L), null, 0, 120);
                                                    i2.d.j(Canvas, g2.x.f28618e, Canvas.e0(f22), (((long) Float.floatToRawIntBits(f26)) << c14) | (((long) Float.floatToRawIntBits(xp3)) & 4294967295L), null, 0, 120);
                                                    j13 = j13;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        };
                        sVar.o0(cVar);
                        objQ4 = cVar;
                    }
                    d0.n.b(0, (fz.c) objQ4, sVar, this.f56525c);
                } else {
                    sVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                a2.h(this.f56524b, this.f56525c, (l1.n) obj, l1.t.M(49));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ u1(List list, z1.r rVar, int i11) {
        this.f56524b = list;
        this.f56525c = rVar;
    }
}
