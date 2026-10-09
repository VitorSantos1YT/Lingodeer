package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static zbn f8548b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Storage f8549a;

    public zbn(Context context) {
        String strE;
        Storage storageA = Storage.a(context);
        this.f8549a = storageA;
        storageA.b();
        String strE2 = storageA.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strE2) || (strE = storageA.e(Storage.f("googleSignInOptions", strE2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.D1(strE);
        } catch (JSONException unused) {
        }
    }

    public static synchronized zbn a(Context context) {
        zbn zbnVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (zbn.class) {
            zbnVar = f8548b;
            if (zbnVar == null) {
                zbnVar = new zbn(applicationContext);
                f8548b = zbnVar;
            }
        }
        return zbnVar;
        return zbnVar;
    }

    public final synchronized void b() {
        Storage storage = this.f8549a;
        ReentrantLock reentrantLock = storage.f8528a;
        reentrantLock.lock();
        try {
            storage.f8529b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
