package com.google.firebase.inappmessaging.display.internal.layout.util;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BackButtonHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f19941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f19942b;

    public BackButtonHandler(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        this.f19941a = viewGroup;
        this.f19942b = onClickListener;
    }

    public final Boolean a(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return null;
        }
        View.OnClickListener onClickListener = this.f19942b;
        if (onClickListener == null) {
            return Boolean.FALSE;
        }
        onClickListener.onClick(this.f19941a);
        return Boolean.TRUE;
    }
}
