package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.k0;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f9194a;

    public SupportFragmentWrapper(k0 k0Var) {
        this.f9194a = k0Var;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void G(boolean z11) {
        this.f9194a.setMenuVisibility(z11);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void I0(Intent intent) {
        this.f9194a.startActivity(intent);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void N0(boolean z11) {
        this.f9194a.setRetainInstance(z11);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void X0(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.j(iObjectWrapper);
        Preconditions.g(view);
        this.f9194a.registerForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void a1(IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.j(iObjectWrapper);
        Preconditions.g(view);
        this.f9194a.unregisterForContextMenu(view);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean c() {
        return this.f9194a.isRemoving();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void d1(boolean z11) {
        this.f9194a.setUserVisibleHint(z11);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void j0(Intent intent, int i11) {
        this.f9194a.startActivityForResult(intent, i11);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void r(boolean z11) {
        this.f9194a.setHasOptionsMenu(z11);
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzb() {
        return new ObjectWrapper(this.f9194a.getActivity());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final Bundle zzc() {
        return this.f9194a.getArguments();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzd() {
        return this.f9194a.getId();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zze() {
        k0 parentFragment = this.f9194a.getParentFragment();
        if (parentFragment != null) {
            return new SupportFragmentWrapper(parentFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzf() {
        return new ObjectWrapper(this.f9194a.getResources());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzg() {
        return this.f9194a.getRetainInstance();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final String zzh() {
        return this.f9194a.getTag();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final IFragmentWrapper zzi() {
        k0 targetFragment = this.f9194a.getTargetFragment();
        if (targetFragment != null) {
            return new SupportFragmentWrapper(targetFragment);
        }
        return null;
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzj() {
        return this.f9194a.getTargetRequestCode();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzk() {
        return this.f9194a.getUserVisibleHint();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final ObjectWrapper zzl() {
        return new ObjectWrapper(this.f9194a.getView());
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzm() {
        return this.f9194a.isAdded();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzn() {
        return this.f9194a.isDetached();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzo() {
        return this.f9194a.isHidden();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzp() {
        return this.f9194a.isInLayout();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzr() {
        return this.f9194a.isResumed();
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
        return this.f9194a.isVisible();
    }
}
