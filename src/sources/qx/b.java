package qx;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.View;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import ay.k0;
import b0.o1;
import b7.e0;
import bt.e6;
import bt.v1;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.facebook.FacebookException;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import dt.h2;
import fa.EQx.nuRcCS;
import fr.p3;
import g00.d1;
import g00.p1;
import g00.z0;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import j9.v;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.zip.ZipException;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.n;
import l1.p2;
import l1.s;
import l1.t;
import l1.x1;
import lf.a1;
import lf.j1;
import lf.m1;
import lf.y0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import re.a0;
import re.c0;
import re.d0;
import re.i0;
import re.x;
import re.y;
import rt.gc;
import rt.h9;
import rt.l9;
import rt.pc;
import rt.qc;
import rt.rc;
import ry.r;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static l2.e f48462a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f48463b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f48464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f48465d;

    public static final y A(re.b bVar, Uri uri, m1 m1Var) {
        String path = uri.getPath();
        if ("file".equalsIgnoreCase(uri.getScheme()) && path != null) {
            x xVar = new x(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", xVar);
            return new y(bVar, "me/staging_resources", bundle, c0.POST, m1Var);
        }
        if (!"content".equalsIgnoreCase(uri.getScheme())) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        x xVar2 = new x(uri);
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("file", xVar2);
        return new y(bVar, "me/staging_resources", bundle2, c0.POST, m1Var);
    }

    public static void B(Throwable th2) {
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th2 instanceof OnErrorNotImplementedException) && !(th2 instanceof MissingBackpressureException) && !(th2 instanceof IllegalStateException) && !(th2 instanceof NullPointerException) && !(th2 instanceof IllegalArgumentException) && !(th2 instanceof CompositeException)) {
            th2 = new UndeliverableException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th2, th2);
        }
        th2.printStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    public static final ArrayList C(String value) {
        ?? arrayList;
        kv.j jVar;
        kotlin.jvm.internal.m.f(value, "value");
        boolean z11 = false;
        int i11 = 6;
        int i12 = 4;
        kv.i iVar = null;
        if (oz.q.v0(value, "[[", false) || oz.q.v0(value, "]]", false)) {
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            while (i13 < value.length()) {
                int iI0 = oz.q.I0(value, "[[", i13, false, 4);
                int iI1 = oz.q.I0(value, "]]", i13, false, 4);
                if (iI1 != -1 && (iI0 == -1 || iI1 < iI0)) {
                    throw new IllegalArgumentException("Malformed intro style marker: unexpected ]] in ".concat(value).toString());
                }
                if (iI0 == -1) {
                    String strSubstring = value.substring(i13);
                    kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                    arrayList2.add(new kv.k(strSubstring, null));
                    break;
                }
                if (iI0 > i13) {
                    String strSubstring2 = value.substring(i13, iI0);
                    kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                    arrayList2.add(new kv.k(strSubstring2, null));
                }
                int i14 = iI0 + 2;
                int iI2 = oz.q.I0(value, "]]", i14, false, 4);
                if (iI2 < 0) {
                    throw new IllegalArgumentException("Malformed intro style marker: missing ]] in ".concat(value).toString());
                }
                String strSubstring3 = value.substring(i14, iI2);
                kotlin.jvm.internal.m.e(strSubstring3, "substring(...)");
                int iI3 = oz.q.I0(strSubstring3, "|", 0, false, 6);
                if (iI3 <= 0) {
                    throw new IllegalArgumentException("Malformed intro style marker: missing style separator in ".concat(value).toString());
                }
                String strSubstring4 = strSubstring3.substring(0, iI3);
                kotlin.jvm.internal.m.e(strSubstring4, "substring(...)");
                String strSubstring5 = strSubstring3.substring(iI3 + 1);
                kotlin.jvm.internal.m.e(strSubstring5, "substring(...)");
                if (oz.q.K0(strSubstring4)) {
                    throw new IllegalArgumentException("Malformed intro style marker: empty style in ".concat(value).toString());
                }
                if (strSubstring5.length() <= 0) {
                    throw new IllegalArgumentException("Malformed intro style marker: empty content in ".concat(value).toString());
                }
                if (oz.q.v0(strSubstring5, "[[", false) || oz.q.v0(strSubstring5, "]]", false)) {
                    throw new IllegalArgumentException("Malformed intro style marker: nested marker in ".concat(value).toString());
                }
                arrayList2.add(new kv.k(strSubstring5, strSubstring4));
                i13 = iI2 + 2;
            }
            arrayList = new ArrayList();
            int size = arrayList2.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList2.get(i15);
                i15++;
                if (((kv.k) obj).f38769a.length() > 0) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = ns.o.K(new kv.k(value, null));
        }
        ArrayList arrayList3 = new ArrayList(ry.n.W(arrayList, 10));
        for (kv.k kVar : arrayList) {
            String str = kVar.f38770b;
            String str2 = kVar.f38769a;
            if (str != null) {
                boolean z12 = true;
                switch (str.hashCode()) {
                    case -1339091421:
                        if (!str.equals("danger")) {
                            throw new IllegalArgumentException(defpackage.e.n("Unsupported intro style '", kVar.f38770b, "' in: ", value));
                        }
                        jVar = new kv.j(str2, true, kv.i.Danger);
                        break;
                        break;
                    case -314765822:
                        if (!str.equals("primary")) {
                            throw new IllegalArgumentException(defpackage.e.n("Unsupported intro style '", kVar.f38770b, "' in: ", value));
                        }
                        jVar = new kv.j(str2, true, kv.i.Primary);
                        break;
                        break;
                    case 3029637:
                        if (!str.equals("bold")) {
                            throw new IllegalArgumentException(defpackage.e.n("Unsupported intro style '", kVar.f38770b, "' in: ", value));
                        }
                        jVar = new kv.j(str2, z12, iVar, i12);
                        break;
                        break;
                    case 3321850:
                        if (!str.equals("link")) {
                            throw new IllegalArgumentException(defpackage.e.n("Unsupported intro style '", kVar.f38770b, "' in: ", value));
                        }
                        jVar = new kv.j(str2, z11, kv.i.Link, 2);
                        break;
                        break;
                    default:
                        throw new IllegalArgumentException(defpackage.e.n("Unsupported intro style '", kVar.f38770b, "' in: ", value));
                }
            } else {
                jVar = new kv.j(str2, z11, iVar, i11);
            }
            arrayList3.add(jVar);
        }
        return arrayList3;
    }

    public static LinkedHashSet D(Set set, Iterable elements) {
        int size;
        kotlin.jvm.internal.m.f(set, "<this>");
        kotlin.jvm.internal.m.f(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(ry.x.W(size));
        linkedHashSet.addAll(set);
        ry.m.d0(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static LinkedHashSet E(Set set, Object obj) {
        kotlin.jvm.internal.m.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(ry.x.W(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final void F(p2 p2Var, l1.d dVar, int i11) {
        while (true) {
            int i12 = p2Var.f39416v;
            if (i11 > i12 && i11 < p2Var.f39415u) {
                return;
            }
            if (i12 == 0 && i11 == 0) {
                return;
            }
            p2Var.M();
            if (p2Var.y(p2Var.f39416v)) {
                dVar.q();
            }
            p2Var.j();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd A[RETURN] */
    public static final c00.a G(com.android.billingclient.api.h hVar, mz.k kVar, boolean z11) {
        c00.a aVarI;
        c00.a aVarI2;
        c00.a cVar;
        mz.c cVarJ = d1.j(kVar);
        boolean zA = kVar.a();
        List listC = kVar.c();
        ArrayList arrayList = new ArrayList(ry.n.W(listC, 10));
        Iterator it = listC.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            kotlin.jvm.internal.m.f(null, "<this>");
            throw null;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List list = r.f50854a;
        if (zIsEmpty) {
            if (!d1.i(cVarJ) || hVar.i(cVarJ, list) == null) {
                p1 p1Var = c00.g.f6407a;
                if (zA) {
                    aVarI = c00.g.f6408b.i(cVarJ);
                } else {
                    aVarI = c00.g.f6407a.i(cVarJ);
                    if (aVarI == null) {
                        aVarI = null;
                    }
                }
            } else {
                aVarI = null;
            }
        } else if (hVar.f7508a) {
            aVarI = null;
        } else {
            p1 p1Var2 = c00.g.f6407a;
            Object objG = !zA ? c00.g.f6409c.g(cVarJ, arrayList) : c00.g.f6410d.g(cVarJ, arrayList);
            if (objG instanceof qy.n) {
                objG = null;
            }
            aVarI = (c00.a) objG;
        }
        if (aVarI != null) {
            return aVarI;
        }
        if (arrayList.isEmpty()) {
            aVarI2 = ob.f.L(cVarJ);
            if (aVarI2 == null && (aVarI2 = hVar.i(cVarJ, list)) == null) {
                if (d1.i(cVarJ)) {
                    cVar = new c00.c(cVarJ);
                    aVarI2 = cVar;
                } else {
                    aVarI2 = null;
                }
            }
            if (aVarI2 != null) {
                if (zA) {
                    return s(aVarI2);
                }
                return aVarI2;
            }
        } else {
            ArrayList arrayListM = ob.f.M(hVar, arrayList, z11);
            if (arrayListM != null) {
                c00.a aVarG = ob.f.G(cVarJ, arrayListM, new av.d(arrayList, 20));
                if (aVarG == null) {
                    aVarI2 = hVar.i(cVarJ, arrayListM);
                    if (aVarI2 == null) {
                        if (d1.i(cVarJ)) {
                            cVar = new c00.c(cVarJ);
                            aVarI2 = cVar;
                        } else {
                            aVarI2 = null;
                        }
                    }
                } else {
                    aVarI2 = aVarG;
                }
                if (aVarI2 != null) {
                    if (zA) {
                        return s(aVarI2);
                    }
                    return aVarI2;
                }
            }
        }
        return null;
    }

    public static Set H(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        kotlin.jvm.internal.m.e(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static final int N(Bitmap bitmap) {
        kotlin.jvm.internal.m.f(bitmap, "bitmap");
        Bitmap.Config config = bitmap.getConfig();
        int i11 = config == null ? -1 : jw.a.f37381a[config.ordinal()];
        if (i11 == 1) {
            return 4;
        }
        if (i11 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("RenderScript Toolkit. Only ARGB_8888 and ALPHA_8 Bitmap are supported.");
    }

    public static final g00.m1 b(mz.c cVar, c00.a elementSerializer) {
        kotlin.jvm.internal.m.f(elementSerializer, "elementSerializer");
        return new g00.m1(cVar, elementSerializer);
    }

    public static final void c(ChineseToneLesson chineseToneLesson, js.r rVar, l9 l9Var, fz.a finish, fz.c loginNow, l1.n nVar, int i11) {
        js.r rVar2;
        l9 l9Var2;
        js.r rVar3;
        int i12;
        l9 l9Var3;
        v vVar;
        js.r rVar4;
        kotlin.jvm.internal.m.f(finish, "finish");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        s sVar = (s) nVar;
        sVar.f0(-1085865653);
        int i13 = i11 | (sVar.h(chineseToneLesson) ? 4 : 2) | 144 | (sVar.h(finish) ? 2048 : 1024);
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            sVar.Y();
            int i14 = i11 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i14 == 0 || sVar.C()) {
                boolean zH = sVar.h(chineseToneLesson);
                Object objQ = sVar.Q();
                if (zH || objQ == gVar) {
                    objQ = new cr.n(chineseToneLesson, 20);
                    sVar.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar.d0(-1614864554);
                LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                int i15 = LocalViewModelStoreOwner.$stable;
                ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(sVar, i15);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(js.r.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), aVar);
                sVar.p(false);
                rVar3 = (js.r) viewModelA;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(sVar, i15);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA2 = i20.b.a(z.a(l9.class), current2.getViewModelStore(), null, i20.a.a(current2), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-1009);
                l9Var3 = (l9) viewModelA2;
            } else {
                sVar.W();
                i12 = i13 & (-1009);
                rVar3 = rVar;
                l9Var3 = l9Var;
            }
            sVar.q();
            v vVarH = cf.x.H(new j9.c0[0], sVar);
            boolean zH2 = sVar.h(rVar3) | sVar.h(l9Var3) | ((i12 & 7168) == 2048) | sVar.h(vVarH);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                vVar = vVarH;
                js.r rVar5 = rVar3;
                b1.a aVar2 = new b1.a(rVar5, l9Var3, finish, vVar, loginNow, 10);
                rVar4 = rVar5;
                sVar.o0(aVar2);
                objQ2 = aVar2;
            } else {
                vVar = vVarH;
                rVar4 = rVar3;
            }
            com.bumptech.glide.e.c(vVar, "chinese_tone_test", null, null, null, null, null, null, (fz.c) objQ2, sVar, 48);
            rVar2 = rVar4;
            l9Var2 = l9Var3;
        } else {
            sVar.W();
            rVar2 = rVar;
            l9Var2 = l9Var;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v1(chineseToneLesson, rVar2, l9Var2, finish, loginNow, i11, 5);
        }
    }

    public static final void d(final rc uiState, final h9 settingsUiState, final gc progressUiState, final int i11, final boolean z11, final fz.a getCombo, final fz.a onClickClose, final fz.c onConfirmSettings, final fz.e onWordMatchFailed, final fz.e onWordMatchSuccess, final fz.c onChecked, final fz.a onShowNext, final fz.c onSkip, final fz.a showFinish, l1.n nVar, final int i12) {
        l1.g gVar;
        char c11;
        boolean z12;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(settingsUiState, "settingsUiState");
        kotlin.jvm.internal.m.f(progressUiState, "progressUiState");
        kotlin.jvm.internal.m.f(getCombo, "getCombo");
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onConfirmSettings, "onConfirmSettings");
        kotlin.jvm.internal.m.f(onWordMatchFailed, "onWordMatchFailed");
        kotlin.jvm.internal.m.f(onWordMatchSuccess, "onWordMatchSuccess");
        kotlin.jvm.internal.m.f(onChecked, "onChecked");
        kotlin.jvm.internal.m.f(onShowNext, "onShowNext");
        kotlin.jvm.internal.m.f(onSkip, "onSkip");
        kotlin.jvm.internal.m.f(showFinish, "showFinish");
        s sVar = (s) nVar;
        sVar.f0(-322627755);
        int i13 = i12 | (sVar.h(uiState) ? 4 : 2) | (sVar.h(settingsUiState) ? 32 : 16) | (sVar.h(progressUiState) ? 256 : 128) | (sVar.g(z11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(getCombo) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.h(onClickClose) ? 1048576 : 524288) | (sVar.h(onConfirmSettings) ? 8388608 : 4194304) | (sVar.h(onWordMatchFailed) ? 67108864 : 33554432) | (sVar.h(onWordMatchSuccess) ? 536870912 : 268435456);
        int i14 = (sVar.h(onChecked) ? 4 : 2) | (sVar.h(onShowNext) ? 32 : 16) | (sVar.h(onSkip) ? 256 : 128) | (sVar.h(showFinish) ? 2048 : 1024);
        if (!sVar.T(i13 & 1, ((i13 & 306782355) == 306782354 && (i14 & 1171) == 1170) ? false : true)) {
            sVar.W();
        } else if (uiState instanceof pc) {
            sVar.d0(-807606645);
            tv.a.g(((pc) uiState).f50247a, null, sVar, 0, 6);
            sVar.p(false);
        } else {
            if (!(uiState instanceof qc)) {
                throw nv.p.x(sVar, -807605273, false);
            }
            sVar.d0(734186201);
            Object objQ = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ == gVar2) {
                objQ = t.q(sVar);
                sVar.o0(objQ);
            }
            b0 b0Var = (b0) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar2) {
                objQ2 = t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var = (b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar2) {
                objQ3 = t.B(Boolean.FALSE);
                sVar.o0(objQ3);
            }
            b1 b1Var2 = (b1) objQ3;
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar.d0(734325484);
                Object objQ4 = sVar.Q();
                if (objQ4 == gVar2) {
                    objQ4 = new h2(5, b1Var2);
                    sVar.o0(objQ4);
                }
                fz.a aVar = (fz.a) objQ4;
                boolean z13 = (i13 & 29360128) == 8388608;
                Object objQ5 = sVar.Q();
                if (z13 || objQ5 == gVar2) {
                    objQ5 = new o1(onConfirmSettings, 11);
                    sVar.o0(objQ5);
                }
                gVar = gVar2;
                z12 = false;
                c11 = 4;
                ys.a.w(settingsUiState, null, false, false, aVar, (fz.c) objQ5, null, null, sVar, ((i13 >> 3) & 14) | 28032, 194);
            } else {
                gVar = gVar2;
                c11 = 4;
                z12 = false;
                sVar.d0(726547181);
            }
            sVar.p(z12);
            char c12 = c11;
            t1.d dVarD = t1.e.d(-278655803, new bt.b1(progressUiState, getCombo, b0Var, onClickClose, b1Var, uiState, b1Var2), sVar);
            boolean z14 = (i14 & 14) != c12 ? z12 : true;
            Object objQ6 = sVar.Q();
            if (z14 || objQ6 == gVar) {
                objQ6 = new e6(onChecked, 1);
                sVar.o0(objQ6);
            }
            int i15 = i13 >> 18;
            int i16 = i14 << 12;
            ys.a.n(uiState, settingsUiState, false, z11, 0L, null, null, null, null, null, null, dVarD, onWordMatchFailed, onWordMatchSuccess, (fz.e) objQ6, onShowNext, onSkip, getCombo, showFinish, sVar, (i13 & 112) | ((i13 >> 3) & 7168), (i15 & 7168) | (i15 & 896) | 48 | (458752 & i16) | (i16 & 3670016) | ((i13 << 6) & 29360128) | ((i14 << 15) & 234881024), 2036);
            sVar = sVar;
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(settingsUiState, progressUiState, i11, z11, getCombo, onClickClose, onConfirmSettings, onWordMatchFailed, onWordMatchSuccess, onChecked, onShowNext, onSkip, showFinish, i12) { // from class: fs.e
                public final /* synthetic */ fz.c H;
                public final /* synthetic */ fz.e K;
                public final /* synthetic */ fz.e L;
                public final /* synthetic */ fz.c M;
                public final /* synthetic */ fz.a N;
                public final /* synthetic */ fz.c O;
                public final /* synthetic */ fz.a P;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h9 f28015b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ gc f28016c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f28017d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f28018e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ fz.a f28019f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ fz.a f28020t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = t.M(1);
                    qx.b.d(this.f28014a, this.f28015b, this.f28016c, this.f28017d, this.f28018e, this.f28019f, this.f28020t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, (n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final g00.d e(c00.a elementSerializer) {
        kotlin.jvm.internal.m.f(elementSerializer, "elementSerializer");
        return new g00.d(elementSerializer, 0);
    }

    public static sy.k f(sy.k kVar) {
        sy.g gVar = kVar.f51957a;
        gVar.b();
        return gVar.K > 0 ? kVar : sy.k.f51956b;
    }

    public static uw.n g(Callable callable) {
        try {
            Object objCall = callable.call();
            ax.d.a(objCall, "Scheduler Callable result can't be null");
            return (uw.n) objCall;
        } catch (Throwable th2) {
            throw nx.e.c(th2);
        }
    }

    public static com.google.android.material.button.a h(fz.c... cVarArr) {
        if (cVarArr.length > 0) {
            return new com.google.android.material.button.a(cVarArr, 9);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static int i(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static ArrayList j(AbstractList requests, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        kotlin.jvm.internal.m.f(requests, "requests");
        ArrayList arrayList = new ArrayList(ry.n.W(requests, 10));
        Iterator it = requests.iterator();
        while (it.hasNext()) {
            arrayList.add(new re.b0((y) it.next(), httpURLConnection, new re.r(facebookException)));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x0101 A[Catch: JSONException -> 0x011a, TryCatch #0 {JSONException -> 0x011a, blocks: (B:5:0x0017, B:7:0x001d, B:9:0x0027, B:11:0x002b, B:14:0x0038, B:16:0x0043, B:19:0x004d, B:22:0x0057, B:25:0x005f, B:27:0x0065, B:30:0x006f, B:33:0x0079, B:46:0x00e3, B:35:0x008c, B:38:0x0099, B:40:0x00a2, B:44:0x00b8, B:52:0x00f9, B:54:0x0101, B:55:0x0107), top: B:93:0x0017 }] */
    public static re.b0 k(y request, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
        re.r rVar;
        re.b bVar;
        re.b bVar2;
        int iOptInt;
        String str;
        boolean zOptBoolean;
        int iOptInt2;
        String strOptString;
        String str2;
        String str3;
        Object NULL = obj;
        if (NULL instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) NULL;
            try {
                if (jSONObject.has("code")) {
                    int i11 = jSONObject.getInt("code");
                    Object objS = j1.s(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                    if (objS != null && (objS instanceof JSONObject)) {
                        boolean z11 = false;
                        if (((JSONObject) objS).has("error")) {
                            JSONObject jSONObject2 = (JSONObject) j1.s((JSONObject) objS, "error", null);
                            String strOptString2 = jSONObject2 != null ? jSONObject2.optString("type", null) : null;
                            String strOptString3 = jSONObject2 != null ? jSONObject2.optString("message", null) : null;
                            int iOptInt3 = jSONObject2 != null ? jSONObject2.optInt("code", -1) : -1;
                            int iOptInt4 = jSONObject2 != null ? jSONObject2.optInt("error_subcode", -1) : -1;
                            String strOptString4 = jSONObject2 != null ? jSONObject2.optString("error_user_msg", null) : null;
                            strOptString = jSONObject2 != null ? jSONObject2.optString("error_user_title", null) : null;
                            str = strOptString3;
                            str2 = strOptString4;
                            zOptBoolean = jSONObject2 != null ? jSONObject2.optBoolean("is_transient", false) : false;
                            iOptInt2 = iOptInt4;
                            z11 = true;
                            str3 = strOptString2;
                            iOptInt = iOptInt3;
                        } else if (((JSONObject) objS).has("error_code") || ((JSONObject) objS).has("error_msg") || ((JSONObject) objS).has("error_reason")) {
                            String strOptString5 = ((JSONObject) objS).optString("error_reason", null);
                            String strOptString6 = ((JSONObject) objS).optString("error_msg", null);
                            iOptInt = ((JSONObject) objS).optInt("error_code", -1);
                            str = strOptString6;
                            zOptBoolean = false;
                            iOptInt2 = ((JSONObject) objS).optInt("error_subcode", -1);
                            z11 = true;
                            strOptString = null;
                            str2 = null;
                            str3 = strOptString5;
                        } else {
                            zOptBoolean = false;
                            iOptInt2 = -1;
                            iOptInt = -1;
                            str3 = null;
                            str = null;
                            strOptString = null;
                            str2 = null;
                        }
                        if (z11) {
                            rVar = new re.r(i11, iOptInt, iOptInt2, str3, str, strOptString, str2, obj2, null, zOptBoolean);
                        } else {
                            if (i11 <= 299) {
                            }
                            if (jSONObject.has("body")) {
                            }
                            rVar = new re.r(i11, -1, -1, null, null, null, null, obj2, null, false);
                        }
                    } else if (i11 <= 299 || 200 > i11) {
                        if (jSONObject.has("body")) {
                        }
                        rVar = new re.r(i11, -1, -1, null, null, null, null, obj2, null, false);
                    } else {
                        rVar = null;
                    }
                } else {
                    rVar = null;
                }
            } catch (JSONException unused) {
            }
            if (rVar != null) {
                rVar.toString();
                if (rVar.f49195b == 190 && (bVar = request.f49228a) != null) {
                    Date date = re.b.N;
                    if (bVar.equals(ns.o.x())) {
                        int i12 = rVar.f49196c;
                        k0 k0Var = re.f.f49141f;
                        if (i12 != 493) {
                            k0Var.t().c(null, true);
                        } else {
                            re.b bVarX = ns.o.x();
                            if (bVarX != null && !new Date().after(bVarX.f49115a) && (bVar2 = k0Var.t().f49145c) != null) {
                                k0Var.t().c(new re.b(bVar2.f49119e, bVar2.H, bVar2.K, bVar2.f49116b, bVar2.f49117c, bVar2.f49118d, bVar2.f49120f, new Date(), new Date(), bVar2.L, "facebook"), true);
                            }
                        }
                    }
                }
                return new re.b0(request, httpURLConnection, rVar);
            }
            Object objS2 = j1.s(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (objS2 instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) objS2;
                return new re.b0(request, httpURLConnection, jSONObject3.toString(), jSONObject3);
            }
            if (objS2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objS2;
                String rawResponse = jSONArray.toString();
                kotlin.jvm.internal.m.f(request, "request");
                kotlin.jvm.internal.m.f(rawResponse, "rawResponse");
                return new re.b0(request, httpURLConnection, null, jSONArray, null);
            }
            NULL = JSONObject.NULL;
            kotlin.jvm.internal.m.e(NULL, "NULL");
        }
        if (NULL == JSONObject.NULL) {
            return new re.b0(request, httpURLConnection, NULL.toString(), null);
        }
        throw new FacebookException("Got unexpected object type in response, class: ".concat(NULL.getClass().getSimpleName()));
    }

    public static String m(androidx.glance.appwidget.protobuf.h hVar) {
        StringBuilder sb2 = new StringBuilder(hVar.size());
        for (int i11 = 0; i11 < hVar.size(); i11++) {
            byte b3 = hVar.b(i11);
            if (b3 == 34) {
                sb2.append("\\\"");
            } else if (b3 == 39) {
                sb2.append("\\'");
            } else if (b3 != 92) {
                switch (b3) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b3 < 32 || b3 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b3 >>> 6) & 3) + 48));
                            sb2.append((char) (((b3 >>> 3) & 7) + 48));
                            sb2.append((char) ((b3 & 7) + 48));
                        } else {
                            sb2.append((char) b3);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static i9.f n(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j11 = length - 22;
        if (j11 < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j12 = length - 65558;
        long j13 = j12 >= 0 ? j12 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j11);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                i9.f fVar = new i9.f();
                fVar.f34276b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                fVar.f34275a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return fVar;
            }
            j11--;
        } while (j11 >= j13);
        throw new ZipException("End Of Central Directory signature not found");
    }

    public static Set o() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class q(mz.c cVar) {
        kotlin.jvm.internal.m.f(cVar, "<this>");
        Class clsE = ((kotlin.jvm.internal.d) cVar).e();
        if (clsE.isPrimitive()) {
            String name = clsE.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals(Constants.LONG)) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsE;
    }

    public static final kotlin.jvm.internal.e r(Class cls) {
        kotlin.jvm.internal.m.f(cls, "<this>");
        return z.a(cls);
    }

    public static final c00.a s(c00.a aVar) {
        kotlin.jvm.internal.m.f(aVar, "<this>");
        return aVar.getDescriptor().c() ? aVar : new z0(aVar);
    }

    public static final ArrayList t(xf.l lVar, UUID appCallId) {
        List<xf.k> list;
        Uri uri;
        Bitmap bitmap;
        kotlin.jvm.internal.m.f(appCallId, "appCallId");
        if (lVar == null || (list = lVar.f56044t) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (xf.k kVar : list) {
            if (kVar != null) {
                bitmap = kVar.f56039b;
                uri = kVar.f56040c;
            } else {
                uri = null;
                bitmap = null;
            }
            lf.z0 z0VarB = bitmap != null ? a1.b(appCallId, bitmap) : uri != null ? a1.c(appCallId, uri) : null;
            if (z0VarB != null) {
                arrayList.add(z0VarB);
            }
        }
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            arrayList2.add(((lf.z0) obj).f40142d);
        }
        a1.a(arrayList);
        return arrayList2;
    }

    public static final String v(Uri uri) {
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        kotlin.jvm.internal.m.e(string, "uri.toString()");
        int iN0 = oz.q.N0(string, '.', 0, 6);
        if (iN0 == -1) {
            return null;
        }
        String strSubstring = string.substring(iN0);
        kotlin.jvm.internal.m.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static HashSet w(Object... objArr) {
        HashSet hashSet = new HashSet(ry.x.W(objArr.length));
        ry.l.h0(objArr, hashSet);
        return hashSet;
    }

    public static void x(String str, String str2) {
        se.m mVar = new se.m(re.s.a(), (String) null);
        Bundle bundleE = e0.e("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundleE.putString("error_message", str2);
        }
        if (i0.c()) {
            mVar.g("fb_share_dialog_result", bundleE);
        }
    }

    public static LinkedHashSet y(Set set, Object obj) {
        kotlin.jvm.internal.m.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(ry.x.W(set.size()));
        boolean z11 = false;
        for (Object obj2 : set) {
            boolean z12 = true;
            if (!z11 && kotlin.jvm.internal.m.a(obj2, obj)) {
                z11 = true;
                z12 = false;
            }
            if (z12) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set z(Set set, Iterable iterable) {
        kotlin.jvm.internal.m.f(set, "<this>");
        Collection<?> collectionA1 = iterable instanceof Collection ? (Collection) iterable : ry.m.a1(iterable);
        if (collectionA1.isEmpty()) {
            return ry.m.f1(set);
        }
        if (!(collectionA1 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionA1);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionA1).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public void I(View view, float f5) {
        if (f48463b) {
            try {
                c3.c.m(view, f5);
                return;
            } catch (NoSuchMethodError unused) {
                f48463b = false;
            }
        }
        view.setAlpha(f5);
    }

    public void J(View view, int i11) {
        if (!f48465d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f48464c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f48465d = true;
        }
        Field field = f48464c;
        if (field != null) {
            try {
                f48464c.setInt(view, i11 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void K(c cVar) {
        try {
            L(cVar);
        } catch (NullPointerException e8) {
            throw e8;
        } catch (Throwable th2) {
            throw w4.c.d(th2, th2, "Actually not, but can't pass out an exception otherwise...", th2);
        }
    }

    public abstract void L(c cVar);

    public yx.d M(o oVar) {
        Objects.requireNonNull(oVar, "scheduler is null");
        return new yx.d(this, oVar);
    }

    public float u(View view) {
        if (f48463b) {
            try {
                return c3.c.f(view);
            } catch (NoSuchMethodError unused) {
                f48463b = false;
            }
        }
        return view.getAlpha();
    }

    public static ArrayList l(InputStream inputStream, HttpURLConnection httpURLConnection, a0 requests) throws JSONException {
        Object obj;
        kotlin.jvm.internal.m.f(requests, "requests");
        String strI = j1.I(inputStream);
        p3 p3Var = y0.f40132d;
        p3.s(d0.INCLUDE_RAW_RESPONSES, "Response", nuRcCS.RujVLF, Integer.valueOf(strI.length()), strI);
        Object resultObject = new JSONTokener(strI).nextValue();
        kotlin.jvm.internal.m.e(resultObject, "resultObject");
        int size = requests.f49113c.size();
        ArrayList arrayList = new ArrayList(size);
        if (size == 1) {
            y yVar = (y) requests.get(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("body", resultObject);
                jSONObject.put("code", httpURLConnection.getResponseCode());
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                obj = jSONArray;
            } catch (IOException e8) {
                arrayList.add(new re.b0(yVar, httpURLConnection, new re.r(e8)));
                obj = resultObject;
            } catch (JSONException e10) {
                arrayList.add(new re.b0(yVar, httpURLConnection, new re.r(e10)));
                obj = resultObject;
            }
        } else {
            obj = resultObject;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) obj;
            if (jSONArray2.length() == size) {
                int length = jSONArray2.length();
                for (int i11 = 0; i11 < length; i11++) {
                    y yVar2 = (y) requests.get(i11);
                    try {
                        Object obj2 = ((JSONArray) obj).get(i11);
                        kotlin.jvm.internal.m.e(obj2, "obj");
                        arrayList.add(k(yVar2, httpURLConnection, obj2, resultObject));
                    } catch (FacebookException e11) {
                        arrayList.add(new re.b0(yVar2, httpURLConnection, new re.r(e11)));
                    } catch (JSONException e12) {
                        arrayList.add(new re.b0(yVar2, httpURLConnection, new re.r(e12)));
                    }
                }
                p3 p3Var2 = y0.f40132d;
                p3.s(d0.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.f49112b, Integer.valueOf(strI.length()), arrayList);
                return arrayList;
            }
        }
        throw new FacebookException("Unexpected number of results");
    }

    public static final Class p(mz.c cVar) {
        kotlin.jvm.internal.m.f(cVar, "<this>");
        Class clsE = ((kotlin.jvm.internal.d) cVar).e();
        kotlin.jvm.internal.m.d(clsE, bjXGJ.qBkHAQka);
        return clsE;
    }
}
