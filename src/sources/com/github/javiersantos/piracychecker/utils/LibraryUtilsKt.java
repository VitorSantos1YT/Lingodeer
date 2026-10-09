package com.github.javiersantos.piracychecker.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Base64;
import androidx.fragment.app.p0;
import com.lingodeer.R;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import l.j;
import l.k;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class LibraryUtilsKt {
    public static final k a(final p0 p0Var, String str, String str2) {
        if (p0Var.isFinishing()) {
            return null;
        }
        j jVar = new j(p0Var);
        jVar.f39020a.f38970k = false;
        return jVar.setTitle(str).b(str2).d(p0Var.getString(R.string.app_unlicensed_close), new DialogInterface.OnClickListener() { // from class: com.github.javiersantos.piracychecker.utils.LibraryUtilsKt$buildUnlicensedDialog$$inlined$let$lambda$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                p0 p0Var2 = p0Var;
                if (p0Var2.isFinishing()) {
                    return;
                }
                p0Var2.finish();
            }
        }).create();
    }

    public static final boolean b(Context verifySigningCertificates, String[] appSignatures) throws NoSuchAlgorithmException {
        Signature[] signingCertificateHistory;
        m.f(verifySigningCertificates, "$this$verifySigningCertificates");
        m.f(appSignatures, "appSignatures");
        int i11 = 0;
        for (String str : appSignatures) {
            if (str != null) {
                ArrayList arrayList = new ArrayList();
                try {
                    PackageManager packageManager = verifySigningCertificates.getPackageManager();
                    String packageName = verifySigningCertificates.getPackageName();
                    int i12 = Build.VERSION.SDK_INT;
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i12 >= 28 ? 134217728 : 64);
                    if (i12 < 28) {
                        signingCertificateHistory = packageInfo.signatures;
                    } else if (packageInfo.signingInfo.hasMultipleSigners()) {
                        SigningInfo signingInfo = packageInfo.signingInfo;
                        m.e(signingInfo, "packageInfo.signingInfo");
                        signingCertificateHistory = signingInfo.getApkContentsSigners();
                    } else {
                        SigningInfo signingInfo2 = packageInfo.signingInfo;
                        m.e(signingInfo2, "packageInfo.signingInfo");
                        signingCertificateHistory = signingInfo2.getSigningCertificateHistory();
                    }
                    m.e(signingCertificateHistory, "if (Build.VERSION.SDK_IN…se packageInfo.signatures");
                } catch (Exception unused) {
                    signingCertificateHistory = new Signature[0];
                }
                for (Signature signature : signingCertificateHistory) {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                    messageDigest.update(signature.toByteArray());
                    try {
                        String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 0);
                        m.e(strEncodeToString, "Base64.encodeToString(me…digest(), Base64.DEFAULT)");
                        arrayList.add(q.i1(strEncodeToString).toString());
                    } catch (Exception unused2) {
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    String str2 = (String) obj;
                    if (str2.length() > 0 && !q.K0(str2)) {
                        arrayList2.add(obj);
                    }
                }
                Object[] array = arrayList2.toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                for (String str3 : (String[]) array) {
                    if (m.a(str3, str)) {
                        i11++;
                        break;
                    }
                }
            }
        }
        return i11 >= appSignatures.length;
    }
}
