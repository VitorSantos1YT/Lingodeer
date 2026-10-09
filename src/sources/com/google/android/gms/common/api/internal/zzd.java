package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.k0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzd extends k0 implements LifecycleFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f8863b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzc f8864a = new zzc();

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void c(String str, LifecycleCallback lifecycleCallback) {
        this.f8864a.a(str, lifecycleCallback);
    }

    @Override // androidx.fragment.app.k0
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f8864a.f8860a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final LifecycleCallback e(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f8864a.f8860a.get(str));
    }

    @Override // androidx.fragment.app.k0
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        Iterator it = this.f8864a.f8860a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i11, i12, intent);
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8864a.b(bundle);
    }

    @Override // androidx.fragment.app.k0
    public final void onDestroy() {
        super.onDestroy();
        zzc zzcVar = this.f8864a;
        zzcVar.f8861b = 5;
        Iterator it = zzcVar.f8860a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        zzc zzcVar = this.f8864a;
        zzcVar.f8861b = 3;
        Iterator it = zzcVar.f8860a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f8864a.c(bundle);
    }

    @Override // androidx.fragment.app.k0
    public final void onStart() {
        super.onStart();
        zzc zzcVar = this.f8864a;
        zzcVar.f8861b = 2;
        Iterator it = zzcVar.f8860a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        zzc zzcVar = this.f8864a;
        zzcVar.f8861b = 4;
        Iterator it = zzcVar.f8860a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }
}
