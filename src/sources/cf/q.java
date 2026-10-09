package cf;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.google.type.bACG.scNRoQgKSYX;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f6977a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f6978b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f6979c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f6980d = re.s.a().getPackageName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SharedPreferences f6981e = re.s.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SharedPreferences f6982f = re.s.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final ArrayList f(Context context, Object obj) {
        if (qf.a.b(q.class)) {
            return null;
        }
        try {
            q qVar = f6977a;
            return qVar.a(qVar.e(context, obj, "inapp"));
        } catch (Throwable th2) {
            qf.a.a(q.class, th2);
            return null;
        }
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2;
        SharedPreferences sharedPreferences = f6982f;
        ArrayList arrayList3 = null;
        if (qf.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList4 = new ArrayList();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                String str = (String) obj;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j11 = jSONObject.getLong("purchaseTime");
                    arrayList2 = arrayList3;
                    try {
                        try {
                            String string2 = jSONObject.getString("purchaseToken");
                            if (jCurrentTimeMillis - (j11 / 1000) <= 86400 && !kotlin.jvm.internal.m.a(sharedPreferences.getString(string, BuildConfig.VERSION_NAME), string2)) {
                                editorEdit.putString(string, string2);
                                arrayList4.add(str);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            qf.a.a(this, th);
                            return arrayList2;
                        }
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    arrayList2 = arrayList3;
                }
                arrayList3 = arrayList2;
            }
            arrayList2 = arrayList3;
            editorEdit.apply();
            return arrayList4;
        } catch (Throwable th3) {
            th = th3;
            arrayList2 = arrayList3;
        }
    }

    public final Class b(Context context, String str) {
        Class<?> clsLoadClass;
        HashMap map = f6979c;
        if (qf.a.b(this)) {
            return null;
        }
        try {
            Class cls = (Class) map.get(str);
            if (cls != null) {
                return cls;
            }
            if (qf.a.b(x.class)) {
                clsLoadClass = null;
            } else {
                try {
                    clsLoadClass = context.getClassLoader().loadClass(str);
                } catch (ClassNotFoundException unused) {
                    clsLoadClass = null;
                } catch (Throwable th2) {
                    qf.a.a(x.class, th2);
                    clsLoadClass = null;
                }
            }
            if (clsLoadClass != null) {
                map.put(str, clsLoadClass);
            }
            return clsLoadClass;
        } catch (Throwable th3) {
            qf.a.a(this, th3);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    public final Method c(Class cls, String str) {
        Class[] clsArr;
        if (qf.a.b(this)) {
            return null;
        }
        try {
            HashMap map = f6978b;
            Method method = (Method) map.get(str);
            if (method != null) {
                return method;
            }
            Class TYPE = Integer.TYPE;
            switch (str) {
                case "getPurchases":
                    kotlin.jvm.internal.m.e(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                    break;
                case "isBillingSupported":
                    kotlin.jvm.internal.m.e(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class};
                    break;
                case "asInterface":
                    clsArr = new Class[]{IBinder.class};
                    break;
                case "getPurchaseHistory":
                    kotlin.jvm.internal.m.e(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, String.class, Bundle.class};
                    break;
                case "getSkuDetails":
                    kotlin.jvm.internal.m.e(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, Bundle.class};
                    break;
                default:
                    clsArr = null;
                    break;
            }
            Method methodL = clsArr == null ? x.l(cls, str, null) : x.l(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (methodL != null) {
                map.put(str, methodL);
            }
            return methodL;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    public final ArrayList e(Context context, Object obj, String str) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (obj != null && i(context, obj, str)) {
                int size = 0;
                String string = null;
                while (true) {
                    Context context2 = context;
                    Object obj2 = obj;
                    try {
                        Object objH = h(context2, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj2, new Object[]{3, f6980d, str, string});
                        if (objH == null) {
                            string = null;
                            if (size >= 30) {
                                break;
                            }
                            break;
                            break;
                        }
                        Bundle bundle = (Bundle) objH;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList == null) {
                                break;
                            }
                            size += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        } else {
                            string = null;
                        }
                        if (size >= 30 || string == null) {
                            break;
                        }
                        context = context2;
                        obj = obj2;
                    } catch (Throwable th2) {
                        th = th2;
                        qf.a.a(this, th);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final LinkedHashMap g(Context context, ArrayList arrayList, Object obj, boolean z11) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                try {
                    Object objH = h(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, new Object[]{3, f6980d, z11 ? "subs" : "inapp", bundle});
                    if (objH != null) {
                        Bundle bundle2 = (Bundle) objH;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    Object obj2 = arrayList.get(i11);
                                    kotlin.jvm.internal.m.e(obj2, "skuList[i]");
                                    String str = stringArrayList.get(i11);
                                    kotlin.jvm.internal.m.e(str, "skuDetailsList[i]");
                                    linkedHashMap.put(obj2, str);
                                }
                            }
                            k(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    qf.a.a(this, th);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th3) {
            th = th3;
            qf.a.a(this, th);
            return null;
        }
    }

    public final Object h(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodC;
        if (!qf.a.b(this)) {
            try {
                Class clsB = b(context, str);
                if (clsB != null && (methodC = c(clsB, str2)) != null) {
                    return x.t(clsB, obj, methodC, Arrays.copyOf(objArr, objArr.length));
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final boolean i(Context context, Object obj, String str) {
        if (!qf.a.b(this) && obj != null) {
            try {
                try {
                    Object objH = h(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f6980d, str});
                    if (objH != null && ((Integer) objH).intValue() == 0) {
                        return true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    qf.a.a(this, th);
                    return false;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return false;
    }

    public final LinkedHashMap j(ArrayList arrayList) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                String sku = (String) obj;
                String string = f6981e.getString(sku, null);
                if (string != null) {
                    List listW0 = oz.q.W0(string, new String[]{";"}, 2, 2);
                    if (jCurrentTimeMillis - Long.parseLong((String) listW0.get(0)) < 43200) {
                        kotlin.jvm.internal.m.e(sku, "sku");
                        linkedHashMap.put(sku, listW0.get(1));
                    } else {
                        continue;
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public final void k(LinkedHashMap linkedHashMap) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = f6981e.edit();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                editorEdit.putString((String) entry.getKey(), jCurrentTimeMillis + ';' + ((String) entry.getValue()));
            }
            editorEdit.apply();
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    public final ArrayList d(Context context, Object obj) {
        ArrayList arrayList;
        ArrayList<String> stringArrayList;
        ArrayList arrayList2 = null;
        if (qf.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList3 = new ArrayList();
            Context context2 = context;
            Object obj2 = obj;
            if (i(context2, obj2, "inapp")) {
                Object string = null;
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    Object objH = h(context2, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj2, new Object[]{6, f6980d, "inapp", string, new Bundle()});
                    if (objH != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objH;
                        if (bundle.getInt("RESPONSE_CODE") != 0 || (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) == null) {
                            arrayList = arrayList2;
                            string = arrayList;
                        } else {
                            int size = stringArrayList.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size) {
                                    arrayList = arrayList2;
                                    break;
                                }
                                String str = stringArrayList.get(i12);
                                i12++;
                                String str2 = str;
                                arrayList = arrayList2;
                                try {
                                    try {
                                        if (jCurrentTimeMillis - (new JSONObject(str2).getLong("purchaseTime") / 1000) > 1200) {
                                            z11 = true;
                                            break;
                                        }
                                        arrayList3.add(str2);
                                        i11++;
                                    } catch (JSONException unused) {
                                    }
                                    arrayList2 = arrayList;
                                } catch (Throwable th2) {
                                    th = th2;
                                    qf.a.a(this, th);
                                    return arrayList;
                                }
                            }
                            string = bundle.getString(scNRoQgKSYX.aVxUnlbOPcEQh);
                        }
                    } else {
                        arrayList = arrayList2;
                        string = arrayList;
                    }
                    if (i11 >= 30 || string == null || z11) {
                        break;
                    }
                    context2 = context;
                    obj2 = obj;
                    arrayList2 = arrayList;
                }
            }
            return arrayList3;
        } catch (Throwable th3) {
            th = th3;
            arrayList = arrayList2;
        }
    }
}
