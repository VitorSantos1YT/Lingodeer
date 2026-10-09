package hu;

import bh.a1;
import bh.i0;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.DailyStreakHistory;
import com.lingodeer.data.model.DayStreakFinishedStatus;
import com.lingodeer.data.model.DayStreakWeeklyItem;
import com.lingodeer.data.model.DayStreakWeeklyItemStatus;
import com.lingodeer.data.model.SRSStatus;
import fr.e0;
import fr.o0;
import fr.x4;
import gr.s;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kr.y;
import uz.x0;
import vt.h1;
import vt.w0;
import vt.z0;
import wt.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends xy.i implements fz.e {
    public Object H;
    public Object K;
    public final /* synthetic */ Object L;
    public /* synthetic */ Object M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33796a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f33797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f33801f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f33802t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i11, vy.d dVar, wt.m mVar, b0 b0Var) {
        super(2, dVar);
        this.L = b0Var;
        this.f33800e = i11;
        this.M = mVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f33796a) {
            case 0:
                l lVar = new l((m) this.L, dVar);
                lVar.M = obj;
                return lVar;
            default:
                return new l(this.f33800e, dVar, (wt.m) this.M, (b0) this.L);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33796a) {
            case 0:
                return ((l) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x039f  */
    /* JADX WARN: Code duplicated, block: B:119:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:126:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:128:0x03db  */
    /* JADX WARN: Code duplicated, block: B:129:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:131:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:132:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:134:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:135:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:138:0x0406  */
    /* JADX WARN: Code duplicated, block: B:140:0x040a  */
    /* JADX WARN: Code duplicated, block: B:142:0x041a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x041f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0433  */
    /* JADX WARN: Code duplicated, block: B:151:0x045a  */
    /* JADX WARN: Code duplicated, block: B:155:0x047c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0480 A[PHI: r7 r8
      0x0480: PHI (r7v4 com.lingodeer.data.model.DayStreakFinishedStatus) = (r7v2 com.lingodeer.data.model.DayStreakFinishedStatus), (r7v5 com.lingodeer.data.model.DayStreakFinishedStatus) binds: [B:147:0x0431, B:156:0x047e] A[DONT_GENERATE, DONT_INLINE]
      0x0480: PHI (r8v5 ??) = (r8v4 ??), (r8v6 ??) binds: [B:147:0x0431, B:156:0x047e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01f4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:35:0x0113  */
    /* JADX WARN: Code duplicated, block: B:37:0x012e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0187  */
    /* JADX WARN: Code duplicated, block: B:52:0x0194  */
    /* JADX WARN: Code duplicated, block: B:53:0x019c  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:72:0x0227  */
    /* JADX WARN: Code duplicated, block: B:77:0x0250 A[LOOP:2: B:76:0x024e->B:77:0x0250, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x026a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0293  */
    /* JADX WARN: Code duplicated, block: B:85:0x0297  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List, vy.d] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objV;
        SimpleDateFormat simpleDateFormat;
        String str;
        Object objU;
        DayStreakFinishedStatus dayStreakFinishedStatus;
        Calendar calendar;
        List list;
        ?? arrayList;
        int i11;
        boolean z11;
        h1 h1Var;
        s sVar;
        int i12;
        DayStreakFinishedStatus dayStreakFinishedStatus2;
        ?? r9;
        m mVar;
        String str2;
        Iterator it;
        Object next;
        DailyStreakHistory dailyStreakHistory;
        List list2;
        DayStreakWeeklyItemStatus dayStreakWeeklyItemStatus;
        String type;
        DayStreakWeeklyItemStatus dayStreakWeeklyItemStatus2;
        ?? r11;
        DayStreakFinishedStatus dayStreakFinishedStatus3;
        q qVar;
        Object objU2;
        List list3;
        Object objU3;
        Map map;
        ArrayList arrayList2;
        Iterator it2;
        List listJ0;
        List list4;
        Object objB;
        ArrayList arrayListN;
        ArrayList arrayList3;
        int size;
        int i13;
        Object obj2;
        List list5;
        Set set;
        Object objA;
        ?? r12;
        Set setD;
        Object objM;
        List list6;
        List list7;
        w0 w0Var;
        String strK;
        Object objU4;
        List list8;
        String str3;
        List list9;
        Set set2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int size2;
        int i14;
        ArrayList arrayList6;
        int size3;
        int i15;
        List listJ1;
        Object objM2;
        List list10;
        Set set3;
        List list11;
        Object obj3;
        SRSStatus sRSStatus;
        int i16 = this.f33796a;
        Object obj4 = qy.b0.f48488a;
        Object obj5 = this.L;
        switch (i16) {
            case 0:
                m mVar2 = (m) obj5;
                gu.a aVar = mVar2.f33803a;
                uz.j jVar = (uz.j) this.M;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f33800e;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(obj);
                    gu.f fVar = (gu.f) aVar;
                    fVar.getClass();
                    gp.r rVar = new gp.r(new gu.b(fVar, null));
                    this.M = jVar;
                    this.f33800e = 1;
                    objV = x0.v(rVar, this);
                    if (objV != aVar2) {
                    }
                    return aVar2;
                }
                if (i17 == 1) {
                    com.bumptech.glide.e.F(obj);
                    objV = obj;
                } else {
                    if (i17 == 2) {
                        String str4 = this.f33798c;
                        calendar = (Calendar) this.H;
                        simpleDateFormat = (SimpleDateFormat) this.f33802t;
                        dayStreakFinishedStatus = (DayStreakFinishedStatus) this.f33801f;
                        com.bumptech.glide.e.F(obj);
                        str = str4;
                        objU = obj;
                        list = (List) ((qy.l) objU).f48495a;
                        arrayList = new ArrayList();
                        Objects.toString(list);
                        i11 = 0;
                        z11 = false;
                        while (i11 < 7) {
                            str2 = simpleDateFormat.format(calendar.getTime());
                            it = list.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    next = null;
                                }
                                dailyStreakHistory = (DailyStreakHistory) next;
                                if (dailyStreakHistory != null) {
                                    kotlin.jvm.internal.m.c(str2);
                                    if (kotlin.jvm.internal.m.a(dailyStreakHistory.getId(), str)) {
                                        dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK;
                                        list2 = list;
                                    } else {
                                        type = dailyStreakHistory.getType();
                                        list2 = list;
                                        if (kotlin.jvm.internal.m.a(type, "study")) {
                                            dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK;
                                        } else if (kotlin.jvm.internal.m.a(type, "saved")) {
                                            dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK_SHIELD;
                                        } else {
                                            dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK_RESET;
                                        }
                                    }
                                    arrayList.add(new DayStreakWeeklyItem(str2, i11, dayStreakWeeklyItemStatus2));
                                    if (i11 == 0) {
                                        z11 = true;
                                    }
                                } else {
                                    list2 = list;
                                    kotlin.jvm.internal.m.c(str2);
                                    kotlin.jvm.internal.m.c(str);
                                    if (str2.compareTo(str) < 0 || !z11) {
                                        dayStreakWeeklyItemStatus = DayStreakWeeklyItemStatus.NOT_STREAK;
                                    } else {
                                        dayStreakWeeklyItemStatus = DayStreakWeeklyItemStatus.STREAK_RESET;
                                    }
                                    arrayList.add(new DayStreakWeeklyItem(str2, i11, dayStreakWeeklyItemStatus));
                                }
                                calendar.add(6, 1);
                                i11++;
                                list = list2;
                            } while (!kotlin.jvm.internal.m.a(((DailyStreakHistory) next).getId(), str2));
                            dailyStreakHistory = (DailyStreakHistory) next;
                            if (dailyStreakHistory != null) {
                                kotlin.jvm.internal.m.c(str2);
                                if (kotlin.jvm.internal.m.a(dailyStreakHistory.getId(), str)) {
                                    dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK;
                                    list2 = list;
                                } else {
                                    type = dailyStreakHistory.getType();
                                    list2 = list;
                                    if (kotlin.jvm.internal.m.a(type, "study")) {
                                        dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK;
                                    } else if (kotlin.jvm.internal.m.a(type, "saved")) {
                                        dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK_SHIELD;
                                    } else {
                                        dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK_RESET;
                                    }
                                }
                                arrayList.add(new DayStreakWeeklyItem(str2, i11, dayStreakWeeklyItemStatus2));
                                if (i11 == 0) {
                                    z11 = true;
                                }
                            } else {
                                list2 = list;
                                kotlin.jvm.internal.m.c(str2);
                                kotlin.jvm.internal.m.c(str);
                                if (str2.compareTo(str) < 0) {
                                    dayStreakWeeklyItemStatus = DayStreakWeeklyItemStatus.NOT_STREAK;
                                } else {
                                    dayStreakWeeklyItemStatus = DayStreakWeeklyItemStatus.NOT_STREAK;
                                }
                                arrayList.add(new DayStreakWeeklyItem(str2, i11, dayStreakWeeklyItemStatus));
                            }
                            calendar.add(6, 1);
                            i11++;
                            list = list2;
                        }
                        if (dayStreakFinishedStatus != null) {
                            h1Var = mVar2.f33804b;
                            sVar = new s(dayStreakFinishedStatus, 8);
                            this.M = jVar;
                            this.f33801f = dayStreakFinishedStatus;
                            this.f33802t = null;
                            this.H = null;
                            this.f33798c = null;
                            this.f33797b = arrayList;
                            this.K = mVar2;
                            this.f33799d = 0;
                            this.f33800e = 3;
                            if (((x4) h1Var).u(sVar, this) != aVar2) {
                                i12 = 0;
                                dayStreakFinishedStatus2 = dayStreakFinishedStatus;
                                r9 = arrayList;
                                mVar = mVar2;
                                vt.c cVar = mVar.f33806d;
                                this.M = jVar;
                                this.f33801f = dayStreakFinishedStatus2;
                                this.f33802t = null;
                                this.H = null;
                                this.f33798c = null;
                                this.f33797b = r9;
                                this.K = null;
                                this.f33799d = i12;
                                this.f33800e = 4;
                                ((vt.d) cVar).n(this);
                                if (obj4 != aVar2) {
                                    r11 = r9;
                                    dayStreakFinishedStatus3 = dayStreakFinishedStatus2;
                                }
                            }
                        } else {
                            qVar = new q(dayStreakFinishedStatus, arrayList, ((o0) mVar2.f33805c).f27733a.isStreakEnable);
                            this.M = null;
                            this.f33801f = null;
                            this.f33802t = null;
                            this.H = null;
                            this.f33798c = null;
                            this.f33797b = null;
                            this.K = null;
                            this.f33800e = 5;
                            if (jVar.emit(qVar, this) != aVar2) {
                                return obj4;
                            }
                        }
                        return aVar2;
                    }
                    if (i17 == 3) {
                        i12 = this.f33799d;
                        mVar = (m) this.K;
                        List list12 = this.f33797b;
                        dayStreakFinishedStatus2 = (DayStreakFinishedStatus) this.f33801f;
                        com.bumptech.glide.e.F(obj);
                        r9 = list12;
                        vt.c cVar2 = mVar.f33806d;
                        this.M = jVar;
                        this.f33801f = dayStreakFinishedStatus2;
                        this.f33802t = null;
                        this.H = null;
                        this.f33798c = null;
                        this.f33797b = r9;
                        this.K = null;
                        this.f33799d = i12;
                        this.f33800e = 4;
                        ((vt.d) cVar2).n(this);
                        if (obj4 != aVar2) {
                            r11 = r9;
                            dayStreakFinishedStatus3 = dayStreakFinishedStatus2;
                        }
                        return aVar2;
                    }
                    if (i17 != 4) {
                        if (i17 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                        return obj4;
                    }
                    List list13 = this.f33797b;
                    dayStreakFinishedStatus3 = (DayStreakFinishedStatus) this.f33801f;
                    com.bumptech.glide.e.F(obj);
                    r11 = list13;
                }
                arrayList = r11;
                dayStreakFinishedStatus = dayStreakFinishedStatus3;
                qVar = new q(dayStreakFinishedStatus, arrayList, ((o0) mVar2.f33805c).f27733a.isStreakEnable);
                this.M = null;
                this.f33801f = null;
                this.f33802t = null;
                this.H = null;
                this.f33798c = null;
                this.f33797b = null;
                this.K = null;
                this.f33800e = 5;
                if (jVar.emit(qVar, this) != aVar2) {
                    return obj4;
                }
                return aVar2;
                DayStreakFinishedStatus dayStreakFinishedStatus4 = (DayStreakFinishedStatus) objV;
                Locale locale = Locale.US;
                simpleDateFormat = new SimpleDateFormat("yyyyMMdd", locale);
                Calendar calendar2 = Calendar.getInstance(locale);
                calendar2.setFirstDayOfWeek(1);
                str = simpleDateFormat.format(calendar2.getTime());
                calendar2.set(7, 1);
                gu.f fVar2 = (gu.f) aVar;
                no.g gVar = new no.g(((e0) fVar2.f29857a).b(), ((x4) fVar2.f29858b).n(), new gu.d(fVar2, (vy.d) null));
                this.M = jVar;
                this.f33801f = dayStreakFinishedStatus4;
                this.f33802t = simpleDateFormat;
                this.H = calendar2;
                this.f33798c = str;
                this.f33800e = 2;
                objU = x0.u(gVar, this);
                if (objU != aVar2) {
                    dayStreakFinishedStatus = dayStreakFinishedStatus4;
                    calendar = calendar2;
                    list = (List) ((qy.l) objU).f48495a;
                    arrayList = new ArrayList();
                    Objects.toString(list);
                    i11 = 0;
                    z11 = false;
                    while (i11 < 7) {
                        str2 = simpleDateFormat.format(calendar.getTime());
                        it = list.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            dailyStreakHistory = (DailyStreakHistory) next;
                            if (dailyStreakHistory != null) {
                                kotlin.jvm.internal.m.c(str2);
                                if (kotlin.jvm.internal.m.a(dailyStreakHistory.getId(), str)) {
                                    dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK;
                                    list2 = list;
                                } else {
                                    type = dailyStreakHistory.getType();
                                    list2 = list;
                                    if (kotlin.jvm.internal.m.a(type, "study")) {
                                        dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK;
                                    } else if (kotlin.jvm.internal.m.a(type, "saved")) {
                                        dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK_SHIELD;
                                    } else {
                                        dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK_RESET;
                                    }
                                }
                                arrayList.add(new DayStreakWeeklyItem(str2, i11, dayStreakWeeklyItemStatus2));
                                if (i11 == 0) {
                                    z11 = true;
                                }
                            } else {
                                list2 = list;
                                kotlin.jvm.internal.m.c(str2);
                                kotlin.jvm.internal.m.c(str);
                                if (str2.compareTo(str) < 0) {
                                    dayStreakWeeklyItemStatus = DayStreakWeeklyItemStatus.NOT_STREAK;
                                } else {
                                    dayStreakWeeklyItemStatus = DayStreakWeeklyItemStatus.NOT_STREAK;
                                }
                                arrayList.add(new DayStreakWeeklyItem(str2, i11, dayStreakWeeklyItemStatus));
                            }
                            calendar.add(6, 1);
                            i11++;
                            list = list2;
                        } while (!kotlin.jvm.internal.m.a(((DailyStreakHistory) next).getId(), str2));
                        dailyStreakHistory = (DailyStreakHistory) next;
                        if (dailyStreakHistory != null) {
                            kotlin.jvm.internal.m.c(str2);
                            if (kotlin.jvm.internal.m.a(dailyStreakHistory.getId(), str)) {
                                dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK;
                                list2 = list;
                            } else {
                                type = dailyStreakHistory.getType();
                                list2 = list;
                                if (kotlin.jvm.internal.m.a(type, "study")) {
                                    dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK;
                                } else if (kotlin.jvm.internal.m.a(type, "saved")) {
                                    dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK_SHIELD;
                                } else {
                                    dayStreakWeeklyItemStatus2 = DayStreakWeeklyItemStatus.STREAK_RESET;
                                }
                            }
                            arrayList.add(new DayStreakWeeklyItem(str2, i11, dayStreakWeeklyItemStatus2));
                            if (i11 == 0) {
                                z11 = true;
                            }
                        } else {
                            list2 = list;
                            kotlin.jvm.internal.m.c(str2);
                            kotlin.jvm.internal.m.c(str);
                            if (str2.compareTo(str) < 0) {
                                dayStreakWeeklyItemStatus = DayStreakWeeklyItemStatus.NOT_STREAK;
                            } else {
                                dayStreakWeeklyItemStatus = DayStreakWeeklyItemStatus.NOT_STREAK;
                            }
                            arrayList.add(new DayStreakWeeklyItem(str2, i11, dayStreakWeeklyItemStatus));
                        }
                        calendar.add(6, 1);
                        i11++;
                        list = list2;
                    }
                    if (dayStreakFinishedStatus != null) {
                        h1Var = mVar2.f33804b;
                        sVar = new s(dayStreakFinishedStatus, 8);
                        this.M = jVar;
                        this.f33801f = dayStreakFinishedStatus;
                        this.f33802t = null;
                        this.H = null;
                        this.f33798c = null;
                        this.f33797b = arrayList;
                        this.K = mVar2;
                        this.f33799d = 0;
                        this.f33800e = 3;
                        if (((x4) h1Var).u(sVar, this) != aVar2) {
                            i12 = 0;
                            dayStreakFinishedStatus2 = dayStreakFinishedStatus;
                            r9 = arrayList;
                            mVar = mVar2;
                            vt.c cVar3 = mVar.f33806d;
                            this.M = jVar;
                            this.f33801f = dayStreakFinishedStatus2;
                            this.f33802t = null;
                            this.H = null;
                            this.f33798c = null;
                            this.f33797b = r9;
                            this.K = null;
                            this.f33799d = i12;
                            this.f33800e = 4;
                            ((vt.d) cVar3).n(this);
                            if (obj4 != aVar2) {
                                r11 = r9;
                                dayStreakFinishedStatus3 = dayStreakFinishedStatus2;
                                arrayList = r11;
                                dayStreakFinishedStatus = dayStreakFinishedStatus3;
                                qVar = new q(dayStreakFinishedStatus, arrayList, ((o0) mVar2.f33805c).f27733a.isStreakEnable);
                                this.M = null;
                                this.f33801f = null;
                                this.f33802t = null;
                                this.H = null;
                                this.f33798c = null;
                                this.f33797b = null;
                                this.K = null;
                                this.f33800e = 5;
                                if (jVar.emit(qVar, this) != aVar2) {
                                    return obj4;
                                }
                            }
                        }
                    } else {
                        qVar = new q(dayStreakFinishedStatus, arrayList, ((o0) mVar2.f33805c).f27733a.isStreakEnable);
                        this.M = null;
                        this.f33801f = null;
                        this.f33802t = null;
                        this.H = null;
                        this.f33798c = null;
                        this.f33797b = null;
                        this.K = null;
                        this.f33800e = 5;
                        if (jVar.emit(qVar, this) != aVar2) {
                            return obj4;
                        }
                    }
                }
                return aVar2;
            default:
                wt.m mVar3 = (wt.m) this.M;
                int i18 = this.f33800e;
                b0 b0Var = (b0) obj5;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                switch (this.f33799d) {
                    case 0:
                        com.bumptech.glide.e.F(obj);
                        if (((o0) b0Var.f55237b).f27733a.keyLanguage != i18) {
                            return new wt.e0(0, 0);
                        }
                        y yVar = mVar3.f55323p;
                        this.f33799d = 1;
                        objU2 = x0.u(yVar, this);
                        if (objU2 == aVar3) {
                            return aVar3;
                        }
                        list3 = (List) objU2;
                        if (list3.isEmpty()) {
                            map = ry.s.f50855a;
                        } else {
                            mVar3.getClass();
                            gp.r rVarG = ((a1) mVar3.f55311c).g(list3);
                            this.f33797b = list3;
                            this.f33799d = 2;
                            objU3 = x0.u(rVarG, this);
                            if (objU3 == aVar3) {
                                return aVar3;
                            }
                            map = (Map) objU3;
                        }
                        arrayList2 = new ArrayList();
                        it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayListN = ks.b.n(((CourseUnit) it2.next()).getLessonList());
                            arrayList3 = new ArrayList();
                            size = arrayListN.size();
                            i13 = 0;
                            while (i13 < size) {
                                obj2 = arrayListN.get(i13);
                                i13++;
                                ArrayList arrayList7 = arrayListN;
                                if (map.containsKey(new Long(((Number) obj2).longValue()))) {
                                    arrayList3.add(obj2);
                                }
                                arrayListN = arrayList7;
                            }
                            ry.m.d0(arrayList2, arrayList3);
                        }
                        listJ0 = ry.m.j0(arrayList2);
                        list4 = null;
                        this.f33797b = null;
                        this.f33801f = listJ0;
                        this.f33799d = 3;
                        objB = b0.b(b0Var, mVar3, listJ0, i18, this);
                        if (objB == aVar3) {
                            return aVar3;
                        }
                        list5 = listJ0;
                        set = (Set) objB;
                        this.f33797b = list4;
                        this.f33801f = list5;
                        this.f33802t = set;
                        this.f33799d = 4;
                        objA = b0.a(b0Var, i18, this);
                        r12 = list4;
                        if (objA == aVar3) {
                            return aVar3;
                        }
                        setD = qx.b.D(set, (Iterable) objA);
                        this.f33797b = r12;
                        this.f33801f = list5;
                        this.f33802t = setD;
                        this.f33799d = 5;
                        b0Var.getClass();
                        yz.f fVar3 = rz.o0.f50940a;
                        objM = rz.e0.M(yz.e.f58387a, new cj.b(i18, (vy.d) r12, mVar3, b0Var), this);
                        if (objM == aVar3) {
                            return aVar3;
                        }
                        list6 = list5;
                        list7 = (List) objM;
                        if (((o0) b0Var.f55237b).f27733a.keyLanguage != i18) {
                            return new wt.e0(0, 0);
                        }
                        if (!list7.isEmpty()) {
                            w0Var = b0Var.f55236a;
                            this.f33797b = null;
                            this.f33801f = list6;
                            this.f33802t = setD;
                            this.H = list7;
                            this.f33799d = 6;
                            if (((z0) w0Var).e(list7, this) == aVar3) {
                                return aVar3;
                            }
                        }
                        strK = xt.d.k(i18);
                        i0 i0VarA = ((z0) b0Var.f55236a).a();
                        this.f33797b = null;
                        this.f33801f = list6;
                        this.f33802t = setD;
                        this.H = list7;
                        this.f33798c = strK;
                        this.f33799d = 7;
                        objU4 = x0.u(i0VarA, this);
                        if (objU4 == aVar3) {
                            return aVar3;
                        }
                        Set set4 = setD;
                        list8 = list7;
                        str3 = strK;
                        list9 = list6;
                        set2 = set4;
                        arrayList4 = new ArrayList();
                        for (Object obj6 : (Iterable) objU4) {
                            sRSStatus = (SRSStatus) obj6;
                            if (!kotlin.jvm.internal.m.a(sRSStatus.getLan(), str3) && kotlin.jvm.internal.m.a(sRSStatus.getType(), "course")) {
                                arrayList4.add(obj6);
                            }
                        }
                        arrayList5 = new ArrayList();
                        size2 = arrayList4.size();
                        i14 = 0;
                        while (i14 < size2) {
                            obj3 = arrayList4.get(i14);
                            i14++;
                            if (!set2.contains(((SRSStatus) obj3).getId())) {
                                arrayList5.add(obj3);
                            }
                        }
                        arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
                        size3 = arrayList5.size();
                        i15 = 0;
                        while (i15 < size3) {
                            Object obj7 = arrayList5.get(i15);
                            i15++;
                            arrayList6.add(((SRSStatus) obj7).getId());
                        }
                        listJ1 = ry.m.j0(arrayList6);
                        if (!listJ1.isEmpty()) {
                            w0 w0Var2 = b0Var.f55236a;
                            this.f33797b = null;
                            this.f33801f = list9;
                            this.f33802t = set2;
                            this.H = list8;
                            this.f33798c = null;
                            this.K = listJ1;
                            this.f33799d = 8;
                            yz.f fVar4 = rz.o0.f50940a;
                            objM2 = rz.e0.M(yz.e.f58387a, new cj.b(listJ1, (z0) w0Var2, (vy.d) null, 8), this);
                            if (objM2 == wy.a.COROUTINE_SUSPENDED) {
                                obj4 = objM2;
                            }
                            if (obj4 == aVar3) {
                                return aVar3;
                            }
                            list10 = list8;
                            set3 = set2;
                            list11 = list9;
                            list9 = list11;
                            set2 = set3;
                            list8 = list10;
                        }
                        list9.size();
                        set2.size();
                        list8.size();
                        listJ1.size();
                        return new wt.e0(list8.size(), listJ1.size());
                    case 1:
                        com.bumptech.glide.e.F(obj);
                        objU2 = obj;
                        list3 = (List) objU2;
                        if (list3.isEmpty()) {
                            map = ry.s.f50855a;
                        } else {
                            mVar3.getClass();
                            gp.r rVarG2 = ((a1) mVar3.f55311c).g(list3);
                            this.f33797b = list3;
                            this.f33799d = 2;
                            objU3 = x0.u(rVarG2, this);
                            if (objU3 == aVar3) {
                                return aVar3;
                            }
                            map = (Map) objU3;
                        }
                        arrayList2 = new ArrayList();
                        it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayListN = ks.b.n(((CourseUnit) it2.next()).getLessonList());
                            arrayList3 = new ArrayList();
                            size = arrayListN.size();
                            i13 = 0;
                            while (i13 < size) {
                                obj2 = arrayListN.get(i13);
                                i13++;
                                ArrayList arrayList8 = arrayListN;
                                if (map.containsKey(new Long(((Number) obj2).longValue()))) {
                                    arrayList3.add(obj2);
                                }
                                arrayListN = arrayList8;
                            }
                            ry.m.d0(arrayList2, arrayList3);
                        }
                        listJ0 = ry.m.j0(arrayList2);
                        list4 = null;
                        this.f33797b = null;
                        this.f33801f = listJ0;
                        this.f33799d = 3;
                        objB = b0.b(b0Var, mVar3, listJ0, i18, this);
                        if (objB == aVar3) {
                            return aVar3;
                        }
                        list5 = listJ0;
                        set = (Set) objB;
                        this.f33797b = list4;
                        this.f33801f = list5;
                        this.f33802t = set;
                        this.f33799d = 4;
                        objA = b0.a(b0Var, i18, this);
                        r12 = list4;
                        if (objA == aVar3) {
                            return aVar3;
                        }
                        setD = qx.b.D(set, (Iterable) objA);
                        this.f33797b = r12;
                        this.f33801f = list5;
                        this.f33802t = setD;
                        this.f33799d = 5;
                        b0Var.getClass();
                        yz.f fVar5 = rz.o0.f50940a;
                        objM = rz.e0.M(yz.e.f58387a, new cj.b(i18, (vy.d) r12, mVar3, b0Var), this);
                        if (objM == aVar3) {
                            return aVar3;
                        }
                        list6 = list5;
                        list7 = (List) objM;
                        if (((o0) b0Var.f55237b).f27733a.keyLanguage != i18) {
                            return new wt.e0(0, 0);
                        }
                        if (!list7.isEmpty()) {
                            w0Var = b0Var.f55236a;
                            this.f33797b = null;
                            this.f33801f = list6;
                            this.f33802t = setD;
                            this.H = list7;
                            this.f33799d = 6;
                            if (((z0) w0Var).e(list7, this) == aVar3) {
                                return aVar3;
                            }
                        }
                        strK = xt.d.k(i18);
                        i0 i0VarA2 = ((z0) b0Var.f55236a).a();
                        this.f33797b = null;
                        this.f33801f = list6;
                        this.f33802t = setD;
                        this.H = list7;
                        this.f33798c = strK;
                        this.f33799d = 7;
                        objU4 = x0.u(i0VarA2, this);
                        if (objU4 == aVar3) {
                            return aVar3;
                        }
                        Set set5 = setD;
                        list8 = list7;
                        str3 = strK;
                        list9 = list6;
                        set2 = set5;
                        arrayList4 = new ArrayList();
                        while (r6.hasNext()) {
                            sRSStatus = (SRSStatus) obj6;
                            if (!kotlin.jvm.internal.m.a(sRSStatus.getLan(), str3)) {
                            }
                        }
                        arrayList5 = new ArrayList();
                        size2 = arrayList4.size();
                        i14 = 0;
                        while (i14 < size2) {
                            obj3 = arrayList4.get(i14);
                            i14++;
                            if (!set2.contains(((SRSStatus) obj3).getId())) {
                                arrayList5.add(obj3);
                            }
                        }
                        arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
                        size3 = arrayList5.size();
                        i15 = 0;
                        while (i15 < size3) {
                            Object obj8 = arrayList5.get(i15);
                            i15++;
                            arrayList6.add(((SRSStatus) obj8).getId());
                        }
                        listJ1 = ry.m.j0(arrayList6);
                        if (!listJ1.isEmpty()) {
                            w0 w0Var3 = b0Var.f55236a;
                            this.f33797b = null;
                            this.f33801f = list9;
                            this.f33802t = set2;
                            this.H = list8;
                            this.f33798c = null;
                            this.K = listJ1;
                            this.f33799d = 8;
                            yz.f fVar6 = rz.o0.f50940a;
                            objM2 = rz.e0.M(yz.e.f58387a, new cj.b(listJ1, (z0) w0Var3, (vy.d) null, 8), this);
                            if (objM2 == wy.a.COROUTINE_SUSPENDED) {
                                obj4 = objM2;
                            }
                            if (obj4 == aVar3) {
                                return aVar3;
                            }
                            list10 = list8;
                            set3 = set2;
                            list11 = list9;
                            list9 = list11;
                            set2 = set3;
                            list8 = list10;
                        }
                        list9.size();
                        set2.size();
                        list8.size();
                        listJ1.size();
                        return new wt.e0(list8.size(), listJ1.size());
                    case 2:
                        list3 = this.f33797b;
                        com.bumptech.glide.e.F(obj);
                        objU3 = obj;
                        map = (Map) objU3;
                        arrayList2 = new ArrayList();
                        it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayListN = ks.b.n(((CourseUnit) it2.next()).getLessonList());
                            arrayList3 = new ArrayList();
                            size = arrayListN.size();
                            i13 = 0;
                            while (i13 < size) {
                                obj2 = arrayListN.get(i13);
                                i13++;
                                ArrayList arrayList9 = arrayListN;
                                if (map.containsKey(new Long(((Number) obj2).longValue()))) {
                                    arrayList3.add(obj2);
                                }
                                arrayListN = arrayList9;
                            }
                            ry.m.d0(arrayList2, arrayList3);
                        }
                        listJ0 = ry.m.j0(arrayList2);
                        list4 = null;
                        this.f33797b = null;
                        this.f33801f = listJ0;
                        this.f33799d = 3;
                        objB = b0.b(b0Var, mVar3, listJ0, i18, this);
                        if (objB == aVar3) {
                            return aVar3;
                        }
                        list5 = listJ0;
                        set = (Set) objB;
                        this.f33797b = list4;
                        this.f33801f = list5;
                        this.f33802t = set;
                        this.f33799d = 4;
                        objA = b0.a(b0Var, i18, this);
                        r12 = list4;
                        if (objA == aVar3) {
                            return aVar3;
                        }
                        setD = qx.b.D(set, (Iterable) objA);
                        this.f33797b = r12;
                        this.f33801f = list5;
                        this.f33802t = setD;
                        this.f33799d = 5;
                        b0Var.getClass();
                        yz.f fVar7 = rz.o0.f50940a;
                        objM = rz.e0.M(yz.e.f58387a, new cj.b(i18, (vy.d) r12, mVar3, b0Var), this);
                        if (objM == aVar3) {
                            return aVar3;
                        }
                        list6 = list5;
                        list7 = (List) objM;
                        if (((o0) b0Var.f55237b).f27733a.keyLanguage != i18) {
                            return new wt.e0(0, 0);
                        }
                        if (!list7.isEmpty()) {
                            w0Var = b0Var.f55236a;
                            this.f33797b = null;
                            this.f33801f = list6;
                            this.f33802t = setD;
                            this.H = list7;
                            this.f33799d = 6;
                            if (((z0) w0Var).e(list7, this) == aVar3) {
                                return aVar3;
                            }
                        }
                        strK = xt.d.k(i18);
                        i0 i0VarA3 = ((z0) b0Var.f55236a).a();
                        this.f33797b = null;
                        this.f33801f = list6;
                        this.f33802t = setD;
                        this.H = list7;
                        this.f33798c = strK;
                        this.f33799d = 7;
                        objU4 = x0.u(i0VarA3, this);
                        if (objU4 == aVar3) {
                            return aVar3;
                        }
                        Set set6 = setD;
                        list8 = list7;
                        str3 = strK;
                        list9 = list6;
                        set2 = set6;
                        arrayList4 = new ArrayList();
                        while (r6.hasNext()) {
                            sRSStatus = (SRSStatus) obj6;
                            if (!kotlin.jvm.internal.m.a(sRSStatus.getLan(), str3)) {
                            }
                        }
                        arrayList5 = new ArrayList();
                        size2 = arrayList4.size();
                        i14 = 0;
                        while (i14 < size2) {
                            obj3 = arrayList4.get(i14);
                            i14++;
                            if (!set2.contains(((SRSStatus) obj3).getId())) {
                                arrayList5.add(obj3);
                            }
                        }
                        arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
                        size3 = arrayList5.size();
                        i15 = 0;
                        while (i15 < size3) {
                            Object obj9 = arrayList5.get(i15);
                            i15++;
                            arrayList6.add(((SRSStatus) obj9).getId());
                        }
                        listJ1 = ry.m.j0(arrayList6);
                        if (!listJ1.isEmpty()) {
                            w0 w0Var4 = b0Var.f55236a;
                            this.f33797b = null;
                            this.f33801f = list9;
                            this.f33802t = set2;
                            this.H = list8;
                            this.f33798c = null;
                            this.K = listJ1;
                            this.f33799d = 8;
                            yz.f fVar8 = rz.o0.f50940a;
                            objM2 = rz.e0.M(yz.e.f58387a, new cj.b(listJ1, (z0) w0Var4, (vy.d) null, 8), this);
                            if (objM2 == wy.a.COROUTINE_SUSPENDED) {
                                obj4 = objM2;
                            }
                            if (obj4 == aVar3) {
                                return aVar3;
                            }
                            list10 = list8;
                            set3 = set2;
                            list11 = list9;
                            list9 = list11;
                            set2 = set3;
                            list8 = list10;
                        }
                        list9.size();
                        set2.size();
                        list8.size();
                        listJ1.size();
                        return new wt.e0(list8.size(), listJ1.size());
                    case 3:
                        listJ0 = (List) this.f33801f;
                        com.bumptech.glide.e.F(obj);
                        objB = obj;
                        list4 = null;
                        list5 = listJ0;
                        set = (Set) objB;
                        this.f33797b = list4;
                        this.f33801f = list5;
                        this.f33802t = set;
                        this.f33799d = 4;
                        objA = b0.a(b0Var, i18, this);
                        r12 = list4;
                        if (objA == aVar3) {
                            return aVar3;
                        }
                        setD = qx.b.D(set, (Iterable) objA);
                        this.f33797b = r12;
                        this.f33801f = list5;
                        this.f33802t = setD;
                        this.f33799d = 5;
                        b0Var.getClass();
                        yz.f fVar9 = rz.o0.f50940a;
                        objM = rz.e0.M(yz.e.f58387a, new cj.b(i18, (vy.d) r12, mVar3, b0Var), this);
                        if (objM == aVar3) {
                            return aVar3;
                        }
                        list6 = list5;
                        list7 = (List) objM;
                        if (((o0) b0Var.f55237b).f27733a.keyLanguage != i18) {
                            return new wt.e0(0, 0);
                        }
                        if (!list7.isEmpty()) {
                            w0Var = b0Var.f55236a;
                            this.f33797b = null;
                            this.f33801f = list6;
                            this.f33802t = setD;
                            this.H = list7;
                            this.f33799d = 6;
                            if (((z0) w0Var).e(list7, this) == aVar3) {
                                return aVar3;
                            }
                        }
                        strK = xt.d.k(i18);
                        i0 i0VarA4 = ((z0) b0Var.f55236a).a();
                        this.f33797b = null;
                        this.f33801f = list6;
                        this.f33802t = setD;
                        this.H = list7;
                        this.f33798c = strK;
                        this.f33799d = 7;
                        objU4 = x0.u(i0VarA4, this);
                        if (objU4 == aVar3) {
                            return aVar3;
                        }
                        Set set7 = setD;
                        list8 = list7;
                        str3 = strK;
                        list9 = list6;
                        set2 = set7;
                        arrayList4 = new ArrayList();
                        while (r6.hasNext()) {
                            sRSStatus = (SRSStatus) obj6;
                            if (!kotlin.jvm.internal.m.a(sRSStatus.getLan(), str3)) {
                            }
                        }
                        arrayList5 = new ArrayList();
                        size2 = arrayList4.size();
                        i14 = 0;
                        while (i14 < size2) {
                            obj3 = arrayList4.get(i14);
                            i14++;
                            if (!set2.contains(((SRSStatus) obj3).getId())) {
                                arrayList5.add(obj3);
                            }
                        }
                        arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
                        size3 = arrayList5.size();
                        i15 = 0;
                        while (i15 < size3) {
                            Object obj10 = arrayList5.get(i15);
                            i15++;
                            arrayList6.add(((SRSStatus) obj10).getId());
                        }
                        listJ1 = ry.m.j0(arrayList6);
                        if (!listJ1.isEmpty()) {
                            w0 w0Var5 = b0Var.f55236a;
                            this.f33797b = null;
                            this.f33801f = list9;
                            this.f33802t = set2;
                            this.H = list8;
                            this.f33798c = null;
                            this.K = listJ1;
                            this.f33799d = 8;
                            yz.f fVar10 = rz.o0.f50940a;
                            objM2 = rz.e0.M(yz.e.f58387a, new cj.b(listJ1, (z0) w0Var5, (vy.d) null, 8), this);
                            if (objM2 == wy.a.COROUTINE_SUSPENDED) {
                                obj4 = objM2;
                            }
                            if (obj4 == aVar3) {
                                return aVar3;
                            }
                            list10 = list8;
                            set3 = set2;
                            list11 = list9;
                            list9 = list11;
                            set2 = set3;
                            list8 = list10;
                        }
                        list9.size();
                        set2.size();
                        list8.size();
                        listJ1.size();
                        return new wt.e0(list8.size(), listJ1.size());
                    case 4:
                        set = (Set) this.f33802t;
                        list5 = (List) this.f33801f;
                        com.bumptech.glide.e.F(obj);
                        objA = obj;
                        r12 = 0;
                        setD = qx.b.D(set, (Iterable) objA);
                        this.f33797b = r12;
                        this.f33801f = list5;
                        this.f33802t = setD;
                        this.f33799d = 5;
                        b0Var.getClass();
                        yz.f fVar11 = rz.o0.f50940a;
                        objM = rz.e0.M(yz.e.f58387a, new cj.b(i18, (vy.d) r12, mVar3, b0Var), this);
                        if (objM == aVar3) {
                            return aVar3;
                        }
                        list6 = list5;
                        list7 = (List) objM;
                        if (((o0) b0Var.f55237b).f27733a.keyLanguage != i18) {
                            return new wt.e0(0, 0);
                        }
                        if (!list7.isEmpty()) {
                            w0Var = b0Var.f55236a;
                            this.f33797b = null;
                            this.f33801f = list6;
                            this.f33802t = setD;
                            this.H = list7;
                            this.f33799d = 6;
                            if (((z0) w0Var).e(list7, this) == aVar3) {
                                return aVar3;
                            }
                        }
                        strK = xt.d.k(i18);
                        i0 i0VarA5 = ((z0) b0Var.f55236a).a();
                        this.f33797b = null;
                        this.f33801f = list6;
                        this.f33802t = setD;
                        this.H = list7;
                        this.f33798c = strK;
                        this.f33799d = 7;
                        objU4 = x0.u(i0VarA5, this);
                        if (objU4 == aVar3) {
                            return aVar3;
                        }
                        Set set8 = setD;
                        list8 = list7;
                        str3 = strK;
                        list9 = list6;
                        set2 = set8;
                        arrayList4 = new ArrayList();
                        while (r6.hasNext()) {
                            sRSStatus = (SRSStatus) obj6;
                            if (!kotlin.jvm.internal.m.a(sRSStatus.getLan(), str3)) {
                            }
                        }
                        arrayList5 = new ArrayList();
                        size2 = arrayList4.size();
                        i14 = 0;
                        while (i14 < size2) {
                            obj3 = arrayList4.get(i14);
                            i14++;
                            if (!set2.contains(((SRSStatus) obj3).getId())) {
                                arrayList5.add(obj3);
                            }
                        }
                        arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
                        size3 = arrayList5.size();
                        i15 = 0;
                        while (i15 < size3) {
                            Object obj11 = arrayList5.get(i15);
                            i15++;
                            arrayList6.add(((SRSStatus) obj11).getId());
                        }
                        listJ1 = ry.m.j0(arrayList6);
                        if (!listJ1.isEmpty()) {
                            w0 w0Var6 = b0Var.f55236a;
                            this.f33797b = null;
                            this.f33801f = list9;
                            this.f33802t = set2;
                            this.H = list8;
                            this.f33798c = null;
                            this.K = listJ1;
                            this.f33799d = 8;
                            yz.f fVar12 = rz.o0.f50940a;
                            objM2 = rz.e0.M(yz.e.f58387a, new cj.b(listJ1, (z0) w0Var6, (vy.d) null, 8), this);
                            if (objM2 == wy.a.COROUTINE_SUSPENDED) {
                                obj4 = objM2;
                            }
                            if (obj4 == aVar3) {
                                return aVar3;
                            }
                            list10 = list8;
                            set3 = set2;
                            list11 = list9;
                            list9 = list11;
                            set2 = set3;
                            list8 = list10;
                        }
                        list9.size();
                        set2.size();
                        list8.size();
                        listJ1.size();
                        return new wt.e0(list8.size(), listJ1.size());
                    case 5:
                        Set set9 = (Set) this.f33802t;
                        List list14 = (List) this.f33801f;
                        com.bumptech.glide.e.F(obj);
                        list6 = list14;
                        setD = set9;
                        objM = obj;
                        list7 = (List) objM;
                        if (((o0) b0Var.f55237b).f27733a.keyLanguage != i18) {
                            return new wt.e0(0, 0);
                        }
                        if (!list7.isEmpty()) {
                            w0Var = b0Var.f55236a;
                            this.f33797b = null;
                            this.f33801f = list6;
                            this.f33802t = setD;
                            this.H = list7;
                            this.f33799d = 6;
                            if (((z0) w0Var).e(list7, this) == aVar3) {
                                return aVar3;
                            }
                        }
                        strK = xt.d.k(i18);
                        i0 i0VarA6 = ((z0) b0Var.f55236a).a();
                        this.f33797b = null;
                        this.f33801f = list6;
                        this.f33802t = setD;
                        this.H = list7;
                        this.f33798c = strK;
                        this.f33799d = 7;
                        objU4 = x0.u(i0VarA6, this);
                        if (objU4 == aVar3) {
                            return aVar3;
                        }
                        Set set10 = setD;
                        list8 = list7;
                        str3 = strK;
                        list9 = list6;
                        set2 = set10;
                        arrayList4 = new ArrayList();
                        while (r6.hasNext()) {
                            sRSStatus = (SRSStatus) obj6;
                            if (!kotlin.jvm.internal.m.a(sRSStatus.getLan(), str3)) {
                            }
                        }
                        arrayList5 = new ArrayList();
                        size2 = arrayList4.size();
                        i14 = 0;
                        while (i14 < size2) {
                            obj3 = arrayList4.get(i14);
                            i14++;
                            if (!set2.contains(((SRSStatus) obj3).getId())) {
                                arrayList5.add(obj3);
                            }
                        }
                        arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
                        size3 = arrayList5.size();
                        i15 = 0;
                        while (i15 < size3) {
                            Object obj12 = arrayList5.get(i15);
                            i15++;
                            arrayList6.add(((SRSStatus) obj12).getId());
                        }
                        listJ1 = ry.m.j0(arrayList6);
                        if (!listJ1.isEmpty()) {
                            w0 w0Var7 = b0Var.f55236a;
                            this.f33797b = null;
                            this.f33801f = list9;
                            this.f33802t = set2;
                            this.H = list8;
                            this.f33798c = null;
                            this.K = listJ1;
                            this.f33799d = 8;
                            yz.f fVar13 = rz.o0.f50940a;
                            objM2 = rz.e0.M(yz.e.f58387a, new cj.b(listJ1, (z0) w0Var7, (vy.d) null, 8), this);
                            if (objM2 == wy.a.COROUTINE_SUSPENDED) {
                                obj4 = objM2;
                            }
                            if (obj4 == aVar3) {
                                return aVar3;
                            }
                            list10 = list8;
                            set3 = set2;
                            list11 = list9;
                            list9 = list11;
                            set2 = set3;
                            list8 = list10;
                        }
                        list9.size();
                        set2.size();
                        list8.size();
                        listJ1.size();
                        return new wt.e0(list8.size(), listJ1.size());
                    case 6:
                        list7 = (List) this.H;
                        setD = (Set) this.f33802t;
                        list6 = (List) this.f33801f;
                        com.bumptech.glide.e.F(obj);
                        strK = xt.d.k(i18);
                        i0 i0VarA7 = ((z0) b0Var.f55236a).a();
                        this.f33797b = null;
                        this.f33801f = list6;
                        this.f33802t = setD;
                        this.H = list7;
                        this.f33798c = strK;
                        this.f33799d = 7;
                        objU4 = x0.u(i0VarA7, this);
                        if (objU4 == aVar3) {
                            return aVar3;
                        }
                        Set set11 = setD;
                        list8 = list7;
                        str3 = strK;
                        list9 = list6;
                        set2 = set11;
                        arrayList4 = new ArrayList();
                        while (r6.hasNext()) {
                            sRSStatus = (SRSStatus) obj6;
                            if (!kotlin.jvm.internal.m.a(sRSStatus.getLan(), str3)) {
                            }
                        }
                        arrayList5 = new ArrayList();
                        size2 = arrayList4.size();
                        i14 = 0;
                        while (i14 < size2) {
                            obj3 = arrayList4.get(i14);
                            i14++;
                            if (!set2.contains(((SRSStatus) obj3).getId())) {
                                arrayList5.add(obj3);
                            }
                        }
                        arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
                        size3 = arrayList5.size();
                        i15 = 0;
                        while (i15 < size3) {
                            Object obj13 = arrayList5.get(i15);
                            i15++;
                            arrayList6.add(((SRSStatus) obj13).getId());
                        }
                        listJ1 = ry.m.j0(arrayList6);
                        if (!listJ1.isEmpty()) {
                            w0 w0Var8 = b0Var.f55236a;
                            this.f33797b = null;
                            this.f33801f = list9;
                            this.f33802t = set2;
                            this.H = list8;
                            this.f33798c = null;
                            this.K = listJ1;
                            this.f33799d = 8;
                            yz.f fVar14 = rz.o0.f50940a;
                            objM2 = rz.e0.M(yz.e.f58387a, new cj.b(listJ1, (z0) w0Var8, (vy.d) null, 8), this);
                            if (objM2 == wy.a.COROUTINE_SUSPENDED) {
                                obj4 = objM2;
                            }
                            if (obj4 == aVar3) {
                                return aVar3;
                            }
                            list10 = list8;
                            set3 = set2;
                            list11 = list9;
                            list9 = list11;
                            set2 = set3;
                            list8 = list10;
                        }
                        list9.size();
                        set2.size();
                        list8.size();
                        listJ1.size();
                        return new wt.e0(list8.size(), listJ1.size());
                    case 7:
                        str3 = this.f33798c;
                        list8 = (List) this.H;
                        set2 = (Set) this.f33802t;
                        list9 = (List) this.f33801f;
                        com.bumptech.glide.e.F(obj);
                        objU4 = obj;
                        arrayList4 = new ArrayList();
                        while (r6.hasNext()) {
                            sRSStatus = (SRSStatus) obj6;
                            if (!kotlin.jvm.internal.m.a(sRSStatus.getLan(), str3)) {
                            }
                        }
                        arrayList5 = new ArrayList();
                        size2 = arrayList4.size();
                        i14 = 0;
                        while (i14 < size2) {
                            obj3 = arrayList4.get(i14);
                            i14++;
                            if (!set2.contains(((SRSStatus) obj3).getId())) {
                                arrayList5.add(obj3);
                            }
                        }
                        arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
                        size3 = arrayList5.size();
                        i15 = 0;
                        while (i15 < size3) {
                            Object obj14 = arrayList5.get(i15);
                            i15++;
                            arrayList6.add(((SRSStatus) obj14).getId());
                        }
                        listJ1 = ry.m.j0(arrayList6);
                        if (!listJ1.isEmpty()) {
                            w0 w0Var9 = b0Var.f55236a;
                            this.f33797b = null;
                            this.f33801f = list9;
                            this.f33802t = set2;
                            this.H = list8;
                            this.f33798c = null;
                            this.K = listJ1;
                            this.f33799d = 8;
                            yz.f fVar15 = rz.o0.f50940a;
                            objM2 = rz.e0.M(yz.e.f58387a, new cj.b(listJ1, (z0) w0Var9, (vy.d) null, 8), this);
                            if (objM2 == wy.a.COROUTINE_SUSPENDED) {
                                obj4 = objM2;
                            }
                            if (obj4 == aVar3) {
                                return aVar3;
                            }
                            list10 = list8;
                            set3 = set2;
                            list11 = list9;
                            list9 = list11;
                            set2 = set3;
                            list8 = list10;
                        }
                        list9.size();
                        set2.size();
                        list8.size();
                        listJ1.size();
                        return new wt.e0(list8.size(), listJ1.size());
                    case 8:
                        listJ1 = (List) this.K;
                        list10 = (List) this.H;
                        set3 = (Set) this.f33802t;
                        list11 = (List) this.f33801f;
                        com.bumptech.glide.e.F(obj);
                        list9 = list11;
                        set2 = set3;
                        list8 = list10;
                        list9.size();
                        set2.size();
                        list8.size();
                        listJ1.size();
                        return new wt.e0(list8.size(), listJ1.size());
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, vy.d dVar) {
        super(2, dVar);
        this.L = mVar;
    }
}
