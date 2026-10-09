package com.google.firebase.inappmessaging.internal.injection.modules;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.common.io.BaseEncoding;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
import lw.c1;
import lw.k;
import lw.x0;
import lw.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class GrpcClientModule_ProvidesApiKeyHeadersFactory implements Factory<c1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GrpcClientModule f20216a;

    public GrpcClientModule_ProvidesApiKeyHeadersFactory(GrpcClientModule grpcClientModule) {
        this.f20216a = grpcClientModule;
    }

    @Override // oy.a
    public final Object get() {
        Signature[] signatureArr;
        Signature signature;
        GrpcClientModule grpcClientModule = this.f20216a;
        grpcClientModule.getClass();
        k kVar = c1.f40362d;
        BitSet bitSet = z0.f40493d;
        x0 x0Var = new x0("X-Goog-Api-Key", kVar);
        x0 x0Var2 = new x0("X-Android-Package", kVar);
        x0 x0Var3 = new x0("X-Android-Cert", kVar);
        c1 c1Var = new c1();
        FirebaseApp firebaseApp = grpcClientModule.f20215a;
        firebaseApp.b();
        Context context = firebaseApp.f17714a;
        String packageName = context.getPackageName();
        firebaseApp.b();
        c1Var.e(x0Var, firebaseApp.f17716c.f17731a);
        c1Var.e(x0Var2, packageName);
        firebaseApp.b();
        String strC = null;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signature.toByteArray());
                BaseEncoding baseEncodingI = BaseEncoding.f17418c.i();
                baseEncodingI.getClass();
                strC = baseEncodingI.c(bArrDigest, bArrDigest.length);
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        if (strC != null) {
            c1Var.e(x0Var3, strC);
        }
        return c1Var;
    }
}
