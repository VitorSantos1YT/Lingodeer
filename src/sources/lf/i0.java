package lf;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.api.Service;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.p3;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.ZipInputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UninitializedPropertyAccessException;
import lw.s1;
import mw.a5;
import mw.b5;
import mw.u3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40038b;

    public /* synthetic */ i0(Object obj, int i11) {
        this.f40037a = i11;
        this.f40038b = obj;
    }

    private final void b() {
        v5.q qVar = (v5.q) this.f40038b;
        synchronized (qVar.f53550d) {
            try {
                if (qVar.H == null) {
                    return;
                }
                try {
                    w4.h hVarC = qVar.c();
                    int i11 = hVarC.f54649e;
                    if (i11 == 2) {
                        synchronized (qVar.f53550d) {
                        }
                    }
                    if (i11 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i11 + ")");
                    }
                    try {
                        int i12 = v4.g.f53514a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        re.v vVar = qVar.f53549c;
                        Context context = qVar.f53547a;
                        vVar.getClass();
                        w4.h[] hVarArr = {hVarC};
                        gb.r rVar = r4.g.f48800a;
                        Trace.beginSection(v10.c.L("TypefaceCompat.createFromFontInfo"));
                        try {
                            Typeface typefaceI = r4.g.f48800a.i(context, hVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferL = hz.b.L(qVar.f53547a, hVarC.f54645a);
                            if (mappedByteBufferL == null || typefaceI == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                ob.i iVar = new ob.i(typefaceI, qx.p.A(mappedByteBufferL));
                                Trace.endSection();
                                Trace.endSection();
                                synchronized (qVar.f53550d) {
                                    try {
                                        ob.f fVar = qVar.H;
                                        if (fVar != null) {
                                            fVar.F(iVar);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                qVar.b();
                            } catch (Throwable th3) {
                                int i13 = v4.g.f53514a;
                                Trace.endSection();
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        int i14 = v4.g.f53514a;
                        Trace.endSection();
                        throw th5;
                    }
                } catch (Throwable th6) {
                    synchronized (qVar.f53550d) {
                        try {
                            ob.f fVar2 = qVar.H;
                            if (fVar2 != null) {
                                fVar2.E(th6);
                            }
                            qVar.b();
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                }
            } catch (Throwable th8) {
                throw th8;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x036f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0459  */
    /* JADX WARN: Code duplicated, block: B:181:0x0471  */
    /* JADX WARN: Code duplicated, block: B:184:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:185:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:188:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:191:0x0533 A[Catch: IOException -> 0x054f, UnknownHostException -> 0x0552, TryCatch #10 {UnknownHostException -> 0x0552, IOException -> 0x054f, blocks: (B:189:0x0518, B:191:0x0533, B:192:0x0539, B:194:0x053f, B:199:0x0555, B:201:0x055f, B:204:0x056c, B:206:0x05a9, B:213:0x05c4, B:217:0x05ca, B:218:0x05cd, B:219:0x05ce), top: B:253:0x0518 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x053f A[Catch: IOException -> 0x054f, UnknownHostException -> 0x0552, LOOP:2: B:192:0x0539->B:194:0x053f, LOOP_END, TryCatch #10 {UnknownHostException -> 0x0552, IOException -> 0x054f, blocks: (B:189:0x0518, B:191:0x0533, B:192:0x0539, B:194:0x053f, B:199:0x0555, B:201:0x055f, B:204:0x056c, B:206:0x05a9, B:213:0x05c4, B:217:0x05ca, B:218:0x05cd, B:219:0x05ce), top: B:253:0x0518 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x056b  */
    /* JADX WARN: Code duplicated, block: B:206:0x05a9 A[Catch: IOException -> 0x054f, UnknownHostException -> 0x0552, TRY_LEAVE, TryCatch #10 {UnknownHostException -> 0x0552, IOException -> 0x054f, blocks: (B:189:0x0518, B:191:0x0533, B:192:0x0539, B:194:0x053f, B:199:0x0555, B:201:0x055f, B:204:0x056c, B:206:0x05a9, B:213:0x05c4, B:217:0x05ca, B:218:0x05cd, B:219:0x05ce), top: B:253:0x0518 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x05bd A[Catch: all -> 0x05c1, TRY_LEAVE, TryCatch #2 {all -> 0x05c1, blocks: (B:207:0x05b7, B:209:0x05bd), top: B:242:0x05b7 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x0626  */
    /* JADX WARN: Code duplicated, block: B:257:0x05c4 A[EDGE_INSN: B:257:0x05c4->B:213:0x05c4 BREAK  A[LOOP:3: B:242:0x05b7->B:258:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x039a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:188:0x04d1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v132, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.Map] */
    private final void a() throws JSONException {
        re.y yVar;
        String str;
        String str2;
        String str3;
        String str4;
        ?? K;
        int iMax;
        List listB;
        lz.g gVar;
        List listA1;
        LinkedHashMap linkedHashMap;
        ue.o oVar;
        String str5;
        ?? X;
        ue.p pVar;
        HttpURLConnection httpURLConnection;
        Set<String> setKeySet;
        StringBuilder sb2;
        BufferedReader bufferedReader;
        String line;
        ue.d dVar;
        re.y yVar2;
        String str6;
        ue.h hVar;
        ArrayList arrayList;
        ue.w wVar;
        LinkedHashMap linkedHashMap2;
        ue.s sVar;
        ue.t tVar;
        ue.u uVar;
        String strA;
        ue.u uVar2;
        String strA2;
        re.y yVar3 = (re.y) this.f40038b;
        String str7 = "POST";
        HashSet hashSet = ue.q.f52942a;
        String str8 = yVar3.f49229b;
        List listW0 = str8 != null ? oz.q.W0(str8, new String[]{"/"}, 0, 6) : null;
        String str9 = "CAPITransformerWebRequests";
        if (listW0 != null) {
            ?? r9 = 2;
            if (listW0.size() == 2) {
                try {
                    ue.o oVar2 = ue.q.f52944c;
                    String str10 = "credentials";
                    try {
                        if (oVar2 == null) {
                            kotlin.jvm.internal.m.n("credentials");
                            throw null;
                        }
                        String str11 = oVar2.f52938b;
                        if (oVar2 == null) {
                            kotlin.jvm.internal.m.n("credentials");
                            throw null;
                        }
                        String str12 = str11 + "/capi/" + oVar2.f52937a + "/events";
                        JSONObject jSONObject = yVar3.f49230c;
                        if (jSONObject != null) {
                            ?? K0 = ry.x.k0(j1.h(jSONObject));
                            String str13 = yVar3.f49232e;
                            kotlin.jvm.internal.m.d(str13, "null cannot be cast to non-null type kotlin.Any");
                            K0.put("custom_events", str13);
                            StringBuilder sb3 = new StringBuilder();
                            for (String str14 : K0.keySet()) {
                                sb3.append(str14);
                                sb3.append(" : ");
                                sb3.append(K0.get(str14));
                                sb3.append(System.getProperty("line.separator"));
                            }
                            p3 p3Var = y0.f40132d;
                            p3.s(re.d0.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb3);
                            Object obj = ue.n.f52934a;
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            ArrayList arrayList2 = new ArrayList();
                            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                            Object obj2 = K0.get(ue.x.EVENT.a());
                            ue.a aVar = ue.b.Companion;
                            kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj2;
                            aVar.getClass();
                            ue.b eventType = str15.equals("MOBILE_APP_INSTALL") ? ue.b.MOBILE_APP_INSTALL : str15.equals(ypOOxsaJG.RFsGSxPPJ) ? ue.b.CUSTOM : ue.b.OTHER;
                            if (eventType != ue.b.OTHER) {
                                for (Map.Entry entry : K0.entrySet()) {
                                    String rawValue = (String) entry.getKey();
                                    Object value = entry.getValue();
                                    ue.d.Companion.getClass();
                                    String str16 = str10;
                                    String str17 = "rawValue";
                                    kotlin.jvm.internal.m.f(rawValue, "rawValue");
                                    ue.d[] dVarArrValues = ue.d.values();
                                    String str18 = str7;
                                    int length = dVarArrValues.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= length) {
                                            dVar = null;
                                            break;
                                        }
                                        ue.d dVar2 = dVarArrValues[i11];
                                        int i12 = i11;
                                        if (kotlin.jvm.internal.m.a(dVar2.a(), rawValue)) {
                                            dVar = dVar2;
                                            break;
                                        }
                                        i11 = i12 + 1;
                                    }
                                    String str19 = str9;
                                    if (dVar != null) {
                                        kotlin.jvm.internal.m.f(value, "value");
                                        ?? r11 = ue.n.f52934a;
                                        ue.j jVar = (ue.j) r11.get(dVar);
                                        if (jVar == null || (tVar = jVar.f52929a) == null) {
                                            yVar2 = yVar3;
                                        } else {
                                            int i13 = ue.m.f52932b[tVar.ordinal()];
                                            yVar2 = yVar3;
                                            if (i13 == 1) {
                                                ue.j jVar2 = (ue.j) r11.get(dVar);
                                                if (jVar2 != null && (uVar = jVar2.f52930b) != null && (strA = uVar.a()) != null) {
                                                    linkedHashMap4.put(strA, value);
                                                }
                                            } else if (i13 == 2) {
                                                if (dVar == ue.d.USER_DATA) {
                                                    try {
                                                        linkedHashMap3.putAll(j1.h(new JSONObject((String) value)));
                                                    } catch (JSONException e8) {
                                                        p3 p3Var2 = y0.f40132d;
                                                        p3.s(re.d0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e8);
                                                    }
                                                } else {
                                                    ue.j jVar3 = (ue.j) r11.get(dVar);
                                                    if (jVar3 != null && (uVar2 = jVar3.f52930b) != null && (strA2 = uVar2.a()) != null) {
                                                        linkedHashMap3.put(strA2, value);
                                                    }
                                                }
                                            }
                                        }
                                        str6 = str12;
                                        linkedHashMap4 = linkedHashMap4;
                                    } else {
                                        yVar2 = yVar3;
                                        boolean zEquals = rawValue.equals(ue.t.CUSTOM_EVENTS.a());
                                        boolean z11 = value instanceof String;
                                        if (eventType == ue.b.CUSTOM && zEquals && z11) {
                                            String str20 = (String) value;
                                            ArrayList arrayList3 = new ArrayList();
                                            try {
                                                ArrayList arrayListG = j1.g(new JSONArray(str20));
                                                int size = arrayListG.size();
                                                str6 = str12;
                                                int i14 = 0;
                                                while (i14 < size) {
                                                    try {
                                                        Object obj3 = arrayListG.get(i14);
                                                        int i15 = i14 + 1;
                                                        ArrayList arrayList4 = arrayListG;
                                                        arrayList3.add(j1.h(new JSONObject((String) obj3)));
                                                        i14 = i15;
                                                        arrayListG = arrayList4;
                                                    } catch (JSONException e10) {
                                                        e = e10;
                                                        p3 p3Var3 = y0.f40132d;
                                                        p3.s(re.d0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", str20, e);
                                                        arrayList = null;
                                                        if (arrayList != null) {
                                                            arrayList2.addAll(arrayList);
                                                        }
                                                        str10 = str16;
                                                        str7 = str18;
                                                        str9 = str19;
                                                        yVar3 = yVar2;
                                                        str12 = str6;
                                                        linkedHashMap4 = linkedHashMap4;
                                                    }
                                                }
                                                if (arrayList3.isEmpty()) {
                                                    arrayList = null;
                                                } else {
                                                    arrayList = new ArrayList();
                                                    int size2 = arrayList3.size();
                                                    int i16 = 0;
                                                    while (i16 < size2) {
                                                        int i17 = i16 + 1;
                                                        ?? r12 = (Map) arrayList3.get(i16);
                                                        ArrayList arrayList5 = arrayList3;
                                                        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                                        int i18 = size2;
                                                        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                                        for (String str21 : r12.keySet()) {
                                                            ue.w.Companion.getClass();
                                                            kotlin.jvm.internal.m.f(str21, str17);
                                                            String str22 = str17;
                                                            ue.w[] wVarArrValues = ue.w.values();
                                                            int i19 = i17;
                                                            int length2 = wVarArrValues.length;
                                                            int i21 = 0;
                                                            while (true) {
                                                                if (i21 >= length2) {
                                                                    wVar = null;
                                                                    break;
                                                                }
                                                                ue.w wVar2 = wVarArrValues[i21];
                                                                int i22 = i21;
                                                                if (kotlin.jvm.internal.m.a(wVar2.a(), str21)) {
                                                                    wVar = wVar2;
                                                                    break;
                                                                }
                                                                i21 = i22 + 1;
                                                            }
                                                            ue.i iVar = (ue.i) ue.n.f52935b.get(wVar);
                                                            if (wVar == null || iVar == null) {
                                                                linkedHashMap2 = linkedHashMap4;
                                                            } else {
                                                                linkedHashMap2 = linkedHashMap4;
                                                                ue.r rVar = iVar.f52928b;
                                                                ue.t tVar2 = iVar.f52927a;
                                                                if (tVar2 == null) {
                                                                    try {
                                                                        String strA3 = rVar.a();
                                                                        if (wVar == ue.w.EVENT_NAME && ((String) r12.get(str21)) != null) {
                                                                            Object obj4 = r12.get(str21);
                                                                            kotlin.jvm.internal.m.d(obj4, "null cannot be cast to non-null type kotlin.String");
                                                                            String strA4 = (String) obj4;
                                                                            ?? r13 = ue.n.f52936c;
                                                                            if (r13.containsKey(strA4) && ((sVar = (ue.s) r13.get(strA4)) == null || (strA4 = sVar.a()) == null)) {
                                                                                strA4 = BuildConfig.VERSION_NAME;
                                                                            }
                                                                            linkedHashMap7.put(strA3, strA4);
                                                                        } else if (wVar == ue.w.EVENT_TIME && ((Integer) r12.get(str21)) != null) {
                                                                            Object obj5 = r12.get(str21);
                                                                            kotlin.jvm.internal.m.d(obj5, "null cannot be cast to non-null type kotlin.Any");
                                                                            Object objA = ue.n.a(obj5, str21);
                                                                            kotlin.jvm.internal.m.d(objA, "null cannot be cast to non-null type kotlin.Any");
                                                                            linkedHashMap7.put(strA3, objA);
                                                                        }
                                                                    } catch (ClassCastException e11) {
                                                                        p3 p3Var4 = y0.f40132d;
                                                                        p3.s(re.d0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", cf.x.O(e11));
                                                                    }
                                                                } else if (tVar2 == ue.t.CUSTOM_DATA) {
                                                                    String strA5 = rVar.a();
                                                                    Object obj6 = r12.get(str21);
                                                                    kotlin.jvm.internal.m.d(obj6, "null cannot be cast to non-null type kotlin.Any");
                                                                    Object objA2 = ue.n.a(obj6, str21);
                                                                    kotlin.jvm.internal.m.d(objA2, "null cannot be cast to non-null type kotlin.Any");
                                                                    linkedHashMap6.put(strA5, objA2);
                                                                }
                                                            }
                                                            str17 = str22;
                                                            i17 = i19;
                                                            linkedHashMap4 = linkedHashMap2;
                                                        }
                                                        String str23 = str17;
                                                        int i23 = i17;
                                                        LinkedHashMap linkedHashMap8 = linkedHashMap4;
                                                        if (!linkedHashMap6.isEmpty()) {
                                                            linkedHashMap7.put(ue.t.CUSTOM_DATA.a(), linkedHashMap6);
                                                        }
                                                        arrayList.add(linkedHashMap7);
                                                        arrayList3 = arrayList5;
                                                        size2 = i18;
                                                        str17 = str23;
                                                        i16 = i23;
                                                        linkedHashMap4 = linkedHashMap8;
                                                    }
                                                    linkedHashMap4 = linkedHashMap4;
                                                }
                                            } catch (JSONException e12) {
                                                e = e12;
                                                str6 = str12;
                                            }
                                            if (arrayList != null) {
                                                arrayList2.addAll(arrayList);
                                            }
                                        } else {
                                            str6 = str12;
                                            linkedHashMap4 = linkedHashMap4;
                                            ue.h.Companion.getClass();
                                            ue.h[] hVarArrValues = ue.h.values();
                                            int length3 = hVarArrValues.length;
                                            int i24 = 0;
                                            while (true) {
                                                if (i24 >= length3) {
                                                    hVar = null;
                                                    break;
                                                }
                                                hVar = hVarArrValues[i24];
                                                if (kotlin.jvm.internal.m.a(hVar.a(), rawValue)) {
                                                    break;
                                                } else {
                                                    i24++;
                                                }
                                            }
                                            if (hVar != null) {
                                                linkedHashMap5.put(rawValue, value);
                                            }
                                        }
                                    }
                                    str10 = str16;
                                    str7 = str18;
                                    str9 = str19;
                                    yVar3 = yVar2;
                                    str12 = str6;
                                    linkedHashMap4 = linkedHashMap4;
                                }
                            }
                            yVar = yVar3;
                            str = str7;
                            str2 = str9;
                            str3 = str10;
                            str4 = str12;
                            LinkedHashMap linkedHashMap9 = linkedHashMap4;
                            if (eventType != ue.b.OTHER) {
                                Object obj7 = K0.get(ue.x.INSTALL_EVENT_TIME.a());
                                kotlin.jvm.internal.m.f(eventType, "eventType");
                                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                                linkedHashMap10.put(ue.x.ACTION_SOURCE.a(), ue.x.APP.a());
                                linkedHashMap10.put(ue.t.USER_DATA.a(), linkedHashMap3);
                                linkedHashMap10.put(ue.t.APP_DATA.a(), linkedHashMap9);
                                linkedHashMap10.putAll(linkedHashMap5);
                                int i25 = ue.m.f52933c[eventType.ordinal()];
                                if (i25 != 1) {
                                    if (i25 == 2 && !arrayList2.isEmpty()) {
                                        K = new ArrayList();
                                        int size3 = arrayList2.size();
                                        int i26 = 0;
                                        while (i26 < size3) {
                                            Object obj8 = arrayList2.get(i26);
                                            i26++;
                                            LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                                            linkedHashMap11.putAll(linkedHashMap10);
                                            linkedHashMap11.putAll((Map) obj8);
                                            K.add(linkedHashMap11);
                                        }
                                    }
                                } else if (obj7 != null) {
                                    LinkedHashMap linkedHashMap12 = new LinkedHashMap();
                                    linkedHashMap12.putAll(linkedHashMap10);
                                    linkedHashMap12.put(ue.r.EVENT_NAME.a(), ue.x.MOBILE_APP_INSTALL.a());
                                    linkedHashMap12.put(ue.r.EVENT_TIME.a(), obj7);
                                    K = ns.o.K(linkedHashMap12);
                                }
                            }
                            if (K == 0) {
                                return;
                            }
                            ue.q.b().addAll(K);
                            iMax = Math.max(0, ue.q.b().size() - 1000);
                            if (iMax > 0) {
                                List listB2 = kotlin.jvm.internal.c0.b(ry.m.k0(ue.q.b(), iMax));
                                kotlin.jvm.internal.m.f(listB2, "<set-?>");
                                ue.q.f52945d = listB2;
                            }
                            int iMin = Math.min(ue.q.b().size(), 10);
                            listB = ue.q.b();
                            gVar = new lz.g(0, iMin - 1, 1);
                            if (gVar.isEmpty()) {
                                listA1 = ry.r.f50854a;
                            } else {
                                listA1 = ry.m.a1(listB.subList(0, gVar.f40533b + 1));
                            }
                            ue.q.b().subList(0, iMin).clear();
                            JSONArray jSONArray = new JSONArray((Collection) listA1);
                            linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("data", jSONArray);
                            oVar = ue.q.f52944c;
                            if (oVar != null) {
                                kotlin.jvm.internal.m.n(str3);
                                throw null;
                            }
                            linkedHashMap.put("accessKey", oVar.f52939c);
                            JSONObject jSONObject2 = new JSONObject(linkedHashMap);
                            p3 p3Var5 = y0.f40132d;
                            re.d0 d0Var = re.d0.APP_EVENTS;
                            String string = jSONObject2.toString(2);
                            kotlin.jvm.internal.m.e(string, "jsonBodyStr.toString(2)");
                            String urlStr = str4;
                            str5 = str2;
                            p3.s(d0Var, str5, "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", urlStr, yVar, string);
                            String string2 = jSONObject2.toString();
                            X = ry.x.X(new qy.l(HttpHeaders.CONTENT_TYPE, "application/json"));
                            pVar = new ue.p(0 == true ? 1 : 0, listA1);
                            kotlin.jvm.internal.m.f(urlStr, "urlStr");
                            try {
                                URLConnection uRLConnectionOpenConnection = new URL(urlStr).openConnection();
                                kotlin.jvm.internal.m.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                String str24 = str;
                                httpURLConnection.setRequestMethod(str24);
                                setKeySet = X.keySet();
                                if (setKeySet != null) {
                                    for (String str25 : setKeySet) {
                                        httpURLConnection.setRequestProperty(str25, (String) X.get(str25));
                                    }
                                }
                                httpURLConnection.setDoOutput(!httpURLConnection.getRequestMethod().equals(str24) || httpURLConnection.getRequestMethod().equals("PUT"));
                                httpURLConnection.setConnectTimeout(60000);
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, Constants.ENCODING));
                                bufferedWriter.write(string2);
                                bufferedWriter.flush();
                                bufferedWriter.close();
                                bufferedOutputStream.close();
                                sb2 = new StringBuilder();
                                if (ue.q.f52942a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                                    bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), Constants.ENCODING));
                                    while (true) {
                                        try {
                                            line = bufferedReader.readLine();
                                            if (line != null) {
                                                break;
                                            } else {
                                                sb2.append(line);
                                            }
                                        } catch (Throwable th2) {
                                            try {
                                                throw th2;
                                            } catch (Throwable th3) {
                                                ns.o.m(bufferedReader, th2);
                                                throw th3;
                                            }
                                        }
                                    }
                                    bufferedReader.close();
                                }
                                String string3 = sb2.toString();
                                kotlin.jvm.internal.m.e(string3, "connResponseSB.toString()");
                                p3 p3Var6 = y0.f40132d;
                                p3.s(re.d0.APP_EVENTS, str5, "\nResponse Received: \n%s\n%s", string3, Integer.valueOf(httpURLConnection.getResponseCode()));
                                pVar.invoke(string3, Integer.valueOf(httpURLConnection.getResponseCode()));
                                return;
                            } catch (UnknownHostException e13) {
                                p3 p3Var7 = y0.f40132d;
                                p3.s(re.d0.APP_EVENTS, str5, "Connection failed, retrying: \n%s", e13.toString());
                                pVar.invoke(null, 503);
                                return;
                            } catch (IOException e14) {
                                p3 p3Var8 = y0.f40132d;
                                p3.s(re.d0.DEVELOPER_ERRORS, str5, "Send to server failed: \n%s", e14.toString());
                                return;
                            }
                        }
                        yVar = yVar3;
                        str = "POST";
                        str2 = "CAPITransformerWebRequests";
                        str3 = "credentials";
                        str4 = str12;
                        K = 0;
                        if (K == 0) {
                            return;
                        }
                        ue.q.b().addAll(K);
                        iMax = Math.max(0, ue.q.b().size() - 1000);
                        if (iMax > 0) {
                            List listB3 = kotlin.jvm.internal.c0.b(ry.m.k0(ue.q.b(), iMax));
                            kotlin.jvm.internal.m.f(listB3, "<set-?>");
                            ue.q.f52945d = listB3;
                        }
                        int iMin2 = Math.min(ue.q.b().size(), 10);
                        listB = ue.q.b();
                        gVar = new lz.g(0, iMin2 - 1, 1);
                        if (gVar.isEmpty()) {
                            listA1 = ry.r.f50854a;
                        } else {
                            listA1 = ry.m.a1(listB.subList(0, gVar.f40533b + 1));
                        }
                        ue.q.b().subList(0, iMin2).clear();
                        JSONArray jSONArray2 = new JSONArray((Collection) listA1);
                        linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("data", jSONArray2);
                        oVar = ue.q.f52944c;
                        if (oVar != null) {
                            kotlin.jvm.internal.m.n(str3);
                            throw null;
                        }
                        linkedHashMap.put("accessKey", oVar.f52939c);
                        JSONObject jSONObject3 = new JSONObject(linkedHashMap);
                        p3 p3Var9 = y0.f40132d;
                        re.d0 d0Var2 = re.d0.APP_EVENTS;
                        String string4 = jSONObject3.toString(2);
                        kotlin.jvm.internal.m.e(string4, "jsonBodyStr.toString(2)");
                        String urlStr2 = str4;
                        str5 = str2;
                        p3.s(d0Var2, str5, "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", urlStr2, yVar, string4);
                        String string5 = jSONObject3.toString();
                        X = ry.x.X(new qy.l(HttpHeaders.CONTENT_TYPE, "application/json"));
                        pVar = new ue.p(0 == true ? 1 : 0, listA1);
                        kotlin.jvm.internal.m.f(urlStr2, "urlStr");
                        URLConnection uRLConnectionOpenConnection2 = new URL(urlStr2).openConnection();
                        kotlin.jvm.internal.m.d(uRLConnectionOpenConnection2, "null cannot be cast to non-null type java.net.HttpURLConnection");
                        httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection2;
                        String str26 = str;
                        httpURLConnection.setRequestMethod(str26);
                        setKeySet = X.keySet();
                        if (setKeySet != null) {
                            while (r9.hasNext()) {
                                httpURLConnection.setRequestProperty(str25, (String) X.get(str25));
                            }
                        }
                        httpURLConnection.setDoOutput(!httpURLConnection.getRequestMethod().equals(str26) || httpURLConnection.getRequestMethod().equals("PUT"));
                        httpURLConnection.setConnectTimeout(60000);
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream2, Constants.ENCODING));
                        bufferedWriter2.write(string5);
                        bufferedWriter2.flush();
                        bufferedWriter2.close();
                        bufferedOutputStream2.close();
                        sb2 = new StringBuilder();
                        if (ue.q.f52942a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), Constants.ENCODING));
                            while (true) {
                                line = bufferedReader.readLine();
                                if (line != null) {
                                    break;
                                    break;
                                }
                                sb2.append(line);
                            }
                            bufferedReader.close();
                        }
                        String string6 = sb2.toString();
                        kotlin.jvm.internal.m.e(string6, "connResponseSB.toString()");
                        p3 p3Var10 = y0.f40132d;
                        p3.s(re.d0.APP_EVENTS, str5, "\nResponse Received: \n%s\n%s", string6, Integer.valueOf(httpURLConnection.getResponseCode()));
                        pVar.invoke(string6, Integer.valueOf(httpURLConnection.getResponseCode()));
                        return;
                    } catch (UninitializedPropertyAccessException e15) {
                        e = e15;
                    }
                } catch (UninitializedPropertyAccessException e16) {
                    e = e16;
                    r9 = "CAPITransformerWebRequests";
                }
                p3 p3Var11 = y0.f40132d;
                p3.s(re.d0.DEVELOPER_ERRORS, r9, "\n Credentials not initialized Error when logging: \n%s", e);
                return;
            }
        }
        p3 p3Var12 = y0.f40132d;
        p3.s(re.d0.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", yVar3);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:109:0x0246  */
    /* JADX WARN: Code duplicated, block: B:111:0x025c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0271  */
    /* JADX WARN: Code duplicated, block: B:117:0x0277  */
    /* JADX WARN: Code duplicated, block: B:119:0x028b  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:131:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:365:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x012b  */
    /* JADX WARN: Code duplicated, block: B:84:0x014f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0157  */
    /* JADX WARN: Code duplicated, block: B:87:0x0166  */
    /* JADX WARN: Code duplicated, block: B:89:0x016c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0177  */
    /* JADX WARN: Code duplicated, block: B:94:0x017d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0194  */
    /* JADX WARN: Code duplicated, block: B:99:0x019a  */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        long j11;
        Object obj;
        Boolean bool;
        View viewFindFocus;
        long j12;
        long j13;
        float f5;
        long j14;
        long j15;
        float f11;
        u5.g gVar;
        boolean z11;
        ArrayList arrayList;
        u5.c cVarB;
        ArrayList arrayList2;
        int iIndexOf;
        int i11;
        int i12;
        int size;
        long j16;
        int i13;
        float f12;
        qa.s sVar;
        qa.u uVar;
        qa.b0 b0Var;
        qa.v vVar;
        Runnable runnable;
        float f13;
        long j17 = 1;
        long j18 = 0;
        boolean z12 = true;
        boolean z13 = false;
        switch (this.f40037a) {
            case 0:
                long length = 0;
                o0 o0Var = (o0) this.f40038b;
                Condition condition = o0Var.f40087e;
                ReentrantLock reentrantLock = o0Var.f40086d;
                reentrantLock.lock();
                int i14 = 0;
                try {
                    o0Var.f40085c = false;
                    reentrantLock.unlock();
                    try {
                        p3 p3Var = y0.f40132d;
                        p3.r(re.d0.CACHE, "o0", "trim started");
                        PriorityQueue priorityQueue = new PriorityQueue();
                        File[] fileArrListFiles = o0Var.f40084b.listFiles(k.f40053b);
                        if (fileArrListFiles != null) {
                            int length2 = fileArrListFiles.length;
                            j11 = 0;
                            while (i14 < length2) {
                                File file = fileArrListFiles[i14];
                                kotlin.jvm.internal.m.e(file, "file");
                                m0 m0Var = new m0(file);
                                priorityQueue.add(m0Var);
                                p3 p3Var2 = y0.f40132d;
                                re.d0 d0Var = re.d0.CACHE;
                                StringBuilder sb2 = new StringBuilder();
                                long j19 = j17;
                                sb2.append("  trim considering time=");
                                sb2.append(Long.valueOf(m0Var.f40061b));
                                sb2.append(" name=");
                                sb2.append(file.getName());
                                p3.r(d0Var, "o0", sb2.toString());
                                length += file.length();
                                j11 += j19;
                                i14++;
                                j17 = j19;
                            }
                        } else {
                            j11 = 0;
                        }
                        while (true) {
                            if (length <= 1048576 && j11 <= 1024) {
                                reentrantLock.lock();
                                try {
                                    condition.signalAll();
                                    return;
                                } finally {
                                    reentrantLock.unlock();
                                }
                            }
                            File file2 = ((m0) priorityQueue.remove()).f40060a;
                            p3 p3Var3 = y0.f40132d;
                            p3.r(re.d0.CACHE, "o0", "  trim removing " + file2.getName());
                            length -= file2.length();
                            j11 += -1;
                            file2.delete();
                        }
                    } catch (Throwable th2) {
                        reentrantLock.lock();
                        try {
                            condition.signalAll();
                            throw th2;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
                break;
            case 1:
                m7.f fVar = (m7.f) this.f40038b;
                synchronized (fVar.f40964a) {
                    try {
                        if (fVar.m) {
                            return;
                        }
                        long j21 = fVar.f40975l - 1;
                        fVar.f40975l = j21;
                        if (j21 > 0) {
                            return;
                        }
                        if (j21 >= 0) {
                            fVar.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (fVar.f40964a) {
                            fVar.f40976n = illegalStateException;
                            break;
                        }
                        return;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            case 2:
                mw.j jVar = (mw.j) this.f40038b;
                b1.p pVar = jVar.f42476d;
                if (pVar != null) {
                    s1 s1Var = (s1) pVar.f3800b;
                    if (!s1Var.f40467c && !s1Var.f40466b) {
                        pVar.r();
                    }
                }
                jVar.f42475c = null;
                return;
            case 3:
                ((u3) this.f40038b).e();
                return;
            case 4:
                b5 b5Var = ((a5) this.f40038b).f42341b;
                b5Var.f42364e.a(new aj.i(b5Var, 22));
                return;
            case 5:
                Activity activity = (Activity) this.f40038b;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = n4.d.f43197g;
                Method method = n4.d.f43196f;
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i15 != 26 && i15 != 27) || method != null) && (n4.d.f43195e != null || n4.d.f43194d != null)) {
                    try {
                        Object obj2 = n4.d.f43193c.get(activity);
                        if (obj2 != null && (obj = n4.d.f43192b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            n4.c cVar = new n4.c(activity);
                            application.registerActivityLifecycleCallbacks(cVar);
                            handler.post(new aw.t(cVar, obj2, false, 12));
                            if (i15 != 26 && i15 != 27) {
                                z12 = false;
                            }
                            int i16 = 13;
                            try {
                                if (z12) {
                                    Boolean bool2 = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool2, null, null, bool2, bool2);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new aw.t(application, cVar, false, i16));
                                return;
                            } catch (Throwable th5) {
                                handler.post(new aw.t(application, cVar, false, i16));
                                throw th5;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 6:
                o3.a0 a0Var = (o3.a0) this.f40038b;
                ob.m mVar = a0Var.f44630b;
                a0Var.f44641n = null;
                n1.e eVar = a0Var.m;
                View view = a0Var.f44629a;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    eVar.h();
                    return;
                }
                Object[] objArr = eVar.f43112a;
                int i17 = eVar.f43114c;
                Boolean bool3 = null;
                Boolean boolValueOf = null;
                for (int i18 = 0; i18 < i17; i18++) {
                    o3.y yVar = (o3.y) objArr[i18];
                    int i19 = o3.z.f44709a[yVar.ordinal()];
                    if (i19 != 1) {
                        if (i19 == 2) {
                            bool = Boolean.FALSE;
                        } else {
                            if (i19 != 3 && i19 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!kotlin.jvm.internal.m.a(bool3, Boolean.FALSE)) {
                                boolValueOf = Boolean.valueOf(yVar == o3.y.ShowKeyboard);
                            }
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    bool3 = bool;
                    boolValueOf = bool3;
                }
                eVar.h();
                if (kotlin.jvm.internal.m.a(bool3, Boolean.TRUE)) {
                    ((InputMethodManager) mVar.f44827c.getValue()).restartInput((View) mVar.f44826b);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((qp.i) ((tp.g) mVar.f44828d).f52461b).b();
                    } else {
                        ((qp.i) ((tp.g) mVar.f44828d).f52461b).a();
                    }
                }
                if (kotlin.jvm.internal.m.a(bool3, Boolean.FALSE)) {
                    ((InputMethodManager) mVar.f44827c.getValue()).restartInput((View) mVar.f44826b);
                    return;
                }
                return;
            case 7:
                pi.h hVar = (pi.h) this.f40038b;
                if (hVar.getView() == null) {
                    return;
                }
                Object parent = hVar.requireView().getParent();
                kotlin.jvm.internal.m.d(parent, "null cannot be cast to non-null type android.view.View");
                ViewGroup.LayoutParams layoutParams = ((View) parent).getLayoutParams();
                kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                l4.b bVar = ((l4.e) layoutParams).f39716a;
                kotlin.jvm.internal.m.d(bVar, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
                ((BottomSheetBehavior) bVar).e(3);
                return;
            case 8:
                ((re.f) this.f40038b).a();
                return;
            case 9:
                se.q reason = (se.q) this.f40038b;
                if (qf.a.b(se.j.class)) {
                    return;
                }
                try {
                    kotlin.jvm.internal.m.f(reason, "$reason");
                    se.j.d(reason);
                    return;
                } catch (Throwable th6) {
                    qf.a.a(se.j.class, th6);
                    return;
                }
            case 10:
                ((si.d) this.f40038b).r();
                return;
            case 11:
                tf.k kVar = (tf.k) this.f40038b;
                kotlin.jvm.internal.m.f(kVar, aYZzTH.cfPDDugZiM);
                kVar.A();
                return;
            case 12:
                u5.c cVar2 = (u5.c) ((u5.c) this.f40038b).f52774c.f52461b;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = cVar2.f52773b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i21 = 0;
                while (i21 < arrayList3.size()) {
                    u5.f fVar2 = (u5.f) arrayList3.get(i21);
                    if (fVar2 == null) {
                        jUptimeMillis2 = jUptimeMillis2;
                        i12 = i21;
                    } else {
                        y.t0 t0Var = cVar2.f52772a;
                        Long l9 = (Long) t0Var.get(fVar2);
                        if (l9 != null) {
                            if (l9.longValue() < jUptimeMillis2) {
                                t0Var.remove(fVar2);
                                j12 = fVar2.f52796i;
                                if (j12 == j18) {
                                    fVar2.f52796i = jUptimeMillis;
                                    fVar2.c(fVar2.f52789b);
                                    jUptimeMillis2 = jUptimeMillis2;
                                } else {
                                    j13 = jUptimeMillis - j12;
                                    fVar2.f52796i = jUptimeMillis;
                                    f5 = u5.f.b().f52778g;
                                    if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
                                        j14 = 2147483647L;
                                    } else {
                                        j14 = (long) (j13 / f5);
                                    }
                                    j15 = j14;
                                    if (fVar2.f52801o) {
                                        f13 = fVar2.f52800n;
                                        if (f13 != Float.MAX_VALUE) {
                                            fVar2.m.f52810i = f13;
                                            fVar2.f52800n = Float.MAX_VALUE;
                                        }
                                        fVar2.f52789b = (float) fVar2.m.f52810i;
                                        fVar2.f52788a = CropImageView.DEFAULT_ASPECT_RATIO;
                                        fVar2.f52801o = z13;
                                        jUptimeMillis2 = jUptimeMillis2;
                                    } else {
                                        if (fVar2.f52800n != Float.MAX_VALUE) {
                                            long j22 = j15 / 2;
                                            a0.p1 p1VarC = fVar2.m.c(fVar2.f52789b, fVar2.f52788a, j22);
                                            u5.g gVar2 = fVar2.m;
                                            gVar2.f52810i = fVar2.f52800n;
                                            fVar2.f52800n = Float.MAX_VALUE;
                                            a0.p1 p1VarC2 = gVar2.c(p1VarC.f166a, p1VarC.f167b, j22);
                                            fVar2.f52789b = p1VarC2.f166a;
                                            fVar2.f52788a = p1VarC2.f167b;
                                        } else {
                                            a0.p1 p1VarC3 = fVar2.m.c(fVar2.f52789b, fVar2.f52788a, j15);
                                            fVar2.f52789b = p1VarC3.f166a;
                                            fVar2.f52788a = p1VarC3.f167b;
                                        }
                                        float fMax = Math.max(fVar2.f52789b, fVar2.f52795h);
                                        fVar2.f52789b = fMax;
                                        float fMin = Math.min(fMax, fVar2.f52794g);
                                        fVar2.f52789b = fMin;
                                        f11 = fVar2.f52788a;
                                        gVar = fVar2.m;
                                        gVar.getClass();
                                        if (Math.abs(f11) < gVar.f52806e || Math.abs(fMin - ((float) gVar.f52810i)) >= gVar.f52805d) {
                                            z11 = false;
                                        } else {
                                            fVar2.f52789b = (float) fVar2.m.f52810i;
                                            fVar2.f52788a = CropImageView.DEFAULT_ASPECT_RATIO;
                                        }
                                        float fMin2 = Math.min(fVar2.f52789b, fVar2.f52794g);
                                        fVar2.f52789b = fMin2;
                                        float fMax2 = Math.max(fMin2, fVar2.f52795h);
                                        fVar2.f52789b = fMax2;
                                        fVar2.c(fMax2);
                                        if (z11) {
                                            arrayList = fVar2.f52798k;
                                            fVar2.f52793f = false;
                                            cVarB = u5.f.b();
                                            cVarB.f52772a.remove(fVar2);
                                            arrayList2 = cVarB.f52773b;
                                            iIndexOf = arrayList2.indexOf(fVar2);
                                            if (iIndexOf >= 0) {
                                                arrayList2.set(iIndexOf, null);
                                                cVarB.f52777f = true;
                                            }
                                            fVar2.f52796i = 0L;
                                            fVar2.f52790c = false;
                                            i11 = 0;
                                            while (i11 < arrayList.size()) {
                                                if (arrayList.get(i11) != null) {
                                                    qa.r rVar = (qa.r) arrayList.get(i11);
                                                    f12 = fVar2.f52789b;
                                                    sVar = rVar.f47660a;
                                                    uVar = qa.u.f47670y;
                                                    b0Var = sVar.f47668h;
                                                    if (f12 < 1.0f) {
                                                        long j23 = b0Var.f47679b0;
                                                        qa.v vVarT = b0Var.T(0);
                                                        vVar = vVarT.W;
                                                        j16 = jUptimeMillis;
                                                        vVarT.W = null;
                                                        i13 = i21;
                                                        b0Var.J(-1L, sVar.f47661a);
                                                        b0Var.J(j23, -1L);
                                                        sVar.f47661a = j23;
                                                        runnable = sVar.f47667g;
                                                        if (runnable != null) {
                                                            runnable.run();
                                                        }
                                                        b0Var.Y.clear();
                                                        if (vVar != null) {
                                                            vVar.B(vVar, uVar, true);
                                                        }
                                                    } else {
                                                        j16 = jUptimeMillis;
                                                        i13 = i21;
                                                        b0Var.B(b0Var, uVar, false);
                                                    }
                                                    i11++;
                                                    jUptimeMillis = j16;
                                                    i21 = i13;
                                                } else {
                                                    j16 = jUptimeMillis;
                                                    i13 = i21;
                                                }
                                                i11++;
                                                jUptimeMillis = j16;
                                                i21 = i13;
                                            }
                                            jUptimeMillis = jUptimeMillis;
                                            i12 = i21;
                                            for (size = arrayList.size() - 1; size >= 0; size--) {
                                                if (arrayList.get(size) == null) {
                                                    arrayList.remove(size);
                                                }
                                            }
                                        }
                                    }
                                    z11 = true;
                                    float fMin3 = Math.min(fVar2.f52789b, fVar2.f52794g);
                                    fVar2.f52789b = fMin3;
                                    float fMax3 = Math.max(fMin3, fVar2.f52795h);
                                    fVar2.f52789b = fMax3;
                                    fVar2.c(fMax3);
                                    if (z11) {
                                        arrayList = fVar2.f52798k;
                                        fVar2.f52793f = false;
                                        cVarB = u5.f.b();
                                        cVarB.f52772a.remove(fVar2);
                                        arrayList2 = cVarB.f52773b;
                                        iIndexOf = arrayList2.indexOf(fVar2);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            cVarB.f52777f = true;
                                        }
                                        fVar2.f52796i = 0L;
                                        fVar2.f52790c = false;
                                        i11 = 0;
                                        while (i11 < arrayList.size()) {
                                            if (arrayList.get(i11) != null) {
                                                qa.r rVar2 = (qa.r) arrayList.get(i11);
                                                f12 = fVar2.f52789b;
                                                sVar = rVar2.f47660a;
                                                uVar = qa.u.f47670y;
                                                b0Var = sVar.f47668h;
                                                if (f12 < 1.0f) {
                                                    long j24 = b0Var.f47679b0;
                                                    qa.v vVarT2 = b0Var.T(0);
                                                    vVar = vVarT2.W;
                                                    j16 = jUptimeMillis;
                                                    vVarT2.W = null;
                                                    i13 = i21;
                                                    b0Var.J(-1L, sVar.f47661a);
                                                    b0Var.J(j24, -1L);
                                                    sVar.f47661a = j24;
                                                    runnable = sVar.f47667g;
                                                    if (runnable != null) {
                                                        runnable.run();
                                                    }
                                                    b0Var.Y.clear();
                                                    if (vVar != null) {
                                                        vVar.B(vVar, uVar, true);
                                                    }
                                                } else {
                                                    j16 = jUptimeMillis;
                                                    i13 = i21;
                                                    b0Var.B(b0Var, uVar, false);
                                                }
                                                i11++;
                                                jUptimeMillis = j16;
                                                i21 = i13;
                                            } else {
                                                j16 = jUptimeMillis;
                                                i13 = i21;
                                            }
                                            i11++;
                                            jUptimeMillis = j16;
                                            i21 = i13;
                                        }
                                        jUptimeMillis = jUptimeMillis;
                                        i12 = i21;
                                        while (size >= 0) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    }
                                }
                            } else {
                                jUptimeMillis2 = jUptimeMillis2;
                            }
                            i12 = i21;
                        } else {
                            j12 = fVar2.f52796i;
                            if (j12 == j18) {
                                fVar2.f52796i = jUptimeMillis;
                                fVar2.c(fVar2.f52789b);
                                jUptimeMillis2 = jUptimeMillis2;
                                i12 = i21;
                            } else {
                                j13 = jUptimeMillis - j12;
                                fVar2.f52796i = jUptimeMillis;
                                f5 = u5.f.b().f52778g;
                                if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
                                    j14 = 2147483647L;
                                } else {
                                    j14 = (long) (j13 / f5);
                                }
                                j15 = j14;
                                if (fVar2.f52801o) {
                                    f13 = fVar2.f52800n;
                                    if (f13 != Float.MAX_VALUE) {
                                        fVar2.m.f52810i = f13;
                                        fVar2.f52800n = Float.MAX_VALUE;
                                    }
                                    fVar2.f52789b = (float) fVar2.m.f52810i;
                                    fVar2.f52788a = CropImageView.DEFAULT_ASPECT_RATIO;
                                    fVar2.f52801o = z13;
                                    jUptimeMillis2 = jUptimeMillis2;
                                } else {
                                    if (fVar2.f52800n != Float.MAX_VALUE) {
                                        long j25 = j15 / 2;
                                        a0.p1 p1VarC4 = fVar2.m.c(fVar2.f52789b, fVar2.f52788a, j25);
                                        u5.g gVar3 = fVar2.m;
                                        gVar3.f52810i = fVar2.f52800n;
                                        fVar2.f52800n = Float.MAX_VALUE;
                                        a0.p1 p1VarC5 = gVar3.c(p1VarC4.f166a, p1VarC4.f167b, j25);
                                        fVar2.f52789b = p1VarC5.f166a;
                                        fVar2.f52788a = p1VarC5.f167b;
                                    } else {
                                        a0.p1 p1VarC6 = fVar2.m.c(fVar2.f52789b, fVar2.f52788a, j15);
                                        fVar2.f52789b = p1VarC6.f166a;
                                        fVar2.f52788a = p1VarC6.f167b;
                                    }
                                    float fMax4 = Math.max(fVar2.f52789b, fVar2.f52795h);
                                    fVar2.f52789b = fMax4;
                                    float fMin4 = Math.min(fMax4, fVar2.f52794g);
                                    fVar2.f52789b = fMin4;
                                    f11 = fVar2.f52788a;
                                    gVar = fVar2.m;
                                    gVar.getClass();
                                    if (Math.abs(f11) < gVar.f52806e) {
                                    }
                                    z11 = false;
                                    float fMin5 = Math.min(fVar2.f52789b, fVar2.f52794g);
                                    fVar2.f52789b = fMin5;
                                    float fMax5 = Math.max(fMin5, fVar2.f52795h);
                                    fVar2.f52789b = fMax5;
                                    fVar2.c(fMax5);
                                    if (z11) {
                                        arrayList = fVar2.f52798k;
                                        fVar2.f52793f = false;
                                        cVarB = u5.f.b();
                                        cVarB.f52772a.remove(fVar2);
                                        arrayList2 = cVarB.f52773b;
                                        iIndexOf = arrayList2.indexOf(fVar2);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            cVarB.f52777f = true;
                                        }
                                        fVar2.f52796i = 0L;
                                        fVar2.f52790c = false;
                                        i11 = 0;
                                        while (i11 < arrayList.size()) {
                                            if (arrayList.get(i11) != null) {
                                                qa.r rVar3 = (qa.r) arrayList.get(i11);
                                                f12 = fVar2.f52789b;
                                                sVar = rVar3.f47660a;
                                                uVar = qa.u.f47670y;
                                                b0Var = sVar.f47668h;
                                                if (f12 < 1.0f) {
                                                    long j26 = b0Var.f47679b0;
                                                    qa.v vVarT3 = b0Var.T(0);
                                                    vVar = vVarT3.W;
                                                    j16 = jUptimeMillis;
                                                    vVarT3.W = null;
                                                    i13 = i21;
                                                    b0Var.J(-1L, sVar.f47661a);
                                                    b0Var.J(j26, -1L);
                                                    sVar.f47661a = j26;
                                                    runnable = sVar.f47667g;
                                                    if (runnable != null) {
                                                        runnable.run();
                                                    }
                                                    b0Var.Y.clear();
                                                    if (vVar != null) {
                                                        vVar.B(vVar, uVar, true);
                                                    }
                                                } else {
                                                    j16 = jUptimeMillis;
                                                    i13 = i21;
                                                    b0Var.B(b0Var, uVar, false);
                                                }
                                                i11++;
                                                jUptimeMillis = j16;
                                                i21 = i13;
                                            } else {
                                                j16 = jUptimeMillis;
                                                i13 = i21;
                                            }
                                            i11++;
                                            jUptimeMillis = j16;
                                            i21 = i13;
                                        }
                                        jUptimeMillis = jUptimeMillis;
                                        i12 = i21;
                                        while (size >= 0) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        i12 = i21;
                                    }
                                }
                                z11 = true;
                                float fMin6 = Math.min(fVar2.f52789b, fVar2.f52794g);
                                fVar2.f52789b = fMin6;
                                float fMax6 = Math.max(fMin6, fVar2.f52795h);
                                fVar2.f52789b = fMax6;
                                fVar2.c(fMax6);
                                if (z11) {
                                    arrayList = fVar2.f52798k;
                                    fVar2.f52793f = false;
                                    cVarB = u5.f.b();
                                    cVarB.f52772a.remove(fVar2);
                                    arrayList2 = cVarB.f52773b;
                                    iIndexOf = arrayList2.indexOf(fVar2);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        cVarB.f52777f = true;
                                    }
                                    fVar2.f52796i = 0L;
                                    fVar2.f52790c = false;
                                    i11 = 0;
                                    while (i11 < arrayList.size()) {
                                        if (arrayList.get(i11) != null) {
                                            qa.r rVar4 = (qa.r) arrayList.get(i11);
                                            f12 = fVar2.f52789b;
                                            sVar = rVar4.f47660a;
                                            uVar = qa.u.f47670y;
                                            b0Var = sVar.f47668h;
                                            if (f12 < 1.0f) {
                                                long j27 = b0Var.f47679b0;
                                                qa.v vVarT4 = b0Var.T(0);
                                                vVar = vVarT4.W;
                                                j16 = jUptimeMillis;
                                                vVarT4.W = null;
                                                i13 = i21;
                                                b0Var.J(-1L, sVar.f47661a);
                                                b0Var.J(j27, -1L);
                                                sVar.f47661a = j27;
                                                runnable = sVar.f47667g;
                                                if (runnable != null) {
                                                    runnable.run();
                                                }
                                                b0Var.Y.clear();
                                                if (vVar != null) {
                                                    vVar.B(vVar, uVar, true);
                                                }
                                            } else {
                                                j16 = jUptimeMillis;
                                                i13 = i21;
                                                b0Var.B(b0Var, uVar, false);
                                            }
                                            i11++;
                                            jUptimeMillis = j16;
                                            i21 = i13;
                                        } else {
                                            j16 = jUptimeMillis;
                                            i13 = i21;
                                        }
                                        i11++;
                                        jUptimeMillis = j16;
                                        i21 = i13;
                                    }
                                    jUptimeMillis = jUptimeMillis;
                                    i12 = i21;
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    i12 = i21;
                                }
                            }
                        }
                    }
                    i21 = i12 + 1;
                    jUptimeMillis = jUptimeMillis;
                    jUptimeMillis2 = jUptimeMillis2;
                    j18 = 0;
                    z13 = false;
                }
                if (cVar2.f52777f) {
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        if (arrayList3.get(size2) == null) {
                            arrayList3.remove(size2);
                        }
                    }
                    if (arrayList3.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        cVar2.f52779h.a();
                    }
                    cVar2.f52777f = false;
                }
                if (arrayList3.size() > 0) {
                    ((Choreographer) cVar2.f52776e.f48095b).postFrameCallback(new o3.b0(cVar2.f52775d, 1));
                    return;
                }
                return;
            case 13:
                a();
                return;
            case 14:
                com.facebook.login.widget.b this$0 = (com.facebook.login.widget.b) this.f40038b;
                if (qf.a.b(com.facebook.login.widget.b.class)) {
                    return;
                }
                try {
                    kotlin.jvm.internal.m.f(this$0, "this$0");
                    this$0.a();
                    return;
                } catch (Throwable th7) {
                    qf.a.a(com.facebook.login.widget.b.class, th7);
                    return;
                }
            case 15:
                um.c.a((TextView) this.f40038b);
                return;
            case 16:
                Typeface typeface = (Typeface) this.f40038b;
                ArrayList arrayList4 = um.c.f53022d;
                if (typeface == null) {
                    um.c.f53021c = false;
                    arrayList4.clear();
                    return;
                }
                um.c.f53019a = typeface;
                um.c.f53021c = false;
                List listA1 = ry.m.a1(arrayList4);
                arrayList4.clear();
                Iterator it = listA1.iterator();
                while (it.hasNext()) {
                    ((fz.a) it.next()).invoke();
                }
                return;
            case 17:
                b();
                return;
            case 18:
                ((v7.c) this.f40038b).f53592g.d();
                return;
            case 19:
                ((v7.q) this.f40038b).f53670k--;
                return;
            case 20:
                ve.g this$1 = (ve.g) this.f40038b;
                if (qf.a.b(ve.g.class)) {
                    return;
                }
                try {
                    kotlin.jvm.internal.m.f(this$1, "this$0");
                    this$1.b();
                    return;
                } catch (Throwable th8) {
                    qf.a.a(ve.g.class, th8);
                    return;
                }
            case 21:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) this.f40038b;
                Surface surface = sphericalGLSurfaceView.H;
                if (surface != null) {
                    Iterator it2 = sphericalGLSurfaceView.f2147a.iterator();
                    while (it2.hasNext()) {
                        ((f7.x) it2.next()).f26935a.J0(null);
                    }
                }
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.f2153t;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                sphericalGLSurfaceView.f2153t = null;
                sphericalGLSurfaceView.H = null;
                return;
            case 22:
                kd.k.b((InputStream) this.f40038b);
                return;
            case 23:
                kd.k.b((ZipInputStream) this.f40038b);
                return;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((wc.b0) this.f40038b).c();
                return;
            default:
                z2.x xVar = (z2.x) this.f40038b;
                Trace.beginSection("measureAndLayout");
                try {
                    xVar.f58708d.s(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        xVar.n();
                        Trace.endSection();
                        xVar.f58719l0 = false;
                        return;
                    } catch (Throwable th9) {
                        Trace.endSection();
                        throw th9;
                    }
                } catch (Throwable th10) {
                    Trace.endSection();
                    throw th10;
                }
        }
    }
}
