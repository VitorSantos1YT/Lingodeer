package gb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.work.impl.WorkDatabase;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.logging.type.LogSeverity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.SRSStatusScheduleKt;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fb.c0;
import fb.e0;
import hh.p0;
import j$.time.LocalDate;
import j$.time.ZoneId;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import kotlin.NoWhenBranchMatchedException;
import l1.b1;
import l1.f2;
import l1.g2;
import l1.l2;
import l1.p2;
import l1.x1;
import lf.i0;
import rt.x8;
import rz.d0;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public r() {
        new ConcurrentHashMap();
    }

    public static final fb.a A(int i11) {
        if (i11 == 0) {
            return fb.a.EXPONENTIAL;
        }
        if (i11 == 1) {
            return fb.a.LINEAR;
        }
        throw new IllegalArgumentException(p0.h(i11, "Could not convert ", " to BackoffPolicy"));
    }

    public static final fb.w B(int i11) {
        if (i11 == 0) {
            return fb.w.NOT_REQUIRED;
        }
        if (i11 == 1) {
            return fb.w.CONNECTED;
        }
        if (i11 == 2) {
            return fb.w.UNMETERED;
        }
        if (i11 == 3) {
            return fb.w.NOT_ROAMING;
        }
        if (i11 == 4) {
            return fb.w.METERED;
        }
        if (Build.VERSION.SDK_INT < 30 || i11 != 5) {
            throw new IllegalArgumentException(p0.h(i11, "Could not convert ", " to NetworkType"));
        }
        return fb.w.TEMPORARILY_UNMETERED;
    }

    public static final c0 C(int i11) {
        if (i11 == 0) {
            return c0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i11 == 1) {
            return c0.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(p0.h(i11, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final e0 D(int i11) {
        if (i11 == 0) {
            return e0.ENQUEUED;
        }
        if (i11 == 1) {
            return e0.RUNNING;
        }
        if (i11 == 2) {
            return e0.SUCCEEDED;
        }
        if (i11 == 3) {
            return e0.FAILED;
        }
        if (i11 == 4) {
            return e0.BLOCKED;
        }
        if (i11 == 5) {
            return e0.CANCELLED;
        }
        throw new IllegalArgumentException(p0.h(i11, "Could not convert ", " to State"));
    }

    public static boolean E(char c11) {
        for (int i11 = 0; i11 < 41; i11++) {
            if (cq.a.f22424d[i11][0] == c11) {
                return true;
            }
        }
        for (int i12 = 0; i12 < 120; i12++) {
            if (cq.a.f22423c[i12] == c11) {
                return true;
            }
        }
        return false;
    }

    public static boolean F(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (!E(str.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public static a4.l G(vy.i context, fz.e eVar) {
        d0 start = d0.DEFAULT;
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(start, "start");
        return com.bumptech.glide.g.n(new com.google.firebase.crashlytics.internal.concurrency.a(context, start, eVar));
    }

    public static final wc.b0 H(Context context, ad.s sVar, String str, boolean z11) {
        if (sVar instanceof ad.r) {
            if (!kotlin.jvm.internal.m.a(str, "__LottieInternalDefaultCacheKey__")) {
                return wc.l.f(((ad.r) sVar).f630a, context, str);
            }
            int i11 = ((ad.r) sVar).f630a;
            return wc.l.f(i11, context, wc.l.l(context, i11));
        }
        if (!(sVar instanceof ad.q)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z11) {
            return null;
        }
        String str2 = ((ad.q) sVar).f629a;
        FileInputStream fileInputStream = new FileInputStream(str2);
        if (kotlin.jvm.internal.m.a(str, "__LottieInternalDefaultCacheKey__")) {
            str = str2;
        }
        if (oz.x.k0(str2, "zip", false)) {
            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
            return wc.l.a(str, new com.google.common.cache.a(12, zipInputStream, str), new i0(zipInputStream, 23));
        }
        if (!oz.x.k0(str2, "tgs", false)) {
            return wc.l.a(str, new com.google.common.cache.a(11, fileInputStream, str), new i0(fileInputStream, 22));
        }
        GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
        return wc.l.a(str, new com.google.common.cache.a(11, gZIPInputStream, str), new i0(gZIPInputStream, 22));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x009c A[RETURN] */
    public static final String I(String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        switch (str) {
            case "de":
                return "deoc";
            case "es":
                return "esoc";
            case "fr":
                return "froc";
            case "it":
                return "itoc";
            case "pt":
                return "ptoc";
            case "ru":
                return "ruoc";
            case "deup":
                return "deocup";
            case "esup":
                return "esocup";
            case "frup":
                return "frocup";
            case "itup":
                return "itocup";
            case "ptup":
                return "ptocup";
            case "ruup":
                return "ruocup";
            default:
                return str;
        }
    }

    public static final long J(long j11, long j12) {
        return y.h.a(y(j11) - y(j12), z(j11) - z(j12));
    }

    public static final long K(long j11, long j12) {
        return y.h.a(y(j12) + y(j11), z(j12) + z(j11));
    }

    public static final ad.p L(ad.s sVar, l1.n nVar) {
        l1.s sVar2 = (l1.s) nVar;
        sVar2.e0(-1248473602);
        ad.a0 a0Var = new ad.a0(3, 0, null);
        Context context = (Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b);
        sVar2.e0(1388713953);
        boolean zF = sVar2.f(sVar);
        Object objQ = sVar2.Q();
        l1.g gVar = l1.m.f39353a;
        if (zF || objQ == gVar) {
            objQ = l1.t.B(new ad.p());
            sVar2.o0(objQ);
        }
        b1 b1Var = (b1) objQ;
        sVar2.p(false);
        sVar2.e0(1388714244);
        boolean zF2 = sVar2.f(sVar) | sVar2.f("__LottieInternalDefaultCacheKey__");
        Object objQ2 = sVar2.Q();
        if (zF2 || objQ2 == gVar) {
            objQ2 = H(context, sVar, "__LottieInternalDefaultCacheKey__", true);
            sVar2.o0(objQ2);
        }
        sVar2.p(false);
        l1.t.g(sVar, "__LottieInternalDefaultCacheKey__", new ad.b0(a0Var, context, sVar, b1Var, null), sVar2);
        ad.p pVar = (ad.p) b1Var.getValue();
        sVar2.p(false);
        return pVar;
    }

    public static void M(a7.a aVar) {
        aVar.f398k = -3.4028235E38f;
        aVar.f397j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.f388a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f388a = SpannableString.valueOf(charSequence);
                aVar.f389b = null;
            }
            CharSequence charSequence2 = aVar.f388a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static String N(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArrSplit = str.split("\n");
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            String str2 = strArrSplit[i11];
            String[] strArrSplit2 = str2 != null ? str2.split("\\s") : new String[0];
            StringBuffer stringBuffer2 = new StringBuffer(BuildConfig.VERSION_NAME);
            for (int i12 = 0; i12 < strArrSplit2.length; i12++) {
                String str3 = strArrSplit2[i12];
                int i13 = 0;
                while (true) {
                    if (i13 >= str3.length()) {
                        stringBuffer2.append(strArrSplit2[i12]);
                        break;
                    }
                    if (E(str3.charAt(i13))) {
                        if (!F(strArrSplit2[i12])) {
                            String str4 = strArrSplit2[i12];
                            ArrayList arrayList = new ArrayList();
                            String string = BuildConfig.VERSION_NAME;
                            for (int i14 = 0; i14 < str4.length(); i14++) {
                                if (E(str4.charAt(i14))) {
                                    if (string.equals(BuildConfig.VERSION_NAME) || F(string)) {
                                        StringBuilder sbN = ep.a.n(string);
                                        sbN.append(str4.charAt(i14));
                                        string = sbN.toString();
                                    } else {
                                        arrayList.add(string);
                                        string = BuildConfig.VERSION_NAME + str4.charAt(i14);
                                    }
                                } else if (string.equals(BuildConfig.VERSION_NAME) || !F(string)) {
                                    StringBuilder sbN2 = ep.a.n(string);
                                    sbN2.append(str4.charAt(i14));
                                    string = sbN2.toString();
                                } else {
                                    arrayList.add(string);
                                    string = BuildConfig.VERSION_NAME + str4.charAt(i14);
                                }
                            }
                            if (!string.equals(BuildConfig.VERSION_NAME)) {
                                arrayList.add(string);
                            }
                            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                            for (String str5 : strArr) {
                                stringBuffer2.append(new cq.a(str5).f22425a);
                            }
                            break;
                        }
                        stringBuffer2.append(new cq.a(strArrSplit2[i12]).f22425a);
                        break;
                    }
                    i13++;
                }
                if (i12 < strArrSplit2.length - 1) {
                    stringBuffer2.append(" ");
                }
            }
            stringBuffer.append(stringBuffer2.toString());
            if (i11 < strArrSplit.length - 1) {
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    public static final eh.b O(List statuses, rs.a aVar, rs.a aVar2, boolean z11, LocalDate localDate, ZoneId zoneId) {
        Iterator it;
        x8 x8Var;
        kotlin.jvm.internal.m.f(statuses, "statuses");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = statuses.iterator();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (it2.hasNext()) {
            SRSStatus sRSStatus = (SRSStatus) it2.next();
            if (sRSStatus.isExcludedFromReview()) {
                it = it2;
            } else {
                int elemType = sRSStatus.getElemType();
                x8 x8Var2 = x8.CHARACTER;
                if (elemType == x8Var2.a()) {
                    x8Var = x8Var2;
                } else {
                    x8Var = x8.WORD;
                    if (elemType != x8Var.a()) {
                        x8Var = x8.SENTENCE;
                        if (elemType == x8Var.a()) {
                        }
                        it = it2;
                    }
                }
                if (rs.c.a(aVar, sRSStatus)) {
                    int i19 = eh.g.f25566a[x8Var.ordinal()];
                    if (i19 == 1) {
                        i11++;
                    } else if (i19 == 2) {
                        i12++;
                    } else if (i19 == 3) {
                        i13++;
                    }
                    Object linkedHashSet = linkedHashMap.get(x8Var);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap.put(x8Var, linkedHashSet);
                    }
                    ((Set) linkedHashSet).add(Long.valueOf(sRSStatus.getElemId()));
                }
                if (rs.c.a(aVar2, sRSStatus)) {
                    int i21 = eh.g.f25566a[x8Var.ordinal()];
                    it = it2;
                    if (i21 == 1) {
                        i16++;
                    } else if (i21 == 2) {
                        i17++;
                    } else if (i21 == 3) {
                        i18++;
                    }
                    if ((x8Var != x8Var2 || z11) && SRSStatusScheduleKt.isDueOn(sRSStatus, localDate, zoneId)) {
                        if (SRSStatusScheduleKt.isNewCard(sRSStatus)) {
                            i14++;
                        } else {
                            i15++;
                        }
                    }
                } else {
                    it = it2;
                }
            }
            it2 = it;
        }
        List listL = ns.o.L(x8.CHARACTER, x8.WORD, x8.SENTENCE);
        int iW = ry.x.W(ry.n.W(listL, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iW);
        for (Object obj : listL) {
            Collection collection = (Set) linkedHashMap.get((x8) obj);
            if (collection == null) {
                collection = ry.t.f50856a;
            }
            linkedHashMap2.put(obj, collection);
        }
        return new eh.b(i11, i12, i13, i14, i15, linkedHashMap2, i16, i17, i18);
    }

    public static float P(int i11, int i12, int i13, float f5) {
        float f11;
        if (f5 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i11 == 0) {
            f11 = i13;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    return -3.4028235E38f;
                }
                return f5;
            }
            f11 = i12;
        }
        return f5 * f11;
    }

    public static final long Q(long j11, ht.o oVar, Map tipsUnitIdLookup) {
        Long l9;
        kotlin.jvm.internal.m.f(tipsUnitIdLookup, "tipsUnitIdLookup");
        if (j11 > 0) {
            return j11;
        }
        if (oVar == null || (l9 = (Long) tipsUnitIdLookup.get(U(oVar.f33753a, oVar.f33754b))) == null) {
            return -1L;
        }
        if (l9.longValue() <= 0) {
            l9 = null;
        }
        if (l9 != null) {
            return l9.longValue();
        }
        return -1L;
    }

    public static final int R(e0 state) {
        kotlin.jvm.internal.m.f(state, "state");
        switch (ob.v.f44893a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Bitmap S(Activity activity) {
        Bitmap bitmapCreateScaledBitmap;
        kotlin.jvm.internal.m.f(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.m.e(decorView, "getDecorView(...)");
        try {
            decorView.buildDrawingCache();
            Bitmap drawingCache = decorView.getDrawingCache();
            if (drawingCache != null) {
                int i11 = drawingCache.getWidth() > drawingCache.getHeight() ? 1200 : LogSeverity.EMERGENCY_VALUE;
                if (drawingCache.getWidth() < i11) {
                    bitmapCreateScaledBitmap = Bitmap.createBitmap(drawingCache);
                } else {
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(drawingCache, i11, (int) (drawingCache.getHeight() / (drawingCache.getWidth() / i11)), false);
                }
            } else {
                bitmapCreateScaledBitmap = null;
            }
            decorView.destroyDrawingCache();
            decorView.setDrawingCacheEnabled(false);
            return bitmapCreateScaledBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final long T(long j11, float f5) {
        return y.h.a(y(j11) * f5, z(j11) * f5);
    }

    public static final String U(int i11, long j11) {
        return i11 + "_" + j11;
    }

    public static final pb.f V(byte[] bytes) throws IOException {
        kotlin.jvm.internal.m.f(bytes, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new pb.f(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i11 = objectInputStream.readInt();
                int[] iArr = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr[i12] = objectInputStream.readInt();
                }
                int i13 = objectInputStream.readInt();
                int[] iArr2 = new int[i13];
                for (int i14 = 0; i14 < i13; i14++) {
                    iArr2[i14] = objectInputStream.readInt();
                }
                pb.f fVarA = pb.a.a(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return fVarA;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ns.o.m(objectInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ns.o.m(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [b0.h2, y1.i] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList W(l2 l2Var, int i11, Integer num) {
        ?? iVar = new y1.i(l2Var);
        i11 = l2Var.q(i11);
        l1.b bVarA = l2Var.a(i11);
        while (i11 >= 0) {
            iVar.j0(l2Var.i(i11), l2Var.k(i11) ? l2Var.p(l2Var.f39341b, i11) : l1.m.f39353a, l2Var.f39340a.h(i11), num);
            if (i11 >= 0) {
                l1.b bVar = bVarA;
                bVarA = l2Var.a(i11);
                i11 = l2Var.q(i11);
                num = bVar;
            } else {
                num = bVarA;
            }
        }
        return (ArrayList) iVar.f3561b;
    }

    public static final long X(long j11, b1.p pVar) {
        float fY = y(j11);
        float fZ = z(j11);
        float[] fArr = (float[]) pVar.f3800b;
        fArr[0] = fY;
        fArr[1] = fZ;
        ((Matrix) pVar.f3801c).mapPoints(fArr);
        long jA = y.h.a(fArr[0], fArr[1]);
        return y.h.a(Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
    }

    public static void Y(String str, String str2, ZipOutputStream zipOutputStream) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            File file = new File(str + str2);
            file.getPath();
            if (file.isFile()) {
                ZipEntry zipEntry = new ZipEntry(str2);
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    zipOutputStream.putNextEntry(zipEntry);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i11 = fileInputStream2.read(bArr);
                        if (i11 == -1) {
                            break;
                        } else {
                            zipOutputStream.write(bArr, 0, i11);
                        }
                    }
                    zipOutputStream.closeEntry();
                    fileInputStream = fileInputStream2;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } else {
                String[] list = file.list();
                if (list.length <= 0) {
                    zipOutputStream.putNextEntry(new ZipEntry(str2 + File.separator));
                    zipOutputStream.closeEntry();
                }
                for (String str3 : list) {
                    Y(str, str2 + File.separator + str3, zipOutputStream);
                }
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void Z(String str, String str2) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(str2));
        try {
            File file = new File(str);
            Y(file.getParent() + File.separator, file.getName(), zipOutputStream);
        } finally {
            zipOutputStream.flush();
            zipOutputStream.finish();
            zipOutputStream.close();
        }
    }

    public static final void a(fz.a onDismissRequest, rp.e eVar, l1.n nVar, int i11) {
        fz.a aVar;
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1570552061);
        int i12 = i11 | 16;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(rp.e.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                eVar = (rp.e) viewModelA;
            } else {
                sVar.W();
            }
            sVar.q();
            aVar = onDismissRequest;
            androidx.compose.ui.window.a.a(aVar, null, t1.e.d(1830803092, new fu.n(22, l1.t.o(eVar.f49345c, sVar), onDismissRequest), sVar), sVar, 390, 2);
        } else {
            aVar = onDismissRequest;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.n(aVar, i11, 23, eVar);
        }
    }

    public static final long b(float f5, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:40:0x011b  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object c(Context context, ad.s sVar, String str, String str2, String str3, String str4, xy.c cVar) {
        ad.z zVar;
        String str5;
        String str6;
        String str7;
        Context context2;
        wc.h hVar;
        Context context3;
        String str8;
        Object objM;
        wc.h hVar2;
        String str9;
        Object objM2;
        if (cVar instanceof ad.z) {
            zVar = (ad.z) cVar;
            int i11 = zVar.f662f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zVar.f662f = i11 - Integer.MIN_VALUE;
            } else {
                zVar = new ad.z(cVar);
            }
        } else {
            zVar = new ad.z(cVar);
        }
        Object objR = zVar.f661e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = zVar.f662f;
        Object obj = qy.b0.f48488a;
        int i13 = 1;
        vy.d dVar = null;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objR);
            int i14 = 0;
            wc.b0 b0VarH = H(context, sVar, str4, false);
            if (b0VarH == null) {
                throw new IllegalArgumentException(("Unable to create parsing task for " + sVar + ".").toString());
            }
            zVar.f657a = context;
            str5 = str;
            zVar.f658b = str5;
            str6 = str2;
            zVar.f659c = str6;
            str7 = str3;
            zVar.f660d = str7;
            zVar.f662f = 1;
            rz.m mVar = new rz.m(1, ue.f.x(zVar));
            mVar.s();
            b0VarH.b(new ad.w(mVar, i14));
            b0VarH.a(new ad.w(mVar, i13));
            objR = mVar.r();
            if (objR != aVar) {
                context2 = context;
            }
            return aVar;
        }
        if (i12 == 1) {
            String str10 = (String) zVar.f660d;
            String str11 = zVar.f659c;
            String str12 = zVar.f658b;
            context2 = (Context) zVar.f657a;
            com.bumptech.glide.e.F(objR);
            str7 = str10;
            str6 = str11;
            str5 = str12;
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wc.h hVar3 = (wc.h) zVar.f657a;
                com.bumptech.glide.e.F(objR);
                return hVar3;
            }
            hVar2 = (wc.h) zVar.f660d;
            str9 = zVar.f659c;
            String str13 = zVar.f658b;
            context3 = (Context) zVar.f657a;
            com.bumptech.glide.e.F(objR);
            str6 = str13;
            str8 = null;
        }
        zVar.f657a = hVar2;
        zVar.f658b = str8;
        zVar.f659c = str8;
        zVar.f660d = str8;
        zVar.f662f = 3;
        if (!hVar2.f54962f.isEmpty()) {
            yz.f fVar = o0.f50940a;
            objM2 = rz.e0.M(yz.e.f58387a, new ad.x(hVar2, context3, str6, str9, null, 0), zVar);
            if (objM2 == aVar) {
                obj = objM2;
            }
        }
        if (obj != aVar) {
            return aVar;
        }
        return hVar2;
        wc.h hVar4 = (wc.h) objR;
        zVar.f657a = context2;
        zVar.f658b = str6;
        zVar.f659c = str7;
        zVar.f660d = hVar4;
        zVar.f662f = 2;
        if (hVar4.f54960d.isEmpty()) {
            hVar = hVar4;
            objM = obj;
            context3 = context2;
            str8 = null;
        } else {
            yz.f fVar2 = o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            Context context4 = context2;
            ad.y yVar = new ad.y(hVar4, context4, str5, dVar, 0);
            hVar = hVar4;
            context3 = context4;
            str8 = null;
            objM = rz.e0.M(eVar, yVar, zVar);
            if (objM != aVar) {
                objM = obj;
            }
        }
        if (objM != aVar) {
            hVar2 = hVar;
            str9 = str7;
            zVar.f657a = hVar2;
            zVar.f658b = str8;
            zVar.f659c = str8;
            zVar.f660d = str8;
            zVar.f662f = 3;
            if (!hVar2.f54962f.isEmpty()) {
                yz.f fVar3 = o0.f50940a;
                objM2 = rz.e0.M(yz.e.f58387a, new ad.x(hVar2, context3, str6, str9, null, 0), zVar);
                if (objM2 == aVar) {
                    obj = objM2;
                }
            }
            if (obj != aVar) {
                return hVar2;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0265  */
    public static void d(Sentence sentence, List list, mp.b ctrlView) {
        int i11;
        SpannableString spannableString;
        StyleSpan styleSpan;
        SpannableString spannableString2;
        int i12;
        List stemList = list;
        kotlin.jvm.internal.m.f(stemList, "stemList");
        kotlin.jvm.internal.m.f(ctrlView, "ctrlView");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayListU = u(sentence);
        ArrayList arrayList = new ArrayList();
        Iterator it = stemList.iterator();
        while (true) {
            i11 = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Word word = (Word) next;
            if (word.getWordType() != 1 || kotlin.jvm.internal.m.a(word.getWord(), "_____")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayListU.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayListU.get(i13);
            i13++;
            Word word2 = (Word) obj;
            if (word2.getWordType() != 1 || kotlin.jvm.internal.m.a(word2.getWord(), "_____")) {
                arrayList2.add(obj);
            }
        }
        int i14 = 2;
        int i15 = 12;
        if (arrayList2.size() != arrayList.size()) {
            int size2 = arrayListU.size();
            int i16 = 0;
            int i17 = 0;
            while (i17 < size2) {
                Object obj2 = arrayListU.get(i17);
                i17++;
                int i18 = i16 + 1;
                if (i16 < 0) {
                    ns.o.V();
                    throw null;
                }
                Word word3 = (Word) obj2;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if ((cf.x.n().keyLanguage == i11 || cf.x.n().keyLanguage == i15) && cf.x.n().jsDisPlay == i14 && !kotlin.jvm.internal.m.a(word3.getWord(), " ")) {
                    String word4 = word3.getWord();
                    kotlin.jvm.internal.m.e(word4, "getWord(...)");
                    spannableString2 = new SpannableString(oz.x.q0(word4, " ", BuildConfig.VERSION_NAME));
                } else {
                    spannableString2 = new SpannableString(word3.getWord());
                }
                if (cf.x.n().keyLanguage == 10 || cf.x.n().keyLanguage == 22) {
                    String word5 = word3.getWord();
                    kotlin.jvm.internal.m.e(word5, "getWord(...)");
                    spannableString2 = new SpannableString(oz.x.q0(word5, "́", BuildConfig.VERSION_NAME));
                }
                StyleSpan styleSpan2 = new StyleSpan(0);
                if (word3.getWordType() == i11) {
                    i12 = size2;
                } else if (stemList.isEmpty()) {
                    i12 = size2;
                    styleSpan2 = new StyleSpan(1);
                } else {
                    Iterator it2 = stemList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String strV = v((Word) it2.next());
                            Locale locale = Locale.ROOT;
                            String lowerCase = strV.toLowerCase(locale);
                            kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                            i12 = size2;
                            String word6 = word3.getWord();
                            kotlin.jvm.internal.m.e(word6, "getWord(...)");
                            String lowerCase2 = word6.toLowerCase(locale);
                            kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                            if (!lowerCase.equals(lowerCase2)) {
                                size2 = i12;
                            }
                        } else {
                            i12 = size2;
                            styleSpan2 = new StyleSpan(1);
                        }
                    }
                }
                spannableString2.setSpan(styleSpan2, 0, spannableString2.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString2);
                stemList = list;
                i16 = i18;
                size2 = i12;
                i11 = 1;
                i15 = 12;
                i14 = 2;
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList2.size();
            int i19 = 0;
            int i21 = 0;
            while (i19 < size3) {
                Object obj3 = arrayList2.get(i19);
                i19++;
                int i22 = i21 + 1;
                if (i21 < 0) {
                    ns.o.V();
                    throw null;
                }
                Word word7 = (Word) obj3;
                ArrayList arrayList4 = arrayList2;
                String word8 = word7.getWord();
                kotlin.jvm.internal.m.e(word8, "getWord(...)");
                int i23 = size3;
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = word8.toLowerCase(locale2);
                kotlin.jvm.internal.m.e(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = v((Word) arrayList.get(i21)).toLowerCase(locale2);
                kotlin.jvm.internal.m.e(lowerCase4, "toLowerCase(...)");
                if (!lowerCase3.equals(lowerCase4)) {
                    arrayList3.add(Integer.valueOf(arrayListU.indexOf(word7)));
                }
                size3 = i23;
                i21 = i22;
                arrayList2 = arrayList4;
            }
            int size4 = arrayListU.size();
            for (int i24 = 0; i24 < size4; i24++) {
                Word word9 = (Word) arrayListU.get(i24);
                String word10 = word9.getWord();
                kotlin.jvm.internal.m.e(word10, "getWord(...)");
                kotlin.jvm.internal.m.e(word10.toLowerCase(Locale.ROOT), "toLowerCase(...)");
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (cf.x.n().keyLanguage == 1 || cf.x.n().keyLanguage == 12) {
                    if (cf.x.n().jsDisPlay == 2 && !kotlin.jvm.internal.m.a(word9.getWord(), " ")) {
                        String word11 = word9.getWord();
                        kotlin.jvm.internal.m.e(word11, "getWord(...)");
                        spannableString = new SpannableString(oz.x.q0(word11, " ", BuildConfig.VERSION_NAME));
                    }
                    if (cf.x.n().keyLanguage != 10 || cf.x.n().keyLanguage == 22) {
                        String word12 = word9.getWord();
                        kotlin.jvm.internal.m.e(word12, "getWord(...)");
                        spannableString = new SpannableString(oz.x.q0(word12, "́", BuildConfig.VERSION_NAME));
                    }
                    styleSpan = new StyleSpan(0);
                    if (arrayList3.contains(Integer.valueOf(i24))) {
                        styleSpan = new StyleSpan(1);
                    }
                    spannableString.setSpan(styleSpan, 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                }
                spannableString = new SpannableString(word9.getWord());
                if (cf.x.n().keyLanguage != 10) {
                }
                String word13 = word9.getWord();
                kotlin.jvm.internal.m.e(word13, "getWord(...)");
                spannableString = new SpannableString(oz.x.q0(word13, "́", BuildConfig.VERSION_NAME));
                styleSpan = new StyleSpan(0);
                if (arrayList3.contains(Integer.valueOf(i24))) {
                    styleSpan = new StyleSpan(1);
                }
                spannableString.setSpan(styleSpan, 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
        }
        ((jp.p0) ctrlView).f36528d0 = new ob.e(20, ctrlView, spannableStringBuilder);
    }

    public static final sy.g e(List statuses) {
        kotlin.jvm.internal.m.f(statuses, "statuses");
        sy.g gVar = new sy.g();
        Iterator it = statuses.iterator();
        while (it.hasNext()) {
            SRSStatus sRSStatus = (SRSStatus) it.next();
            if (sRSStatus.getUnitId() > 0) {
                gVar.putIfAbsent(U(sRSStatus.getElemType(), sRSStatus.getElemId()), Long.valueOf(sRSStatus.getUnitId()));
            }
        }
        return gVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [b0.h2, y1.i] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [l1.b] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List f(p2 p2Var, Integer num, int i11, Integer num2) {
        int iE;
        int iS;
        y.e0 e0Var;
        if (p2Var.f39417w || p2Var.p() == 0) {
            return ry.r.f50854a;
        }
        ?? iVar = new y1.i(p2Var);
        if (num2 != null) {
            iE = num2.intValue();
        } else {
            iE = p2Var.f39416v;
            if (iE < 0) {
                iE = p2Var.E(p2Var.f39397b, i11);
            }
        }
        if (num == 0) {
            int iN = p2Var.f39404i - p2Var.N(p2Var.f39397b, p2Var.r(i11));
            y.x xVar = p2Var.f39413s;
            num = Integer.valueOf(iN + ((xVar == null || (e0Var = (y.e0) xVar.b(i11)) == null) ? 0 : e0Var.f56687b));
        }
        int iR = p2Var.r(i11) * 5;
        int[] iArr = p2Var.f39397b;
        if (iR < iArr.length) {
            iS = p2Var.s(i11);
        } else {
            int iE2 = iE >= 0 ? p2Var.E(iArr, iE) : iE;
            iS = p2Var.s(iE);
            int i12 = iE;
            iE = iE2;
            i11 = i12;
        }
        while (i11 >= 0) {
            iVar.j0(iS, (p2Var.f39397b[(p2Var.r(i11) * 5) + 1] & 536870912) != 0 ? p2Var.t(i11) : l1.m.f39353a, p2Var.O(i11), num);
            num = p2Var.b(i11);
            if (iE >= 0) {
                int iE3 = p2Var.E(p2Var.f39397b, iE);
                iS = p2Var.s(iE);
                int i13 = iE;
                iE = iE3;
                i11 = i13;
            } else {
                i11 = iE;
            }
        }
        return (ArrayList) iVar.f3561b;
    }

    public static final LinkedHashSet g(byte[] bytes) throws IOException {
        kotlin.jvm.internal.m.f(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i11 = objectInputStream.readInt();
                    for (int i12 = 0; i12 < i11; i12++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z11 = objectInputStream.readBoolean();
                        kotlin.jvm.internal.m.e(uri, "uri");
                        linkedHashSet.add(new fb.e(z11, uri));
                    }
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    return linkedHashSet;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ns.o.m(objectInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ns.o.m(byteArrayInputStream, th4);
                    throw th5;
                }
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }

    public static final p m(Context context, fb.c cVar) {
        w9.q qVarN;
        kotlin.jvm.internal.m.f(context, "context");
        qb.a aVar = new qb.a(cVar.f27048c);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.m.e(applicationContext, "context.applicationContext");
        pb.j jVar = aVar.f47694a;
        kotlin.jvm.internal.m.e(jVar, "workTaskExecutor.serialTaskExecutor");
        fb.l clock = cVar.f27049d;
        boolean z11 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        kotlin.jvm.internal.m.f(clock, "clock");
        if (z11) {
            qVarN = new w9.q(applicationContext, WorkDatabase.class, null);
            qVarN.f54840i = true;
        } else {
            qVarN = n(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            qVarN.f54839h = new m(applicationContext);
        }
        qVarN.f54837f = jVar;
        qVarN.f54835d.add(new a(clock));
        qVarN.a(c.f28911h);
        qVarN.a(new e(applicationContext, 2, 3));
        qVarN.a(c.f28912i);
        qVarN.a(c.f28913j);
        qVarN.a(new e(applicationContext, 5, 6));
        qVarN.a(c.f28914k);
        qVarN.a(c.f28915l);
        qVarN.a(c.m);
        qVarN.a(new e(applicationContext));
        qVarN.a(new e(applicationContext, 10, 11));
        qVarN.a(c.f28907d);
        qVarN.a(c.f28908e);
        qVarN.a(c.f28909f);
        qVarN.a(c.f28910g);
        qVarN.a(new e(applicationContext, 21, 22));
        qVarN.f54846p = false;
        qVarN.f54847q = true;
        WorkDatabase workDatabase = (WorkDatabase) qVarN.b();
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.m.e(applicationContext2, "context.applicationContext");
        mb.i iVar = new mb.i(applicationContext2, aVar);
        d dVar = new d(context.getApplicationContext(), cVar, aVar, workDatabase);
        return new p(context.getApplicationContext(), cVar, aVar, workDatabase, (List) q.f28963a.g(context, cVar, aVar, workDatabase, iVar, dVar), dVar, iVar);
    }

    public static final w9.q n(Context context, Class cls, String str) {
        if (oz.q.K0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (str.equals(":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new w9.q(context, cls, str);
    }

    public static final long o(long j11, float f5) {
        return y.h.a(y(j11) / f5, z(j11) / f5);
    }

    public static final float p(long j11, long j12) {
        return (z(j12) * z(j11)) + (y(j12) * y(j11));
    }

    public static final Integer r(l2 l2Var, l1.w wVar, int i11, int i12) {
        Integer numR;
        int[] iArr = l2Var.f39341b;
        while (true) {
            if (i11 >= i12) {
                return null;
            }
            int i13 = iArr[(i11 * 5) + 3] + i11;
            if (l2Var.j(i11) && l2Var.i(i11) == 206 && kotlin.jvm.internal.m.a(l2Var.p(iArr, i11), l1.u.f39478e)) {
                Object objH = l2Var.h(i11, 0);
                g2 g2Var = objH instanceof g2 ? (g2) objH : null;
                f2 f2Var = g2Var != null ? g2Var.f39309a : null;
                l1.p pVar = f2Var instanceof l1.p ? (l1.p) f2Var : null;
                if (pVar != null && pVar.f39387a.equals(wVar)) {
                    return Integer.valueOf(i11);
                }
            }
            if (l2Var.d(i11) && (numR = r(l2Var, wVar, i11 + 1, i13)) != null) {
                return Integer.valueOf(numR.intValue());
            }
            i11 = i13;
        }
    }

    public static final long s(long j11) {
        float fSqrt = (float) Math.sqrt((z(j11) * z(j11)) + (y(j11) * y(j11)));
        if (fSqrt > CropImageView.DEFAULT_ASPECT_RATIO) {
            return o(j11, fSqrt);
        }
        throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
    }

    public static int t(List list, InputStream inputStream, m0.n nVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new ce.a0(inputStream, nVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                int iB = ((td.f) list.get(i11)).b(inputStream, nVar);
                inputStream.reset();
                if (iB != -1) {
                    return iB;
                }
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0291  */
    /* JADX WARN: Code duplicated, block: B:106:0x02cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:109:0x02db  */
    /* JADX WARN: Code duplicated, block: B:111:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:112:0x0309  */
    /* JADX WARN: Code duplicated, block: B:114:0x030c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0435 A[PHI: r16 r24 r25 r26
      0x0435: PHI (r16v4 int) = (r16v1 int), (r16v5 int), (r16v5 int), (r16v5 int) binds: [B:143:0x042f, B:178:0x0542, B:172:0x0522, B:155:0x0474] A[DONT_GENERATE, DONT_INLINE]
      0x0435: PHI (r24v7 java.lang.String) = (r24v3 java.lang.String), (r24v8 java.lang.String), (r24v8 java.lang.String), (r24v8 java.lang.String) binds: [B:143:0x042f, B:178:0x0542, B:172:0x0522, B:155:0x0474] A[DONT_GENERATE, DONT_INLINE]
      0x0435: PHI (r25v4 java.lang.Integer) = (r25v0 java.lang.Integer), (r25v7 java.lang.Integer), (r25v8 java.lang.Integer), (r25v12 java.lang.Integer) binds: [B:143:0x042f, B:178:0x0542, B:172:0x0522, B:155:0x0474] A[DONT_GENERATE, DONT_INLINE]
      0x0435: PHI (r26v4 java.lang.Integer) = (r26v0 java.lang.Integer), (r26v7 java.lang.Integer), (r26v8 java.lang.Integer), (r26v12 java.lang.Integer) binds: [B:143:0x042f, B:178:0x0542, B:172:0x0522, B:155:0x0474] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x043d  */
    /* JADX WARN: Code duplicated, block: B:148:0x044d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0453  */
    /* JADX WARN: Code duplicated, block: B:156:0x0479  */
    /* JADX WARN: Code duplicated, block: B:158:0x048f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0496  */
    /* JADX WARN: Code duplicated, block: B:169:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:171:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:174:0x0526  */
    /* JADX WARN: Code duplicated, block: B:177:0x0530  */
    /* JADX WARN: Code duplicated, block: B:180:0x0545  */
    /* JADX WARN: Code duplicated, block: B:182:0x0555  */
    /* JADX WARN: Code duplicated, block: B:185:0x0563  */
    /* JADX WARN: Code duplicated, block: B:192:0x0583  */
    /* JADX WARN: Code duplicated, block: B:258:0x0786  */
    /* JADX WARN: Code duplicated, block: B:260:0x078c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:261:0x078e  */
    /* JADX WARN: Code duplicated, block: B:266:0x07c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:267:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:269:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:272:0x080c  */
    /* JADX WARN: Code duplicated, block: B:274:0x0811  */
    /* JADX WARN: Code duplicated, block: B:321:0x0973  */
    /* JADX WARN: Code duplicated, block: B:346:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x0356 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x09a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x0987 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x099e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:372:0x098e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x097b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0876 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7 A[PHI: r7
      0x00b7: PHI (r7v44 int) = (r7v43 int), (r7v46 int) binds: [B:26:0x0082, B:36:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    public static ArrayList u(Sentence sentence) {
        Object obj;
        int i11;
        Word word;
        ArrayList arrayList;
        String str;
        Integer num;
        Integer num2;
        String str2;
        int i12;
        String str3;
        int i13;
        Integer num3;
        int iL;
        String word2;
        String word3;
        String word4;
        List listL;
        String strSubstring;
        int i14;
        Word word5;
        int i15;
        int i16;
        int i17;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i18 = cf.x.n().keyLanguage;
        if (i18 != 0 && i18 != 1 && i18 != 2) {
            String str4 = "¡";
            String str5 = "¿";
            String str6 = "_____";
            String str7 = "\"";
            if (i18 != 4) {
                if (i18 != 5) {
                    if (i18 != 6) {
                        if (i18 != 47 && i18 != 48) {
                            if (i18 != 53 && i18 != 54) {
                                switch (i18) {
                                    case 11:
                                    case 12:
                                    case 13:
                                        break;
                                    case 14:
                                        break;
                                    case 15:
                                        break;
                                    case 16:
                                        break;
                                    default:
                                        ArrayList arrayList2 = new ArrayList();
                                        List<Word> sentWords = sentence.getSentWords();
                                        int size = sentWords.size();
                                        int i19 = 0;
                                        int i21 = 0;
                                        while (i19 < size) {
                                            Word word6 = sentWords.get(i19);
                                            int i22 = i19 + 1;
                                            Word word7 = i22 < sentWords.size() ? sentWords.get(i22) : null;
                                            Word word8 = new Word();
                                            int i23 = i19;
                                            word8.setWordId(word6.getWordId());
                                            word8.setWord(word6.getWord());
                                            word8.setWordType(word6.getWordType());
                                            arrayList2.add(word8);
                                            if (word7 != null) {
                                                i16 = 1;
                                                if (word7.getWordType() != 1 || (word6.getWordType() == 1 && word7.getWordType() == 1)) {
                                                    if (kotlin.jvm.internal.m.a(word6.getWord(), "\"")) {
                                                        i21++;
                                                        if (i21 % 2 == 0) {
                                                            Word word9 = new Word();
                                                            word9.setWord(" ");
                                                            i16 = 1;
                                                            word9.setWordType(1);
                                                            arrayList2.add(word9);
                                                        } else {
                                                            i16 = 1;
                                                        }
                                                    } else {
                                                        i16 = 1;
                                                        Word word10 = new Word();
                                                        word10.setWord(" ");
                                                        word10.setWordType(1);
                                                        arrayList2.add(word10);
                                                    }
                                                }
                                            } else {
                                                i16 = 1;
                                            }
                                            if (i23 == 0 && p0.C((Word) nv.p.g(i16, sentWords), "getWord(...)")) {
                                                String strJ = p0.j(word8, "getWord(...)", 0, i16, "substring(...)");
                                                int[] iArr = bq.r.f4959a;
                                                String strM = p0.m(strJ, "toUpperCase(...)");
                                                String word11 = word8.getWord();
                                                kotlin.jvm.internal.m.e(word11, "getWord(...)");
                                                String strSubstring2 = word11.substring(i16);
                                                kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                                                word8.setWord(strM.concat(strSubstring2));
                                            } else if (i23 == i16 && sentWords.get(0).getWordType() == i16 && ((Word) nv.p.g(i16, sentWords)).getWordType() == i16) {
                                                String strJ2 = p0.j(word8, "getWord(...)", 0, i16, "substring(...)");
                                                int[] iArr2 = bq.r.f4959a;
                                                String strM2 = p0.m(strJ2, "toUpperCase(...)");
                                                String word12 = word8.getWord();
                                                kotlin.jvm.internal.m.e(word12, "getWord(...)");
                                                String strSubstring3 = word12.substring(i16);
                                                kotlin.jvm.internal.m.e(strSubstring3, "substring(...)");
                                                word8.setWord(strM2.concat(strSubstring3));
                                            } else if (i23 > 0) {
                                                Word word13 = sentWords.get(i23 - 1);
                                                if (p0.C(word13, "getWord(...)")) {
                                                    i17 = 1;
                                                    if (p0.C((Word) nv.p.g(1, sentWords), "getWord(...)")) {
                                                        String strJ3 = p0.j(word8, "getWord(...)", 0, 1, "substring(...)");
                                                        int[] iArr3 = bq.r.f4959a;
                                                        String strM3 = p0.m(strJ3, "toUpperCase(...)");
                                                        String word14 = word8.getWord();
                                                        kotlin.jvm.internal.m.e(word14, "getWord(...)");
                                                        String strSubstring4 = word14.substring(1);
                                                        kotlin.jvm.internal.m.e(strSubstring4, "substring(...)");
                                                        word8.setWord(strM3.concat(strSubstring4));
                                                    }
                                                } else {
                                                    i17 = 1;
                                                }
                                                if (i23 > i17 && word13.getWordType() == i17 && !kotlin.jvm.internal.m.a(word13.getWord(), "_____") && p0.C(sentWords.get(i23 - 2), "getWord(...)") && p0.C((Word) nv.p.g(i17, sentWords), "getWord(...)")) {
                                                    String strJ4 = p0.j(word8, "getWord(...)", 0, i17, "substring(...)");
                                                    int[] iArr4 = bq.r.f4959a;
                                                    String strM4 = p0.m(strJ4, "toUpperCase(...)");
                                                    String word15 = word8.getWord();
                                                    kotlin.jvm.internal.m.e(word15, "getWord(...)");
                                                    String strSubstring5 = word15.substring(i17);
                                                    kotlin.jvm.internal.m.e(strSubstring5, "substring(...)");
                                                    word8.setWord(strM4.concat(strSubstring5));
                                                }
                                            }
                                            i19 = i22;
                                        }
                                        return arrayList2;
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    List<Word> sentWords2 = sentence.getSentWords();
                    int size2 = sentWords2.size();
                    int i24 = 0;
                    int i25 = 0;
                    while (i24 < size2) {
                        Word word16 = sentWords2.get(i24);
                        int i26 = i24 + 1;
                        Word word17 = i26 < sentWords2.size() ? sentWords2.get(i26) : null;
                        Word word18 = new Word();
                        int i27 = i25;
                        word18.setWordId(word16.getWordId());
                        word18.setWord(word16.getWord());
                        word18.setWordType(word16.getWordType());
                        arrayList3.add(word18);
                        if (word17 == null) {
                            i14 = 1;
                        } else if (word17.getWordType() != 1 || (word16.getWordType() == 1 && word17.getWordType() == 1)) {
                            if (kotlin.jvm.internal.m.a(word16.getWord(), "\"")) {
                                i25 = i27 + 1;
                                if (i25 % 2 == 0) {
                                    Word word19 = new Word();
                                    word19.setWord(" ");
                                    i14 = 1;
                                    word19.setWordType(1);
                                    arrayList3.add(word19);
                                } else {
                                    i14 = 1;
                                }
                            } else {
                                i14 = 1;
                                Word word20 = new Word();
                                word20.setWord(" ");
                                word20.setWordType(1);
                                arrayList3.add(word20);
                            }
                            if (i24 != 0 && p0.C((Word) nv.p.g(i14, sentWords2), "getWord(...)")) {
                                String strJ5 = p0.j(word18, "getWord(...)", 0, i14, "substring(...)");
                                int[] iArr5 = bq.r.f4959a;
                                String strM5 = p0.m(strJ5, "toUpperCase(...)");
                                String word21 = word18.getWord();
                                kotlin.jvm.internal.m.e(word21, "getWord(...)");
                                String strSubstring6 = word21.substring(i14);
                                kotlin.jvm.internal.m.e(strSubstring6, "substring(...)");
                                word18.setWord(strM5.concat(strSubstring6));
                            } else if (i24 != i14 && sentWords2.get(0).getWordType() == i14 && ((Word) nv.p.g(i14, sentWords2)).getWordType() == i14) {
                                String strJ6 = p0.j(word18, "getWord(...)", 0, i14, "substring(...)");
                                int[] iArr6 = bq.r.f4959a;
                                String strM6 = p0.m(strJ6, "toUpperCase(...)");
                                String word22 = word18.getWord();
                                kotlin.jvm.internal.m.e(word22, "getWord(...)");
                                String strSubstring7 = word22.substring(i14);
                                kotlin.jvm.internal.m.e(strSubstring7, "substring(...)");
                                word18.setWord(strM6.concat(strSubstring7));
                            } else if (i24 > 0) {
                                word5 = sentWords2.get(i24 - 1);
                                if (p0.C(word5, "getWord(...)")) {
                                    i15 = 1;
                                    if (p0.C((Word) nv.p.g(1, sentWords2), "getWord(...)")) {
                                        String strJ7 = p0.j(word18, "getWord(...)", 0, 1, "substring(...)");
                                        int[] iArr7 = bq.r.f4959a;
                                        String strM7 = p0.m(strJ7, "toUpperCase(...)");
                                        String word23 = word18.getWord();
                                        kotlin.jvm.internal.m.e(word23, "getWord(...)");
                                        String strSubstring8 = word23.substring(1);
                                        kotlin.jvm.internal.m.e(strSubstring8, "substring(...)");
                                        word18.setWord(strM7.concat(strSubstring8));
                                    }
                                } else {
                                    i15 = 1;
                                }
                                if (i24 <= i15 && word5.getWordType() == i15 && !kotlin.jvm.internal.m.a(word5.getWord(), "_____") && p0.C(sentWords2.get(i24 - 2), "getWord(...)") && p0.C((Word) nv.p.g(i15, sentWords2), "getWord(...)")) {
                                    String strJ8 = p0.j(word18, "getWord(...)", 0, i15, "substring(...)");
                                    int[] iArr8 = bq.r.f4959a;
                                    String strM8 = p0.m(strJ8, "toUpperCase(...)");
                                    String word24 = word18.getWord();
                                    kotlin.jvm.internal.m.e(word24, "getWord(...)");
                                    String strSubstring9 = word24.substring(i15);
                                    kotlin.jvm.internal.m.e(strSubstring9, "substring(...)");
                                    word18.setWord(strM8.concat(strSubstring9));
                                }
                            }
                            i24 = i26;
                        } else {
                            i14 = 1;
                        }
                        i25 = i27;
                        if (i24 != 0) {
                            if (i24 != i14) {
                                if (i24 > 0) {
                                    word5 = sentWords2.get(i24 - 1);
                                    if (p0.C(word5, "getWord(...)")) {
                                        i15 = 1;
                                        if (p0.C((Word) nv.p.g(1, sentWords2), "getWord(...)")) {
                                            String strJ9 = p0.j(word18, "getWord(...)", 0, 1, "substring(...)");
                                            int[] iArr9 = bq.r.f4959a;
                                            String strM9 = p0.m(strJ9, "toUpperCase(...)");
                                            String word25 = word18.getWord();
                                            kotlin.jvm.internal.m.e(word25, "getWord(...)");
                                            String strSubstring10 = word25.substring(1);
                                            kotlin.jvm.internal.m.e(strSubstring10, "substring(...)");
                                            word18.setWord(strM9.concat(strSubstring10));
                                        }
                                    } else {
                                        i15 = 1;
                                    }
                                    if (i24 <= i15) {
                                    }
                                }
                            } else if (i24 > 0) {
                                word5 = sentWords2.get(i24 - 1);
                                if (p0.C(word5, "getWord(...)")) {
                                    i15 = 1;
                                    if (p0.C((Word) nv.p.g(1, sentWords2), "getWord(...)")) {
                                        String strJ10 = p0.j(word18, "getWord(...)", 0, 1, "substring(...)");
                                        int[] iArr10 = bq.r.f4959a;
                                        String strM10 = p0.m(strJ10, "toUpperCase(...)");
                                        String word26 = word18.getWord();
                                        kotlin.jvm.internal.m.e(word26, "getWord(...)");
                                        String strSubstring11 = word26.substring(1);
                                        kotlin.jvm.internal.m.e(strSubstring11, "substring(...)");
                                        word18.setWord(strM10.concat(strSubstring11));
                                    }
                                } else {
                                    i15 = 1;
                                }
                                if (i24 <= i15) {
                                }
                            }
                        } else if (i24 != i14) {
                            if (i24 > 0) {
                                word5 = sentWords2.get(i24 - 1);
                                if (p0.C(word5, "getWord(...)")) {
                                    i15 = 1;
                                    if (p0.C((Word) nv.p.g(1, sentWords2), "getWord(...)")) {
                                        String strJ11 = p0.j(word18, "getWord(...)", 0, 1, "substring(...)");
                                        int[] iArr11 = bq.r.f4959a;
                                        String strM11 = p0.m(strJ11, "toUpperCase(...)");
                                        String word27 = word18.getWord();
                                        kotlin.jvm.internal.m.e(word27, "getWord(...)");
                                        String strSubstring12 = word27.substring(1);
                                        kotlin.jvm.internal.m.e(strSubstring12, "substring(...)");
                                        word18.setWord(strM11.concat(strSubstring12));
                                    }
                                } else {
                                    i15 = 1;
                                }
                                if (i24 <= i15) {
                                }
                            }
                        } else if (i24 > 0) {
                            word5 = sentWords2.get(i24 - 1);
                            if (p0.C(word5, "getWord(...)")) {
                                i15 = 1;
                                if (p0.C((Word) nv.p.g(1, sentWords2), "getWord(...)")) {
                                    String strJ12 = p0.j(word18, "getWord(...)", 0, 1, "substring(...)");
                                    int[] iArr12 = bq.r.f4959a;
                                    String strM12 = p0.m(strJ12, "toUpperCase(...)");
                                    String word28 = word18.getWord();
                                    kotlin.jvm.internal.m.e(word28, "getWord(...)");
                                    String strSubstring13 = word28.substring(1);
                                    kotlin.jvm.internal.m.e(strSubstring13, "substring(...)");
                                    word18.setWord(strM12.concat(strSubstring13));
                                }
                            } else {
                                i15 = 1;
                            }
                            if (i24 <= i15) {
                            }
                        }
                        i24 = i26;
                    }
                    return arrayList3;
                }
                Integer num4 = 54;
                Integer num5 = 53;
                Integer num6 = 15;
                ArrayList arrayList4 = new ArrayList();
                List<Word> sentWords3 = sentence.getSentWords();
                int size3 = sentWords3.size();
                int i28 = 0;
                int i29 = 0;
                while (i28 < size3) {
                    Word word29 = sentWords3.get(i28);
                    int i30 = size3;
                    int i31 = i28 + 1;
                    int i32 = i28;
                    Word word30 = new Word();
                    String str8 = str4;
                    String str9 = str5;
                    word30.setWordId(word29.getWordId());
                    word30.setWord(word29.getWord());
                    word30.setWordType(word29.getWordType());
                    arrayList4.add(word30);
                    if ((word29.getWordType() != 1 || kotlin.jvm.internal.m.a(word29.getWord(), "_____")) && i31 < sentWords3.size() && sentWords3.get(i31).getWordType() == 1 && !kotlin.jvm.internal.m.a(sentWords3.get(i31).getWord(), "_____") && !kotlin.jvm.internal.m.a(sentWords3.get(i31).getWord(), " ")) {
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        if (ry.l.D(new Integer[]{5, num6, num5, num4}, Integer.valueOf(cf.x.n().keyLanguage)) && ns.o.L(":", ";", "?", "!", "(", "{", "«", "»", "/").contains(sentWords3.get(i31).getWord())) {
                            iL = ff.h.l(2.0f);
                            if (kotlin.jvm.internal.m.a(word29.getWord(), str7)) {
                                i29++;
                                if (i29 % 2 != 0) {
                                    iL = 0;
                                }
                            }
                            word2 = word29.getWord();
                            kotlin.jvm.internal.m.e(word2, "getWord(...)");
                            i12 = iL;
                            str2 = str7;
                            if (oz.x.k0(word2, "'", false) || kotlin.jvm.internal.m.a(word29.getWord(), "po'")) {
                                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                                if (ry.l.D(new Integer[]{5, num6, num5, num4}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                    if (word29.getWordType() == 1 || i31 >= sentWords3.size() || sentWords3.get(i31).getWordType() != 1) {
                                        word3 = word29.getWord();
                                        kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                        if (word3.length() > 0) {
                                            num = num4;
                                            listL = ns.o.L("'", "-", "(", "{");
                                            String word31 = word29.getWord();
                                            kotlin.jvm.internal.m.e(word31, "getWord(...)");
                                            num2 = num5;
                                            strSubstring = word31.substring(word29.getWord().length() - 1, word29.getWord().length());
                                            kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                            if (!listL.contains(strSubstring)) {
                                            }
                                        } else {
                                            num = num4;
                                            num2 = num5;
                                        }
                                        if (i31 < sentWords3.size()) {
                                            word4 = sentWords3.get(i31).getWord();
                                            kotlin.jvm.internal.m.e(word4, "getWord(...)");
                                            if (oz.x.s0(word4, "-", false)) {
                                            }
                                        }
                                    } else {
                                        if (ns.o.L(":", ";", "?", "!", "(", "{", "«", "»", "/").contains(sentWords3.get(i31).getWord())) {
                                            num = num4;
                                            num2 = num5;
                                        }
                                        num = num4;
                                        num2 = num5;
                                    }
                                    str4 = str8;
                                    str3 = str9;
                                } else {
                                    num = num4;
                                    num2 = num5;
                                    str3 = str9;
                                    if (kotlin.jvm.internal.m.a(word29.getWord(), str3)) {
                                        str4 = str8;
                                    } else {
                                        str4 = str8;
                                        if (!kotlin.jvm.internal.m.a(word29.getWord(), str4) || (cf.x.n().keyLanguage == 11 && (word29.getWordId() == 216 || word29.getWordId() == 217))) {
                                        }
                                    }
                                    i12 = 0;
                                }
                            } else {
                                num = num4;
                                num2 = num5;
                            }
                        } else {
                            num = num4;
                            num2 = num5;
                            str2 = str7;
                        }
                        str4 = str8;
                        str3 = str9;
                        i12 = 0;
                    } else {
                        iL = ff.h.l(2.0f);
                        if (kotlin.jvm.internal.m.a(word29.getWord(), str7)) {
                            i29++;
                            if (i29 % 2 != 0) {
                                iL = 0;
                            }
                        }
                        word2 = word29.getWord();
                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                        i12 = iL;
                        str2 = str7;
                        if (oz.x.k0(word2, "'", false)) {
                            LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                            if (ry.l.D(new Integer[]{5, num6, num5, num4}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                num = num4;
                                num2 = num5;
                                str3 = str9;
                                if (kotlin.jvm.internal.m.a(word29.getWord(), str3)) {
                                    str4 = str8;
                                    if (!kotlin.jvm.internal.m.a(word29.getWord(), str4)) {
                                    }
                                } else {
                                    str4 = str8;
                                }
                                i12 = 0;
                            } else if (word29.getWordType() == 1) {
                                word3 = word29.getWord();
                                kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                if (word3.length() > 0) {
                                    num = num4;
                                    listL = ns.o.L("'", "-", "(", "{");
                                    String word32 = word29.getWord();
                                    kotlin.jvm.internal.m.e(word32, "getWord(...)");
                                    num2 = num5;
                                    strSubstring = word32.substring(word29.getWord().length() - 1, word29.getWord().length());
                                    kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                    if (!listL.contains(strSubstring)) {
                                    }
                                    str4 = str8;
                                    str3 = str9;
                                    i12 = 0;
                                } else {
                                    num = num4;
                                    num2 = num5;
                                }
                                if (i31 < sentWords3.size()) {
                                    word4 = sentWords3.get(i31).getWord();
                                    kotlin.jvm.internal.m.e(word4, "getWord(...)");
                                    if (oz.x.s0(word4, "-", false)) {
                                        str4 = str8;
                                        str3 = str9;
                                        i12 = 0;
                                    }
                                }
                                str4 = str8;
                                str3 = str9;
                            } else {
                                word3 = word29.getWord();
                                kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                if (word3.length() > 0) {
                                    num = num4;
                                    listL = ns.o.L("'", "-", "(", "{");
                                    String word33 = word29.getWord();
                                    kotlin.jvm.internal.m.e(word33, "getWord(...)");
                                    num2 = num5;
                                    strSubstring = word33.substring(word29.getWord().length() - 1, word29.getWord().length());
                                    kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                    if (!listL.contains(strSubstring)) {
                                    }
                                    str4 = str8;
                                    str3 = str9;
                                    i12 = 0;
                                } else {
                                    num = num4;
                                    num2 = num5;
                                }
                                if (i31 < sentWords3.size()) {
                                    word4 = sentWords3.get(i31).getWord();
                                    kotlin.jvm.internal.m.e(word4, "getWord(...)");
                                    if (oz.x.s0(word4, "-", false)) {
                                        str4 = str8;
                                        str3 = str9;
                                        i12 = 0;
                                    }
                                }
                                str4 = str8;
                                str3 = str9;
                            }
                        } else {
                            LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                            if (ry.l.D(new Integer[]{5, num6, num5, num4}, Integer.valueOf(cf.x.n().keyLanguage))) {
                                num = num4;
                                num2 = num5;
                                str3 = str9;
                                if (kotlin.jvm.internal.m.a(word29.getWord(), str3)) {
                                    str4 = str8;
                                    if (!kotlin.jvm.internal.m.a(word29.getWord(), str4)) {
                                    }
                                } else {
                                    str4 = str8;
                                }
                                i12 = 0;
                            } else if (word29.getWordType() == 1) {
                                word3 = word29.getWord();
                                kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                if (word3.length() > 0) {
                                    num = num4;
                                    listL = ns.o.L("'", "-", "(", "{");
                                    String word34 = word29.getWord();
                                    kotlin.jvm.internal.m.e(word34, "getWord(...)");
                                    num2 = num5;
                                    strSubstring = word34.substring(word29.getWord().length() - 1, word29.getWord().length());
                                    kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                    if (!listL.contains(strSubstring)) {
                                    }
                                    str4 = str8;
                                    str3 = str9;
                                    i12 = 0;
                                } else {
                                    num = num4;
                                    num2 = num5;
                                }
                                if (i31 < sentWords3.size()) {
                                    word4 = sentWords3.get(i31).getWord();
                                    kotlin.jvm.internal.m.e(word4, "getWord(...)");
                                    if (oz.x.s0(word4, "-", false)) {
                                        str4 = str8;
                                        str3 = str9;
                                        i12 = 0;
                                    }
                                }
                                str4 = str8;
                                str3 = str9;
                            } else {
                                word3 = word29.getWord();
                                kotlin.jvm.internal.m.e(word3, "getWord(...)");
                                if (word3.length() > 0) {
                                    num = num4;
                                    listL = ns.o.L("'", "-", "(", "{");
                                    String word35 = word29.getWord();
                                    kotlin.jvm.internal.m.e(word35, "getWord(...)");
                                    num2 = num5;
                                    strSubstring = word35.substring(word29.getWord().length() - 1, word29.getWord().length());
                                    kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                    if (!listL.contains(strSubstring)) {
                                    }
                                    str4 = str8;
                                    str3 = str9;
                                    i12 = 0;
                                } else {
                                    num = num4;
                                    num2 = num5;
                                }
                                if (i31 < sentWords3.size()) {
                                    word4 = sentWords3.get(i31).getWord();
                                    kotlin.jvm.internal.m.e(word4, "getWord(...)");
                                    if (oz.x.s0(word4, "-", false)) {
                                        str4 = str8;
                                        str3 = str9;
                                        i12 = 0;
                                    }
                                }
                                str4 = str8;
                                str3 = str9;
                            }
                        }
                    }
                    if (i12 > 0) {
                        Word word36 = new Word();
                        word36.setWord(" ");
                        i13 = 1;
                        word36.setWordType(1);
                        arrayList4.add(word36);
                    } else {
                        i13 = 1;
                    }
                    if (i32 == 0 && p0.C((Word) nv.p.g(i13, sentWords3), "getWord(...)")) {
                        String strJ13 = p0.j(word30, "getWord(...)", 0, i13, "substring(...)");
                        int[] iArr13 = bq.r.f4959a;
                        String strM13 = p0.m(strJ13, "toUpperCase(...)");
                        String word37 = word30.getWord();
                        kotlin.jvm.internal.m.e(word37, "getWord(...)");
                        String strSubstring14 = word37.substring(i13);
                        kotlin.jvm.internal.m.e(strSubstring14, "substring(...)");
                        word30.setWord(strM13.concat(strSubstring14));
                    } else if (i32 == i13 && sentWords3.get(0).getWordType() == i13 && ((Word) nv.p.g(i13, sentWords3)).getWordType() == i13) {
                        String strJ14 = p0.j(word30, "getWord(...)", 0, i13, "substring(...)");
                        int[] iArr14 = bq.r.f4959a;
                        String strM14 = p0.m(strJ14, "toUpperCase(...)");
                        String word38 = word30.getWord();
                        kotlin.jvm.internal.m.e(word38, "getWord(...)");
                        String strSubstring15 = word38.substring(i13);
                        kotlin.jvm.internal.m.e(strSubstring15, "substring(...)");
                        word30.setWord(strM14.concat(strSubstring15));
                    } else {
                        if (i32 > 0) {
                            Word word39 = sentWords3.get(i32 - 1);
                            if (p0.C(word39, "getWord(...)") && p0.C((Word) nv.p.g(1, sentWords3), "getWord(...)")) {
                                num3 = num6;
                                String strJ15 = p0.j(word30, "getWord(...)", 0, 1, "substring(...)");
                                int[] iArr15 = bq.r.f4959a;
                                String strM15 = p0.m(strJ15, "toUpperCase(...)");
                                String word40 = word30.getWord();
                                kotlin.jvm.internal.m.e(word40, "getWord(...)");
                                String strSubstring16 = word40.substring(1);
                                kotlin.jvm.internal.m.e(strSubstring16, "substring(...)");
                                word30.setWord(strM15.concat(strSubstring16));
                            } else {
                                num3 = num6;
                                if (i32 > 1 && word39.getWordType() == 1 && !kotlin.jvm.internal.m.a(word39.getWord(), "_____") && p0.C(sentWords3.get(i32 - 2), "getWord(...)") && p0.C((Word) nv.p.g(1, sentWords3), "getWord(...)")) {
                                    String strJ16 = p0.j(word30, "getWord(...)", 0, 1, "substring(...)");
                                    int[] iArr16 = bq.r.f4959a;
                                    String strM16 = p0.m(strJ16, "toUpperCase(...)");
                                    String word41 = word30.getWord();
                                    kotlin.jvm.internal.m.e(word41, "getWord(...)");
                                    String strSubstring17 = word41.substring(1);
                                    kotlin.jvm.internal.m.e(strSubstring17, "substring(...)");
                                    word30.setWord(strM16.concat(strSubstring17));
                                }
                            }
                        }
                        str5 = str3;
                        i28 = i31;
                        num6 = num3;
                        str7 = str2;
                        num4 = num;
                        num5 = num2;
                        size3 = i30;
                    }
                    num3 = num6;
                    str5 = str3;
                    i28 = i31;
                    num6 = num3;
                    str7 = str2;
                    num4 = num;
                    num5 = num2;
                    size3 = i30;
                }
                return arrayList4;
            }
            Object obj2 = "\"";
            ArrayList arrayList5 = new ArrayList();
            List<Word> sentWords4 = sentence.getSentWords();
            int size4 = sentWords4.size();
            int i33 = 0;
            int i34 = 0;
            while (i33 < size4) {
                Word word42 = sentWords4.get(i33);
                int i35 = i33 + 1;
                Word word43 = i35 < sentWords4.size() ? sentWords4.get(i35) : null;
                Word word44 = new Word();
                String str10 = str6;
                word44.setWordId(word42.getWordId());
                word44.setWord(word42.getWord());
                word44.setWordType(word42.getWordType());
                arrayList5.add(word44);
                if (kotlin.jvm.internal.m.a(word42.getWord(), "¿") || kotlin.jvm.internal.m.a(word42.getWord(), "¡") || word43 == null) {
                    obj = obj2;
                } else {
                    if (word43.getWordType() != 1 || (word42.getWordType() == 1 && word43.getWordType() == 1)) {
                        obj = obj2;
                        if (kotlin.jvm.internal.m.a(word42.getWord(), obj)) {
                            i34++;
                            if (i34 % 2 == 0) {
                                Word word45 = new Word();
                                word45.setWord(" ");
                                i11 = 1;
                                word45.setWordType(1);
                                arrayList5.add(word45);
                            }
                        } else {
                            i11 = 1;
                            Word word46 = new Word();
                            word46.setWord(" ");
                            word46.setWordType(1);
                            arrayList5.add(word46);
                        }
                    } else {
                        i11 = 1;
                        obj = obj2;
                    }
                    if (i33 != 0 && p0.C((Word) nv.p.g(i11, sentWords4), "getWord(...)")) {
                        String strJ17 = p0.j(word44, "getWord(...)", 0, i11, "substring(...)");
                        int[] iArr17 = bq.r.f4959a;
                        String strM17 = p0.m(strJ17, "toUpperCase(...)");
                        String word47 = word44.getWord();
                        kotlin.jvm.internal.m.e(word47, "getWord(...)");
                        String strSubstring18 = word47.substring(i11);
                        kotlin.jvm.internal.m.e(strSubstring18, "substring(...)");
                        word44.setWord(strM17.concat(strSubstring18));
                    } else if (i33 != i11 && sentWords4.get(0).getWordType() == i11 && ((Word) nv.p.g(i11, sentWords4)).getWordType() == i11) {
                        String strJ18 = p0.j(word44, "getWord(...)", 0, i11, "substring(...)");
                        int[] iArr18 = bq.r.f4959a;
                        String strM18 = p0.m(strJ18, "toUpperCase(...)");
                        String word48 = word44.getWord();
                        kotlin.jvm.internal.m.e(word48, "getWord(...)");
                        String strSubstring19 = word48.substring(i11);
                        kotlin.jvm.internal.m.e(strSubstring19, "substring(...)");
                        word44.setWord(strM18.concat(strSubstring19));
                    } else {
                        if (i33 > 0) {
                            word = sentWords4.get(i33 - 1);
                            if (p0.C(word, "getWord(...)") || !p0.C((Word) nv.p.g(1, sentWords4), "getWord(...)")) {
                                arrayList = arrayList5;
                                if (i33 <= 1 && word.getWordType() == 1) {
                                    str = str10;
                                    if (!kotlin.jvm.internal.m.a(word.getWord(), str) && p0.C(sentWords4.get(i33 - 2), "getWord(...)") && p0.C((Word) nv.p.g(1, sentWords4), "getWord(...)")) {
                                        String strJ19 = p0.j(word44, "getWord(...)", 0, 1, "substring(...)");
                                        int[] iArr19 = bq.r.f4959a;
                                        String strM19 = p0.m(strJ19, "toUpperCase(...)");
                                        String word49 = word44.getWord();
                                        kotlin.jvm.internal.m.e(word49, "getWord(...)");
                                        String strSubstring20 = word49.substring(1);
                                        kotlin.jvm.internal.m.e(strSubstring20, "substring(...)");
                                        word44.setWord(strM19.concat(strSubstring20));
                                    }
                                }
                                obj2 = obj;
                                i33 = i35;
                                str6 = str;
                                arrayList5 = arrayList;
                            } else {
                                arrayList = arrayList5;
                                String strJ20 = p0.j(word44, "getWord(...)", 0, 1, "substring(...)");
                                int[] iArr20 = bq.r.f4959a;
                                String strM20 = p0.m(strJ20, "toUpperCase(...)");
                                String word50 = word44.getWord();
                                kotlin.jvm.internal.m.e(word50, "getWord(...)");
                                String strSubstring21 = word50.substring(1);
                                kotlin.jvm.internal.m.e(strSubstring21, "substring(...)");
                                word44.setWord(strM20.concat(strSubstring21));
                            }
                        }
                        str = str10;
                        obj2 = obj;
                        i33 = i35;
                        str6 = str;
                        arrayList5 = arrayList;
                    }
                    arrayList = arrayList5;
                    str = str10;
                    obj2 = obj;
                    i33 = i35;
                    str6 = str;
                    arrayList5 = arrayList;
                }
                i11 = 1;
                if (i33 != 0) {
                    if (i33 != i11) {
                        if (i33 > 0) {
                            word = sentWords4.get(i33 - 1);
                            if (p0.C(word, "getWord(...)")) {
                                arrayList = arrayList5;
                                if (i33 <= 1) {
                                }
                            } else {
                                arrayList = arrayList5;
                                if (i33 <= 1) {
                                }
                            }
                        } else {
                            arrayList = arrayList5;
                        }
                        str = str10;
                    } else {
                        if (i33 > 0) {
                            word = sentWords4.get(i33 - 1);
                            if (p0.C(word, "getWord(...)")) {
                                arrayList = arrayList5;
                                if (i33 <= 1) {
                                }
                            } else {
                                arrayList = arrayList5;
                                if (i33 <= 1) {
                                }
                            }
                        } else {
                            arrayList = arrayList5;
                        }
                        str = str10;
                    }
                } else if (i33 != i11) {
                    if (i33 > 0) {
                        word = sentWords4.get(i33 - 1);
                        if (p0.C(word, "getWord(...)")) {
                            arrayList = arrayList5;
                            if (i33 <= 1) {
                            }
                        } else {
                            arrayList = arrayList5;
                            if (i33 <= 1) {
                            }
                        }
                    } else {
                        arrayList = arrayList5;
                    }
                    str = str10;
                } else {
                    if (i33 > 0) {
                        word = sentWords4.get(i33 - 1);
                        if (p0.C(word, "getWord(...)")) {
                            arrayList = arrayList5;
                            if (i33 <= 1) {
                            }
                        } else {
                            arrayList = arrayList5;
                            if (i33 <= 1) {
                            }
                        }
                    } else {
                        arrayList = arrayList5;
                    }
                    str = str10;
                }
                obj2 = obj;
                i33 = i35;
                str6 = str;
                arrayList5 = arrayList;
            }
            return arrayList5;
        }
        ArrayList arrayList6 = new ArrayList();
        int size5 = sentence.getSentWords().size();
        int i36 = 0;
        while (i36 < size5) {
            Word word51 = sentence.getSentWords().get(i36);
            i36++;
            Word word52 = i36 < sentence.getSentWords().size() ? sentence.getSentWords().get(i36) : null;
            Word word53 = new Word();
            word53.setWordId(word51.getWordId());
            word53.setWordType(word51.getWordType());
            LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
            int i37 = cf.x.n().keyLanguage;
            if (i37 != 0) {
                if (i37 != 1) {
                    if (i37 != 2) {
                        switch (i37) {
                            case 11:
                                if (cf.x.n().csDisplay != 0) {
                                    word53.setWord(word51.getWord());
                                    arrayList6.add(word53);
                                } else {
                                    word53.setWord(word51.getZhuyin());
                                    arrayList6.add(word53);
                                    if (word52 != null) {
                                        if (word52.getWordType() != 1) {
                                            Word word54 = new Word();
                                            word54.setWordType(1);
                                            word54.setWord(" ");
                                            arrayList6.add(word54);
                                        }
                                    }
                                }
                                break;
                            case 12:
                                break;
                            case 13:
                                break;
                            default:
                                word53.setWord(word51.getWord());
                                arrayList6.add(word53);
                                break;
                        }
                    }
                    if (cf.x.n().koDisPlay == 0) {
                        word53.setWord(word51.getZhuyin());
                        arrayList6.add(word53);
                        if (word52 != null && word52.getWordType() != 1) {
                            Word word55 = new Word();
                            word55.setWord(" ");
                            word55.setWordType(1);
                            arrayList6.add(word55);
                        }
                    } else {
                        word53.setWord(word51.getWord());
                        arrayList6.add(word53);
                    }
                }
                switch (cf.x.n().jsDisPlay) {
                    case 0:
                        word53.setWord(word51.getWord());
                        arrayList6.add(word53);
                        break;
                    case 1:
                        word53.setWord(word51.getZhuyin());
                        arrayList6.add(word53);
                        break;
                    case 2:
                        word53.setWord(word51.getLuoma());
                        arrayList6.add(word53);
                        if (word52 != null && word52.getWordType() != 1) {
                            Word word56 = new Word();
                            word56.setWord(" ");
                            word56.setWordType(1);
                            arrayList6.add(word56);
                        }
                        break;
                    case 3:
                        word53.setWord(word51.getWord());
                        arrayList6.add(word53);
                        break;
                    case 4:
                        word53.setWord(word51.getWord());
                        arrayList6.add(word53);
                        break;
                    case 5:
                        word53.setWord(word51.getZhuyin());
                        arrayList6.add(word53);
                        break;
                    case 6:
                        word53.setWord(word51.getWord());
                        arrayList6.add(word53);
                        break;
                }
            } else if (cf.x.n().csDisplay != 0) {
                word53.setWord(word51.getZhuyin());
                arrayList6.add(word53);
                if (word52 != null) {
                    if (word52.getWordType() != 1) {
                        Word word57 = new Word();
                        word57.setWordType(1);
                        word57.setWord(" ");
                        arrayList6.add(word57);
                    }
                }
            } else {
                word53.setWord(word51.getWord());
                arrayList6.add(word53);
            }
        }
        return arrayList6;
    }

    public static String v(Word word) {
        kotlin.jvm.internal.m.f(word, "word");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = cf.x.n().keyLanguage;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    switch (i11) {
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            String word2 = word.getWord();
                            kotlin.jvm.internal.m.e(word2, "getWord(...)");
                            return word2;
                    }
                }
                if (cf.x.n().csDisplay == 0) {
                    String zhuyin = word.getZhuyin();
                    kotlin.jvm.internal.m.c(zhuyin);
                    return zhuyin;
                }
                String word3 = word.getWord();
                kotlin.jvm.internal.m.c(word3);
                return word3;
            }
            switch (cf.x.n().jsDisPlay) {
                case 0:
                    String word4 = word.getWord();
                    kotlin.jvm.internal.m.e(word4, "getWord(...)");
                    return word4;
                case 1:
                    String zhuyin2 = word.getZhuyin();
                    kotlin.jvm.internal.m.e(zhuyin2, "getZhuyin(...)");
                    return zhuyin2;
                case 2:
                    String luoma = word.getLuoma();
                    kotlin.jvm.internal.m.e(luoma, "getLuoma(...)");
                    return luoma;
                case 3:
                    String word5 = word.getWord();
                    kotlin.jvm.internal.m.e(word5, "getWord(...)");
                    return word5;
                case 4:
                    String word6 = word.getWord();
                    kotlin.jvm.internal.m.e(word6, "getWord(...)");
                    return word6;
                case 5:
                    String zhuyin3 = word.getZhuyin();
                    kotlin.jvm.internal.m.e(zhuyin3, "getZhuyin(...)");
                    return zhuyin3;
                case 6:
                    String word7 = word.getWord();
                    kotlin.jvm.internal.m.e(word7, "getWord(...)");
                    return word7;
                default:
                    String word8 = word.getWord();
                    kotlin.jvm.internal.m.e(word8, "getWord(...)");
                    return word8;
            }
        }
        if (cf.x.n().csDisplay == 0) {
            String zhuyin4 = word.getZhuyin();
            kotlin.jvm.internal.m.c(zhuyin4);
            return zhuyin4;
        }
        String word9 = word.getWord();
        kotlin.jvm.internal.m.c(word9);
        return word9;
    }

    public static ImageHeaderParser$ImageType w(List list, InputStream inputStream, m0.n nVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new ce.a0(inputStream, nVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeE = ((td.f) list.get(i11)).e(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeE != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeE;
                }
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType x(List list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = ((td.f) list.get(i11)).a(byteBuffer);
                AtomicReference atomicReference = pe.b.f46813a;
                if (imageHeaderParser$ImageTypeA != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeA;
                }
            } catch (Throwable th2) {
                AtomicReference atomicReference2 = pe.b.f46813a;
                throw th2;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static final float y(long j11) {
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final float z(long j11) {
        return Float.intBitsToFloat((int) (j11 & 4294967295L));
    }

    public abstract Typeface h(Context context, q4.d dVar, Resources resources, int i11);

    public abstract Typeface i(Context context, w4.h[] hVarArr, int i11);

    public Typeface j(Context context, List list, int i11) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface k(Context context, InputStream inputStream) {
        File fileI = hz.b.I(context);
        if (fileI == null) {
            return null;
        }
        try {
            if (hz.b.r(fileI, inputStream)) {
                return Typeface.createFromFile(fileI.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileI.delete();
        }
    }

    public Typeface l(Context context, Resources resources, int i11, String str, int i12) {
        File fileI = hz.b.I(context);
        if (fileI == null) {
            return null;
        }
        try {
            if (hz.b.q(fileI, resources, i11)) {
                return Typeface.createFromFile(fileI.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileI.delete();
        }
    }

    public w4.h q(w4.h[] hVarArr, int i11) {
        new p20.c(28);
        int i12 = (i11 & 1) == 0 ? 400 : LogSeverity.ALERT_VALUE;
        boolean z11 = (i11 & 2) != 0;
        w4.h hVar = null;
        int i13 = Integer.MAX_VALUE;
        for (w4.h hVar2 : hVarArr) {
            int iAbs = (Math.abs(hVar2.f54647c - i12) * 2) + (hVar2.f54648d == z11 ? 0 : 1);
            if (hVar == null || i13 > iAbs) {
                hVar = hVar2;
                i13 = iAbs;
            }
        }
        return hVar;
    }
}
