package com.google.accompanist.permissions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface PermissionStatus {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Denied implements PermissionStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7790a;

        public Denied(boolean z11) {
            this.f7790a = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Denied) && this.f7790a == ((Denied) obj).f7790a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f7790a);
        }

        public final String toString() {
            return ep.a.l(new StringBuilder("Denied(shouldShowRationale="), this.f7790a, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Granted implements PermissionStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Granted f7791a = new Granted();

        private Granted() {
        }
    }
}
