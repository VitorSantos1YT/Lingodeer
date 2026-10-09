package wf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum d implements lf.l {
    MESSAGE_DIALOG(20140204),
    PHOTOS(20140324),
    VIDEO(20141218),
    MESSENGER_GENERIC_TEMPLATE(20171115),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(20171115),
    MESSENGER_MEDIA_TEMPLATE(20171115);

    private int minVersion;

    d(int i11) {
        this.minVersion = i11;
    }

    @Override // lf.l
    public final int a() {
        return this.minVersion;
    }

    @Override // lf.l
    public final String b() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }
}
