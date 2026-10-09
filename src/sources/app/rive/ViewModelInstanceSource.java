package app.rive;

import hh.p0;
import ko.Zea.ealNNtLp;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface ViewModelInstanceSource {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Blank implements ViewModelInstanceSource {
        private final ViewModelSource vmSource;

        private /* synthetic */ Blank(ViewModelSource viewModelSource) {
            this.vmSource = viewModelSource;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Blank m55boximpl(ViewModelSource viewModelSource) {
            return new Blank(viewModelSource);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static ViewModelSource m56constructorimpl(ViewModelSource vmSource) {
            m.f(vmSource, "vmSource");
            return vmSource;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m57equalsimpl(ViewModelSource viewModelSource, Object obj) {
            return (obj instanceof Blank) && m.a(viewModelSource, ((Blank) obj).m61unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m58equalsimpl0(ViewModelSource viewModelSource, ViewModelSource viewModelSource2) {
            return m.a(viewModelSource, viewModelSource2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m59hashCodeimpl(ViewModelSource viewModelSource) {
            return viewModelSource.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m60toStringimpl(ViewModelSource viewModelSource) {
            return "Blank(vmSource=" + viewModelSource + ')';
        }

        public boolean equals(Object obj) {
            return m57equalsimpl(this.vmSource, obj);
        }

        public final ViewModelSource getVmSource() {
            return this.vmSource;
        }

        public int hashCode() {
            return m59hashCodeimpl(this.vmSource);
        }

        public String toString() {
            return m60toStringimpl(this.vmSource);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ViewModelSource m61unboximpl() {
            return this.vmSource;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Default implements ViewModelInstanceSource {
        private final ViewModelSource vmSource;

        private /* synthetic */ Default(ViewModelSource viewModelSource) {
            this.vmSource = viewModelSource;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Default m62boximpl(ViewModelSource viewModelSource) {
            return new Default(viewModelSource);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static ViewModelSource m63constructorimpl(ViewModelSource vmSource) {
            m.f(vmSource, "vmSource");
            return vmSource;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m64equalsimpl(ViewModelSource viewModelSource, Object obj) {
            return (obj instanceof Default) && m.a(viewModelSource, ((Default) obj).m68unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m65equalsimpl0(ViewModelSource viewModelSource, ViewModelSource viewModelSource2) {
            return m.a(viewModelSource, viewModelSource2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m66hashCodeimpl(ViewModelSource viewModelSource) {
            return viewModelSource.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m67toStringimpl(ViewModelSource viewModelSource) {
            return "Default(vmSource=" + viewModelSource + ')';
        }

        public boolean equals(Object obj) {
            return m64equalsimpl(this.vmSource, obj);
        }

        public final ViewModelSource getVmSource() {
            return this.vmSource;
        }

        public int hashCode() {
            return m66hashCodeimpl(this.vmSource);
        }

        public String toString() {
            return m67toStringimpl(this.vmSource);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ViewModelSource m68unboximpl() {
            return this.vmSource;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Named implements ViewModelInstanceSource {
        public static final int $stable = 8;
        private final String instanceName;
        private final ViewModelSource vmSource;

        public Named(ViewModelSource vmSource, String instanceName) {
            m.f(vmSource, "vmSource");
            m.f(instanceName, "instanceName");
            this.vmSource = vmSource;
            this.instanceName = instanceName;
        }

        public static /* synthetic */ Named copy$default(Named named, ViewModelSource viewModelSource, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                viewModelSource = named.vmSource;
            }
            if ((i11 & 2) != 0) {
                str = named.instanceName;
            }
            return named.copy(viewModelSource, str);
        }

        public final ViewModelSource component1() {
            return this.vmSource;
        }

        public final String component2() {
            return this.instanceName;
        }

        public final Named copy(ViewModelSource vmSource, String instanceName) {
            m.f(vmSource, "vmSource");
            m.f(instanceName, "instanceName");
            return new Named(vmSource, instanceName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Named)) {
                return false;
            }
            Named named = (Named) obj;
            return m.a(this.vmSource, named.vmSource) && m.a(this.instanceName, named.instanceName);
        }

        public final String getInstanceName() {
            return this.instanceName;
        }

        public final ViewModelSource getVmSource() {
            return this.vmSource;
        }

        public int hashCode() {
            return this.instanceName.hashCode() + (this.vmSource.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Named(vmSource=");
            sb2.append(this.vmSource);
            sb2.append(", instanceName=");
            return p0.o(sb2, this.instanceName, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Reference implements ViewModelInstanceSource {
        public static final int $stable = 8;
        private final ViewModelInstance instance;
        private final String path;

        public Reference(ViewModelInstance instance, String path) {
            m.f(instance, "instance");
            m.f(path, "path");
            this.instance = instance;
            this.path = path;
        }

        public static /* synthetic */ Reference copy$default(Reference reference, ViewModelInstance viewModelInstance, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                viewModelInstance = reference.instance;
            }
            if ((i11 & 2) != 0) {
                str = reference.path;
            }
            return reference.copy(viewModelInstance, str);
        }

        public final ViewModelInstance component1() {
            return this.instance;
        }

        public final String component2() {
            return this.path;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reference)) {
                return false;
            }
            Reference reference = (Reference) obj;
            return m.a(this.instance, reference.instance) && m.a(this.path, reference.path);
        }

        public final ViewModelInstance getInstance() {
            return this.instance;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode() + (this.instance.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Reference(instance=");
            sb2.append(this.instance);
            sb2.append(", path=");
            return p0.o(sb2, this.path, ')');
        }

        public final Reference copy(ViewModelInstance viewModelInstance, String path) {
            m.f(viewModelInstance, ealNNtLp.gWNPnfLgsX);
            m.f(path, "path");
            return new Reference(viewModelInstance, path);
        }
    }
}
