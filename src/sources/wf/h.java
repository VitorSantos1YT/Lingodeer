package wf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum h implements lf.l {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);

    private final int minVersion;

    h(int i11) {
        this.minVersion = i11;
    }

    @Override // lf.l
    public final int a() {
        return this.minVersion;
    }

    @Override // lf.l
    public final String b() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }
}
