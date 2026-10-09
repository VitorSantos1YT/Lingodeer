package ob;

import aj.uZCn.evRpcb;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.ViewGroup;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.facebook.FacebookException;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.SyllableLessonStatus;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.r3;
import g00.d1;
import g00.g0;
import g00.l1;
import g00.u0;
import g00.u1;
import h1.s1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import jt.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.z;
import kotlinx.serialization.SerializationException;
import kv.b0;
import kv.c0;
import kv.j0;
import kv.l0;
import kv.s0;
import kv.v0;
import lf.a1;
import lf.j1;
import lf.z0;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import oz.w;
import oz.x;
import re.y;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static l2.e f44806a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f44807b = true;

    public static final boolean B(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        kotlin.jvm.internal.m.e(className, "element.className");
        if (x.s0(className, "com.facebook", false)) {
            return true;
        }
        String className2 = stackTraceElement.getClassName();
        kotlin.jvm.internal.m.e(className2, "element.className");
        return x.s0(className2, "com.meta", false);
    }

    public static int D(List list) {
        int i11;
        int i12;
        int i13;
        Iterator it = list.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            List list2 = (List) it.next();
            if (list2.size() < 2) {
                i13 = 536870911;
            } else {
                int iIntValue = ((Number) list2.get(0)).intValue();
                int iIntValue2 = ((Number) list2.get(1)).intValue();
                if (iIntValue < 0) {
                    i11 = -iIntValue;
                } else {
                    i11 = iIntValue > 1024 ? iIntValue - 1024 : 0;
                }
                if (iIntValue2 < 0) {
                    i12 = -iIntValue2;
                } else {
                    i12 = iIntValue2 > 1024 ? iIntValue2 - 1024 : 0;
                }
                i13 = i12 + i11;
            }
            i14 += i13;
        }
        return i14;
    }

    public static final c00.a G(mz.c cVar, ArrayList arrayList, fz.a aVar) {
        c00.a dVar;
        u0 u0Var;
        kotlin.jvm.internal.m.f(cVar, "<this>");
        if (cVar.equals(z.a(Collection.class)) || cVar.equals(z.a(List.class)) || cVar.equals(z.a(List.class)) || cVar.equals(z.a(ArrayList.class))) {
            dVar = new g00.d((c00.a) arrayList.get(0), 0);
        } else if (cVar.equals(z.a(HashSet.class))) {
            dVar = new g00.d((c00.a) arrayList.get(0), 1);
        } else if (cVar.equals(z.a(Set.class)) || cVar.equals(z.a(Set.class)) || cVar.equals(z.a(LinkedHashSet.class))) {
            dVar = new g00.d((c00.a) arrayList.get(0), 2);
        } else if (cVar.equals(z.a(HashMap.class))) {
            dVar = new g0((c00.a) arrayList.get(0), (c00.a) arrayList.get(1), 0);
        } else if (cVar.equals(z.a(Map.class)) || cVar.equals(z.a(Map.class)) || cVar.equals(z.a(LinkedHashMap.class))) {
            dVar = new g0((c00.a) arrayList.get(0), (c00.a) arrayList.get(1), 1);
        } else {
            if (cVar.equals(z.a(Map.Entry.class))) {
                c00.a keySerializer = (c00.a) arrayList.get(0);
                c00.a valueSerializer = (c00.a) arrayList.get(1);
                kotlin.jvm.internal.m.f(keySerializer, "keySerializer");
                kotlin.jvm.internal.m.f(valueSerializer, "valueSerializer");
                u0Var = new u0(keySerializer, valueSerializer, 0);
            } else if (cVar.equals(z.a(qy.l.class))) {
                c00.a keySerializer2 = (c00.a) arrayList.get(0);
                c00.a valueSerializer2 = (c00.a) arrayList.get(1);
                kotlin.jvm.internal.m.f(keySerializer2, "keySerializer");
                kotlin.jvm.internal.m.f(valueSerializer2, "valueSerializer");
                u0Var = new u0(keySerializer2, valueSerializer2, 1);
            } else if (cVar.equals(z.a(qy.r.class))) {
                c00.a aSerializer = (c00.a) arrayList.get(0);
                c00.a bSerializer = (c00.a) arrayList.get(1);
                c00.a cSerializer = (c00.a) arrayList.get(2);
                kotlin.jvm.internal.m.f(aSerializer, "aSerializer");
                kotlin.jvm.internal.m.f(bSerializer, "bSerializer");
                kotlin.jvm.internal.m.f(cSerializer, "cSerializer");
                dVar = new u1(aSerializer, bSerializer, cSerializer);
            } else if (qx.b.p(cVar).isArray()) {
                Object objInvoke = aVar.invoke();
                kotlin.jvm.internal.m.d(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                dVar = qx.b.b((mz.c) objInvoke, (c00.a) arrayList.get(0));
            } else {
                dVar = null;
            }
            dVar = u0Var;
        }
        if (dVar != null) {
            return dVar;
        }
        c00.a[] aVarArr = (c00.a[]) arrayList.toArray(new c00.a[0]);
        return d1.d(cVar, (c00.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }

    public static final JSONObject H(String str) {
        File fileQ = q();
        if (fileQ != null) {
            try {
                return new JSONObject(j1.I(new FileInputStream(new File(fileQ, str))));
            } catch (Exception unused) {
                j(str);
            }
        }
        return null;
    }

    public static final String I(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[OSSConstants.DEFAULT_BUFFER_SIZE];
        int i11 = reader.read(cArr);
        while (i11 >= 0) {
            stringWriter.write(cArr, 0, i11);
            i11 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }

    public static final void J(String str, JSONArray jSONArray, re.u uVar) {
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject jSONObjectO = j1.o();
            if (jSONObjectO != null) {
                Iterator<String> itKeys = jSONObjectO.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectO.get(next));
                }
            }
            String str2 = y.f49225j;
            re.v.C(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{re.s.b()}, 1)), jSONObject, uVar).d();
        } catch (JSONException unused) {
        }
    }

    public static final c00.a K(com.android.billingclient.api.h hVar, mz.k type) {
        kotlin.jvm.internal.m.f(hVar, "<this>");
        kotlin.jvm.internal.m.f(type, "type");
        c00.a aVarG = qx.b.G(hVar, type, true);
        if (aVarG != null) {
            return aVarG;
        }
        mz.c cVarJ = d1.j(type);
        kotlin.jvm.internal.m.f(cVarJ, "<this>");
        String strG = ((kotlin.jvm.internal.e) cVarJ).g();
        if (strG == null) {
            strG = "<local class name not available>";
        }
        throw new SerializationException(ep.a.g("Serializer for class '", strG, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final c00.a L(mz.c cVar) {
        kotlin.jvm.internal.m.f(cVar, "<this>");
        c00.a aVarD = d1.d(cVar, new c00.a[0]);
        return aVarD == null ? (c00.a) l1.f28432a.get(cVar) : aVarD;
    }

    public static final ArrayList M(com.android.billingclient.api.h hVar, List typeArguments, boolean z11) {
        kotlin.jvm.internal.m.f(hVar, "<this>");
        kotlin.jvm.internal.m.f(typeArguments, "typeArguments");
        if (z11) {
            ArrayList arrayList = new ArrayList(ry.n.W(typeArguments, 10));
            Iterator it = typeArguments.iterator();
            while (it.hasNext()) {
                arrayList.add(K(hVar, (mz.k) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(ry.n.W(typeArguments, 10));
        Iterator it2 = typeArguments.iterator();
        while (it2.hasNext()) {
            mz.k type = (mz.k) it2.next();
            kotlin.jvm.internal.m.f(type, "type");
            c00.a aVarG = qx.b.G(hVar, type, false);
            if (aVarG == null) {
                return null;
            }
            arrayList2.add(aVarG);
        }
        return arrayList2;
    }

    public static void N(ViewGroup viewGroup, boolean z11) {
        if (Build.VERSION.SDK_INT >= 29) {
            c3.c.q(viewGroup, z11);
        } else if (f44807b) {
            try {
                c3.c.q(viewGroup, z11);
            } catch (NoSuchMethodError unused) {
                f44807b = false;
            }
        }
    }

    public static final CourseWord O(c0 c0Var, String str, String str2) {
        CourseWord courseWord = new CourseWord(c0Var.f38718a, str, 3);
        String str3 = c0Var.f38719b;
        qy.q qVar = fv.b.f28186a;
        Uri uri = Uri.parse(fv.b.c(se.k.x(str3), null, null));
        kotlin.jvm.internal.m.e(uri, "parse(...)");
        return CourseWord.copy$default(courseWord, 0L, null, str3, str3, str2, null, 0, 0, null, null, null, null, null, null, null, uri, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -32797, 63, null);
    }

    public static boolean P(n20.a aVar, n20.b bVar, yw.c cVar) {
        if (!(aVar instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) aVar).call();
            if (objCall == null) {
                mx.d.b(bVar);
                return true;
            }
            try {
                Object objApply = cVar.apply(objCall);
                ax.d.a(objApply, "The mapper returned a null Publisher");
                n20.a aVar2 = (n20.a) objApply;
                if (!(aVar2 instanceof Callable)) {
                    aVar2.a(bVar);
                    return true;
                }
                try {
                    Object objCall2 = ((Callable) aVar2).call();
                    if (objCall2 == null) {
                        mx.d.b(bVar);
                        return true;
                    }
                    bVar.c(new mx.e(objCall2, bVar));
                    return true;
                } catch (Throwable th2) {
                    fb.g0.D(th2);
                    mx.d.c(th2, bVar);
                    return true;
                }
            } catch (Throwable th3) {
                fb.g0.D(th3);
                mx.d.c(th3, bVar);
                return true;
            }
        } catch (Throwable th4) {
            fb.g0.D(th4);
            mx.d.c(th4, bVar);
            return true;
        }
    }

    public static final void R(String str, String str2) {
        File fileQ = q();
        if (fileQ == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileQ, str));
            byte[] bytes = str2.getBytes(oz.a.f46133a);
            kotlin.jvm.internal.m.e(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public static final long a(int i11) {
        if (!(i11 > 0)) {
            i0.a.a("The span value should be higher than 0");
        }
        return i11;
    }

    public static final Map b(String str) {
        List<String> listW0 = oz.q.W0(str, new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (String str2 : listW0) {
            String lowerCase = oz.q.i1(oz.q.d1(str2, ":", BuildConfig.VERSION_NAME)).toString().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
            Float fJ0 = w.j0(oz.q.i1(oz.q.a1(str2, ":", BuildConfig.VERSION_NAME)).toString());
            qy.l lVar = null;
            Float fValueOf = fJ0 != null ? Float.valueOf(hz.b.k(fJ0.floatValue(), 0.1f, 1.0f)) : null;
            if (!oz.q.K0(lowerCase) && fValueOf != null) {
                lVar = new qy.l(lowerCase, fValueOf);
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return ry.x.g0(arrayList);
    }

    public static final Set c(String str) {
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        List listW0 = oz.q.W0(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listW0.iterator();
        while (it.hasNext()) {
            Integer numT0 = x.t0(oz.q.i1((String) it.next()).toString());
            if (numT0 != null) {
                arrayList.add(numT0);
            }
        }
        return ry.m.f1(arrayList);
    }

    public static final Map d(String str) {
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        List<String> listW0 = oz.q.W0(str, new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (String str2 : listW0) {
            String string = oz.q.i1(oz.q.d1(str2, "=", BuildConfig.VERSION_NAME)).toString();
            qy.l lVar = oz.q.K0(string) ? null : new qy.l(string, oz.q.a1(str2, "=", BuildConfig.VERSION_NAME));
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return ry.x.g0(arrayList);
    }

    public static final String e(Map map) {
        return ry.m.y0(ry.m.S0(map.entrySet(), new b4.e(20)), ";", null, null, new dv.e(24), 30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d7.h f(j7.m mVar, String str, j7.j jVar, int i11, Map map) {
        Map map2 = Collections.EMPTY_MAP;
        Uri uriA = b7.a.A(str, jVar.f36142c);
        long j11 = jVar.f36140a;
        long j12 = jVar.f36141b;
        String strA = mVar.a();
        if (strA == null) {
            strA = b7.a.A(((j7.b) mVar.f36145b.get(0)).f36094a, jVar.f36142c).toString();
        }
        String str2 = strA;
        b7.a.l(uriA, "The uri must be set.");
        return new d7.h(uriA, 1, null, map, j11, j12, str2, i11);
    }

    public static final j0 g(s0 script, int i11, ArrayList arrayList) {
        String str;
        kotlin.jvm.internal.m.f(script, "script");
        if (i11 <= 2) {
            return null;
        }
        List listZ = nz.n.Z(new nz.c(nz.n.T(nz.n.R(nz.n.R(ry.m.g0(arrayList), new kp.j(script, 1)), new r3(i11, 3)), new t0(22)), new t0(23), 0));
        if (listZ.size() < 4) {
            return null;
        }
        int i12 = b0.f38713a[script.ordinal()];
        if (i12 == 1) {
            str = "EXAM_HIRAGANA";
        } else {
            if (i12 != 2) {
                if (i12 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            str = "EXAM_KATAKANA";
        }
        return new j0(str, 0, "Exam", new v0(BuildConfig.VERSION_NAME), ry.r.f50854a, listZ, SyllableLessonStatus.UNLOCKED, script, true);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x0226  */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Iterable, java.lang.Object] */
    public static final Bundle h(UUID callId, xf.d shareContent, boolean z11) {
        Uri uri;
        Bitmap bitmap;
        Bundle bundle;
        Bundle bundle2;
        Uri uri2;
        Bitmap bitmap2;
        Bundle bundle3;
        Uri uri3;
        kotlin.jvm.internal.m.f(callId, "callId");
        kotlin.jvm.internal.m.f(shareContent, "shareContent");
        if (shareContent instanceof xf.f) {
            xf.f fVar = (xf.f) shareContent;
            Bundle bundleI = i(fVar, z11);
            j1.G("QUOTE", fVar.f56032t, bundleI);
            Uri uri4 = fVar.f56025a;
            if (uri4 != null) {
                j1.G("MESSENGER_LINK", uri4.toString(), bundleI);
            }
            if (uri4 != null) {
                j1.G("TARGET_DISPLAY", uri4.toString(), bundleI);
            }
            return bundleI;
        }
        boolean z12 = shareContent instanceof xf.l;
        Collection collection = ry.r.f50854a;
        if (z12) {
            xf.l lVar = (xf.l) shareContent;
            ArrayList arrayListT = qx.b.t(lVar, callId);
            if (arrayListT != null) {
                collection = arrayListT;
            }
            Bundle bundleI2 = i(lVar, z11);
            bundleI2.putStringArrayList("PHOTOS", new ArrayList<>(collection));
            return bundleI2;
        }
        str = null;
        String str = null;
        ArrayList arrayList = null;
        Bundle bundle4 = null;
        if (shareContent instanceof xf.p) {
            xf.p pVar = (xf.p) shareContent;
            xf.o oVar = pVar.L;
            if (oVar != null && (uri3 = oVar.f56047b) != null) {
                z0 z0VarC = a1.c(callId, uri3);
                a1.a(ns.o.K(z0VarC));
                str = z0VarC.f40142d;
            }
            Bundle bundleI3 = i(pVar, z11);
            j1.G("TITLE", pVar.H, bundleI3);
            j1.G("DESCRIPTION", pVar.f56049t, bundleI3);
            j1.G("VIDEO", str, bundleI3);
            return bundleI3;
        }
        if (shareContent instanceof xf.i) {
            xf.i iVar = (xf.i) shareContent;
            ?? r9 = iVar.f56034t;
            if (r9 != 0) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (xf.h hVar : r9) {
                    if (hVar instanceof xf.k) {
                        xf.k kVar = (xf.k) hVar;
                        bitmap2 = kVar.f56039b;
                        uri2 = kVar.f56040c;
                    } else if (hVar instanceof xf.o) {
                        uri2 = ((xf.o) hVar).f56047b;
                        bitmap2 = null;
                    } else {
                        uri2 = null;
                        bitmap2 = null;
                    }
                    z0 z0VarB = bitmap2 != null ? a1.b(callId, bitmap2) : uri2 != null ? a1.c(callId, uri2) : null;
                    if (z0VarB == null) {
                        bundle3 = null;
                    } else {
                        arrayList2.add(z0VarB);
                        bundle3 = new Bundle();
                        bundle3.putString("type", hVar.a().name());
                        bundle3.putString("uri", z0VarB.f40142d);
                    }
                    if (bundle3 != null) {
                        arrayList3.add(bundle3);
                    }
                }
                a1.a(arrayList2);
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                collection = arrayList;
            }
            Bundle bundleI4 = i(iVar, z11);
            bundleI4.putParcelableArrayList("MEDIA", new ArrayList<>(collection));
            return bundleI4;
        }
        if (shareContent instanceof xf.c) {
            xf.c cVar = (xf.c) shareContent;
            xf.b bVar = cVar.K;
            if (bVar != null) {
                Bundle bundle5 = bVar.f56023a;
                Bundle bundle6 = new Bundle();
                ArrayList arrayList4 = new ArrayList();
                Set<String> setKeySet = bundle5 != null ? bundle5.keySet() : null;
                if (setKeySet == null) {
                    setKeySet = ry.t.f50856a;
                }
                for (String str2 : setKeySet) {
                    Object obj = bundle5 != null ? bundle5.get(str2) : null;
                    Uri uri5 = obj instanceof Uri ? (Uri) obj : null;
                    Object obj2 = bundle5 != null ? bundle5.get(str2) : null;
                    Bitmap bitmap3 = obj2 instanceof Bitmap ? (Bitmap) obj2 : null;
                    z0 z0VarB2 = bitmap3 != null ? a1.b(callId, bitmap3) : uri5 != null ? a1.c(callId, uri5) : null;
                    if (z0VarB2 != null) {
                        arrayList4.add(z0VarB2);
                        bundle6.putString(str2, z0VarB2.f40142d);
                    }
                }
                a1.a(arrayList4);
                bundle4 = bundle6;
            }
            Bundle bundleI5 = i(cVar, z11);
            j1.G("effect_id", cVar.f56024t, bundleI5);
            if (bundle4 != null) {
                bundleI5.putBundle("effect_textures", bundle4);
            }
            try {
                JSONObject jSONObjectA = wf.c.a(cVar.H);
                if (jSONObjectA != null) {
                    j1.G("effect_arguments", jSONObjectA.toString(), bundleI5);
                }
                return bundleI5;
            } catch (JSONException e8) {
                throw new FacebookException("Unable to create a JSON Object from the provided CameraEffectArguments: " + e8.getMessage());
            }
        }
        if (!(shareContent instanceof xf.m)) {
            return null;
        }
        xf.m mVar = (xf.m) shareContent;
        xf.h hVar2 = mVar.f56045t;
        if (hVar2 != null) {
            if (hVar2 instanceof xf.k) {
                xf.k kVar2 = (xf.k) hVar2;
                bitmap = kVar2.f56039b;
                uri = kVar2.f56040c;
            } else if (hVar2 instanceof xf.o) {
                uri = ((xf.o) hVar2).f56047b;
                bitmap = null;
            } else {
                uri = null;
                bitmap = null;
            }
            z0 z0VarB3 = bitmap != null ? a1.b(callId, bitmap) : uri != null ? a1.c(callId, uri) : null;
            if (z0VarB3 == null) {
                bundle = null;
            } else {
                bundle = new Bundle();
                bundle.putString("type", hVar2.a().name());
                bundle.putString("uri", z0VarB3.f40142d);
                String strV = qx.b.v(z0VarB3.f40141c);
                if (strV != null) {
                    j1.G("extension", strV, bundle);
                }
                a1.a(ns.o.K(z0VarB3));
            }
        } else {
            bundle = null;
        }
        xf.k kVar3 = mVar.H;
        if (kVar3 == null) {
            bundle2 = null;
        } else {
            new ArrayList().add(kVar3);
            Bitmap bitmap4 = kVar3.f56039b;
            Uri uri6 = kVar3.f56040c;
            z0 z0VarB4 = bitmap4 != null ? a1.b(callId, bitmap4) : uri6 != null ? a1.c(callId, uri6) : null;
            if (z0VarB4 == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle();
                bundle2.putString("uri", z0VarB4.f40142d);
                String strV2 = qx.b.v(z0VarB4.f40141c);
                if (strV2 != null) {
                    j1.G("extension", strV2, bundle2);
                }
                a1.a(ns.o.K(z0VarB4));
            }
        }
        Bundle bundleI6 = i(mVar, z11);
        if (bundle != null) {
            bundleI6.putParcelable("bg_asset", bundle);
        }
        if (bundle2 != null) {
            bundleI6.putParcelable("interactive_asset_uri", bundle2);
        }
        List list = mVar.K;
        List listA1 = list != null ? ry.m.a1(list) : null;
        if (listA1 != null && !listA1.isEmpty()) {
            bundleI6.putStringArrayList("top_background_color_list", new ArrayList<>(listA1));
        }
        j1.G("content_url", mVar.L, bundleI6);
        return bundleI6;
    }

    public static Bundle i(xf.d dVar, boolean z11) {
        Bundle bundle = new Bundle();
        Uri uri = dVar.f56025a;
        if (uri != null) {
            j1.G("LINK", uri.toString(), bundle);
        }
        j1.G("PLACE", dVar.f56027c, bundle);
        j1.G("PAGE", dVar.f56028d, bundle);
        String str = dVar.f56029e;
        j1.G("REF", str, bundle);
        j1.G("REF", str, bundle);
        bundle.putBoolean("DATA_FAILURES_FATAL", z11);
        List list = dVar.f56026b;
        if (list != null && !list.isEmpty()) {
            bundle.putStringArrayList("FRIENDS", new ArrayList<>(list));
        }
        xf.e eVar = dVar.f56030f;
        j1.G("HASHTAG", eVar != null ? eVar.f56031a : null, bundle);
        return bundle;
    }

    public static final void j(String str) {
        File fileQ = q();
        if (fileQ == null || str == null) {
            return;
        }
        new File(fileQ, str).delete();
    }

    public static final String k(l0 l0Var, s0 s0Var) {
        int i11 = b0.f38713a[s0Var.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return qx.p.K(l0Var.f38778b);
            }
            if (i11 == 3) {
                return BuildConfig.VERSION_NAME;
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = l0Var.f38778b;
        ArrayList arrayList = new ArrayList(str.length());
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (12449 <= cCharAt && cCharAt < 12535) {
                cCharAt = (char) (cCharAt - '`');
            }
            arrayList.add(Character.valueOf(cCharAt));
        }
        return ry.m.y0(arrayList, BuildConfig.VERSION_NAME, null, null, null, 62);
    }

    public static final long l(s1 s1Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(s1Var, "<this>");
        return d0.n.t(nVar) ? ju.a.f37335p1 : ju.a.f37332o1;
    }

    public static final long n(s1 s1Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(s1Var, "<this>");
        return d0.n.t(nVar) ? ju.a.f37353v1 : ju.a.f37350u1;
    }

    public static final long o(s1 s1Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(s1Var, "<this>");
        return d0.n.t(nVar) ? ju.a.f37341r1 : ju.a.f37338q1;
    }

    public static final long p(s1 s1Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(s1Var, "<this>");
        return d0.n.t(nVar) ? ju.a.f37329n1 : ju.a.f37326m1;
    }

    public static final File q() {
        File file = new File(re.s.a().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static String r(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final long s(s1 s1Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(s1Var, "<this>");
        return d0.n.t(nVar) ? ju.a.f37296b1 : ju.a.Y;
    }

    public static final long t(s1 s1Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(s1Var, "<this>");
        return d0.n.t(nVar) ? ju.a.O0 : ju.a.L;
    }

    public static final long u(s1 s1Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(s1Var, "<this>");
        return d0.n.t(nVar) ? ju.a.R0 : ju.a.O;
    }

    public static final long v(s1 s1Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(s1Var, "<this>");
        return d0.n.t(nVar) ? ju.a.f1 : ju.a.f37298c0;
    }

    public static final long w(s1 s1Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(s1Var, "<this>");
        return d0.n.t(nVar) ? ju.a.M0 : ju.a.J;
    }

    public static final long x(s1 s1Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(s1Var, "<this>");
        return d0.n.t(nVar) ? ju.a.N0 : ju.a.K;
    }

    public static final long y(s1 s1Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(s1Var, "<this>");
        return d0.n.t(nVar) ? ju.a.P0 : ju.a.M;
    }

    public static final long z(s1 s1Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(s1Var, "<this>");
        return d0.n.t(nVar) ? ju.a.Q0 : ju.a.N;
    }

    public abstract void E(Throwable th2);

    public abstract void F(i iVar);

    public abstract void S(byte[] bArr, int i11, int i12);

    public static tr.a Q(Context context, int i11, Locale deviceLocale) {
        kotlin.jvm.internal.m.f(deviceLocale, "deviceLocale");
        Locale locale = Locale.US;
        if (i11 == 51) {
            locale = new Locale("ar", "AE");
        } else if (i11 == 57) {
            locale = new Locale("th", "TH");
        } else if (i11 != 61) {
            switch (i11) {
                case -1:
                    if (kotlin.jvm.internal.m.a(deviceLocale.getLanguage(), "zh") && kotlin.jvm.internal.m.a(deviceLocale.getCountry(), "CN")) {
                        deviceLocale = Locale.TRADITIONAL_CHINESE;
                    }
                    locale = deviceLocale;
                    break;
                case 0:
                    locale = Locale.TRADITIONAL_CHINESE;
                    break;
                case 1:
                    locale = Locale.JAPAN;
                    break;
                case 2:
                    locale = Locale.KOREA;
                    break;
                case 3:
                    break;
                case 4:
                    locale = new Locale("es", "ES");
                    break;
                case 5:
                    locale = Locale.FRANCE;
                    break;
                case 6:
                    locale = Locale.GERMANY;
                    break;
                case 7:
                    locale = new Locale(OYAvlbfUyD.AnHG, "VN");
                    break;
                case 8:
                    locale = new Locale("pt", "PT");
                    break;
                case 9:
                    locale = Locale.TRADITIONAL_CHINESE;
                    break;
                case 10:
                    locale = new Locale("ru", "RU");
                    break;
                default:
                    switch (i11) {
                        case 18:
                            locale = new Locale("in", "ID");
                            break;
                        case 19:
                            locale = new Locale("pl", "PL");
                            break;
                        case 20:
                            locale = new Locale("it", "IT");
                            break;
                        case 21:
                            locale = new Locale("tr", "TR");
                            break;
                    }
                    break;
            }
        } else {
            locale = new Locale("hi", "HI");
        }
        int i12 = tr.a.f52530a;
        kotlin.jvm.internal.m.c(locale);
        Resources resources = context.getResources();
        kotlin.jvm.internal.m.e(resources, "getResources(...)");
        Configuration configuration = resources.getConfiguration();
        kotlin.jvm.internal.m.e(configuration, "getConfiguration(...)");
        Resources resources2 = context.getApplicationContext().getResources();
        kotlin.jvm.internal.m.e(resources2, "getResources(...)");
        Configuration configuration2 = resources2.getConfiguration();
        kotlin.jvm.internal.m.e(configuration2, "getConfiguration(...)");
        configuration.setLocale(locale);
        configuration2.setLocale(locale);
        LocaleList localeList = new LocaleList(locale);
        LocaleList.setDefault(localeList);
        configuration.setLocales(localeList);
        configuration2.setLocales(localeList);
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        Locale.setDefault(locale);
        context.getApplicationContext().createConfigurationContext(configuration2);
        kotlin.jvm.internal.m.c(contextCreateConfigurationContext);
        return new tr.a(contextCreateConfigurationContext);
    }

    public static final long m(s1 s1Var, l1.n nVar) {
        kotlin.jvm.internal.m.f(s1Var, tcppUUQxZjFdy.qdiRlLJsBPvGIZX);
        return d0.n.t(nVar) ? ju.a.f37347t1 : ju.a.f37344s1;
    }

    public static int A(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(evRpcb.DtH, lastPathSegment.length() - 5)) {
                                if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(SemtNwfPgIhi.tkUVQmuE)) {
                                    if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                        if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                            if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                                if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                    if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                        if (lastPathSegment.endsWith(".avi")) {
                                                            return 16;
                                                        }
                                                        if (lastPathSegment.endsWith(".png")) {
                                                            return 17;
                                                        }
                                                        if (lastPathSegment.endsWith(".webp")) {
                                                            return 18;
                                                        }
                                                        if (!lastPathSegment.endsWith(".bmp") && !lastPathSegment.endsWith(".dib")) {
                                                            if (!lastPathSegment.endsWith(".heic") && !lastPathSegment.endsWith(".heif")) {
                                                                if (!lastPathSegment.endsWith(IMCc.KlAiFQIibU)) {
                                                                    return -1;
                                                                }
                                                                return 21;
                                                            }
                                                            return 20;
                                                        }
                                                        return 19;
                                                    }
                                                    return 14;
                                                }
                                                return 13;
                                            }
                                            return 12;
                                        }
                                        return 11;
                                    }
                                    return 10;
                                }
                                return 9;
                            }
                            return 8;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }

    public static final boolean C(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement element : stackTrace) {
                kotlin.jvm.internal.m.e(element, "element");
                if (B(element)) {
                    String className = element.getClassName();
                    kotlin.jvm.internal.m.e(className, "element.className");
                    if (!x.s0(className, "com.facebook.appevents.codeless", false)) {
                        String className2 = element.getClassName();
                        kotlin.jvm.internal.m.e(className2, "element.className");
                        if (!x.s0(className2, "com.facebook.appevents.suggestedevents", false)) {
                            return true;
                        }
                    }
                    String methodName = element.getMethodName();
                    kotlin.jvm.internal.m.e(methodName, "element.methodName");
                    if (x.s0(methodName, "onClick", false)) {
                        continue;
                    } else {
                        String methodName2 = element.getMethodName();
                        kotlin.jvm.internal.m.e(methodName2, "element.methodName");
                        if (x.s0(methodName2, OCBJEWZHh.VFYAjAT, false)) {
                            continue;
                        } else {
                            String methodName3 = element.getMethodName();
                            kotlin.jvm.internal.m.e(methodName3, "element.methodName");
                            if (!x.s0(methodName3, "onTouch", false)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
