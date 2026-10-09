package au;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3004c;

    public /* synthetic */ h(long j11, String str, int i11) {
        this.f3002a = i11;
        this.f3003b = j11;
        this.f3004c = str;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        switch (this.f3002a) {
            case 0:
                long j11 = this.f3003b;
                String str = this.f3004c;
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ja.c cVarB1 = _connection.B1("UPDATE bookmark SET is_fav = 0, folder_id = NULL, time = ? WHERE folder_id = ?");
                try {
                    cVarB1.g(1, j11);
                    cVarB1.b0(2, str);
                    cVarB1.r1();
                } finally {
                    cVarB1.close();
                }
                break;
            default:
                long j12 = this.f3003b;
                String str2 = this.f3004c;
                ja.a _connection2 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection2, "_connection");
                ja.c cVarB2 = _connection2.B1("UPDATE bookmark_folder SET is_deleted = 1, time = ? WHERE id = ?");
                try {
                    cVarB2.g(1, j12);
                    cVarB2.b0(2, str2);
                    cVarB2.r1();
                } finally {
                    cVarB2.close();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
