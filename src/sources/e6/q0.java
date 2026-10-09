package e6;

import android.R;
import android.content.Context;
import android.content.Intent;
import com.google.api.Service;
import com.lingo.lingoskill.object.AzureAreaKey;
import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetReceiver;
import com.lingo.notification.SystemBootReceiver;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.DailyLearnHistory;
import com.lingodeer.data.model.DailyLearnHistoryKt;
import com.lingodeer.data.model.DbFileVersion;
import com.lingodeer.data.model.LessonTestProgress;
import com.lingodeer.data.model.LoginHistory;
import com.lingodeer.data.model.UserInfo;
import com.lingodeer.data.model.UserInfoKt;
import com.lingodeer.database.UserDataDatabase;
import com.lingodeer.database.model.DailyLearnHistoryEntity;
import com.lingodeer.database.model.LanguageHistoryEntity;
import com.lingodeer.database.model.UserInfoEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import f0.i2;
import fr.n3;
import fr.x4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f25021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f25019a = i11;
        this.f25021c = obj;
        this.f25022d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:35:0x0114  */
    /* JADX WARN: Code duplicated, block: B:41:0x012d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    /* JADX WARN: Code duplicated, block: B:51:0x017d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0183  */
    /* JADX WARN: Code duplicated, block: B:53:0x0189  */
    /* JADX WARN: Code duplicated, block: B:54:0x018f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0195  */
    /* JADX WARN: Code duplicated, block: B:56:0x019b  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b2 A[LOOP:1: B:59:0x01ac->B:61:0x01b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01de A[LOOP:3: B:69:0x01d3->B:73:0x01de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01dc A[SYNTHETIC] */
    private final Object e(Object obj) {
        Object objU;
        Object objU2;
        ArrayList arrayList;
        UserInfoEntity userInfoEntity;
        List listA;
        UserInfo userInfo;
        String strB;
        int size;
        int i11;
        Object obj2;
        DailyLearnHistory dailyLearnHistory;
        int learnXP;
        long time;
        Calendar calendar;
        long j11;
        Iterator it;
        int learnXP2;
        int totalXP;
        int i12;
        int i13;
        int i14;
        int i15;
        UserInfo userInfoAsExternalModel;
        UserDataDatabase userDataDatabase = ((x4) this.f25022d).f27968a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i16 = this.f25020b;
        int i17 = 0;
        if (i16 == 0) {
            com.bumptech.glide.e.F(obj);
            no.g gVarL = qx.p.l(userDataDatabase.E().f2988a, new String[]{"daily_learn_history"}, new au.a(8));
            this.f25020b = 1;
            objU = uz.x0.u(gVarL, this);
            if (objU != aVar) {
            }
            return aVar;
        }
        if (i16 == 1) {
            com.bumptech.glide.e.F(obj);
            objU = obj;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ArrayList arrayList2 = (ArrayList) this.f25021c;
            com.bumptech.glide.e.F(obj);
            arrayList = arrayList2;
            objU2 = obj;
        }
        userInfoEntity = (UserInfoEntity) objU2;
        listA = ry.r.f50854a;
        if (userInfoEntity != null || (userInfoAsExternalModel = UserInfoKt.asExternalModel(userInfoEntity)) == null) {
            userInfo = new UserInfo("lingodeer", 0, 0, 0, 0, 0, 0L, -1, 0L, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, listA, listA, 0, 0, 0, 0, 0, 0, null, null, R.id.accessibilityActionDragStart, null);
        } else {
            userInfo = userInfoAsExternalModel;
        }
        kotlin.jvm.internal.m.f(arrayList, "<this>");
        strB = ks.f.b();
        size = arrayList.size();
        i11 = 0;
        do {
            if (i11 < size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i11);
            i11++;
        } while (!kotlin.jvm.internal.m.a(((DailyLearnHistory) obj2).getId(), strB));
        dailyLearnHistory = (DailyLearnHistory) obj2;
        if (dailyLearnHistory != null) {
            learnXP = dailyLearnHistory.getLearnXP();
        } else {
            learnXP = 0;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        Calendar calendar2 = Calendar.getInstance();
        try {
            Date date = simpleDateFormat.parse(simpleDateFormat.format(calendar2.getTime()));
            kotlin.jvm.internal.m.c(date);
            calendar2.setTimeInMillis(date.getTime());
        } catch (ParseException e8) {
            e8.printStackTrace();
        }
        time = calendar2.getTime().getTime();
        calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        j11 = calendar.get(16);
        switch (calendar.get(7)) {
            case 1:
                listA = xt.d.a(arrayList, time, calendar, j11, 7);
                break;
            case 2:
                listA = xt.d.a(arrayList, time, calendar, j11, 1);
                break;
            case 3:
                listA = xt.d.a(arrayList, time, calendar, j11, 2);
                break;
            case 4:
                listA = xt.d.a(arrayList, time, calendar, j11, 3);
                break;
            case 5:
                listA = xt.d.a(arrayList, time, calendar, j11, 4);
                break;
            case 6:
                listA = xt.d.a(arrayList, time, calendar, j11, 5);
                break;
            case 7:
                listA = xt.d.a(arrayList, time, calendar, j11, 6);
                break;
        }
        it = listA.iterator();
        learnXP2 = 0;
        while (it.hasNext()) {
            learnXP2 = ((DailyLearnHistory) it.next()).getLearnXP() + learnXP2;
        }
        totalXP = userInfo.getTotalXP();
        if (totalXP >= 100) {
            i12 = 0;
            for (i13 = 1; i13 < 11; i13++) {
                i14 = i13 * 100;
                for (i15 = 1; i15 < 11; i15++) {
                    i17 = ((i13 - 1) * 10) + i15;
                    i12 += i14;
                    if (totalXP < i12) {
                        i17--;
                    }
                }
            }
        }
        return UserInfo.copy$default(userInfo, null, 0, 0, 0, 0, 0, 0L, 0, 0L, null, null, null, null, null, null, null, null, learnXP, learnXP2, i17, 0, 0, 0, null, null, 32636927, null);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : (Iterable) objU) {
            if (!kotlin.jvm.internal.m.a(((DailyLearnHistoryEntity) obj3).getId(), "olddata")) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList(ry.n.W(arrayList3, 10));
        int size2 = arrayList3.size();
        int i18 = 0;
        while (i18 < size2) {
            Object obj4 = arrayList3.get(i18);
            i18++;
            arrayList4.add(DailyLearnHistoryKt.asExternalModel((DailyLearnHistoryEntity) obj4));
        }
        au.j1 j1VarX = userDataDatabase.X();
        no.g gVarL2 = qx.p.l(j1VarX.f3029a, new String[]{"user_info"}, new a00.c(j1VarX, 3));
        this.f25021c = arrayList4;
        this.f25020b = 2;
        objU2 = uz.x0.u(gVarL2, this);
        if (objU2 != aVar) {
            arrayList = arrayList4;
            userInfoEntity = (UserInfoEntity) objU2;
            listA = ry.r.f50854a;
            if (userInfoEntity != null) {
                userInfo = new UserInfo("lingodeer", 0, 0, 0, 0, 0, 0L, -1, 0L, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, listA, listA, 0, 0, 0, 0, 0, 0, null, null, R.id.accessibilityActionDragStart, null);
            } else {
                userInfo = new UserInfo("lingodeer", 0, 0, 0, 0, 0, 0L, -1, 0L, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, listA, listA, 0, 0, 0, 0, 0, 0, null, null, R.id.accessibilityActionDragStart, null);
            }
            kotlin.jvm.internal.m.f(arrayList, "<this>");
            strB = ks.f.b();
            size = arrayList.size();
            i11 = 0;
            do {
                if (i11 < size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i11);
                i11++;
            } while (!kotlin.jvm.internal.m.a(((DailyLearnHistory) obj2).getId(), strB));
            dailyLearnHistory = (DailyLearnHistory) obj2;
            if (dailyLearnHistory != null) {
                learnXP = dailyLearnHistory.getLearnXP();
            } else {
                learnXP = 0;
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyyMMdd", Locale.US);
            Calendar calendar3 = Calendar.getInstance();
            Date date2 = simpleDateFormat2.parse(simpleDateFormat2.format(calendar3.getTime()));
            kotlin.jvm.internal.m.c(date2);
            calendar3.setTimeInMillis(date2.getTime());
            time = calendar3.getTime().getTime();
            calendar = Calendar.getInstance();
            calendar.setTimeInMillis(time);
            j11 = calendar.get(16);
            switch (calendar.get(7)) {
                case 1:
                    listA = xt.d.a(arrayList, time, calendar, j11, 7);
                    break;
                case 2:
                    listA = xt.d.a(arrayList, time, calendar, j11, 1);
                    break;
                case 3:
                    listA = xt.d.a(arrayList, time, calendar, j11, 2);
                    break;
                case 4:
                    listA = xt.d.a(arrayList, time, calendar, j11, 3);
                    break;
                case 5:
                    listA = xt.d.a(arrayList, time, calendar, j11, 4);
                    break;
                case 6:
                    listA = xt.d.a(arrayList, time, calendar, j11, 5);
                    break;
                case 7:
                    listA = xt.d.a(arrayList, time, calendar, j11, 6);
                    break;
            }
            it = listA.iterator();
            learnXP2 = 0;
            while (it.hasNext()) {
                learnXP2 = ((DailyLearnHistory) it.next()).getLearnXP() + learnXP2;
            }
            totalXP = userInfo.getTotalXP();
            if (totalXP >= 100) {
                i12 = 0;
                while (i13 < 11) {
                    i14 = i13 * 100;
                    while (i15 < 11) {
                        i17 = ((i13 - 1) * 10) + i15;
                        i12 += i14;
                        if (totalXP < i12) {
                            i17--;
                        }
                    }
                }
            }
            return UserInfo.copy$default(userInfo, null, 0, 0, 0, 0, 0, 0L, 0, 0L, null, null, null, null, null, null, null, null, learnXP, learnXP2, i17, 0, 0, 0, null, null, 32636927, null);
        }
        return aVar;
    }

    private final Object j(Object obj) {
        vt.n0 n0Var = ((gp.l1) this.f25022d).f29434b;
        AzureAreaKey azureAreaKey = (AzureAreaKey) this.f25021c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f25020b;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            if (azureAreaKey.getServiceRegion().length() > 0 && azureAreaKey.getSpeechSubscriptionKey().length() > 0) {
                String speechSubscriptionKey = azureAreaKey.getSpeechSubscriptionKey();
                this.f25021c = azureAreaKey;
                this.f25020b = 1;
                fr.o0 o0Var = (fr.o0) n0Var;
                o0Var.getClass();
                yz.f fVar = rz.o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new fr.i0(o0Var, speechSubscriptionKey, dVar, 26), this);
                if (objM != aVar) {
                    objM = b0Var;
                }
                if (objM != aVar) {
                }
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        String serviceRegion = azureAreaKey.getServiceRegion();
        this.f25021c = null;
        this.f25020b = 2;
        fr.o0 o0Var2 = (fr.o0) n0Var;
        o0Var2.getClass();
        yz.f fVar2 = rz.o0.f50940a;
        Object objM2 = rz.e0.M(yz.e.f58387a, new fr.i0(o0Var2, serviceRegion, dVar, 24), this);
        if (objM2 != aVar) {
            objM2 = b0Var;
        }
        return objM2 == aVar ? aVar : b0Var;
    }

    private final Object m(Object obj) {
        String str = (String) this.f25021c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f25020b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            vt.n0 n0Var = ((gq.u) this.f25022d).f29635c;
            this.f25021c = null;
            this.f25020b = 1;
            if (((fr.o0) n0Var).F(str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f25019a) {
            case 0:
                return new q0(0, (Context) this.f25021c, (DayStreakWidgetReceiver) this.f25022d, dVar);
            case 1:
                return new q0(1, (ep.c) this.f25021c, (LanguageHistoryEntity) this.f25022d, dVar);
            case 2:
                return new q0((SystemBootReceiver) this.f25022d, (Context) this.f25021c, dVar, 2);
            case 3:
                return new q0(3, (fz.c) this.f25021c, (et.o) this.f25022d, dVar);
            case 4:
                return new q0(4, (jt.v) this.f25021c, (fz.c) this.f25022d, dVar);
            case 5:
                return new q0((jt.v) this.f25021c, this.f25020b, (CourseSentence) this.f25022d, dVar, 5);
            case 6:
                q0 q0Var = new q0((tz.l) this.f25022d, dVar, 6);
                q0Var.f25021c = obj;
                return q0Var;
            case 7:
                q0 q0Var2 = new q0((f0.g1) this.f25022d, dVar, 7);
                q0Var2.f25021c = obj;
                return q0Var2;
            case 8:
                return new q0(8, (i2) this.f25021c, (fz.e) this.f25022d, dVar);
            case 9:
                return new q0(9, (rz.g1) this.f25021c, (f0.l1) this.f25022d, dVar);
            case 10:
                return new q0(10, (f3.d) this.f25021c, (Runnable) this.f25022d, dVar);
            case 11:
                return new q0((Intent) this.f25022d, (Context) this.f25021c, dVar, 11);
            case 12:
                return new q0(12, (fr.r) this.f25021c, (ArrayList) this.f25022d, dVar);
            case 13:
                return new q0(13, (fr.e0) this.f25021c, (ArrayList) this.f25022d, dVar);
            case 14:
                q0 q0Var3 = new q0((fr.e0) this.f25022d, dVar, 14);
                q0Var3.f25021c = obj;
                return q0Var3;
            case 15:
                return new q0((fr.o0) this.f25021c, this.f25020b, (Set) this.f25022d, dVar, 15);
            case 16:
                return new q0((fr.o0) this.f25021c, this.f25020b, (String) this.f25022d, dVar, 16);
            case 17:
                return new q0(17, (n3) this.f25021c, (List) this.f25022d, dVar);
            case 18:
                return new q0(18, (x4) this.f25021c, (LoginHistory) this.f25022d, dVar);
            case 19:
                return new q0((x4) this.f25022d, dVar, 19);
            case 20:
                return new q0(20, (x4) this.f25021c, (UserInfo) this.f25022d, dVar);
            case 21:
                return new q0(21, (x4) this.f25021c, (DbFileVersion) this.f25022d, dVar);
            case 22:
                return new q0(22, (x4) this.f25021c, (LessonTestProgress) this.f25022d, dVar);
            case 23:
                return new q0(23, (js.r) this.f25021c, (fz.a) this.f25022d, dVar);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                q0 q0Var4 = new q0((g1.b) this.f25022d, dVar, 24);
                q0Var4.f25021c = obj;
                return q0Var4;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new q0(25, (g1.k) this.f25021c, (b0.m) this.f25022d, dVar);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new q0(26, (gp.w) this.f25021c, (gq.v) this.f25022d, dVar);
            case 27:
                q0 q0Var5 = new q0((gp.l1) this.f25022d, dVar, 27);
                q0Var5.f25021c = obj;
                return q0Var5;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                q0 q0Var6 = new q0((gq.u) this.f25022d, dVar, 28);
                q0Var6.f25021c = obj;
                return q0Var6;
            default:
                return new q0(29, (gq.u) this.f25021c, (com.google.firebase.datastorage.a) this.f25022d, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f25019a) {
            case 0:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                q0 q0Var = (q0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                q0Var.invokeSuspend(b0Var);
                return b0Var;
            case 6:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                q0 q0Var2 = (q0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                q0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 12:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 15:
                q0 q0Var3 = (q0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var3 = qy.b0.f48488a;
                q0Var3.invokeSuspend(b0Var3);
                return b0Var3;
            case 16:
                q0 q0Var4 = (q0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var4 = qy.b0.f48488a;
                q0Var4.invokeSuspend(b0Var4);
                return b0Var4;
            case 17:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 21:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 22:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 23:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((q0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 27:
                return ((q0) create((AzureAreaKey) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return ((q0) create((String) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((q0) create((qy.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:302:0x05ef A[PHI: r2 r3 r4
      0x05ef: PHI (r2v16 rz.b0) = (r2v23 rz.b0), (r2v25 rz.b0) binds: [B:307:0x060e, B:301:0x05ed] A[DONT_GENERATE, DONT_INLINE]
      0x05ef: PHI (r3v6 java.lang.Object) = (r3v12 java.lang.Object), (r3v13 java.lang.Object) binds: [B:307:0x060e, B:301:0x05ed] A[DONT_GENERATE, DONT_INLINE]
      0x05ef: PHI (r4v1 e6.q0) = (r4v5 e6.q0), (r4v0 e6.q0) binds: [B:307:0x060e, B:301:0x05ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:306:0x0602 A[Catch: all -> 0x05dd, TryCatch #6 {all -> 0x05dd, blocks: (B:293:0x05d9, B:304:0x05f8, B:306:0x0602, B:309:0x0611, B:300:0x05ea), top: B:432:0x05cf }] */
    /* JADX WARN: Code duplicated, block: B:308:0x0610  */
    /* JADX WARN: Code duplicated, block: B:315:0x063e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v139 */
    /* JADX WARN: Type inference failed for: r1v140 */
    /* JADX WARN: Type inference failed for: r1v36, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37, types: [rz.g1] */
    /* JADX WARN: Type inference failed for: r1v41, types: [rz.g1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:315:0x063e -> B:304:0x05f8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r59) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, int i11, Object obj2, vy.d dVar, int i12) {
        super(2, dVar);
        this.f25019a = i12;
        this.f25021c = obj;
        this.f25020b = i11;
        this.f25022d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, Context context, vy.d dVar, int i11) {
        super(2, dVar);
        this.f25019a = i11;
        this.f25022d = obj;
        this.f25021c = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f25019a = i11;
        this.f25022d = obj;
    }
}
