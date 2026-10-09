package se;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lf.v0;
import org.json.JSONArray;
import org.json.JSONObject;
import re.c0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f51583b;

    public /* synthetic */ c(String str, int i11) {
        this.f51582a = i11;
        this.f51583b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Locale locale = null;
        switch (this.f51582a) {
            case 0:
                String str = this.f51583b;
                ReentrantReadWriteLock reentrantReadWriteLock = d.f51584a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    d.f51585b = str;
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(re.s.a()).edit();
                    editorEdit.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", d.f51585b);
                    editorEdit.apply();
                    return;
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            case 1:
                String str2 = this.f51583b;
                if (qf.a.b(z.class)) {
                    return;
                }
                try {
                    if (!z.f51625c.get()) {
                        z.f51623a.b();
                    }
                    SharedPreferences sharedPreferences = z.f51624b;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putString("com.facebook.appevents.UserDataStore.internalUserData", str2).apply();
                        return;
                    } else {
                        kotlin.jvm.internal.m.n("sharedPreferences");
                        throw null;
                    }
                } catch (Throwable th2) {
                    qf.a.a(z.class, th2);
                    return;
                }
            default:
                String str3 = this.f51583b;
                if (qf.a.b(ve.d.class)) {
                    return;
                }
                try {
                    Bundle bundle = new Bundle();
                    lf.d dVarA = v0.a(re.s.a());
                    JSONArray jSONArray = new JSONArray();
                    String str4 = Build.MODEL;
                    if (str4 == null) {
                        str4 = BuildConfig.VERSION_NAME;
                    }
                    jSONArray.put(str4);
                    if ((dVarA != null ? dVarA.a() : null) != null) {
                        jSONArray.put(dVarA.a());
                    } else {
                        jSONArray.put(BuildConfig.VERSION_NAME);
                    }
                    jSONArray.put("0");
                    jSONArray.put(ef.e.t() ? "1" : "0");
                    try {
                        locale = re.s.a().getResources().getConfiguration().locale;
                        break;
                    } catch (Exception unused) {
                    }
                    if (locale == null) {
                        locale = Locale.getDefault();
                        kotlin.jvm.internal.m.e(locale, "getDefault()");
                    }
                    jSONArray.put(locale.getLanguage() + '_' + locale.getCountry());
                    String string = jSONArray.toString();
                    kotlin.jvm.internal.m.e(string, "extInfoArray.toString()");
                    bundle.putString("device_session_id", ve.d.a());
                    bundle.putString("extinfo", string);
                    String str5 = re.y.f49225j;
                    boolean z11 = true;
                    JSONObject jSONObject = new re.y(null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str3}, 1)), bundle, c0.POST, null).c().f49124b;
                    AtomicBoolean atomicBoolean = ve.d.f53985g;
                    if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                        z11 = false;
                    }
                    atomicBoolean.set(z11);
                    if (atomicBoolean.get()) {
                        ve.k kVar = ve.d.f53982d;
                        if (kVar != null) {
                            kVar.c();
                        }
                    } else {
                        ve.d.f53983e = null;
                    }
                    ve.d.f53986h = false;
                    return;
                } catch (Throwable th3) {
                    qf.a.a(ve.d.class, th3);
                    return;
                }
        }
    }
}
