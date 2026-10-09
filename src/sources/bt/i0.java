package bt;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import com.google.accompanist.permissions.PermissionStatus;
import com.google.accompanist.permissions.PermissionsUtilKt;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.RecordingStatus;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i0 {
    public static final void a(bv.z zVar, l1.n nVar, int i11) {
        g2.j0 j0VarQ;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1530540283);
        int i12 = (sVar.h(zVar) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = b0.e.a(-50.0f);
                sVar.o0(objQ);
            }
            b0.d dVar = (b0.d) objQ;
            boolean zH = sVar.h(dVar);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new av.f0(dVar, null, 10);
                sVar.o0(objQ2);
            }
            l1.t.f((fz.e) objQ2, qy.b0.f48488a, sVar);
            List list = zVar.f6383d;
            ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((bv.c0) it.next()).f6289f));
            }
            int size = arrayList.size();
            if (size == 1) {
                sVar.d0(406184791);
                long jI = s5.i(((Number) ry.m.q0(arrayList)).intValue());
                j0VarQ = fr.p3.q(ns.o.L(new g2.x(g2.x.c(jI, 0.08f)), new g2.x(((h1.s1) sVar.j(h1.v1.f31180a)).f31033p), new g2.x(g2.x.c(jI, 0.08f))));
                sVar.p(false);
            } else if (size != 2) {
                sVar.d0(406937378);
                long j11 = g2.x.f28621h;
                j0VarQ = fr.p3.q(ns.o.L(new g2.x(j11), new g2.x(((h1.s1) sVar.j(h1.v1.f31180a)).f31033p), new g2.x(j11)));
                sVar.p(false);
            } else {
                sVar.d0(406549630);
                j0VarQ = fr.p3.q(ns.o.L(new g2.x(g2.x.c(s5.i(((Number) arrayList.get(0)).intValue()), 0.08f)), new g2.x(((h1.s1) sVar.j(h1.v1.f31180a)).f31033p), new g2.x(g2.x.c(s5.i(((Number) arrayList.get(1)).intValue()), 0.08f))));
                sVar.p(false);
            }
            float f5 = 12;
            z1.r rVarY = j0.c.y(j0.c.A(d0.n.g(j0.e2.e(z1.o.f58481a, 1.0f), j0VarQ, r0.f.d(f5), 4), f5), ((Number) dVar.d()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.a2 a2VarA = j0.z1.a(j0.i.g(16), z1.c.M, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarY);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            h(zVar, sVar, i12 & 14);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new x(zVar, i11, 0);
        }
    }

    public static final void b(final int i11, final float f5, final long j11, l1.n nVar, final int i12) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-996661576);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.c(f5) ? 32 : 16) | (sVar.e(j11) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            z1.j jVar = z1.c.f58467e;
            float f11 = 60;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarN = j0.e2.n(oVar, f11);
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarN);
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
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new bq.u(4);
                sVar.o0(objQ);
            }
            float f12 = 4;
            h1.g7.a((fz.a) objQ, j0.e2.n(oVar, f11), ((h1.s1) sVar.j(h1.v1.f31180a)).f31026h, f12, 0L, 1, CropImageView.DEFAULT_ASPECT_RATIO, sVar, 3126, 80);
            boolean z11 = (i13 & 112) == 32;
            Object objQ2 = sVar.Q();
            if (z11 || objQ2 == gVar) {
                objQ2 = new pr.h(f5);
                sVar.o0(objQ2);
            }
            h1.g7.a((fz.a) objQ2, j0.e2.n(oVar, f11), j11, f12, 0L, 1, CropImageView.DEFAULT_ASPECT_RATIO, sVar, (i13 & 896) | 3120, 80);
            ua.b(String.valueOf(i11), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar.j(fc.f30256a)).f30174g, j11, fr.j3.A(18), n3.s.M, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65534);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(f5, i11, i12, j11) { // from class: bt.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f6201a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f6202b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f6203c;

                {
                    this.f6203c = j11;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    i0.b(this.f6201a, this.f6202b, this.f6203c, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void c(ot.q data, ht.o courseTestParams, ys.d0 d0Var, fz.a onClickSkip, l1.n nVar, int i11) {
        Object obj;
        Object obj2;
        Object gVar;
        Context context;
        CourseSentence courseSentence;
        ys.d0 d0Var2;
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(onClickSkip, "onClickSkip");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(165030492);
        int i12 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128) | (sVar.h(onClickSkip) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            boolean zBooleanValue = ((Boolean) sVar.j(ht.p.f33771a)).booleanValue();
            CourseSentence courseSentence2 = data.f45948a;
            List displayWords = data.f45949b;
            int i13 = courseTestParams.f33753a;
            kotlin.jvm.internal.m.f(courseSentence2, "courseSentence");
            kotlin.jvm.internal.m.f(displayWords, "displayWords");
            boolean zF = sVar.f(courseSentence2);
            Object objQ = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (zF || objQ == gVar2) {
                objQ = l1.t.B(displayWords);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zF2 = sVar.f(courseSentence2);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar2) {
                objQ2 = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            boolean zF3 = sVar.f(courseSentence2);
            Object objQ3 = sVar.Q();
            if (zF3 || objQ3 == gVar2) {
                objQ3 = l1.t.B(ht.a.f33722e);
                sVar.o0(objQ3);
            }
            l1.b1 b1Var3 = (l1.b1) objQ3;
            boolean zF4 = sVar.f(courseSentence2);
            Object objQ4 = sVar.Q();
            if (zF4 || objQ4 == gVar2) {
                objQ4 = l1.t.B(RecordingStatus.ReadyRecord.INSTANCE);
                sVar.o0(objQ4);
            }
            l1.b1 b1Var4 = (l1.b1) objQ4;
            boolean zF5 = sVar.f(courseSentence2);
            Object objQ5 = sVar.Q();
            if (zF5 || objQ5 == gVar2) {
                objQ5 = l1.t.B(null);
                sVar.o0(objQ5);
            }
            l1.b1 b1Var5 = (l1.b1) objQ5;
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF6 = sVar.f(null) | sVar.f(aVarC);
            Object objQ6 = sVar.Q();
            if (zF6 || objQ6 == gVar2) {
                objQ6 = w4.c.e(vt.n0.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            vt.n0 n0Var = (vt.n0) objQ6;
            Context context2 = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            Object objQ7 = sVar.Q();
            if (objQ7 == gVar2) {
                objQ7 = new av.j0(context2.getApplicationContext(), 2);
                sVar.o0(objQ7);
            }
            av.j0 j0Var = (av.j0) objQ7;
            e20.a aVarC2 = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF7 = sVar.f(null) | sVar.f(aVarC2);
            Object objQ8 = sVar.Q();
            if (zF7 || objQ8 == gVar2) {
                obj = null;
                objQ8 = w4.c.e(av.i.class, aVarC2, null, null, sVar);
            } else {
                obj = null;
            }
            sVar.p(false);
            sVar.p(false);
            av.i iVar = (av.i) objQ8;
            e20.a aVarC3 = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF8 = sVar.f(obj) | sVar.f(aVarC3);
            Object objQ9 = sVar.Q();
            if (zF8 || objQ9 == gVar2) {
                objQ9 = w4.c.e(av.c.class, aVarC3, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            av.c cVar = (av.c) objQ9;
            boolean zF9 = sVar.f(courseSentence2);
            Object objQ10 = sVar.Q();
            if (zF9 || objQ10 == gVar2) {
                fr.o0 o0Var = (fr.o0) n0Var;
                String strV = o0Var.v();
                int i14 = o0Var.f27733a.keyLanguage;
                String str = i13 == 0 ? "w" : "s";
                objQ10 = strV + i14 + "-" + str + "-" + courseSentence2.getSentenceId() + ".wav";
                sVar.o0(objQ10);
            }
            String str2 = (String) objQ10;
            boolean zF10 = sVar.f(courseSentence2);
            Object objQ11 = sVar.Q();
            if (zF10 || objQ11 == gVar2) {
                fr.o0 o0Var2 = (fr.o0) n0Var;
                String strV2 = o0Var2.v();
                int i15 = o0Var2.f27733a.keyLanguage;
                String str3 = i13 == 0 ? "w" : "s";
                objQ11 = strV2 + i15 + "-" + str3 + "-" + courseSentence2.getSentenceId() + "-result.json";
                sVar.o0(objQ11);
            }
            String str4 = (String) objQ11;
            Object objQ12 = sVar.Q();
            if (objQ12 == gVar2) {
                objQ12 = ((fr.o0) n0Var).v() + "userWordRecorder.wav";
                sVar.o0(objQ12);
            }
            String str5 = (String) objQ12;
            Object objQ13 = sVar.Q();
            if (objQ13 == gVar2) {
                objQ13 = new av.n(context2);
                sVar.o0(objQ13);
            }
            av.n nVar2 = (av.n) objQ13;
            Object objQ14 = sVar.Q();
            if (objQ14 == gVar2) {
                objQ14 = l1.t.q(sVar);
                sVar.o0(objQ14);
            }
            rz.b0 b0Var = (rz.b0) objQ14;
            boolean zH = sVar.h(j0Var) | sVar.h(iVar) | sVar.h(nVar2);
            Object objQ15 = sVar.Q();
            if (zH || objQ15 == gVar2) {
                objQ15 = new jt.h(j0Var, iVar, nVar2, 0);
                sVar.o0(objQ15);
            }
            l1.t.c(qy.b0.f48488a, (fz.c) objQ15, sVar);
            Object objQ16 = sVar.Q();
            if (objQ16 == gVar2) {
                objQ16 = l1.t.s(new dt.h2(27, b1Var2));
                sVar.o0(objQ16);
            }
            l1.b3 b3Var = (l1.b3) objQ16;
            Object objQ17 = sVar.Q();
            if (objQ17 == gVar2) {
                obj2 = null;
                objQ17 = l1.t.B(null);
                sVar.o0(objQ17);
            } else {
                obj2 = null;
            }
            l1.b1 b1Var6 = (l1.b1) objQ17;
            Object objQ18 = sVar.Q();
            if (objQ18 == gVar2) {
                objQ18 = l1.t.B(obj2);
                sVar.o0(objQ18);
            }
            boolean zF11 = sVar.f(j0Var) | sVar.f(nVar2) | sVar.f(cVar) | sVar.f(courseSentence2) | sVar.g(((Boolean) b3Var.getValue()).booleanValue()) | sVar.f(str2) | sVar.d(((fr.o0) n0Var).f27733a.keyLanguage) | sVar.f(b1Var2) | sVar.f(b1Var3) | sVar.f(b1Var) | sVar.f(b1Var4) | sVar.f(b1Var5) | sVar.g(zBooleanValue);
            Object objQ19 = sVar.Q();
            if (zF11 || objQ19 == gVar2) {
                context = context2;
                gVar = new jt.g(j0Var, nVar2, cVar, courseSentence2, str2, str5, ((Boolean) b3Var.getValue()).booleanValue(), b1Var2, b1Var3, b1Var, b1Var4, b1Var5, b1Var6, zBooleanValue);
                courseSentence = courseSentence2;
                sVar.o0(gVar);
            } else {
                courseSentence = courseSentence2;
                context = context2;
                gVar = objQ19;
            }
            jt.g gVar3 = (jt.g) gVar;
            boolean zF12 = sVar.f(r18);
            Object objQ20 = sVar.Q();
            if (zF12 || objQ20 == gVar2) {
                objQ20 = new gu.b(28, r18, str5, (vy.d) null);
                sVar.o0(objQ20);
            }
            l1.t.f((fz.e) objQ20, courseSentence, sVar);
            Object value = gVar3.f36942k.getValue();
            boolean zH2 = sVar.h(gVar3);
            Object objQ21 = sVar.Q();
            if (zH2 || objQ21 == gVar2) {
                objQ21 = new jt.i(gVar3, str5, null);
                sVar.o0(objQ21);
            }
            l1.t.f((fz.e) objQ21, value, sVar);
            Object value2 = gVar3.f36941j.getValue();
            boolean zH3 = sVar.h(gVar3) | sVar.f(r18) | sVar.d(r20) | sVar.h(courseSentence) | sVar.h(n0Var) | sVar.h(displayWords) | sVar.h(b0Var) | sVar.h(iVar) | sVar.h(context) | sVar.f(str4);
            Object objQ22 = sVar.Q();
            if (zH3 || objQ22 == gVar2) {
                objQ22 = new jt.m(gVar3, str2, displayWords, b0Var, str4, str5, i13, courseSentence, n0Var, iVar, context, null);
                sVar.o0(objQ22);
            }
            l1.t.f((fz.e) objQ22, value2, sVar);
            int i16 = i12 & 896;
            boolean zH4 = sVar.h(gVar3) | (i16 == 256);
            Object objQ23 = sVar.Q();
            if (zH4 || objQ23 == gVar2) {
                d0Var2 = d0Var;
                objQ23 = new at.f(12, d0Var2, gVar3);
                sVar.o0(objQ23);
            } else {
                d0Var2 = d0Var;
            }
            fz.a aVar = (fz.a) objQ23;
            boolean z11 = i16 == 256;
            Object objQ24 = sVar.Q();
            if (z11 || objQ24 == gVar2) {
                objQ24 = new v(d0Var2, 0);
                sVar.o0(objQ24);
            }
            fz.c cVar2 = (fz.c) objQ24;
            boolean z12 = i16 == 256;
            Object objQ25 = sVar.Q();
            if (z12 || objQ25 == gVar2) {
                objQ25 = new l(d0Var2, 1);
                sVar.o0(objQ25);
            }
            fz.a aVar2 = (fz.a) objQ25;
            boolean z13 = i16 == 256;
            Object objQ26 = sVar.Q();
            if (z13 || objQ26 == gVar2) {
                objQ26 = new l(d0Var2, 2);
                sVar.o0(objQ26);
            }
            fz.a aVar3 = (fz.a) objQ26;
            boolean z14 = i16 == 256;
            Object objQ27 = sVar.Q();
            if (z14 || objQ27 == gVar2) {
                objQ27 = new l(d0Var2, 3);
                sVar.o0(objQ27);
            }
            e(gVar3, zBooleanValue, courseTestParams, d0Var2, aVar, cVar2, aVar2, onClickSkip, aVar3, (fz.a) objQ27, sVar, ((i12 << 3) & 8064) | ((i12 << 12) & 29360128));
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a0(data, courseTestParams, d0Var, onClickSkip, i11, 0);
        }
    }

    public static final void d(RecordingStatus recordingStatus, bv.z zVar, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(recordingStatus, "recordingStatus");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1756513346);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(recordingStatus) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(zVar) ? 32 : 16;
        }
        if (!sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.W();
        } else if (recordingStatus instanceof RecordingStatus.RecognizeShowScore) {
            sVar.d0(-1592228016);
            if (zVar == null) {
                sVar.d0(-1592197575);
            } else {
                sVar.d0(-1592197574);
                a(zVar, sVar, 0);
            }
            sVar.p(false);
            sVar.p(false);
        } else {
            sVar.d0(87191174);
            sVar.p(false);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.t1(recordingStatus, i11, 1, zVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:141:0x02af  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:148:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:152:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:162:0x0300  */
    /* JADX WARN: Code duplicated, block: B:165:0x0318  */
    public static final void e(final jt.g gVar, final boolean z11, final ht.o courseTestParams, ys.d0 d0Var, final fz.a stopPlayAudio, fz.c onChecked, fz.a onClickContinue, final fz.a onClickSkip, final fz.a getAudioTime, final fz.a getAudioDuration, l1.n nVar, final int i11) {
        int i12;
        l1.s sVar;
        final fz.c cVar;
        final fz.a aVar;
        l1.b1 b1Var;
        CourseSentence courseSentence;
        l1.g gVar2;
        l1.s sVar2;
        l1.b1 b1Var2;
        CourseSentence courseSentence2;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        Object objQ;
        Object objQ2;
        boolean z15;
        boolean z16;
        Object objQ3;
        Object objQ4;
        final ys.d0 d0Var2 = d0Var;
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(stopPlayAudio, "stopPlayAudio");
        kotlin.jvm.internal.m.f(onChecked, "onChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(onClickSkip, "onClickSkip");
        kotlin.jvm.internal.m.f(getAudioTime, "getAudioTime");
        kotlin.jvm.internal.m.f(getAudioDuration, "getAudioDuration");
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(919857714);
        if ((i11 & 6) == 0) {
            i12 = (sVar3.h(gVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar3.g(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar3.f(courseTestParams) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= (i11 & 4096) == 0 ? sVar3.f(d0Var2) : sVar3.h(d0Var2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar3.h(stopPlayAudio) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar3.h(onChecked) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar3.h(onClickContinue) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar3.h(onClickSkip) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar3.h(getAudioTime) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= sVar3.h(getAudioDuration) ? 536870912 : 268435456;
        }
        if (sVar3.T(i12 & 1, (306783379 & i12) != 306783378)) {
            Object objQ5 = sVar3.Q();
            l1.g gVar3 = l1.m.f39353a;
            if (objQ5 == gVar3) {
                objQ5 = l1.t.q(sVar3);
                sVar3.o0(objQ5);
            }
            final rz.b0 b0Var = (rz.b0) objQ5;
            final boolean z17 = gVar.f36937f;
            l1.b1 b1Var3 = gVar.f36938g;
            l1.b1 b1Var4 = gVar.f36939h;
            l1.b1 b1Var5 = gVar.f36940i;
            final l1.b1 b1Var6 = gVar.f36941j;
            CourseSentence courseSentence3 = gVar.f36934c;
            Object objQ6 = sVar3.Q();
            if (objQ6 == gVar3) {
                objQ6 = defpackage.e.v(-1, sVar3);
            }
            l1.a1 a1Var = (l1.a1) objQ6;
            Object objQ7 = sVar3.Q();
            if (objQ7 == gVar3) {
                objQ7 = l1.t.B(Boolean.FALSE);
                sVar3.o0(objQ7);
            }
            l1.b1 b1Var7 = (l1.b1) objQ7;
            Object value = b1Var4.getValue();
            boolean zF = sVar3.f(b1Var4);
            Object objQ8 = sVar3.Q();
            if (zF || objQ8 == gVar3) {
                objQ8 = new g0(b1Var4, b1Var7, null, 0);
                sVar3.o0(objQ8);
            }
            l1.t.f((fz.e) objQ8, value, sVar3);
            Boolean bool = (Boolean) b1Var7.getValue();
            bool.getClass();
            boolean zH = ((234881024 & i12) == 67108864) | ((1879048192 & i12) == 536870912) | sVar3.h(courseSentence3);
            Object objQ9 = sVar3.Q();
            if (zH || objQ9 == gVar3) {
                b1Var = b1Var7;
                objQ9 = new h0(getAudioTime, getAudioDuration, courseSentence3, b1Var, a1Var, null, 0);
                courseSentence = courseSentence3;
                sVar3.o0(objQ9);
            } else {
                courseSentence = courseSentence3;
                b1Var = b1Var7;
            }
            l1.t.f((fz.e) objQ9, bool, sVar3);
            Boolean boolValueOf = Boolean.valueOf(courseTestParams.f33762j);
            int i14 = i12 & 7168;
            boolean zH2 = sVar3.h(courseSentence) | sVar3.h(gVar) | (i14 == 2048 || ((i12 & 4096) != 0 && sVar3.h(d0Var2)));
            Object objQ10 = sVar3.Q();
            if (zH2 || objQ10 == gVar3) {
                gVar2 = gVar3;
                sVar2 = sVar3;
                CourseSentence courseSentence4 = courseSentence;
                b1Var2 = b1Var4;
                ad.x xVar = new ad.x(courseSentence4, gVar, d0Var2, b1Var, null, 1);
                courseSentence2 = courseSentence4;
                sVar2.o0(xVar);
                objQ10 = xVar;
            } else {
                sVar2 = sVar3;
                gVar2 = gVar3;
                courseSentence2 = courseSentence;
                b1Var2 = b1Var4;
            }
            l1.t.g(courseSentence2, boolValueOf, (fz.e) objQ10, sVar2);
            ht.q qVar = (ht.q) b1Var3.getValue();
            String strE0 = ub.a.e0(sVar2, R.string.test_continue);
            ht.a aVar2 = ht.a.f33722e;
            t1.d dVarD = t1.e.d(-1830996368, new b0(courseTestParams, 0), sVar2);
            l1.s sVar4 = sVar2;
            int i15 = i12;
            final l1.b1 b1Var8 = b1Var2;
            final l1.b1 b1Var9 = b1Var;
            d0Var2 = d0Var;
            t1.d dVarD2 = t1.e.d(521861873, new c0(b1Var3, b1Var8, b1Var6, b1Var5, courseSentence2, getAudioTime, gVar, d0Var2, a1Var, b1Var9), sVar4);
            final CourseSentence courseSentence5 = courseSentence2;
            t1.d dVarD3 = t1.e.d(-1420247182, new fz.e() { // from class: bt.d0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    y2.h hVar;
                    y2.h hVar2;
                    l1.b1 b1Var10;
                    boolean z18;
                    jt.g gVar4;
                    rz.b0 b0Var2;
                    d0 d0Var3;
                    RecordingStatus.ReadyRecord readyRecord;
                    long j11;
                    l1.g gVar5;
                    jt.g gVar6;
                    rz.b0 b0Var3;
                    z1.j jVar;
                    ys.d0 d0Var4;
                    boolean z19;
                    boolean z20;
                    l1.n nVar2 = (l1.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    z1.j jVar2 = z1.c.f58463a;
                    l1.s sVar5 = (l1.s) nVar2;
                    if (sVar5.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        z1.o oVar = z1.o.f58481a;
                        z1.r rVarD = j0.e2.d(oVar, 1.0f);
                        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                        int iHashCode = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL = sVar5.l();
                        z1.r rVarC = z1.a.c(sVar5, rVarD);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        y2.h hVar3 = y2.j.f56917f;
                        l1.t.J(hVar3, uVarA, sVar5);
                        y2.h hVar4 = y2.j.f56916e;
                        l1.t.J(hVar4, q1VarL, sVar5);
                        y2.h hVar5 = y2.j.f56918g;
                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar5, iHashCode, hVar5);
                        }
                        y2.h hVar6 = y2.j.f56915d;
                        l1.t.J(hVar6, rVarC, sVar5);
                        boolean z21 = z11;
                        l1.b1 b1Var11 = b1Var6;
                        jt.g gVar7 = gVar;
                        if (z21) {
                            sVar5.d0(-1865202625);
                            z1.r rVarG = j0.e2.g(j0.c.E(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 7), 150);
                            w2.q0 q0VarD = j0.o.d(jVar2, false);
                            int iHashCode2 = Long.hashCode(sVar5.T);
                            l1.q1 q1VarL2 = sVar5.l();
                            z1.r rVarC2 = z1.a.c(sVar5, rVarG);
                            sVar5.h0();
                            if (sVar5.S) {
                                sVar5.k(iVar);
                            } else {
                                sVar5.r0();
                            }
                            l1.t.J(hVar3, q0VarD, sVar5);
                            l1.t.J(hVar4, q1VarL2, sVar5);
                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode2))) {
                                defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar5);
                            }
                            l1.t.J(hVar6, rVarC2, sVar5);
                            b1Var10 = b1Var11;
                            hVar = hVar6;
                            hVar2 = hVar3;
                            a0.o.b(b1Var11.getValue(), null, null, null, BuildConfig.VERSION_NAME, null, t1.e.d(-1936037667, new t(gVar7, 0), sVar5), sVar5, 1597440, 46);
                            sVar5 = sVar5;
                            sVar5.p(true);
                            z18 = false;
                        } else {
                            hVar = hVar6;
                            hVar2 = hVar3;
                            b1Var10 = b1Var11;
                            z18 = false;
                            sVar5.d0(-1877469914);
                        }
                        sVar5.p(z18);
                        z1.h hVar7 = z1.c.P;
                        z1.r rVarD2 = j0.e2.d(oVar, 1.0f);
                        j0.u uVarA2 = j0.t.a(j0.i.f35306d, hVar7, sVar5, 54);
                        int iHashCode3 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL3 = sVar5.l();
                        z1.r rVarC3 = z1.a.c(sVar5, rVarD2);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar2, uVarA2, sVar5);
                        l1.t.J(hVar4, q1VarL3, sVar5);
                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar5);
                        }
                        l1.t.J(hVar, rVarC3, sVar5);
                        PermissionState permissionStateA = PermissionStateKt.a(sVar5);
                        Object objQ11 = sVar5.Q();
                        l1.g gVar8 = l1.m.f39353a;
                        if (objQ11 == gVar8) {
                            objQ11 = l1.t.B(Boolean.valueOf(PermissionsUtilKt.b(permissionStateA.getStatus())));
                            sVar5.o0(objQ11);
                        }
                        l1.b1 b1Var12 = (l1.b1) objQ11;
                        PermissionStatus status = permissionStateA.getStatus();
                        boolean zF2 = sVar5.f(permissionStateA) | sVar5.h(gVar7);
                        rz.b0 b0Var4 = b0Var;
                        boolean zH3 = zF2 | sVar5.h(b0Var4);
                        Object objQ12 = sVar5.Q();
                        if (zH3 || objQ12 == gVar8) {
                            gVar4 = gVar7;
                            b0Var2 = b0Var4;
                            objQ12 = new ad.x(permissionStateA, gVar4, b0Var2, b1Var12, null, 2);
                            sVar5.o0(objQ12);
                        } else {
                            gVar4 = gVar7;
                            b0Var2 = b0Var4;
                        }
                        l1.t.f((fz.e) objQ12, status, sVar5);
                        long jA = ef.e.a(190, 52);
                        z1.r rVarE = j0.c.E(j0.v.a(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 32, 7);
                        z1.j jVar3 = z1.c.H;
                        w2.q0 q0VarD2 = j0.o.d(jVar3, false);
                        int iHashCode4 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL4 = sVar5.l();
                        z1.r rVarC4 = z1.a.c(sVar5, rVarE);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar2, q0VarD2, sVar5);
                        l1.t.J(hVar4, q1VarL4, sVar5);
                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar5);
                        }
                        l1.t.J(hVar, rVarC4, sVar5);
                        RecordingStatus recordingStatus = (RecordingStatus) b1Var10.getValue();
                        RecordingStatus.ReadyRecord readyRecord2 = RecordingStatus.ReadyRecord.INSTANCE;
                        if (kotlin.jvm.internal.m.a(recordingStatus, readyRecord2) || (recordingStatus instanceof RecordingStatus.RecognizeShowScore)) {
                            d0Var3 = this;
                            readyRecord = readyRecord2;
                            j11 = jA;
                            gVar5 = gVar8;
                            gVar6 = gVar4;
                            b0Var3 = b0Var2;
                            jVar = jVar3;
                            sVar5.d0(1869508124);
                            boolean zH4 = sVar5.h(gVar6);
                            ys.d0 d0Var5 = d0Var2;
                            boolean zH5 = zH4 | sVar5.h(d0Var5);
                            CourseSentence courseSentence6 = courseSentence5;
                            boolean zH6 = zH5 | sVar5.h(courseSentence6);
                            Object objQ13 = sVar5.Q();
                            if (zH6 || objQ13 == gVar5) {
                                r rVar = new r(courseSentence6, gVar6, d0Var5, b1Var9, 1);
                                d0Var4 = d0Var5;
                                sVar5.o0(rVar);
                                objQ13 = rVar;
                            } else {
                                d0Var4 = d0Var5;
                            }
                            fz.a aVar3 = (fz.a) objQ13;
                            boolean zH7 = sVar5.h(gVar6) | sVar5.h(d0Var4) | sVar5.h(courseSentence6);
                            Object objQ14 = sVar5.Q();
                            if (zH7 || objQ14 == gVar5) {
                                objQ14 = new androidx.lifecycle.compose.a(courseSentence6, gVar6, d0Var4, 6);
                                sVar5.o0(objQ14);
                            }
                            fz.a aVar4 = (fz.a) objQ14;
                            boolean zH8 = sVar5.h(gVar6);
                            Object objQ15 = sVar5.Q();
                            if (zH8 || objQ15 == gVar5) {
                                objQ15 = new av.d(gVar6, 15);
                                sVar5.o0(objQ15);
                            }
                            l1.s sVar6 = sVar5;
                            s5.a(b1Var10, b1Var8, aVar3, aVar4, (fz.a) objQ15, sVar6, 0);
                            sVar5 = sVar6;
                            sVar5.p(false);
                        } else if ((recordingStatus instanceof RecordingStatus.RecognizeSuccess) || (recordingStatus instanceof RecordingStatus.RecognizeError) || kotlin.jvm.internal.m.a(recordingStatus, RecordingStatus.Recognizing.INSTANCE)) {
                            sVar5.d0(1870743877);
                            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                            int iHashCode5 = Long.hashCode(sVar5.T);
                            l1.q1 q1VarL5 = sVar5.l();
                            z1.r rVarC5 = z1.a.c(sVar5, oVar);
                            sVar5.h0();
                            if (sVar5.S) {
                                sVar5.k(iVar);
                            } else {
                                sVar5.r0();
                            }
                            l1.t.J(hVar2, a2VarA, sVar5);
                            l1.t.J(hVar4, q1VarL5, sVar5);
                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode5))) {
                                defpackage.e.A(iHashCode5, sVar5, iHashCode5, hVar5);
                            }
                            l1.t.J(hVar, rVarC5, sVar5);
                            z1.r rVarP = j0.e2.p(oVar, 42, 24);
                            w2.q0 q0VarD3 = j0.o.d(jVar2, false);
                            int iHashCode6 = Long.hashCode(sVar5.T);
                            l1.q1 q1VarL6 = sVar5.l();
                            z1.r rVarC6 = z1.a.c(sVar5, rVarP);
                            sVar5.h0();
                            if (sVar5.S) {
                                sVar5.k(iVar);
                            } else {
                                sVar5.r0();
                            }
                            l1.t.J(hVar2, q0VarD3, sVar5);
                            l1.t.J(hVar4, q1VarL6, sVar5);
                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode6))) {
                                defpackage.e.A(iHashCode6, sVar5, iHashCode6, hVar5);
                            }
                            l1.t.J(hVar, rVarC6, sVar5);
                            tv.a.d(0, 1, sVar5, null);
                            sVar5.p(true);
                            l1.s sVar7 = sVar5;
                            jVar = jVar3;
                            readyRecord = readyRecord2;
                            d0Var3 = this;
                            gVar5 = gVar8;
                            j11 = jA;
                            b0Var3 = b0Var2;
                            gVar6 = gVar4;
                            ua.b(ub.a.e0(sVar5, R.string.grading_your_recording_now), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar5.j(ua.f31167a), g2.f0.e(4287861394L), 0L, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777210), sVar7, 0, 0, 65534);
                            sVar5 = sVar7;
                            sVar5.p(true);
                            sVar5.p(false);
                        } else {
                            sVar5.d0(476011524);
                            sVar5.p(false);
                            d0Var3 = this;
                            readyRecord = readyRecord2;
                            j11 = jA;
                            gVar5 = gVar8;
                            gVar6 = gVar4;
                            b0Var3 = b0Var2;
                            jVar = jVar3;
                        }
                        sVar5.p(true);
                        RecordingStatus recordingStatus2 = (RecordingStatus) b1Var10.getValue();
                        boolean zA = kotlin.jvm.internal.m.a(recordingStatus2, readyRecord);
                        boolean z22 = z17;
                        if (zA || (recordingStatus2 instanceof RecordingStatus.RecognizeShowScore)) {
                            sVar5.d0(-645493028);
                            z1.r rVarO = j0.e2.o(j11, oVar);
                            boolean zG = sVar5.g(z22);
                            fz.a aVar5 = stopPlayAudio;
                            boolean zF3 = zG | sVar5.f(aVar5) | sVar5.h(gVar6) | sVar5.h(b0Var3) | sVar5.f(permissionStateA);
                            Object objQ16 = sVar5.Q();
                            if (zF3 || objQ16 == gVar5) {
                                u uVar = new u(z22, aVar5, gVar6, b0Var3, permissionStateA, b1Var12);
                                sVar5.o0(uVar);
                                objQ16 = uVar;
                            }
                            dt.a0.j(6, 2, (fz.a) objQ16, sVar5, rVarO, false);
                            z19 = false;
                            sVar5.p(false);
                        } else if ((recordingStatus2 instanceof RecordingStatus.RecognizeSuccess) || (recordingStatus2 instanceof RecordingStatus.RecognizeError) || (recordingStatus2 instanceof RecordingStatus.Recognizing)) {
                            sVar5.d0(-644771317);
                            z1.r rVarO2 = j0.e2.o(j11, oVar);
                            Object objQ17 = sVar5.Q();
                            if (objQ17 == gVar5) {
                                objQ17 = new ju.d(25);
                                sVar5.o0(objQ17);
                            }
                            dt.a0.j(438, 0, (fz.a) objQ17, sVar5, rVarO2, false);
                            z19 = false;
                            sVar5.p(false);
                        } else {
                            if (!kotlin.jvm.internal.m.a(recordingStatus2, RecordingStatus.Recording.INSTANCE)) {
                                throw nv.p.x(sVar5, 1918837330, false);
                            }
                            sVar5.d0(-644495820);
                            z1.r rVarO3 = j0.e2.o(j11, oVar);
                            long jE = g2.f0.e(4294932857L);
                            boolean zG2 = sVar5.g(z22) | sVar5.h(gVar6);
                            Object objQ18 = sVar5.Q();
                            if (zG2 || objQ18 == gVar5) {
                                objQ18 = new w(z22, gVar6, 0);
                                sVar5.o0(objQ18);
                            }
                            l1.s sVar8 = sVar5;
                            dt.a0.h(rVarO3, jE, (fz.a) objQ18, c.f5242b, sVar8, 3126, 0);
                            sVar5 = sVar8;
                            z19 = false;
                            sVar5.p(false);
                        }
                        z1.r rVarE2 = j0.c.E(j0.v.a(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 28, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                        w2.q0 q0VarD4 = j0.o.d(jVar2, z19);
                        int iHashCode7 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL7 = sVar5.l();
                        z1.r rVarC7 = z1.a.c(sVar5, rVarE2);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar2, q0VarD4, sVar5);
                        l1.t.J(hVar4, q1VarL7, sVar5);
                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode7))) {
                            defpackage.e.A(iHashCode7, sVar5, iHashCode7, hVar5);
                        }
                        l1.t.J(hVar, rVarC7, sVar5);
                        if (kotlin.jvm.internal.m.a((RecordingStatus) b1Var10.getValue(), readyRecord)) {
                            sVar5.d0(-236403866);
                            if (courseTestParams.f33767p) {
                                sVar5.d0(-236334643);
                                String strE1 = ub.a.e0(sVar5, R.string.can_t_speak_now);
                                j3.y0 y0VarA = j3.y0.a((j3.y0) sVar5.j(ua.f31167a), ((h1.s1) sVar5.j(h1.v1.f31180a)).f31036s, fr.j3.A(14), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208);
                                z1.r rVarE3 = j0.c.E(j0.r.f35391a.a(oVar, jVar), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 4, 7);
                                fz.a aVar6 = onClickSkip;
                                boolean zF4 = sVar5.f(aVar6);
                                Object objQ19 = sVar5.Q();
                                if (zF4 || objQ19 == gVar5) {
                                    objQ19 = new at.r(16, aVar6);
                                    sVar5.o0(objQ19);
                                }
                                l1.s sVar9 = sVar5;
                                ua.b(strE1, iu.k.q(0, 7, (fz.a) objQ19, sVar5, rVarE3, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar9, 0, 0, 65532);
                                sVar5 = sVar9;
                                z20 = false;
                            } else {
                                z20 = false;
                                sVar5.d0(-254655271);
                            }
                            sVar5.p(z20);
                            sVar5.p(z20);
                        } else {
                            sVar5.d0(-838876371);
                            sVar5.p(false);
                        }
                        com.google.android.material.datepicker.d.B(sVar5, true, true, true);
                    } else {
                        sVar5.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar4);
            Object objQ11 = sVar4.Q();
            if (objQ11 == gVar2) {
                objQ11 = new ju.d(25);
                sVar4.o0(objQ11);
            }
            fz.a aVar3 = (fz.a) objQ11;
            if (i14 != 2048) {
                if ((i13 & 4096) == 0 || !sVar4.h(d0Var2)) {
                    i13 = i15;
                    i13 = i15;
                    z12 = false;
                }
                if ((i13 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z12 | z13;
                objQ = sVar4.Q();
                if (z14 || objQ == gVar2) {
                    objQ = new e0(d0Var2, courseTestParams, 0);
                    sVar4.o0(objQ);
                }
                fz.c cVar2 = (fz.c) objQ;
                objQ2 = sVar4.Q();
                if (objQ2 == gVar2) {
                    objQ2 = new ys.d(3);
                    sVar4.o0(objQ2);
                }
                fz.a aVar4 = (fz.a) objQ2;
                if ((458752 & i13) == 131072) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | ((3670016 & i13) == 1048576);
                objQ3 = sVar4.Q();
                if (!z16 || objQ3 == gVar2) {
                    cVar = onChecked;
                    aVar = onClickContinue;
                    objQ3 = new at.f(13, cVar, aVar);
                    sVar4.o0(objQ3);
                } else {
                    cVar = onChecked;
                    aVar = onClickContinue;
                }
                fz.a aVar5 = (fz.a) objQ3;
                objQ4 = sVar4.Q();
                if (objQ4 == gVar2) {
                    objQ4 = new ju.d(25);
                    sVar4.o0(objQ4);
                }
                sVar = sVar4;
                dt.k3.e(null, qVar, aVar2, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, strE0, dVarD, dVarD2, dVarD3, null, null, c.f5243c, null, null, null, null, null, null, null, aVar3, cVar2, aVar4, aVar5, null, null, (fz.a) objQ4, sVar, 196608, 807100416, 817889280, 3072, 133570521, 3);
            } else {
                i13 = i15;
            }
            i13 = i15;
            z12 = true;
            if ((i13 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z12 | z13;
            objQ = sVar4.Q();
            if (z14) {
                objQ = new e0(d0Var2, courseTestParams, 0);
                sVar4.o0(objQ);
            } else {
                objQ = new e0(d0Var2, courseTestParams, 0);
                sVar4.o0(objQ);
            }
            fz.c cVar3 = (fz.c) objQ;
            objQ2 = sVar4.Q();
            if (objQ2 == gVar2) {
                objQ2 = new ys.d(3);
                sVar4.o0(objQ2);
            }
            fz.a aVar6 = (fz.a) objQ2;
            if ((458752 & i13) == 131072) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z15 | ((3670016 & i13) == 1048576);
            objQ3 = sVar4.Q();
            if (z16) {
                cVar = onChecked;
                aVar = onClickContinue;
                objQ3 = new at.f(13, cVar, aVar);
                sVar4.o0(objQ3);
            } else {
                cVar = onChecked;
                aVar = onClickContinue;
                objQ3 = new at.f(13, cVar, aVar);
                sVar4.o0(objQ3);
            }
            fz.a aVar7 = (fz.a) objQ3;
            objQ4 = sVar4.Q();
            if (objQ4 == gVar2) {
                objQ4 = new ju.d(25);
                sVar4.o0(objQ4);
            }
            sVar = sVar4;
            dt.k3.e(null, qVar, aVar2, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, strE0, dVarD, dVarD2, dVarD3, null, null, c.f5243c, null, null, null, null, null, null, null, aVar3, cVar3, aVar6, aVar7, null, null, (fz.a) objQ4, sVar, 196608, 807100416, 817889280, 3072, 133570521, 3);
        } else {
            sVar = sVar3;
            cVar = onChecked;
            aVar = onClickContinue;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            final ys.d0 d0Var3 = d0Var2;
            x1VarT.f39502d = new fz.e() { // from class: bt.q
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    i0.e(gVar, z11, courseTestParams, d0Var3, stopPlayAudio, cVar, aVar, onClickSkip, getAudioTime, getAudioDuration, (l1.n) obj, l1.t.M(i11 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void f(jt.g gVar, ys.d0 d0Var, List list, ht.l lVar) {
        gVar.h();
        if (kotlin.jvm.internal.m.a(gVar.f36941j.getValue(), RecordingStatus.Recording.INSTANCE)) {
            gVar.i();
        }
        if (d0Var != null) {
            jh.h.m(d0Var, list, lVar, new s(gVar, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final void g(int i11, int i12, int i13, String str, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        l1.s sVar;
        z1.o oVar;
        fz.a aVar;
        y2.h hVar;
        y2.h hVar2;
        y2.h hVar3;
        float f5;
        y2.h hVar4;
        ?? r9;
        l1.s sVar2;
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(2121700154);
        int i14 = i13 | (sVar3.f(str) ? 4 : 2) | (sVar3.d(i11) ? 32 : 16) | 3072;
        if (sVar3.T(i14 & 1, (i14 & 1171) != 1170)) {
            Object objQ = sVar3.Q();
            Object obj = l1.m.f39353a;
            if (objQ == obj) {
                objQ = b0.e.a(CropImageView.DEFAULT_ASPECT_RATIO);
                sVar3.o0(objQ);
            }
            b0.d dVar = (b0.d) objQ;
            boolean zH = ((i14 & 112) == 32) | sVar3.h(dVar);
            Object objQ2 = sVar3.Q();
            if (zH || objQ2 == obj) {
                objQ2 = new bh.z0(i12, i11, dVar, (vy.d) null);
                sVar3.o0(objQ2);
            }
            l1.t.f((fz.e) objQ2, qy.b0.f48488a, sVar3);
            long jI = s5.i(i11);
            float f11 = 6;
            j0.a2 a2VarA = j0.z1.a(j0.i.g(f11), z1.c.M, sVar3, 54);
            int iHashCode = Long.hashCode(sVar3.T);
            l1.q1 q1VarL = sVar3.l();
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar3, oVar2);
            y2.k.J.getClass();
            fz.a aVar2 = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(aVar2);
            } else {
                sVar3.r0();
            }
            y2.h hVar5 = y2.j.f56917f;
            l1.t.J(hVar5, a2VarA, sVar3);
            y2.h hVar6 = y2.j.f56916e;
            l1.t.J(hVar6, q1VarL, sVar3);
            y2.h hVar7 = y2.j.f56918g;
            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar7);
            }
            y2.h hVar8 = y2.j.f56915d;
            l1.t.J(hVar8, rVarC, sVar3);
            if (str.length() > 0) {
                sVar3.d0(-1009822709);
                j3.y0 y0VarA = j3.y0.a(((dc) sVar3.j(fc.f30256a)).f30179l, g2.x.c(((h1.s1) sVar3.j(h1.v1.f31180a)).f31034q, 0.8f), fr.j3.A(12), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208);
                hVar2 = hVar5;
                oVar = oVar2;
                hVar = hVar6;
                hVar4 = hVar7;
                hVar3 = hVar8;
                f5 = f11;
                aVar = aVar2;
                r9 = 0;
                ua.b(str, j0.e2.s(oVar2, 24), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar3, (i14 & 14) | 48, 0, 65532);
                sVar2 = sVar3;
            } else {
                l1.s sVar4 = sVar3;
                oVar = oVar2;
                aVar = aVar2;
                hVar = hVar6;
                hVar2 = hVar5;
                hVar3 = hVar8;
                f5 = f11;
                hVar4 = hVar7;
                r9 = 0;
                sVar4.d0(-1036069820);
                sVar2 = sVar4;
            }
            sVar2.p(r9);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarH = d0.n.h(d2.h.b(j0.e2.g(new j0.i1(1.0f, true), f5), r0.f.d(4)), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31026h, g2.f0.f28556b);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, r9);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarH);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(aVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, q0VarD, sVar2);
            l1.t.J(hVar, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
            }
            l1.t.J(hVar3, rVarC2, sVar2);
            z1.o oVar3 = oVar;
            j0.o.a(d0.n.g(j0.e2.e(j0.e2.c(oVar3, 1.0f), ((Number) dVar.d()).floatValue()), fr.p3.q(ns.o.L(new g2.x(g2.x.c(jI, 0.7f)), new g2.x(jI))), null, 6), sVar2, r9);
            sVar2.p(true);
            l1.s sVar5 = sVar2;
            ua.b(String.valueOf(i11), j0.e2.s(oVar3, 18), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar2.j(fc.f30256a)).f30179l, jI, fr.j3.A(9), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar5, 48, 0, 65532);
            l1.s sVar6 = sVar5;
            sVar6.p(true);
            rVar2 = oVar3;
            sVar = sVar6;
        } else {
            l1.s sVar7 = sVar3;
            sVar7.W();
            rVar2 = rVar;
            sVar = sVar7;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(str, i11, i12, rVar2, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0215 A[PHI: r10
      0x0215: PHI (r10v18 boolean) = (r10v6 boolean), (r10v7 boolean), (r10v8 boolean), (r10v19 boolean) binds: [B:74:0x0213, B:70:0x01fe, B:66:0x01e9, B:60:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void h(bv.z zVar, l1.n nVar, int i11) {
        b0.d dVar;
        bv.c0 c0Var;
        boolean z11;
        String strM;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(452321981);
        int i12 = i11 | (sVar.h(zVar) ? 4 : 2);
        boolean z12 = true;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            float f5 = 8;
            j0.a2 a2VarA = j0.z1.a(j0.i.g(f5), z1.c.L, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            sVar.d0(-318975621);
            for (bv.c0 c0Var2 : zVar.f6383d) {
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = l1.t.B(Boolean.FALSE);
                    sVar.o0(objQ);
                }
                l1.b1 b1Var = (l1.b1) objQ;
                Object objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = b0.e.a(CropImageView.DEFAULT_ASPECT_RATIO);
                    sVar.o0(objQ2);
                }
                b0.d dVar2 = (b0.d) objQ2;
                boolean zH = sVar.h(dVar2) | sVar.h(c0Var2);
                Object objQ3 = sVar.Q();
                vy.d dVar3 = null;
                if (zH || objQ3 == gVar) {
                    dVar = dVar2;
                    ad.x xVar = new ad.x(b1Var, dVar, c0Var2, dVar3, 3);
                    c0Var = c0Var2;
                    sVar.o0(xVar);
                    objQ3 = xVar;
                } else {
                    dVar = dVar2;
                    c0Var = c0Var2;
                }
                l1.t.f((fz.e) objQ3, c0Var, sVar);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j0.i1 i1Var = new j0.i1(1.0f, z12);
                j0.a2 a2VarA2 = j0.z1.a(j0.i.g(f5), z1.c.M, sVar, 54);
                int iHashCode2 = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, i1Var);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                y2.h hVar2 = y2.j.f56917f;
                l1.t.J(hVar2, a2VarA2, sVar);
                y2.h hVar3 = y2.j.f56916e;
                l1.t.J(hVar3, q1VarL2, sVar);
                y2.h hVar4 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
                }
                y2.h hVar5 = y2.j.f56915d;
                l1.t.J(hVar5, rVarC2, sVar);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
                float f11 = f5;
                int iHashCode3 = Long.hashCode(sVar.T);
                l1.q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, oVar);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar2, uVarA, sVar);
                l1.t.J(hVar3, q1VarL3, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
                }
                l1.t.J(hVar5, rVarC3, sVar);
                int iFloatValue = (int) ((Number) dVar.d()).floatValue();
                int i13 = c0Var.f6289f;
                b(iFloatValue, i13 / 100.0f, s5.i(i13), sVar, 0);
                String strQ0 = oz.x.q0(c0Var.f6288e, "tone", BuildConfig.VERSION_NAME);
                switch (strQ0.hashCode()) {
                    case 49:
                        z11 = false;
                        if (strQ0.equals("1")) {
                            strM = ep.a.m(sVar, 392868502, R.string.chinese_tone_label_1st_tone, sVar, false);
                        } else {
                            strM = ep.a.m(sVar, 392879930, R.string.chinese_tone_label_neutral_tone, sVar, z11);
                        }
                        break;
                    case 50:
                        z11 = false;
                        if (strQ0.equals("2")) {
                            strM = ep.a.m(sVar, 392871350, R.string.chinese_tone_label_2nd_tone, sVar, false);
                        } else {
                            strM = ep.a.m(sVar, 392879930, R.string.chinese_tone_label_neutral_tone, sVar, z11);
                        }
                        break;
                    case 51:
                        z11 = false;
                        if (strQ0.equals("3")) {
                            strM = ep.a.m(sVar, 392874198, R.string.chinese_tone_label_3rd_tone, sVar, false);
                        } else {
                            strM = ep.a.m(sVar, 392879930, R.string.chinese_tone_label_neutral_tone, sVar, z11);
                        }
                        break;
                    case 52:
                        if (strQ0.equals("4")) {
                            z11 = false;
                            strM = ep.a.m(sVar, 392877046, R.string.chinese_tone_label_4th_tone, sVar, false);
                            break;
                        }
                    default:
                        z11 = false;
                        strM = ep.a.m(sVar, 392879930, R.string.chinese_tone_label_neutral_tone, sVar, z11);
                        break;
                }
                l1.s sVar2 = sVar;
                z1.o oVar2 = oVar;
                bv.c0 c0Var3 = c0Var;
                ua.b(strM, null, 0L, fr.j3.A(12), null, n3.s.L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 199680, 0, 131030);
                sVar2.p(true);
                boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                j0.c2 c2Var = j0.c2.f35266a;
                z1.r rVarA = c2Var.a(oVar2, 1.0f);
                b0.i2 i2VarR = b0.e.r(500, 200, null, 4);
                Object objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = new br.b(4);
                    sVar2.o0(objQ4);
                }
                a0.j0.b(c2Var, zBooleanValue, rVarA, a0.f1.o(i2VarR, (fz.c) objQ4).a(a0.f1.e(b0.e.r(500, 200, null, 4), 2)), null, null, t1.e.d(1448003647, new a00.b(c0Var3, 3), sVar2), sVar2, 1575942, 24);
                sVar = sVar2;
                sVar.p(true);
                z12 = true;
                f5 = f11;
                oVar = oVar2;
            }
            sVar.p(false);
            sVar.p(z12);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new x(zVar, i11, 1);
        }
    }
}
