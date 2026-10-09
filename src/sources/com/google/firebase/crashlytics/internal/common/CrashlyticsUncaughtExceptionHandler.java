package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsController.AnonymousClass1 f18312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SettingsController f18313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f18314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CrashlyticsNativeComponent f18315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f18316e = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface CrashListener {
    }

    public CrashlyticsUncaughtExceptionHandler(CrashlyticsController.AnonymousClass1 anonymousClass1, SettingsController settingsController, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.f18312a = anonymousClass1;
        this.f18313b = settingsController;
        this.f18314c = uncaughtExceptionHandler;
        this.f18315d = crashlyticsNativeComponent;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        AtomicBoolean atomicBoolean = this.f18316e;
        atomicBoolean.set(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f18314c;
        if (thread != null && th2 != null) {
            try {
                if (!this.f18315d.b()) {
                    this.f18312a.a(this.f18313b, thread, th2);
                }
            } catch (Exception unused) {
            } finally {
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                } else {
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        }
    }
}
