package ff;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import lf.a0;
import lf.x;
import ns.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import oz.q;
import re.s;
import re.v;
import re.y;
import ry.n;
import ry.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f27245a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f27246b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f27247c = o.L("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f27248d = o.L("none", gkbGsXmgaxRjJ.Eiae, "health");

    public static final File d(d task) {
        if (!qf.a.b(g.class)) {
            try {
                m.f(task, "task");
                e eVar = (e) f27246b.get(task.b());
                if (eVar != null) {
                    return eVar.f27241f;
                }
            } catch (Throwable th2) {
                qf.a.a(g.class, th2);
                return null;
            }
        }
        return null;
    }

    public static final String[] f(d task, float[][] fArr, String[] strArr) {
        b bVar;
        if (!qf.a.b(g.class)) {
            try {
                m.f(task, "task");
                e eVar = (e) f27246b.get(task.b());
                if (eVar != null && (bVar = eVar.f27242g) != null) {
                    float[] fArr2 = eVar.f27240e;
                    int length = strArr.length;
                    int length2 = fArr[0].length;
                    a aVar = new a(new int[]{length, length2});
                    for (int i11 = 0; i11 < length; i11++) {
                        System.arraycopy(fArr[i11], 0, aVar.f27222c, i11 * length2, length2);
                    }
                    a aVarA = bVar.a(aVar, strArr, task.a());
                    if (aVarA != null && fArr2 != null && aVarA.f27222c.length != 0 && fArr2.length != 0) {
                        int i12 = f.f27244a[task.ordinal()];
                        g gVar = f27245a;
                        if (i12 == 1) {
                            return gVar.h(aVarA, fArr2);
                        }
                        if (i12 == 2) {
                            return gVar.g(aVarA, fArr2);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(g.class, th2);
                return null;
            }
        }
        return null;
    }

    public final void a(JSONObject jSONObject) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    e eVarD = o.d(jSONObject.getJSONObject(itKeys.next()));
                    if (eVarD != null) {
                        f27246b.put(eVarD.f27236a, eVarD);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[Catch: all -> 0x008c, TryCatch #2 {all -> 0x008c, blocks: (B:5:0x0008, B:6:0x001b, B:8:0x0021, B:10:0x0040, B:12:0x0050, B:24:0x0080, B:23:0x007c, B:27:0x008e, B:29:0x009a, B:31:0x00aa, B:34:0x00bb, B:36:0x00c1, B:15:0x0057, B:19:0x0069), top: B:42:0x0008, inners: #1 }] */
    public final void b() {
        Locale locale;
        if (qf.a.b(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int iMax = 0;
            String str = null;
            for (Map.Entry entry : f27246b.entrySet()) {
                String str2 = (String) entry.getKey();
                e eVar = (e) entry.getValue();
                if (m.a(str2, d.MTML_APP_EVENT_PREDICTION.b())) {
                    str = eVar.f27237b;
                    iMax = Math.max(iMax, eVar.f27239d);
                    if (a0.b(x.SuggestedEvents) && !qf.a.b(this)) {
                        try {
                            try {
                                locale = s.a().getResources().getConfiguration().locale;
                            } catch (Exception unused) {
                                locale = null;
                            }
                            if (locale != null) {
                                String language = locale.getLanguage();
                                m.e(language, "locale.language");
                                if (q.v0(language, "en", false)) {
                                    eVar.f27243h = new cf.c(6);
                                    arrayList.add(eVar);
                                }
                            } else {
                                eVar.f27243h = new cf.c(6);
                                arrayList.add(eVar);
                            }
                        } catch (Throwable th2) {
                            qf.a.a(this, th2);
                        }
                    }
                }
                if (m.a(str2, d.MTML_INTEGRITY_DETECT.b())) {
                    str = eVar.f27237b;
                    iMax = Math.max(iMax, eVar.f27239d);
                    if (a0.b(x.IntelligentIntegrity)) {
                        eVar.f27243h = new cf.c(7);
                        arrayList.add(eVar);
                    }
                }
            }
            if (str == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            o.u(new e("MTML", str, null, iMax, null), arrayList);
        } catch (Throwable th3) {
            qf.a.a(this, th3);
        }
    }

    public final JSONObject c() {
        if (!qf.a.b(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
                String str = y.f49225j;
                y yVarB = v.B(null, "app/model_asset", null);
                yVarB.f49231d = bundle;
                JSONObject jSONObject = yVarB.c().f49124b;
                if (jSONObject != null) {
                    return e(jSONObject);
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final JSONObject e(JSONObject jSONObject) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public final String[] g(a aVar, float[] fArr) {
        if (!qf.a.b(this)) {
            try {
                int[] iArr = aVar.f27220a;
                int i11 = iArr[0];
                int i12 = iArr[1];
                float[] fArr2 = aVar.f27222c;
                if (i12 == fArr.length) {
                    lz.g gVarU = hz.b.U(0, i11);
                    ArrayList arrayList = new ArrayList(n.W(gVarU, 10));
                    Iterator it = gVarU.iterator();
                    while (((lz.f) it).f40537c) {
                        int iNextInt = ((w) it).nextInt();
                        Object obj = "none";
                        int length = fArr.length;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < length) {
                            int i15 = i14 + 1;
                            if (fArr2[(iNextInt * i12) + i14] >= fArr[i13]) {
                                obj = f27248d.get(i14);
                            }
                            i13++;
                            i14 = i15;
                        }
                        arrayList.add((String) obj);
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final String[] h(a aVar, float[] fArr) {
        if (!qf.a.b(this)) {
            try {
                int[] iArr = aVar.f27220a;
                int i11 = iArr[0];
                int i12 = iArr[1];
                float[] fArr2 = aVar.f27222c;
                if (i12 == fArr.length) {
                    lz.g gVarU = hz.b.U(0, i11);
                    ArrayList arrayList = new ArrayList(n.W(gVarU, 10));
                    Iterator it = gVarU.iterator();
                    while (((lz.f) it).f40537c) {
                        int iNextInt = ((w) it).nextInt();
                        Object obj = "other";
                        int length = fArr.length;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < length) {
                            int i15 = i14 + 1;
                            if (fArr2[(iNextInt * i12) + i14] >= fArr[i13]) {
                                obj = f27247c.get(i14);
                            }
                            i13++;
                            i14 = i15;
                        }
                        arrayList.add((String) obj);
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return null;
            }
        }
        return null;
    }
}
