package xt;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56323a;

    public u(Context context) {
        this.f56323a = context;
    }

    public final int a(String iconName) {
        kotlin.jvm.internal.m.f(iconName, "iconName");
        Context context = this.f56323a;
        return context.getResources().getIdentifier(iconName, "drawable", context.getPackageName());
    }

    public final int b(String rawName) {
        kotlin.jvm.internal.m.f(rawName, "rawName");
        Context context = this.f56323a;
        return context.getResources().getIdentifier(rawName, "raw", context.getPackageName());
    }

    public final int c(String idName) {
        kotlin.jvm.internal.m.f(idName, "idName");
        Context context = this.f56323a;
        return context.getResources().getIdentifier(idName, "string", context.getPackageName());
    }
}
