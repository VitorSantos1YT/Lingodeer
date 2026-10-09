package nv;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lingo.lingoskill.franchskill.ui.learn.FRSyllableIntroductionActivity2;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingodeer.network.model.ApiPostContent;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.NoWhenBranchMatchedException;
import x7.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class p {
    public static void A(int i11, int i12, int i13, int i14, int i15) {
        q2.c.a(i11);
        q2.c.a(i12);
        q2.c.a(i13);
        q2.c.a(i14);
        q2.c.a(i15);
    }

    public static void B(int i11, String str, ArrayList arrayList) {
        arrayList.add(str.subSequence(i11, str.length()).toString());
    }

    public static /* synthetic */ void C(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
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

    public static void D(y6.o oVar, e0 e0Var) {
        e0Var.b(new y6.p(oVar));
    }

    public static int a(ReviewNew reviewNew, String str) {
        Integer elemType = reviewNew.getElemType();
        kotlin.jvm.internal.m.e(elemType, str);
        return elemType.intValue();
    }

    public static int b(ArrayList arrayList, int i11, int i12) {
        return (arrayList.hashCode() + i11) * i12;
    }

    public static int c(Matcher matcher, String str, int i11, ArrayList arrayList) {
        arrayList.add(str.subSequence(i11, matcher.start()).toString());
        return matcher.end();
    }

    public static Bundle d(int i11, String str, String str2, long j11) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i11);
        bundle.putLong(str2, j11);
        return bundle;
    }

    public static Object e(int i11, int i12, ArrayList arrayList, List list) {
        list.add(Integer.valueOf(i11));
        return arrayList.get(i12);
    }

    public static Object f(int i11, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i11);
    }

    public static Object g(int i11, List list) {
        return list.get(list.size() - i11);
    }

    public static String h(float f5, String str, StringBuilder sb2) {
        sb2.append(f5);
        sb2.append(str);
        return sb2.toString();
    }

    public static String i(int i11, int i12, String str) {
        return str.substring(i12, str.length() - i11);
    }

    public static String j(int i11, String str) {
        return str + i11;
    }

    public static String k(int i11, String str, String str2) {
        return str + str2 + i11;
    }

    public static String l(int i11, l1.s sVar, StringBuilder sb2, boolean z11) {
        sb2.append(ub.a.e0(sVar, i11));
        String string = sb2.toString();
        sVar.p(z11);
        return string;
    }

    public static String m(long j11, String str, String str2) {
        return str + j11 + str2;
    }

    public static String n(Uri uri, String str) {
        return str + uri;
    }

    public static String o(String str, int i11, char c11) {
        return str + i11 + c11;
    }

    public static String p(String str, int i11, int i12, String str2) {
        return str + i11 + str2 + i12;
    }

    public static String q(String str, String str2, char c11) {
        return str + str2 + c11;
    }

    public static String r(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String s(String str, String str2, String str3, String str4, String str5) {
        Pattern patternCompile = Pattern.compile(str);
        kotlin.jvm.internal.m.e(patternCompile, str2);
        String strReplaceAll = patternCompile.matcher(str3).replaceAll(str4);
        kotlin.jvm.internal.m.e(strReplaceAll, str5);
        return strReplaceAll;
    }

    public static String t(String str, String str2, l1.s sVar, boolean z11) {
        String str3 = str + str2;
        sVar.p(z11);
        return str3;
    }

    public static String u(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static StringBuilder v(l1.s sVar, z1.r rVar, y2.h hVar, int i11, String str) {
        l1.t.J(hVar, rVar, sVar);
        sVar.d0(i11);
        return new StringBuilder(str);
    }

    public static Matcher w(int i11, String str, String str2, String str3) {
        Pattern patternCompile = Pattern.compile(str);
        kotlin.jvm.internal.m.e(patternCompile, str2);
        oz.q.U0(i11);
        return patternCompile.matcher(str3);
    }

    public static NoWhenBranchMatchedException x(l1.s sVar, int i11, boolean z11) {
        sVar.d0(i11);
        sVar.p(z11);
        return new NoWhenBranchMatchedException();
    }

    public static qy.l y(JsonObject jsonObject, String str, hv.a aVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        String json = new Gson().toJson((JsonElement) jsonObject);
        kotlin.jvm.internal.m.e(json, str);
        aVar.getClass();
        if (json.length() > 3072) {
            String strQ0 = json;
            while (strQ0.length() > 3072) {
                String strSubstring = strQ0.substring(0, 3072);
                kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                strQ0 = oz.x.q0(strQ0, strSubstring, BuildConfig.VERSION_NAME);
            }
        }
        SecretKeySpec secretKeySpecC = hv.a.c();
        SecretKeySpec secretKeySpecC2 = hv.a.c();
        byte[] encoded = secretKeySpecC.getEncoded();
        kotlin.jvm.internal.m.e(encoded, "getEncoded(...)");
        Charset charset = oz.a.f46133a;
        String str2 = new String(encoded, charset);
        byte[] encoded2 = secretKeySpecC2.getEncoded();
        kotlin.jvm.internal.m.e(encoded2, "getEncoded(...)");
        String str3 = new String(encoded2, charset);
        ApiPostContent apiPostContent = new ApiPostContent();
        PublicKey publicKeyD = hv.a.d();
        String strB = o00.a.b(str2);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publicKeyD);
        byte[] bArrDoFinal = cipher.doFinal(strB.getBytes(Constants.ENCODING));
        kotlin.jvm.internal.m.e(bArrDoFinal, "rsaPublicKeyEncode(...)");
        apiPostContent.setEnKey(o00.a.c(bArrDoFinal));
        PublicKey publicKeyD2 = hv.a.d();
        String strB2 = o00.a.b(str3);
        Cipher cipher2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher2.init(1, publicKeyD2);
        byte[] bArrDoFinal2 = cipher2.doFinal(strB2.getBytes(Constants.ENCODING));
        kotlin.jvm.internal.m.e(bArrDoFinal2, "rsaPublicKeyEncode(...)");
        apiPostContent.setEnIV(o00.a.c(bArrDoFinal2));
        apiPostContent.setEnContent(hv.a.a(o00.a.b(json), str2, str3));
        apiPostContent.setCaller(hv.a.a(o00.a.b(aVar.f33818a), str2, str3));
        JsonObject jsonObject2 = new JsonObject();
        String json2 = new Gson().toJson(apiPostContent);
        kotlin.jvm.internal.m.e(json2, "toJson(...)");
        jsonObject2.addProperty("token", o00.a.b(json2));
        new Gson().toJson(apiPostContent);
        return new qy.l(jsonObject2, new qy.l(secretKeySpecC, secretKeySpecC2));
    }

    public static ta.a z(int i11, RecyclerView recyclerView, FRSyllableIntroductionActivity2 fRSyllableIntroductionActivity2) {
        recyclerView.setLayoutManager(new GridLayoutManager(i11));
        return fRSyllableIntroductionActivity2.j();
    }
}
