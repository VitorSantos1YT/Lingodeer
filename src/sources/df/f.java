package df;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.m;
import lf.e0;
import lf.h0;
import org.json.JSONArray;
import qy.q;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f23401b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HashSet f23403d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f23400a = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f23402c = com.bumptech.glide.d.v(e.f23399a);

    public static final void b(Bundle bundle) {
        if (qf.a.b(f.class)) {
            return;
        }
        try {
            if (f23401b && bundle != null && !bundle.isEmpty() && f23403d != null) {
                ArrayList arrayList = new ArrayList();
                Set<String> setKeySet = bundle.keySet();
                m.e(setKeySet, "parameters.keySet()");
                for (String param : setKeySet) {
                    HashSet hashSet = f23403d;
                    m.c(hashSet);
                    if (!hashSet.contains(param)) {
                        m.e(param, "param");
                        arrayList.add(param);
                    }
                }
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    bundle.remove((String) obj);
                }
                bundle.putString("pm", "1");
            }
        } catch (Throwable th2) {
            qf.a.a(f.class, th2);
        }
    }

    public final void a() {
        HashSet hashSet;
        if (qf.a.b(this)) {
            return;
        }
        try {
            e0 e0VarK = h0.k(s.b(), false);
            if (e0VarK == null) {
                return;
            }
            JSONArray jSONArray = e0VarK.f40011p;
            HashSet hashSet2 = null;
            if (qf.a.b(this) || jSONArray == null) {
                hashSet = null;
            } else {
                try {
                    if (jSONArray.length() != 0) {
                        hashSet = new HashSet();
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            String string = jSONArray.getString(i11);
                            m.e(string, "jsonArray.getString(i)");
                            hashSet.add(string);
                        }
                    }
                } catch (Throwable th2) {
                    qf.a.a(this, th2);
                }
                hashSet = null;
            }
            if (hashSet == null) {
                if (!qf.a.b(this)) {
                    try {
                        hashSet2 = (HashSet) f23402c.getValue();
                    } catch (Throwable th3) {
                        qf.a.a(this, th3);
                    }
                }
                hashSet = hashSet2;
            }
            f23403d = hashSet;
        } catch (Throwable th4) {
            qf.a.a(this, th4);
        }
    }

    public final boolean c(Bundle bundle) {
        if (qf.a.b(this) || bundle == null) {
            return false;
        }
        try {
            return bundle.containsKey("pm") && m.a(bundle.get("pm"), "1");
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return false;
        }
    }
}
