package com.google.android.material.motion;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialBackOrchestrator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Api33BackCallbackDelegate f14796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialBackHandler f14797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f14798c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Api33BackCallbackDelegate implements BackCallbackDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OnBackInvokedCallback f14799a;

        private Api33BackCallbackDelegate() {
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        public void a(MaterialBackHandler materialBackHandler, View view, boolean z11) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f14799a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(materialBackHandler);
                this.f14799a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z11 ? 1000000 : 0, onBackInvokedCallbackC);
            }
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        public void b(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f14799a == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f14799a);
            this.f14799a = null;
        }

        public OnBackInvokedCallback c(MaterialBackHandler materialBackHandler) {
            Objects.requireNonNull(materialBackHandler);
            return new a(materialBackHandler, 0);
        }

        public /* synthetic */ Api33BackCallbackDelegate(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Api34BackCallbackDelegate extends Api33BackCallbackDelegate {
        private Api34BackCallbackDelegate() {
            super(0);
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate
        public final OnBackInvokedCallback c(final MaterialBackHandler materialBackHandler) {
            return new OnBackAnimationCallback() { // from class: com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.1
                public final void onBackCancelled() {
                    if (Api34BackCallbackDelegate.this.f14799a != null) {
                        materialBackHandler.f();
                    }
                }

                public final void onBackInvoked() {
                    materialBackHandler.c();
                }

                public final void onBackProgressed(BackEvent backEvent) {
                    if (Api34BackCallbackDelegate.this.f14799a != null) {
                        materialBackHandler.d(new f.a(backEvent));
                    }
                }

                public final void onBackStarted(BackEvent backEvent) {
                    if (Api34BackCallbackDelegate.this.f14799a != null) {
                        materialBackHandler.a(new f.a(backEvent));
                    }
                }
            };
        }

        public /* synthetic */ Api34BackCallbackDelegate(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface BackCallbackDelegate {
        void a(MaterialBackHandler materialBackHandler, View view, boolean z11);

        void b(View view);
    }

    public MaterialBackOrchestrator(MaterialBackHandler materialBackHandler, View view) {
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        this.f14796a = i11 >= 34 ? new Api34BackCallbackDelegate(i12) : i11 >= 33 ? new Api33BackCallbackDelegate(i12) : null;
        this.f14797b = materialBackHandler;
        this.f14798c = view;
    }

    public final void a(boolean z11) {
        Api33BackCallbackDelegate api33BackCallbackDelegate = this.f14796a;
        if (api33BackCallbackDelegate != null) {
            api33BackCallbackDelegate.a(this.f14797b, this.f14798c, z11);
        }
    }

    public final void b() {
        Api33BackCallbackDelegate api33BackCallbackDelegate = this.f14796a;
        if (api33BackCallbackDelegate != null) {
            api33BackCallbackDelegate.b(this.f14798c);
        }
    }
}
