package wa;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f54891e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, String str2, int i11) {
        super(str, str2, 2);
        this.f54891e = i11;
    }

    @Override // wa.c
    public final boolean b() {
        switch (this.f54891e) {
            case 0:
                if (!super.b() || !se.k.s("MULTI_PROCESS")) {
                    return false;
                }
                int i11 = va.b.f53806a;
                if (j.f54893b.b()) {
                    return l.f54896a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (se.k.s("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
