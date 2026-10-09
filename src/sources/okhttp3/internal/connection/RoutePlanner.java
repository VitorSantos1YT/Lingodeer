package okhttp3.internal.connection;

import kotlin.jvm.internal.m;
import okhttp3.Address;
import okhttp3.HttpUrl;
import ry.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface RoutePlanner {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ConnectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Plan f45323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Plan f45324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Throwable f45325c;

        public /* synthetic */ ConnectResult(Plan plan, ConnectPlan connectPlan, Throwable th2, int i11) {
            this(plan, (i11 & 2) != 0 ? null : connectPlan, (i11 & 4) != 0 ? null : th2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConnectResult)) {
                return false;
            }
            ConnectResult connectResult = (ConnectResult) obj;
            return m.a(this.f45323a, connectResult.f45323a) && m.a(this.f45324b, connectResult.f45324b) && m.a(this.f45325c, connectResult.f45325c);
        }

        public final int hashCode() {
            int iHashCode = this.f45323a.hashCode() * 31;
            Plan plan = this.f45324b;
            int iHashCode2 = (iHashCode + (plan == null ? 0 : plan.hashCode())) * 31;
            Throwable th2 = this.f45325c;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        public final String toString() {
            return "ConnectResult(plan=" + this.f45323a + ", nextPlan=" + this.f45324b + ", throwable=" + this.f45325c + ')';
        }

        public ConnectResult(Plan plan, Plan plan2, Throwable th2) {
            this.f45323a = plan;
            this.f45324b = plan2;
            this.f45325c = th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DefaultImpls {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Plan {
        RealConnection b();

        Plan c();

        void cancel();

        ConnectResult d();

        boolean f();

        ConnectResult g();
    }

    boolean a(RealConnection realConnection);

    boolean b();

    Address c();

    boolean d(HttpUrl httpUrl);

    k e();

    Plan f();
}
