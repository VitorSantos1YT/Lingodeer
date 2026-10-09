package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentWrapper extends IFragmentWrapper.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f9191a;

    public FragmentWrapper(Fragment fragment) {
        this.f9191a = fragment;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void G(boolean z11) {
        this.f9191a.setMenuVisibility(z11);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void I0(Intent intent) {
        this.f9191a.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void N0(boolean z11) {
        this.f9191a.setRetainInstance(z11);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void X0(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.j(iObjectWrapper);
        Preconditions.g(view);
        this.f9191a.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void a1(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.j(iObjectWrapper);
        Preconditions.g(view);
        this.f9191a.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean c() {
        return this.f9191a.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void d1(boolean z11) {
        this.f9191a.setUserVisibleHint(z11);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void j0(Intent intent, int i11) {
        this.f9191a.startActivityForResult(intent, i11);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void r(boolean z11) {
        this.f9191a.setHasOptionsMenu(z11);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzb() {
        return new ObjectWrapper(this.f9191a.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle zzc() {
        return this.f9191a.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzd() {
        return this.f9191a.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zze() {
        Fragment parentFragment = this.f9191a.getParentFragment();
        if (parentFragment != null) {
            return new FragmentWrapper(parentFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzf() {
        return new ObjectWrapper(this.f9191a.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzg() {
        return this.f9191a.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String zzh() {
        return this.f9191a.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zzi() {
        Fragment targetFragment = this.f9191a.getTargetFragment();
        if (targetFragment != null) {
            return new FragmentWrapper(targetFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzj() {
        return this.f9191a.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzk() {
        return this.f9191a.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzl() {
        return new ObjectWrapper(this.f9191a.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzm() {
        return this.f9191a.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzn() {
        return this.f9191a.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzo() {
        return this.f9191a.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzp() {
        return this.f9191a.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzr() {
        return this.f9191a.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
        return this.f9191a.isVisible();
    }
}
