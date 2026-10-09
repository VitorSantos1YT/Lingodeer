package com.lingo.notification;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import ay.k0;
import bj.a;
import c20.b;
import cf.x;
import com.bumptech.glide.d;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.DayStreakStatus;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.SRSStatusScheduleKt;
import com.lingodeer.data.model.TodayStreakType;
import er.g;
import er.h;
import er.i;
import er.k;
import fr.x4;
import gp.r;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import ns.o;
import qy.b0;
import qy.j;
import qy.q;
import ry.l;
import ry.s;
import rz.b2;
import rz.e0;
import rz.o0;
import uz.x0;
import vt.h1;
import vt.n0;
import wt.m0;
import xy.c;
import yz.e;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class UnifiedNotificationJobService extends JobService {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f22226c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22227a = d.u(j.SYNCHRONIZED, new a(this, 8));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wz.d f22228b;

    public UnifiedNotificationJobService() {
        b2 b2VarE = e0.e();
        f fVar = o0.f50940a;
        this.f22228b = e0.c(e.f58387a.plus(b2VarE));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[PHI: r11
      0x0090: PHI (r11v1 er.e) = (r11v0 er.e), (r11v7 er.e) binds: [B:26:0x0076, B:31:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(UnifiedNotificationJobService unifiedNotificationJobService, er.e eVar, JobParameters jobParameters, c cVar) {
        er.j jVar;
        int i11;
        String str;
        if (cVar instanceof er.j) {
            jVar = (er.j) cVar;
            int i12 = jVar.f25764d;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                jVar.f25764d = i12 - Integer.MIN_VALUE;
            } else {
                jVar = new er.j(unifiedNotificationJobService, cVar);
            }
        } else {
            jVar = new er.j(unifiedNotificationJobService, cVar);
        }
        Object objU = jVar.f25762b;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i13 = jVar.f25764d;
        Object obj2 = b0.f48488a;
        if (i13 != 0) {
            if (i13 == 1) {
                eVar = jVar.f25761a;
                com.bumptech.glide.e.F(objU);
            } else {
                if (i13 == 2) {
                    com.bumptech.glide.e.F(objU);
                    return obj2;
                }
                if (i13 == 3) {
                    com.bumptech.glide.e.F(objU);
                    return obj2;
                }
                if (i13 == 4) {
                    com.bumptech.glide.e.F(objU);
                    return obj2;
                }
                if (i13 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(objU);
            }
            return obj2;
        }
        com.bumptech.glide.e.F(objU);
        wt.o0 o0Var = (wt.o0) ((b) vc.a.m().f519c).f6515d.a(null, null, z.a(wt.o0.class));
        if (l.D(new er.e[]{er.e.DISCOUNT_LAST_1H, er.e.BILLING_5MIN}, eVar)) {
            m0 m0Var = o0Var.f55339f;
            jVar.f25761a = eVar;
            jVar.f25764d = 1;
            objU = x0.u(m0Var, jVar);
            if (objU == obj) {
                return obj;
            }
        } else {
            i11 = g.f25753a[eVar.ordinal()];
            if (i11 != 1) {
                jVar.f25761a = null;
                jVar.f25764d = 2;
                if (unifiedNotificationJobService.b(jVar) == obj) {
                    return obj;
                }
            } else if (i11 != 2) {
                jVar.f25761a = null;
                jVar.f25764d = 3;
                if (unifiedNotificationJobService.d(jVar) == obj) {
                    return obj;
                }
            } else {
                if (i11 != 3) {
                    if (i11 == 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar.f25761a = null;
                    jVar.f25764d = 5;
                    try {
                        String string = unifiedNotificationJobService.getString(R.string.how_do_paid_users_feel_about_their_purchases);
                        m.e(string, "getString(...)");
                        String string2 = unifiedNotificationJobService.getString(R.string.is_lingodeer_worth_it);
                        m.e(string2, "getString(...)");
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        if (x.n().locateLanguage == 1) {
                            str = "https://blog.lingodeer.com/why-lingodeer-premium-osusume-jp/";
                        } else {
                            str = "https://blog.lingodeer.com/is-lingodeer-premium-worth-it/";
                        }
                        er.e eVar2 = er.e.BILLING_5MIN;
                        er.m.f25773d.z(eVar2, new er.a(string, string2, eVar2.c(), ry.x.X(new qy.l("url", str))), unifiedNotificationJobService);
                    } catch (Exception unused) {
                    }
                    if (obj2 == obj) {
                        return obj;
                    }
                    return obj2;
                }
                jVar.f25761a = null;
                jVar.f25764d = 4;
                if (unifiedNotificationJobService.c(jVar) == obj) {
                    return obj;
                }
            }
        }
        return obj2;
        if (!((Boolean) objU).booleanValue()) {
            i11 = g.f25753a[eVar.ordinal()];
            if (i11 != 1) {
                jVar.f25761a = null;
                jVar.f25764d = 2;
                if (unifiedNotificationJobService.b(jVar) == obj) {
                    return obj;
                }
            } else if (i11 != 2) {
                jVar.f25761a = null;
                jVar.f25764d = 3;
                if (unifiedNotificationJobService.d(jVar) == obj) {
                    return obj;
                }
            } else {
                if (i11 != 3) {
                    if (i11 == 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar.f25761a = null;
                    jVar.f25764d = 5;
                    String string3 = unifiedNotificationJobService.getString(R.string.how_do_paid_users_feel_about_their_purchases);
                    m.e(string3, "getString(...)");
                    String string4 = unifiedNotificationJobService.getString(R.string.is_lingodeer_worth_it);
                    m.e(string4, "getString(...)");
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    if (x.n().locateLanguage == 1) {
                        str = "https://blog.lingodeer.com/why-lingodeer-premium-osusume-jp/";
                    } else {
                        str = "https://blog.lingodeer.com/is-lingodeer-premium-worth-it/";
                    }
                    er.e eVar3 = er.e.BILLING_5MIN;
                    er.m.f25773d.z(eVar3, new er.a(string3, string4, eVar3.c(), ry.x.X(new qy.l("url", str))), unifiedNotificationJobService);
                    if (obj2 == obj) {
                        return obj;
                    }
                    return obj2;
                }
                jVar.f25761a = null;
                jVar.f25764d = 4;
                if (unifiedNotificationJobService.c(jVar) == obj) {
                    return obj;
                }
            }
        }
        return obj2;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context newBase) {
        m.f(newBase, "newBase");
        super.attachBaseContext(ob.f.Q(newBase, xt.b.b().locateLanguage, xt.b.m));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(c cVar) {
        h hVar;
        q qVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i11 = hVar.f25757d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f25757d = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objU = hVar.f25755b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = hVar.f25757d;
        b0 b0Var = b0.f48488a;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objU);
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (x.n().learningRemind) {
                q qVarV = d.v(new cr.m(25));
                q qVarV2 = d.v(new cr.m(26));
                r rVarA = ((gu.f) ((gu.a) qVarV.getValue())).a();
                hVar.f25754a = qVarV2;
                hVar.f25757d = 1;
                objU = x0.u(rVarA, hVar);
                if (objU == aVar) {
                    return aVar;
                }
                qVar = qVarV2;
            }
            return b0Var;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qVar = hVar.f25754a;
        com.bumptech.glide.e.F(objU);
        DayStreakStatus dayStreakStatus = (DayStreakStatus) objU;
        Objects.toString(dayStreakStatus);
        Env env = ((fr.o0) ((n0) qVar.getValue())).f27733a;
        if (!l.D(new TodayStreakType[]{TodayStreakType.STREAK, TodayStreakType.STREAK_RESET}, dayStreakStatus.getTodayStreakType()) || !((fr.o0) ((n0) qVar.getValue())).f27733a.dailyLearningSkipIfCompleted) {
            String[] strArr = {getString(R.string.daily_learning_reminder_notification_1), getString(R.string.daily_learning_reminder_notification_2), getString(R.string.daily_learning_reminder_notification_3), getString(R.string.daily_learning_reminder_notification_4), getString(R.string.daily_learning_reminder_notification_5), getString(R.string.daily_learning_reminder_notification_6)};
            jz.d dVar = jz.e.f37397a;
            Object objD0 = l.d0(strArr);
            m.e(objD0, "random(...)");
            List listW0 = oz.q.W0((CharSequence) objD0, new String[]{"!@@@!"}, 0, 6);
            String str = (String) listW0.get(0);
            String str2 = (String) listW0.get(1);
            int[] iArr = bq.r.f4959a;
            String strS = bq.m.s(this, ((fr.o0) xt.b.c()).f27733a.keyLanguage);
            String strQ0 = oz.x.q0(str, "%s", strS);
            String strQ1 = oz.x.q0(str2, "%s", strS);
            er.e eVar = er.e.DAILY_LEARN;
            er.m.f25773d.z(eVar, new er.a(strQ0, strQ1, eVar.c(), s.f50855a), this);
            try {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                String str3 = x.n().learnAlarmTime;
                m.c(str3);
                List listW1 = oz.q.W0(str3, new String[]{":"}, 0, 6);
                if (listW1.size() == 2) {
                    Integer numT0 = oz.x.t0(oz.q.i1((String) listW1.get(0)).toString());
                    int iIntValue = numT0 != null ? numT0.intValue() : 19;
                    Integer numT1 = oz.x.t0(oz.q.i1((String) listW1.get(1)).toString());
                    er.f.f25749c.u(eVar, k0.o(iIntValue, numT1 != null ? numT1.intValue() : 0), null, this);
                }
            } catch (Exception unused) {
            }
        }
        return b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, qy.h] */
    public final Object c(c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i11 = iVar.f25760c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f25760c = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objU = iVar.f25758a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = iVar.f25760c;
        b0 b0Var = b0.f48488a;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(objU);
                uz.i iVar2 = ((x4) ((h1) this.f22227a.getValue())).f27974g;
                iVar.f25760c = 1;
                objU = x0.u(iVar2, iVar);
                if (objU == aVar) {
                    return aVar;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(objU);
            }
            if (!((Boolean) objU).booleanValue()) {
                String string = getString(R.string.sale_ends_in);
                m.e(string, "getString(...)");
                String string2 = getString(R.string.notifi_save_50_today);
                m.e(string2, "getString(...)");
                er.e eVar = er.e.DISCOUNT_LAST_1H;
                er.m.f25773d.z(eVar, new er.a(string, string2, eVar.c(), s.f50855a), this);
            }
        } catch (Exception unused) {
        }
        return b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0103  */
    /* JADX WARN: Code duplicated, block: B:38:0x0104 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:13:0x002c, B:35:0x00ea, B:54:0x0132, B:38:0x0104, B:39:0x0108, B:41:0x010e, B:43:0x011a, B:45:0x0120, B:47:0x0126, B:50:0x012b, B:51:0x012e, B:18:0x003d, B:27:0x0086, B:29:0x00ac, B:31:0x00d6, B:30:0x00c4, B:21:0x0044, B:24:0x0050), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x010e A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:13:0x002c, B:35:0x00ea, B:54:0x0132, B:38:0x0104, B:39:0x0108, B:41:0x010e, B:43:0x011a, B:45:0x0120, B:47:0x0126, B:50:0x012b, B:51:0x012e, B:18:0x003d, B:27:0x0086, B:29:0x00ac, B:31:0x00d6, B:30:0x00c4, B:21:0x0044, B:24:0x0050), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0132 A[Catch: Exception -> 0x0140, TRY_LEAVE, TryCatch #0 {Exception -> 0x0140, blocks: (B:13:0x002c, B:35:0x00ea, B:54:0x0132, B:38:0x0104, B:39:0x0108, B:41:0x010e, B:43:0x011a, B:45:0x0120, B:47:0x0126, B:50:0x012b, B:51:0x012e, B:18:0x003d, B:27:0x0086, B:29:0x00ac, B:31:0x00d6, B:30:0x00c4, B:21:0x0044, B:24:0x0050), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(c cVar) {
        k kVar;
        q qVarV;
        q qVarV2;
        ZoneId zoneId;
        List<SRSStatus> statuses;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i11 = kVar.f25770f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f25770f = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objU = kVar.f25768d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = kVar.f25770f;
        int i13 = 0;
        b0 b0Var = b0.f48488a;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(objU);
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (x.n().smartReviewReminderEnabled) {
                    qVarV = d.v(new cr.m(22));
                    qVarV2 = d.v(new cr.m(23));
                    r rVar = ((wt.m) d.v(new cr.m(24)).getValue()).f55324q;
                    kVar.f25765a = qVarV;
                    kVar.f25766b = qVarV2;
                    kVar.f25770f = 1;
                    objU = x0.u(rVar, kVar);
                    if (objU == aVar) {
                    }
                    return aVar;
                }
                return b0Var;
            }
            if (i12 == 1) {
                qVarV2 = kVar.f25766b;
                qVarV = kVar.f25765a;
                com.bumptech.glide.e.F(objU);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zoneId = kVar.f25767c;
                com.bumptech.glide.e.F(objU);
            }
            statuses = (List) objU;
            LocalDate localDateNow = LocalDate.now(zoneId);
            m.e(localDateNow, "now(...)");
            m.c(zoneId);
            m.f(statuses, "statuses");
            if (statuses.isEmpty()) {
                for (SRSStatus sRSStatus : statuses) {
                    if (!sRSStatus.isExcludedFromReview() && !SRSStatusScheduleKt.isNewCard(sRSStatus) && SRSStatusScheduleKt.isDueOn(sRSStatus, localDateNow, zoneId) && (i13 = i13 + 1) < 0) {
                        o.U();
                        throw null;
                    }
                }
            }
            if (i13 <= 0) {
                er.m.f25773d.z(er.e.SRS_REVIEW, hz.b.s(this, i13), this);
                e();
            }
            return b0Var;
            List list = (List) objU;
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            r rVarG = ((wt.b0) qVarV.getValue()).g(((fr.o0) ((n0) qVarV2.getValue())).f27733a.keyLanguage, ((fr.o0) ((n0) qVarV2.getValue())).f27733a.keyLanguage == 0 ? o.L(new Integer(0), new Integer(1), new Integer(2)) : o.L(new Integer(0), new Integer(1)), list);
            kVar.f25765a = null;
            kVar.f25766b = null;
            kVar.f25767c = zoneIdSystemDefault;
            kVar.f25770f = 2;
            objU = x0.u(rVarG, kVar);
            if (objU != aVar) {
                zoneId = zoneIdSystemDefault;
                statuses = (List) objU;
                LocalDate localDateNow2 = LocalDate.now(zoneId);
                m.e(localDateNow2, "now(...)");
                m.c(zoneId);
                m.f(statuses, "statuses");
                if (statuses.isEmpty()) {
                    while (r13.hasNext()) {
                        if (!sRSStatus.isExcludedFromReview()) {
                            o.U();
                            throw null;
                        }
                    }
                }
                if (i13 <= 0) {
                    er.m.f25773d.z(er.e.SRS_REVIEW, hz.b.s(this, i13), this);
                    e();
                }
                return b0Var;
            }
            return aVar;
        } catch (Exception unused) {
        }
    }

    public final void e() {
        try {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            String str = x.n().smartReviewReminderTime;
            m.c(str);
            List listW0 = oz.q.W0(str, new String[]{":"}, 0, 6);
            if (listW0.size() == 2) {
                Integer numT0 = oz.x.t0(oz.q.i1((String) listW0.get(0)).toString());
                int iIntValue = numT0 != null ? numT0.intValue() : 19;
                Integer numT1 = oz.x.t0(oz.q.i1((String) listW0.get(1)).toString());
                er.f.f25749c.u(er.e.SRS_REVIEW, k0.o(iIntValue, numT1 != null ? numT1.intValue() : 0), null, this);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        e0.i(this.f22228b, null);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        vy.d dVar;
        er.e eVar;
        if (jobParameters == null) {
            return false;
        }
        int jobId = jobParameters.getJobId();
        er.e[] eVarArrValues = er.e.values();
        int length = eVarArrValues.length;
        int i11 = 0;
        while (true) {
            dVar = null;
            if (i11 >= length) {
                eVar = null;
                break;
            }
            er.e eVar2 = eVarArrValues[i11];
            if (eVar2.a() == jobId) {
                eVar = eVar2;
                break;
            }
            i11++;
        }
        if (eVar == null) {
            jobFinished(jobParameters, false);
            return false;
        }
        e0.B(this.f22228b, null, null, new a0.e0(this, eVar, jobParameters, dVar, 18), 3);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        if (jobParameters != null) {
            jobParameters.getJobId();
        }
        e0.i(this.f22228b, null);
        return false;
    }
}
