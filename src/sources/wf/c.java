package wf;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;
import ry.t;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f55116a = x.V(new qy.l(String.class, new b(0)), new qy.l(String[].class, new b(1)), new qy.l(JSONArray.class, new b(2)));

    public static final JSONObject a(xf.a aVar) {
        if (aVar == null) {
            return null;
        }
        Bundle bundle = aVar.f56022a;
        JSONObject jSONObject = new JSONObject();
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        if (setKeySet == null) {
            setKeySet = t.f50856a;
        }
        for (String key : setKeySet) {
            Object obj = bundle != null ? bundle.get(key) : null;
            if (obj != null) {
                b bVar = (b) f55116a.get(obj.getClass());
                if (bVar == null) {
                    throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
                }
                switch (bVar.f55115a) {
                    case 0:
                        m.f(key, "key");
                        jSONObject.put(key, obj);
                        break;
                    case 1:
                        m.f(key, "key");
                        JSONArray jSONArray = new JSONArray();
                        for (String str : (String[]) obj) {
                            jSONArray.put(str);
                        }
                        jSONObject.put(key, jSONArray);
                        break;
                    default:
                        m.f(key, "key");
                        throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
                }
            }
        }
        return jSONObject;
    }
}
