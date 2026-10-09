package b0;

import android.util.Log;
import androidx.lifecycle.ViewModelKt;
import bp.b5;
import bp.u3;
import bp.v2;
import com.google.api.Service;
import com.lingo.course.ui.CourseReviewTestActivity;
import com.lingo.course.ui.CourseTestActivity;
import com.lingo.course.ui.CourseTestDialogueActivity;
import com.lingo.course.ui.CourseTestExamActivity;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingo.course.ui.CourseTestOutActivity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.sc.adapter.ScCateAdapter;
import com.lingo.lingoskill.object.Lesson;
import com.lingo.lingoskill.object.LessonDao;
import com.lingo.lingoskill.object.Unit;
import com.lingo.lingoskill.ui.base.BackupDownloadActivity;
import com.lingo.lingoskill.ui.base.NewsFeedActivity;
import com.lingo.lingoskill.ui.base.SignUpActivity;
import com.lingo.me.MeAccountSettingsActivity;
import com.lingo.me.MeSettingsActivity;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.Bookmark;
import com.lingodeer.data.model.INTENTS;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import l1.c3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a1(fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f3423a = 22;
        this.f3425c = (xy.i) cVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0032 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004f -> B:21:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object e(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f3425c
            d0.j1 r0 = (d0.j1) r0
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r7.f3424b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            com.bumptech.glide.e.F(r8)
            goto L52
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            com.bumptech.glide.e.F(r8)
            goto L30
        L20:
            com.bumptech.glide.e.F(r8)
        L23:
            tz.h r8 = r0.f22739a0
            if (r8 == 0) goto L30
            r7.f3424b = r4
            java.lang.Object r8 = r8.g(r7)
            if (r8 != r1) goto L30
            goto L51
        L30:
            d0.t1 r8 = r0.V
            if (r8 == 0) goto L23
            com.lingo.lingoskill.object.a r8 = new com.lingo.lingoskill.object.a
            r2 = 28
            r8.<init>(r2)
            r7.f3424b = r3
            vy.i r2 = r7.getContext()
            l1.w0 r2 = l1.t.x(r2)
            l1.x0 r5 = new l1.x0
            r6 = 0
            r5.<init>(r8, r6)
            java.lang.Object r8 = r2.p(r5, r7)
            if (r8 != r1) goto L52
        L51:
            return r1
        L52:
            d0.t1 r8 = r0.V
            if (r8 == 0) goto L23
            d0.v1 r8 = (d0.v1) r8
            r8.d()
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.a1.e(java.lang.Object):java.lang.Object");
    }

    private final Object j(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3424b;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                e6.s0 s0Var = (e6.s0) this.f3425c;
                e6.c cVar = new e6.c(s0Var.f25044b);
                this.f3424b = 1;
                if (e6.s0.a(s0Var, cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            return qy.b0.f48488a;
        } catch (ClosedSendChannelException e8) {
            return new Integer(Log.e("GlanceRemoteViewService", "Error when trying to start session for list items", e8));
        }
    }

    private final Object m(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3424b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            yz.f fVar = rz.o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            ej.j jVar = new ej.j(2, 0, null);
            this.f3424b = 1;
            obj = rz.e0.M(eVar, jVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        ej.l lVar = (ej.l) this.f3425c;
        ArrayList arrayList = lVar.N;
        arrayList.clear();
        arrayList.addAll((List) obj);
        ScCateAdapter scCateAdapter = lVar.O;
        if (scCateAdapter != null) {
            scCateAdapter.notifyDataSetChanged();
        }
        return qy.b0.f48488a;
    }

    private final Object n(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3424b;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        com.bumptech.glide.e.F(obj);
        tz.h hVar = (tz.h) ((f0.g1) this.f3425c).f26283f;
        this.f3424b = 1;
        Object objL = rz.e0.l(new e6.q0(hVar, null, 6), this);
        return objL == aVar ? aVar : objL;
    }

    private final Object o(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        ((ur.a) this.f3425c).c("ep_streak_shield_lesson_complete", new fu.x(this.f3424b, 0));
        return qy.b0.f48488a;
    }

    private final Object p(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3424b;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                fh.e eVar = ((gh.o) this.f3425c).f29235b;
                List list = uh.a.f52967a;
                String strO = c.a.o();
                this.f3424b = 1;
                obj = eVar.b(strO, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            return (List) obj;
        } catch (Exception unused) {
            return ry.r.f50854a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [fz.c, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f3423a) {
            case 0:
                return new a1((f1) this.f3425c, dVar, 0);
            case 1:
                return new a1((BackupDownloadActivity) this.f3425c, dVar, 1);
            case 2:
                return new a1((bp.m) this.f3425c, dVar, 2);
            case 3:
                return new a1((bp.n) this.f3425c, dVar, 3);
            case 4:
                return new a1((Env) this.f3425c, this.f3424b, dVar, 4);
            case 5:
                return new a1((bp.r2) this.f3425c, dVar, 5);
            case 6:
                return new a1((v2) this.f3425c, dVar, 6);
            case 7:
                return new a1((NewsFeedActivity) this.f3425c, dVar, 7);
            case 8:
                return new a1((b5) this.f3425c, dVar, 8);
            case 9:
                return new a1((SignUpActivity) this.f3425c, dVar, 9);
            case 10:
                return new a1((bq.o) this.f3425c, dVar, 10);
            case 11:
                return new a1((CourseReviewTestActivity) this.f3425c, dVar, 11);
            case 12:
                return new a1((CourseTestActivity) this.f3425c, dVar, 12);
            case 13:
                return new a1((CourseTestDialogueActivity) this.f3425c, dVar, 13);
            case 14:
                return new a1((CourseTestExamActivity) this.f3425c, dVar, 14);
            case 15:
                return new a1((CourseTestIndexActivity) this.f3425c, dVar, 15);
            case 16:
                return new a1((CourseTestOutActivity) this.f3425c, dVar, 16);
            case 17:
                return new a1((MeAccountSettingsActivity) this.f3425c, dVar, 17);
            case 18:
                return new a1((MeSettingsActivity) this.f3425c, dVar, 18);
            case 19:
                return new a1((d0.h0) this.f3425c, dVar, 19);
            case 20:
                return new a1((d0.n0) this.f3425c, dVar, 20);
            case 21:
                return new a1((d0.j1) this.f3425c, dVar, 21);
            case 22:
                return new a1((xy.i) this.f3425c, dVar);
            case 23:
                return new a1((l1.g1) this.f3425c, dVar, 23);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new a1((e6.s0) this.f3425c, dVar, 24);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new a1((ej.l) this.f3425c, dVar, 25);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new a1((f0.g1) this.f3425c, dVar, 26);
            case 27:
                return new a1((ur.a) this.f3425c, this.f3424b, dVar, 27);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new a1((gh.o) this.f3425c, dVar, 28);
            default:
                return new a1((gn.e) this.f3425c, this.f3424b, dVar, 29);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f3423a) {
            case 0:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 20:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 21:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 22:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 23:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 27:
                a1 a1Var = (a1) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                a1Var.invokeSuspend(b0Var2);
                return b0Var2;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return ((a1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            default:
                a1 a1Var2 = (a1) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                a1Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:268:0x0529  */
    /* JADX WARN: Code duplicated, block: B:278:0x0575  */
    /* JADX WARN: Code duplicated, block: B:361:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:362:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:363:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:445:0x0582 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x056f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x0523 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v141, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        lc.d dVar;
        Object objF;
        int i11;
        Object objU;
        Object objU2;
        Object objU3;
        ArrayList arrayList;
        int size;
        ArrayList arrayList2;
        Object objU4;
        Object objU5;
        Object objU6;
        Object objU7;
        Object objU8;
        lc.d dVar2;
        Object objF2;
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 4;
        vy.d dVar3 = null;
        int i16 = 2;
        switch (this.f3423a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f3424b;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(obj);
                    f1 f1Var = (f1) this.f3425c;
                    this.f3424b = 1;
                    if (f1.t0(f1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 1:
                BackupDownloadActivity backupDownloadActivity = (BackupDownloadActivity) this.f3425c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f3424b;
                try {
                    try {
                        if (i18 == 0) {
                            com.bumptech.glide.e.F(obj);
                            gq.u uVar = (gq.u) backupDownloadActivity.H.getValue();
                            this.f3424b = 1;
                            objF = uVar.f(this);
                            if (objF == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.e.F(obj);
                            objF = obj;
                        }
                        int i19 = bp.e.f4541a[((gq.v) objF).f29646c.ordinal()];
                        if (i19 == 1) {
                            ff.h.C(ff.h.y(backupDownloadActivity, R.string.update_successfully));
                            backupDownloadActivity.m().c("jxz_me_click_progress_backup", new androidx.lifecycle.j(18));
                        } else if (i19 == 2 || i19 == 3) {
                            ff.h.C(ff.h.y(backupDownloadActivity, R.string.error));
                            backupDownloadActivity.m().c("jxz_me_click_progress_backup", new androidx.lifecycle.j(19));
                        } else {
                            if (i19 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            xy.f.a(Log.i("BackupDownloadActivity", "同步结果被新语言同步替换，静默结束"));
                        }
                        int i21 = BackupDownloadActivity.K;
                        dVar = backupDownloadActivity.f22039t;
                        if (dVar != null) {
                            dVar.dismiss();
                        }
                    } catch (Throwable th2) {
                        int i22 = BackupDownloadActivity.K;
                        lc.d dVar4 = backupDownloadActivity.f22039t;
                        if (dVar4 != null) {
                            dVar4.dismiss();
                        }
                        throw th2;
                    }
                } catch (CancellationException e8) {
                    throw e8;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    ff.h.C(ff.h.y(backupDownloadActivity, R.string.error));
                    int i23 = BackupDownloadActivity.K;
                    dVar = backupDownloadActivity.f22039t;
                    if (dVar != null) {
                    }
                }
                return qy.b0.f48488a;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i24 = this.f3424b;
                if (i24 == 0) {
                    com.bumptech.glide.e.F(obj);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    bp.m mVar = (bp.m) this.f3425c;
                    int i25 = (int) ((jCurrentTimeMillis - mVar.N) / 1000);
                    wt.o0 o0VarU = mVar.u();
                    this.f3424b = 1;
                    if (o0VarU.d(i25, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i26 = this.f3424b;
                if (i26 == 0) {
                    com.bumptech.glide.e.F(obj);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    bp.n nVar = (bp.n) this.f3425c;
                    int i27 = (int) ((jCurrentTimeMillis2 - nVar.O) / 1000);
                    wt.o0 o0VarU2 = nVar.u();
                    this.f3424b = 1;
                    if (o0VarU2.d(i27, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env = (Env) this.f3425c;
                if (env.keyLanguage == 7) {
                    env.isLessonTestRepeat = true;
                    env.updateEntry("isLessonTestRepeat");
                    Env env2 = (Env) this.f3425c;
                    env2.isRepeatRegex = true;
                    env2.updateEntry("isRepeatRegex");
                } else {
                    env.isLessonTestRepeat = false;
                    env.updateEntry("isLessonTestRepeat");
                    Env env3 = (Env) this.f3425c;
                    env3.isRepeatRegex = false;
                    env3.updateEntry("isRepeatRegex");
                }
                ArrayList arrayListB = ij.c.b();
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayListB.size();
                int i28 = 0;
                int i29 = 0;
                while (i29 < size2) {
                    Object obj2 = arrayListB.get(i29);
                    i29++;
                    int i30 = i28 + 1;
                    if (i28 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    Unit unit = (Unit) obj2;
                    String unitName = unit.getUnitName();
                    kotlin.jvm.internal.m.e(unitName, "getUnitName(...)");
                    if (oz.x.s0(unitName, "TESTOUT", false)) {
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList(ry.n.W(arrayList3, 10));
                        int size3 = arrayList3.size();
                        int i31 = 0;
                        while (i31 < size3) {
                            Object obj3 = arrayList3.get(i31);
                            i31++;
                            b7.e0.x(((Unit) obj3).getUnitId(), arrayList5);
                            size2 = size2;
                        }
                        i11 = size2;
                        arrayList4.addAll(arrayList5);
                        if (i30 < arrayListB.size()) {
                            b7.e0.x(((Unit) arrayListB.get(i30)).getUnitId(), arrayList4);
                        }
                        unit.setUnitList(arrayList4);
                        arrayList3.clear();
                    } else {
                        i11 = size2;
                        arrayList3.add(unit);
                    }
                    i28 = i30;
                    size2 = i11;
                }
                Unit unit2 = (Unit) arrayListB.get(this.f3424b);
                Long[] lArrV = ew.a.v(unit2.getLessonList());
                kotlin.jvm.internal.m.e(lArrV, "parseIdLst(...)");
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication);
                            ij.d.f34419e = new ij.d(lingoSkillApplication);
                        }
                        break;
                    }
                }
                ij.d dVar5 = ij.d.f34419e;
                kotlin.jvm.internal.m.c(dVar5);
                k10.g gVarQueryBuilder = dVar5.p().queryBuilder();
                org.greenrobot.greendao.d dVar6 = LessonDao.Properties.LessonId;
                List listL = ns.o.L(Arrays.copyOf(lArrV, lArrV.length));
                dVar6.getClass();
                gVarQueryBuilder.f(dVar6.d(listL.toArray()), new k10.h[0]);
                List listD = gVarQueryBuilder.d();
                kotlin.jvm.internal.m.e(listD, "list(...)");
                Lesson lesson = (Lesson) ry.m.c1(ry.m.S0(listD, new ij.b())).get(0);
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                int i32 = cf.x.n().keyLanguage;
                if (i32 == 0) {
                    Env env4 = (Env) this.f3425c;
                    env4.hasConfirmCnLevel = true;
                    env4.updateEntry("hasConfirmCnLevel");
                } else if (i32 == 1) {
                    Env env5 = (Env) this.f3425c;
                    env5.hasConfirmJpLevel = true;
                    env5.updateEntry("hasConfirmJpLevel");
                } else if (i32 == 2) {
                    Env env6 = (Env) this.f3425c;
                    env6.hasConfirmKrLevel = true;
                    env6.updateEntry("hasConfirmKrLevel");
                } else if (i32 != 7) {
                    switch (i32) {
                        case 11:
                            Env env7 = (Env) this.f3425c;
                            env7.hasConfirmCnLevel = true;
                            env7.updateEntry("hasConfirmCnLevel");
                            break;
                        case 12:
                            Env env8 = (Env) this.f3425c;
                            env8.hasConfirmJpLevel = true;
                            env8.updateEntry("hasConfirmJpLevel");
                            break;
                        case 13:
                            Env env9 = (Env) this.f3425c;
                            env9.hasConfirmKrLevel = true;
                            env9.updateEntry("hasConfirmKrLevel");
                            break;
                    }
                } else {
                    Env env10 = (Env) this.f3425c;
                    env10.hasConfirmVtLevel = true;
                    env10.updateEntry("hasConfirmVtLevel");
                }
                return new qy.l(unit2, lesson);
            case 5:
                bp.r2 r2Var = (bp.r2) this.f3425c;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i33 = this.f3424b;
                if (i33 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.r0 r0Var = ((wu.j) r2Var.Q.getValue()).f55404b;
                    av.f0 f0Var = new av.f0(r2Var, dVar3, i15);
                    this.f3424b = 1;
                    if (uz.x0.i(r0Var, f0Var, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 6:
                v2 v2Var = (v2) this.f3425c;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i34 = this.f3424b;
                if (i34 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.r0 r0Var2 = ((wu.j) v2Var.N.getValue()).f55404b;
                    av.f0 f0Var2 = new av.f0(v2Var, dVar3, 5);
                    this.f3424b = 1;
                    if (uz.x0.i(r0Var2, f0Var2, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 7:
                NewsFeedActivity newsFeedActivity = (NewsFeedActivity) this.f3425c;
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i35 = this.f3424b;
                if (i35 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var = newsFeedActivity.n().f55339f;
                    this.f3424b = 1;
                    objU = uz.x0.u(m0Var, this);
                    if (objU == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU = obj;
                }
                th.j.a(new com.lingo.lingoskill.http.service.d().b().f(new u3(((Boolean) objU).booleanValue(), i14)).k(ky.e.f38937b).g(px.b.a()).h(new dm.a(newsFeedActivity, i15), bp.h.f4608c), newsFeedActivity.f36391f);
                return qy.b0.f48488a;
            case 8:
                b5 b5Var = (b5) this.f3425c;
                ?? r9 = b5Var.U;
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i36 = this.f3424b;
                if (i36 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (b5Var.r().scLanguage > 0) {
                        bh.r rVarB = ((fr.r) ((vt.e) r9.getValue())).b(xt.d.k(((fr.o0) b5Var.s()).f27733a.keyLanguage), "sc");
                        this.f3424b = 1;
                        objU3 = uz.x0.u(rVarB, this);
                        if (objU3 == aVar9) {
                            return aVar9;
                        }
                        arrayList = new ArrayList();
                        for (Object obj4 : (Iterable) objU3) {
                            if (((Bookmark) obj4).isFav() == 1) {
                                arrayList.add(obj4);
                            }
                        }
                        size = arrayList.size();
                    } else {
                        bh.r rVarB2 = ((fr.r) ((vt.e) r9.getValue())).b(xt.d.k(((fr.o0) b5Var.s()).f27733a.keyLanguage), "kanji");
                        this.f3424b = 2;
                        objU2 = uz.x0.u(rVarB2, this);
                        if (objU2 == aVar9) {
                            return aVar9;
                        }
                        arrayList2 = new ArrayList();
                        for (Object obj5 : (Iterable) objU2) {
                            if (((Bookmark) obj5).isFav() == 1) {
                                arrayList2.add(obj5);
                            }
                        }
                        size = arrayList2.size();
                    }
                } else if (i36 == 1) {
                    com.bumptech.glide.e.F(obj);
                    objU3 = obj;
                    arrayList = new ArrayList();
                    while (r0.hasNext()) {
                        if (((Bookmark) obj4).isFav() == 1) {
                            arrayList.add(obj4);
                        }
                    }
                    size = arrayList.size();
                } else {
                    if (i36 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU2 = obj;
                    arrayList2 = new ArrayList();
                    while (r0.hasNext()) {
                        if (((Bookmark) obj5).isFav() == 1) {
                            arrayList2.add(obj5);
                        }
                    }
                    size = arrayList2.size();
                }
                return new Integer(size);
            case 9:
                qy.b0 b0Var = qy.b0.f48488a;
                SignUpActivity signUpActivity = (SignUpActivity) this.f3425c;
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i37 = this.f3424b;
                if (i37 == 0) {
                    com.bumptech.glide.e.F(obj);
                    int i38 = SignUpActivity.L;
                    signUpActivity.f22046t.setValue(Boolean.FALSE);
                    vt.n0 n0VarL = signUpActivity.l();
                    this.f3424b = 1;
                    fr.o0 o0Var = (fr.o0) n0VarL;
                    o0Var.getClass();
                    yz.f fVar = rz.o0.f50940a;
                    Object objM = rz.e0.M(yz.e.f58387a, new fr.g0(12, o0Var, dVar3), this);
                    if (objM != aVar10) {
                        objM = b0Var;
                    }
                    if (objM == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                signUpActivity.setResult(INTENTS.RESULT_SIGN_UP_SUCCESS);
                signUpActivity.finish();
                return b0Var;
            case 10:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i39 = this.f3424b;
                if (i39 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar2 = rz.o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    bq.n nVar2 = new bq.n((bq.o) this.f3425c, null);
                    this.f3424b = 1;
                    if (rz.e0.M(eVar, nVar2, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 11:
                CourseReviewTestActivity courseReviewTestActivity = (CourseReviewTestActivity) this.f3425c;
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i40 = this.f3424b;
                if (i40 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var2 = courseReviewTestActivity.n().f55339f;
                    this.f3424b = 1;
                    objU4 = uz.x0.u(m0Var2, this);
                    if (objU4 == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU4 = obj;
                }
                if (!((Boolean) objU4).booleanValue()) {
                    int[] iArr = bq.r.f4959a;
                    bq.m.C(courseReviewTestActivity, "lesson_finish");
                }
                return qy.b0.f48488a;
            case 12:
                CourseTestActivity courseTestActivity = (CourseTestActivity) this.f3425c;
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                int i41 = this.f3424b;
                if (i41 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var3 = courseTestActivity.n().f55339f;
                    this.f3424b = 1;
                    objU5 = uz.x0.u(m0Var3, this);
                    if (objU5 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU5 = obj;
                }
                if (!((Boolean) objU5).booleanValue()) {
                    int[] iArr2 = bq.r.f4959a;
                    bq.m.C(courseTestActivity, "lesson_finish");
                }
                return qy.b0.f48488a;
            case 13:
                CourseTestDialogueActivity courseTestDialogueActivity = (CourseTestDialogueActivity) this.f3425c;
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                int i42 = this.f3424b;
                if (i42 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var4 = courseTestDialogueActivity.n().f55339f;
                    this.f3424b = 1;
                    objU6 = uz.x0.u(m0Var4, this);
                    if (objU6 == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU6 = obj;
                }
                if (!((Boolean) objU6).booleanValue()) {
                    int[] iArr3 = bq.r.f4959a;
                    bq.m.C(courseTestDialogueActivity, "lesson_dialogue_finish");
                }
                return qy.b0.f48488a;
            case 14:
                CourseTestExamActivity courseTestExamActivity = (CourseTestExamActivity) this.f3425c;
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                int i43 = this.f3424b;
                if (i43 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var5 = courseTestExamActivity.n().f55339f;
                    this.f3424b = 1;
                    objU7 = uz.x0.u(m0Var5, this);
                    if (objU7 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU7 = obj;
                }
                if (!((Boolean) objU7).booleanValue()) {
                    int[] iArr4 = bq.r.f4959a;
                    bq.m.C(courseTestExamActivity, "quick_exam_finish");
                }
                return qy.b0.f48488a;
            case 15:
                qy.b0 b0Var2 = qy.b0.f48488a;
                CourseTestIndexActivity courseTestIndexActivity = (CourseTestIndexActivity) this.f3425c;
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                int i44 = this.f3424b;
                if (i44 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f3424b = 1;
                    if (rz.e0.m(1000L, this) != aVar16) {
                    }
                    return aVar16;
                }
                if (i44 == 1) {
                    com.bumptech.glide.e.F(obj);
                } else {
                    if (i44 != 2) {
                        if (i44 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                        return b0Var2;
                    }
                    com.bumptech.glide.e.F(obj);
                }
                vt.c cVarK = courseTestIndexActivity.k();
                this.f3424b = 3;
                ((vt.d) cVarK).h(this);
                if (b0Var2 != aVar16) {
                    return b0Var2;
                }
                return aVar16;
                vt.c cVarK2 = courseTestIndexActivity.k();
                this.f3424b = 2;
                ((vt.d) cVarK2).c(this);
                if (b0Var2 != aVar16) {
                    vt.c cVarK3 = courseTestIndexActivity.k();
                    this.f3424b = 3;
                    ((vt.d) cVarK3).h(this);
                    if (b0Var2 != aVar16) {
                        return b0Var2;
                    }
                }
                return aVar16;
            case 16:
                CourseTestOutActivity courseTestOutActivity = (CourseTestOutActivity) this.f3425c;
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                int i45 = this.f3424b;
                if (i45 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var6 = courseTestOutActivity.n().f55339f;
                    this.f3424b = 1;
                    objU8 = uz.x0.u(m0Var6, this);
                    if (objU8 == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU8 = obj;
                }
                if (!((Boolean) objU8).booleanValue()) {
                    int[] iArr5 = bq.r.f4959a;
                    bq.m.C(courseTestOutActivity, "lesson_finish");
                }
                return qy.b0.f48488a;
            case 17:
                MeAccountSettingsActivity meAccountSettingsActivity = (MeAccountSettingsActivity) this.f3425c;
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                int i46 = this.f3424b;
                try {
                    try {
                        if (i46 == 0) {
                            com.bumptech.glide.e.F(obj);
                            gq.u uVar2 = (gq.u) meAccountSettingsActivity.K.getValue();
                            this.f3424b = 1;
                            objF2 = uVar2.f(this);
                            if (objF2 == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i46 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.e.F(obj);
                            objF2 = obj;
                        }
                        int i47 = cr.e.f22434a[((gq.v) objF2).f29646c.ordinal()];
                        if (i47 == 1) {
                            ff.h.C(ff.h.y(meAccountSettingsActivity, R.string.update_successfully));
                            meAccountSettingsActivity.m().c("jxz_me_click_progress_backup", new bq.u(26));
                        } else if (i47 == 2 || i47 == 3) {
                            ff.h.C(ff.h.y(meAccountSettingsActivity, R.string.error));
                            meAccountSettingsActivity.m().c("jxz_me_click_progress_backup", new bq.u(27));
                        } else {
                            if (i47 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            xy.f.a(Log.i("MeAccountSettingsActivity", "同步结果被新语言同步替换，静默结束"));
                        }
                        int i48 = MeAccountSettingsActivity.R;
                        dVar2 = meAccountSettingsActivity.H;
                        if (dVar2 != null) {
                            dVar2.dismiss();
                        }
                    } catch (Throwable th3) {
                        int i49 = MeAccountSettingsActivity.R;
                        lc.d dVar7 = meAccountSettingsActivity.H;
                        if (dVar7 != null) {
                            dVar7.dismiss();
                        }
                        throw th3;
                    }
                } catch (CancellationException e11) {
                    throw e11;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    ff.h.C(ff.h.y(meAccountSettingsActivity, R.string.error));
                    int i50 = MeAccountSettingsActivity.R;
                    dVar2 = meAccountSettingsActivity.H;
                    if (dVar2 != null) {
                    }
                }
                return qy.b0.f48488a;
            case 18:
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                int i51 = this.f3424b;
                if (i51 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar3 = rz.o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    bp.g2 g2Var = new bp.g2(i16, i15, dVar3);
                    this.f3424b = 1;
                    if (rz.e0.M(eVar2, g2Var, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                kotlin.jvm.internal.m.c(lingoSkillApplication3);
                com.bumptech.glide.c.c(lingoSkillApplication3).b();
                String string = ((MeSettingsActivity) this.f3425c).getString(R.string.success);
                kotlin.jvm.internal.m.e(string, "getString(...)");
                ff.h.C(string);
                return qy.b0.f48488a;
            case 19:
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                int i52 = this.f3424b;
                if (i52 == 0) {
                    com.bumptech.glide.e.F(obj);
                    kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                    kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
                    kotlin.jvm.internal.w wVar3 = new kotlin.jvm.internal.w();
                    d0.h0 h0Var = (d0.h0) this.f3425c;
                    uz.w0 w0Var = h0Var.Q.f29906a;
                    d0.g0 g0Var = new d0.g0(wVar, wVar2, wVar3, h0Var, 0);
                    this.f3424b = 1;
                    w0Var.getClass();
                    if (uz.w0.l(w0Var, g0Var, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i52 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 20:
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                int i53 = this.f3424b;
                if (i53 == 0) {
                    com.bumptech.glide.e.F(obj);
                    d0.n0 n0Var = (d0.n0) this.f3425c;
                    this.f3424b = 1;
                    if (android.support.v4.media.session.a.e(n0Var, null, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 21:
                return e(obj);
            case 22:
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                int i54 = this.f3424b;
                if (i54 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ?? r11 = (xy.i) this.f3425c;
                    this.f3424b = 1;
                    if (r11.invoke(this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i54 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 23:
                l1.g1 g1Var = (l1.g1) this.f3425c;
                wy.a aVar23 = wy.a.COROUTINE_SUSPENDED;
                int i55 = this.f3424b;
                if (i55 == 0) {
                    com.bumptech.glide.e.F(obj);
                    c3 c3Var = dt.v2.f24275a;
                    g1Var.m(1.2f);
                    this.f3424b = 1;
                    if (rz.e0.m(200L, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                c3 c3Var2 = dt.v2.f24275a;
                g1Var.m(1.0f);
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return j(obj);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return m(obj);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return n(obj);
            case 27:
                return o(obj);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return p(obj);
            default:
                qy.b0 b0Var3 = qy.b0.f48488a;
                wy.a aVar24 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                gn.e eVar3 = (gn.e) this.f3425c;
                uz.i1 i1Var = eVar3.f29324d;
                int i56 = this.f3424b;
                if (i56 == 0) {
                    i12 = 1;
                } else if (i56 == 1 || i56 == 2) {
                    i12 = 2;
                } else if (i56 != 3) {
                    i12 = 1;
                } else {
                    i12 = 3;
                }
                vy.d dVar8 = null;
                if (eVar3.H.contains(new Integer(i12))) {
                    gn.a aVarA = gn.a.a((gn.a) i1Var.getValue(), false, null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, true, 63);
                    i1Var.getClass();
                    i1Var.l(null, aVarA);
                } else {
                    if (i56 == 0) {
                        i13 = 1;
                    } else if (i56 == 1 || i56 == 2) {
                        i13 = 2;
                    } else if (i56 != 3) {
                        i13 = 1;
                    } else {
                        i13 = 3;
                    }
                    long j11 = i13;
                    File file = new File(defpackage.e.m(xt.b.a().b(), fv.b.D(j11)));
                    qy.q qVar = fv.b.f28186a;
                    fv.a aVar25 = new fv.a(0L, fv.b.E(j11), fv.b.D(j11));
                    if (file.exists()) {
                        rz.e0.B(ViewModelKt.getViewModelScope(eVar3), null, null, new gn.c(i13, 1, eVar3, file, dVar8), 3);
                    } else {
                        i1Var.l(null, gn.a.a((gn.a) i1Var.getValue(), false, null, null, null, true, CropImageView.DEFAULT_ASPECT_RATIO, false, 15));
                        eVar3.f29322b.d(aVar25, new gn.d(eVar3, i13, file, i14));
                    }
                }
                return b0Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(Object obj, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f3423a = i12;
        this.f3425c = obj;
        this.f3424b = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3423a = i11;
        this.f3425c = obj;
    }
}
