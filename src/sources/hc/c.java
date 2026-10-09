package hc;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32179a;

    public c(Context context) {
        this.f32179a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return m.a(this.f32179a, ((c) obj).f32179a);
        }
        return false;
    }

    @Override // hc.h
    public final Object f(vb.g gVar) {
        DisplayMetrics displayMetrics = this.f32179a.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new g(aVar, aVar);
    }

    public final int hashCode() {
        return this.f32179a.hashCode();
    }
}
