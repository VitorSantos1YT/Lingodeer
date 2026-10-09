package ae;

import android.content.Context;
import android.net.Uri;
import ce.i0;
import td.j;
import zd.m;
import zd.p;
import zd.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f668b;

    public c(Context context, int i11) {
        this.f667a = i11;
        switch (i11) {
            case 1:
                this.f668b = context.getApplicationContext();
                break;
            case 2:
                this.f668b = context;
                break;
            default:
                this.f668b = context.getApplicationContext();
                break;
        }
    }

    @Override // zd.q
    public final boolean a(Object obj) {
        switch (this.f667a) {
            case 0:
                Uri uri = (Uri) obj;
                return ud.a.b(uri) && !uri.getPathSegments().contains("video");
            case 1:
                Uri uri2 = (Uri) obj;
                return ud.a.b(uri2) && uri2.getPathSegments().contains("video");
            default:
                return ud.a.b((Uri) obj);
        }
    }

    @Override // zd.q
    public final p b(Object obj, int i11, int i12, j jVar) {
        Long l9;
        switch (this.f667a) {
            case 0:
                Uri uri = (Uri) obj;
                if (i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || i11 > 512 || i12 > 384) {
                    return null;
                }
                oe.b bVar = new oe.b(uri);
                Context context = this.f668b;
                return new p(bVar, ud.c.c(context, uri, new ud.b(context.getContentResolver(), 0)));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || i11 > 512 || i12 > 384 || (l9 = (Long) jVar.c(i0.f6858d)) == null || l9.longValue() != -1) {
                    return null;
                }
                oe.b bVar2 = new oe.b(uri2);
                Context context2 = this.f668b;
                return new p(bVar2, ud.c.c(context2, uri2, new ud.b(context2.getContentResolver(), 1)));
            default:
                Uri uri3 = (Uri) obj;
                return new p(new oe.b(uri3), new m(0, this.f668b, uri3));
        }
    }
}
