package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.k1;
import androidx.fragment.app.p0;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {
    protected final LifecycleFragment mLifecycleFragment;

    public LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    public static LifecycleFragment getFragment(Activity activity) {
        return getFragment(new LifecycleActivity(activity));
    }

    public Activity getActivity() {
        Activity activityF = this.mLifecycleFragment.f();
        Preconditions.g(activityF);
        return activityF;
    }

    public static LifecycleFragment getFragment(LifecycleActivity lifecycleActivity) {
        zza zzaVar;
        zzd zzdVar;
        Activity activity = lifecycleActivity.f8739a;
        if (!(activity instanceof p0)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = zza.f8855b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (zzaVar = (zza) weakReference.get()) != null) {
                return zzaVar;
            }
            try {
                zza zzaVar2 = (zza) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (zzaVar2 == null || zzaVar2.isRemoving()) {
                    zzaVar2 = new zza();
                    activity.getFragmentManager().beginTransaction().add(zzaVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(zzaVar2));
                return zzaVar2;
            } catch (ClassCastException e8) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e8);
            }
        }
        p0 p0Var = (p0) activity;
        WeakHashMap weakHashMap2 = zzd.f8863b;
        k1 supportFragmentManager = p0Var.getSupportFragmentManager();
        WeakHashMap weakHashMap3 = zzd.f8863b;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(p0Var);
        if (weakReference2 != null && (zzdVar = (zzd) weakReference2.get()) != null) {
            return zzdVar;
        }
        try {
            zzd zzdVar2 = (zzd) supportFragmentManager.D("SLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.isRemoving()) {
                zzdVar2 = new zzd();
                a aVar = new a(supportFragmentManager);
                aVar.d(0, zzdVar2, "SLifecycleFragmentImpl", 1);
                aVar.i(true, true);
            }
            weakHashMap3.put(p0Var, new WeakReference(zzdVar2));
            return zzdVar2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static LifecycleFragment getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void onCreate(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
