package s20;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f51379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.a f51380b;

    public d(a.a aVar, Uri uri) {
        this.f51380b = aVar;
        this.f51379a = uri;
    }

    @Override // s20.b
    public final String a() {
        return this.f51379a.getPath();
    }

    @Override // s20.b
    public final InputStream b() {
        return ((Context) this.f51380b.f6c).getContentResolver().openInputStream(this.f51379a);
    }
}
