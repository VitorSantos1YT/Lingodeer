package gf;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import lf.e0;
import lf.h0;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f29182a = new d();

    public static final Bundle a(e eventType, String str, List list) {
        if (!qf.a.b(d.class)) {
            try {
                m.f(eventType, "eventType");
                Bundle bundle = new Bundle();
                bundle.putString("event", eventType.toString());
                bundle.putString("app_id", str);
                if (e.CUSTOM_APP_EVENTS != eventType) {
                    return bundle;
                }
                JSONArray jSONArrayB = f29182a.b(str, list);
                if (jSONArrayB.length() != 0) {
                    bundle.putString("custom_events", jSONArrayB.toString());
                    return bundle;
                }
            } catch (Throwable th2) {
                qf.a.a(d.class, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public final JSONArray b(String str, List list) {
        boolean z11;
        if (qf.a.b(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayListC1 = ry.m.c1(list);
            xe.b.b(arrayListC1);
            int i11 = 0;
            if (qf.a.b(this)) {
                z11 = false;
            } else {
                try {
                    e0 e0VarK = h0.k(str, false);
                    if (e0VarK != null) {
                        z11 = e0VarK.f39997a;
                    } else {
                        z11 = false;
                    }
                } catch (Throwable th2) {
                    qf.a.a(this, th2);
                }
            }
            int size = arrayListC1.size();
            while (i11 < size) {
                Object obj = arrayListC1.get(i11);
                i11++;
                se.f fVar = (se.f) obj;
                boolean z12 = fVar.f51594c;
                if (!z12 || (z12 && z11)) {
                    jSONArray.put(fVar.f51592a);
                }
            }
            return jSONArray;
        } catch (Throwable th3) {
            qf.a.a(this, th3);
            return null;
        }
    }
}
