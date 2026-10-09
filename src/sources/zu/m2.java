package zu;

import com.lingodeer.data.model.DailyLearnHistory;
import com.lingodeer.data.model.DailyLearnTimeHistory;
import com.lingodeer.data.model.DailyLearnWithLearnTimeHistory;
import fr.x4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import rt.t3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m2 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ uz.j f59493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f59494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s2 f59495e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2(int i11, vy.d dVar, s2 s2Var) {
        super(3, dVar);
        this.f59491a = i11;
        this.f59495e = s2Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        uz.j jVar = (uz.j) obj;
        vy.d dVar = (vy.d) obj3;
        switch (this.f59491a) {
            case 0:
                m2 m2Var = new m2(0, dVar, this.f59495e);
                m2Var.f59493c = jVar;
                m2Var.f59494d = obj2;
                return m2Var.invokeSuspend(qy.b0.f48488a);
            case 1:
                m2 m2Var2 = new m2(1, dVar, this.f59495e);
                m2Var2.f59493c = jVar;
                m2Var2.f59494d = obj2;
                return m2Var2.invokeSuspend(qy.b0.f48488a);
            case 2:
                m2 m2Var3 = new m2(2, dVar, this.f59495e);
                m2Var3.f59493c = jVar;
                m2Var3.f59494d = obj2;
                return m2Var3.invokeSuspend(qy.b0.f48488a);
            case 3:
                m2 m2Var4 = new m2(3, dVar, this.f59495e);
                m2Var4.f59493c = jVar;
                m2Var4.f59494d = obj2;
                return m2Var4.invokeSuspend(qy.b0.f48488a);
            default:
                m2 m2Var5 = new m2(4, dVar, this.f59495e);
                m2Var5.f59493c = jVar;
                m2Var5.f59494d = obj2;
                return m2Var5.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterable iterableB;
        String id2;
        uz.j jVar;
        List list;
        int i11;
        int i12 = this.f59491a;
        uz.n0 n0Var = uz.n0.f53370a;
        int i13 = 3;
        int i14 = 2;
        s2 s2Var = this.f59495e;
        qy.b0 b0Var = qy.b0.f48488a;
        int i15 = 0;
        vy.d dVar = null;
        int i16 = 1;
        switch (i12) {
            case 0:
                vt.h1 h1Var = s2Var.f59555a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f59492b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar2 = this.f59493c;
                gp.r rVarN = ((x4) h1Var).n();
                uz.i iVar = ((x4) h1Var).f27974g;
                kr.s sVar = new kr.s(3, 1, null);
                this.f59493c = null;
                this.f59494d = null;
                this.f59492b = 1;
                uz.x0.s(jVar2);
                Object objA = vz.b.a(n0Var, new uz.l0(sVar, (vy.d) null), jVar2, this, new uz.i[]{rVarN, iVar});
                if (objA != wy.a.COROUTINE_SUSPENDED) {
                    objA = b0Var;
                }
                if (objA != wy.a.COROUTINE_SUSPENDED) {
                    objA = b0Var;
                }
                return objA == aVar ? aVar : b0Var;
            case 1:
                vt.l0 l0Var = s2Var.f59557c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f59492b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar3 = this.f59493c;
                bh.i0 i0Var = new bh.i0(qx.p.l(((fr.c0) l0Var).f27428a.f2988a, new String[]{"daily_learn_history"}, new au.a(8)), 4);
                bh.i0 i0VarB = ((fr.c0) l0Var).b();
                t3 t3Var = new t3(i13, 4, null);
                this.f59493c = null;
                this.f59494d = null;
                this.f59492b = 1;
                uz.x0.s(jVar3);
                Object objA2 = vz.b.a(n0Var, new uz.l0(t3Var, (vy.d) null), jVar3, this, new uz.i[]{i0Var, i0VarB});
                if (objA2 != wy.a.COROUTINE_SUSPENDED) {
                    objA2 = b0Var;
                }
                if (objA2 != wy.a.COROUTINE_SUSPENDED) {
                    objA2 = b0Var;
                }
                return objA2 == aVar2 ? aVar2 : b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i19 = this.f59492b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar4 = this.f59493c;
                qy.l lVar = (qy.l) this.f59494d;
                List<DailyLearnHistory> list2 = (List) lVar.f48495a;
                List<DailyLearnTimeHistory> list3 = (List) lVar.f48496b;
                Objects.toString(list2);
                Objects.toString(list3);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
                s2 s2Var2 = this.f59495e;
                int i21 = ((fr.o0) s2Var2.f59559e).f27733a.locateLanguage;
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(ry.l.D(new Integer[]{0, 9, 1}, Integer.valueOf(i21)) ? "yyyy年M月d日" : ry.l.D(new Integer[]{6}, Integer.valueOf(i21)) ? "d. MMM yyy" : "MMM d, yyyy");
                int iW = ry.x.W(ry.n.W(list2, 10));
                if (iW < 16) {
                    iW = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
                for (DailyLearnHistory dailyLearnHistory : list2) {
                    linkedHashMap.put(dailyLearnHistory.getId(), new Integer(dailyLearnHistory.getLearnXP()));
                }
                int iW2 = ry.x.W(ry.n.W(list3, 10));
                if (iW2 < 16) {
                    iW2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iW2);
                for (DailyLearnTimeHistory dailyLearnTimeHistory : list3) {
                    linkedHashMap2.put(dailyLearnTimeHistory.getId(), new Integer(dailyLearnTimeHistory.getTotalLearnTime()));
                }
                List listS0 = ry.m.S0(ry.m.j0(qx.b.D(linkedHashMap.keySet(), linkedHashMap2.keySet())), new ua.e(12));
                int iW3 = ry.x.W(ry.n.W(listS0, 10));
                if (iW3 < 16) {
                    iW3 = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iW3);
                Iterator it = listS0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String str = (String) next;
                    Integer num = (Integer) linkedHashMap.get(str);
                    int iIntValue = num != null ? num.intValue() : 0;
                    Integer num2 = (Integer) linkedHashMap2.get(str);
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    Iterator it2 = it;
                    try {
                        Date date = simpleDateFormat.parse(str);
                        if (date != null) {
                            jVar = jVar4;
                            try {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTime(date);
                                list = listS0;
                                try {
                                    i11 = calendar.get(7);
                                } catch (Exception unused) {
                                    i11 = 0;
                                }
                            } catch (Exception unused2) {
                                list = listS0;
                            }
                            linkedHashMap3.put(next, new DailyLearnWithLearnTimeHistory(str, iIntValue, iIntValue2, i11));
                            it = it2;
                            jVar4 = jVar;
                            listS0 = list;
                        } else {
                            jVar = jVar4;
                        }
                        break;
                    } catch (Exception unused3) {
                    }
                    list = listS0;
                    i11 = 0;
                    linkedHashMap3.put(next, new DailyLearnWithLearnTimeHistory(str, iIntValue, iIntValue2, i11));
                    it = it2;
                    jVar4 = jVar;
                    listS0 = list;
                }
                uz.j jVar5 = jVar4;
                List<String> list4 = listS0;
                List listA1 = ry.m.a1(linkedHashMap3.values());
                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyyMMdd", Locale.US);
                Calendar calendar2 = Calendar.getInstance();
                try {
                    Date date2 = simpleDateFormat3.parse(simpleDateFormat3.format(calendar2.getTime()));
                    kotlin.jvm.internal.m.c(date2);
                    calendar2.setTimeInMillis(date2.getTime());
                    break;
                } catch (ParseException e8) {
                    e8.printStackTrace();
                }
                long time = calendar2.getTime().getTime();
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTimeInMillis(time);
                long j11 = calendar3.get(16);
                switch (calendar3.get(7)) {
                    case 1:
                        iterableB = xt.d.b(listA1, time, calendar3, j11, 7);
                        break;
                    case 2:
                        iterableB = xt.d.b(listA1, time, calendar3, j11, 1);
                        break;
                    case 3:
                        iterableB = xt.d.b(listA1, time, calendar3, j11, 2);
                        break;
                    case 4:
                        iterableB = xt.d.b(listA1, time, calendar3, j11, 3);
                        break;
                    case 5:
                        iterableB = xt.d.b(listA1, time, calendar3, j11, 4);
                        break;
                    case 6:
                        iterableB = xt.d.b(listA1, time, calendar3, j11, 5);
                        break;
                    case 7:
                        iterableB = xt.d.b(listA1, time, calendar3, j11, 6);
                        break;
                    default:
                        iterableB = ry.r.f50854a;
                        break;
                }
                ArrayList arrayList = new ArrayList(ry.n.W(iterableB, 10));
                Iterator it3 = iterableB.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((DailyLearnWithLearnTimeHistory) it3.next()).getId());
                }
                Set setF1 = ry.m.f1(arrayList);
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                for (String str2 : list4) {
                    DailyLearnWithLearnTimeHistory dailyLearnWithLearnTimeHistory = (DailyLearnWithLearnTimeHistory) linkedHashMap3.get(str2);
                    if (dailyLearnWithLearnTimeHistory != null) {
                        try {
                            Date date3 = simpleDateFormat.parse(dailyLearnWithLearnTimeHistory.getId());
                            if (date3 != null) {
                                String str3 = simpleDateFormat2.format(date3);
                                kotlin.jvm.internal.m.e(str3, "format(...)");
                                id2 = str3.toUpperCase(Locale.ROOT);
                                kotlin.jvm.internal.m.e(id2, "toUpperCase(...)");
                            } else {
                                id2 = dailyLearnWithLearnTimeHistory.getId();
                            }
                            if (setF1.contains(str2)) {
                                linkedHashMap4.put(id2, dailyLearnWithLearnTimeHistory);
                            } else if (dailyLearnWithLearnTimeHistory.getXp() > 0 || dailyLearnWithLearnTimeHistory.getLearnTime() > 0) {
                                linkedHashMap5.put(id2, dailyLearnWithLearnTimeHistory);
                            }
                        } catch (Exception unused4) {
                        }
                    }
                }
                Iterator it4 = linkedHashMap4.values().iterator();
                int xp2 = 0;
                while (it4.hasNext()) {
                    xp2 += ((DailyLearnWithLearnTimeHistory) it4.next()).getXp();
                }
                Iterator it5 = linkedHashMap4.values().iterator();
                int learnTime = 0;
                while (it5.hasNext()) {
                    learnTime += ((DailyLearnWithLearnTimeHistory) it5.next()).getLearnTime();
                }
                gp.r rVar = new gp.r(new rt.h(ry.m.a1(linkedHashMap3.values()), null, 27));
                this.f59493c = null;
                this.f59494d = null;
                this.f59492b = 1;
                uz.x0.s(jVar5);
                Object objCollect = rVar.collect(new p2(jVar5, s2Var2, xp2, learnTime, linkedHashMap4, linkedHashMap5), this);
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                if (objCollect != aVar4) {
                    objCollect = b0Var;
                }
                if (objCollect != aVar4) {
                    objCollect = b0Var;
                }
                return objCollect == aVar3 ? aVar3 : b0Var;
            case 3:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f59492b;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar6 = this.f59493c;
                fr.i iVar2 = (fr.i) s2Var.f59556b;
                iVar2.getClass();
                gp.r rVar2 = new gp.r(new fr.b(i15, iVar2, dVar));
                this.f59493c = null;
                this.f59494d = null;
                this.f59492b = 1;
                return uz.x0.q(jVar6, rVar2, this) == aVar5 ? aVar5 : b0Var;
            default:
                vt.a aVar6 = s2Var.f59556b;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f59492b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar7 = this.f59493c;
                fr.i iVar3 = (fr.i) aVar6;
                iVar3.getClass();
                gp.r rVar3 = new gp.r(new fr.c(iVar3, null, 0));
                fr.i iVar4 = (fr.i) aVar6;
                iVar4.getClass();
                gp.r rVar4 = new gp.r(new fr.b(i14, iVar4, dVar));
                fr.i iVar5 = (fr.i) aVar6;
                iVar5.getClass();
                uz.m0 m0VarJ = uz.x0.j(rVar3, rVar4, new gp.r(new fr.b(i16, iVar5, dVar)), new q2(s2Var, null));
                this.f59493c = null;
                this.f59494d = null;
                this.f59492b = 1;
                return uz.x0.q(jVar7, m0VarJ, this) == aVar7 ? aVar7 : b0Var;
        }
    }
}
