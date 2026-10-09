package ns;

import android.content.Context;
import android.content.Intent;
import android.graphics.Path;
import android.os.UserManager;
import android.util.Base64;
import android.util.SparseArray;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.facebook.FacebookException;
import com.google.api.Service;
import com.lingo.lingoskill.speak.ui.SpeakTryActivity;
import com.lingodeer.data.model.INTENTS;
import com.liulishuo.filedownloader.exception.PathConflictException;
import dt.Xk.wuoM;
import f0.h1;
import h1.g6;
import j0.v1;
import java.io.Closeable;
import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import l1.b1;
import l1.b3;
import l1.x1;
import l1.z1;
import lf.j1;
import n0.e1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f44007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f44008b;

    public static int A(List list) {
        kotlin.jvm.internal.m.f(list, "<this>");
        return list.size() - 1;
    }

    public static boolean C(int i11, long j11, String str, String str2, ob.u uVar) {
        int i12;
        if (str2 != null && str != null) {
            ij.d dVar = (ij.d) uVar.f44892c;
            synchronized (dVar) {
                int size = ((SparseArray) dVar.f34422c).size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size) {
                        i12 = 0;
                        break;
                    }
                    xv.f fVar = (xv.f) ((SparseArray) dVar.f34422c).valueAt(i13);
                    if (fVar != null && fVar.h()) {
                        bw.c cVar = fVar.f56597b;
                        if (cVar.f6390a != i11 && str.equals(cVar.c())) {
                            i12 = fVar.f56597b.f6390a;
                            break;
                        }
                    }
                    i13++;
                }
            }
            if (i12 != 0) {
                aw.r rVar = aw.s.f3241a;
                int i14 = ew.f.f25949a;
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder("There is an another running task(");
                sb2.append(i12);
                sb2.append(") with the same downloading path(");
                sb2.append(str);
                sb2.append("), because of they are with the same target-file-path(");
                PathConflictException pathConflictException = new PathConflictException(ep.a.k(sb2, str2, "), so if the current task is started, the path of the file is sure to be written by multiple tasks, it is wrong, then you receive this exception to avoid such conflict."));
                rVar.a(j11 > 2147483647L ? new aw.f(i11, j11, pathConflictException) : new aw.y(i11, (int) j11, pathConflictException));
                return true;
            }
        }
        return false;
    }

    public static boolean D(String str, int i11, boolean z11, boolean z12) {
        aw.p vVar;
        if (z11 || str == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        long length = file.length();
        if (length > 2147483647L) {
            vVar = z12 ? new aw.c(i11, length, true) : new aw.d(i11, length, true);
        } else {
            vVar = z12 ? new aw.v(i11, true, (int) length) : new aw.w(i11, true, (int) length);
        }
        aw.s.f3241a.a(vVar);
        return true;
    }

    public static boolean E(int i11, bw.c cVar, ob.u uVar, boolean z11) {
        aw.p d0Var;
        if (!uVar.x(cVar)) {
            return false;
        }
        long j11 = cVar.f6396t.get();
        long j12 = cVar.H;
        if (j12 > 2147483647L) {
            d0Var = z11 ? new aw.k(j11, i11, j12) : new aw.l(j11, i11, j12);
        } else {
            d0Var = z11 ? new aw.d0(i11, (int) j11, (int) j12) : new aw.e0(i11, (int) j11, (int) j12);
        }
        aw.s.f3241a.a(d0Var);
        return true;
    }

    public static boolean F() {
        re.b bVar = re.f.f49141f.t().f49145c;
        return (bVar == null || new Date().after(bVar.f49115a)) ? false : true;
    }

    public static final boolean G(String str) {
        List<String> listK;
        String string = oz.q.i1(str).toString();
        if (string.length() != 0) {
            Matcher matcherW = nv.p.w(0, "\\s+", "compile(...)", string);
            if (matcherW.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iC = 0;
                do {
                    iC = nv.p.c(matcherW, string, iC, arrayList);
                } while (matcherW.find());
                nv.p.B(iC, string, arrayList);
                listK = arrayList;
            } else {
                listK = K(string.toString());
            }
            if (listK.isEmpty()) {
                return true;
            }
            for (String str2 : listK) {
                for (int i11 = 0; i11 < str2.length(); i11++) {
                    char cCharAt = str2.charAt(i11);
                    if (('0' <= cCharAt && cCharAt < ':') || ((65296 <= cCharAt && cCharAt < 65306) || cCharAt == ',' || cCharAt == 65292)) {
                    }
                }
                for (int i12 = 0; i12 < str2.length(); i12++) {
                    char cCharAt2 = str2.charAt(i12);
                    if (('0' > cCharAt2 || cCharAt2 >= ':') && (65296 > cCharAt2 || cCharAt2 >= 65306)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean H(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static final boolean I(String str) {
        if (str == null || str.length() == 0 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("^[-._~A-Za-z0-9]+$");
        kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
        return patternCompile.matcher(str).matches();
    }

    public static final boolean J(ht.r rVar, int i11, int i12) {
        kotlin.jvm.internal.m.f(rVar, "<this>");
        if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(i12))) {
            return rVar == ht.r.M9 && i11 == 0;
        }
        return ry.l.D(new Integer[]{12, 1}, Integer.valueOf(i12)) && rVar == ht.r.M9 && ry.l.D(new Integer[]{1, 2, 5}, Integer.valueOf(i11));
    }

    public static List K(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.m.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List L(Object... elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        return elements.length > 0 ? ry.l.A(elements) : ry.r.f50854a;
    }

    public static ArrayList M(Object... elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new ry.j(elements, true));
    }

    public static Intent N(Context context, int i11, long j11) {
        kotlin.jvm.internal.m.f(context, "context");
        Intent intent = new Intent(context, (Class<?>) SpeakTryActivity.class);
        intent.putExtra(INTENTS.EXTRA_INT, i11);
        intent.putExtra(INTENTS.EXTRA_LONG, j11);
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0009 A[SYNTHETIC] */
    public static final ArrayList O(List list) {
        String lowerCase;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String string = oz.q.i1((String) it.next()).toString();
            int length = string.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length) {
                int type = Character.getType(string.charAt(!z12 ? i11 : length));
                if (type != 29 && type != 30) {
                    switch (type) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case Service.METRICS_FIELD_NUMBER /* 24 */:
                            z11 = true;
                            break;
                        default:
                            z11 = false;
                            break;
                    }
                } else {
                    z11 = true;
                }
                if (z12) {
                    if (z11) {
                        length--;
                    } else {
                        lowerCase = oz.q.i1(string.subSequence(i11, length + 1).toString()).toString().toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                        if (lowerCase.length() <= 0) {
                            lowerCase = null;
                        }
                        if (lowerCase != null) {
                            arrayList.add(lowerCase);
                        }
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z12 = true;
                }
            }
            lowerCase = oz.q.i1(string.subSequence(i11, length + 1).toString()).toString().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
            if (lowerCase.length() <= 0) {
                lowerCase = null;
            }
            if (lowerCase != null) {
                arrayList.add(lowerCase);
            }
        }
        return arrayList;
    }

    public static final List P(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : K(list.get(0));
        }
        return ry.r.f50854a;
    }

    public static final void Q(int i11, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(hh.p0.h(i12, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i12 > i11) {
            throw new IndexOutOfBoundsException(hh.p0.l("toIndex (", i12, ") is greater than size (", i11, ")."));
        }
    }

    public static final ht.m R(q judgment, boolean z11, boolean z12) {
        kotlin.jvm.internal.m.f(judgment, "judgment");
        int i11 = ht.n.f33752a[judgment.ordinal()];
        if (i11 == 1) {
            return z12 ? ht.m.CORRECT_AFTER_RETRY : ht.m.CORRECT;
        }
        if (i11 == 2) {
            return (!z11 || z12) ? ht.m.WRONG : ht.m.RETRY;
        }
        if (i11 == 3) {
            return ht.m.WRONG;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static List S(Iterable iterable) {
        kotlin.jvm.internal.m.f(iterable, "<this>");
        List listD1 = ry.m.d1(iterable);
        Collections.shuffle(listD1);
        return listD1;
    }

    public static List T(ArrayList arrayList, jz.e eVar) {
        List listD1 = ry.m.d1(arrayList);
        for (int iA = A(listD1); iA > 0; iA--) {
            int iD = eVar.d(iA + 1);
            ArrayList arrayList2 = (ArrayList) listD1;
            arrayList2.set(iD, arrayList2.set(iA, arrayList2.get(iD)));
        }
        return listD1;
    }

    public static void U() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void V() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX WARN: Code duplicated, block: B:177:0x026f  */
    public static final void a(z1.r rVar, m0.x xVar, m0.e eVar, v1 v1Var, f0.t0 t0Var, boolean z11, d0.i iVar, j0.h hVar, j0.f fVar, fz.c cVar, l1.n nVar, int i11, int i12) {
        int i13;
        int i14;
        m0.x xVar2;
        l1.s sVar;
        boolean z12;
        Object oVar;
        m0.x xVar3;
        boolean z13;
        boolean z14;
        mz.g gVar;
        z1.r rVarM;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(708740370);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.f(rVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.f(xVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= (i11 & 512) == 0 ? sVar2.f(eVar) : sVar2.h(eVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar2.f(v1Var) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= sVar2.g(false) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((i11 & 196608) == 0) {
            i13 |= sVar2.g(true) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= sVar2.f(t0Var) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= sVar2.g(z11) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= sVar2.f(iVar) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= sVar2.f(hVar) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (sVar2.f(fVar) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar2.h(cVar) ? 32 : 16;
        }
        if (sVar2.T(i13 & 1, ((i13 & 306783379) == 306783378 && (i14 & 19) == 18) ? false : true)) {
            sVar2.Y();
            if ((i11 & 1) != 0 && !sVar2.C()) {
                sVar2.W();
            }
            sVar2.q();
            int i15 = i13 >> 3;
            int i16 = i15 & 14;
            int i17 = i16 | (i14 & 112);
            b1 b1VarH = l1.t.H(cVar, sVar2);
            int i18 = i13;
            boolean z15 = (((i17 & 14) ^ 6) > 4 && sVar2.f(xVar)) || (i17 & 6) == 4;
            Object objQ = sVar2.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (z15 || objQ == gVar2) {
                l1.g gVar3 = l1.g.f39301e;
                objQ = new g6(0, 3, b3.class, l1.t.t(new z1(3, l1.t.t(new jt.i0(20, b1VarH), gVar3), xVar), gVar3), "value", "getValue()Ljava/lang/Object;");
                sVar2.o0(objQ);
            }
            mz.g gVar4 = (mz.g) objQ;
            int i19 = i16 | ((i18 >> 9) & 112);
            boolean z16 = ((((i19 & 14) ^ 6) > 4 && sVar2.f(xVar)) || (i19 & 6) == 4) | ((((i19 & 112) ^ 48) > 32 && sVar2.g(false)) || (i19 & 48) == 32);
            Object objQ2 = sVar2.Q();
            if (z16 || objQ2 == gVar2) {
                objQ2 = new m0.a0(xVar);
                sVar2.o0(objQ2);
            }
            m0.a0 a0Var = (m0.a0) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar2) {
                objQ3 = l1.t.q(sVar2);
                sVar2.o0(objQ3);
            }
            rz.b0 b0Var = (rz.b0) objQ3;
            g2.c0 c0Var = (g2.c0) sVar2.j(g1.f58546g);
            n0.f0 f0Var = !((Boolean) sVar2.j(g1.f58560v)).booleanValue() ? e1.f42938a : null;
            int i21 = (i18 & 524272) | ((i14 << 18) & 3670016) | ((i18 >> 6) & 29360128);
            boolean z17 = ((((i21 & 896) ^ 384) > 256 && sVar2.f(eVar)) || (i21 & 384) == 256) | ((((i21 & 112) ^ 48) > 32 && sVar2.f(xVar)) || (i21 & 48) == 32) | ((((i21 & 7168) ^ 3072) > 2048 && sVar2.f(v1Var)) || (i21 & 3072) == 2048);
            if (((57344 & i21) ^ 24576) > 16384 && sVar2.g(false)) {
                z12 = true;
            } else if ((i21 & 24576) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean zF = ((((i21 & 29360128) ^ 12582912) > 8388608 && sVar2.f(hVar)) || (i21 & 12582912) == 8388608) | z17 | z12 | ((((458752 & i21) ^ 196608) > 131072 && sVar2.g(true)) || (i21 & 196608) == 131072) | ((((i21 & 3670016) ^ 1572864) > 1048576 && sVar2.f(fVar)) || (i21 & 1572864) == 1048576) | sVar2.f(c0Var);
            Object objQ4 = sVar2.Q();
            if (zF || objQ4 == gVar2) {
                xVar3 = xVar;
                z13 = false;
                z14 = true;
                oVar = new m0.o(xVar3, v1Var, gVar4, eVar, hVar, fVar, b0Var, c0Var, f0Var);
                gVar = gVar4;
                sVar2.o0(oVar);
            } else {
                oVar = objQ4;
                gVar = gVar4;
                z13 = false;
                z14 = true;
                xVar3 = xVar;
            }
            n0.c0 c0Var2 = (n0.c0) oVar;
            h1 h1Var = h1.Vertical;
            if (z11) {
                sVar2.d0(27343139);
                boolean z18 = (((i16 ^ 6) <= 4 || !sVar2.f(xVar3)) && (i15 & 6) != 4) ? z13 : z14;
                Object objQ5 = sVar2.Q();
                if (z18 || objQ5 == gVar2) {
                    objQ5 = new m0.f(xVar3);
                    sVar2.o0(objQ5);
                }
                rVarM = n0.l.m((m0.f) objQ5, xVar3.f40662n, h1Var);
                sVar2.p(z13);
            } else {
                sVar2.d0(27639344);
                sVar2.p(z13);
                rVarM = z1.o.f58481a;
            }
            xVar2 = xVar3;
            sVar = sVar2;
            n0.l.a(gVar, d0.n.w(n0.l.n(rVar.i(xVar3.f40660k).i(xVar3.f40661l), gVar, a0Var, h1Var, z11).i(rVarM).i(xVar3.m.f43017i), xVar3, h1Var, z11, t0Var, xVar3.f40655f, false, iVar, null), xVar2.f40663o, c0Var2, sVar, 0);
        } else {
            xVar2 = xVar;
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m0.g(rVar, xVar2, eVar, v1Var, t0Var, z11, iVar, hVar, fVar, cVar, i11, i12);
        }
    }

    public static ArrayList b(Object... elements) {
        kotlin.jvm.internal.m.f(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new ry.j(elements, true));
    }

    public static int c(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        kotlin.jvm.internal.m.f(arrayList, "<this>");
        Q(arrayList.size(), size);
        int i11 = size - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = qx.b.i((Comparable) arrayList.get(i13), comparable);
            if (i14 < 0) {
                i12 = i13 + 1;
            } else {
                if (i14 <= 0) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static ff.e d(JSONObject jSONObject) {
        float[] fArr;
        float[] fArr2;
        if (jSONObject == null) {
            return null;
        }
        try {
            String useCase = jSONObject.getString("use_case");
            String assetUri = jSONObject.getString("asset_uri");
            String strOptString = jSONObject.optString("rules_uri", null);
            int i11 = jSONObject.getInt("version_id");
            ff.g gVar = ff.g.f27245a;
            JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
            if (qf.a.b(ff.g.class)) {
                fArr2 = null;
            } else {
                try {
                    if (qf.a.b(gVar) || jSONArray == null) {
                        fArr = null;
                        fArr2 = fArr;
                    } else {
                        try {
                            fArr = new float[jSONArray.length()];
                            int length = jSONArray.length();
                            for (int i12 = 0; i12 < length; i12++) {
                                try {
                                    String string = jSONArray.getString(i12);
                                    kotlin.jvm.internal.m.e(string, "jsonArray.getString(i)");
                                    fArr[i12] = Float.parseFloat(string);
                                } catch (JSONException unused) {
                                }
                            }
                        } catch (Throwable th2) {
                            qf.a.a(gVar, th2);
                            fArr = null;
                        }
                        fArr2 = fArr;
                    }
                } catch (Throwable th3) {
                    qf.a.a(ff.g.class, th3);
                    fArr2 = null;
                }
            }
            kotlin.jvm.internal.m.e(useCase, "useCase");
            kotlin.jvm.internal.m.e(assetUri, "assetUri");
            return new ff.e(useCase, assetUri, strOptString, i11, fArr2);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static sy.c e(sy.c cVar) {
        cVar.h();
        cVar.f51935c = true;
        return cVar.f51934b > 0 ? cVar : sy.c.f51932d;
    }

    public static final e00.h f(String str, e00.g[] gVarArr, fz.c cVar) {
        if (oz.q.K0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        e00.a aVar = new e00.a(str);
        cVar.invoke(aVar);
        return new e00.h(str, e00.m.f24700c, aVar.f24663b.size(), ry.l.k0(gVarArr), aVar);
    }

    public static e00.h g(String str, e00.g[] gVarArr) {
        if (oz.q.K0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        e00.a aVar = new e00.a(str);
        return new e00.h(str, e00.m.f24700c, aVar.f24663b.size(), ry.l.k0(gVarArr), aVar);
    }

    public static final e00.h h(String serialName, o00.a aVar, e00.g[] gVarArr, fz.c cVar) {
        kotlin.jvm.internal.m.f(serialName, "serialName");
        if (oz.q.K0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (aVar.equals(e00.m.f24700c)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        e00.a aVar2 = new e00.a(serialName);
        cVar.invoke(aVar2);
        return new e00.h(serialName, aVar, aVar2.f24663b.size(), ry.l.k0(gVarArr), aVar2);
    }

    public static e00.h i(String serialName, o00.a aVar, e00.g[] gVarArr) {
        kotlin.jvm.internal.m.f(serialName, "serialName");
        if (oz.q.K0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (aVar.equals(e00.m.f24700c)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        e00.a aVar2 = new e00.a(serialName);
        return new e00.h(serialName, aVar, aVar2.f24663b.size(), ry.l.k0(gVarArr), aVar2);
    }

    public static void j(String str, boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void k(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void m(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                cf.x.b(th2, th3);
            }
        }
    }

    public static re.b n(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getInt("version") > 1) {
            throw new FacebookException("Unknown AccessToken serialization format.");
        }
        String token = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray permissionsArray = jSONObject.getJSONArray("permissions");
        JSONArray declinedPermissionsArray = jSONObject.getJSONArray("declined_permissions");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("expired_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        String string = jSONObject.getString("source");
        kotlin.jvm.internal.m.e(string, "jsonObject.getString(SOURCE_KEY)");
        re.g gVarValueOf = re.g.valueOf(string);
        String applicationId = jSONObject.getString("application_id");
        String userId = jSONObject.getString("user_id");
        Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
        String strOptString = jSONObject.optString("graph_domain", null);
        kotlin.jvm.internal.m.e(token, "token");
        kotlin.jvm.internal.m.e(applicationId, "applicationId");
        kotlin.jvm.internal.m.e(userId, "userId");
        kotlin.jvm.internal.m.e(permissionsArray, "permissionsArray");
        ArrayList arrayListA = j1.A(permissionsArray);
        kotlin.jvm.internal.m.e(declinedPermissionsArray, "declinedPermissionsArray");
        return new re.b(token, applicationId, userId, arrayListA, j1.A(declinedPermissionsArray), jSONArrayOptJSONArray == null ? new ArrayList() : j1.A(jSONArrayOptJSONArray), gVarValueOf, date, date2, date3, strOptString);
    }

    public static sy.c o() {
        return new sy.c(10);
    }

    public static final h p(String responseText) {
        s sVar;
        kotlin.jvm.internal.m.f(responseText, "responseText");
        h00.s sVar2 = xt.c.f56291a;
        sVar2.getClass();
        g gVar = (g) sVar2.b(g.Companion.serializer(), responseText);
        q judgment = gVar.f43971a;
        b correctionCount = gVar.f43972b;
        s retryReason = gVar.f43973c;
        kotlin.jvm.internal.m.f(judgment, "judgment");
        kotlin.jvm.internal.m.f(correctionCount, "correctionCount");
        kotlin.jvm.internal.m.f(retryReason, "retryReason");
        q qVar = q.CORRECT;
        if (judgment == qVar && correctionCount == b.ZERO && retryReason == (sVar = s.NONE)) {
            return new h(qVar, sVar);
        }
        q qVar2 = q.RETRY;
        return (judgment == qVar2 && correctionCount == b.ONE && retryReason != s.NONE) ? new h(qVar2, retryReason) : h.f43975c;
    }

    public static final bv.i0 q(h00.c cVar, String str) {
        kotlin.jvm.internal.m.f(cVar, "<this>");
        h00.m mVarD = cVar.d(str);
        h00.z zVarG = h00.n.g(mVarD);
        h00.m mVar = (h00.m) zVarG.get("errId");
        String strB = null;
        Integer numE = mVar != null ? h00.n.e(h00.n.h(mVar)) : null;
        if (numE == null) {
            return new bv.h0((bv.l0) cVar.a(bv.l0.Companion.serializer(), mVarD));
        }
        int iIntValue = numE.intValue();
        h00.m mVar2 = (h00.m) zVarG.get("error");
        if (mVar2 != null) {
            h00.d0 d0VarH = h00.n.h(mVar2);
            if (!(d0VarH instanceof h00.w)) {
                strB = d0VarH.b();
            }
        }
        return new bv.g0(iIntValue, strB);
    }

    public static final void s(File file) {
        File[] fileArrListFiles;
        file.getAbsolutePath();
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                kotlin.jvm.internal.m.c(file2);
                s(file2);
            }
        }
        if (file.delete()) {
            file.getAbsolutePath();
        } else {
            file.getAbsolutePath();
        }
    }

    public static void u(ff.e eVar, ArrayList arrayList) {
        File[] fileArrListFiles;
        String str = eVar.f27236a;
        int i11 = eVar.f27239d;
        File fileB = ff.i.b();
        if (fileB != null && (fileArrListFiles = fileB.listFiles()) != null && fileArrListFiles.length != 0) {
            String str2 = str + '_' + i11;
            for (File file : fileArrListFiles) {
                String name = file.getName();
                kotlin.jvm.internal.m.e(name, "name");
                if (oz.x.s0(name, str, false) && !oz.x.s0(name, str2, false)) {
                    file.delete();
                }
            }
        }
        String str3 = str + '_' + i11;
        String str4 = eVar.f27237b;
        com.google.firebase.database.android.d dVar = new com.google.firebase.database.android.d(arrayList, 18);
        File file2 = new File(ff.i.b(), str3);
        if (file2.exists()) {
            dVar.e(file2);
        } else {
            new ef.m(str4, file2, dVar).execute(new String[0]);
        }
    }

    public static final String w(String codeVerifier, tf.a codeChallengeMethod) {
        kotlin.jvm.internal.m.f(codeVerifier, "codeVerifier");
        kotlin.jvm.internal.m.f(codeChallengeMethod, "codeChallengeMethod");
        if (!I(codeVerifier)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == tf.a.PLAIN) {
            return codeVerifier;
        }
        try {
            byte[] bytes = codeVerifier.getBytes(oz.a.f46136d);
            kotlin.jvm.internal.m.e(bytes, "this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            kotlin.jvm.internal.m.e(strEncodeToString, "{\n      // try to genera… or Base64.NO_WRAP)\n    }");
            return strEncodeToString;
        } catch (Exception e8) {
            throw new FacebookException(e8);
        }
    }

    public static re.b x() {
        return re.f.f49141f.t().f49145c;
    }

    public static lz.g y(Collection collection) {
        kotlin.jvm.internal.m.f(collection, "<this>");
        return new lz.g(0, collection.size() - 1, 1);
    }

    public static we.c z(JSONObject jSONObject) throws JSONException {
        String eventName = jSONObject.getString("event_name");
        String string = jSONObject.getString("method");
        kotlin.jvm.internal.m.e(string, "mapping.getString(\"method\")");
        Locale ENGLISH = Locale.ENGLISH;
        kotlin.jvm.internal.m.e(ENGLISH, "ENGLISH");
        String upperCase = string.toUpperCase(ENGLISH);
        kotlin.jvm.internal.m.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        we.b bVarValueOf = we.b.valueOf(upperCase);
        String string2 = jSONObject.getString("event_type");
        kotlin.jvm.internal.m.e(string2, "mapping.getString(\"event_type\")");
        String upperCase2 = string2.toUpperCase(ENGLISH);
        kotlin.jvm.internal.m.e(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        we.a aVarValueOf = we.a.valueOf(upperCase2);
        String appVersion = jSONObject.getString("app_version");
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jsonPath = jSONArray.getJSONObject(i11);
            kotlin.jvm.internal.m.e(jsonPath, "jsonPath");
            arrayList.add(new we.f(jsonPath));
        }
        String pathType = jSONObject.optString("path_type", "absolute");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int length2 = jSONArrayOptJSONArray.length();
            for (int i12 = 0; i12 < length2; i12++) {
                JSONObject jsonParameter = jSONArrayOptJSONArray.getJSONObject(i12);
                kotlin.jvm.internal.m.e(jsonParameter, "jsonParameter");
                arrayList2.add(new we.d(jsonParameter));
            }
        }
        String componentId = jSONObject.optString("component_id");
        String activityName = jSONObject.optString("activity_name");
        kotlin.jvm.internal.m.e(eventName, "eventName");
        kotlin.jvm.internal.m.e(appVersion, "appVersion");
        kotlin.jvm.internal.m.e(componentId, "componentId");
        kotlin.jvm.internal.m.e(pathType, "pathType");
        kotlin.jvm.internal.m.e(activityName, "activityName");
        return new we.c(eventName, bVarValueOf, aVarValueOf, appVersion, arrayList, arrayList2, componentId, pathType, activityName);
    }

    public abstract Path B(float f5, float f11, float f12, float f13);

    public abstract String r(byte[] bArr, int i11, int i12);

    public abstract int t(String str, byte[] bArr, int i11, int i12);

    public static final void v(Throwable th2) {
        HashMap map;
        lf.x feature;
        if (f44008b) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            kotlin.jvm.internal.m.e(stackTrace, "e.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                kotlin.jvm.internal.m.e(className, "it.className");
                synchronized (lf.a0.f39962a) {
                    map = lf.a0.f39963b;
                    if (map.isEmpty()) {
                        map.put(lf.x.AAM, new String[]{"com.facebook.appevents.aam."});
                        map.put(lf.x.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                        map.put(lf.x.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                        map.put(lf.x.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                        map.put(lf.x.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                        map.put(lf.x.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                        map.put(lf.x.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                        map.put(lf.x.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        map.put(lf.x.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        map.put(lf.x.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                        map.put(lf.x.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                        map.put(lf.x.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
                        map.put(lf.x.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
                        map.put(lf.x.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
                        map.put(lf.x.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                        map.put(lf.x.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        map.put(lf.x.IapLogging, new String[]{"com.facebook.appevents.iap."});
                        map.put(lf.x.Monitoring, new String[]{wuoM.ydZjwkMCiLNn});
                        map.put(lf.x.GPSARATriggers, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
                        map.put(lf.x.GPSPACAProcessing, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
                        map.put(lf.x.GPSTopicsObservation, new String[]{"com.facebook.appevents.gps.topics.GpsTopicsManager"});
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        feature = lf.x.Unknown;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    feature = (lf.x) entry.getKey();
                    for (String str : (String[]) entry.getValue()) {
                        if (oz.x.s0(className, str, false)) {
                            break;
                        }
                    }
                }
                if (feature != lf.x.Unknown) {
                    kotlin.jvm.internal.m.f(feature, "feature");
                    re.s.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString("FBSDKFeature" + feature, "18.1.3").apply();
                    hashSet.add(feature.toString());
                }
            }
            re.s sVar = re.s.f49201a;
            if (!re.i0.c() || hashSet.isEmpty()) {
                return;
            }
            JSONArray jSONArray = new JSONArray((Collection) hashSet);
            nf.e eVar = new nf.e();
            eVar.f43766b = nf.c.Analysis;
            Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
            eVar.f43771g = lValueOf;
            eVar.f43767c = jSONArray;
            StringBuffer stringBuffer = new StringBuffer("analysis_log_");
            stringBuffer.append(String.valueOf(lValueOf));
            stringBuffer.append(".json");
            String string = stringBuffer.toString();
            kotlin.jvm.internal.m.e(string, "StringBuffer()\n         …)\n            .toString()");
            eVar.f43765a = string;
            eVar.b();
        }
    }
}
