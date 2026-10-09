package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zag extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9593b;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f9592a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        zah zahVar = new zah();
        zahVar.f9594a = 0;
        zahVar.f9596c = 255;
        zahVar.f9597d = 0;
        zahVar.f9598e = true;
        zag zagVar = new zag();
        zagVar.f9592a = this.f9592a;
        zagVar.f9593b = this.f9593b;
        zahVar.f9599f = zagVar;
        return zahVar;
    }
}
