package o00;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.facebook.AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;
import com.lingo.lingoskill.ui.review.BaseReviewEmptyActivity;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dt.a0;
import g00.d1;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import jt.m2;
import jt.n2;
import jt.o2;
import jt.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import kv.e0;
import kv.f0;
import kv.i0;
import kv.j0;
import kv.l;
import kv.p;
import kv.q;
import kv.s;
import kv.t;
import kv.u;
import kv.v;
import kv.w;
import kv.y;
import kv.z;
import lf.j1;
import lp.j;
import nf.c;
import nf.e;
import ns.o;
import ob.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import oz.r;
import oz.x;
import qx.b;
import re.g0;
import re.h;
import re.k;
import ry.n;
import vf.eq.EHjhWcesDUIsIw;
import xt.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f44465b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44466a;

    public /* synthetic */ a(int i11) {
        this.f44466a = i11;
    }

    public static final e A(File file) {
        c cVar;
        m.f(file, "file");
        e eVar = new e();
        String name = file.getName();
        m.e(name, "file.name");
        eVar.f43765a = name;
        if (x.s0(name, "crash_log_", false)) {
            cVar = c.CrashReport;
        } else if (x.s0(name, "shield_log_", false)) {
            cVar = c.CrashShield;
        } else if (x.s0(name, "thread_check_log_", false)) {
            cVar = c.ThreadCheck;
        } else if (x.s0(name, "analysis_log_", false)) {
            cVar = c.Analysis;
        } else {
            cVar = x.s0(name, "anr_log_", false) ? c.AnrReport : c.Unknown;
        }
        eVar.f43766b = cVar;
        JSONObject jSONObjectH = f.H(name);
        if (jSONObjectH != null) {
            eVar.f43771g = Long.valueOf(jSONObjectH.optLong("timestamp", 0L));
            eVar.f43768d = jSONObjectH.optString("app_version", null);
            eVar.f43769e = jSONObjectH.optString("reason", null);
            eVar.f43770f = jSONObjectH.optString("callstack", null);
            eVar.f43767c = jSONObjectH.optJSONArray("feature_names");
        }
        return eVar;
    }

    public static void B(int i11, Object obj, Throwable th2, String str, Object... objArr) {
        if (i11 >= 5) {
            String strConcat = "FileDownloader.".concat((obj instanceof Class ? (Class) obj : obj.getClass()).getSimpleName());
            int i12 = ew.f.f25949a;
            Log.println(i11, strConcat, String.format(Locale.ENGLISH, str, objArr));
            if (th2 != null) {
                th2.printStackTrace();
            }
        }
    }

    public static final o2 C(String remainingInput, CourseWord courseWord, int i11, boolean z11) {
        m.f(remainingInput, "remainingInput");
        return D(remainingInput, J(new String[]{courseWord.getWord(), courseWord.getZhuYin(), courseWord.getLuoMa(), courseWord.getKunreiShikiLuoMa(), courseWord.getHepburnLuoMa()}, i11), i11, z11);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x012b A[EDGE_INSN: B:57:0x012b->B:58:0x012c BREAK  A[LOOP:1: B:15:0x0041->B:68:0x0041]] */
    public static final o2 D(String str, List list, int i11, boolean z11) {
        int iIntValue;
        Integer numValueOf;
        ArrayList arrayListM = w4.c.m(str, "remainingInput");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer numK = K(i11, str, (String) it.next());
            if (numK != null) {
                arrayListM.add(numK);
            }
        }
        Integer num = (Integer) ry.m.B0(arrayListM);
        if (num != null) {
            return new o2(true, num.intValue());
        }
        if (!z11) {
            iIntValue = 0;
            break;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            Integer numValueOf2 = null;
            if (!it2.hasNext()) {
                Integer num2 = (Integer) ry.m.B0(arrayList);
                if (num2 == null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        String str2 = (String) it3.next();
                        sy.c cVarN = N(str);
                        int iB = N(str2).b();
                        if (iB > cVarN.b()) {
                            numValueOf = null;
                        } else {
                            Iterator it4 = ry.m.U0(cVarN, iB).iterator();
                            int length = 0;
                            while (it4.hasNext()) {
                                length += ((n2) it4.next()).f37083a.length();
                            }
                            numValueOf = Integer.valueOf(length);
                        }
                        if (numValueOf != null) {
                            arrayList2.add(numValueOf);
                        }
                    }
                    Integer num3 = (Integer) ry.m.C0(arrayList2);
                    if (num3 == null) {
                        iIntValue = 0;
                        break;
                    }
                    iIntValue = num3.intValue();
                    break;
                }
                iIntValue = num2.intValue();
                break;
            }
            String str3 = (String) it2.next();
            sy.c cVarN2 = N(str);
            sy.c cVarN3 = N(str3);
            if (cVarN3.b() <= cVarN2.b()) {
                ListIterator listIterator = cVarN3.listIterator(0);
                int i12 = 0;
                while (true) {
                    sy.a aVar = (sy.a) listIterator;
                    if (!aVar.hasNext()) {
                        Iterator it5 = ry.m.U0(cVarN2, cVarN3.f51934b).iterator();
                        int length2 = 0;
                        while (it5.hasNext()) {
                            length2 += ((n2) it5.next()).f37083a.length();
                        }
                        numValueOf2 = Integer.valueOf(length2);
                        break;
                    }
                    Object next = aVar.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        o.V();
                        throw null;
                    }
                    if (!G(i11, ((n2) cVarN2.get(i12)).f37083a).equals(G(i11, ((n2) next).f37083a))) {
                        break;
                    }
                    i12 = i13;
                }
            }
            if (numValueOf2 != null) {
                arrayList.add(numValueOf2);
            }
        }
        return new o2(false, iIntValue);
    }

    public static Intent E(Context context, String title) {
        m.f(context, "context");
        m.f(title, "title");
        Intent intent = new Intent(context, (Class<?>) BaseReviewEmptyActivity.class);
        intent.putExtra(INTENTS.EXTRA_STRING, title);
        return intent;
    }

    public static final String F(int i11, String text) {
        m.f(text, "text");
        return md.a.x(a0.w(i11, text, true));
    }

    public static final String G(int i11, String text) {
        m.f(text, "text");
        String strX = md.a.x(a0.w(i11, text, false));
        return a0.z(i11) ? strX : md.a.y(strX);
    }

    public static final String H(String str) {
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        m.e(strNormalize, "normalize(...)");
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < strNormalize.length(); i11++) {
            char cCharAt = strNormalize.charAt(i11);
            if (!y(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public static final i0 I(j0 j0Var, kv.a resolver) {
        String strY0;
        Object mVar;
        Object lVar;
        m.f(j0Var, "<this>");
        m.f(resolver, "resolver");
        String str = j0Var.f38760a;
        int i11 = j0Var.f38761b;
        String str2 = j0Var.f38762c;
        String strA = resolver.a(j0Var.f38763d);
        List list = j0Var.f38764e;
        int i12 = 10;
        ArrayList arrayList = new ArrayList(n.W(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            List<w> list2 = zVar.f38837b;
            ArrayList arrayList2 = new ArrayList(n.W(list2, i12));
            for (w wVar : list2) {
                if (wVar instanceof u) {
                    ArrayList arrayListC = b.C(resolver.a(((u) wVar).f38819a));
                    mVar = new kv.o(ry.m.y0(arrayListC, BuildConfig.VERSION_NAME, null, null, new t0(19), 30), arrayListC);
                    it = it;
                } else {
                    if (wVar instanceof v) {
                        v vVar = (v) wVar;
                        lVar = new p(resolver.a(vVar.f38823a), vVar.f38824b, vVar.f38825c);
                    } else if (wVar instanceof t) {
                        t tVar = (t) wVar;
                        lVar = new kv.n(tVar.f38817c, resolver.a(tVar.f38815a), r.g0(resolver.a(tVar.f38816b)));
                    } else if (wVar instanceof kv.r) {
                        f0 f0Var = ((kv.r) wVar).f38812a;
                        lVar = new l(new e0(f0Var.f38740d, f0Var.f38741e, f0Var.f38737a, f0Var.f38738b, resolver.a(f0Var.f38739c)));
                        mVar = lVar;
                    } else {
                        it = it;
                        if (!(wVar instanceof s)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mVar = new kv.m(((s) wVar).f38814a);
                    }
                    mVar = lVar;
                }
                arrayList2.add(mVar);
                it = it;
            }
            Iterator it2 = it;
            String strA2 = resolver.a(zVar.f38836a);
            ArrayList arrayList3 = new ArrayList(n.W(arrayList2, 10));
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                q qVar = (q) obj;
                if (qVar instanceof kv.o) {
                    strY0 = ((kv.o) qVar).f38787a;
                } else if (qVar instanceof p) {
                    p pVar = (p) qVar;
                    strY0 = ry.m.y0(ry.l.T(new String[]{pVar.f38802b, pVar.f38801a}), " ", null, null, null, 62);
                } else if (qVar instanceof kv.n) {
                    kv.n nVar = (kv.n) qVar;
                    List listL = o.L(ep.a.D(nVar.f38782a, ": ", nVar.f38783b), ry.m.y0(nVar.f38784c, "\n", null, null, new t0(20), 30));
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : listL) {
                        if (!oz.q.K0((String) obj2)) {
                            arrayList4.add(obj2);
                        }
                    }
                    strY0 = ry.m.y0(arrayList4, "\n", null, null, null, 62);
                } else if (qVar instanceof l) {
                    strY0 = BuildConfig.VERSION_NAME;
                } else {
                    if (!(qVar instanceof kv.m)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strY0 = ry.m.y0(((kv.m) qVar).f38781a, "\n", null, null, new t0(21), 30);
                }
                arrayList3.add(strY0);
            }
            ArrayList arrayList5 = new ArrayList();
            int size2 = arrayList3.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj3 = arrayList3.get(i14);
                i14++;
                if (!oz.q.K0((String) obj3)) {
                    arrayList5.add(obj3);
                }
            }
            String strY1 = ry.m.y0(arrayList5, "\n\n", null, null, null, 62);
            ArrayList arrayList6 = new ArrayList();
            int size3 = arrayList2.size();
            int i15 = 0;
            while (i15 < size3) {
                Object obj4 = arrayList2.get(i15);
                i15++;
                if (obj4 instanceof l) {
                    arrayList6.add(obj4);
                }
            }
            ArrayList arrayList7 = new ArrayList(n.W(arrayList6, 10));
            int size4 = arrayList6.size();
            int i16 = 0;
            while (i16 < size4) {
                Object obj5 = arrayList6.get(i16);
                i16++;
                arrayList7.add(((l) obj5).f38776a);
            }
            arrayList.add(new y(strA2, strY1, arrayList7, arrayList2));
            i12 = 10;
            it = it2;
        }
        return new i0(str, i11, str2, strA, arrayList, j0Var.f38765f, j0Var.f38766g, j0Var.f38767h, j0Var.f38768i);
    }

    public static final List J(String[] rawCandidates, int i11) {
        m.f(rawCandidates, "rawCandidates");
        sy.c cVarO = o.o();
        for (String str : rawCandidates) {
            cVarO.add(F(i11, oz.q.i1(str).toString()));
        }
        sy.c cVarE = o.e(cVarO);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = cVarE.listIterator(0);
        while (true) {
            sy.a aVar = (sy.a) listIterator;
            if (!aVar.hasNext()) {
                return ry.m.j0(arrayList);
            }
            Object next = aVar.next();
            if (((String) next).length() > 0) {
                arrayList.add(next);
            }
        }
    }

    public static final Integer K(int i11, String str, String str2) {
        boolean zEquals;
        sy.c cVarN = N(str);
        sy.c cVarN2 = N(str2);
        if (cVarN2.b() <= cVarN.b()) {
            int length = 0;
            ListIterator listIterator = cVarN2.listIterator(0);
            int i12 = 0;
            while (true) {
                sy.a aVar = (sy.a) listIterator;
                if (!aVar.hasNext()) {
                    Iterator it = ry.m.U0(cVarN, cVarN2.b()).iterator();
                    while (it.hasNext()) {
                        length += ((n2) it.next()).f37083a.length();
                    }
                    return Integer.valueOf(length);
                }
                Object next = aVar.next();
                int i13 = i12 + 1;
                if (i12 < 0) {
                    o.V();
                    throw null;
                }
                n2 n2Var = (n2) next;
                n2 n2Var2 = (n2) cVarN.get(i12);
                if (a0.z(i11)) {
                    zEquals = G(i11, n2Var2.f37083a).equals(G(i11, n2Var.f37083a));
                } else {
                    boolean z11 = true;
                    if (!d.u(i11)) {
                        String strNormalize = Normalizer.normalize(n2Var2.f37083a, Normalizer.Form.NFD);
                        m.e(strNormalize, "normalize(...)");
                        int i14 = 0;
                        while (true) {
                            if (i14 >= strNormalize.length()) {
                                z11 = false;
                                break;
                            }
                            if (y(strNormalize.charAt(i14))) {
                                break;
                            }
                            i14++;
                        }
                    } else {
                        String strNormalize2 = Normalizer.normalize(n2Var2.f37083a, Normalizer.Form.NFD);
                        m.e(strNormalize2, "normalize(...)");
                        int i15 = 0;
                        while (true) {
                            if (i15 >= strNormalize2.length()) {
                                z11 = false;
                                break;
                            }
                            char cCharAt = strNormalize2.charAt(i15);
                            if (cCharAt == 768 || cCharAt == 769 || cCharAt == 772 || cCharAt == 780) {
                                break;
                            }
                            i15++;
                        }
                    }
                    String str3 = n2Var2.f37083a;
                    if (z11) {
                        Normalizer.Form form = Normalizer.Form.NFC;
                        zEquals = m.a(Normalizer.normalize(str3, form), Normalizer.normalize(n2Var.f37083a, form));
                    } else {
                        zEquals = G(i11, str3).equals(G(i11, n2Var.f37083a));
                    }
                }
                if (zEquals) {
                    i12 = i13;
                }
            }
        }
        return null;
    }

    public static void L(h hVar) {
        boolean zEquals;
        tw.c cVar = k.f49181d;
        k kVar = k.f49182e;
        if (kVar == null) {
            synchronized (cVar) {
                kVar = k.f49182e;
                if (kVar == null) {
                    x6.b bVarA = x6.b.a(re.s.a());
                    m.e(bVarA, "getInstance(applicationContext)");
                    k kVar2 = new k(bVarA, new j(24));
                    k.f49182e = kVar2;
                    kVar = kVar2;
                }
            }
        }
        j jVar = (j) kVar.f49186b;
        h hVar2 = (h) kVar.f49187c;
        kVar.f49187c = hVar;
        if (hVar != null) {
            try {
                ((SharedPreferences) jVar.f40203b).edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", hVar.a().toString()).apply();
            } catch (JSONException unused) {
            }
        } else {
            ((SharedPreferences) jVar.f40203b).edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
            j1.c(re.s.a());
        }
        if (hVar2 == null) {
            zEquals = hVar == null;
        } else {
            zEquals = hVar2.equals(hVar);
        }
        if (zEquals) {
            return;
        }
        Intent intent = new Intent(re.s.a(), (Class<?>) AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", hVar2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", hVar);
        kVar.f49185a.c(intent);
    }

    public static int M(Context context, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i11});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final sy.c N(String str) {
        sy.c cVarO = o.o();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (!y(cCharAt) || cVarO.isEmpty()) {
                cVarO.add(new n2(String.valueOf(cCharAt)));
            } else {
                cVarO.set(o.A(cVarO), new n2(((n2) cVarO.get(o.A(cVarO))).f37083a + cCharAt));
            }
        }
        return o.e(cVarO);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    public static final int O(boolean z11, m0.p pVar, int i11) {
        return z11 ? ((m0.q) pVar.m.get(i11)).f40620p : ((m0.q) pVar.m.get(i11)).f40621q;
    }

    public static void P(Object obj, String str, Object... objArr) {
        B(5, obj, null, str, objArr);
    }

    public static byte[] a(String str) {
        try {
            Charset UTF_8 = StandardCharsets.UTF_8;
            m.e(UTF_8, "UTF_8");
            byte[] bytes = str.getBytes(UTF_8);
            m.e(bytes, "getBytes(...)");
            byte[] bArrDecode = Base64.decode(bytes, 2);
            m.e(bArrDecode, "decode(...)");
            return bArrDecode;
        } catch (NullPointerException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static String b(String str) {
        try {
            Charset UTF_8 = StandardCharsets.UTF_8;
            m.e(UTF_8, "UTF_8");
            byte[] bytes = str.getBytes(UTF_8);
            m.e(bytes, "getBytes(...)");
            byte[] bArrEncode = Base64.encode(bytes, 2);
            m.c(bArrEncode);
            return new String(bArrEncode, UTF_8);
        } catch (NullPointerException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static String c(byte[] bArr) {
        try {
            byte[] bArrEncode = Base64.encode(bArr, 2);
            m.c(bArrEncode);
            Charset UTF_8 = StandardCharsets.UTF_8;
            m.e(UTF_8, "UTF_8");
            return new String(bArrEncode, UTF_8);
        } catch (NullPointerException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static final e d(String str, String str2) {
        e eVar = new e();
        eVar.f43766b = c.AnrReport;
        Context contextA = re.s.a();
        String str3 = null;
        try {
            PackageInfo packageInfo = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0);
            if (packageInfo != null) {
                str3 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        eVar.f43768d = str3;
        eVar.f43769e = str;
        eVar.f43770f = str2;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        eVar.f43771g = lValueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        m.e(string, "StringBuffer()\n         …)\n            .toString()");
        eVar.f43765a = string;
        return eVar;
    }

    public static final e e(Throwable th2, c t6) {
        String str;
        String str2;
        m.f(t6, "t");
        e eVar = new e();
        eVar.f43766b = t6;
        Context contextA = re.s.a();
        Throwable th3 = null;
        try {
            PackageInfo packageInfo = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0);
            str = packageInfo == null ? null : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        eVar.f43768d = str;
        eVar.f43769e = th2.getCause() == null ? th2.toString() : String.valueOf(th2.getCause());
        JSONArray jSONArray = new JSONArray();
        while (th2 != null && th2 != th3) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            m.e(stackTrace, "t.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                jSONArray.put(stackTraceElement.toString());
            }
            th3 = th2;
            th2 = th2.getCause();
        }
        eVar.f43770f = jSONArray.toString();
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        eVar.f43771g = lValueOf;
        StringBuffer stringBuffer = new StringBuffer();
        int i11 = nf.b.f43763a[t6.ordinal()];
        if (i11 == 1) {
            str2 = "analysis_log_";
        } else if (i11 == 2) {
            str2 = "anr_log_";
        } else if (i11 == 3) {
            str2 = "crash_log_";
        } else if (i11 != 4) {
            str2 = i11 != 5 ? "Unknown" : "thread_check_log_";
        } else {
            str2 = "shield_log_";
        }
        stringBuffer.append(str2);
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        m.e(string, "StringBuffer().append(t.…ppend(\".json\").toString()");
        eVar.f43765a = string;
        return eVar;
    }

    public static final ArrayList f(int i11, String str, List list) {
        OptionItemSelectedState optionItemSelectedState;
        String strF = F(i11, str);
        if (x(i11, strF)) {
            ArrayList arrayList = new ArrayList(n.W(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List<m2> list2 = (List) it.next();
                ArrayList arrayList2 = new ArrayList(n.W(list2, 10));
                for (m2 m2Var : list2) {
                    String[] strArr = (String[]) m2Var.f37075c.toArray(new String[0]);
                    List listJ = J((String[]) Arrays.copyOf(strArr, strArr.length), i11);
                    if (m2Var.f37074b == 1 || m.a(m2Var.f37073a, " ") || listJ.isEmpty()) {
                        optionItemSelectedState = OptionItemSelectedState.DEFAULT;
                    } else {
                        o2 o2VarD = D(strF, listJ, i11, true);
                        int i12 = o2VarD.f37095b;
                        if (i12 > 0) {
                            strF = oz.q.y0(i12, strF);
                        }
                        optionItemSelectedState = o2VarD.f37094a ? OptionItemSelectedState.CORRECT : OptionItemSelectedState.WRONG;
                    }
                    arrayList2.add(optionItemSelectedState);
                }
                arrayList.add(arrayList2);
            }
            return arrayList;
        }
        if (str.length() <= 0) {
            ArrayList arrayList3 = new ArrayList(n.W(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                List<m2> list3 = (List) it2.next();
                ArrayList arrayList4 = new ArrayList(n.W(list3, 10));
                for (m2 m2Var2 : list3) {
                    arrayList4.add(OptionItemSelectedState.DEFAULT);
                }
                arrayList3.add(arrayList4);
            }
            return arrayList3;
        }
        ArrayList arrayList5 = new ArrayList(n.W(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            List<m2> list4 = (List) it3.next();
            ArrayList arrayList6 = new ArrayList(n.W(list4, 10));
            for (m2 m2Var3 : list4) {
                String[] strArr2 = (String[]) m2Var3.f37075c.toArray(new String[0]);
                arrayList6.add((m2Var3.f37074b == 1 || m.a(m2Var3.f37073a, " ") || J((String[]) Arrays.copyOf(strArr2, strArr2.length), i11).isEmpty()) ? OptionItemSelectedState.DEFAULT : OptionItemSelectedState.WRONG);
            }
            arrayList5.add(arrayList6);
        }
        return arrayList5;
    }

    public static Object g(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final qy.r h(int i11, String str) {
        boolean z11;
        boolean z12;
        int i12 = 0;
        if (str.length() <= 0) {
            HashMap map = new HashMap();
            if (i11 > 0) {
                if (i11 > 1) {
                    for (int i13 = 1; i13 < i11; i13++) {
                        f44465b++;
                        map.put(Integer.valueOf(i13), Long.valueOf((System.currentTimeMillis() / 1000) + f44465b));
                    }
                }
                f44465b++;
                map.put(Integer.valueOf(i11), Long.valueOf((System.currentTimeMillis() / 1000) + f44465b));
                z11 = true;
            } else {
                z11 = false;
            }
            StringBuilder sb2 = new StringBuilder();
            Set setKeySet = map.keySet();
            m.e(setKeySet, "<get-keys>(...)");
            int i14 = 0;
            for (Object obj : ry.m.S0(setKeySet, new b4.e(14))) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    o.V();
                    throw null;
                }
                Integer num = (Integer) obj;
                sb2.append(num + ":" + map.get(num));
                if (i14 < map.keySet().size() - 1) {
                    sb2.append(";");
                }
                i14 = i15;
            }
            return new qy.r(sb2.toString(), Boolean.valueOf(z11), Integer.valueOf(i11));
        }
        HashMap map2 = new HashMap();
        Iterator it = oz.q.W0(str, new String[]{";"}, 0, 6).iterator();
        int i16 = 0;
        while (it.hasNext()) {
            List listW0 = oz.q.W0((String) it.next(), new String[]{":"}, i12, 6);
            int i17 = Integer.parseInt((String) listW0.get(i12));
            map2.put(Integer.valueOf(i17), Long.valueOf(Long.parseLong((String) listW0.get(1))));
            if (i17 >= i16) {
                i16 = i17;
            }
            i12 = 0;
        }
        if (i11 > i16) {
            if (i11 - i16 > 1) {
                for (int i18 = i16 + 1; i18 < i11; i18++) {
                    f44465b++;
                    map2.put(Integer.valueOf(i18), Long.valueOf((System.currentTimeMillis() / 1000) + f44465b));
                }
            }
            f44465b++;
            map2.put(Integer.valueOf(i11), Long.valueOf((System.currentTimeMillis() / 1000) + f44465b));
            z12 = true;
        } else {
            z12 = false;
        }
        StringBuilder sb3 = new StringBuilder();
        Set setKeySet2 = map2.keySet();
        m.e(setKeySet2, "<get-keys>(...)");
        int i19 = 0;
        for (Object obj2 : ry.m.S0(setKeySet2, new b4.e(15))) {
            int i21 = i19 + 1;
            if (i19 < 0) {
                o.V();
                throw null;
            }
            Integer num2 = (Integer) obj2;
            sb3.append(num2 + ":" + map2.get(num2));
            if (i19 < map2.keySet().size() - 1) {
                sb3.append(";");
            }
            i19 = i21;
        }
        return new qy.r(sb3.toString(), Boolean.valueOf(z12), Integer.valueOf(i11));
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] j(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            jArr[i11] = iArr[i11];
        }
        return jArr;
    }

    public static void k(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[OSSConstants.DEFAULT_BUFFER_SIZE];
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i11);
            }
        }
    }

    public static void l(y5.b bVar, y5.c cVar, int i11) throws IOException {
        byte[] bArr = new byte[OSSConstants.DEFAULT_BUFFER_SIZE];
        while (i11 > 0) {
            int iMin = Math.min(i11, OSSConstants.DEFAULT_BUFFER_SIZE);
            int i12 = bVar.read(bArr, 0, iMin);
            if (i12 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i11 -= i12;
            cVar.write(bArr, 0, i12);
        }
    }

    public static final Bundle m(UUID callId, xf.d shareContent, boolean z11) {
        m.f(callId, "callId");
        m.f(shareContent, "shareContent");
        if (shareContent instanceof xf.f) {
            return o((xf.f) shareContent, z11);
        }
        if (!(shareContent instanceof xf.l)) {
            return null;
        }
        xf.l lVar = (xf.l) shareContent;
        Collection collectionT = b.t(lVar, callId);
        if (collectionT == null) {
            collectionT = ry.r.f50854a;
        }
        Bundle bundleO = o(lVar, z11);
        bundleO.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList<>(collectionT));
        return bundleO;
    }

    public static v5.r n(Context context) {
        ProviderInfo providerInfo;
        w4.d dVar;
        ApplicationInfo applicationInfo;
        g0 bVar = Build.VERSION.SDK_INT >= 28 ? new v5.b(5) : new g0(5);
        PackageManager packageManager = context.getPackageManager();
        o.l(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            dVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrO = bVar.o(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrO) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new w4.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e8) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e8);
                dVar = null;
            }
        }
        if (dVar == null) {
            return null;
        }
        return new v5.r(new v5.q(context, dVar));
    }

    public static Bundle o(xf.d dVar, boolean z11) {
        Bundle bundle = new Bundle();
        Uri uri = dVar.f56025a;
        if (uri != null) {
            j1.G("com.facebook.platform.extra.LINK", uri.toString(), bundle);
        }
        j1.G("com.facebook.platform.extra.PLACE", dVar.f56027c, bundle);
        j1.G("com.facebook.platform.extra.REF", dVar.f56029e, bundle);
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z11);
        List list = dVar.f56026b;
        if (list != null && !list.isEmpty()) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList<>(list));
        }
        return bundle;
    }

    public static void p(Object obj, String str, Object... objArr) {
        B(3, obj, null, str, objArr);
    }

    public static Map q(ry.u uVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itC = uVar.C();
        while (itC.hasNext()) {
            Object objG = uVar.g(itC.next());
            Object wVar = linkedHashMap.get(objG);
            if (wVar == null && !linkedHashMap.containsKey(objG)) {
                wVar = new kotlin.jvm.internal.w();
            }
            kotlin.jvm.internal.w wVar2 = (kotlin.jvm.internal.w) wVar;
            wVar2.f38359a++;
            linkedHashMap.put(objG, wVar2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            m.d(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            if ((entry instanceof gz.a) && !(entry instanceof gz.d)) {
                c0.f(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((kotlin.jvm.internal.w) entry.getValue()).f38359a));
        }
        return c0.c(linkedHashMap);
    }

    public static final c00.a r(g00.b bVar, f00.a aVar, String str) {
        c00.a aVar2;
        m.f(bVar, "<this>");
        com.android.billingclient.api.h hVarA = aVar.a();
        mz.c baseClass = ((c00.c) bVar).f6403a;
        hVarA.getClass();
        m.f(baseClass, "baseClass");
        Map map = (Map) ((Map) hVarA.f7512e).get(baseClass);
        c00.a aVar3 = map != null ? (c00.a) map.get(str) : null;
        if (!(aVar3 instanceof c00.a)) {
            aVar3 = null;
        }
        if (aVar3 != null) {
            aVar2 = aVar3;
        } else {
            Object obj = ((Map) hVarA.f7513f).get(baseClass);
            fz.c cVar = c0.e(1, obj) ? (fz.c) obj : null;
            aVar2 = cVar != null ? (c00.a) cVar.invoke(str) : null;
        }
        if (aVar2 != null) {
            return aVar2;
        }
        d1.l(str, baseClass);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    public static final c00.a s(g00.b bVar, f00.d dVar, Object value) {
        c00.a aVar;
        m.f(bVar, "<this>");
        m.f(value, "value");
        com.android.billingclient.api.h hVarA = dVar.a();
        mz.c baseClass = ((c00.c) bVar).f6403a;
        hVarA.getClass();
        m.f(baseClass, "baseClass");
        if (((kotlin.jvm.internal.e) baseClass).h(value)) {
            Map map = (Map) ((Map) hVarA.f7510c).get(baseClass);
            c00.a aVar2 = map != null ? (c00.a) map.get(kotlin.jvm.internal.z.a(value.getClass())) : null;
            aVar = aVar2 instanceof c00.a ? aVar2 : null;
            if (aVar == null) {
                Object obj = ((Map) hVarA.f7511d).get(baseClass);
                fz.c cVar = c0.e(1, obj) ? (fz.c) obj : null;
                if (cVar != null) {
                    aVar = (c00.a) cVar.invoke(value);
                } else {
                    aVar = null;
                }
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.z.a(value.getClass());
        String strG = eVarA.g();
        if (strG == null) {
            strG = String.valueOf(eVarA);
        }
        d1.l(strG, baseClass);
        throw null;
    }

    public static final qy.l u(int i11, String achievementStr) {
        int i12;
        m.f(achievementStr, "achievementStr");
        if (i11 >= 2000) {
            i12 = 10;
        } else if (i11 >= 1500) {
            i12 = 9;
        } else if (i11 >= 1000) {
            i12 = 8;
        } else if (i11 >= 750) {
            i12 = 7;
        } else if (i11 >= 500) {
            i12 = 6;
        } else if (i11 >= 250) {
            i12 = 5;
        } else if (i11 >= 175) {
            i12 = 4;
        } else if (i11 >= 100) {
            i12 = 3;
        } else if (i11 >= 50) {
            i12 = 2;
        } else {
            i12 = i11 >= 20 ? 1 : 0;
        }
        qy.r rVarH = h(i12, achievementStr);
        Object obj = rVarH.f48505a;
        if (((Boolean) rVarH.f48506b).booleanValue()) {
            return new qy.l(obj, new AchievementLevel(AchievementLevelType.KNOWLEDGE_POINT, ((Number) rVarH.f48507c).intValue(), true, BuildConfig.VERSION_NAME, 0L, BuildConfig.VERSION_NAME, 0, 80, (kotlin.jvm.internal.f) null));
        }
        return new qy.l(obj, null);
    }

    public static final qy.l v(int i11, String achievementStr) {
        int i12;
        m.f(achievementStr, "achievementStr");
        if (i11 >= 30000) {
            i12 = 10;
        } else if (i11 >= 20000) {
            i12 = 9;
        } else if (i11 >= 12500) {
            i12 = 8;
        } else if (i11 >= 7500) {
            i12 = 7;
        } else if (i11 >= 4000) {
            i12 = 6;
        } else if (i11 >= 2000) {
            i12 = 5;
        } else if (i11 >= 1000) {
            i12 = 4;
        } else if (i11 >= 500) {
            i12 = 3;
        } else if (i11 >= 250) {
            i12 = 2;
        } else {
            i12 = i11 >= 100 ? 1 : 0;
        }
        qy.r rVarH = h(i12, achievementStr);
        Object obj = rVarH.f48505a;
        if (((Boolean) rVarH.f48506b).booleanValue()) {
            return new qy.l(obj, new AchievementLevel("xp", ((Number) rVarH.f48507c).intValue(), true, BuildConfig.VERSION_NAME, 0L, BuildConfig.VERSION_NAME, 0, 80, (kotlin.jvm.internal.f) null));
        }
        return new qy.l(obj, null);
    }

    public static final boolean w(int i11, String userInput, String correctText) {
        m.f(userInput, "userInput");
        m.f(correctText, "correctText");
        String strB = a0.B(i11, F(i11, userInput));
        String strB2 = a0.B(i11, F(i11, correctText));
        if (strB.equals(strB2)) {
            return false;
        }
        return m.a(H(strB), H(strB2));
    }

    public static final boolean x(int i11, String str) {
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (Character.isLetterOrDigit(cCharAt) || a0.F(i11, String.valueOf(cCharAt))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y(char c11) {
        int type = Character.getType(c11);
        return type == 6 || type == 7 || type == 8;
    }

    public static final boolean z(int i11, String userInput, String correctText) {
        m.f(userInput, "userInput");
        m.f(correctText, "correctText");
        return a0.B(i11, F(i11, userInput)).equals(a0.B(i11, F(i11, correctText)));
    }

    public int hashCode() {
        switch (this.f44466a) {
            case 4:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f44466a) {
            case 4:
                String strG = kotlin.jvm.internal.z.a(getClass()).g();
                m.c(strG);
                return strG;
            default:
                return super.toString();
        }
    }

    public static final qy.l t(int i11, String achievementStr) {
        int i12;
        m.f(achievementStr, "achievementStr");
        if (i11 >= 365) {
            i12 = 10;
        } else if (i11 >= 250) {
            i12 = 9;
        } else if (i11 >= 180) {
            i12 = 8;
        } else if (i11 >= 125) {
            i12 = 7;
        } else if (i11 >= 75) {
            i12 = 6;
        } else if (i11 >= 50) {
            i12 = 5;
        } else if (i11 >= 30) {
            i12 = 4;
        } else if (i11 >= 14) {
            i12 = 3;
        } else if (i11 >= 7) {
            i12 = 2;
        } else {
            i12 = i11 >= 3 ? 1 : 0;
        }
        qy.r rVarH = h(i12, achievementStr);
        Object obj = rVarH.f48505a;
        if (((Boolean) rVarH.f48506b).booleanValue()) {
            return new qy.l(obj, new AchievementLevel(AchievementLevelType.DAY_STREAK, ((Number) rVarH.f48507c).intValue(), true, EHjhWcesDUIsIw.PCRbzon, 0L, BuildConfig.VERSION_NAME, 0, 80, (kotlin.jvm.internal.f) null));
        }
        return new qy.l(obj, null);
    }
}
