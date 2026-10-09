package com.google.android.material.dialog;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import l.j;
import l.k;
import p9.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialAlertDialogBuilder extends j {
    @Override // l.j
    public final j a(Drawable drawable) {
        this.f39020a.f38962c = drawable;
        return this;
    }

    @Override // l.j
    public final j b(CharSequence charSequence) {
        this.f39020a.f38965f = charSequence;
        return this;
    }

    @Override // l.j
    public final j c(CharSequence charSequence, t tVar) {
        super.c(charSequence, tVar);
        return this;
    }

    @Override // l.j
    public final k create() {
        super.create().getWindow().getDecorView();
        throw null;
    }

    @Override // l.j
    public final j d(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.d(charSequence, onClickListener);
        return this;
    }

    @Override // l.j
    public final j setNegativeButton(int i11, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i11, onClickListener);
    }

    @Override // l.j
    public final j setPositiveButton(int i11, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i11, onClickListener);
    }

    @Override // l.j
    public final j setTitle(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    @Override // l.j
    public final j setView(View view) {
        return (MaterialAlertDialogBuilder) super.setView(view);
    }
}
