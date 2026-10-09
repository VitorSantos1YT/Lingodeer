package au;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2978d;

    public /* synthetic */ e(int i11, String str, String str2, long j11) {
        this.f2975a = i11;
        this.f2976b = str;
        this.f2977c = j11;
        this.f2978d = str2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        switch (this.f2975a) {
            case 0:
                String str = this.f2976b;
                long j11 = this.f2977c;
                String str2 = this.f2978d;
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ja.c cVarB1 = _connection.B1("UPDATE bookmark SET folder_id = ?, time = ? WHERE folder_id = ?");
                try {
                    cVarB1.b0(1, str);
                    cVarB1.g(2, j11);
                    cVarB1.b0(3, str2);
                    cVarB1.r1();
                } finally {
                    cVarB1.close();
                }
                break;
            case 1:
                long j12 = this.f2977c;
                String str3 = this.f2978d;
                ja.a _connection2 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection2, "_connection");
                ja.c cVarB2 = _connection2.B1("UPDATE bookmark SET folder_id = ?, time = ? WHERE id = ?");
                String str4 = this.f2976b;
                try {
                    if (str4 == null) {
                        cVarB2.s(1);
                    } else {
                        cVarB2.b0(1, str4);
                    }
                    cVarB2.g(2, j12);
                    cVarB2.b0(3, str3);
                    cVarB2.r1();
                    cVarB2.close();
                } catch (Throwable th2) {
                    cVarB2.close();
                    throw th2;
                }
                break;
            default:
                String str5 = this.f2976b;
                long j13 = this.f2977c;
                String str6 = this.f2978d;
                ja.a _connection3 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection3, "_connection");
                ja.c cVarB3 = _connection3.B1("UPDATE bookmark_folder SET name = ?, time = ? WHERE id = ?");
                try {
                    cVarB3.b0(1, str5);
                    cVarB3.g(2, j13);
                    cVarB3.b0(3, str6);
                    cVarB3.r1();
                } finally {
                    cVarB3.close();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
