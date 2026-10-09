package se;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import lf.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lf.d f51618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f51620c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f51621d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51622e;

    public y(lf.d dVar, String str) {
        this.f51618a = dVar;
        this.f51619b = str;
    }

    public final synchronized void a(f event) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.m.f(event, "event");
            if (this.f51620c.size() + this.f51621d.size() >= 1000) {
                this.f51622e++;
            } else {
                this.f51620c.add(event);
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final synchronized List b() {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = this.f51620c;
            this.f51620c = new ArrayList();
            return arrayList;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public final int c(re.y yVar, Context context, boolean z11, boolean z12) {
        Throwable th2;
        Throwable th3;
        if (qf.a.b(this)) {
            return 0;
        }
        try {
            try {
                synchronized (this) {
                    try {
                        int i11 = this.f51622e;
                        xe.b.b(this.f51620c);
                        this.f51621d.addAll(this.f51620c);
                        this.f51620c.clear();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        ArrayList arrayList = this.f51621d;
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            try {
                                Object obj = arrayList.get(i12);
                                i12++;
                                f fVar = (f) obj;
                                if (z11 || !fVar.f51594c) {
                                    jSONArray.put(fVar.f51592a);
                                    jSONArray2.put(fVar.f51593b);
                                }
                            } catch (Throwable th4) {
                                th3 = th4;
                                throw th3;
                            }
                        }
                        if (jSONArray.length() != 0) {
                            d(yVar, context, i11, jSONArray, jSONArray2, z12);
                            return jSONArray.length();
                        }
                        try {
                            return 0;
                        } catch (Throwable th5) {
                            th2 = th5;
                        }
                    } catch (Throwable th6) {
                        th3 = th6;
                    }
                    qf.a.a(this, th2);
                    return 0;
                }
            } catch (Throwable th7) {
                th = th7;
                th2 = th;
            }
        } catch (Throwable th8) {
            th = th8;
            th2 = th;
        }
    }

    public final void d(re.y yVar, Context context, int i11, JSONArray jSONArray, JSONArray jSONArray2, boolean z11) {
        JSONObject jSONObject;
        try {
            if (qf.a.b(this)) {
                return;
            }
            try {
                jSONObject = ef.g.a(ef.f.CUSTOM_APP_EVENTS, this.f51618a, this.f51619b, z11, context);
                if (this.f51622e > 0) {
                    jSONObject.put("num_skipped_events", i11);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            yVar.f49230c = jSONObject;
            Bundle bundle = yVar.f49231d;
            String string = jSONArray.toString();
            kotlin.jvm.internal.m.e(string, "events.toString()");
            bundle.putString("custom_events", string);
            if (a0.b(lf.x.IapLoggingLib5To7)) {
                bundle.putString("operational_parameters", jSONArray2.toString());
            }
            yVar.f49232e = string;
            yVar.f49231d = bundle;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
