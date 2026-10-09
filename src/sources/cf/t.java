package cf;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.a0;
import lf.e0;
import lf.h0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f6988d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f6985a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f6986b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f6987c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f6989e = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r21v4, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static final synchronized Bundle c(List list, long j11, boolean z11, List list2) {
        Bundle bundle;
        Bundle bundle2;
        ?? r21;
        boolean z12;
        Bundle bundle3;
        ?? r9;
        ?? r11;
        Object obj;
        long jLongValue;
        Bundle bundle4 = null;
        bundle4 = null;
        if (qf.a.b(t.class)) {
            return null;
        }
        try {
            if (list2.isEmpty()) {
                return null;
            }
            if (list.size() != list2.size()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            ?? bundle5 = 0;
            int i11 = 0;
            while (i11 < size) {
                a aVar = (a) list.get(i11);
                qy.l lVar = (qy.l) list2.get(i11);
                Bundle bundle6 = (Bundle) lVar.f48495a;
                se.t tVar = (se.t) lVar.f48496b;
                int i12 = i11;
                a aVar2 = new a(aVar.f6901a, new BigDecimal(String.valueOf(aVar.f6902b)).setScale(2, RoundingMode.HALF_UP).doubleValue(), aVar.f6903c);
                List<qy.l> list3 = z11 ? (List) f6986b.get(aVar2) : (List) f6987c.get(aVar2);
                if (list3 == null || list3.isEmpty()) {
                    Bundle bundle7 = bundle4;
                    Bundle bundle8 = bundle7;
                    Bundle bundle9 = bundle8;
                    r21 = bundle9;
                    z12 = false;
                    r11 = bundle8;
                    r9 = bundle9;
                    bundle3 = bundle7;
                } else {
                    Bundle bundle10 = bundle4;
                    Bundle bundle11 = bundle10;
                    ?? ValueOf = bundle11;
                    z12 = false;
                    Object objB = bundle10;
                    Bundle bundle12 = bundle4;
                    Object obj2 = bundle11;
                    for (qy.l lVar2 : list3) {
                        long jLongValue2 = ((Number) lVar2.f48495a).longValue();
                        qy.l lVar3 = (qy.l) lVar2.f48496b;
                        Bundle bundle13 = (Bundle) lVar3.f48495a;
                        se.t tVar2 = (se.t) lVar3.f48496b;
                        long jAbs = Math.abs(j11 - jLongValue2);
                        List list4 = p.f6973a;
                        e0 e0VarB = h0.b(re.s.b());
                        if (e0VarB != null) {
                            bundle2 = bundle12;
                            try {
                                obj = e0VarB.A;
                                bundle2 = bundle2;
                            } catch (Throwable th2) {
                                th = th2;
                                bundle = bundle2;
                            }
                        } else {
                            bundle2 = bundle12;
                        }
                        if (obj != null) {
                            obj = bundle12;
                            Long l9 = e0VarB.A;
                            if (l9 != null && l9.longValue() == 0) {
                                obj = bundle12;
                                jLongValue = p.f6975c;
                            } else {
                                jLongValue = e0VarB.A.longValue();
                            }
                        } else {
                            obj = bundle12;
                            jLongValue = p.f6975c;
                        }
                        if (jAbs <= jLongValue && (ValueOf == 0 || jLongValue2 < ValueOf.longValue())) {
                            t tVar3 = f6985a;
                            boolean z13 = !z11;
                            if (qf.a.b(t.class)) {
                                objB = bundle2;
                            } else {
                                try {
                                    objB = tVar3.b(bundle6, tVar, bundle13, tVar2, z13, false);
                                } catch (Throwable th3) {
                                    qf.a.a(t.class, th3);
                                    objB = bundle2;
                                }
                            }
                            String strB = f6985a.b(bundle6, tVar, bundle13, tVar2, z13, true);
                            obj2 = obj2;
                            if (strB != null) {
                                obj2 = strB;
                            }
                            if (objB != null) {
                                ValueOf = Long.valueOf(jLongValue2);
                                arrayList.add(new qy.l(aVar2, Long.valueOf(jLongValue2)));
                                z12 = true;
                            }
                        }
                        bundle12 = bundle2;
                        objB = objB;
                        obj2 = obj2;
                        ValueOf = ValueOf;
                    }
                    bundle3 = bundle12;
                    r9 = obj2;
                    r11 = objB;
                    r21 = ValueOf;
                }
                if (r9 != 0) {
                    if (bundle5 == 0) {
                        bundle5 = new Bundle();
                    }
                    bundle5.putString("fb_iap_test_dedup_result", "1");
                    bundle5.putString("fb_iap_test_dedup_key_used", r9);
                }
                if (z12) {
                    if (bundle5 == 0) {
                        bundle5 = new Bundle();
                    }
                    bundle5.putString("fb_iap_non_deduped_event_time", String.valueOf(r21 != 0 ? r21.longValue() / ((long) 1000) : 0L));
                    bundle5.putString("fb_iap_actual_dedup_result", "1");
                    bundle5.putString("fb_iap_actual_dedup_key_used", r11);
                }
                if (z11 && !z12) {
                    ConcurrentHashMap concurrentHashMap = f6987c;
                    if (concurrentHashMap.get(aVar2) == null) {
                        concurrentHashMap.put(aVar2, new ArrayList());
                    }
                    List list5 = (List) concurrentHashMap.get(aVar2);
                    if (list5 != null) {
                        list5.add(new qy.l(Long.valueOf(j11), new qy.l(bundle6, tVar)));
                    }
                } else if (!z11 && !z12) {
                    ConcurrentHashMap concurrentHashMap2 = f6986b;
                    if (concurrentHashMap2.get(aVar2) == null) {
                        concurrentHashMap2.put(aVar2, new ArrayList());
                    }
                    List list6 = (List) concurrentHashMap2.get(aVar2);
                    if (list6 != null) {
                        list6.add(new qy.l(Long.valueOf(j11), new qy.l(bundle6, tVar)));
                    }
                }
                i11 = i12 + 1;
                bundle4 = bundle3;
                bundle5 = bundle5;
            }
            bundle2 = bundle4;
            int size2 = arrayList.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj3 = arrayList.get(i13);
                i13++;
                qy.l lVar4 = (qy.l) obj3;
                List list7 = z11 ? (List) f6986b.get(lVar4.f48495a) : (List) f6987c.get(lVar4.f48495a);
                if (list7 != null) {
                    Iterator it = list7.iterator();
                    int i14 = 0;
                    while (it.hasNext()) {
                        int i15 = i14 + 1;
                        if (((Number) ((qy.l) it.next()).f48495a).longValue() == ((Number) lVar4.f48496b).longValue()) {
                            list7.remove(i14);
                            break;
                        }
                        i14 = i15;
                    }
                    if (z11) {
                        if (list7.isEmpty()) {
                            f6986b.remove(lVar4.f48495a);
                        } else {
                            f6986b.put(lVar4.f48495a, list7);
                        }
                    } else if (list7.isEmpty()) {
                        f6987c.remove(lVar4.f48495a);
                    } else {
                        f6987c.put(lVar4.f48495a, list7);
                    }
                }
            }
            return bundle5;
        } catch (Throwable th4) {
            th = th4;
            bundle = bundle4;
        }
        qf.a.a(t.class, th);
        return bundle;
    }

    public static final void d() {
        if (qf.a.b(t.class)) {
            return;
        }
        try {
            if (f6989e.get()) {
                v vVarA = f6985a.a();
                int i11 = s.f6984a[vVarA.ordinal()];
                if (i11 == 2) {
                    e.b(v.V1);
                    return;
                }
                if (i11 != 3) {
                    if (i11 == 4 && a0.b(lf.x.IapLoggingLib5To7)) {
                        g.b(re.s.a(), vVarA);
                        return;
                    }
                    return;
                }
                if (a0.b(lf.x.IapLoggingLib2)) {
                    g.b(re.s.a(), vVarA);
                } else {
                    e.b(v.V2_V4);
                }
            }
        } catch (Throwable th2) {
            qf.a.a(t.class, th2);
        }
    }

    public final v a() {
        try {
            if (qf.a.b(this)) {
                return null;
            }
            try {
                Context contextA = re.s.a();
                ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                kotlin.jvm.internal.m.e(applicationInfo, "context.packageManager.g…TA_DATA\n                )");
                String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
                if (string == null) {
                    return v.NONE;
                }
                List listW0 = oz.q.W0(string, new String[]{"."}, 3, 2);
                if (string.length() == 0) {
                    return v.V5_V7;
                }
                String strConcat = "GPBL.".concat(string);
                if (!qf.a.b(t.class)) {
                    try {
                        f6988d = strConcat;
                    } catch (Throwable th2) {
                        qf.a.a(t.class, th2);
                    }
                }
                Integer numT0 = oz.x.t0((String) listW0.get(0));
                if (numT0 == null) {
                    return v.V5_V7;
                }
                int iIntValue = numT0.intValue();
                if (iIntValue == 1) {
                    return v.V1;
                }
                return iIntValue < 5 ? v.V2_V4 : v.V5_V7;
            } catch (Exception unused) {
                return v.V5_V7;
            }
        } catch (Throwable th3) {
            qf.a.a(this, th3);
            return null;
        }
    }

    public final String b(Bundle bundle, se.t tVar, Bundle bundle2, se.t tVar2, boolean z11, boolean z12) {
        if (!qf.a.b(this)) {
            try {
                List<qy.l> listC = z12 ? p.c(z11) : p.b(z11);
                if (listC != null) {
                    for (qy.l lVar : listC) {
                        Map map = se.t.f51614b;
                        Object objY = ve.i.y(se.u.IAPParameters, (String) lVar.f48495a, bundle, tVar);
                        String str = objY instanceof String ? (String) objY : null;
                        if (str != null && str.length() != 0) {
                            for (String str2 : (List) lVar.f48496b) {
                                Map map2 = se.t.f51614b;
                                Object objY2 = ve.i.y(se.u.IAPParameters, str2, bundle2, tVar2);
                                String str3 = objY2 instanceof String ? (String) objY2 : null;
                                if (str3 != null && str3.length() != 0 && str3.equals(str)) {
                                    return z11 ? (String) lVar.f48495a : str2;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return null;
            }
        }
        return null;
    }
}
