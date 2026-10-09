package xu;

import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.DayStreakFinishedStatus;
import com.lingodeer.data.model.uistate.CompleteOneLessonUiState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import j0.e2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final void a(CompleteOneLessonUiState completeOneLessonUiState, fz.a onDismiss, l1.n nVar, int i11) {
        DayStreakFinishedStatus dayStreakFinishedStatus;
        List<AchievementLevel> list;
        kotlin.jvm.internal.m.f(completeOneLessonUiState, "completeOneLessonUiState");
        kotlin.jvm.internal.m.f(onDismiss, "onDismiss");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(55593344);
        int i12 = (sVar.h(completeOneLessonUiState) ? 4 : 2) | i11 | (sVar.h(onDismiss) ? 32 : 16);
        if (!sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.W();
        } else if (completeOneLessonUiState.equals(CompleteOneLessonUiState.Idle.INSTANCE)) {
            sVar.d0(-1675864425);
            sVar.p(false);
        } else {
            if (!(completeOneLessonUiState instanceof CompleteOneLessonUiState.Success)) {
                throw nv.p.x(sVar, 1885603981, false);
            }
            sVar.d0(-1675689182);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new x1.p();
                sVar.o0(objQ);
            }
            x1.p pVar = (x1.p) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var = (l1.b1) objQ2;
            CompleteOneLessonUiState.Success success = (CompleteOneLessonUiState.Success) completeOneLessonUiState;
            DayStreakFinishedStatus dayStreakFinishedStatus2 = success.getDayStreakFinishedStatus();
            List<AchievementLevel> unLockAchievements = success.getUnLockAchievements();
            boolean zH = sVar.h(dayStreakFinishedStatus2) | sVar.h(unLockAchievements);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == gVar) {
                objQ3 = new ad.x(dayStreakFinishedStatus2, unLockAchievements, pVar, b1Var, null, 28);
                dayStreakFinishedStatus = dayStreakFinishedStatus2;
                list = unLockAchievements;
                sVar.o0(objQ3);
            } else {
                list = unLockAchievements;
                dayStreakFinishedStatus = dayStreakFinishedStatus2;
            }
            l1.t.g(dayStreakFinishedStatus, list, (fz.e) objQ3, sVar);
            if (pVar.isEmpty()) {
                sVar.d0(-1672305811);
                sVar.p(false);
                if (((Boolean) b1Var.getValue()).booleanValue()) {
                    onDismiss.invoke();
                    b1Var.setValue(Boolean.FALSE);
                }
            } else {
                sVar.d0(-1674435449);
                j jVar = (j) ry.m.q0(pVar);
                Object objQ4 = sVar.Q();
                if (objQ4 == gVar) {
                    objQ4 = new tp.f0(pVar, (vy.d) null, 11);
                    sVar.o0(objQ4);
                }
                l1.t.f((fz.e) objQ4, jVar, sVar);
                z1.r rVarD = e2.d(z1.o.f58481a, 1.0f);
                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                int iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, rVarD);
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
                a0.o.b(jVar, null, null, null, BuildConfig.VERSION_NAME, null, t1.e.d(1128338083, new bt.t(pVar, 7), sVar), sVar, 1597440, 46);
                sVar.p(true);
                sVar.p(false);
            }
            sVar.p(false);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new pr.y(completeOneLessonUiState, i11, 23, onDismiss);
        }
    }
}
