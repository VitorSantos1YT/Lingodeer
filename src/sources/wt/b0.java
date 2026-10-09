package wt;

import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.ReviewVisibilityMode;
import com.lingodeer.data.model.SRSStatus;
import com.yalantis.ucrop.view.CropImageView;
import fr.r3;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import uz.x0;
import vt.w0;
import vt.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f55236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.n0 f55237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.e f55238c;

    public b0(w0 w0Var, vt.n0 n0Var, vt.e eVar) {
        this.f55236a = w0Var;
        this.f55237b = n0Var;
        this.f55238c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(b0 b0Var, int i11, xy.c cVar) {
        v vVar;
        b0Var.getClass();
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i12 = vVar.f55352d;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                vVar.f55352d = i12 - Integer.MIN_VALUE;
            } else {
                vVar = new v(b0Var, cVar);
            }
        } else {
            vVar = new v(b0Var, cVar);
        }
        Object objU = vVar.f55350b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = vVar.f55352d;
        if (i13 == 0) {
            com.bumptech.glide.e.F(objU);
            bh.r rVarB = ((fr.r) b0Var.f55238c).b(xt.d.k(i11), "course_w");
            vVar.f55349a = i11;
            vVar.f55352d = 1;
            objU = x0.u(rVarB, vVar);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = vVar.f55349a;
            com.bumptech.glide.e.F(objU);
        }
        return nz.n.a0(nz.n.W(nz.n.X(nz.n.R(ry.m.g0((Iterable) objU), new vr.a(13)), new vr.a(14)), new r3(i11, 8)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(b0 b0Var, m mVar, List list, int i11, xy.c cVar) {
        w wVar;
        b0Var.getClass();
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i12 = wVar.f55356d;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                wVar.f55356d = i12 - Integer.MIN_VALUE;
            } else {
                wVar = new w(b0Var, cVar);
            }
        } else {
            wVar = new w(b0Var, cVar);
        }
        Object objU = wVar.f55354b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = wVar.f55356d;
        if (i13 == 0) {
            com.bumptech.glide.e.F(objU);
            if (list.isEmpty()) {
                return ry.t.f50856a;
            }
            gp.r rVarE = mVar.e(list);
            wVar.f55353a = i11;
            wVar.f55356d = 1;
            objU = x0.u(rVarE, wVar);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = wVar.f55353a;
            com.bumptech.glide.e.F(objU);
        }
        ArrayList arrayList = new ArrayList();
        for (CourseLesson courseLesson : (Iterable) objU) {
            sy.c cVarO = ns.o.o();
            Iterator it = ry.m.j0(ks.b.n(courseLesson.getWordList())).iterator();
            while (it.hasNext()) {
                cVarO.add(xt.d.q(((Number) it.next()).longValue(), 0, i11));
            }
            Iterator it2 = ry.m.j0(ks.b.n(courseLesson.getSentenceList())).iterator();
            while (it2.hasNext()) {
                cVarO.add(xt.d.q(((Number) it2.next()).longValue(), 1, i11));
            }
            Iterator it3 = ry.m.j0(ks.b.n(courseLesson.getCharacterList())).iterator();
            while (it3.hasNext()) {
                cVarO.add(xt.d.q(((Number) it3.next()).longValue(), 2, i11));
            }
            ry.m.d0(arrayList, ns.o.e(cVarO));
        }
        return ry.m.f1(arrayList);
    }

    public static float c(float f5, c0 c0Var) {
        int i11 = u.f55348b[c0Var.ordinal()];
        if (i11 == 2) {
            f5 -= 0.15f;
        } else if (i11 == 4) {
            f5 += 0.15f;
        }
        if (f5 < 1.3f) {
            return 1.3f;
        }
        return f5;
    }

    public static LinkedHashMap e(SRSStatus sRSStatus) {
        qy.l lVar;
        qy.l lVar2;
        SRSStatus item = sRSStatus;
        kotlin.jvm.internal.m.f(item, "item");
        Instant instantNow = Instant.now();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        item.toString();
        ry.e eVar = (ry.e) c0.b();
        eVar.getClass();
        e00.i iVar = new e00.i(eVar, 6);
        while (iVar.hasNext()) {
            c0 c0Var = (c0) iVar.next();
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            e00.i iVar2 = iVar;
            Instant instant = instantNow;
            SRSStatus sRSStatusCopy$default = SRSStatus.copy$default(item, null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, 0L, false, null, 2097151, null);
            h(sRSStatusCopy$default, c0Var);
            c0Var.toString();
            sRSStatusCopy$default.toString();
            long j11 = 60;
            long nextReviewTime = (sRSStatusCopy$default.getNextReviewTime() - instant.getEpochSecond()) / j11;
            long j12 = nextReviewTime / j11;
            long j13 = j12 / ((long) 24);
            if (nextReviewTime < 1) {
                lVar2 = new qy.l(1, t.MIN);
            } else {
                if (nextReviewTime < 60) {
                    lVar = new qy.l(Integer.valueOf((int) nextReviewTime), t.MIN);
                } else if (j12 < 24) {
                    lVar2 = new qy.l(Integer.valueOf((int) j12), t.HOUR);
                } else if (j13 < 30) {
                    lVar2 = new qy.l(Integer.valueOf((int) j13), t.DAY);
                } else {
                    lVar = new qy.l(Integer.valueOf((int) (j13 / 30.4375d)), t.MONTH);
                }
                lVar2 = lVar;
            }
            linkedHashMap2.put(c0Var, lVar2);
            item = sRSStatus;
            linkedHashMap = linkedHashMap2;
            iVar = iVar2;
            instantNow = instant;
        }
        return linkedHashMap;
    }

    public static void f(SRSStatus sRSStatus, Instant instant, c0 c0Var) {
        sRSStatus.setStatus(s.REVIEW);
        sRSStatus.setLearningStep(0);
        sRSStatus.setEaseFactor(c(sRSStatus.getEaseFactor(), c0Var));
        i(sRSStatus, instant, c0Var == c0.EASY ? 4L : 1L);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0104 A[PHI: r8
      0x0104: PHI (r8v11 long) = (r8v9 long), (r8v7 long) binds: [B:45:0x0114, B:40:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    public static void h(SRSStatus item, c0 rating) {
        long j11;
        kotlin.jvm.internal.m.f(item, "item");
        kotlin.jvm.internal.m.f(rating, "rating");
        Instant instantNow = Instant.now();
        if (item.getStatus() != s.NEW) {
            long epochSecond = instantNow.getEpochSecond();
            item.setLastReviewTime(epochSecond);
            item.setLastModifierTime(epochSecond);
            item.setEaseFactor(2.5f);
        }
        kotlin.jvm.internal.m.c(instantNow);
        int i11 = u.f55347a[item.getStatus().ordinal()];
        if (i11 == 1 || i11 == 2) {
            j11 = 1;
            item.setStatus(s.LEARNING);
            c0 c0Var = c0.EASY;
            if (rating == c0Var) {
                f(item, instantNow, c0Var);
            } else {
                int learningStep = item.getLearningStep();
                List list = d0.f55245a;
                if (learningStep >= list.size() - 1) {
                    int i12 = u.f55348b[rating.ordinal()];
                    if (i12 == 1) {
                        item.setLearningStep(0);
                        j(item, instantNow, list);
                    } else if (i12 == 2) {
                        j(item, instantNow, list);
                    } else if (i12 == 3) {
                        f(item, instantNow, c0.GOOD);
                    }
                } else {
                    int i13 = u.f55348b[rating.ordinal()];
                    if (i13 == 1) {
                        item.setLearningStep(0);
                    } else if (i13 == 2) {
                        item.setLearningStep(1);
                    } else if (i13 == 3) {
                        item.setLearningStep(list.size() - 1);
                    }
                    j(item, instantNow, list);
                }
            }
        } else {
            if (i11 == 3) {
                if (rating == c0.AGAIN) {
                    item.setStatus(s.LAPSED);
                    item.setLapses(item.getLapses() + 1);
                    float easeFactor = item.getEaseFactor() - 0.2f;
                    item.setEaseFactor(easeFactor >= 1.3f ? easeFactor : 1.3f);
                    item.setLearningStep(0);
                    j(item, instantNow, d0.f55246b);
                    item.getLapses();
                } else {
                    item.setEaseFactor(c(item.getEaseFactor(), rating));
                    long interval = item.getInterval();
                    float f5 = interval;
                    float easeFactor2 = item.getEaseFactor() * f5;
                    j11 = 1;
                    long jR = hz.b.R(easeFactor2);
                    long j12 = interval + 1;
                    if (jR < j12) {
                        jR = j12;
                    }
                    long j13 = jR;
                    long jR2 = hz.b.R(easeFactor2 * 1.3f);
                    long j14 = j13 + 1;
                    if (jR2 < j14) {
                        jR2 = j14;
                    }
                    int i14 = u.f55348b[rating.ordinal()];
                    if (i14 == 2) {
                        jR2 = hz.b.R(f5 * 1.2f);
                        if (jR2 >= interval) {
                            interval = jR2;
                        }
                    } else if (i14 == 3) {
                        interval = j13;
                    } else if (i14 == 4) {
                        interval = jR2;
                    }
                    if (interval > 3650) {
                        interval = 3650;
                    }
                    i(item, instantNow, interval);
                }
            } else {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int i15 = u.f55348b[rating.ordinal()];
                if (i15 == 1) {
                    item.setLearningStep(0);
                    j(item, instantNow, d0.f55245a);
                } else if (i15 == 2) {
                    item.setLearningStep(0);
                    j(item, instantNow, d0.f55246b);
                } else if (i15 == 3) {
                    item.setStatus(s.REVIEW);
                    item.setLearningStep(0);
                    i(item, instantNow, 1L);
                } else {
                    if (i15 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    item.setStatus(s.REVIEW);
                    item.setLearningStep(0);
                    i(item, instantNow, 4L);
                }
            }
            j11 = 1;
        }
        item.setStatus(s.LEARNING);
        int i16 = u.f55348b[rating.ordinal()];
        if (i16 == 1) {
            if (item.getSoEasyCount() > 0) {
                item.setStatus(s.LAPSED);
            }
            if (item.getSoEasyCount() < 3) {
                item.setSoEasyCount(Math.max(0, item.getSoEasyCount() - 1));
                item.setNextReviewTime(instantNow.plusSeconds(Duration.ofMinutes(j11).getSeconds()).getEpochSecond());
                return;
            } else {
                item.setLastHighSoEasyCount(item.getSoEasyCount());
                item.setSoEasyCount(2);
                item.setNextReviewTime(instantNow.plusSeconds(Duration.ofMinutes(10L).getSeconds()).getEpochSecond());
                return;
            }
        }
        if (i16 == 2) {
            if (item.getSoEasyCount() > 0) {
                item.setStatus(s.LAPSED);
            }
            if (item.getSoEasyCount() < 3) {
                item.setSoEasyCount(Math.max(0, item.getSoEasyCount() - 1));
                item.setNextReviewTime(instantNow.plusSeconds(Duration.ofMinutes(10L).getSeconds()).getEpochSecond());
                return;
            } else {
                item.setStatus(s.REVIEW);
                item.setLastHighSoEasyCount(item.getSoEasyCount());
                item.setSoEasyCount(3);
                item.setNextReviewTime(instantNow.plusSeconds(Duration.ofDays(j11).getSeconds()).getEpochSecond());
                return;
            }
        }
        if (i16 != 3) {
            if (i16 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            item.setStatus(s.REVIEW);
            double dF = jz.e.f37397a.f(1.5d);
            if (item.getSoEasyCount() == 0) {
                item.setSoEasyCount(3);
                item.setNextReviewTime(instantNow.plusSeconds((long) (Duration.ofDays(5L).getSeconds() * dF)).getEpochSecond());
                return;
            } else {
                item.setSoEasyCount(item.getSoEasyCount() + 2);
                item.setNextReviewTime(Math.min(instantNow.plusSeconds((long) (Duration.ofDays(5L).getSeconds() * ((long) (1 << (item.getSoEasyCount() - 2))) * dF)).getEpochSecond(), instantNow.plusSeconds(Duration.ofDays(365L).getSeconds()).getEpochSecond()));
                return;
            }
        }
        item.setStatus(s.REVIEW);
        double dF2 = jz.e.f37397a.f(1.2d);
        if (item.getSoEasyCount() < 2) {
            item.setSoEasyCount(item.getSoEasyCount() + 1);
            item.setNextReviewTime(instantNow.plusSeconds((long) (Duration.ofDays(2L).getSeconds() * ((long) item.getSoEasyCount()) * dF2)).getEpochSecond());
        } else if (item.getLastHighSoEasyCount() == 0) {
            item.setSoEasyCount(item.getSoEasyCount() + 1);
            item.setNextReviewTime(Math.min(instantNow.plusSeconds((long) (Duration.ofDays(5L).getSeconds() * ((long) (1 << (item.getSoEasyCount() - 2))) * dF2)).getEpochSecond(), instantNow.plusSeconds(Duration.ofDays(365L).getSeconds()).getEpochSecond()));
        } else {
            item.setSoEasyCount(Math.max(3, (int) (((double) item.getLastHighSoEasyCount()) / 1.5d)));
            item.setLastHighSoEasyCount(0);
            item.setNextReviewTime(Math.min(instantNow.plusSeconds((long) (Duration.ofDays(5L).getSeconds() * ((long) (1 << (item.getSoEasyCount() - 2))) * dF2)).getEpochSecond(), instantNow.plusSeconds(Duration.ofDays(365L).getSeconds()).getEpochSecond()));
        }
    }

    public static void i(SRSStatus sRSStatus, Instant instant, long j11) {
        sRSStatus.setInterval(j11);
        sRSStatus.setNextReviewTime(instant.plusSeconds((j11 * ((long) 24) * ((long) 3600)) + ((long) 0)).getEpochSecond());
    }

    public static void j(SRSStatus sRSStatus, Instant instant, List list) {
        sRSStatus.setNextReviewTime(instant.plusSeconds(((Number) list.get(sRSStatus.getLearningStep())).longValue() * ((long) 60)).getEpochSecond());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object d(long j11, long j12, xy.c cVar) {
        x xVar;
        String strQ;
        long j13;
        long j14;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i11 = xVar.f55362f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f55362f = i11 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object objU = xVar.f55360d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = xVar.f55362f;
        w0 w0Var = this.f55236a;
        vt.n0 n0Var = this.f55237b;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objU);
            if (j11 > 0 && j12 > 0) {
                strQ = xt.d.q(j12, 0, ((fr.o0) n0Var).f27733a.keyLanguage);
                bh.i0 i0VarC = ((z0) w0Var).c(strQ);
                xVar.f55359c = strQ;
                xVar.f55357a = j11;
                xVar.f55358b = j12;
                xVar.f55362f = 1;
                objU = x0.u(i0VarC, xVar);
                if (objU != aVar) {
                    j13 = j11;
                    j14 = j12;
                }
                return aVar;
            }
            return b0Var;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objU);
            return b0Var;
        }
        long j15 = xVar.f55358b;
        long j16 = xVar.f55357a;
        strQ = xVar.f55359c;
        com.bumptech.glide.e.F(objU);
        j14 = j15;
        j13 = j16;
        String str = strQ;
        if (objU == null) {
            SRSStatus sRSStatusCopy$default = SRSStatus.copy$default(new SRSStatus(str, j13, j14, 0, xt.d.k(((fr.o0) n0Var).f27733a.keyLanguage), "course", System.currentTimeMillis() / ((long) 1000), o.CORRECT), null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, 0L, false, ReviewVisibilityMode.SHOW, 1048575, null);
            xVar.f55359c = null;
            xVar.f55357a = j13;
            xVar.f55358b = j14;
            xVar.f55362f = 2;
            if (((z0) w0Var).d(sRSStatusCopy$default, xVar) == aVar) {
                return aVar;
            }
        }
        return b0Var;
    }

    public final gp.r g(int i11, List list, List unitIds) {
        kotlin.jvm.internal.m.f(unitIds, "unitIds");
        return ((z0) this.f55236a).b(i11, list, unitIds);
    }

    public final Object k(SRSStatus sRSStatus, xy.i iVar) {
        Object objD = ((z0) this.f55236a).d(sRSStatus, iVar);
        return objD == wy.a.COROUTINE_SUSPENDED ? objD : qy.b0.f48488a;
    }

    public final Object l(List list, xy.i iVar) {
        list.size();
        Object objE = ((z0) this.f55236a).e(list, iVar);
        return objE == wy.a.COROUTINE_SUSPENDED ? objE : qy.b0.f48488a;
    }
}
