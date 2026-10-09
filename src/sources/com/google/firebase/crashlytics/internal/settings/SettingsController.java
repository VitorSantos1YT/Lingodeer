package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SettingsController implements SettingsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SettingsRequest f18926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SettingsJsonParser f18927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SystemCurrentTimeProvider f18928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CachedSettingsIo f18929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DefaultSettingsSpiCall f18930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DataCollectionArbiter f18931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f18932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference f18933i;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.settings.SettingsController$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements SuccessContinuation<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CrashlyticsWorkers f18934a;

        public AnonymousClass1(CrashlyticsWorkers crashlyticsWorkers) {
            this.f18934a = crashlyticsWorkers;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public final Task<Void> then(Void r9) throws Throwable {
            FileWriter fileWriter;
            JSONObject jSONObject = (JSONObject) this.f18934a.f18378c.f18372a.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.settings.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    SettingsController settingsController = SettingsController.this;
                    DefaultSettingsSpiCall defaultSettingsSpiCall = settingsController.f18930f;
                    SettingsRequest settingsRequest = settingsController.f18926b;
                    defaultSettingsSpiCall.getClass();
                    CrashlyticsWorkers.b();
                    try {
                        HashMap mapB = DefaultSettingsSpiCall.b(settingsRequest);
                        HttpGetRequest httpGetRequest = new HttpGetRequest(defaultSettingsSpiCall.f18914a, mapB);
                        httpGetRequest.c(HttpHeaders.USER_AGENT, "Crashlytics Android SDK/20.0.6");
                        httpGetRequest.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                        DefaultSettingsSpiCall.a(httpGetRequest, settingsRequest);
                        mapB.toString();
                        HttpResponse httpResponseB = httpGetRequest.b();
                        int i11 = httpResponseB.f18869a;
                        if (i11 == 200 || i11 == 201 || i11 == 202 || i11 == 203) {
                            return new JSONObject(httpResponseB.f18870b);
                        }
                        return null;
                    } catch (IOException | Exception unused) {
                        return null;
                    }
                }
            }).get();
            FileWriter fileWriter2 = null;
            if (jSONObject != null) {
                SettingsController settingsController = SettingsController.this;
                SettingsJsonParser settingsJsonParser = settingsController.f18927c;
                settingsJsonParser.getClass();
                Settings settingsA = (jSONObject.getInt("settings_version") != 3 ? new DefaultSettingsJsonTransform() : new SettingsV3JsonTransform()).a(settingsJsonParser.f18936a, jSONObject);
                CachedSettingsIo cachedSettingsIo = settingsController.f18929e;
                long j11 = settingsA.f18917c;
                cachedSettingsIo.getClass();
                try {
                    jSONObject.put("expires_at", j11);
                    fileWriter = new FileWriter(cachedSettingsIo.f18913a);
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception unused) {
                    } catch (Throwable th2) {
                        th = th2;
                        fileWriter2 = fileWriter;
                        CommonUtils.b(fileWriter2);
                        throw th;
                    }
                } catch (Exception unused2) {
                    fileWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                CommonUtils.b(fileWriter);
                jSONObject.toString();
                String str = settingsController.f18926b.f18942f;
                SharedPreferences.Editor editorEdit = settingsController.f18925a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                editorEdit.putString("existing_instance_identifier", str);
                editorEdit.apply();
                settingsController.f18932h.set(settingsA);
                ((TaskCompletionSource) settingsController.f18933i.get()).trySetResult(settingsA);
            }
            return Tasks.forResult(null);
        }
    }

    public SettingsController(Context context, SettingsRequest settingsRequest, SystemCurrentTimeProvider systemCurrentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, DefaultSettingsSpiCall defaultSettingsSpiCall, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference atomicReference = new AtomicReference();
        this.f18932h = atomicReference;
        this.f18933i = new AtomicReference(new TaskCompletionSource());
        this.f18925a = context;
        this.f18926b = settingsRequest;
        this.f18928d = systemCurrentTimeProvider;
        this.f18927c = settingsJsonParser;
        this.f18929e = cachedSettingsIo;
        this.f18930f = defaultSettingsSpiCall;
        this.f18931g = dataCollectionArbiter;
        atomicReference.set(DefaultSettingsJsonTransform.b(systemCurrentTimeProvider));
    }

    public static SettingsController a(Context context, String str, IdManager idManager, HttpRequestFactory httpRequestFactory, String str2, String str3, FileStore fileStore, DataCollectionArbiter dataCollectionArbiter) {
        String strD = idManager.d();
        SystemCurrentTimeProvider systemCurrentTimeProvider = new SystemCurrentTimeProvider();
        SettingsJsonParser settingsJsonParser = new SettingsJsonParser(systemCurrentTimeProvider);
        CachedSettingsIo cachedSettingsIo = new CachedSettingsIo(fileStore);
        Locale locale = Locale.US;
        DefaultSettingsSpiCall defaultSettingsSpiCall = new DefaultSettingsSpiCall(ep.a.g("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str, "/settings"), httpRequestFactory);
        String str4 = Build.MANUFACTURER;
        String str5 = IdManager.f18331h;
        String strD2 = ep.a.D(str4.replaceAll(str5, BuildConfig.VERSION_NAME), "/", Build.MODEL.replaceAll(str5, BuildConfig.VERSION_NAME));
        String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str5, BuildConfig.VERSION_NAME);
        String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str5, BuildConfig.VERSION_NAME);
        int iD = CommonUtils.d(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iD == 0) {
            iD = CommonUtils.d(context, "com.crashlytics.android.build_id", "string");
        }
        String[] strArr = {iD != 0 ? context.getResources().getString(iD) : null, str, str3, str2};
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 4; i11++) {
            String str6 = strArr[i11];
            if (str6 != null) {
                arrayList.add(str6.replace("-", BuildConfig.VERSION_NAME).toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            sb2.append((String) obj);
        }
        String string = sb2.toString();
        return new SettingsController(context, new SettingsRequest(str, strD2, strReplaceAll, strReplaceAll2, idManager, string.length() > 0 ? CommonUtils.h(string) : null, str3, str2, (strD != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).a()), systemCurrentTimeProvider, settingsJsonParser, cachedSettingsIo, defaultSettingsSpiCall, dataCollectionArbiter);
    }

    public final Settings b(SettingsCacheBehavior settingsCacheBehavior) throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        try {
            if (SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                return null;
            }
            CachedSettingsIo cachedSettingsIo = this.f18929e;
            cachedSettingsIo.getClass();
            try {
                File file = cachedSettingsIo.f18913a;
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        jSONObject = new JSONObject(CommonUtils.i(fileInputStream));
                    } catch (Exception unused) {
                        CommonUtils.b(fileInputStream);
                        jSONObject = null;
                    } catch (Throwable th2) {
                        th = th2;
                        CommonUtils.b(fileInputStream);
                        throw th;
                    }
                } else {
                    fileInputStream = null;
                    jSONObject = null;
                }
                CommonUtils.b(fileInputStream);
            } catch (Exception unused2) {
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
            if (jSONObject == null) {
                return null;
            }
            SettingsJsonParser settingsJsonParser = this.f18927c;
            settingsJsonParser.getClass();
            Settings settingsA = (jSONObject.getInt("settings_version") != 3 ? new DefaultSettingsJsonTransform() : new SettingsV3JsonTransform()).a(settingsJsonParser.f18936a, jSONObject);
            jSONObject.toString();
            this.f18928d.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) || settingsA.f18917c >= jCurrentTimeMillis) {
                return settingsA;
            }
            return null;
        } catch (Exception unused3) {
            return null;
        }
    }

    public final Task c() {
        return ((TaskCompletionSource) this.f18933i.get()).getTask();
    }

    public final Settings d() {
        return (Settings) this.f18932h.get();
    }

    public final Task e(CrashlyticsWorkers crashlyticsWorkers) throws Throwable {
        Task task;
        Settings settingsB;
        SettingsCacheBehavior settingsCacheBehavior = SettingsCacheBehavior.USE_CACHE;
        AtomicReference atomicReference = this.f18933i;
        AtomicReference atomicReference2 = this.f18932h;
        if (this.f18925a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", BuildConfig.VERSION_NAME).equals(this.f18926b.f18942f) && (settingsB = b(settingsCacheBehavior)) != null) {
            atomicReference2.set(settingsB);
            ((TaskCompletionSource) atomicReference.get()).trySetResult(settingsB);
            return Tasks.forResult(null);
        }
        Settings settingsB2 = b(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
        if (settingsB2 != null) {
            atomicReference2.set(settingsB2);
            ((TaskCompletionSource) atomicReference.get()).trySetResult(settingsB2);
        }
        DataCollectionArbiter dataCollectionArbiter = this.f18931g;
        Task task2 = dataCollectionArbiter.f18323g.getTask();
        synchronized (dataCollectionArbiter.f18319c) {
            task = dataCollectionArbiter.f18320d.getTask();
        }
        return CrashlyticsTasks.a(task2, task).onSuccessTask(crashlyticsWorkers.f18376a, new AnonymousClass1(crashlyticsWorkers));
    }
}
