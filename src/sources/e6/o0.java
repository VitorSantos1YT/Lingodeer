package e6;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetReceiver;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static n5.f f25003f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppWidgetManager f25006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qy.q f25007c = com.bumptech.glide.d.v(new a0.c0(this, 4));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j0 f25001d = new j0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q5.b f25002e = com.bumptech.glide.g.t("GlanceAppWidgetManager", null, null, 14);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r5.d f25004g = jh.h.x("list::Providers");

    public o0(Context context) {
        this.f25005a = context;
        this.f25006b = AppWidgetManager.getInstance(context);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(Class cls, xy.c cVar) {
        m0 m0Var;
        o0 o0Var;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i11 = m0Var.f24980e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m0Var.f24980e = i11 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(this, cVar);
            }
        } else {
            m0Var = new m0(this, cVar);
        }
        Object objB = m0Var.f24978c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = m0Var.f24980e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objB);
            m0Var.f24976a = this;
            m0Var.f24977b = cls;
            m0Var.f24980e = 1;
            objB = b(m0Var);
            if (objB == aVar) {
                return aVar;
            }
            o0Var = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cls = m0Var.f24977b;
            o0Var = m0Var.f24976a;
            com.bumptech.glide.e.F(objB);
        }
        k0 k0Var = (k0) objB;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("no canonical provider name");
        }
        List list = (List) k0Var.f24954b.get(canonicalName);
        if (list == null) {
            return ry.r.f50854a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int[] appWidgetIds = o0Var.f25006b.getAppWidgetIds((ComponentName) it.next());
            ArrayList arrayList2 = new ArrayList(appWidgetIds.length);
            for (int i13 : appWidgetIds) {
                arrayList2.add(new c(i13));
            }
            ry.m.d0(arrayList, arrayList2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:54:0x0137  */
    /* JADX WARN: Code duplicated, block: B:55:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x015f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0171  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(xy.c cVar) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        n0 n0Var;
        o0 o0Var;
        o0 o0Var2;
        r5.b bVar;
        o0 o0Var3;
        String packageName;
        Set<String> set;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        Object arrayList2;
        ComponentName componentName;
        String str2;
        qy.l lVar;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i11 = n0Var.f24990e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                n0Var.f24990e = i11 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object objU = n0Var.f24988c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = n0Var.f24990e;
        j0 j0Var = f25001d;
        r5.d dVar = f25004g;
        vy.d dVar2 = null;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objU);
            uz.i data = ((n5.f) this.f25007c.getValue()).getData();
            n0Var.f24986a = this;
            n0Var.f24987b = this;
            n0Var.f24990e = 1;
            objU = uz.x0.u(data, n0Var);
            if (objU != aVar) {
                o0Var = this;
                o0Var2 = o0Var;
            }
            return aVar;
        }
        if (i12 == 1) {
            o0Var = n0Var.f24987b;
            o0Var2 = n0Var.f24986a;
            com.bumptech.glide.e.F(objU);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o0Var3 = n0Var.f24986a;
            com.bumptech.glide.e.F(objU);
        }
        bVar = (r5.b) objU;
        o0Var = o0Var3;
        packageName = o0Var.f25005a.getPackageName();
        set = (Set) bVar.c(dVar);
        if (set == null) {
            ry.s sVar = ry.s.f50855a;
            return new k0(sVar, sVar);
        }
        arrayList = new ArrayList();
        for (String str3 : set) {
            componentName = new ComponentName(packageName, str3);
            str2 = (String) bVar.c(j0.a(j0Var, str3));
            if (str2 == null) {
                lVar = null;
            } else {
                lVar = new qy.l(componentName, str2);
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        Map mapG0 = ry.x.g0(arrayList);
        Set<Map.Entry> setEntrySet = mapG0.entrySet();
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            str = (String) entry.getValue();
            arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add((ComponentName) entry.getKey());
        }
        return new k0(mapG0, linkedHashMap);
        if (((r5.b) objU).c(dVar) == null) {
            objU = null;
        }
        bVar = (r5.b) objU;
        if (bVar == null) {
            n0Var.f24986a = o0Var;
            n0Var.f24987b = null;
            n0Var.f24990e = 2;
            List<AppWidgetProviderInfo> installedProviders = o0Var2.f25006b.getInstalledProviders();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : installedProviders) {
                if (kotlin.jvm.internal.m.a(((AppWidgetProviderInfo) obj).provider.getPackageName(), o0Var2.f25005a.getPackageName())) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList3.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj2 = arrayList3.get(i13);
                i13++;
                j0Var.getClass();
                Object objNewInstance = Class.forName(((AppWidgetProviderInfo) obj2).provider.getClassName()).getDeclaredConstructor(null).newInstance(null);
                DayStreakWidgetReceiver dayStreakWidgetReceiver = objNewInstance instanceof DayStreakWidgetReceiver ? (DayStreakWidgetReceiver) objNewInstance : null;
                if (dayStreakWidgetReceiver != null) {
                    arrayList4.add(dayStreakWidgetReceiver);
                }
            }
            objU = ((n5.f) o0Var2.f25007c.getValue()).a(new av.f0(arrayList4, dVar2, 18), n0Var);
            if (objU != aVar) {
                o0Var3 = o0Var;
                bVar = (r5.b) objU;
                o0Var = o0Var3;
            }
            return aVar;
        }
        packageName = o0Var.f25005a.getPackageName();
        set = (Set) bVar.c(dVar);
        if (set == null) {
            ry.s sVar2 = ry.s.f50855a;
            return new k0(sVar2, sVar2);
        }
        arrayList = new ArrayList();
        while (r1.hasNext()) {
            componentName = new ComponentName(packageName, str3);
            str2 = (String) bVar.c(j0.a(j0Var, str3));
            if (str2 == null) {
                lVar = null;
            } else {
                lVar = new qy.l(componentName, str2);
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        Map mapG1 = ry.x.g0(arrayList);
        Set<Map.Entry> setEntrySet2 = mapG1.entrySet();
        linkedHashMap = new LinkedHashMap();
        while (r1.hasNext()) {
            str = (String) entry.getValue();
            arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add((ComponentName) entry.getKey());
        }
        return new k0(mapG1, linkedHashMap);
    }

    public final Object c(DayStreakWidgetReceiver dayStreakWidgetReceiver, xq.c cVar, q0 q0Var) {
        f25001d.getClass();
        String canonicalName = dayStreakWidgetReceiver.getClass().getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("no receiver name");
        }
        String canonicalName2 = cVar.getClass().getCanonicalName();
        if (canonicalName2 == null) {
            throw new IllegalArgumentException("no provider name");
        }
        Object objA = ((n5.f) this.f25007c.getValue()).a(new ad.y(canonicalName, canonicalName2, null), q0Var);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : qy.b0.f48488a;
    }
}
