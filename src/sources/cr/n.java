package cr;

import android.app.AlarmManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import bq.r;
import bt.y2;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.api.Service;
import com.lingo.fluent.ui.base.PdFinishActivity;
import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import com.lingo.lingoskill.koreanskill.ui.syllable.ui.KOYinTuActivity;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.me.MeSetupDailyGoalActivity;
import com.lingo.me.OfflineAllActivity;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.DayStreakFinishedStatus;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import com.lingodeer.daystreak.DayStreakExplainActivity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import cu.t;
import d0.f2;
import d0.s1;
import dr.p;
import dt.z1;
import dv.u0;
import f0.b1;
import f0.b2;
import fr.o0;
import g00.d1;
import gp.c0;
import gp.n0;
import hj.t1;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import l1.k1;
import ns.o;
import qy.b0;
import ry.s;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22451b;

    public /* synthetic */ n(Object obj, int i11) {
        this.f22450a = i11;
        this.f22451b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f22450a;
        int i12 = 0;
        Object[] objArr = 0;
        int i13 = 1;
        b0 b0Var = b0.f48488a;
        Object obj = this.f22451b;
        switch (i11) {
            case 0:
                int i14 = MeSetupDailyGoalActivity.f22222t;
                ((MeSetupDailyGoalActivity) obj).finish();
                return b0Var;
            case 1:
                int i15 = OfflineAllActivity.f22223t;
                ((OfflineAllActivity) obj).finish();
                return b0Var;
            case 2:
                f2 f2Var = (f2) obj;
                d0.j jVar = (d0.j) y2.f.i(f2Var, s1.f22800a);
                f2Var.f22699c0 = jVar;
                f2Var.f22700d0 = jVar != null ? new d0.i(jVar.f22732a, jVar.f22733b, jVar.f22734c, jVar.f22735d) : null;
                return b0Var;
            case 3:
                da.g gVar = (da.g) obj;
                gVar.getLifecycle().addObserver(new da.b(gVar));
                return b0Var;
            case 4:
                int i16 = GRKSyllableIntroductionActivity.H;
                ((GRKSyllableIntroductionActivity) obj).finish();
                return b0Var;
            case 5:
                dr.k kVar = (dr.k) obj;
                try {
                    int[] iArr = xt.d.f56292a;
                    int iW = x.W(34);
                    if (iW < 16) {
                        iW = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                    for (int i17 = 0; i17 < 34; i17++) {
                        int i18 = iArr[i17];
                        String strK = xt.d.k(i18);
                        InputStream inputStreamOpen = kVar.f23567c.getAssets().open("unit_info/" + xt.d.k(i18));
                        kotlin.jvm.internal.m.e(inputStreamOpen, "open(...)");
                        Charset charsetForName = Charset.forName(Constants.ENCODING);
                        kotlin.jvm.internal.m.e(charsetForName, "forName(...)");
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, charsetForName), OSSConstants.DEFAULT_BUFFER_SIZE);
                        try {
                            h00.e eVarF = h00.n.f(xt.c.f56291a.d(ob.f.I(bufferedReader)));
                            ArrayList arrayList = new ArrayList();
                            Iterator it = eVarF.f29919a.iterator();
                            while (it.hasNext()) {
                                h00.m mVar = (h00.m) h00.n.g((h00.m) it.next()).get("unitId");
                                Long lValueOf = mVar != null ? Long.valueOf(h00.n.i(h00.n.h(mVar))) : null;
                                if (lValueOf != null) {
                                    arrayList.add(lValueOf);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            int i19 = 0;
                            while (i19 < size) {
                                Object obj2 = arrayList.get(i19);
                                i19++;
                                if (((Number) obj2).longValue() != -1) {
                                    arrayList2.add(obj2);
                                }
                            }
                            Set setF1 = ry.m.f1(arrayList2);
                            bufferedReader.close();
                            linkedHashMap.put(strK, setF1);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                o.m(bufferedReader, th2);
                                throw th3;
                            }
                        }
                    }
                    return linkedHashMap;
                } catch (Exception unused) {
                    return s.f50855a;
                }
            case 6:
                dr.o oVar = (dr.o) obj;
                return new dr.k(oVar.f23580a, oVar.f23581b, oVar.f23582c, oVar.f23585f);
            case 7:
                p pVar = (p) obj;
                return new dr.o(pVar.f23587a, pVar.f23588b, pVar.f23589c, pVar.f23590d, pVar.f23591e, pVar.f23592f);
            case 8:
                ds.g gVar2 = (ds.g) obj;
                return new t(gVar2.f23616a, new cu.h("cn_tone.db", "cn_tone.zip", new y2(0, gVar2, ds.g.class, "toneZipFile", "toneZipFile()Ljava/io/File;", 0, 4)), gVar2.f23618c, new m(10), new com.google.firebase.datastorage.a(gVar2, 13), new ds.e(2, i13, objArr == true ? 1 : 0), "ChineseToneRepository");
            case 9:
                ((z1) obj).f24412c.invoke(BuildConfig.VERSION_NAME);
                return b0Var;
            case 10:
                o0 o0Var = (o0) ((dv.d) obj).f24438a;
                int[] iArr2 = r.f4959a;
                return new hv.a(bq.m.o(o0Var.f27734b));
            case 11:
                o0 o0Var2 = (o0) ((dv.l) obj).f24480a;
                int[] iArr3 = r.f4959a;
                return new hv.a(bq.m.o(o0Var2.f27734b));
            case 12:
                o0 o0Var3 = (o0) ((u0) obj).f24522a;
                int[] iArr4 = r.f4959a;
                return new hv.a(bq.m.o(o0Var3.f27734b));
            case 13:
                e00.h hVar = (e00.h) obj;
                return Integer.valueOf(d1.g(hVar, hVar.f24691j));
            case 14:
                return (AlarmManager) ((er.f) obj).f25751a.getSystemService("alarm");
            case 15:
                return com.bumptech.glide.d.G((ChineseToneUnit) obj);
            case 16:
                return (b1) tz.o.a(((tz.l) obj).d());
            case 17:
                return Boolean.valueOf(((b2) obj).P);
            case 18:
                int i21 = KOYinTuActivity.H;
                ((KOYinTuActivity) obj).finish();
                return b0Var;
            case 19:
                ((n0) obj).b(c0.f29351a);
                return b0Var;
            case 20:
                return com.bumptech.glide.d.G((ChineseToneLesson) obj);
            case 21:
                DayStreakFinishedStatus dayStreakFinishedStatus = (DayStreakFinishedStatus) obj;
                Bundle bundle = new Bundle();
                bundle.putString("type", dayStreakFinishedStatus.isMilestone() ? "milestone_true" : "milestone_false");
                bundle.putString("numbers", String.valueOf(dayStreakFinishedStatus.getDayStreak()));
                bundle.putString("source", dayStreakFinishedStatus.getSource());
                return bundle;
            case 22:
                int i22 = DayStreakExplainActivity.f22387a;
                ((DayStreakExplainActivity) obj).finish();
                return b0Var;
            case 23:
                k1 k1Var = ((g1.a) obj).L;
                k1Var.setValue(Boolean.valueOf(!((Boolean) k1Var.getValue()).booleanValue()));
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                y2.f.m((g1.b) obj);
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                gb.l lVar = (gb.l) obj;
                int i23 = pb.c.f46730a;
                gb.p pVar2 = lVar.f28940a;
                WorkDatabase workDatabase = pVar2.f28955c;
                HashSet hashSet = new HashSet();
                hashSet.addAll(lVar.f28944e);
                HashSet hashSetB = gb.l.B(lVar);
                Iterator it2 = hashSet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        hashSet.removeAll(lVar.f28944e);
                    } else if (hashSetB.contains((String) it2.next())) {
                        i12 = 1;
                    }
                }
                if (i12 != 0) {
                    throw new IllegalStateException("WorkContinuation has cycles (" + lVar + ")");
                }
                fb.c cVar = pVar2.f28954b;
                workDatabase.c();
                try {
                    pb.g.b(workDatabase, cVar, lVar);
                    boolean zA = pb.c.a(lVar);
                    workDatabase.x();
                    workDatabase.s();
                    if (zA) {
                        gb.h.b(cVar, workDatabase, pVar2.f28957e);
                    }
                    return b0Var;
                } catch (Throwable th4) {
                    workDatabase.s();
                    throw th4;
                }
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                gb.p pVar3 = (gb.p) obj;
                WorkDatabase workDatabase2 = pVar3.f28955c;
                int i24 = Build.VERSION.SDK_INT;
                Context context = pVar3.f28953a;
                int i25 = jb.d.f36289f;
                if (i24 >= 34) {
                    jb.a.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListE = jb.d.e(context, jobScheduler);
                if (arrayListE != null && !arrayListE.isEmpty()) {
                    int size2 = arrayListE.size();
                    while (i12 < size2) {
                        Object obj3 = arrayListE.get(i12);
                        i12++;
                        jb.d.a(jobScheduler, ((JobInfo) obj3).getId());
                    }
                }
                ob.s sVarE = workDatabase2.E();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) sVarE.f44875a;
                workDatabase_Impl.b();
                ob.h hVar2 = (ob.h) sVarE.m;
                la.j jVarA = hVar2.a();
                try {
                    workDatabase_Impl.c();
                    try {
                        jVarA.a();
                        workDatabase_Impl.x();
                        workDatabase_Impl.s();
                        hVar2.i(jVarA);
                        gb.h.b(pVar3.f28954b, workDatabase2, pVar3.f28957e);
                        return b0Var;
                    } catch (Throwable th5) {
                        workDatabase_Impl.s();
                        throw th5;
                    }
                } catch (Throwable th6) {
                    hVar2.i(jVarA);
                    throw th6;
                }
            case 27:
                bq.f fVar = (bq.f) obj;
                return new gh.o((fh.e) fVar.f4944b, (String) fVar.f4945c, (String) fVar.f4946d, BuildConfig.VERSION_NAME, fVar.f4943a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                gm.g gVar3 = (gm.g) obj;
                ta.a aVar = gVar3.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                HwView hwView = ((t1) aVar).f33322f;
                HwCharacter hwCharacter = gVar3.f29295j;
                if (hwCharacter == null) {
                    kotlin.jvm.internal.m.n("mCurChar");
                    throw null;
                }
                String showCharPath = hwCharacter.getShowCharPath();
                ArrayList arrayList3 = gVar3.f29296k;
                ArrayList arrayList4 = gVar3.f29297l;
                HwCharacter hwCharacter2 = gVar3.f29295j;
                if (hwCharacter2 == null) {
                    kotlin.jvm.internal.m.n("mCurChar");
                    throw null;
                }
                hwCharacter2.getCharId();
                hwView.e(showCharPath, arrayList3, arrayList4);
                ta.a aVar2 = gVar3.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((t1) aVar2).f33322f.setWritingListener(new gm.b(gVar3, i12));
                ta.a aVar3 = gVar3.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((t1) aVar3).f33322f.setAnimListener(new gm.b(gVar3, i13));
                gVar3.s();
                return b0Var;
            default:
                int i26 = PdFinishActivity.H;
                String stringExtra = ((PdFinishActivity) obj).getIntent().getStringExtra(INTENTS.EXTRA_STRING);
                return stringExtra == null ? BuildConfig.VERSION_NAME : stringExtra;
        }
    }
}
