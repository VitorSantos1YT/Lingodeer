package wg;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebResourceRequest f55134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebResourceError f55135b;

    public j(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f55134a = webResourceRequest;
        this.f55135b = webResourceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f55134a, jVar.f55134a) && kotlin.jvm.internal.m.a(this.f55135b, jVar.f55135b);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.f55134a;
        return this.f55135b.hashCode() + ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31);
    }

    public final String toString() {
        return "WebViewError(request=" + this.f55134a + ", error=" + this.f55135b + ')';
    }
}
