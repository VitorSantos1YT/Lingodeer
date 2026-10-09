package hz;

import a5.e;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.view.View;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bt.x2;
import cf.x;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.bumptech.glide.d;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.speak.object.CNPodSentence;
import com.lingo.lingoskill.deskill.ui.speak.object.DEPodSentence;
import com.lingo.lingoskill.espanskill.ui.speak.object.ESPodSentence;
import com.lingo.lingoskill.franchskill.ui.speak.object.FRPodSentence;
import com.lingo.lingoskill.itskill.ui.speak.object.ITPodSentence;
import com.lingo.lingoskill.japanskill.ui.speak.object.JPPodSentence;
import com.lingo.lingoskill.koreanskill.ui.speak.object.KOPodSentence;
import com.lingo.lingoskill.ptskill.ui.speak.object.PTPodSentence;
import com.lingo.lingoskill.ruskill.ui.speak.object.RUPodSentence;
import com.lingo.lingoskill.speak.object.PodTrans;
import com.lingo.notification.UnifiedNotificationJobService;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fz.c;
import hh.p0;
import j9.c0;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import jt.i2;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.n;
import l1.t;
import l1.x1;
import lz.g;
import ns.o;
import ob.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pb.j;
import qy.b0;
import qy.q;
import ry.l;
import ry.r;
import ry.w;
import rz.e0;
import se.i;
import w9.s;
import w9.v;
import x1.p;
import y.h;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static List A(int i11) {
        String strJ;
        if (LingoSkillApplication.f21670t) {
            String esDataDir = x.n().esDataDir;
            m.e(esDataDir, "esDataDir");
            strJ = K(esDataDir, "es_story_lesson.z");
        } else {
            strJ = J("es_story_lesson.z");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(strJ);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            JSONArray jSONArray = jSONObject.getJSONArray(sb2.toString());
            m.c(jSONArray);
            return (List) M(jSONArray, new TypeToken<List<? extends ESPodSentence>>() { // from class: com.lingo.lingoskill.speak.helper.SpeakMaterialHelper$getESSentences$1
            });
        } catch (JSONException e8) {
            e8.getMessage();
            e8.printStackTrace();
            return arrayList;
        }
    }

    public static List B(int i11) {
        String strJ;
        if (LingoSkillApplication.f21670t) {
            String frDataDir = x.n().frDataDir;
            m.e(frDataDir, "frDataDir");
            strJ = K(frDataDir, "fr_story_lesson.z");
        } else {
            strJ = J("fr_story_lesson.z");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(strJ);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            JSONArray jSONArray = jSONObject.getJSONArray(sb2.toString());
            m.c(jSONArray);
            return (List) M(jSONArray, new TypeToken<List<? extends FRPodSentence>>() { // from class: com.lingo.lingoskill.speak.helper.SpeakMaterialHelper$getFRSentences$1
            });
        } catch (JSONException e8) {
            e8.getMessage();
            e8.printStackTrace();
            return arrayList;
        }
    }

    public static List C(int i11) {
        String strK = LingoSkillApplication.f21670t ? K(xt.b.a().e(), "it_story_lesson.z") : J("it_story_lesson.z");
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(strK);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            JSONArray jSONArray = jSONObject.getJSONArray(sb2.toString());
            m.c(jSONArray);
            return (List) M(jSONArray, new TypeToken<List<? extends ITPodSentence>>() { // from class: com.lingo.lingoskill.speak.helper.SpeakMaterialHelper$getITSentences$1
            });
        } catch (JSONException e8) {
            e8.getMessage();
            e8.printStackTrace();
            return arrayList;
        }
    }

    public static List D(int i11) {
        String strJ;
        if (!LingoSkillApplication.f21670t) {
            strJ = x.n().keyLanguage == 1 ? J("jp_story_lesson.z") : J("jpup_story_lesson.z");
        } else if (x.n().keyLanguage == 1) {
            String jsDataDir = x.n().jsDataDir;
            m.e(jsDataDir, "jsDataDir");
            strJ = K(jsDataDir, "jp_story_lesson.z");
        } else {
            String jpupDataDir = x.n().jpupDataDir;
            m.e(jpupDataDir, "jpupDataDir");
            strJ = K(jpupDataDir, "jpup_story_lesson.z");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(strJ);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            JSONArray jSONArray = jSONObject.getJSONArray(sb2.toString());
            Objects.toString(jSONArray);
            m.c(jSONArray);
            return (List) M(jSONArray, new TypeToken<List<? extends JPPodSentence>>() { // from class: com.lingo.lingoskill.speak.helper.SpeakMaterialHelper$getJPSentences$1
            });
        } catch (JSONException e8) {
            e8.getMessage();
            e8.printStackTrace();
            return arrayList;
        }
    }

    public static List E(int i11) {
        String strJ;
        if (!LingoSkillApplication.f21670t) {
            strJ = x.n().keyLanguage == 2 ? J("ko_story_lesson.z") : J("krup_story_lesson.z");
        } else if (x.n().keyLanguage == 2) {
            String koDataDir = x.n().koDataDir;
            m.e(koDataDir, "koDataDir");
            strJ = K(koDataDir, "ko_story_lesson.z");
        } else {
            String krupDataDir = x.n().krupDataDir;
            m.e(krupDataDir, "krupDataDir");
            strJ = K(krupDataDir, "krup_story_lesson.z");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(strJ);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            JSONArray jSONArray = jSONObject.getJSONArray(sb2.toString());
            m.c(jSONArray);
            return (List) M(jSONArray, new TypeToken<List<? extends KOPodSentence>>() { // from class: com.lingo.lingoskill.speak.helper.SpeakMaterialHelper$getKOSentences$1
            });
        } catch (JSONException e8) {
            e8.getMessage();
            e8.printStackTrace();
            return arrayList;
        }
    }

    public static List F(int i11) {
        String strJ;
        if (LingoSkillApplication.f21670t) {
            String ptDataDir = x.n().ptDataDir;
            m.e(ptDataDir, "ptDataDir");
            strJ = K(ptDataDir, "pt_story_lesson.z");
        } else {
            strJ = J("pt_story_lesson.z");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(strJ);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            JSONArray jSONArray = jSONObject.getJSONArray(sb2.toString());
            m.c(jSONArray);
            return (List) M(jSONArray, new TypeToken<List<? extends PTPodSentence>>() { // from class: com.lingo.lingoskill.speak.helper.SpeakMaterialHelper$getPTSentences$1
            });
        } catch (JSONException e8) {
            e8.getMessage();
            e8.printStackTrace();
            return arrayList;
        }
    }

    public static Object G(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return e.d(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static List H(int i11) {
        String strK = LingoSkillApplication.f21670t ? K(xt.b.a().e(), "ru_story_lesson.z") : J("ru_story_lesson.z");
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(strK);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            JSONArray jSONArray = jSONObject.getJSONArray(sb2.toString());
            m.c(jSONArray);
            return (List) M(jSONArray, new TypeToken<List<? extends RUPodSentence>>() { // from class: com.lingo.lingoskill.speak.helper.SpeakMaterialHelper$getRUSentences$1
            });
        } catch (JSONException e8) {
            e8.getMessage();
            e8.printStackTrace();
            return arrayList;
        }
    }

    public static String J(String str) {
        try {
            q qVar = fv.b.f28186a;
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(fv.b.m(), str)));
            byte[] bArr = new byte[bufferedInputStream.available()];
            bufferedInputStream.read(bArr);
            bufferedInputStream.close();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            u(byteArrayInputStream, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            m.c(byteArray);
            Charset charsetForName = Charset.forName(Constants.ENCODING);
            m.e(charsetForName, "forName(...)");
            String strM = d.m(new String(byteArray, charsetForName));
            m.e(strM, "decryptDES(...)");
            byteArrayInputStream.close();
            byteArrayOutputStream.close();
            return strM;
        } catch (IOException e8) {
            e8.printStackTrace();
            return BuildConfig.VERSION_NAME;
        }
    }

    public static String K(String str, String str2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str + str2);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            Charset charsetForName = Charset.forName(Constants.ENCODING);
            m.e(charsetForName, "forName(...)");
            return new String(bArr, charsetForName);
        } catch (IOException e8) {
            e8.printStackTrace();
            return BuildConfig.VERSION_NAME;
        }
    }

    public static MappedByteBuffer L(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static Object M(JSONArray jSONArray, TypeToken typeToken) {
        try {
            return new GsonBuilder().registerTypeAdapter(PodTrans.class, new ko.a()).create().fromJson(jSONArray.toString(), typeToken.getType());
        } catch (JsonSyntaxException e8) {
            e8.getMessage();
            String message = e8.getMessage();
            if (message != null && oz.q.v0(message, "trans", false)) {
                String string = jSONArray.toString();
                m.e(string, "toString(...)");
                oz.q.g1(500, string);
            }
            return new ArrayList();
        }
    }

    public static int N(g gVar) {
        jz.d dVar = jz.e.f37397a;
        m.f(gVar, "<this>");
        try {
            return i.y(gVar);
        } catch (IllegalArgumentException e8) {
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    public static final String O(Context context, String str) {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            m.e(inputStreamOpen, "open(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, oz.a.f46133a), OSSConstants.DEFAULT_BUFFER_SIZE);
            try {
                String strI = f.I(bufferedReader);
                bufferedReader.close();
                return strI;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    o.m(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static int P(double d5) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d5 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d5 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d5);
    }

    public static int Q(float f5) {
        if (Float.isNaN(f5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f5);
    }

    public static long R(double d5) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d5);
    }

    public static lz.e S(int i11, g gVar) {
        m.f(gVar, "<this>");
        boolean z11 = i11 > 0;
        Integer numValueOf = Integer.valueOf(i11);
        if (!z11) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i12 = gVar.f40532a;
        int i13 = gVar.f40533b;
        if (gVar.f40534c <= 0) {
            i11 = -i11;
        }
        return new lz.e(i12, i13, i11);
    }

    public static final boolean T(Throwable th2, fz.a aVar) throws IllegalAccessException, InvocationTargetException {
        List listA;
        Object objInvoke;
        m.f(th2, "<this>");
        Integer num = az.a.f3410a;
        DiagnosticComposeException diagnosticComposeException = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th2.getSuppressed();
            m.e(suppressed, "getSuppressed(...)");
            listA = l.A(suppressed);
        } else {
            Method method = zy.a.f59643b;
            listA = (method == null || (objInvoke = method.invoke(th2, null)) == null) ? r.f50854a : l.A((Throwable[]) objInvoke);
        }
        int size = listA.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            if (((Throwable) listA.get(i11)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            y1.a aVar2 = (y1.a) aVar.invoke();
            if (aVar2 != null && !aVar2.f56811a.isEmpty()) {
                z11 = true;
            }
            if (z11) {
                m.c(aVar2);
                diagnosticComposeException = new DiagnosticComposeException(aVar2);
            }
        } catch (Throwable th3) {
            diagnosticComposeException = th3;
        }
        if (diagnosticComposeException != null) {
            x.b(th2, diagnosticComposeException);
        }
        return z11;
    }

    public static g U(int i11, int i12) {
        if (i12 > Integer.MIN_VALUE) {
            return new g(i11, i12 - 1, 1);
        }
        g gVar = g.f40539d;
        return g.f40539d;
    }

    public static final Object V(s sVar, c cVar, xy.c cVar2) {
        return W(sVar, new ca.f(1, cVar, null, sVar), cVar2);
    }

    public static final Object W(s sVar, c cVar, xy.c cVar2) {
        ca.d dVar = new ca.d(cVar, null);
        v vVar = (v) cVar2.getContext().get(v.f54871c);
        vy.f fVar = vVar != null ? vVar.f54872a : null;
        if (fVar != null) {
            return e0.M(fVar, dVar, cVar2);
        }
        vy.i context = cVar2.getContext();
        rz.m mVar = new rz.m(1, ue.f.x(cVar2));
        mVar.s();
        try {
            j jVar = sVar.f54853d;
            if (jVar == null) {
                m.n("internalTransactionExecutor");
                throw null;
            }
            jVar.execute(new mw.a(context, mVar, sVar, dVar, 5, false));
            Object objR = mVar.r();
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            return objR;
        } catch (RejectedExecutionException e8) {
            mVar.k(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e8));
        }
    }

    public static final void a(j9.v vVar, String str, fz.a onNavigateBack, js.i iVar, n nVar, int i11) {
        j9.v vVarH;
        String str2;
        js.i iVar2;
        int i12;
        String str3;
        m.f(onNavigateBack, "onNavigateBack");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-679404968);
        int i13 = ((i11 & 6) == 0 ? i11 | 2 : i11) | 48;
        if ((i11 & 384) == 0) {
            i13 |= sVar.h(onNavigateBack) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= 1024;
        }
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                vVarH = x.H(new c0[0], sVar);
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(js.i.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                iVar2 = (js.i) viewModelA;
                i12 = i13 & (-7183);
                str3 = "chinese_tone_index";
            } else {
                sVar.W();
                i12 = i13 & (-7183);
                vVarH = vVar;
                iVar2 = iVar;
                str3 = str;
            }
            sVar.q();
            boolean zH = sVar.h(iVar2) | sVar.h(vVarH) | ((i12 & 896) == 256);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new aj.c(iVar2, vVarH, onNavigateBack, 19);
                sVar.o0(objQ);
            }
            com.bumptech.glide.e.c(vVarH, str3, null, null, null, null, null, null, (c) objQ, sVar, i12 & 126);
            str2 = str3;
        } else {
            sVar.W();
            vVarH = vVar;
            str2 = str;
            iVar2 = iVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(vVarH, str2, onNavigateBack, iVar2, i11, 0);
        }
    }

    public static final void b(fz.a onNavigateBack, n nVar, int i11) {
        fz.a aVar;
        m.f(onNavigateBack, "onNavigateBack");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1391753460);
        int i12 = (sVar.h(onNavigateBack) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            aVar = onNavigateBack;
            a(null, null, aVar, null, sVar, (i12 << 6) & 896);
        } else {
            aVar = onNavigateBack;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.o(i11, 9, aVar);
        }
    }

    public static final void c(p displayWords, b1 optionItemState, HashMap displayWordLayoutCoordinates, i2 i2Var, c onResortStems, boolean z11, n nVar, int i11) {
        int i12;
        Object xVar;
        int i13;
        Object obj;
        i2 dragState = i2Var;
        m.f(displayWords, "displayWords");
        m.f(optionItemState, "optionItemState");
        m.f(displayWordLayoutCoordinates, "displayWordLayoutCoordinates");
        m.f(dragState, "dragState");
        m.f(onResortStems, "onResortStems");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1522639636);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(displayWords) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(optionItemState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(displayWordLayoutCoordinates) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(dragState) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(onResortStems) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.g(z11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if (sVar.T(i12 & 1, (74899 & i12) != 74898)) {
            Object value = dragState.f36978c.getValue();
            int i14 = i12 & 7168;
            int i15 = i12 & 57344;
            int i16 = i12 & 14;
            boolean zH = (i14 == 2048) | (i15 == 16384) | (i16 == 4) | sVar.h(displayWordLayoutCoordinates);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                i13 = i14;
                xVar = new ad.x(dragState, onResortStems, displayWords, displayWordLayoutCoordinates, null, 11);
                sVar.o0(xVar);
            } else {
                xVar = objQ;
                i13 = i14;
            }
            t.f((fz.e) xVar, value, sVar);
            Object value2 = optionItemState.getValue();
            Object value3 = dragState.f36977b.getValue();
            int i17 = i12 & 458752;
            boolean z12 = ((i12 & 112) == 32) | (i17 == 131072) | (i16 == 4) | (i13 == 2048) | (i15 == 16384);
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                obj = value3;
                x2 x2Var = new x2(4, optionItemState, displayWords, i2Var, onResortStems, (vy.d) null, z11);
                dragState = i2Var;
                sVar.o0(x2Var);
                objQ2 = x2Var;
            } else {
                obj = value3;
            }
            t.g(value2, obj, (fz.e) objQ2, sVar);
            Object value4 = dragState.f36976a.getValue();
            boolean zH2 = (i13 == 2048) | (i17 == 131072) | (i16 == 4) | sVar.h(displayWordLayoutCoordinates);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == gVar) {
                bt.n nVar2 = new bt.n(dragState, z11, displayWords, displayWordLayoutCoordinates, (vy.d) null);
                sVar.o0(nVar2);
                objQ3 = nVar2;
            }
            t.f((fz.e) objQ3, value4, sVar);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new jt.b(displayWords, optionItemState, displayWordLayoutCoordinates, i2Var, onResortStems, z11, i11);
        }
    }

    public static final q6.m d(int i11, float f5, q6.b rounding, List list) {
        m.f(rounding, "rounding");
        float[] fArr = new float[i11 * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long jK = gb.r.K(q6.n.e(f5, (q6.n.f47509b / i11) * 2 * i13), h.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));
            int i14 = i12 + 1;
            fArr[i12] = gb.r.y(jK);
            i12 += 2;
            fArr[i14] = gb.r.z(jK);
        }
        return e(fArr, rounding, list, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final q6.m e(float[] fArr, q6.b rounding, List list, float f5, float f11) {
        float f12;
        long jA;
        ArrayList arrayList;
        List listK;
        q6.c cVarB;
        qy.l lVar;
        q6.b bVar;
        Float fValueOf = Float.valueOf(1.0f);
        m.f(rounding, "rounding");
        if (fArr.length < 6) {
            throw new IllegalArgumentException("Polygons must have at least 3 vertices");
        }
        int i11 = 2;
        int i12 = 1;
        if (fArr.length % 2 == 1) {
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        if (list != null && list.size() * 2 != fArr.length) {
            throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
        }
        ArrayList arrayList2 = new ArrayList();
        int length = fArr.length / 2;
        ArrayList arrayList3 = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (i14 < length) {
            q6.b bVar2 = (list == null || (bVar = (q6.b) list.get(i14)) == null) ? rounding : bVar;
            int i15 = (((i14 + length) - 1) % length) * 2;
            int i16 = i14 + 1;
            int i17 = (i16 % length) * 2;
            int i18 = i14 * 2;
            arrayList3.add(new q6.l(h.a(fArr[i15], fArr[i15 + 1]), h.a(fArr[i18], fArr[i18 + 1]), h.a(fArr[i17], fArr[i17 + 1]), bVar2));
            i14 = i16;
        }
        g gVarU = U(0, length);
        ArrayList arrayList4 = new ArrayList(ry.n.W(gVarU, 10));
        Iterator it = gVarU.iterator();
        while (true) {
            boolean z11 = ((lz.f) it).f40537c;
            f12 = CropImageView.DEFAULT_ASPECT_RATIO;
            if (!z11) {
                break;
            }
            int iNextInt = ((w) it).nextInt();
            int i19 = (iNextInt + 1) % length;
            float f13 = ((q6.l) arrayList3.get(iNextInt)).f47502h + ((q6.l) arrayList3.get(i19)).f47502h;
            float fC = ((q6.l) arrayList3.get(i19)).c() + ((q6.l) arrayList3.get(iNextInt)).c();
            int i21 = iNextInt * 2;
            float f14 = fArr[i21];
            float f15 = fArr[i21 + 1];
            int i22 = i19 * 2;
            float f16 = f14 - fArr[i22];
            float f17 = f15 - fArr[i22 + 1];
            float f18 = q6.n.f47509b;
            float fSqrt = (float) Math.sqrt((f17 * f17) + (f16 * f16));
            if (f13 > fSqrt) {
                lVar = new qy.l(Float.valueOf(fSqrt / f13), Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO));
            } else {
                lVar = fC > fSqrt ? new qy.l(fValueOf, Float.valueOf((fSqrt - f13) / (fC - f13))) : new qy.l(fValueOf, fValueOf);
            }
            arrayList4.add(lVar);
        }
        int i23 = 0;
        while (i23 < length) {
            float[] fArr2 = new float[i11];
            int i24 = i13;
            int i25 = i24;
            while (i24 < i11) {
                int i26 = i13;
                qy.l lVar2 = (qy.l) arrayList4.get((((i23 + length) - 1) + i24) % length);
                float f19 = f12;
                int i27 = i11;
                float fA = p0.a(((q6.l) arrayList3.get(i23)).c(), ((q6.l) arrayList3.get(i23)).f47502h, ((Number) lVar2.f48496b).floatValue(), ((q6.l) arrayList3.get(i23)).f47502h * ((Number) lVar2.f48495a).floatValue());
                int i28 = i25 + 1;
                if (fArr2.length < i28) {
                    float[] fArrCopyOf = Arrays.copyOf(fArr2, Math.max(i28, (fArr2.length * 3) / 2));
                    m.e(fArrCopyOf, "copyOf(...)");
                    fArr2 = fArrCopyOf;
                }
                fArr2[i25] = fA;
                i24++;
                f12 = f19;
                i25 = i28;
                i13 = i26;
                i11 = i27;
            }
            int i29 = i11;
            int i30 = i13;
            float f21 = f12;
            q6.l lVar3 = (q6.l) arrayList3.get(i23);
            if (i25 <= 0) {
                z.a.d("Index must be between 0 and size");
                throw null;
            }
            float f22 = fArr2[i30];
            if (i12 >= i25) {
                z.a.d("Index must be between 0 and size");
                throw null;
            }
            float f23 = fArr2[i12];
            long j11 = lVar3.f47499e;
            long j12 = lVar3.f47498d;
            int i31 = i12;
            float f24 = lVar3.f47500f;
            ArrayList arrayList5 = arrayList2;
            long j13 = lVar3.f47496b;
            float fMin = Math.min(f22, f23);
            int i32 = i23;
            float f25 = lVar3.f47502h;
            if (f25 < 1.0E-4f || fMin < 1.0E-4f || f24 < 1.0E-4f) {
                arrayList = arrayList3;
                lVar3.f47503i = j13;
                float fY = gb.r.y(j13);
                float fZ = gb.r.z(j13);
                float fY2 = gb.r.y(j13);
                float fZ2 = gb.r.z(j13);
                listK = o.K(ew.a.b(fY, fZ, q6.n.c(fY, fY2, 0.33333334f), q6.n.c(fZ, fZ2, 0.33333334f), q6.n.c(fY, fY2, 0.6666667f), q6.n.c(fZ, fZ2, 0.6666667f), fY2, fZ2));
            } else {
                float fMin2 = Math.min(fMin, f25);
                float fA2 = lVar3.a(f22);
                float fA3 = lVar3.a(f23);
                float f26 = (f24 * fMin2) / f25;
                float f27 = q6.n.f47509b;
                arrayList = arrayList3;
                lVar3.f47503i = gb.r.K(j13, gb.r.T(gb.r.s(gb.r.o(gb.r.K(j12, j11), 2.0f)), (float) Math.sqrt((fMin2 * fMin2) + (f26 * f26))));
                long jK = gb.r.K(j13, gb.r.T(j12, fMin2));
                long jK2 = gb.r.K(j13, gb.r.T(j11, fMin2));
                q6.c cVarB2 = q6.l.b(fMin2, fA2, lVar3.f47496b, lVar3.f47495a, jK, jK2, lVar3.f47503i, f26);
                q6.c cVarB3 = q6.l.b(fMin2, fA3, lVar3.f47496b, lVar3.f47497c, jK2, jK, lVar3.f47503i, f26);
                float fA4 = cVarB3.a();
                float fB = cVarB3.b();
                float[] fArr3 = cVarB3.f47478a;
                q6.c cVarB4 = ew.a.b(fA4, fB, fArr3[4], fArr3[5], fArr3[i29], fArr3[3], fArr3[i30], fArr3[i31]);
                float fY3 = gb.r.y(lVar3.f47503i);
                float fZ3 = gb.r.z(lVar3.f47503i);
                float fA5 = cVarB2.a();
                float fB2 = cVarB2.b();
                float[] fArr4 = cVarB4.f47478a;
                float f28 = fArr4[i30];
                float f29 = fArr4[i31];
                float f30 = fA5 - fY3;
                float f31 = fB2 - fZ3;
                long jB = q6.n.b(f30, f31);
                float f32 = f28 - fY3;
                float f33 = f29 - fZ3;
                long jB2 = q6.n.b(f32, f33);
                long jA2 = h.a(-gb.r.z(jB), gb.r.y(jB));
                long jA3 = h.a(-gb.r.z(jB2), gb.r.y(jB2));
                int i33 = (gb.r.z(jA2) * f33) + (gb.r.y(jA2) * f32) >= f21 ? i31 : i30;
                float fP = gb.r.p(jB, jB2);
                if (fP > 0.999f) {
                    cVarB = ew.a.b(fA5, fB2, q6.n.c(fA5, f28, 0.33333334f), q6.n.c(fB2, f29, 0.33333334f), q6.n.c(fA5, f28, 0.6666667f), q6.n.c(fB2, f29, 0.6666667f), f28, f29);
                } else {
                    float fSqrt2 = (((float) Math.sqrt((f31 * f31) + (f30 * f30))) * 4.0f) / 3.0f;
                    float f34 = i31;
                    float f35 = f34 - fP;
                    float fSqrt3 = (((((float) Math.sqrt(i29 * f35)) - ((float) Math.sqrt(f34 - (fP * fP)))) * fSqrt2) / f35) * (i33 != 0 ? 1.0f : -1.0f);
                    cVarB = ew.a.b(fA5, fB2, (gb.r.y(jA2) * fSqrt3) + fA5, (gb.r.z(jA2) * fSqrt3) + fB2, f28 - (gb.r.y(jA3) * fSqrt3), f29 - (gb.r.z(jA3) * fSqrt3), f28, f29);
                }
                listK = o.L(cVarB2, cVarB, cVarB4);
            }
            arrayList5.add(listK);
            i23 = i32 + 1;
            f12 = f21;
            arrayList2 = arrayList5;
            arrayList4 = arrayList4;
            i13 = i30;
            arrayList3 = arrayList;
            i11 = 2;
            i12 = 1;
        }
        ArrayList arrayList6 = arrayList2;
        ArrayList arrayList7 = arrayList3;
        int i34 = i13;
        float f36 = f12;
        ArrayList arrayList8 = new ArrayList();
        int i35 = i34;
        while (i35 < length) {
            int i36 = i35 + 1;
            int i37 = i36 % length;
            int i38 = i35 * 2;
            long jA4 = h.a(fArr[i38], fArr[i38 + 1]);
            int i39 = (((i35 + length) - 1) % length) * 2;
            long jA5 = h.a(fArr[i39], fArr[i39 + 1]);
            int i40 = i37 * 2;
            long jA6 = h.a(fArr[i40], fArr[i40 + 1]);
            long J = gb.r.J(jA4, jA5);
            long J2 = gb.r.J(jA6, jA4);
            ArrayList arrayList9 = arrayList7;
            arrayList8.add(new q6.e((List) arrayList6.get(i35), jA4, ((q6.l) arrayList9.get(i35)).f47503i, (gb.r.z(J2) * gb.r.y(J)) - (gb.r.y(J2) * gb.r.z(J)) > f36 ? 1 : i34));
            float fA6 = ((q6.c) ry.m.z0((List) arrayList6.get(i35))).a();
            float fB3 = ((q6.c) ry.m.z0((List) arrayList6.get(i35))).b();
            float f37 = ((q6.c) ry.m.q0((List) arrayList6.get(i37))).f47478a[i34];
            float f38 = ((q6.c) ry.m.q0((List) arrayList6.get(i37))).f47478a[1];
            arrayList8.add(new q6.f(o.K(ew.a.b(fA6, fB3, q6.n.c(fA6, f37, 0.33333334f), q6.n.c(fB3, f38, 0.33333334f), q6.n.c(fA6, f37, 0.6666667f), q6.n.c(fB3, f38, 0.6666667f), f37, f38))));
            arrayList7 = arrayList9;
            i35 = i36;
        }
        if (f5 == Float.MIN_VALUE || f11 == Float.MIN_VALUE) {
            float f39 = f36;
            float f40 = f39;
            int i41 = i34;
            while (i41 < fArr.length) {
                int i42 = i41 + 1;
                f40 += fArr[i41];
                i41 += 2;
                f39 += fArr[i42];
            }
            float f41 = 2;
            jA = h.a((f40 / fArr.length) / f41, (f39 / fArr.length) / f41);
        } else {
            jA = h.a(f5, f11);
        }
        return new q6.m(arrayList8, Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
    }

    /* JADX WARN: Failed to calculate best type for var: r0v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v14 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v22 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v10 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v9 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r22v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 ??, new type: w2.x
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v0 ??, new type: w2.x
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v28 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v15 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v20 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v24 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v34 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v45 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v45 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v18 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v25 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v28 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v25 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v26 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v7 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r22v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 ??, new type: w2.x
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r23v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v0 ??, new type: w2.x
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v2 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final jt.g2 f(long r19, w2.x r21, w2.x r22, w2.x r23, int r24, v3.m r25) {
        /*
            Method dump skipped, instruction units count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hz.b.f(long, w2.x, w2.x, w2.x, int, v3.m):jt.g2");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0063->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0083 -> B:25:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0086 -> B:25:0x0063). Please report as a decompilation issue!!! */
    public static final Object g(List list, n5.i iVar, xy.c cVar) throws Throwable {
        n5.e eVar;
        List list2;
        y yVar;
        Iterator it;
        Throwable th2;
        c cVar2;
        if (cVar instanceof n5.e) {
            eVar = (n5.e) cVar;
            int i11 = eVar.f43269d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f43269d = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new n5.e(cVar);
            }
        } else {
            eVar = new n5.e(cVar);
        }
        Object obj = eVar.f43268c;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = eVar.f43269d;
        if (i12 != 0) {
            if (i12 == 1) {
                list2 = (List) eVar.f43266a;
                com.bumptech.glide.e.F(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = eVar.f43267b;
                yVar = (y) eVar.f43266a;
                try {
                    com.bumptech.glide.e.F(obj);
                } catch (Throwable th3) {
                    Object obj3 = yVar.f38361a;
                    if (obj3 == null) {
                        yVar.f38361a = th3;
                    } else {
                        x.b((Throwable) obj3, th3);
                    }
                }
            }
            while (it.hasNext()) {
                cVar2 = (c) it.next();
                eVar.f43266a = yVar;
                eVar.f43267b = it;
                eVar.f43269d = 2;
                if (cVar2.invoke(eVar) == obj2) {
                    return obj2;
                }
            }
            th2 = (Throwable) yVar.f38361a;
            if (th2 == null) {
                return b0.f48488a;
            }
            throw th2;
        }
        ArrayList arrayListO = ep.a.o(obj);
        b0.g gVar = new b0.g(list, arrayListO, null);
        eVar.f43266a = arrayListO;
        eVar.f43269d = 1;
        if (iVar.a(gVar, eVar) == obj2) {
            return obj2;
        }
        list2 = arrayListO;
        yVar = new y();
        it = list2.iterator();
        while (it.hasNext()) {
            cVar2 = (c) it.next();
            eVar.f43266a = yVar;
            eVar.f43267b = it;
            eVar.f43269d = 2;
            if (cVar2.invoke(eVar) == obj2) {
                return obj2;
            }
        }
        th2 = (Throwable) yVar.f38361a;
        if (th2 == null) {
            return b0.f48488a;
        }
        throw th2;
    }

    public static final void h(AutoCloseable autoCloseable, Throwable th2) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th2 != null) {
                try {
                    nv.p.C(autoCloseable);
                    return;
                } catch (Throwable th3) {
                    x.b(th2, th3);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) autoCloseable).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z11 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z11) {
                        executorService.shutdownNow();
                        z11 = true;
                    }
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static double j(double d5, double d11, double d12) {
        if (d11 <= d12) {
            if (d5 < d11) {
                return d11;
            }
            return d5 > d12 ? d12 : d5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float k(float f5, float f11, float f12) {
        if (f11 <= f12) {
            if (f5 < f11) {
                return f11;
            }
            return f5 > f12 ? f12 : f5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int l(int i11, int i12, int i13) {
        if (i12 <= i13) {
            if (i11 < i12) {
                return i12;
            }
            return i11 > i13 ? i13 : i11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i13 + " is less than minimum " + i12 + '.');
    }

    public static int m(int i11, g gVar) {
        int i12 = gVar.f40533b;
        int i13 = gVar.f40532a;
        if (!gVar.isEmpty()) {
            if (i11 < Integer.valueOf(i13).intValue()) {
                return Integer.valueOf(i13).intValue();
            }
            return i11 > Integer.valueOf(i12).intValue() ? Integer.valueOf(i12).intValue() : i11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
    }

    public static long n(long j11, long j12, long j13) {
        if (j12 <= j13) {
            if (j11 < j12) {
                return j12;
            }
            return j11 > j13 ? j13 : j11;
        }
        StringBuilder sbJ = w4.c.j(j13, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbJ.append(j12);
        sbJ.append('.');
        throw new IllegalArgumentException(sbJ.toString());
    }

    public static Comparable o(Comparable comparable, lz.d dVar) {
        float f5 = dVar.f40531b;
        float f11 = dVar.f40530a;
        if (dVar.c()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + dVar + '.');
        }
        if (!lz.d.d(comparable, Float.valueOf(f11)) || lz.d.d(Float.valueOf(f11), comparable)) {
            return (!lz.d.d(Float.valueOf(f5), comparable) || lz.d.d(comparable, Float.valueOf(f5))) ? comparable : Float.valueOf(f5);
        }
        return Float.valueOf(f11);
    }

    public static void p(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(key);
            if (jSONObjectOptJSONObject != null) {
                String k11 = jSONObjectOptJSONObject.optString("k");
                String v11 = jSONObjectOptJSONObject.optString("v");
                m.e(k11, "k");
                if (k11.length() != 0) {
                    CopyOnWriteArraySet copyOnWriteArraySetA = te.c.a();
                    m.e(key, "key");
                    List listW0 = oz.q.W0(k11, new String[]{","}, 0, 6);
                    m.e(v11, "v");
                    copyOnWriteArraySetA.add(new te.c(listW0, key, v11));
                }
            }
        }
    }

    public static boolean q(File file, Resources resources, int i11) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i11);
            try {
                boolean zR = r(file, inputStreamOpenRawResource);
                i(inputStreamOpenRawResource);
                return zR;
            } catch (Throwable th2) {
                th = th2;
                i(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean r(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i11 = inputStream.read(bArr);
                        if (i11 == -1) {
                            i(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i11);
                    }
                } catch (IOException e8) {
                    e = e8;
                    fileOutputStream = fileOutputStream2;
                    e.getMessage();
                    i(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    i(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static er.a s(UnifiedNotificationJobService unifiedNotificationJobService, int i11) {
        String[] strArr = {unifiedNotificationJobService.getString(R.string.smart_review_reminder_notification_1), unifiedNotificationJobService.getString(R.string.smart_review_reminder_notification_2), unifiedNotificationJobService.getString(R.string.smart_review_reminder_notification_3)};
        jz.d dVar = jz.e.f37397a;
        Object objD0 = l.d0(strArr);
        m.e(objD0, "random(...)");
        List listW0 = oz.q.W0((CharSequence) objD0, new String[]{"!@@@!"}, 0, 6);
        return new er.a(oz.x.q0((String) listW0.get(0), "%s", String.valueOf(i11)), oz.x.q0((String) listW0.get(1), "%s", String.valueOf(i11)), er.e.SRS_REVIEW.c(), ry.s.f50855a);
    }

    public static void t(lc.d dVar, Integer num, View view, boolean z11, int i11) {
        Integer num2 = (i11 & 1) != 0 ? null : num;
        View view2 = (i11 & 2) != 0 ? null : view;
        boolean z12 = (i11 & 4) == 0;
        boolean z13 = (i11 & 8) == 0;
        boolean z14 = (i11 & 16) != 0 ? false : z11;
        boolean z15 = (i11 & 32) == 0;
        if (num2 == null && view2 == null) {
            throw new IllegalArgumentException("customView".concat(": You must specify a resource ID or literal value"));
        }
        dVar.f39878a.put("md.custom_view_no_vertical_padding", Boolean.valueOf(z13));
        if (z15) {
            lc.d.b(dVar, 0);
        }
        View viewB = dVar.f39884t.getContentLayout().b(num2, view2, z12, z13, z14);
        if (z15) {
            oc.a aVar = new oc.a(dVar, 0);
            if (viewB.getMeasuredWidth() <= 0 || viewB.getMeasuredHeight() <= 0) {
                viewB.getViewTreeObserver().addOnGlobalLayoutListener(new vc.b(viewB, aVar));
            } else {
                aVar.invoke(viewB);
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13041. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static void u(java.io.InputStream r48, java.io.OutputStream r49) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hz.b.u(java.io.InputStream, java.io.OutputStream):void");
    }

    public static final String v(String serialName, f00.c decoder) {
        m.f(serialName, "serialName");
        m.f(decoder, "decoder");
        return "Cannot deserialize " + serialName + " with '" + z.a(decoder.getClass()).g() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final String w(String serialName, f00.d encoder) {
        m.f(serialName, "serialName");
        m.f(encoder, "encoder");
        return "Cannot serialize " + serialName + " with '" + z.a(encoder.getClass()).g() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }

    public static final ArrayList x(y1.a aVar) {
        int[] iArr = {201, 202, 204, 206, 207, AchievementLevelType.DAY_STREAK_LV_7, -127, 126665345, 200};
        List list = aVar.f56811a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            y1.b bVar = (y1.b) list.get(i11);
            if (!l.C(iArr, bVar.f56812a)) {
                if (bVar.f56812a == 100) {
                    int i13 = i11 + 2;
                    if (i13 < size && ((y1.b) list.get(i13)).f56812a == 1000) {
                        break;
                    }
                    ry.m.N0(arrayList);
                } else {
                    arrayList.add(bVar);
                }
            }
            i11 = i12;
        }
        return arrayList;
    }

    public static List y(int i11) {
        String strJ;
        if (!LingoSkillApplication.f21670t) {
            strJ = x.n().keyLanguage == 0 ? J("cn_story_lesson.z") : J("cnup_story_lesson.z");
        } else if (x.n().keyLanguage == 0) {
            String csDataDir = x.n().csDataDir;
            m.e(csDataDir, "csDataDir");
            strJ = K(csDataDir, "cn_story_lesson.z");
        } else {
            String cnupDataDir = x.n().cnupDataDir;
            m.e(cnupDataDir, "cnupDataDir");
            strJ = K(cnupDataDir, "cnup_story_lesson.z");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(strJ);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            JSONArray jSONArray = jSONObject.getJSONArray(sb2.toString());
            m.c(jSONArray);
            return (List) M(jSONArray, new TypeToken<List<? extends CNPodSentence>>() { // from class: com.lingo.lingoskill.speak.helper.SpeakMaterialHelper$getCNSentences$1
            });
        } catch (JSONException e8) {
            e8.getMessage();
            e8.printStackTrace();
            return arrayList;
        }
    }

    public static List z(int i11) {
        String strJ;
        if (LingoSkillApplication.f21670t) {
            String deDataDir = x.n().deDataDir;
            m.e(deDataDir, "deDataDir");
            strJ = K(deDataDir, "de_story_lesson.z");
        } else {
            strJ = J("de_story_lesson.z");
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(strJ);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            JSONArray jSONArray = jSONObject.getJSONArray(sb2.toString());
            m.c(jSONArray);
            return (List) M(jSONArray, new TypeToken<List<? extends DEPodSentence>>() { // from class: com.lingo.lingoskill.speak.helper.SpeakMaterialHelper$getDESentences$1
            });
        } catch (JSONException e8) {
            e8.getMessage();
            e8.printStackTrace();
            return arrayList;
        }
    }

    public abstract void X(byte[] bArr, int i11, int i12);

    public static File I(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = scqhIrGXy.ZbgSBycyhjwJkQP + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i11 = 0; i11 < 100; i11++) {
            File file = new File(cacheDir, str + i11);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
