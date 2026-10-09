package lf;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f40025a;

    static {
        HashMap map = new HashMap();
        f40025a = map;
        map.put(Boolean.class, new f(0));
        map.put(Integer.class, new f(1));
        map.put(Long.class, new f(2));
        map.put(Double.class, new f(3));
        map.put(String.class, new f(4));
        map.put(String[].class, new f(5));
        map.put(JSONArray.class, new f(6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Bundle a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object obj = jSONObject.get(key);
            if (obj != JSONObject.NULL) {
                if (!(obj instanceof JSONObject)) {
                    f fVar = (f) f40025a.get(obj.getClass());
                    if (fVar == null) {
                        throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                    }
                    kotlin.jvm.internal.m.e(key, "key");
                    switch (fVar.f40022a) {
                        case 0:
                            bundle.putBoolean(key, ((Boolean) obj).booleanValue());
                            break;
                        case 1:
                            bundle.putInt(key, ((Integer) obj).intValue());
                            break;
                        case 2:
                            bundle.putLong(key, ((Long) obj).longValue());
                            break;
                        case 3:
                            bundle.putDouble(key, ((Double) obj).doubleValue());
                            break;
                        case 4:
                            bundle.putString(key, (String) obj);
                            break;
                        case 5:
                            throw new IllegalArgumentException("Unexpected type from JSON");
                        default:
                            JSONArray jSONArray = (JSONArray) obj;
                            ArrayList arrayList = new ArrayList();
                            if (jSONArray.length() == 0) {
                                bundle.putStringArrayList(key, arrayList);
                            } else {
                                int length = jSONArray.length();
                                for (int i11 = 0; i11 < length; i11++) {
                                    Object obj2 = jSONArray.get(i11);
                                    if (!(obj2 instanceof String)) {
                                        throw new IllegalArgumentException("Unexpected type in an array: " + obj2.getClass());
                                    }
                                    arrayList.add(obj2);
                                }
                                bundle.putStringArrayList(key, arrayList);
                            }
                            break;
                    }
                } else {
                    bundle.putBundle(key, a((JSONObject) obj));
                }
            }
        }
        return bundle;
    }
}
