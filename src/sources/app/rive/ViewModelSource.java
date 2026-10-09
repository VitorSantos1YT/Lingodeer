package app.rive;

import kotlin.jvm.internal.m;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface ViewModelSource {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DefaultForArtboard implements ViewModelSource {
        private final Artboard artboard;

        private /* synthetic */ DefaultForArtboard(Artboard artboard) {
            this.artboard = artboard;
        }

        /* JADX INFO: renamed from: blankInstance-impl, reason: not valid java name */
        public static ViewModelInstanceSource m69blankInstanceimpl(Artboard artboard) {
            return m70boximpl(artboard).blankInstance();
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ DefaultForArtboard m70boximpl(Artboard artboard) {
            return new DefaultForArtboard(artboard);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static Artboard m71constructorimpl(Artboard artboard) {
            m.f(artboard, "artboard");
            return artboard;
        }

        /* JADX INFO: renamed from: defaultInstance-impl, reason: not valid java name */
        public static ViewModelInstanceSource m72defaultInstanceimpl(Artboard artboard) {
            return m70boximpl(artboard).defaultInstance();
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m73equalsimpl(Artboard artboard, Object obj) {
            return (obj instanceof DefaultForArtboard) && m.a(artboard, ((DefaultForArtboard) obj).m78unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m74equalsimpl0(Artboard artboard, Artboard artboard2) {
            return m.a(artboard, artboard2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m75hashCodeimpl(Artboard artboard) {
            return artboard.hashCode();
        }

        /* JADX INFO: renamed from: namedInstance-impl, reason: not valid java name */
        public static ViewModelInstanceSource m76namedInstanceimpl(Artboard artboard, String instanceName) {
            m.f(instanceName, "instanceName");
            return m70boximpl(artboard).namedInstance(instanceName);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m77toStringimpl(Artboard artboard) {
            return "DefaultForArtboard(artboard=" + artboard + ')';
        }

        @Override // app.rive.ViewModelSource
        public ViewModelInstanceSource blankInstance() {
            return DefaultImpls.blankInstance(this);
        }

        @Override // app.rive.ViewModelSource
        public ViewModelInstanceSource defaultInstance() {
            return DefaultImpls.defaultInstance(this);
        }

        public boolean equals(Object obj) {
            return m73equalsimpl(this.artboard, obj);
        }

        public final Artboard getArtboard() {
            return this.artboard;
        }

        public int hashCode() {
            return m75hashCodeimpl(this.artboard);
        }

        @Override // app.rive.ViewModelSource
        public ViewModelInstanceSource namedInstance(String str) {
            return DefaultImpls.namedInstance(this, str);
        }

        public String toString() {
            return m77toStringimpl(this.artboard);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Artboard m78unboximpl() {
            return this.artboard;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DefaultImpls {
        public static ViewModelInstanceSource blankInstance(ViewModelSource viewModelSource) {
            return ViewModelInstanceSource.Blank.m55boximpl(ViewModelInstanceSource.Blank.m56constructorimpl(viewModelSource));
        }

        public static ViewModelInstanceSource defaultInstance(ViewModelSource viewModelSource) {
            return ViewModelInstanceSource.Default.m62boximpl(ViewModelInstanceSource.Default.m63constructorimpl(viewModelSource));
        }

        public static ViewModelInstanceSource namedInstance(ViewModelSource viewModelSource, String instanceName) {
            m.f(instanceName, "instanceName");
            return new ViewModelInstanceSource.Named(viewModelSource, instanceName);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Named implements ViewModelSource {
        private final String viewModelName;

        private /* synthetic */ Named(String str) {
            this.viewModelName = str;
        }

        /* JADX INFO: renamed from: blankInstance-impl, reason: not valid java name */
        public static ViewModelInstanceSource m79blankInstanceimpl(String str) {
            return m80boximpl(str).blankInstance();
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Named m80boximpl(String str) {
            return new Named(str);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static String m81constructorimpl(String viewModelName) {
            m.f(viewModelName, "viewModelName");
            return viewModelName;
        }

        /* JADX INFO: renamed from: defaultInstance-impl, reason: not valid java name */
        public static ViewModelInstanceSource m82defaultInstanceimpl(String str) {
            return m80boximpl(str).defaultInstance();
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m83equalsimpl(String str, Object obj) {
            return (obj instanceof Named) && m.a(str, ((Named) obj).m88unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m84equalsimpl0(String str, String str2) {
            return m.a(str, str2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m85hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: namedInstance-impl, reason: not valid java name */
        public static ViewModelInstanceSource m86namedInstanceimpl(String str, String instanceName) {
            m.f(instanceName, "instanceName");
            return m80boximpl(str).namedInstance(instanceName);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m87toStringimpl(String str) {
            return p.q("Named(viewModelName=", str, ')');
        }

        @Override // app.rive.ViewModelSource
        public ViewModelInstanceSource blankInstance() {
            return DefaultImpls.blankInstance(this);
        }

        @Override // app.rive.ViewModelSource
        public ViewModelInstanceSource defaultInstance() {
            return DefaultImpls.defaultInstance(this);
        }

        public boolean equals(Object obj) {
            return m83equalsimpl(this.viewModelName, obj);
        }

        public final String getViewModelName() {
            return this.viewModelName;
        }

        public int hashCode() {
            return m85hashCodeimpl(this.viewModelName);
        }

        @Override // app.rive.ViewModelSource
        public ViewModelInstanceSource namedInstance(String str) {
            return DefaultImpls.namedInstance(this, str);
        }

        public String toString() {
            return m87toStringimpl(this.viewModelName);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m88unboximpl() {
            return this.viewModelName;
        }
    }

    ViewModelInstanceSource blankInstance();

    ViewModelInstanceSource defaultInstance();

    ViewModelInstanceSource namedInstance(String str);
}
