package df;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import lf.j1;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f23412b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f23411a = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f23413c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f23414d = new HashMap();

    public static final void d(Bundle bundle) {
        int i11;
        if (qf.a.b(i.class)) {
            return;
        }
        try {
            if (f23412b && bundle != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    i11 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    String key = it.next();
                    String strValueOf = String.valueOf(bundle.get(key));
                    HashMap map = f23413c;
                    boolean z11 = map.get(key) != null;
                    HashMap map2 = f23414d;
                    i11 = map2.get(key) != null ? 1 : 0;
                    if (z11 || i11 != 0) {
                        i iVar = f23411a;
                        boolean zC = iVar.c(strValueOf, (Set) map.get(key));
                        boolean zB = iVar.b(strValueOf, (Set) map2.get(key));
                        if (!zC && !zB) {
                            m.e(key, "key");
                            arrayList.add(key);
                        }
                    }
                }
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    bundle.remove((String) obj);
                }
            }
        } catch (Throwable th2) {
            qf.a.a(i.class, th2);
        }
    }

    public final void a(JSONArray jSONArray) {
        HashSet hashSet;
        HashMap map = f23413c;
        HashMap map2 = f23414d;
        if (qf.a.b(this) || jSONArray == null) {
            return;
        }
        try {
            if (f23412b) {
                return;
            }
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                String string = jSONObject.getString("key");
                if (string != null && string.length() != 0) {
                    try {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        for (int i12 = 0; i12 < length2; i12++) {
                            boolean z11 = jSONArray2.getJSONObject(i12).getBoolean("require_exact_match");
                            JSONArray jSONArray3 = jSONArray2.getJSONObject(i12).getJSONArray("potential_matches");
                            HashSet hashSet2 = null;
                            if (!qf.a.b(this)) {
                                try {
                                    try {
                                        hashSet = j1.f(jSONArray3);
                                        if (hashSet == null) {
                                            hashSet = new HashSet();
                                        }
                                    } catch (Exception unused) {
                                        hashSet = new HashSet();
                                    }
                                    hashSet2 = hashSet;
                                } catch (Throwable th2) {
                                    qf.a.a(this, th2);
                                }
                            }
                            if (z11) {
                                HashSet hashSet3 = (HashSet) map2.get(string);
                                if (hashSet3 != null) {
                                    hashSet3.addAll(hashSet2);
                                    hashSet2 = hashSet3;
                                }
                                map2.put(string, hashSet2);
                            } else {
                                HashSet hashSet4 = (HashSet) map.get(string);
                                if (hashSet4 != null) {
                                    hashSet4.addAll(hashSet2);
                                    hashSet2 = hashSet4;
                                }
                                map.put(string, hashSet2);
                            }
                        }
                    } catch (Exception unused2) {
                        map2.remove(string);
                        map.remove(string);
                    }
                }
            }
        } catch (Throwable th3) {
            qf.a.a(this, th3);
        }
    }

    public final boolean b(String str, Set set) {
        if (!qf.a.b(this) && set != null) {
            try {
                Set<String> set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (String str2 : set2) {
                        Locale locale = Locale.ROOT;
                        String lowerCase = str2.toLowerCase(locale);
                        m.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase2 = str.toLowerCase(locale);
                        m.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (lowerCase.equals(lowerCase2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
            }
        }
        return false;
    }

    public final boolean c(String str, Set set) {
        if (!qf.a.b(this) && set != null) {
            try {
                Set<String> set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (String pattern : set2) {
                        m.f(pattern, "pattern");
                        Pattern patternCompile = Pattern.compile(pattern);
                        m.e(patternCompile, "compile(...)");
                        if (patternCompile.matcher(str).matches()) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
            }
        }
        return false;
    }
}
