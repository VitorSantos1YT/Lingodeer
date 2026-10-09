package et;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.RecordingStatus;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import g2.f0;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.z1;
import j3.y0;
import l1.q1;
import l1.x1;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q {
    public static final void a(boolean z11, boolean z12, RecordingStatus recordingStatus, fz.a startRecording, fz.a stopRecording, fz.a showNextSentence, fz.a replay, fz.a redo, fz.a finish, l1.n nVar, int i11) {
        fz.a aVar;
        l1.s sVar;
        boolean z13;
        boolean z14;
        float f5;
        float f11;
        String strM;
        boolean z15;
        boolean z16;
        z1.j jVar = z1.c.f58464b;
        z1.j jVar2 = z1.c.f58463a;
        z1.h hVar = z1.c.P;
        kotlin.jvm.internal.m.f(recordingStatus, "recordingStatus");
        kotlin.jvm.internal.m.f(startRecording, "startRecording");
        kotlin.jvm.internal.m.f(stopRecording, "stopRecording");
        kotlin.jvm.internal.m.f(showNextSentence, "showNextSentence");
        kotlin.jvm.internal.m.f(replay, "replay");
        kotlin.jvm.internal.m.f(redo, "redo");
        kotlin.jvm.internal.m.f(finish, "finish");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(807195936);
        int i12 = i11 | (sVar2.g(z11) ? 4 : 2) | (sVar2.g(z12) ? 32 : 16) | (sVar2.h(recordingStatus) ? 256 : 128) | (sVar2.h(startRecording) ? 2048 : 1024) | (sVar2.h(stopRecording) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(showNextSentence) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(replay) ? 1048576 : 524288) | (sVar2.h(redo) ? 8388608 : 4194304) | (sVar2.h(finish) ? 67108864 : 33554432);
        if (sVar2.T(i12 & 1, (i12 & 38347923) != 38347922)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarG = e2.g(e2.e(j0.c.v(oVar), 1.0f), 160);
            z1.j jVar3 = z1.c.f58467e;
            q0 q0VarD = j0.o.d(jVar3, false);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarG);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, q0VarD, sVar2);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar2);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar2);
            if (z11) {
                sVar2.d0(-1162642916);
                a.c(replay, redo, finish, sVar2, (i12 >> 18) & 1022);
                sVar2.p(false);
                aVar = showNextSentence;
                sVar = sVar2;
                z13 = true;
            } else {
                sVar2.d0(-1162360630);
                if (z12) {
                    sVar2.d0(-1162320578);
                    if ((recordingStatus instanceof RecordingStatus.RecognizeSuccess) || (recordingStatus instanceof RecordingStatus.RecognizeError) || recordingStatus.equals(RecordingStatus.Recognizing.INSTANCE)) {
                        aVar = showNextSentence;
                        sVar2.d0(-1162279317);
                        z1.r rVarC2 = e2.c(oVar, 1.0f);
                        j0.u uVarA = j0.t.a(j0.i.f35305c, hVar, sVar2, 48);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        q1 q1VarL2 = sVar2.l();
                        z1.r rVarC3 = z1.a.c(sVar2, rVarC2);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar2, uVarA, sVar2);
                        l1.t.J(hVar3, q1VarL2, sVar2);
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
                        }
                        l1.t.J(hVar5, rVarC3, sVar2);
                        j0.c.g(sVar2, j0.v.a(oVar, 1.0f));
                        dt.a0.l(e2.n(oVar, 60), sVar2, 6);
                        z1.r rVarE = j0.c.E(j0.v.a(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                        q0 q0VarD2 = j0.o.d(jVar, false);
                        int iHashCode3 = Long.hashCode(sVar2.T);
                        q1 q1VarL3 = sVar2.l();
                        z1.r rVarC4 = z1.a.c(sVar2, rVarE);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar2, q0VarD2, sVar2);
                        l1.t.J(hVar3, q1VarL3, sVar2);
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar4);
                        }
                        l1.t.J(hVar5, rVarC4, sVar2);
                        ua.b(ub.a.e0(sVar2, R.string.grading_your_recording_now), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), ((s1) sVar2.j(v1.f31180a)).f31036s, j3.A(14), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar2, 0, 0, 65534);
                        sVar = sVar2;
                        z13 = true;
                        z14 = false;
                        com.google.android.material.datepicker.d.B(sVar, true, true, false);
                    } else {
                        boolean zEquals = recordingStatus.equals(RecordingStatus.Recording.INSTANCE);
                        l1.g gVar = l1.m.f39353a;
                        if (zEquals) {
                            sVar2.d0(-1160988849);
                            z1.r rVarC5 = e2.c(oVar, 1.0f);
                            j0.u uVarA2 = j0.t.a(j0.i.f35305c, hVar, sVar2, 48);
                            int iHashCode4 = Long.hashCode(sVar2.T);
                            q1 q1VarL4 = sVar2.l();
                            z1.r rVarC6 = z1.a.c(sVar2, rVarC5);
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar);
                            } else {
                                sVar2.r0();
                            }
                            l1.t.J(hVar2, uVarA2, sVar2);
                            l1.t.J(hVar3, q1VarL4, sVar2);
                            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                                defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar4);
                            }
                            l1.t.J(hVar5, rVarC6, sVar2);
                            z1.r rVarA = j0.v.a(oVar, 1.0f);
                            q0 q0VarD3 = j0.o.d(jVar2, false);
                            int iHashCode5 = Long.hashCode(sVar2.T);
                            q1 q1VarL5 = sVar2.l();
                            z1.r rVarC7 = z1.a.c(sVar2, rVarA);
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar);
                            } else {
                                sVar2.r0();
                            }
                            l1.t.J(hVar2, q0VarD3, sVar2);
                            l1.t.J(hVar3, q1VarL5, sVar2);
                            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode5))) {
                                defpackage.e.A(iHashCode5, sVar2, iHashCode5, hVar4);
                            }
                            l1.t.J(hVar5, rVarC7, sVar2);
                            dt.a0.m(null, 0L, false, sVar2, 0, 7);
                            sVar2.p(true);
                            z1.r rVarN = e2.n(oVar, 60);
                            boolean z17 = (i12 & 57344) == 16384;
                            Object objQ = sVar2.Q();
                            if (z17 || objQ == gVar) {
                                objQ = new p(0, stopRecording);
                                sVar2.o0(objQ);
                            }
                            dt.a0.n(6, (fz.a) objQ, sVar2, rVarN);
                            z1.r rVarE2 = j0.c.E(j0.v.a(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                            q0 q0VarD4 = j0.o.d(jVar, false);
                            int iHashCode6 = Long.hashCode(sVar2.T);
                            q1 q1VarL6 = sVar2.l();
                            z1.r rVarC8 = z1.a.c(sVar2, rVarE2);
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar);
                            } else {
                                sVar2.r0();
                            }
                            l1.t.J(hVar2, q0VarD4, sVar2);
                            l1.t.J(hVar3, q1VarL6, sVar2);
                            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode6))) {
                                defpackage.e.A(iHashCode6, sVar2, iHashCode6, hVar4);
                            }
                            l1.t.J(hVar5, rVarC8, sVar2);
                            ua.b(ub.a.e0(sVar2, R.string.stop_recording), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), ((s1) sVar2.j(v1.f31180a)).f31036s, j3.A(14), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar2, 0, 0, 65534);
                            sVar = sVar2;
                            com.google.android.material.datepicker.d.B(sVar, true, true, false);
                            z14 = false;
                            z13 = true;
                            aVar = showNextSentence;
                        } else {
                            sVar2.d0(-1159502957);
                            a2 a2VarA = z1.a(j0.i.f35307e, z1.c.M, sVar2, 54);
                            int iHashCode7 = Long.hashCode(sVar2.T);
                            q1 q1VarL7 = sVar2.l();
                            z1.r rVarC9 = z1.a.c(sVar2, oVar);
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar);
                            } else {
                                sVar2.r0();
                            }
                            l1.t.J(hVar2, a2VarA, sVar2);
                            l1.t.J(hVar3, q1VarL7, sVar2);
                            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode7))) {
                                defpackage.e.A(iHashCode7, sVar2, iHashCode7, hVar4);
                            }
                            l1.t.J(hVar5, rVarC9, sVar2);
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f5 = Float.MAX_VALUE;
                                f11 = Float.MAX_VALUE;
                            } else {
                                f5 = 1.0f;
                                f11 = Float.MAX_VALUE;
                            }
                            j0.c.g(sVar2, new i1(f5, true));
                            z1.r rVarC10 = e2.c(oVar, 1.0f);
                            j0.u uVarA3 = j0.t.a(j0.i.f35305c, hVar, sVar2, 48);
                            int iHashCode8 = Long.hashCode(sVar2.T);
                            q1 q1VarL8 = sVar2.l();
                            z1.r rVarC11 = z1.a.c(sVar2, rVarC10);
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar);
                            } else {
                                sVar2.r0();
                            }
                            l1.t.J(hVar2, uVarA3, sVar2);
                            l1.t.J(hVar3, q1VarL8, sVar2);
                            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode8))) {
                                defpackage.e.A(iHashCode8, sVar2, iHashCode8, hVar4);
                            }
                            l1.t.J(hVar5, rVarC11, sVar2);
                            j0.o.a(j0.v.a(oVar, 1.0f), sVar2, 0);
                            z1.r rVarN2 = e2.n(oVar, 60);
                            boolean z18 = (i12 & 7168) == 2048;
                            Object objQ2 = sVar2.Q();
                            if (z18 || objQ2 == gVar) {
                                objQ2 = new p(1, startRecording);
                                sVar2.o0(objQ2);
                            }
                            dt.a0.j(6, 2, (fz.a) objQ2, sVar2, rVarN2, false);
                            z1.r rVarE3 = j0.c.E(j0.v.a(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                            q0 q0VarD5 = j0.o.d(jVar2, false);
                            int iHashCode9 = Long.hashCode(sVar2.T);
                            q1 q1VarL9 = sVar2.l();
                            z1.r rVarC12 = z1.a.c(sVar2, rVarE3);
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar);
                            } else {
                                sVar2.r0();
                            }
                            l1.t.J(hVar2, q0VarD5, sVar2);
                            l1.t.J(hVar3, q1VarL9, sVar2);
                            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode9))) {
                                defpackage.e.A(iHashCode9, sVar2, iHashCode9, hVar4);
                            }
                            l1.t.J(hVar5, rVarC12, sVar2);
                            boolean z19 = recordingStatus instanceof RecordingStatus.RecognizeShowScore;
                            if (z19) {
                                sVar2.d0(2141663107);
                                if (((RecordingStatus.RecognizeShowScore) recordingStatus).getSpeechScore() < 0.6f) {
                                    z16 = false;
                                    strM = ep.a.m(sVar2, 2141741227, R.string.retry, sVar2, false);
                                } else {
                                    z16 = false;
                                    sVar2.d0(2141892445);
                                    sVar2.p(false);
                                    strM = BuildConfig.VERSION_NAME;
                                }
                                sVar2.p(z16);
                            } else {
                                strM = ep.a.m(sVar2, 2142038331, R.string.startrecording, sVar2, false);
                            }
                            ua.b(strM, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), ((s1) sVar2.j(v1.f31180a)).f31036s, j3.A(14), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar2, 0, 0, 65534);
                            sVar = sVar2;
                            sVar.p(true);
                            sVar.p(true);
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            i1 i1Var = new i1(1.0f > f11 ? f11 : 1.0f, true);
                            q0 q0VarD6 = j0.o.d(jVar3, false);
                            int iHashCode10 = Long.hashCode(sVar.T);
                            q1 q1VarL10 = sVar.l();
                            z1.r rVarC13 = z1.a.c(sVar, i1Var);
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(hVar2, q0VarD6, sVar);
                            l1.t.J(hVar3, q1VarL10, sVar);
                            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode10))) {
                                defpackage.e.A(iHashCode10, sVar, iHashCode10, hVar4);
                            }
                            l1.t.J(hVar5, rVarC13, sVar);
                            if (z19) {
                                sVar.d0(-961614152);
                                float f12 = 12;
                                z1.r rVarB = d2.h.b(d0.n.h(e2.n(oVar, 46), f0.c(2059587042), r0.f.d(f12)), r0.f.d(f12));
                                boolean z20 = (458752 & i12) == 131072;
                                Object objQ3 = sVar.Q();
                                if (z20 || objQ3 == gVar) {
                                    aVar = showNextSentence;
                                    objQ3 = new p(2, aVar);
                                    sVar.o0(objQ3);
                                } else {
                                    aVar = showNextSentence;
                                }
                                z1.r rVarO = d0.n.o(rVarB, false, null, (fz.a) objQ3, 15);
                                q0 q0VarD7 = j0.o.d(jVar3, false);
                                int iHashCode11 = Long.hashCode(sVar.T);
                                q1 q1VarL11 = sVar.l();
                                z1.r rVarC14 = z1.a.c(sVar, rVarO);
                                sVar.h0();
                                if (sVar.S) {
                                    sVar.k(iVar);
                                } else {
                                    sVar.r0();
                                }
                                l1.t.J(hVar2, q0VarD7, sVar);
                                l1.t.J(hVar3, q1VarL11, sVar);
                                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode11))) {
                                    defpackage.e.A(iHashCode11, sVar, iHashCode11, hVar4);
                                }
                                l1.t.J(hVar5, rVarC14, sVar);
                                z15 = false;
                                d0.n.c(se.k.y(R.drawable.ic_dialogue_speaking_right_arrow, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
                                sVar = sVar;
                                z13 = true;
                                sVar.p(true);
                            } else {
                                aVar = showNextSentence;
                                z15 = false;
                                z13 = true;
                                sVar.d0(-969264270);
                            }
                            sVar.p(z15);
                            com.google.android.material.datepicker.d.B(sVar, z13, z13, z15);
                            z14 = z15;
                        }
                    }
                } else {
                    aVar = showNextSentence;
                    sVar = sVar2;
                    z13 = true;
                    z14 = false;
                    sVar.d0(-1164928856);
                }
                sVar.p(z14);
                sVar.p(z14);
            }
            sVar.p(z13);
        } else {
            aVar = showNextSentence;
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new jr.d0(z11, z12, recordingStatus, startRecording, stopRecording, aVar, replay, redo, finish, i11);
        }
    }
}
