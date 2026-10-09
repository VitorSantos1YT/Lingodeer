package h7;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f31849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f31850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f31851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f31851c = fVar;
        this.f31849a = contentResolver;
        this.f31850b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z11) {
        f fVar = this.f31851c;
        fVar.a(c.c(fVar.f31858a, fVar.f31866i, fVar.f31865h));
    }
}
