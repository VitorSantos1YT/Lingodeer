package okhttp3.internal.connection;

import cf.x;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SequentialExchangeFinder implements ExchangeFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealRoutePlanner f45337a;

    public SequentialExchangeFinder(RealRoutePlanner realRoutePlanner) {
        this.f45337a = realRoutePlanner;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RealConnection a() throws Throwable {
        IOException iOException = null;
        while (true) {
            RealRoutePlanner realRoutePlanner = this.f45337a;
            if (realRoutePlanner.f45317l.b()) {
                throw new IOException("Canceled");
            }
            try {
                RoutePlanner.Plan planF = realRoutePlanner.f();
                if (!planF.f()) {
                    RoutePlanner.ConnectResult connectResultD = planF.d();
                    if (connectResultD.f45324b == null && connectResultD.f45325c == null) {
                        connectResultD = planF.g();
                    }
                    RoutePlanner.Plan plan = connectResultD.f45324b;
                    Throwable th2 = connectResultD.f45325c;
                    if (th2 != null) {
                        throw th2;
                    }
                    if (plan != null) {
                        realRoutePlanner.f45320p.addFirst(plan);
                    }
                }
                return planF.b();
            } catch (IOException e8) {
                if (iOException == null) {
                    iOException = e8;
                } else {
                    x.b(iOException, e8);
                }
                if (!realRoutePlanner.a(null)) {
                    throw iOException;
                }
            }
        }
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RoutePlanner b() {
        return this.f45337a;
    }
}
