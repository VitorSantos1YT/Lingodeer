package okhttp3;

import java.util.ArrayList;
import java.util.Set;
import okhttp3.internal.tls.CertificateChainCleaner;
import ry.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CertificatePinner {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f44965c = new Companion(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CertificatePinner f44966d = new CertificatePinner(m.f1(new Builder().f44969a), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f44967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CertificateChainCleaner f44968b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f44969a = new ArrayList();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Pin {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Pin);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner) {
        this.f44967a = set;
        this.f44968b = certificateChainCleaner;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return kotlin.jvm.internal.m.a(certificatePinner.f44967a, this.f44967a) && kotlin.jvm.internal.m.a(certificatePinner.f44968b, this.f44968b);
    }

    public final int hashCode() {
        int iHashCode = (this.f44967a.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.f44968b;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }
}
