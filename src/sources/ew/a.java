package ew;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import b0.h;
import b7.v;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.common.math.IntMath;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.a2;
import g2.p;
import gu.g;
import h1.k7;
import h1.s1;
import h1.v1;
import i0.pKy.shrCcjmOhAmRC;
import j0.e2;
import j3.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;
import l1.b3;
import l1.s;
import l1.x1;
import mh.i;
import ns.o;
import o3.w;
import qy.l;
import rt.k6;
import ry.n;
import ry.r;
import ry.t;
import se.k;
import vy.j;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final void A(int i11, int i12, Object[] objArr) {
        m.f(objArr, "<this>");
        while (i11 < i12) {
            objArr[i11] = null;
            i11++;
        }
    }

    public static final long B(long j11) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j11 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j11 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final List C(ArrayList arrayList, int i11, jz.e eVar) {
        if (i11 <= 0 || arrayList.isEmpty()) {
            return r.f50854a;
        }
        List listS0 = ry.m.S0(arrayList, new a2(new a2(new g(28), 15), 16));
        ArrayList arrayList2 = new ArrayList(n.W(listS0, 10));
        int i12 = 0;
        for (Object obj : listS0) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                o.V();
                throw null;
            }
            k6 k6Var = (k6) obj;
            double size = listS0.size() - i12;
            double dB = eVar.b();
            if (dB < Double.MIN_VALUE) {
                dB = Double.MIN_VALUE;
            }
            arrayList2.add(new l(k6Var, Double.valueOf((-Math.log(dB)) / size)));
            i12 = i13;
        }
        List listU0 = ry.m.U0(ry.m.S0(arrayList2, new g(29)), i11);
        ArrayList arrayList3 = new ArrayList(n.W(listU0, 10));
        Iterator it = listU0.iterator();
        while (it.hasNext()) {
            arrayList3.add((k6) ((l) it.next()).f48495a);
        }
        return arrayList3;
    }

    public static final void D(LinkedHashSet linkedHashSet, ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k6 k6Var = (k6) it.next();
            if (linkedHashSet.add(k6Var.f49972c.getId())) {
                arrayList.add(k6Var);
            }
        }
    }

    public static List E(List candidates, int i11, LinkedHashSet linkedHashSet, int i12) {
        int i13;
        Set set = linkedHashSet;
        if ((i12 & 4) != 0) {
            set = t.f50856a;
        }
        jz.d dVar = jz.e.f37397a;
        m.f(candidates, "candidates");
        if (i11 <= 0 || candidates.isEmpty()) {
            return r.f50854a;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : candidates) {
            if (hashSet.add(((k6) obj).f49972c.getId())) {
                arrayList.add(obj);
            }
        }
        int iMin = Math.min(i11, arrayList.size());
        if (iMin == arrayList.size()) {
            return o.T(arrayList, dVar);
        }
        ArrayList arrayList2 = new ArrayList();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        int i14 = (iMin * 20) / 100;
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i15 = 0;
        int i16 = 0;
        while (i16 < size) {
            Object obj2 = arrayList.get(i16);
            i16++;
            if (((k6) obj2).f49972c.getLastStudyStatus() == wt.o.WRONG) {
                arrayList3.add(obj2);
            }
        }
        D(linkedHashSet2, arrayList2, C(arrayList3, Math.min(i14, arrayList3.size()), dVar));
        if (!set.isEmpty()) {
            int iCeil = (int) Math.ceil(((double) (iMin * 25)) / 100.0d);
            if (arrayList2.isEmpty()) {
                i13 = 0;
            } else {
                int size2 = arrayList2.size();
                i13 = 0;
                int i17 = 0;
                while (i17 < size2) {
                    Object obj3 = arrayList2.get(i17);
                    i17++;
                    if (!set.contains(((k6) obj3).f49972c.getId()) && (i13 = i13 + 1) < 0) {
                        o.U();
                        throw null;
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int size3 = arrayList.size();
            int i18 = 0;
            while (i18 < size3) {
                Object obj4 = arrayList.get(i18);
                i18++;
                k6 k6Var = (k6) obj4;
                if (!set.contains(k6Var.f49972c.getId()) && !linkedHashSet2.contains(k6Var.f49972c.getId())) {
                    arrayList4.add(obj4);
                }
            }
            int i19 = iCeil - i13;
            if (i19 < 0) {
                i19 = 0;
            }
            D(linkedHashSet2, arrayList2, C(arrayList4, Math.min(i19, arrayList4.size()), dVar));
        }
        int iMin2 = Math.min((iMin * 10) / 100, iMin - arrayList2.size());
        ArrayList arrayList5 = new ArrayList();
        int size4 = arrayList.size();
        int i21 = 0;
        while (i21 < size4) {
            Object obj5 = arrayList.get(i21);
            i21++;
            if (!linkedHashSet2.contains(((k6) obj5).f49972c.getId())) {
                arrayList5.add(obj5);
            }
        }
        D(linkedHashSet2, arrayList2, ry.m.U0(o.T(arrayList5, dVar), iMin2));
        ArrayList arrayList6 = new ArrayList();
        int size5 = arrayList.size();
        while (i15 < size5) {
            Object obj6 = arrayList.get(i15);
            i15++;
            if (!linkedHashSet2.contains(((k6) obj6).f49972c.getId())) {
                arrayList6.add(obj6);
            }
        }
        D(linkedHashSet2, arrayList2, C(arrayList6, iMin - arrayList2.size(), dVar));
        return o.T(arrayList2, dVar);
    }

    public static void F(v vVar) {
        vVar.t(3);
        vVar.t(8);
        boolean zH = vVar.h();
        boolean zH2 = vVar.h();
        if (zH) {
            vVar.t(5);
        }
        if (zH2) {
            vVar.t(6);
        }
    }

    public static void G(v vVar) {
        int i11;
        int i12 = vVar.i(2);
        if (i12 == 0) {
            vVar.t(6);
            return;
        }
        int iZ = z(vVar, 5, 8, 16) + 1;
        if (i12 == 1) {
            vVar.t(iZ * 7);
            return;
        }
        if (i12 == 2) {
            boolean zH = vVar.h();
            int i13 = zH ? 1 : 5;
            int i14 = zH ? 7 : 5;
            int i15 = zH ? 8 : 6;
            int i16 = 0;
            while (i16 < iZ) {
                if (vVar.h()) {
                    vVar.t(7);
                    i11 = 0;
                } else {
                    if (vVar.i(2) == 3 && vVar.i(i14) * i13 != 0) {
                        vVar.s();
                    }
                    i11 = vVar.i(i15) * i13;
                    if (i11 != 0 && i11 != 180) {
                        vVar.s();
                    }
                    vVar.s();
                }
                if (i11 != 0 && i11 != 180 && vVar.h()) {
                    i16++;
                }
                i16++;
            }
        }
    }

    public static void H(Activity activity) {
        View viewS;
        int iHashCode = activity.hashCode();
        HashMap map = jf.e.f36325d;
        HashMap map2 = null;
        if (!qf.a.b(jf.e.class)) {
            try {
                map2 = jf.e.f36325d;
            } catch (Throwable th2) {
                qf.a.a(jf.e.class, th2);
            }
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object eVar = map2.get(numValueOf);
        if (eVar == null) {
            eVar = new jf.e(activity);
            map2.put(numValueOf, eVar);
        }
        jf.e eVar2 = (jf.e) eVar;
        if (qf.a.b(jf.e.class)) {
            return;
        }
        try {
            if (qf.a.b(eVar2)) {
                return;
            }
            try {
                if (!eVar2.f36328c.getAndSet(true) && (viewS = ef.e.s((Activity) eVar2.f36326a.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewS.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(eVar2);
                        eVar2.a();
                        return;
                    }
                    return;
                    qf.a.a(jf.e.class, th);
                }
            } catch (Throwable th3) {
                qf.a.a(eVar2, th3);
            }
        } catch (Throwable th4) {
            qf.a.a(jf.e.class, th4);
        }
    }

    public static void I(Activity activity) {
        View viewS;
        int iHashCode = activity.hashCode();
        HashMap map = jf.e.f36325d;
        HashMap map2 = null;
        if (!qf.a.b(jf.e.class)) {
            try {
                map2 = jf.e.f36325d;
            } catch (Throwable th2) {
                qf.a.a(jf.e.class, th2);
            }
        }
        jf.e eVar = (jf.e) map2.remove(Integer.valueOf(iHashCode));
        if (eVar == null || qf.a.b(jf.e.class)) {
            return;
        }
        try {
            if (qf.a.b(eVar)) {
                return;
            }
            try {
                if (eVar.f36328c.getAndSet(false) && (viewS = ef.e.s((Activity) eVar.f36326a.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewS.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(eVar);
                        return;
                    }
                    return;
                    qf.a.a(jf.e.class, th);
                }
            } catch (Throwable th3) {
                qf.a.a(eVar, th3);
            }
        } catch (Throwable th4) {
            qf.a.a(jf.e.class, th4);
        }
    }

    public static final ArrayList J(List list) {
        m.f(list, "<this>");
        return list instanceof ArrayList ? (ArrayList) list : new ArrayList(list);
    }

    public static final void a(int i11, long j11, fz.a aVar, l1.n nVar, z1.r rVar, boolean z11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(-1007392628);
        int i13 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.e(j11) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            b3 b3VarB = h.b(z11 ? 1.1f : 1.0f, b0.e.r(200, 0, null, 6), "bookmark_scale", sVar, 3120, 20);
            if (z11) {
                sVar.d0(-1736660870);
                i12 = R.drawable.ic_pd_word_tag_fav;
            } else {
                sVar.d0(-1736659181);
                i12 = R.drawable.ic_pd_word_tag_un_fav;
            }
            k2.b bVarY = k.y(i12, sVar, 0);
            sVar.p(false);
            String str = z11 ? "取消收藏" : "添加收藏";
            float fFloatValue = ((Number) b3VarB.getValue()).floatValue();
            z1.r rVarI = d2.h.i(rVar, fFloatValue, fFloatValue);
            boolean z12 = (i13 & 896) == 256;
            Object objQ = sVar.Q();
            if (z12 || objQ == l1.m.f39353a) {
                objQ = new jr.m(16, aVar);
                sVar.o0(objQ);
            }
            d0.n.c(bVarY, str, iu.k.q(0, 7, (fz.a) objQ, sVar, rVarI, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, z11 ? null : new p(j11, 5), sVar, 8, 56);
            sVar = sVar;
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new kt.c(z11, j11, aVar, rVar, i11);
        }
    }

    public static final q6.c b(float f5, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return new q6.c(new float[]{f5, f11, f12, f13, f14, f15, f16, f17});
    }

    public static final long c(int i11, int i12) {
        return (((long) i12) & 4294967295L) | (((long) i11) << 32);
    }

    public static final void e(i iVar, fz.a aVar, fz.a aVar2, z1.r rVar, l1.n nVar, int i11) {
        int i12;
        fz.a aVar3;
        s sVar = (s) nVar;
        sVar.f0(1181982189);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(iVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            aVar3 = aVar;
            i12 |= sVar.h(aVar3) ? 32 : 16;
        } else {
            aVar3 = aVar;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(aVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(rVar) ? 2048 : 1024;
        }
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            k7.c(aVar3, e2.e(rVar, 1.0f), false, null, k7.p(((s1) sVar.j(v1.f31180a)).f31033p, sVar, 0), null, null, t1.e.d(102512098, new at.p(19, iVar, aVar2), sVar), sVar, ((i12 >> 3) & 14) | 100663296, 236);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new lh.a(iVar, aVar, aVar2, rVar, i11, 1);
        }
    }

    public static final void f(i iVar, fz.a aVar, fz.a aVar2, z1.r rVar, l1.n nVar, int i11) {
        int i12;
        fz.a aVar3;
        s sVar = (s) nVar;
        sVar.f0(1081102811);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(iVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            aVar3 = aVar;
            i12 |= sVar.h(aVar3) ? 32 : 16;
        } else {
            aVar3 = aVar;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(rVar) ? 2048 : 1024;
        }
        if (sVar.T(i12 & 1, (i12 & 1043) != 1042)) {
            k7.c(aVar3, e2.e(rVar, 1.0f), false, null, k7.p(((s1) sVar.j(v1.f31180a)).f31033p, sVar, 0), null, null, t1.e.d(-1177001200, new a00.b(iVar, 22), sVar), sVar, ((i12 >> 3) & 14) | 100663296, 236);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new lh.a(iVar, aVar, aVar2, rVar, i11, 0);
        }
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, Object obj, int i11, int i12) {
        for (Object obj2 : spannableStringBuilder.getSpans(i11, i12, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i11 && spannableStringBuilder.getSpanEnd(obj2) == i12 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i11, i12, 33);
    }

    public static final void i(int i11, StringBuilder sb2) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("?");
            if (i12 < i11 - 1) {
                sb2.append(",");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (com.bumptech.glide.d.j(r9, r1, kotlin.jvm.internal.m.a(r7, r2) ? r0.getWidth() : kc.h.d(r7.f32181a, r8), kotlin.jvm.internal.m.a(r7, r2) ? r0.getHeight() : kc.h.d(r7.f32182b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap j(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, hc.g r7, hc.f r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ew.a.j(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, hc.g, hc.f, boolean):android.graphics.Bitmap");
    }

    public static Object k(vy.g gVar, Object obj, fz.e operation) {
        m.f(operation, "operation");
        return operation.invoke(obj, gVar);
    }

    public static final String l() {
        byte[] bArr = new byte[16];
        qz.a.f48516a.nextBytes(bArr);
        byte b3 = (byte) (bArr[6] & 15);
        bArr[6] = b3;
        bArr[6] = (byte) (b3 | 64);
        byte b11 = (byte) (bArr[8] & 63);
        bArr[8] = b11;
        bArr[8] = (byte) (b11 | 128);
        long jR = ef.e.r(bArr, 0);
        long jR2 = ef.e.r(bArr, 8);
        return ((jR == 0 && jR2 == 0) ? qz.b.f48517c : new qz.b(jR, jR2)).toString();
    }

    public static vy.g m(vy.g gVar, vy.h key) {
        m.f(key, "key");
        if (m.a(gVar.getKey(), key)) {
            return gVar;
        }
        return null;
    }

    public static final int n(n3.s sVar, int i11) {
        boolean z11 = sVar.compareTo(n3.s.f43175d) >= 0;
        boolean z12 = i11 == 1;
        if (z12 && z11) {
            return 3;
        }
        if (z11) {
            return 1;
        }
        return z12 ? 2 : 0;
    }

    public static final j3.h o(w wVar) {
        j3.h hVar = wVar.f44704a;
        long j11 = wVar.f44705b;
        hVar.getClass();
        return hVar.subSequence(x0.f(j11), x0.e(j11));
    }

    public static final j3.h p(w wVar, int i11) {
        j3.h hVar = wVar.f44704a;
        j3.h hVar2 = wVar.f44704a;
        long j11 = wVar.f44705b;
        int iE = x0.e(j11);
        int iE2 = x0.e(j11);
        int length = iE2 + i11;
        if (((i11 ^ length) & (iE2 ^ length)) < 0) {
            length = hVar2.f35700b.length();
        }
        return hVar.subSequence(iE, Math.min(length, hVar2.f35700b.length()));
    }

    public static final j3.h q(w wVar, int i11) {
        j3.h hVar = wVar.f44704a;
        long j11 = wVar.f44705b;
        int iF = x0.f(j11);
        int i12 = iF - i11;
        if (((iF ^ i12) & (i11 ^ iF)) < 0) {
            i12 = 0;
        }
        return hVar.subSequence(Math.max(0, i12), x0.f(j11));
    }

    public static void r(String str, Object... objArr) {
        o00.a.P(a.class, str.concat(", but the download service isn't connected yet.\nYou can use FileDownloader#isServiceConnected() to check whether the service has been connected, \nbesides you can use following functions easier to control your code invoke after the service has been connected: \n1. FileDownloader#bindService(Runnable)\n2. FileDownloader#insureServiceBind()\n3. FileDownloader#insureServiceBindAsync()"), objArr);
    }

    public static vy.i s(vy.g gVar, vy.h key) {
        m.f(key, "key");
        return m.a(gVar.getKey(), key) ? j.f54321a : gVar;
    }

    public static void t(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static ArrayList u(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            if (!str2.equals(BuildConfig.VERSION_NAME)) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str2.trim())));
            }
        }
        return arrayList;
    }

    public static Long[] v(String str) {
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return new Long[0];
        }
        for (String str2 : str.split(";")) {
            if (!str2.equals(BuildConfig.VERSION_NAME)) {
                arrayList.add(Long.valueOf(Long.parseLong(str2.trim())));
            }
        }
        return (Long[]) arrayList.toArray(new Long[0]);
    }

    public static vy.i w(vy.g gVar, vy.i context) {
        m.f(context, "context");
        return context == j.f54321a ? gVar : (vy.i) context.fold(gVar, new rz.w(22));
    }

    public static final long x(long j11, long j12) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 >> 32)) + ((int) (j12 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) + ((int) (j12 & 4294967295L)))) & 4294967295L);
    }

    public static int z(v vVar, int i11, int i12, int i13) {
        b7.a.d(Math.max(Math.max(i11, i12), i13) <= 31);
        int i14 = (1 << i11) - 1;
        int i15 = (1 << i12) - 1;
        IntMath.a(IntMath.a(i14, i15), 1 << i13);
        if (vVar.b() < i11) {
            return -1;
        }
        int i16 = vVar.i(i11);
        if (i16 == i14) {
            if (vVar.b() < i12) {
                return -1;
            }
            int i17 = vVar.i(i12);
            i16 += i17;
            if (i17 == i15) {
                if (vVar.b() < i13) {
                    return -1;
                }
                return vVar.i(i13) + i16;
            }
        }
        return i16;
    }

    public abstract void y(String str);

    public static final void d(i lesson, fz.a onClick, fz.a aVar, z1.r rVar, boolean z11, l1.n nVar, int i11, int i12) {
        boolean z12;
        m.f(lesson, "lesson");
        m.f(onClick, "onClick");
        m.f(aVar, anrPHlQ.gtBzEVvcUqRgQHJ);
        s sVar = (s) nVar;
        sVar.f0(-606229875);
        int i13 = (sVar.f(lesson) ? 4 : 2) | i11 | (sVar.h(onClick) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        int i14 = i12 & 16;
        if (i14 != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= sVar.g(z11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            boolean z13 = i14 != 0 ? false : z11;
            if (z13) {
                sVar.d0(143539289);
                e(lesson, onClick, aVar, rVar, sVar, i13 & 8190);
                sVar.p(false);
            } else {
                sVar.d0(143731675);
                f(lesson, onClick, aVar, rVar, sVar, i13 & 8190);
                sVar.p(false);
            }
            z12 = z13;
        } else {
            sVar.W();
            z12 = z11;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new lh.b(lesson, onClick, aVar, rVar, z12, i11, i12);
        }
    }

    public static final String g(Object[] objArr, int i11, int i12, ry.g gVar) {
        StringBuilder sb2 = new StringBuilder((i12 * 3) + 2);
        sb2.append("[");
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i11 + i13];
            if (obj == gVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append(shrCcjmOhAmRC.BjAFC);
        String string = sb2.toString();
        m.e(string, "toString(...)");
        return string;
    }
}
