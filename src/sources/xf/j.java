package xf;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import b0.h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f56035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f56036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f56037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f56038f;

    public final void s0(k kVar) {
        if (kVar == null) {
            return;
        }
        Bundle parameters = kVar.f56033a;
        kotlin.jvm.internal.m.f(parameters, "parameters");
        ((Bundle) this.f3561b).putAll(parameters);
        this.f56035c = kVar.f56039b;
        this.f56036d = kVar.f56040c;
        this.f56037e = kVar.f56041d;
        this.f56038f = kVar.f56042e;
    }
}
