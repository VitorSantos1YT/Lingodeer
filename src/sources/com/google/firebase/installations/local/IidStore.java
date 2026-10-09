package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class IidStore {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f20393c = {"*", "FCM", "GCM", BuildConfig.VERSION_NAME};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f20394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20395b;

    public final String a() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f20394a) {
            String strEncodeToString = null;
            String string = this.f20394a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e8) {
                e8.toString();
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
            }
            return strEncodeToString;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    public IidStore(FirebaseApp firebaseApp) {
        firebaseApp.b();
        this.f20394a = firebaseApp.f17714a.getSharedPreferences(MzwEyWCkjXL.gaADwRR, 0);
        firebaseApp.b();
        FirebaseOptions firebaseOptions = firebaseApp.f17716c;
        String str = firebaseOptions.f17735e;
        if (str == null) {
            firebaseApp.b();
            str = firebaseOptions.f17732b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.f20395b = str;
    }
}
