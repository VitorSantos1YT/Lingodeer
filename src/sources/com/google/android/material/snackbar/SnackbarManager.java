package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.lingodeer.data.model.AchievementLevelType;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class SnackbarManager {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SnackbarManager f15500e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15501a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f15502b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.material.snackbar.SnackbarManager.1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            SnackbarManager snackbarManager = SnackbarManager.this;
            SnackbarRecord snackbarRecord = (SnackbarRecord) message.obj;
            synchronized (snackbarManager.f15501a) {
                try {
                    if (snackbarManager.f15503c == snackbarRecord || snackbarManager.f15504d == snackbarRecord) {
                        snackbarManager.a(snackbarRecord, 2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SnackbarRecord f15503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SnackbarRecord f15504d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Callback {
        void a();

        void b(int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SnackbarRecord {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f15506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15508c;

        public SnackbarRecord(int i11, BaseTransientBottomBar.AnonymousClass5 anonymousClass5) {
            this.f15506a = new WeakReference(anonymousClass5);
            this.f15507b = i11;
        }
    }

    private SnackbarManager() {
    }

    public static SnackbarManager b() {
        if (f15500e == null) {
            f15500e = new SnackbarManager();
        }
        return f15500e;
    }

    public final boolean a(SnackbarRecord snackbarRecord, int i11) {
        Callback callback = (Callback) snackbarRecord.f15506a.get();
        if (callback == null) {
            return false;
        }
        this.f15502b.removeCallbacksAndMessages(snackbarRecord);
        callback.b(i11);
        return true;
    }

    public final boolean c(Callback callback) {
        SnackbarRecord snackbarRecord = this.f15503c;
        return (snackbarRecord == null || callback == null || snackbarRecord.f15506a.get() != callback) ? false : true;
    }

    public final void d(BaseTransientBottomBar.AnonymousClass5 anonymousClass5) {
        synchronized (this.f15501a) {
            try {
                if (c(anonymousClass5)) {
                    SnackbarRecord snackbarRecord = this.f15503c;
                    if (!snackbarRecord.f15508c) {
                        snackbarRecord.f15508c = true;
                        this.f15502b.removeCallbacksAndMessages(snackbarRecord);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(BaseTransientBottomBar.AnonymousClass5 anonymousClass5) {
        synchronized (this.f15501a) {
            try {
                if (c(anonymousClass5)) {
                    SnackbarRecord snackbarRecord = this.f15503c;
                    if (snackbarRecord.f15508c) {
                        snackbarRecord.f15508c = false;
                        f(snackbarRecord);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(SnackbarRecord snackbarRecord) {
        int i11 = snackbarRecord.f15507b;
        if (i11 == -2) {
            return;
        }
        if (i11 <= 0) {
            i11 = i11 == -1 ? AchievementLevelType.KNOWLEDGE_POINT_LV_9 : 2750;
        }
        Handler handler = this.f15502b;
        handler.removeCallbacksAndMessages(snackbarRecord);
        handler.sendMessageDelayed(Message.obtain(handler, 0, snackbarRecord), i11);
    }
}
