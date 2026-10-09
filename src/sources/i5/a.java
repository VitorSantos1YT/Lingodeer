package i5;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import qy.b0;
import r.g2;
import tz.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34147a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34148b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, Handler handler) {
        super(handler);
        this.f34148b = hVar;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f34147a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z11, Uri uri) {
        switch (this.f34147a) {
            case 1:
                ((h) this.f34148b).i(b0.f48488a);
                break;
            default:
                super.onChange(z11, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g2 g2Var) {
        super(new Handler());
        this.f34148b = g2Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z11) {
        Cursor cursor;
        switch (this.f34147a) {
            case 0:
                g2 g2Var = (g2) this.f34148b;
                if (g2Var.f34152b && (cursor = g2Var.f34153c) != null && !cursor.isClosed()) {
                    g2Var.f34151a = g2Var.f34153c.requery();
                    break;
                }
                break;
            default:
                super.onChange(z11);
                break;
        }
    }
}
