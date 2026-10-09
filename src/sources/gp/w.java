package gp;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import bp.t3;
import com.lingodeer.data.model.uistate.CommonUiState;
import com.lingodeer.data.model.uistate.CompleteOneLessonUiState;
import com.lingodeer.data.model.uistate.DailyGoalUiState;
import com.lingodeer.data.model.uistate.DayStreakUiState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.h2;
import fr.i3;
import fr.x4;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import n9.n1;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends ViewModel {
    public final vt.u0 H;
    public final wt.b0 K;
    public final wt.o0 L;
    public final gq.d M;
    public final wt.a N;
    public final n9.q O;
    public final LinkedHashSet P = new LinkedHashSet();
    public final a00.e Q = new a00.e();
    public String R = BuildConfig.VERSION_NAME;
    public String S = BuildConfig.VERSION_NAME;
    public final uz.r0 T;
    public final uz.r0 U;
    public final uz.r0 V;
    public final uz.r0 W;
    public final uz.r0 X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.h1 f29524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.c f29525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.m f29526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.n0 f29527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt.a f29528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gq.u f29529f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gq.k f29530t;

    /* JADX WARN: Multi-variable type inference failed */
    public w(vt.h1 h1Var, gu.a aVar, vt.c cVar, wt.m mVar, vt.n0 n0Var, vt.a aVar2, gq.u uVar, gq.k kVar, vt.u0 u0Var, wt.b0 b0Var, wt.o0 o0Var, gq.d dVar, wt.a aVar3) {
        this.f29524a = h1Var;
        this.f29525b = cVar;
        this.f29526c = mVar;
        this.f29527d = n0Var;
        this.f29528e = aVar2;
        this.f29529f = uVar;
        this.f29530t = kVar;
        this.H = u0Var;
        this.K = b0Var;
        this.L = o0Var;
        this.M = dVar;
        this.N = aVar3;
        int i11 = 29;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.O = new n9.q(i11, false);
        vy.d dVar2 = null;
        int i12 = 3;
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new n(this, dVar2, 0 == true ? 1 : 0), 3);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new n(this, dVar2, 1), 3);
        com.google.firebase.datastorage.a aVar4 = new com.google.firebase.datastorage.a(this, i11);
        z1 z1Var = uVar.f29641i;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        uVar.f29641i = null;
        uVar.f29641i = uz.x0.y(new n1(new n1(new r(new gq.g(uVar.f29636d, dVar2, objArr2 == true ? 1 : 0)), new e6.q0(i11, uVar, aVar4, dVar2), 5), new ad.a0(3, 5, null)), uVar.f29642j);
        this.T = uz.x0.A(new r(o0Var.f55339f, 0), ViewModelKt.getViewModelScope(this), uz.a1.a(2), ns.o.L(br.d0.f5026d, br.g0.f5036d, br.e0.f5029d));
        vt.d dVar3 = (vt.d) cVar;
        uz.i1 i1Var = dVar3.f54195e;
        this.U = uz.x0.A(new bh.r(uz.x0.B(i1Var, new dt.x(dVar2, h1Var, 2)), n0Var, 6), ViewModelKt.getViewModelScope(this), uz.a1.a(2), DailyGoalUiState.Loading.INSTANCE);
        this.V = uz.x0.A(uz.x0.w(new bh.r(uz.x0.B(i1Var, new dt.x(dVar2, aVar, i12)), h1Var, 7), yz.e.f58387a), ViewModelKt.getViewModelScope(this), uz.a1.a(2), DayStreakUiState.Loading.INSTANCE);
        this.W = uz.x0.A(new t(((x4) h1Var).f27974g, objArr == true ? 1 : 0), ViewModelKt.getViewModelScope(this), uz.a1.a(2), CommonUiState.Loading.INSTANCE);
        this.X = uz.x0.A(new bh.r(dVar3.f54206q, this, 5), ViewModelKt.getViewModelScope(this), uz.a1.a(2), CompleteOneLessonUiState.Idle.INSTANCE);
    }

    public static final Object a(w wVar, gq.v vVar, xy.i iVar) {
        if (wVar.f29530t.f29598b) {
            return Boolean.FALSE;
        }
        gq.c0 c0Var = vVar.f29646c;
        if (c0Var != gq.c0.SUCCESS) {
            Objects.toString(c0Var);
            return Boolean.FALSE;
        }
        if (!((Boolean) wVar.N.f55231b.f53391a.getValue()).booleanValue()) {
            return Boolean.FALSE;
        }
        yz.f fVar = rz.o0.f50940a;
        return rz.e0.M(yz.e.f58387a, new t3(wVar, vVar, (vy.d) null, 8), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(w wVar, long j11, xy.c cVar) {
        o oVar;
        a00.e eVar;
        LinkedHashSet linkedHashSet = wVar.P;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i11 = oVar.f29466e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f29466e = i11 - Integer.MIN_VALUE;
            } else {
                oVar = new o(wVar, cVar);
            }
        } else {
            oVar = new o(wVar, cVar);
        }
        Object obj = oVar.f29464c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = oVar.f29466e;
        boolean z11 = true;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            eVar = wVar.Q;
            oVar.f29463b = eVar;
            oVar.f29462a = j11;
            oVar.f29466e = 1;
            if (eVar.b(oVar) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = oVar.f29462a;
            eVar = oVar.f29463b;
            com.bumptech.glide.e.F(obj);
        }
        try {
            if (linkedHashSet.add(new Long(j11))) {
                while (linkedHashSet.size() > 32) {
                    Iterator it = linkedHashSet.iterator();
                    kotlin.jvm.internal.m.e(it, "iterator(...)");
                    if (it.hasNext()) {
                        it.next();
                        it.remove();
                    }
                }
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        } finally {
            eVar.a(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:0x0100  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0150  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final Object c(w wVar, int i11, boolean z11, xy.c cVar) {
        p pVar;
        boolean z12;
        Object objL;
        boolean z13;
        wt.e0 e0Var;
        fr.o0 o0Var;
        int i12;
        int i13;
        int i14;
        Object objM;
        Object obj;
        Object objK;
        Object obj2;
        int i15;
        boolean z14;
        int i16;
        Object objM2;
        int i17 = i11;
        vt.n0 n0Var = wVar.f29527d;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i18 = pVar.f29476t;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                pVar.f29476t = i18 - Integer.MIN_VALUE;
            } else {
                pVar = new p(wVar, cVar);
            }
        } else {
            pVar = new p(wVar, cVar);
        }
        Object objM3 = pVar.f29474e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i19 = pVar.f29476t;
        int i21 = 0;
        int i22 = 1;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        if (i19 == 0) {
            com.bumptech.glide.e.F(objM3);
            try {
                wt.b0 b0Var2 = wVar.K;
                wt.m mVar = wVar.f29526c;
                pVar.f29473d = null;
                pVar.f29470a = i17;
                z12 = z11;
                try {
                    pVar.f29472c = z12;
                    pVar.f29471b = 0;
                    pVar.f29476t = 1;
                    b0Var2.getClass();
                    yz.f fVar = rz.o0.f50940a;
                    objM3 = rz.e0.M(yz.e.f58387a, new hu.l(i17, null, mVar, b0Var2), pVar);
                    if (objM3 == aVar) {
                        return aVar;
                    }
                    objL = (wt.e0) objM3;
                } catch (Throwable th2) {
                    th = th2;
                    objL = com.bumptech.glide.e.l(th);
                }
            } catch (Throwable th3) {
                th = th3;
                z12 = z11;
                objL = com.bumptech.glide.e.l(th);
            }
            z13 = z12;
            if (!(objL instanceof qy.n)) {
                e0Var = (wt.e0) objL;
                o0Var = (fr.o0) n0Var;
                if (o0Var.f27733a.keyLanguage == i17) {
                    int i23 = e0Var.f55254a;
                    i12 = e0Var.f55255b;
                    if (z13) {
                        if (i12 > 0) {
                            pVar.f29473d = objL;
                            pVar.f29470a = i17;
                            pVar.f29472c = z13;
                            pVar.f29471b = 0;
                            pVar.f29476t = 2;
                            yz.f fVar2 = rz.o0.f50940a;
                            objM = rz.e0.M(yz.e.f58387a, new fr.f0(i17, i22, o0Var, dVar), pVar);
                            if (objM != wy.a.COROUTINE_SUSPENDED) {
                                objM = b0Var;
                            }
                            if (objM == aVar) {
                                return aVar;
                            }
                            obj = objL;
                            i13 = i17;
                            i14 = 0;
                            objL = obj;
                        } else {
                            i13 = i17;
                            i14 = 0;
                        }
                        if (ob.f.c(((fr.o0) n0Var).f27733a.pendingCourseReviewResetKeyLanguages).contains(new Integer(i13))) {
                            vt.u0 u0Var = wVar.H;
                            pVar.f29473d = objL;
                            pVar.f29470a = i13;
                            pVar.f29472c = z13;
                            pVar.f29471b = i14;
                            pVar.f29476t = 3;
                            i3 i3Var = (i3) u0Var;
                            i3Var.getClass();
                            objK = i3Var.k(new h2(i13, i3Var, null), pVar);
                            if (objK == aVar) {
                                return aVar;
                            }
                            obj2 = objL;
                            objM3 = objK;
                            i15 = i14;
                            z14 = z13;
                            i16 = i13;
                            if (((Boolean) objM3).booleanValue()) {
                                pVar.f29473d = obj2;
                                pVar.f29470a = i16;
                                pVar.f29472c = z14;
                                pVar.f29471b = i15;
                                pVar.f29476t = 4;
                                fr.o0 o0Var2 = (fr.o0) n0Var;
                                o0Var2.getClass();
                                yz.f fVar3 = rz.o0.f50940a;
                                objM2 = rz.e0.M(yz.e.f58387a, new fr.f0(i16, i21, o0Var2, dVar), pVar);
                                if (objM2 != wy.a.COROUTINE_SUSPENDED) {
                                    objM2 = b0Var;
                                }
                                if (objM2 == aVar) {
                                    return aVar;
                                }
                            } else {
                                xy.f.a(Log.w("MainViewModel", "SRS 修复后的远端 reset/upload 失败，等待后续同步重试"));
                            }
                        }
                    }
                }
            }
        } else if (i19 == 1) {
            boolean z15 = pVar.f29472c;
            int i24 = pVar.f29470a;
            try {
                com.bumptech.glide.e.F(objM3);
                z12 = z15;
                i17 = i24;
                objL = (wt.e0) objM3;
            } catch (Throwable th4) {
                th = th4;
                z12 = z15;
                i17 = i24;
                objL = com.bumptech.glide.e.l(th);
            }
            z13 = z12;
            if (!(objL instanceof qy.n)) {
                e0Var = (wt.e0) objL;
                o0Var = (fr.o0) n0Var;
                if (o0Var.f27733a.keyLanguage == i17) {
                    int i25 = e0Var.f55254a;
                    i12 = e0Var.f55255b;
                    if (z13) {
                        if (i12 > 0) {
                            pVar.f29473d = objL;
                            pVar.f29470a = i17;
                            pVar.f29472c = z13;
                            pVar.f29471b = 0;
                            pVar.f29476t = 2;
                            yz.f fVar4 = rz.o0.f50940a;
                            objM = rz.e0.M(yz.e.f58387a, new fr.f0(i17, i22, o0Var, dVar), pVar);
                            if (objM != wy.a.COROUTINE_SUSPENDED) {
                                objM = b0Var;
                            }
                            if (objM == aVar) {
                                return aVar;
                            }
                            obj = objL;
                            i13 = i17;
                            i14 = 0;
                            objL = obj;
                        } else {
                            i13 = i17;
                            i14 = 0;
                        }
                        if (ob.f.c(((fr.o0) n0Var).f27733a.pendingCourseReviewResetKeyLanguages).contains(new Integer(i13))) {
                            vt.u0 u0Var2 = wVar.H;
                            pVar.f29473d = objL;
                            pVar.f29470a = i13;
                            pVar.f29472c = z13;
                            pVar.f29471b = i14;
                            pVar.f29476t = 3;
                            i3 i3Var2 = (i3) u0Var2;
                            i3Var2.getClass();
                            objK = i3Var2.k(new h2(i13, i3Var2, null), pVar);
                            if (objK == aVar) {
                                return aVar;
                            }
                            obj2 = objL;
                            objM3 = objK;
                            i15 = i14;
                            z14 = z13;
                            i16 = i13;
                            if (((Boolean) objM3).booleanValue()) {
                                pVar.f29473d = obj2;
                                pVar.f29470a = i16;
                                pVar.f29472c = z14;
                                pVar.f29471b = i15;
                                pVar.f29476t = 4;
                                fr.o0 o0Var3 = (fr.o0) n0Var;
                                o0Var3.getClass();
                                yz.f fVar5 = rz.o0.f50940a;
                                objM2 = rz.e0.M(yz.e.f58387a, new fr.f0(i16, i21, o0Var3, dVar), pVar);
                                if (objM2 != wy.a.COROUTINE_SUSPENDED) {
                                    objM2 = b0Var;
                                }
                                if (objM2 == aVar) {
                                    return aVar;
                                }
                            } else {
                                xy.f.a(Log.w("MainViewModel", "SRS 修复后的远端 reset/upload 失败，等待后续同步重试"));
                            }
                        }
                    }
                }
            }
        } else if (i19 == 2) {
            i14 = pVar.f29471b;
            z13 = pVar.f29472c;
            i13 = pVar.f29470a;
            obj = pVar.f29473d;
            com.bumptech.glide.e.F(objM3);
            objL = obj;
            if (ob.f.c(((fr.o0) n0Var).f27733a.pendingCourseReviewResetKeyLanguages).contains(new Integer(i13))) {
                vt.u0 u0Var3 = wVar.H;
                pVar.f29473d = objL;
                pVar.f29470a = i13;
                pVar.f29472c = z13;
                pVar.f29471b = i14;
                pVar.f29476t = 3;
                i3 i3Var3 = (i3) u0Var3;
                i3Var3.getClass();
                objK = i3Var3.k(new h2(i13, i3Var3, null), pVar);
                if (objK == aVar) {
                    return aVar;
                }
                obj2 = objL;
                objM3 = objK;
                i15 = i14;
                z14 = z13;
                i16 = i13;
                if (((Boolean) objM3).booleanValue()) {
                    pVar.f29473d = obj2;
                    pVar.f29470a = i16;
                    pVar.f29472c = z14;
                    pVar.f29471b = i15;
                    pVar.f29476t = 4;
                    fr.o0 o0Var4 = (fr.o0) n0Var;
                    o0Var4.getClass();
                    yz.f fVar6 = rz.o0.f50940a;
                    objM2 = rz.e0.M(yz.e.f58387a, new fr.f0(i16, i21, o0Var4, dVar), pVar);
                    if (objM2 != wy.a.COROUTINE_SUSPENDED) {
                        objM2 = b0Var;
                    }
                    if (objM2 == aVar) {
                        return aVar;
                    }
                } else {
                    xy.f.a(Log.w("MainViewModel", "SRS 修复后的远端 reset/upload 失败，等待后续同步重试"));
                }
            }
        } else if (i19 == 3) {
            i15 = pVar.f29471b;
            z14 = pVar.f29472c;
            i16 = pVar.f29470a;
            obj2 = pVar.f29473d;
            com.bumptech.glide.e.F(objM3);
            if (((Boolean) objM3).booleanValue()) {
                pVar.f29473d = obj2;
                pVar.f29470a = i16;
                pVar.f29472c = z14;
                pVar.f29471b = i15;
                pVar.f29476t = 4;
                fr.o0 o0Var5 = (fr.o0) n0Var;
                o0Var5.getClass();
                yz.f fVar7 = rz.o0.f50940a;
                objM2 = rz.e0.M(yz.e.f58387a, new fr.f0(i16, i21, o0Var5, dVar), pVar);
                if (objM2 != wy.a.COROUTINE_SUSPENDED) {
                    objM2 = b0Var;
                }
                if (objM2 == aVar) {
                    return aVar;
                }
            } else {
                xy.f.a(Log.w("MainViewModel", "SRS 修复后的远端 reset/upload 失败，等待后续同步重试"));
            }
        } else {
            if (i19 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objM3);
        }
        return b0Var;
    }

    public final void d(fz.a aVar) {
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new t3(this, aVar, (vy.d) null, 7), 3);
    }

    public final void f() {
        vy.d dVar = null;
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new n(this, dVar, 2), 3);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new av.p(this, dVar, 16), 3);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.O.f();
        gq.u uVar = this.f29529f;
        z1 z1Var = uVar.f29641i;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        uVar.f29641i = null;
        uVar.f29641i = null;
    }
}
