package com.bumptech.glide;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.ExtractedText;
import android.widget.RemoteViews;
import bh.a1;
import com.lingodeer.data.model.LearnProgress;
import e6.x1;
import fr.o0;
import gp.r;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.z;
import o3.w;
import oz.x;
import qy.b0;
import rt.x8;
import rt.y6;
import rt.z6;
import ry.s;
import rz.e0;
import uz.x0;
import vt.k0;
import vt.n0;
import y.i0;
import y.j0;
import y.r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final double A(long j11) {
        return ((j11 >>> 11) * ((double) 2048)) + (j11 & 2047);
    }

    public static final String B(int i11, long j11) {
        if (j11 >= 0) {
            qx.p.k(i11);
            String string = Long.toString(j11, i11);
            kotlin.jvm.internal.m.e(string, "toString(...)");
            return string;
        }
        long j12 = i11;
        long j13 = ((j11 >>> 1) / j12) << 1;
        long j14 = j11 - (j13 * j12);
        if (j14 >= j12) {
            j14 -= j12;
            j13++;
        }
        qx.p.k(i11);
        String string2 = Long.toString(j13, i11);
        kotlin.jvm.internal.m.e(string2, "toString(...)");
        qx.p.k(i11);
        String string3 = Long.toString(j14, i11);
        kotlin.jvm.internal.m.e(string3, "toString(...)");
        return string2.concat(string3);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object C(Collection collection, x8 x8Var, k0 k0Var, n0 n0Var, xy.c cVar) {
        z6 z6Var;
        x8 reviewType;
        Collection selectedItemIds;
        LearnProgress learnProgressCopy$default;
        k0 k0Var2 = k0Var;
        if (cVar instanceof z6) {
            z6Var = (z6) cVar;
            int i11 = z6Var.f50774e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                z6Var.f50774e = i11 - Integer.MIN_VALUE;
            } else {
                z6Var = new z6(cVar);
            }
        } else {
            z6Var = new z6(cVar);
        }
        Object objU = z6Var.f50773d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = z6Var.f50774e;
        b0 b0Var = b0.f48488a;
        if (i12 == 0) {
            e.F(objU);
            r rVarE = ((a1) k0Var2).e(((o0) n0Var).f27733a.keyLanguage, false);
            z6Var.f50770a = collection;
            reviewType = x8Var;
            z6Var.f50771b = reviewType;
            z6Var.f50772c = k0Var2;
            z6Var.f50774e = 1;
            objU = x0.u(rVarE, z6Var);
            if (objU != aVar) {
                selectedItemIds = collection;
            }
            return aVar;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection2 = z6Var.f50770a;
            e.F(objU);
            return b0Var;
        }
        k0Var2 = z6Var.f50772c;
        reviewType = z6Var.f50771b;
        selectedItemIds = z6Var.f50770a;
        e.F(objU);
        LearnProgress learnProgress = (LearnProgress) objU;
        kotlin.jvm.internal.m.f(selectedItemIds, "selectedItemIds");
        String selectRecord = ry.m.y0(ry.m.R0(ry.m.j0(selectedItemIds)), ";", null, null, null, 62);
        kotlin.jvm.internal.m.f(learnProgress, "<this>");
        kotlin.jvm.internal.m.f(reviewType, "reviewType");
        kotlin.jvm.internal.m.f(selectRecord, "selectRecord");
        int i13 = y6.f50684a[reviewType.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (kotlin.jvm.internal.m.a(learnProgress.getReviewSelectRecordWord(), selectRecord)) {
                        learnProgressCopy$default = null;
                    } else {
                        learnProgressCopy$default = LearnProgress.copy$default(learnProgress, null, null, null, null, null, null, 0, 0L, 0L, 0, 0, null, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, null, selectRecord, null, 0, 0, false, 2080374783, null);
                    }
                } else if (kotlin.jvm.internal.m.a(learnProgress.getReviewSelectRecordSent(), selectRecord)) {
                    learnProgressCopy$default = null;
                } else {
                    learnProgressCopy$default = LearnProgress.copy$default(learnProgress, null, null, null, null, null, null, 0, 0L, 0L, 0, 0, null, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, null, null, selectRecord, 0, 0, false, 2013265919, null);
                }
            } else if (kotlin.jvm.internal.m.a(learnProgress.getReviewSelectRecordWord(), selectRecord)) {
                learnProgressCopy$default = null;
            } else {
                learnProgressCopy$default = LearnProgress.copy$default(learnProgress, null, null, null, null, null, null, 0, 0L, 0L, 0, 0, null, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, null, selectRecord, null, 0, 0, false, 2080374783, null);
            }
        } else if (kotlin.jvm.internal.m.a(learnProgress.getReviewSelectRecordChar(), selectRecord)) {
            learnProgressCopy$default = null;
        } else {
            learnProgressCopy$default = LearnProgress.copy$default(learnProgress, null, null, null, null, null, null, 0, 0L, 0L, 0, 0, null, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, selectRecord, null, null, 0, 0, false, 2113929215, null);
        }
        if (learnProgressCopy$default != null) {
            z6Var.f50770a = null;
            z6Var.f50771b = null;
            z6Var.f50772c = null;
            z6Var.f50774e = 2;
            if (((a1) k0Var2).i(learnProgressCopy$default, false, z6Var) == aVar) {
                return aVar;
            }
        }
        return b0Var;
    }

    public static v3.d a() {
        return new v3.d(1.0f, 1.0f);
    }

    public static final long b(float f5, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final void c(f00.d dVar) {
        kotlin.jvm.internal.m.f(dVar, "<this>");
        if ((dVar instanceof h00.q ? (h00.q) dVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + z.a(dVar.getClass()));
    }

    public static final void d(i0 i0Var, Object obj, Object obj2) {
        int iF = i0Var.f(obj);
        boolean z11 = iF < 0;
        Object obj3 = z11 ? null : i0Var.f56715c[iF];
        if (obj3 != null) {
            if (obj3 instanceof j0) {
                ((j0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                j0 j0Var = new j0();
                j0Var.a(obj3);
                j0Var.a(obj2);
                obj2 = j0Var;
            }
            obj2 = obj3;
        }
        if (!z11) {
            i0Var.f56715c[iF] = obj2;
            return;
        }
        int i11 = ~iF;
        i0Var.f56714b[i11] = obj;
        i0Var.f56715c[i11] = obj2;
    }

    public static final h00.k g(f00.c cVar) {
        kotlin.jvm.internal.m.f(cVar, "<this>");
        h00.k kVar = cVar instanceof h00.k ? (h00.k) cVar : null;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + z.a(cVar.getClass()));
    }

    public static final String h(long j11, String str, String noteTypeCode) {
        kotlin.jvm.internal.m.f(noteTypeCode, "noteTypeCode");
        return str + "_note_" + noteTypeCode + "_" + j11;
    }

    public static final int i(ja.c cVar, String str) {
        kotlin.jvm.internal.m.f(cVar, "<this>");
        int iJ = j(cVar, str);
        if (iJ >= 0) {
            return iJ;
        }
        int iJ2 = j(cVar, "`" + str + '`');
        if (iJ2 >= 0) {
            return iJ2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        int columnCount = cVar.getColumnCount();
        String strConcat = ".".concat(str);
        String strQ = nv.p.q(".", str, '`');
        for (int i11 = 0; i11 < columnCount; i11++) {
            String columnName = cVar.getColumnName(i11);
            if (columnName.length() >= str.length() + 2 && (x.k0(columnName, strConcat, false) || (columnName.charAt(0) == '`' && x.k0(columnName, strQ, false)))) {
                return i11;
            }
        }
        return -1;
    }

    public static final int j(ja.c cVar, String name) {
        kotlin.jvm.internal.m.f(cVar, "<this>");
        kotlin.jvm.internal.m.f(name, "name");
        int columnCount = cVar.getColumnCount();
        for (int i11 = 0; i11 < columnCount; i11++) {
            if (name.equals(cVar.getColumnName(i11))) {
                return i11;
            }
        }
        return -1;
    }

    public static i0 k() {
        long[] jArr = r0.f56756a;
        return new i0();
    }

    public static final long l(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final int m(ja.c stmt, String str) {
        kotlin.jvm.internal.m.f(stmt, "stmt");
        int i11 = i(stmt, str);
        if (i11 >= 0) {
            return i11;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i12 = 0; i12 < columnCount; i12++) {
            arrayList.add(stmt.getColumnName(i12));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + ry.m.y0(arrayList, null, null, null, null, 63) + ']');
    }

    public static a4.l n(a4.j jVar) {
        a4.i iVar = new a4.i();
        iVar.f349c = new a4.n();
        a4.l lVar = new a4.l(iVar);
        iVar.f348b = lVar;
        iVar.f347a = jVar.getClass();
        try {
            Object objC = jVar.c(iVar);
            if (objC == null) {
                return lVar;
            }
            iVar.f347a = objC;
            return lVar;
        } catch (Exception e8) {
            lVar.f352b.l(e8);
            return lVar;
        }
    }

    public static ArrayList o(int i11, String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(";")) {
            String[] strArrSplit = str2.trim().split("_");
            Integer.valueOf(strArrSplit[2]);
            boolean z11 = true;
            if (i11 == -2) {
                try {
                    String str3 = strArrSplit[0];
                    String str4 = strArrSplit[1];
                    int iIntValue = Integer.valueOf(strArrSplit[2]).intValue();
                    if (Integer.valueOf(strArrSplit[2]).intValue() <= 1) {
                        z11 = false;
                    }
                    arrayList.add(new xi.b(iIntValue, str3, str4, z11));
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            } else {
                String str5 = strArrSplit[0];
                String str6 = strArrSplit[1];
                int iIntValue2 = Integer.valueOf(strArrSplit[2]).intValue();
                if (i11 != 8) {
                    z11 = false;
                }
                arrayList.add(new xi.b(iIntValue2, str5, str6, z11));
            }
        }
        return arrayList;
    }

    public static final boolean p(Context context) {
        int iC = vc.c.c(context, null, Integer.valueOf(R.attr.textColorPrimary), null, 10);
        if (iC == 0) {
            return false;
        }
        return ((double) 1) - (((((double) Color.blue(iC)) * 0.114d) + ((((double) Color.green(iC)) * 0.587d) + (((double) Color.red(iC)) * 0.299d))) / ((double) 255)) >= 0.5d;
    }

    public static final int q(RemoteViews remoteViews, x1 x1Var, int i11, int i12, Integer num) {
        if (i11 == -1) {
            throw new IllegalArgumentException("viewStubId must not be View.NO_ID");
        }
        int iIntValue = num != null ? num.intValue() : x1Var.f25084g.incrementAndGet();
        if (iIntValue != -1) {
            remoteViews.setInt(i11, "setInflatedId", iIntValue);
        }
        if (i12 != 0) {
            remoteViews.setInt(i11, "setLayoutResource", i12);
        }
        remoteViews.setViewVisibility(i11, 0);
        return iIntValue;
    }

    public static final void r(String key) {
        kotlin.jvm.internal.m.f(key, "key");
        throw new IllegalArgumentException(ep.a.g("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static boolean s(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.lingodeer"));
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
            String str = resolveInfo.activityInfo.applicationInfo.packageName;
            if (str.equals("com.android.vending") || str.equals("com.google.market")) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
                context.startActivity(intent);
                return true;
            }
        }
        return false;
    }

    public static q5.b t(String name, n9.q qVar, com.google.firebase.datastorage.a aVar, int i11) {
        if ((i11 & 2) != 0) {
            qVar = null;
        }
        fz.c cVar = aVar;
        if ((i11 & 4) != 0) {
            cVar = q5.a.f47461a;
        }
        yz.f fVar = rz.o0.f50940a;
        wz.d dVarC = e0.c(yz.e.f58387a.plus(e0.e()));
        kotlin.jvm.internal.m.f(name, "name");
        return new q5.b(name, qVar, cVar, dVarC);
    }

    public static final boolean v(i0 i0Var, Object obj, Object obj2) {
        Object objG = i0Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof j0)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            i0Var.k(obj);
            return true;
        }
        j0 j0Var = (j0) objG;
        boolean zL = j0Var.l(obj2);
        if (zL && j0Var.g()) {
            i0Var.k(obj);
        }
        return zL;
    }

    public static final void w(i0 i0Var, Object obj) {
        boolean zG;
        long[] jArr = i0Var.f56713a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        Object obj2 = i0Var.f56714b[i14];
                        Object obj3 = i0Var.f56715c[i14];
                        if (obj3 instanceof j0) {
                            j0 j0Var = (j0) obj3;
                            j0Var.l(obj);
                            zG = j0Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            i0Var.l(i14);
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public static final ExtractedText x(w wVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wVar.f44704a.f35700b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j11 = wVar.f44705b;
        extractedText.selectionStart = j3.x0.f(j11);
        extractedText.selectionEnd = j3.x0.e(j11);
        extractedText.flags = !oz.q.w0(wVar.f44704a.f35700b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final List y(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(arrayList)) : Collections.singletonList(ry.m.q0(arrayList));
        }
        return ry.r.f50854a;
    }

    public static final Map z(Map map) {
        int size = map.size();
        if (size == 0) {
            return s.f50855a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) ry.m.p0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public abstract g e(Serializable serializable);

    public void f(Context context, h hVar) {
    }

    public void u(Context context, c cVar, l lVar) {
    }
}
