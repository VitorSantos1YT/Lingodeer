package b5;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputContentInfo f3925a;

    public f(Object obj) {
        this.f3925a = (InputContentInfo) obj;
    }

    @Override // b5.g
    public final Uri e() {
        return this.f3925a.getContentUri();
    }

    @Override // b5.g
    public final ClipDescription getDescription() {
        return this.f3925a.getDescription();
    }

    @Override // b5.g
    public final void n() {
        this.f3925a.requestPermission();
    }

    @Override // b5.g
    public final Uri o() {
        return this.f3925a.getLinkUri();
    }

    @Override // b5.g
    public final Object y() {
        return this.f3925a;
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3925a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
