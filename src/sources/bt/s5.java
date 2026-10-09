package bt;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import com.google.accompanist.permissions.PermissionStatus;
import com.google.accompanist.permissions.PermissionsUtilKt;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.RecordingStatus;
import com.yalantis.ucrop.view.CropImageView;
import h1.ua;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f5974a = g2.f0.e(4279086881L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f5975b = g2.f0.e(4281451849L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f5976c = g2.f0.e(4282633065L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f5977d = g2.f0.e(4283486599L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f5978e = g2.f0.e(4285323180L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f5979f = g2.f0.e(4280333557L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f5980g = g2.f0.e(4283416822L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f5981h = g2.f0.e(4284925941L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f5982i = g2.f0.e(4285976311L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f5983j = g2.f0.e(4285914355L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f5984k = g2.f0.e(4294954565L);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f5985l = g2.f0.e(4294950968L);
    public static final long m = g2.f0.e(4294945578L);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f5986n = g2.f0.e(4294941722L);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f5987o = g2.f0.e(4294938112L);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f5988p = g2.f0.e(4294938203L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f5989q = g2.f0.e(4294929724L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f5990r = g2.f0.e(4294926632L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f5991s = g2.f0.e(4294327605L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f5992t = g2.f0.e(4294256423L);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f5993u = 0;

    /* JADX WARN: Code duplicated, block: B:112:0x0367  */
    /* JADX WARN: Code duplicated, block: B:113:0x036b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0388  */
    /* JADX WARN: Code duplicated, block: B:123:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:130:0x03c4  */
    public static final void a(l1.b1 recordingStatusState, l1.b1 audioPlayingState, fz.a playAudio, fz.a playSlowAudio, fz.a aVar, l1.n nVar, int i11) {
        y2.h hVar;
        l1.g gVar;
        l1.g gVar2;
        y2.h hVar2;
        int iHashCode;
        boolean zG;
        Object objQ;
        fz.a playRecording = aVar;
        kotlin.jvm.internal.m.f(recordingStatusState, "recordingStatusState");
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        kotlin.jvm.internal.m.f(playSlowAudio, "playSlowAudio");
        kotlin.jvm.internal.m.f(playRecording, "playRecording");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-506099065);
        int i12 = i11 | (sVar.f(recordingStatusState) ? 4 : 2) | (sVar.f(audioPlayingState) ? 32 : 16) | (sVar.h(playAudio) ? 256 : 128) | (sVar.h(playSlowAudio) ? 2048 : 1024) | (sVar.h(playRecording) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            float f5 = 42;
            z1.o oVar = z1.o.f58481a;
            float f11 = 2;
            z1.r rVarG = j0.e2.g(d0.n.j(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f11, ((h1.s1) sVar.j(h1.v1.f31180a)).A, r0.f.d(10)), f5);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarG);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar3 = y2.j.f56917f;
            l1.t.J(hVar3, a2VarA, sVar);
            y2.h hVar4 = y2.j.f56916e;
            l1.t.J(hVar4, q1VarL, sVar);
            y2.h hVar5 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
            }
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar);
            boolean zF = sVar.f((RecordingStatus) recordingStatusState.getValue());
            Object objQ2 = sVar.Q();
            l1.g gVar3 = l1.m.f39353a;
            if (zF || objQ2 == gVar3) {
                objQ2 = Boolean.valueOf(!(recordingStatusState.getValue() instanceof RecordingStatus.Recording));
                sVar.o0(objQ2);
            }
            boolean zBooleanValue = ((Boolean) objQ2).booleanValue();
            boolean zG2 = sVar.g(zBooleanValue);
            Object objQ3 = sVar.Q();
            if (zG2 || objQ3 == gVar3) {
                g2.x xVar = new g2.x(zBooleanValue ? g2.f0.e(4294939923L) : g2.f0.e(4289835441L));
                sVar.o0(xVar);
                objQ3 = xVar;
            }
            long j11 = ((g2.x) objQ3).f28624a;
            boolean zF2 = sVar.f((RecordingStatus) recordingStatusState.getValue());
            Object objQ4 = sVar.Q();
            if (zF2 || objQ4 == gVar3) {
                objQ4 = Boolean.valueOf((recordingStatusState.getValue() instanceof RecordingStatus.RecognizeShowScore) && !(recordingStatusState.getValue() instanceof RecordingStatus.Recording));
                sVar.o0(objQ4);
            }
            boolean zBooleanValue2 = ((Boolean) objQ4).booleanValue();
            boolean zG3 = sVar.g(zBooleanValue2);
            Object objQ5 = sVar.Q();
            if (zG3 || objQ5 == gVar3) {
                g2.x xVar2 = new g2.x(zBooleanValue2 ? g2.f0.e(4294939923L) : g2.f0.e(4289835441L));
                sVar.o0(xVar2);
                objQ5 = xVar2;
            }
            long j12 = ((g2.x) objQ5).f28624a;
            float f12 = 62;
            z1.r rVarP = j0.e2.p(oVar, f12, f5);
            z1.j jVar = z1.c.f58467e;
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarP);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, q0VarD, sVar);
            l1.t.J(hVar4, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar5);
            }
            l1.t.J(hVar6, rVarC2, sVar);
            boolean z11 = audioPlayingState.getValue() instanceof ht.i;
            z1.r rVarN = j0.e2.n(oVar, 38);
            boolean zG4 = sVar.g(zBooleanValue) | ((i12 & 7168) == 2048);
            Object objQ6 = sVar.Q();
            if (zG4 || objQ6 == gVar3) {
                objQ6 = new n5(zBooleanValue, playSlowAudio, 0);
                sVar.o0(objQ6);
            }
            dt.a0.b(z11, rVarN, j11, (fz.a) objQ6, sVar, 48, 0);
            sVar.p(true);
            float f13 = f5 - 20;
            h1.k7.n(j0.e2.p(oVar, f11, f13), f11, 0L, sVar, 54, 4);
            z1.r rVarP2 = j0.e2.p(oVar, f12, f5);
            w2.q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarP2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, q0VarD2, sVar);
            l1.t.J(hVar4, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                hVar = hVar5;
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar);
            } else {
                hVar = hVar5;
            }
            l1.t.J(hVar6, rVarC3, sVar);
            boolean z12 = audioPlayingState.getValue() instanceof ht.c;
            float f14 = 30;
            z1.r rVarN2 = j0.e2.n(oVar, f14);
            boolean zG5 = sVar.g(zBooleanValue) | ((i12 & 896) == 256);
            Object objQ7 = sVar.Q();
            if (zG5) {
                gVar = gVar3;
            } else {
                gVar = gVar3;
                if (objQ7 != gVar) {
                    gVar2 = gVar;
                }
                l1.g gVar4 = gVar2;
                hVar2 = hVar;
                dt.a0.a(z12, rVarN2, j11, (fz.a) objQ7, sVar, 48, 0);
                sVar = sVar;
                sVar.p(true);
                h1.k7.n(j0.e2.p(oVar, f11, f13), f11, 0L, sVar, 54, 4);
                z1.r rVarP3 = j0.e2.p(oVar, f12, f5);
                w2.q0 q0VarD3 = j0.o.d(jVar, false);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL4 = sVar.l();
                z1.r rVarC4 = z1.a.c(sVar, rVarP3);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar3, q0VarD3, sVar);
                l1.t.J(hVar4, q1VarL4, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
                }
                l1.t.J(hVar6, rVarC4, sVar);
                boolean zA = kotlin.jvm.internal.m.a(audioPlayingState.getValue(), ht.g.f33738e);
                z1.r rVarN3 = j0.e2.n(oVar, f14);
                zG = sVar.g(zBooleanValue2) | ((i12 & 57344) == 16384);
                objQ = sVar.Q();
                if (!zG || objQ == gVar4) {
                    playRecording = aVar;
                    objQ = new n5(zBooleanValue2, playRecording, 2);
                    sVar.o0(objQ);
                } else {
                    playRecording = aVar;
                }
                dt.a0.c(48, j12, (fz.a) objQ, sVar, rVarN3, zA);
                sVar.p(true);
                sVar.p(true);
            }
            gVar2 = gVar;
            objQ7 = new n5(zBooleanValue, playAudio, 1);
            sVar.o0(objQ7);
            l1.g gVar5 = gVar2;
            hVar2 = hVar;
            dt.a0.a(z12, rVarN2, j11, (fz.a) objQ7, sVar, 48, 0);
            sVar = sVar;
            sVar.p(true);
            h1.k7.n(j0.e2.p(oVar, f11, f13), f11, 0L, sVar, 54, 4);
            z1.r rVarP4 = j0.e2.p(oVar, f12, f5);
            w2.q0 q0VarD4 = j0.o.d(jVar, false);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarP4);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, q0VarD4, sVar);
            l1.t.J(hVar4, q1VarL5, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
            }
            l1.t.J(hVar6, rVarC5, sVar);
            boolean zA2 = kotlin.jvm.internal.m.a(audioPlayingState.getValue(), ht.g.f33738e);
            z1.r rVarN4 = j0.e2.n(oVar, f14);
            zG = sVar.g(zBooleanValue2) | ((i12 & 57344) == 16384);
            objQ = sVar.Q();
            if (zG) {
                playRecording = aVar;
                objQ = new n5(zBooleanValue2, playRecording, 2);
                sVar.o0(objQ);
            } else {
                playRecording = aVar;
                objQ = new n5(zBooleanValue2, playRecording, 2);
                sVar.o0(objQ);
            }
            dt.a0.c(48, j12, (fz.a) objQ, sVar, rVarN4, zA2);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v1(recordingStatusState, audioPlayingState, playAudio, playSlowAudio, playRecording, i11);
        }
    }

    public static final void b(ot.q data, ht.o courseTestParams, ys.d0 d0Var, fz.a onClickSkip, l1.n nVar, int i11) {
        fz.a aVar;
        Object obj;
        Object x0Var;
        int i12;
        vy.d dVar;
        String str;
        vy.d dVar2;
        ys.d0 d0Var2;
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(onClickSkip, "onClickSkip");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1930768472);
        int i13 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128) | (sVar.h(onClickSkip) ? 2048 : 1024);
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            CourseSentence courseSentence = data.f45948a;
            List displayWords = data.f45949b;
            int i14 = courseTestParams.f33753a;
            Long lValueOf = Long.valueOf(courseTestParams.f33756d);
            kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
            kotlin.jvm.internal.m.f(displayWords, "displayWords");
            if ((496 & 8) != 0) {
                lValueOf = Long.valueOf(courseSentence.getSentenceId());
            }
            boolean zF = sVar.f(lValueOf);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(displayWords);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zF2 = sVar.f(lValueOf);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            boolean zF3 = sVar.f(lValueOf);
            Object objQ3 = sVar.Q();
            if (zF3 || objQ3 == gVar) {
                objQ3 = l1.t.B(ht.a.f33722e);
                sVar.o0(objQ3);
            }
            l1.b1 b1Var3 = (l1.b1) objQ3;
            boolean zF4 = sVar.f(lValueOf);
            Object objQ4 = sVar.Q();
            if (zF4 || objQ4 == gVar) {
                objQ4 = l1.t.B(RecordingStatus.ReadyRecord.INSTANCE);
                sVar.o0(objQ4);
            }
            l1.b1 b1Var4 = (l1.b1) objQ4;
            boolean zF5 = sVar.f(lValueOf);
            Object objQ5 = sVar.Q();
            if (zF5 || objQ5 == gVar) {
                objQ5 = l1.t.B(null);
                sVar.o0(objQ5);
            }
            l1.b1 b1Var5 = (l1.b1) objQ5;
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF6 = sVar.f(null) | sVar.f(aVarC);
            Object objQ6 = sVar.Q();
            if (zF6 || objQ6 == gVar) {
                objQ6 = w4.c.e(vt.n0.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            vt.n0 n0Var = (vt.n0) objQ6;
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            Object objQ7 = sVar.Q();
            if (objQ7 == gVar) {
                objQ7 = new av.j0(context.getApplicationContext(), 2);
                sVar.o0(objQ7);
            }
            av.j0 j0Var = (av.j0) objQ7;
            e20.a aVarC2 = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF7 = sVar.f(null) | sVar.f(aVarC2);
            Object objQ8 = sVar.Q();
            if (zF7 || objQ8 == gVar) {
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
            Object objE = (zF8 || objQ9 == gVar) ? w4.c.e(av.c.class, aVarC3, null, null, sVar) : objQ9;
            sVar.p(false);
            sVar.p(false);
            av.c cVar = (av.c) objE;
            boolean zF9 = sVar.f(lValueOf);
            Object objQ10 = sVar.Q();
            if (zF9 || objQ10 == gVar) {
                fr.o0 o0Var = (fr.o0) n0Var;
                String strV = o0Var.v();
                String strK = xt.d.k(o0Var.f27733a.keyLanguage);
                String str2 = i14 == 0 ? "w" : "s";
                long sentenceId = courseSentence.getSentenceId();
                StringBuilder sbQ = b7.e0.q(strV, strK, "-", str2, "-");
                sbQ.append(sentenceId);
                sbQ.append(".wav");
                objQ10 = sbQ.toString();
                sVar.o0(objQ10);
            } else {
                b1Var5 = b1Var5;
            }
            String str3 = (String) objQ10;
            boolean zF10 = sVar.f(lValueOf);
            Object objQ11 = sVar.Q();
            if (zF10 || objQ11 == gVar) {
                fr.o0 o0Var2 = (fr.o0) n0Var;
                String strV2 = o0Var2.v();
                String strK2 = xt.d.k(o0Var2.f27733a.keyLanguage);
                String str4 = i14 == 0 ? "w" : "s";
                long sentenceId2 = courseSentence.getSentenceId();
                StringBuilder sbQ2 = b7.e0.q(strV2, strK2, "-", str4, "-");
                sbQ2.append(sentenceId2);
                sbQ2.append("-result.json");
                objQ11 = sbQ2.toString();
                sVar.o0(objQ11);
            } else {
                str3 = str3;
                courseSentence = courseSentence;
            }
            String str5 = (String) objQ11;
            Object objQ12 = sVar.Q();
            if (objQ12 == gVar) {
                objQ12 = ((fr.o0) n0Var).v() + "userWordRecorder.wav";
                sVar.o0(objQ12);
            }
            String str6 = (String) objQ12;
            Object objQ13 = sVar.Q();
            if (objQ13 == gVar) {
                objQ13 = new av.n(context);
                sVar.o0(objQ13);
            }
            av.n nVar2 = (av.n) objQ13;
            Object objQ14 = sVar.Q();
            if (objQ14 == gVar) {
                objQ14 = l1.t.q(sVar);
                sVar.o0(objQ14);
            }
            rz.b0 b0Var = (rz.b0) objQ14;
            boolean zH = sVar.h(j0Var) | sVar.h(iVar) | sVar.h(nVar2);
            Object objQ15 = sVar.Q();
            if (zH || objQ15 == gVar) {
                objQ15 = new jt.h(j0Var, iVar, nVar2, 2);
                sVar.o0(objQ15);
            }
            l1.t.c(qy.b0.f48488a, (fz.c) objQ15, sVar);
            boolean zF11 = sVar.f(lValueOf) | sVar.f(b1Var2);
            Object objQ16 = sVar.Q();
            if (zF11 || objQ16 == gVar) {
                objQ16 = l1.t.s(new jt.i0(5, b1Var2));
                sVar.o0(objQ16);
            }
            l1.b3 b3Var = (l1.b3) objQ16;
            boolean zBooleanValue = ((Boolean) b3Var.getValue()).booleanValue();
            fr.o0 o0Var3 = (fr.o0) n0Var;
            int i15 = o0Var3.f27733a.keyLanguage;
            boolean zF12 = sVar.f(j0Var) | sVar.f(nVar2) | sVar.f(cVar) | sVar.f(lValueOf) | sVar.f(courseSentence) | sVar.g(zBooleanValue);
            String str7 = str3;
            boolean zF13 = zF12 | sVar.f(str7) | sVar.d(i15) | sVar.f(b1Var2) | sVar.f(b1Var3) | sVar.f(b1Var) | sVar.f(b1Var4) | sVar.f(b1Var5);
            Object objQ17 = sVar.Q();
            if (zF13 || objQ17 == gVar) {
                Env env = o0Var3.f27733a;
                boolean zBooleanValue2 = ((Boolean) b3Var.getValue()).booleanValue();
                i12 = i14;
                dVar = null;
                x0Var = new jt.x0(j0Var, nVar2, cVar, courseSentence, str7, str6, zBooleanValue2, b1Var2, b1Var3, b1Var, b1Var4, b1Var5);
                sVar.o0(x0Var);
            } else {
                x0Var = objQ17;
                i12 = i14;
                dVar = null;
            }
            jt.x0 x0Var2 = (jt.x0) x0Var;
            boolean zF14 = sVar.f(r17) | sVar.f(str5);
            Object objQ18 = sVar.Q();
            if (zF14 || objQ18 == gVar) {
                vy.d dVar3 = dVar;
                objQ18 = new fr.c(r17, str5, str6, dVar3, 22);
                str = str6;
                dVar2 = dVar3;
                sVar.o0(objQ18);
            } else {
                dVar2 = dVar;
                str = str6;
            }
            l1.t.f((fz.e) objQ18, lValueOf, sVar);
            Object value = x0Var2.f37265k.getValue();
            boolean zH2 = sVar.h(x0Var2);
            Object objQ19 = sVar.Q();
            if (zH2 || objQ19 == gVar) {
                objQ19 = new jt.b1(x0Var2, str, dVar2);
                sVar.o0(objQ19);
            }
            l1.t.f((fz.e) objQ19, value, sVar);
            Object value2 = x0Var2.f37264j.getValue();
            boolean zH3 = sVar.h(x0Var2) | sVar.f(r17) | ((((0 & 896) ^ 384) > 256 && sVar.d(i12)) || (0 & 384) == 256) | sVar.h(courseSentence) | sVar.h(n0Var) | sVar.h(displayWords) | sVar.h(iVar) | sVar.h(b0Var) | sVar.f(str5);
            Object objQ20 = sVar.Q();
            if (zH3 || objQ20 == gVar) {
                jt.g1 g1Var = new jt.g1(x0Var2, iVar, b0Var, str5, str, str7, i12, courseSentence, n0Var, displayWords, null);
                sVar.o0(g1Var);
                objQ20 = g1Var;
            }
            l1.t.f((fz.e) objQ20, value2, sVar);
            int i16 = i13 & 896;
            boolean zH4 = (i16 == 256) | sVar.h(x0Var2);
            Object objQ21 = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (zH4 || objQ21 == gVar2) {
                d0Var2 = d0Var;
                objQ21 = new at.f(15, d0Var2, x0Var2);
                sVar.o0(objQ21);
            } else {
                d0Var2 = d0Var;
            }
            fz.a aVar2 = (fz.a) objQ21;
            boolean z11 = i16 == 256;
            Object objQ22 = sVar.Q();
            if (z11 || objQ22 == gVar2) {
                objQ22 = new v(d0Var2, 7);
                sVar.o0(objQ22);
            }
            fz.c cVar2 = (fz.c) objQ22;
            boolean z12 = i16 == 256;
            Object objQ23 = sVar.Q();
            if (z12 || objQ23 == gVar2) {
                objQ23 = new d8(d0Var2, 1);
                sVar.o0(objQ23);
            }
            fz.a aVar3 = (fz.a) objQ23;
            boolean z13 = (i13 & 7168) == 2048;
            Object objQ24 = sVar.Q();
            if (z13 || objQ24 == gVar2) {
                aVar = onClickSkip;
                objQ24 = new at.r(23, aVar);
                sVar.o0(objQ24);
            } else {
                aVar = onClickSkip;
            }
            fz.a aVar4 = (fz.a) objQ24;
            boolean z14 = i16 == 256;
            Object objQ25 = sVar.Q();
            if (z14 || objQ25 == gVar2) {
                objQ25 = new o5(d0Var2, 0);
                sVar.o0(objQ25);
            }
            fz.a aVar5 = (fz.a) objQ25;
            boolean z15 = i16 == 256;
            Object objQ26 = sVar.Q();
            if (z15 || objQ26 == gVar2) {
                objQ26 = new o5(d0Var2, 1);
                sVar.o0(objQ26);
            }
            e(x0Var2, courseTestParams, d0Var2, aVar2, cVar2, aVar3, aVar4, aVar5, (fz.a) objQ26, sVar, i13 & 1008);
        } else {
            aVar = onClickSkip;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a0(data, courseTestParams, d0Var, aVar, i11, 1);
        }
    }

    public static final void c(RecordingStatus recordingStatus, l1.n nVar, int i11) {
        int i12;
        float f5;
        int i13;
        kotlin.jvm.internal.m.f(recordingStatus, "recordingStatus");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-602781586);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(recordingStatus) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(null) ? 32 : 16;
        }
        if (!sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.W();
        } else if (recordingStatus instanceof RecordingStatus.RecognizeShowScore) {
            sVar.d0(-207691148);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.d0(-207665914);
                Object objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = new bp.p(19, b1Var);
                    sVar.o0(objQ2);
                }
                d((fz.a) objQ2, sVar, 6);
            } else {
                sVar.d0(-238861772);
            }
            sVar.p(false);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
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
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, a2VarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            w4.c.r(1.0f, true, sVar);
            float speechScore = ((RecordingStatus.RecognizeShowScore) recordingStatus).getSpeechScore();
            if (speechScore < 0.26f) {
                f5 = 0.76f;
                sVar.d0(932466097);
                ub.a.e0(sVar, R.string.speech_score_d);
                sVar.p(false);
            } else {
                f5 = 0.76f;
                if (speechScore < 0.51f) {
                    sVar.d0(932468721);
                    ub.a.e0(sVar, R.string.speech_score_c);
                    sVar.p(false);
                } else if (speechScore < 0.76f) {
                    sVar.d0(932471345);
                    ub.a.e0(sVar, R.string.speech_score_b);
                    sVar.p(false);
                } else {
                    sVar.d0(932473521);
                    ub.a.e0(sVar, R.string.speech_score_a);
                    sVar.p(false);
                }
            }
            if (speechScore < 0.26f) {
                i13 = R.drawable.speech_score_0_25;
            } else if (speechScore < 0.51f) {
                i13 = R.drawable.speech_score_26_50;
            } else {
                i13 = speechScore < f5 ? R.drawable.speech_score_51_75 : R.drawable.speech_score_76_100;
            }
            int i14 = i13;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new bp.p(20, b1Var);
                sVar.o0(objQ3);
            }
            z1.r rVarQ = iu.k.q(24582, 7, (fz.a) objQ3, sVar, oVar, false);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarQ);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            int i15 = (int) (speechScore * 100);
            long jI = i(i15);
            d0.n.c(se.k.y(i14, sVar, 0), null, j0.e2.p(oVar, 78, 67), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = b0.e.a(CropImageView.DEFAULT_ASPECT_RATIO);
                sVar.o0(objQ4);
            }
            b0.d dVar = (b0.d) objQ4;
            boolean zH = sVar.h(dVar) | sVar.d(i15);
            Object objQ5 = sVar.Q();
            if (zH || objQ5 == gVar) {
                objQ5 = new q5(i15, 0, dVar, null);
                sVar.o0(objQ5);
            }
            l1.t.f((fz.e) objQ5, qy.b0.f48488a, sVar);
            ua.b(String.valueOf((int) ((Number) dVar.d()).floatValue()), j0.c.E(j0.r.f35391a.a(oVar, z1.c.f58464b), CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), jI, fr.j3.A(28), n3.s.M, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65532);
            sVar = sVar;
            com.google.android.material.datepicker.d.B(sVar, true, true, false);
        } else {
            sVar.d0(547577490);
            sVar.p(false);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j5(recordingStatus, i11, 0);
        }
    }

    public static final void d(fz.a onDismissRequest, l1.n nVar, int i11) {
        fz.a aVar;
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1415868939);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            aVar = onDismissRequest;
            androidx.compose.ui.window.a.a(aVar, null, t1.e.d(-1661922356, new at.o(3, onDismissRequest), sVar), sVar, 390, 2);
        } else {
            aVar = onDismissRequest;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.o(i11, 4, aVar);
        }
    }

    public static final void e(final jt.x0 x0Var, final ht.o courseTestParams, final ys.d0 d0Var, final fz.a stopPlayAudio, fz.c onChecked, fz.a onClickContinue, final fz.a onClickSkip, final fz.a getAudioTime, fz.a getAudioDuration, l1.n nVar, int i11) {
        l1.s sVar;
        CourseSentence courseSentence;
        l1.b1 b1Var;
        Object[] objArr;
        final l1.b1 b1Var2;
        l1.s sVar2;
        ht.o oVar;
        l1.b1 b1Var3;
        l1.a1 a1Var;
        l1.b1 b1Var4;
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(stopPlayAudio, "stopPlayAudio");
        kotlin.jvm.internal.m.f(onChecked, "onChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(onClickSkip, "onClickSkip");
        kotlin.jvm.internal.m.f(getAudioTime, "getAudioTime");
        kotlin.jvm.internal.m.f(getAudioDuration, "getAudioDuration");
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(-401305849);
        int i12 = (sVar3.h(x0Var) ? 4 : 2) | i11 | (sVar3.f(courseTestParams) ? 32 : 16);
        if ((i11 & 384) == 0) {
            i12 |= sVar3.f(d0Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar3.h(stopPlayAudio) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar3.h(onChecked) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar3.h(onClickContinue) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar3.h(onClickSkip) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar3.h(getAudioTime) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar3.h(getAudioDuration) ? 67108864 : 33554432;
        }
        if (sVar3.T(i12 & 1, (38347923 & i12) != 38347922)) {
            Boolean bool = (Boolean) sVar3.j(ju.f.f37372f);
            boolean zBooleanValue = bool.booleanValue();
            final long j11 = courseTestParams.f33756d;
            boolean z11 = sVar3.j(dt.k3.f23943a) != null;
            Object objQ = sVar3.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar3);
                sVar3.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            final boolean z12 = x0Var.f37260f;
            final l1.b1 b1Var5 = x0Var.f37261g;
            final l1.b1 b1Var6 = x0Var.f37262h;
            final l1.b1 b1Var7 = x0Var.f37263i;
            final l1.b1 b1Var8 = x0Var.f37264j;
            CourseSentence courseSentence2 = x0Var.f37257c;
            boolean zE = sVar3.e(j11);
            boolean z13 = z11;
            Object objQ2 = sVar3.Q();
            if (zE || objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar3.o0(objQ2);
            }
            l1.b1 b1Var9 = (l1.b1) objQ2;
            boolean zE2 = sVar3.e(j11);
            Object objQ3 = sVar3.Q();
            if (zE2 || objQ3 == gVar) {
                objQ3 = defpackage.e.v(-1, sVar3);
            }
            l1.a1 a1Var2 = (l1.a1) objQ3;
            boolean zE3 = sVar3.e(j11);
            Object objQ4 = sVar3.Q();
            if (zE3 || objQ4 == gVar) {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar3.o0(objQ4);
            }
            l1.b1 b1Var10 = (l1.b1) objQ4;
            boolean zE4 = sVar3.e(j11);
            Object objQ5 = sVar3.Q();
            if (zE4 || objQ5 == gVar) {
                objQ5 = l1.t.B(Boolean.FALSE);
                sVar3.o0(objQ5);
            }
            l1.b1 b1Var11 = (l1.b1) objQ5;
            boolean zE5 = sVar3.e(j11);
            Object objQ6 = sVar3.Q();
            if (zE5 || objQ6 == gVar) {
                objQ6 = l1.t.B(0L);
                sVar3.o0(objQ6);
            }
            l1.b1 b1Var12 = (l1.b1) objQ6;
            Long lValueOf = Long.valueOf(j11);
            Object value = b1Var6.getValue();
            boolean zF = sVar3.f(b1Var6) | sVar3.f(b1Var10);
            int i13 = i12;
            Object objQ7 = sVar3.Q();
            vy.d dVar = null;
            if (zF || objQ7 == gVar) {
                objQ7 = new g0(b1Var6, b1Var10, dVar, 1);
                sVar3.o0(objQ7);
            }
            l1.t.g(lValueOf, value, (fz.e) objQ7, sVar3);
            Long lValueOf2 = Long.valueOf(j11);
            Boolean bool2 = (Boolean) b1Var10.getValue();
            bool2.getClass();
            boolean zF2 = sVar3.f(b1Var10) | ((i13 & 29360128) == 8388608) | ((i13 & 234881024) == 67108864) | sVar3.h(courseSentence2) | sVar3.f(a1Var2);
            Object objQ8 = sVar3.Q();
            if (zF2 || objQ8 == gVar) {
                objQ8 = new h0(getAudioTime, getAudioDuration, courseSentence2, b1Var10, a1Var2, null, 1);
                courseSentence = courseSentence2;
                b1Var = b1Var10;
                sVar3.o0(objQ8);
            } else {
                courseSentence = courseSentence2;
                b1Var = b1Var10;
            }
            l1.t.g(lValueOf2, bool2, (fz.e) objQ8, sVar3);
            Long lValueOf3 = Long.valueOf(j11);
            Object value2 = b1Var9.getValue();
            boolean zF3 = sVar3.f(b1Var9) | sVar3.h(x0Var);
            Object objQ9 = sVar3.Q();
            if (zF3 || objQ9 == gVar) {
                objQ9 = new av.f0(12, b1Var9, x0Var, null);
                sVar3.o0(objQ9);
            }
            l1.t.g(lValueOf3, value2, (fz.e) objQ9, sVar3);
            Object[] objArr2 = {Long.valueOf(j11), courseSentence, Boolean.valueOf(courseTestParams.f33762j), bool};
            int i14 = i13 & 112;
            boolean z14 = zBooleanValue;
            int i15 = i13 & 896;
            rz.b0 b0Var2 = b0Var;
            boolean zF4 = sVar3.f(b1Var11) | sVar3.h(courseSentence) | (i14 == 32) | sVar3.g(z14) | sVar3.f(b1Var6) | sVar3.f(b1Var12) | sVar3.h(x0Var) | (i15 == 256) | sVar3.h(b0Var2) | sVar3.f(a1Var2) | sVar3.f(b1Var);
            Object objQ10 = sVar3.Q();
            if (zF4 || objQ10 == gVar) {
                objArr = objArr2;
                b1Var2 = b1Var;
                sVar2 = sVar3;
                CourseSentence courseSentence3 = courseSentence;
                objQ10 = new r5(z14, b1Var6, courseSentence3, courseTestParams, b1Var11, b1Var12, x0Var, d0Var, b0Var2, a1Var2, b1Var2, null);
                oVar = courseTestParams;
                b1Var3 = b1Var12;
                a1Var = a1Var2;
                z14 = z14;
                courseSentence = courseSentence3;
                b1Var4 = b1Var11;
                b0Var2 = b0Var2;
                sVar2.o0(objQ10);
            } else {
                objArr = objArr2;
                a1Var = a1Var2;
                b1Var3 = b1Var12;
                b1Var2 = b1Var;
                b1Var4 = b1Var11;
                sVar2 = sVar3;
                oVar = courseTestParams;
            }
            l1.t.i(objArr, (fz.e) objQ10, sVar2);
            ht.q qVar = (ht.q) b1Var5.getValue();
            String strE0 = ub.a.e0(sVar2, R.string.test_continue);
            ht.a aVar = ht.a.f33722e;
            t1.d dVarD = t1.e.d(-800192759, new b0(oVar, 3), sVar2);
            final l1.b1 b1Var13 = b1Var4;
            final ht.o oVar2 = oVar;
            final boolean z15 = z14;
            l1.s sVar4 = sVar2;
            final l1.a1 a1Var3 = a1Var;
            final l1.b1 b1Var14 = b1Var3;
            final rz.b0 b0Var3 = b0Var2;
            final CourseSentence courseSentence4 = courseSentence;
            t1.d dVarD2 = t1.e.d(538299496, new fz.e() { // from class: bt.e5
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    boolean zBooleanValue2;
                    l1.s sVar5;
                    boolean z16;
                    Object k5Var;
                    CourseSentence courseSentence5;
                    l1.b1 b1Var15;
                    jt.x0 x0Var2;
                    ys.d0 d0Var2;
                    l1.n nVar2 = (l1.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    l1.s sVar6 = (l1.s) nVar2;
                    if (sVar6.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        z1.o oVar3 = z1.o.f58481a;
                        z1.r rVarC = j0.e2.c(j0.e2.e(oVar3, 1.0f), 0.5f);
                        w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                        int iHashCode = Long.hashCode(sVar6.T);
                        l1.q1 q1VarL = sVar6.l();
                        z1.r rVarC2 = z1.a.c(sVar6, rVarC);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar6.h0();
                        if (sVar6.S) {
                            sVar6.k(iVar);
                        } else {
                            sVar6.r0();
                        }
                        y2.h hVar = y2.j.f56917f;
                        l1.t.J(hVar, q0VarD, sVar6);
                        y2.h hVar2 = y2.j.f56916e;
                        l1.t.J(hVar2, q1VarL, sVar6);
                        y2.h hVar3 = y2.j.f56918g;
                        if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar6, iHashCode, hVar3);
                        }
                        y2.h hVar4 = y2.j.f56915d;
                        l1.t.J(hVar4, rVarC2, sVar6);
                        final l1.b1 b1Var16 = b1Var13;
                        if (((Boolean) b1Var16.getValue()).booleanValue()) {
                            sVar6.d0(1188844920);
                            sVar6.p(false);
                            zBooleanValue2 = true;
                        } else {
                            sVar6.d0(-1485669803);
                            zBooleanValue2 = ((Boolean) sVar6.j(ju.f.f37373g)).booleanValue();
                            sVar6.p(false);
                        }
                        l1.b1 b1Var17 = b1Var7;
                        final CourseSentence courseSentence6 = courseSentence4;
                        final l1.b1 b1Var18 = b1Var14;
                        l1.b1 b1Var19 = b1Var2;
                        final jt.x0 x0Var3 = x0Var;
                        final ys.d0 d0Var3 = d0Var;
                        final rz.b0 b0Var4 = b0Var3;
                        final l1.a1 a1Var4 = a1Var3;
                        l1.g gVar2 = l1.m.f39353a;
                        if (zBooleanValue2) {
                            sVar6.d0(1188959104);
                            ht.q qVar2 = (ht.q) b1Var5.getValue();
                            l1.b1 b1Var20 = b1Var6;
                            ht.l lVar = (ht.l) b1Var20.getValue();
                            RecordingStatus recordingStatus = (RecordingStatus) b1Var8.getValue();
                            z1.r rVarE = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                            List list = (List) b1Var17.getValue();
                            String translation = courseSentence6.getTranslation();
                            int iL = ((l1.h1) a1Var4).l();
                            Uri videoUri = ((Boolean) b1Var16.getValue()).booleanValue() ? courseSentence6.getVideoUri() : Uri.EMPTY;
                            kotlin.jvm.internal.m.c(videoUri);
                            long jLongValue = ((Number) b1Var18.getValue()).longValue();
                            Long lValueOf4 = Long.valueOf(j11);
                            boolean zF5 = sVar6.f(b1Var20);
                            fz.a aVar2 = stopPlayAudio;
                            boolean zF6 = zF5 | sVar6.f(aVar2) | sVar6.f(b1Var19);
                            Object objQ11 = sVar6.Q();
                            if (zF6 || objQ11 == gVar2) {
                                objQ11 = new aj.c(b1Var20, aVar2, b1Var19, 15);
                                sVar6.o0(objQ11);
                            }
                            fz.c cVar = (fz.c) objQ11;
                            boolean zF7 = sVar6.f(b1Var16) | sVar6.f(b1Var18) | sVar6.h(x0Var3) | sVar6.h(d0Var3) | sVar6.h(b0Var4) | sVar6.h(courseSentence6) | sVar6.f(a1Var4) | sVar6.f(b1Var19);
                            Object objQ12 = sVar6.Q();
                            if (zF7 || objQ12 == gVar2) {
                                courseSentence5 = courseSentence6;
                                b1Var15 = b1Var18;
                                k5Var = new k5(courseSentence5, b1Var15, x0Var3, d0Var3, b1Var16, b0Var4, a1Var4, b1Var19, 0);
                                x0Var2 = x0Var3;
                                d0Var2 = d0Var3;
                                sVar6.o0(k5Var);
                            } else {
                                b1Var15 = b1Var18;
                                d0Var2 = d0Var3;
                                k5Var = objQ12;
                                courseSentence5 = courseSentence6;
                                x0Var2 = x0Var3;
                            }
                            fz.a aVar3 = (fz.a) k5Var;
                            boolean zF8 = sVar6.f(b1Var16) | sVar6.f(b1Var15) | sVar6.h(x0Var2) | sVar6.h(d0Var2) | sVar6.h(b0Var4) | sVar6.h(courseSentence5) | sVar6.f(a1Var4);
                            Object objQ13 = sVar6.Q();
                            if (zF8 || objQ13 == gVar2) {
                                final int i16 = 0;
                                final ys.d0 d0Var4 = d0Var2;
                                final CourseSentence courseSentence7 = courseSentence5;
                                final l1.b1 b1Var21 = b1Var15;
                                final jt.x0 x0Var4 = x0Var2;
                                fz.c cVar2 = new fz.c() { // from class: bt.l5
                                    @Override // fz.c
                                    public final Object invoke(Object obj3) {
                                        CourseWord it = (CourseWord) obj3;
                                        switch (i16) {
                                            case 0:
                                                kotlin.jvm.internal.m.f(it, "it");
                                                s5.g(b1Var21, x0Var4, d0Var4, b1Var16, b0Var4, courseSentence7, a1Var4, ns.o.K(it.getAudioUri().toString()), new ht.e(it.getVisemedMap()));
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.f(it, "it");
                                                s5.g(b1Var21, x0Var4, d0Var4, b1Var16, b0Var4, courseSentence7, a1Var4, ns.o.K(it.getAudioUri().toString()), new ht.e(it.getVisemedMap()));
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar6.o0(cVar2);
                                objQ13 = cVar2;
                            }
                            dt.e.p(qVar2, lVar, recordingStatus, list, translation, true, rVarE, z15, false, false, false, null, iL, 0, videoUri, jLongValue, lValueOf4, cVar, getAudioTime, aVar3, (fz.c) objQ13, b.f5189n, sVar6, 807075840, 0, 48, 11520);
                            sVar5 = sVar6;
                            sVar5.p(false);
                            z16 = true;
                        } else {
                            sVar6.d0(1191302208);
                            z1.r rVarA = j0.r.f35391a.a(oVar3, z1.c.f58464b);
                            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar6, 48);
                            int iHashCode2 = Long.hashCode(sVar6.T);
                            l1.q1 q1VarL2 = sVar6.l();
                            z1.r rVarC3 = z1.a.c(sVar6, rVarA);
                            sVar6.h0();
                            if (sVar6.S) {
                                sVar6.k(iVar);
                            } else {
                                sVar6.r0();
                            }
                            l1.t.J(hVar, uVarA, sVar6);
                            l1.t.J(hVar2, q1VarL2, sVar6);
                            if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode2))) {
                                defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar3);
                            }
                            l1.t.J(hVar4, rVarC3, sVar6);
                            float f5 = 26;
                            j0.c.g(sVar6, j0.e2.g(oVar3, f5));
                            List list2 = (List) b1Var17.getValue();
                            boolean z17 = !oVar2.f33757e;
                            boolean zBooleanValue3 = ((Boolean) b1Var19.getValue()).booleanValue();
                            int iL2 = ((l1.h1) a1Var4).l();
                            Object objQ14 = sVar6.Q();
                            if (objQ14 == gVar2) {
                                objQ14 = new bq.u(8);
                                sVar6.o0(objQ14);
                            }
                            fz.a aVar4 = (fz.a) objQ14;
                            boolean zF9 = sVar6.f(b1Var16) | sVar6.f(b1Var18) | sVar6.h(x0Var3) | sVar6.h(d0Var3) | sVar6.h(b0Var4) | sVar6.h(courseSentence6) | sVar6.f(a1Var4);
                            Object objQ15 = sVar6.Q();
                            if (zF9 || objQ15 == gVar2) {
                                final int i17 = 1;
                                fz.c cVar3 = new fz.c() { // from class: bt.l5
                                    @Override // fz.c
                                    public final Object invoke(Object obj3) {
                                        CourseWord it = (CourseWord) obj3;
                                        switch (i17) {
                                            case 0:
                                                kotlin.jvm.internal.m.f(it, "it");
                                                s5.g(b1Var18, x0Var3, d0Var3, b1Var16, b0Var4, courseSentence6, a1Var4, ns.o.K(it.getAudioUri().toString()), new ht.e(it.getVisemedMap()));
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.f(it, "it");
                                                s5.g(b1Var18, x0Var3, d0Var3, b1Var16, b0Var4, courseSentence6, a1Var4, ns.o.K(it.getAudioUri().toString()), new ht.e(it.getVisemedMap()));
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar6.o0(cVar3);
                                objQ15 = cVar3;
                            }
                            dt.e.N(list2, false, ry.r.f50854a, zBooleanValue3, iL2, aVar4, (fz.c) objQ15, Integer.MAX_VALUE, z17, sVar6, 12779952);
                            sVar5 = sVar6;
                            j0.c.g(sVar5, j0.e2.g(oVar3, f5));
                            dt.a0.r(courseSentence6.getTranslation(), null, 0, 0, sVar5, 0, 14);
                            z16 = true;
                            sVar5.p(true);
                            sVar5.p(false);
                        }
                        sVar5.p(z16);
                    } else {
                        sVar6.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar4);
            final l1.b1 b1Var15 = b1Var2;
            final l1.a1 a1Var4 = a1Var;
            final l1.b1 b1Var16 = b1Var3;
            t1.d dVarD3 = t1.e.d(1876791751, new fz.e() { // from class: bt.f5
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    l1.g gVar2;
                    Object g1Var;
                    fz.a aVar2;
                    l1.b1 b1Var17;
                    l1.b1 b1Var18;
                    l1.b1 b1Var19;
                    l1.b1 b1Var20;
                    l1.b1 b1Var21;
                    RecordingStatus.ReadyRecord readyRecord;
                    y2.h hVar;
                    y2.h hVar2;
                    y2.i iVar;
                    y2.h hVar3;
                    long j12;
                    jt.x0 x0Var2;
                    rz.b0 b0Var4;
                    fz.a aVar3;
                    l1.b1 b1Var22;
                    l1.b1 b1Var23;
                    z1.j jVar;
                    CourseSentence courseSentence5;
                    ys.d0 d0Var2;
                    l1.a1 a1Var5;
                    z1.o oVar3;
                    boolean z16;
                    boolean z17;
                    l1.n nVar2 = (l1.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    z1.j jVar2 = z1.c.f58463a;
                    l1.s sVar5 = (l1.s) nVar2;
                    if (sVar5.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        z1.h hVar4 = z1.c.P;
                        z1.o oVar4 = z1.o.f58481a;
                        z1.r rVarD = j0.e2.d(oVar4, 1.0f);
                        j0.u uVarA = j0.t.a(j0.i.f35306d, hVar4, sVar5, 54);
                        int iHashCode = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL = sVar5.l();
                        z1.r rVarC = z1.a.c(sVar5, rVarD);
                        y2.k.J.getClass();
                        y2.i iVar2 = y2.j.f56913b;
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar2);
                        } else {
                            sVar5.r0();
                        }
                        y2.h hVar5 = y2.j.f56917f;
                        l1.t.J(hVar5, uVarA, sVar5);
                        y2.h hVar6 = y2.j.f56916e;
                        l1.t.J(hVar6, q1VarL, sVar5);
                        y2.h hVar7 = y2.j.f56918g;
                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar5, iHashCode, hVar7);
                        }
                        y2.h hVar8 = y2.j.f56915d;
                        l1.t.J(hVar8, rVarC, sVar5);
                        final PermissionState permissionStateA = PermissionStateKt.a(sVar5);
                        Object objQ11 = sVar5.Q();
                        l1.g gVar3 = l1.m.f39353a;
                        if (objQ11 == gVar3) {
                            objQ11 = l1.t.B(Boolean.valueOf(PermissionsUtilKt.b(permissionStateA.getStatus())));
                            sVar5.o0(objQ11);
                        }
                        l1.b1 b1Var24 = (l1.b1) objQ11;
                        Object objQ12 = sVar5.Q();
                        if (objQ12 == gVar3) {
                            objQ12 = l1.t.B(Boolean.FALSE);
                            sVar5.o0(objQ12);
                        }
                        l1.b1 b1Var25 = (l1.b1) objQ12;
                        PermissionStatus status = permissionStateA.getStatus();
                        boolean zF5 = sVar5.f(permissionStateA);
                        fz.a aVar4 = stopPlayAudio;
                        boolean zF6 = zF5 | sVar5.f(aVar4);
                        l1.b1 b1Var26 = b1Var13;
                        boolean zF7 = zF6 | sVar5.f(b1Var26);
                        l1.b1 b1Var27 = b1Var16;
                        boolean zF8 = zF7 | sVar5.f(b1Var27);
                        jt.x0 x0Var3 = x0Var;
                        boolean zH = zF8 | sVar5.h(x0Var3);
                        rz.b0 b0Var5 = b0Var3;
                        boolean zH2 = zH | sVar5.h(b0Var5);
                        Object objQ13 = sVar5.Q();
                        if (zH2 || objQ13 == gVar3) {
                            gVar2 = gVar3;
                            aVar2 = aVar4;
                            b1Var17 = b1Var27;
                            b1Var18 = b1Var26;
                            g1Var = new g1(permissionStateA, b1Var24, b1Var25, x0Var3, b0Var5, aVar2, b1Var17, b1Var18, (vy.d) null);
                            b1Var19 = b1Var24;
                            b1Var20 = b1Var25;
                            sVar5.o0(g1Var);
                        } else {
                            g1Var = objQ13;
                            gVar2 = gVar3;
                            aVar2 = aVar4;
                            b1Var17 = b1Var27;
                            b1Var18 = b1Var26;
                            b1Var19 = b1Var24;
                            b1Var20 = b1Var25;
                        }
                        l1.t.f((fz.e) g1Var, status, sVar5);
                        long jA = ef.e.a(190, 52);
                        z1.r rVarE = j0.c.E(j0.v.a(oVar4, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 32, 7);
                        z1.j jVar3 = z1.c.H;
                        final l1.b1 b1Var28 = b1Var19;
                        w2.q0 q0VarD = j0.o.d(jVar3, false);
                        int iHashCode2 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL2 = sVar5.l();
                        z1.r rVarC2 = z1.a.c(sVar5, rVarE);
                        sVar5.h0();
                        final l1.b1 b1Var29 = b1Var20;
                        if (sVar5.S) {
                            sVar5.k(iVar2);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar5, q0VarD, sVar5);
                        l1.t.J(hVar6, q1VarL2, sVar5);
                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar7);
                        }
                        l1.t.J(hVar8, rVarC2, sVar5);
                        l1.b1 b1Var30 = b1Var8;
                        RecordingStatus recordingStatus = (RecordingStatus) b1Var30.getValue();
                        RecordingStatus.ReadyRecord readyRecord2 = RecordingStatus.ReadyRecord.INSTANCE;
                        if (kotlin.jvm.internal.m.a(recordingStatus, readyRecord2) || (recordingStatus instanceof RecordingStatus.RecognizeShowScore)) {
                            b1Var21 = b1Var30;
                            readyRecord = readyRecord2;
                            hVar = hVar8;
                            hVar2 = hVar7;
                            iVar = iVar2;
                            hVar3 = hVar5;
                            j12 = jA;
                            x0Var2 = x0Var3;
                            b0Var4 = b0Var5;
                            aVar3 = aVar2;
                            b1Var22 = b1Var17;
                            b1Var23 = b1Var18;
                            jVar = jVar3;
                            sVar5.d0(516518333);
                            boolean zF9 = sVar5.f(b1Var23) | sVar5.f(b1Var22) | sVar5.h(x0Var2);
                            ys.d0 d0Var3 = d0Var;
                            boolean zH3 = zF9 | sVar5.h(d0Var3) | sVar5.h(b0Var4);
                            CourseSentence courseSentence6 = courseSentence4;
                            boolean zH4 = zH3 | sVar5.h(courseSentence6);
                            l1.a1 a1Var6 = a1Var4;
                            boolean zF10 = zH4 | sVar5.f(a1Var6);
                            l1.b1 b1Var31 = b1Var15;
                            boolean zF11 = zF10 | sVar5.f(b1Var31);
                            Object objQ14 = sVar5.Q();
                            if (zF11 || objQ14 == gVar2) {
                                objQ14 = new k5(courseSentence6, b1Var22, x0Var2, d0Var3, b1Var23, b0Var4, a1Var6, b1Var31, 1);
                                courseSentence5 = courseSentence6;
                                d0Var2 = d0Var3;
                                a1Var5 = a1Var6;
                                sVar5.o0(objQ14);
                            } else {
                                d0Var2 = d0Var3;
                                courseSentence5 = courseSentence6;
                                a1Var5 = a1Var6;
                            }
                            fz.a aVar5 = (fz.a) objQ14;
                            boolean zF12 = sVar5.f(b1Var23) | sVar5.f(b1Var22) | sVar5.h(x0Var2) | sVar5.h(d0Var2) | sVar5.h(b0Var4) | sVar5.h(courseSentence5) | sVar5.f(a1Var5);
                            Object objQ15 = sVar5.Q();
                            if (zF12 || objQ15 == gVar2) {
                                objQ15 = new e1(courseSentence5, b1Var22, x0Var2, d0Var2, b1Var23, b0Var4, a1Var5);
                                sVar5.o0(objQ15);
                            }
                            fz.a aVar6 = (fz.a) objQ15;
                            boolean zH5 = sVar5.h(x0Var2);
                            Object objQ16 = sVar5.Q();
                            if (zH5 || objQ16 == gVar2) {
                                objQ16 = new av.d(x0Var2, 18);
                                sVar5.o0(objQ16);
                            }
                            s5.a(b1Var21, b1Var6, aVar5, aVar6, (fz.a) objQ16, sVar5, 0);
                            sVar5 = sVar5;
                            sVar5.p(false);
                        } else if ((recordingStatus instanceof RecordingStatus.RecognizeSuccess) || (recordingStatus instanceof RecordingStatus.RecognizeError) || kotlin.jvm.internal.m.a(recordingStatus, RecordingStatus.Recognizing.INSTANCE)) {
                            sVar5.d0(517800648);
                            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                            int iHashCode3 = Long.hashCode(sVar5.T);
                            l1.q1 q1VarL3 = sVar5.l();
                            b1Var21 = b1Var30;
                            z1.r rVarC3 = z1.a.c(sVar5, oVar4);
                            sVar5.h0();
                            if (sVar5.S) {
                                sVar5.k(iVar2);
                            } else {
                                sVar5.r0();
                            }
                            l1.t.J(hVar5, a2VarA, sVar5);
                            l1.t.J(hVar6, q1VarL3, sVar5);
                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
                                defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar7);
                            }
                            l1.t.J(hVar8, rVarC3, sVar5);
                            z1.r rVarY = j0.c.y(j0.e2.p(oVar4, 42, 24), -8, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            w2.q0 q0VarD2 = j0.o.d(jVar2, false);
                            int iHashCode4 = Long.hashCode(sVar5.T);
                            l1.q1 q1VarL4 = sVar5.l();
                            z1.r rVarC4 = z1.a.c(sVar5, rVarY);
                            sVar5.h0();
                            if (sVar5.S) {
                                sVar5.k(iVar2);
                            } else {
                                sVar5.r0();
                            }
                            l1.t.J(hVar5, q0VarD2, sVar5);
                            l1.t.J(hVar6, q1VarL4, sVar5);
                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                                defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar7);
                            }
                            l1.t.J(hVar8, rVarC4, sVar5);
                            tv.a.d(0, 1, sVar5, null);
                            sVar5.p(true);
                            iVar = iVar2;
                            hVar3 = hVar5;
                            hVar = hVar8;
                            hVar2 = hVar7;
                            b0Var4 = b0Var5;
                            jVar = jVar3;
                            readyRecord = readyRecord2;
                            j12 = jA;
                            b1Var22 = b1Var17;
                            aVar3 = aVar2;
                            b1Var23 = b1Var18;
                            x0Var2 = x0Var3;
                            ua.b(ub.a.e0(sVar5, R.string.grading_your_recording_now), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar5.j(ua.f31167a), g2.f0.e(4287861394L), 0L, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777210), sVar5, 0, 0, 65534);
                            sVar5 = sVar5;
                            sVar5.p(true);
                            sVar5.p(false);
                        } else {
                            sVar5.d0(-676003833);
                            sVar5.p(false);
                            b1Var21 = b1Var30;
                            readyRecord = readyRecord2;
                            hVar = hVar8;
                            hVar2 = hVar7;
                            iVar = iVar2;
                            hVar3 = hVar5;
                            j12 = jA;
                            x0Var2 = x0Var3;
                            b0Var4 = b0Var5;
                            aVar3 = aVar2;
                            b1Var22 = b1Var17;
                            b1Var23 = b1Var18;
                            jVar = jVar3;
                        }
                        sVar5.p(true);
                        RecordingStatus recordingStatus2 = (RecordingStatus) b1Var21.getValue();
                        boolean zA = kotlin.jvm.internal.m.a(recordingStatus2, readyRecord);
                        final boolean z18 = z12;
                        if (zA) {
                            sVar5.d0(-437581423);
                            z1.r rVarO = j0.e2.o(j12, oVar4);
                            final fz.a aVar7 = aVar3;
                            boolean zG = sVar5.g(z18) | sVar5.f(aVar7) | sVar5.f(b1Var23) | sVar5.f(b1Var22) | sVar5.h(x0Var2) | sVar5.h(b0Var4) | sVar5.f(permissionStateA);
                            Object objQ17 = sVar5.Q();
                            if (zG || objQ17 == gVar2) {
                                final int i16 = 0;
                                final jt.x0 x0Var4 = x0Var2;
                                final l1.b1 b1Var32 = b1Var22;
                                final l1.b1 b1Var33 = b1Var23;
                                final rz.b0 b0Var6 = b0Var4;
                                fz.a aVar8 = new fz.a() { // from class: bt.m5
                                    @Override // fz.a
                                    public final Object invoke() {
                                        switch (i16) {
                                            case 0:
                                                if (z18) {
                                                    boolean zBooleanValue2 = ((Boolean) b1Var28.getValue()).booleanValue();
                                                    l1.b1 b1Var34 = b1Var29;
                                                    if (zBooleanValue2) {
                                                        s5.f(x0Var4, b0Var6, aVar7, b1Var32, b1Var33, b1Var34);
                                                    } else {
                                                        b1Var34.setValue(Boolean.TRUE);
                                                        permissionStateA.a();
                                                    }
                                                }
                                                break;
                                            default:
                                                if (z18) {
                                                    boolean zBooleanValue3 = ((Boolean) b1Var28.getValue()).booleanValue();
                                                    l1.b1 b1Var35 = b1Var29;
                                                    if (zBooleanValue3) {
                                                        s5.f(x0Var4, b0Var6, aVar7, b1Var32, b1Var33, b1Var35);
                                                    } else {
                                                        b1Var35.setValue(Boolean.TRUE);
                                                        permissionStateA.a();
                                                    }
                                                }
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                };
                                sVar5.o0(aVar8);
                                objQ17 = aVar8;
                            }
                            dt.a0.j(6, 2, (fz.a) objQ17, sVar5, rVarO, false);
                            z16 = false;
                            sVar5.p(false);
                            oVar3 = oVar4;
                        } else {
                            final rz.b0 b0Var7 = b0Var4;
                            long j13 = j12;
                            final jt.x0 x0Var5 = x0Var2;
                            final fz.a aVar9 = aVar3;
                            if (recordingStatus2 instanceof RecordingStatus.RecognizeShowScore) {
                                sVar5.d0(-436959439);
                                z1.r rVarO2 = j0.e2.o(j13, oVar4);
                                boolean zG2 = sVar5.g(z18) | sVar5.f(aVar9) | sVar5.f(b1Var23) | sVar5.f(b1Var22) | sVar5.h(x0Var5) | sVar5.h(b0Var7) | sVar5.f(permissionStateA);
                                Object objQ18 = sVar5.Q();
                                if (zG2 || objQ18 == gVar2) {
                                    final int i17 = 1;
                                    final l1.b1 b1Var34 = b1Var22;
                                    final l1.b1 b1Var35 = b1Var23;
                                    fz.a aVar10 = new fz.a() { // from class: bt.m5
                                        @Override // fz.a
                                        public final Object invoke() {
                                            switch (i17) {
                                                case 0:
                                                    if (z18) {
                                                        boolean zBooleanValue2 = ((Boolean) b1Var28.getValue()).booleanValue();
                                                        l1.b1 b1Var36 = b1Var29;
                                                        if (zBooleanValue2) {
                                                            s5.f(x0Var5, b0Var7, aVar9, b1Var34, b1Var35, b1Var36);
                                                        } else {
                                                            b1Var36.setValue(Boolean.TRUE);
                                                            permissionStateA.a();
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    if (z18) {
                                                        boolean zBooleanValue3 = ((Boolean) b1Var28.getValue()).booleanValue();
                                                        l1.b1 b1Var37 = b1Var29;
                                                        if (zBooleanValue3) {
                                                            s5.f(x0Var5, b0Var7, aVar9, b1Var34, b1Var35, b1Var37);
                                                        } else {
                                                            b1Var37.setValue(Boolean.TRUE);
                                                            permissionStateA.a();
                                                        }
                                                    }
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar5.o0(aVar10);
                                    objQ18 = aVar10;
                                }
                                oVar3 = oVar4;
                                dt.a0.j(6, 2, (fz.a) objQ18, sVar5, rVarO2, false);
                                z16 = false;
                                sVar5.p(false);
                            } else if ((recordingStatus2 instanceof RecordingStatus.RecognizeSuccess) || (recordingStatus2 instanceof RecordingStatus.RecognizeError) || (recordingStatus2 instanceof RecordingStatus.Recognizing)) {
                                oVar3 = oVar4;
                                oVar3 = oVar4;
                                oVar3 = oVar4;
                                sVar5.d0(-436244796);
                                z1.r rVarO3 = j0.e2.o(j13, oVar3);
                                Object objQ19 = sVar5.Q();
                                if (objQ19 == gVar2) {
                                    objQ19 = new bq.u(8);
                                    sVar5.o0(objQ19);
                                }
                                dt.a0.j(438, 0, (fz.a) objQ19, sVar5, rVarO3, false);
                                z16 = false;
                                sVar5.p(false);
                            } else {
                                if (!kotlin.jvm.internal.m.a(recordingStatus2, RecordingStatus.Recording.INSTANCE)) {
                                    oVar3 = oVar4;
                                    throw nv.p.x(sVar5, -1261042381, false);
                                }
                                sVar5.d0(-435984613);
                                z1.r rVarO4 = j0.e2.o(j13, oVar3);
                                long jE = g2.f0.e(4294932857L);
                                boolean zG3 = sVar5.g(z18) | sVar5.h(x0Var5);
                                Object objQ20 = sVar5.Q();
                                if (zG3 || objQ20 == gVar2) {
                                    oVar3 = oVar4;
                                    objQ20 = new w(z18, x0Var5, 1);
                                    sVar5.o0(objQ20);
                                }
                                l1.s sVar6 = sVar5;
                                dt.a0.h(rVarO4, jE, (fz.a) objQ20, b.f5190o, sVar6, 3126, 0);
                                sVar5 = sVar6;
                                z16 = false;
                                sVar5.p(false);
                            }
                        }
                        z1.r rVarE2 = j0.c.E(j0.v.a(oVar3, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 28, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                        w2.q0 q0VarD3 = j0.o.d(jVar2, z16);
                        int iHashCode5 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL5 = sVar5.l();
                        z1.r rVarC5 = z1.a.c(sVar5, rVarE2);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar3, q0VarD3, sVar5);
                        l1.t.J(hVar6, q1VarL5, sVar5);
                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode5))) {
                            defpackage.e.A(iHashCode5, sVar5, iHashCode5, hVar2);
                        }
                        l1.t.J(hVar, rVarC5, sVar5);
                        RecordingStatus recordingStatus3 = (RecordingStatus) b1Var21.getValue();
                        if (kotlin.jvm.internal.m.a(recordingStatus3, readyRecord)) {
                            sVar5.d0(-1998905286);
                            if (courseTestParams.f33767p) {
                                sVar5.d0(-1998839783);
                                String strE1 = ub.a.e0(sVar5, R.string.can_t_speak_now);
                                j3.y0 y0VarA = j3.y0.a((j3.y0) sVar5.j(ua.f31167a), ((h1.s1) sVar5.j(h1.v1.f31180a)).f31036s, fr.j3.A(14), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208);
                                z1.r rVarA = j0.r.f35391a.a(oVar3, jVar);
                                fz.a aVar11 = onClickSkip;
                                boolean zF13 = sVar5.f(aVar11);
                                Object objQ21 = sVar5.Q();
                                if (zF13 || objQ21 == gVar2) {
                                    objQ21 = new at.r(22, aVar11);
                                    sVar5.o0(objQ21);
                                }
                                l1.s sVar7 = sVar5;
                                ua.b(strE1, iu.k.q(0, 7, (fz.a) objQ21, sVar5, rVarA, false), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar7, 0, 0, 65532);
                                sVar5 = sVar7;
                                z17 = false;
                            } else {
                                z17 = false;
                                sVar5.d0(-2023345624);
                            }
                            sVar5.p(z17);
                            sVar5.p(z17);
                        } else if (recordingStatus3 instanceof RecordingStatus.RecognizeShowScore) {
                            sVar5.d0(-1997974635);
                            sVar5.p(false);
                        } else if (kotlin.jvm.internal.m.a(recordingStatus3, RecordingStatus.Recording.INSTANCE)) {
                            sVar5.d0(-1997271152);
                            sVar5.p(false);
                        } else {
                            sVar5.d0(-341506050);
                            sVar5.p(false);
                        }
                        sVar5.p(true);
                        sVar5.p(true);
                    } else {
                        sVar5.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar4);
            t1.d dVarD4 = t1.e.d(-1365320868, new g5(0, b1Var8), sVar4);
            t1.d dVar2 = b.f5192q;
            Object objQ11 = sVar4.Q();
            if (objQ11 == gVar) {
                objQ11 = new bq.u(8);
                sVar4.o0(objQ11);
            }
            fz.a aVar2 = (fz.a) objQ11;
            boolean z16 = (i14 == 32) | (i15 == 256);
            Object objQ12 = sVar4.Q();
            if (z16 || objQ12 == gVar) {
                objQ12 = new e0(d0Var, courseTestParams, 9);
                sVar4.o0(objQ12);
            }
            fz.c cVar = (fz.c) objQ12;
            Object objQ13 = sVar4.Q();
            if (objQ13 == gVar) {
                objQ13 = new bq.u(9);
                sVar4.o0(objQ13);
            }
            fz.a aVar3 = (fz.a) objQ13;
            boolean zG = sVar4.g(z13) | sVar4.f(b1Var8) | ((r9 & 57344) == 16384) | sVar4.f(b1Var5) | ((i13 & 458752) == 131072);
            Object objQ14 = sVar4.Q();
            if (zG || objQ14 == gVar) {
                h5 h5Var = new h5(z13, b1Var8, onChecked, b1Var5, onClickContinue);
                sVar4.o0(h5Var);
                objQ14 = h5Var;
            }
            fz.a aVar4 = (fz.a) objQ14;
            Object objQ15 = sVar4.Q();
            if (objQ15 == gVar) {
                objQ15 = new bq.u(8);
                sVar4.o0(objQ15);
            }
            sVar = sVar4;
            dt.k3.e(null, qVar, aVar, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, strE0, dVarD, dVarD2, dVarD3, null, dVarD4, dVar2, null, null, null, null, null, null, null, aVar2, cVar, aVar3, aVar4, null, null, (fz.a) objQ15, sVar, 196608, 907763712, 817889280, 3072, 133308377, 3);
        } else {
            sVar = sVar3;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i5(x0Var, courseTestParams, d0Var, stopPlayAudio, onChecked, onClickContinue, onClickSkip, getAudioTime, getAudioDuration, i11, 0);
        }
    }

    public static final void f(jt.x0 x0Var, rz.b0 b0Var, fz.a aVar, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3) {
        aVar.invoke();
        if (((Boolean) b1Var2.getValue()).booleanValue()) {
            b1Var.setValue(Long.valueOf(((Number) b1Var.getValue()).longValue() + 1));
        }
        b1Var3.setValue(Boolean.FALSE);
        x0Var.g(b0Var, x0Var.f37258d);
    }

    public static final void g(l1.b1 b1Var, jt.x0 x0Var, ys.d0 d0Var, l1.b1 b1Var2, rz.b0 b0Var, CourseSentence courseSentence, l1.a1 a1Var, List list, ht.l lVar) {
        if (((Boolean) b1Var2.getValue()).booleanValue()) {
            b1Var.setValue(Long.valueOf(((Number) b1Var.getValue()).longValue() + 1));
        }
        x0Var.h();
        if (kotlin.jvm.internal.m.a(x0Var.f37264j.getValue(), RecordingStatus.Recording.INSTANCE)) {
            x0Var.i();
        }
        if (d0Var != null) {
            jh.h.m(d0Var, list, lVar, new b0.a(b0Var, x0Var, courseSentence, a1Var, 8));
        }
    }

    public static final void h(final String title, final int i11, final int i12, final long j11, final long j12, final long j13, final int i13, final z1.r rVar, l1.n nVar, final int i14) {
        kotlin.jvm.internal.m.f(title, "title");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1738248071);
        int i15 = i14 | (sVar.f(title) ? 4 : 2) | (sVar.d(i13) ? 1048576 : 524288);
        if (sVar.T(i15 & 1, (i15 & 4793491) != 4793490)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            l1.d0 d0Var = ua.f31167a;
            ua.b(title, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(d0Var), j11, fr.j3.A(14), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, i15 & 14, 0, 65534);
            z1.o oVar = z1.o.f58481a;
            j0.c.g(sVar, j0.e2.g(oVar, 4));
            j0.a2 a2VarA = j0.z1.a(j0.i.g(10), z1.c.M, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            String strValueOf = String.valueOf(i11);
            j3.y0 y0Var = (j3.y0) sVar.j(d0Var);
            long jA = fr.j3.A(12);
            n3.s sVar2 = n3.s.H;
            float f5 = 24;
            ua.b(strValueOf, j0.e2.s(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, j12, jA, sVar2, null, null, 0L, null, null, 6, 0, 0L, null, 16744440), sVar, 48, 0, 65532);
            d0.n.c(se.k.y(i13, sVar, (i15 >> 18) & 14), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
            ua.b(String.valueOf(i12), j0.e2.s(oVar, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(d0Var), j13, fr.j3.A(12), sVar2, null, null, 0L, null, null, 5, 0, 0L, null, 16744440), sVar, 48, 0, 65532);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(title, i11, i12, j11, j12, j13, i13, rVar, i14) { // from class: bt.p5
                public final /* synthetic */ z1.r H;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f5837a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f5838b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f5839c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f5840d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f5841e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f5842f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ int f5843t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(12807601);
                    s5.h(this.f5837a, this.f5838b, this.f5839c, this.f5840d, this.f5841e, this.f5842f, this.f5843t, this.H, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final long i(double d5) {
        if (d5 < 5.0d) {
            return f5992t;
        }
        if (d5 < 11.0d) {
            return f5991s;
        }
        if (d5 < 16.0d) {
            return f5990r;
        }
        if (d5 < 21.0d) {
            return f5989q;
        }
        if (d5 < 26.0d) {
            return f5988p;
        }
        if (d5 < 31.0d) {
            return f5987o;
        }
        if (d5 < 36.0d) {
            return f5986n;
        }
        if (d5 < 41.0d) {
            return m;
        }
        if (d5 < 46.0d) {
            return f5985l;
        }
        if (d5 < 51.0d) {
            return f5984k;
        }
        if (d5 < 56.0d) {
            return f5983j;
        }
        if (d5 < 61.0d) {
            return f5982i;
        }
        if (d5 < 66.0d) {
            return f5981h;
        }
        if (d5 < 71.0d) {
            return f5980g;
        }
        if (d5 < 76.0d) {
            return f5979f;
        }
        if (d5 < 81.0d) {
            return f5978e;
        }
        if (d5 < 86.0d) {
            return f5977d;
        }
        if (d5 < 91.0d) {
            return f5976c;
        }
        return d5 < 96.0d ? f5975b : f5974a;
    }
}
