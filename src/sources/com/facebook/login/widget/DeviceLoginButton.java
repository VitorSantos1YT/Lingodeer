package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import kotlin.jvm.internal.m;
import uf.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DeviceLoginButton extends LoginButton {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Uri f7720e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(Context context, AttributeSet attrs, int i11) {
        super(context, attrs, i11);
        m.f(context, "context");
        m.f(attrs, "attrs");
    }

    public final Uri getDeviceRedirectUri() {
        return this.f7720e0;
    }

    @Override // com.facebook.login.widget.LoginButton
    public c getNewLoginClickListener() {
        return new uf.a(this);
    }

    public final void setDeviceRedirectUri(Uri uri) {
        this.f7720e0 = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        m.f(context, "context");
        m.f(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceLoginButton(Context context) {
        super(context);
        m.f(context, "context");
    }
}
